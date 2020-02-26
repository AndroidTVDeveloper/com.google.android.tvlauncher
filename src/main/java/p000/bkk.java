package p000;

import android.graphics.SurfaceTexture;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Handler;

/* renamed from: bkk */
/* compiled from: PG */
public final class bkk implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: a */
    public static final int[] f4215a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: b */
    public final Handler f4216b;

    /* renamed from: c */
    public final int[] f4217c = new int[1];

    /* renamed from: d */
    public EGLDisplay f4218d;

    /* renamed from: e */
    public EGLContext f4219e;

    /* renamed from: f */
    public EGLSurface f4220f;

    /* renamed from: g */
    public SurfaceTexture f4221g;

    public bkk(Handler handler) {
        this.f4216b = handler;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f4216b.post(this);
    }

    public final void run() {
        SurfaceTexture surfaceTexture = this.f4221g;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException e) {
            }
        }
    }
}
