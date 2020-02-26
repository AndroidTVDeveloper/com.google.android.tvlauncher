package p000;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* renamed from: bls */
/* compiled from: PG */
public final class bls extends Surface {

    /* renamed from: a */
    private static int f4321a;

    /* renamed from: b */
    private static boolean f4322b;

    /* renamed from: c */
    private final blr f4323c;

    /* renamed from: d */
    private boolean f4324d;

    public /* synthetic */ bls(blr blr, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.f4323c = blr;
    }

    /* renamed from: a */
    public static synchronized boolean m3686a(Context context) {
        int i;
        int i2;
        String eglQueryString;
        synchronized (bls.class) {
            if (!f4322b) {
                if (blm.f4293a < 24 || ((blm.f4293a < 26 && ("samsung".equals(blm.f4295c) || "XT1650".equals(blm.f4296d))) || ((blm.f4293a < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
                    i2 = 0;
                } else {
                    i2 = eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                }
                f4321a = i2;
                f4322b = true;
            }
            i = f4321a;
        }
        return i != 0;
    }

    /* renamed from: a */
    public static bls m3685a(Context context, boolean z) {
        if (blm.f4293a >= 17) {
            boolean z2 = false;
            bks.m3512b(!z || m3686a(context));
            blr blr = new blr();
            int i = z ? f4321a : 0;
            blr.start();
            blr.f4317b = new Handler(blr.getLooper(), blr);
            blr.f4316a = new bkk(blr.f4317b);
            synchronized (blr) {
                blr.f4317b.obtainMessage(1, i, 0).sendToTarget();
                while (blr.f4320e == null && blr.f4319d == null && blr.f4318c == null) {
                    try {
                        blr.wait();
                    } catch (InterruptedException e) {
                        z2 = true;
                    }
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
            RuntimeException runtimeException = blr.f4319d;
            if (runtimeException == null) {
                Error error = blr.f4318c;
                if (error == null) {
                    return (bls) bks.m3507a(blr.f4320e);
                }
                throw error;
            }
            throw runtimeException;
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public final void release() {
        super.release();
        synchronized (this.f4323c) {
            if (!this.f4324d) {
                blr blr = this.f4323c;
                bks.m3507a(blr.f4317b);
                blr.f4317b.sendEmptyMessage(2);
                this.f4324d = true;
            }
        }
    }
}
