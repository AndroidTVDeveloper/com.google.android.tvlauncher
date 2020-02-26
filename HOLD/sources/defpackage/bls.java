package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.os.Handler;
import android.view.Surface;

/* renamed from: bls  reason: default package */
/* compiled from: PG */
public final class bls extends Surface {
    private static int a;
    private static boolean b;
    private final blr c;
    private boolean d;

    public /* synthetic */ bls(blr blr, SurfaceTexture surfaceTexture) {
        super(surfaceTexture);
        this.c = blr;
    }

    public static synchronized boolean a(Context context) {
        int i;
        int i2;
        String eglQueryString;
        synchronized (bls.class) {
            if (!b) {
                if (blm.a < 24 || ((blm.a < 26 && ("samsung".equals(blm.c) || "XT1650".equals(blm.d))) || ((blm.a < 26 && !context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) || (eglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373)) == null || !eglQueryString.contains("EGL_EXT_protected_content")))) {
                    i2 = 0;
                } else {
                    i2 = eglQueryString.contains("EGL_KHR_surfaceless_context") ? 1 : 2;
                }
                a = i2;
                b = true;
            }
            i = a;
        }
        return i != 0;
    }

    public static bls a(Context context, boolean z) {
        if (blm.a >= 17) {
            boolean z2 = false;
            bks.b(!z || a(context));
            blr blr = new blr();
            int i = z ? a : 0;
            blr.start();
            blr.b = new Handler(blr.getLooper(), blr);
            blr.a = new bkk(blr.b);
            synchronized (blr) {
                blr.b.obtainMessage(1, i, 0).sendToTarget();
                while (blr.e == null && blr.d == null && blr.c == null) {
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
            RuntimeException runtimeException = blr.d;
            if (runtimeException == null) {
                Error error = blr.c;
                if (error == null) {
                    return (bls) bks.a(blr.e);
                }
                throw error;
            }
            throw runtimeException;
        }
        throw new UnsupportedOperationException("Unsupported prior to API level 17");
    }

    public final void release() {
        super.release();
        synchronized (this.c) {
            if (!this.d) {
                blr blr = this.c;
                bks.a(blr.b);
                blr.b.sendEmptyMessage(2);
                this.d = true;
            }
        }
    }
}
