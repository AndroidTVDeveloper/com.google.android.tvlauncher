package p000;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import android.util.Log;

/* renamed from: blr */
/* compiled from: PG */
final class blr extends HandlerThread implements Handler.Callback {

    /* renamed from: a */
    public bkk f4316a;

    /* renamed from: b */
    public Handler f4317b;

    /* renamed from: c */
    public Error f4318c;

    /* renamed from: d */
    public RuntimeException f4319d;

    /* renamed from: e */
    public bls f4320e;

    public blr() {
        super("dummySurface");
    }

    public final boolean handleMessage(Message message) {
        EGLConfig eGLConfig;
        EGLSurface eGLSurface;
        bkk bkk;
        int i = message.what;
        if (i == 1) {
            try {
                int i2 = message.arg1;
                bks.m3507a(this.f4316a);
                bkk bkk2 = this.f4316a;
                EGLDisplay eglGetDisplay = EGL14.eglGetDisplay(0);
                if (eglGetDisplay != null) {
                    int[] iArr = new int[2];
                    if (EGL14.eglInitialize(eglGetDisplay, iArr, 0, iArr, 1)) {
                        bkk2.f4218d = eglGetDisplay;
                        EGLConfig[] eGLConfigArr = new EGLConfig[1];
                        int[] iArr2 = new int[1];
                        boolean eglChooseConfig = EGL14.eglChooseConfig(bkk2.f4218d, bkk.f4215a, 0, eGLConfigArr, 0, 1, iArr2, 0);
                        if (!eglChooseConfig || iArr2[0] <= 0 || (eGLConfig = eGLConfigArr[0]) == null) {
                            throw new bkj(blm.m3638a("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(eglChooseConfig), Integer.valueOf(iArr2[0]), eGLConfigArr[0]));
                        }
                        EGLContext eglCreateContext = EGL14.eglCreateContext(bkk2.f4218d, eGLConfig, EGL14.EGL_NO_CONTEXT, i2 != 0 ? new int[]{12440, 2, 12992, 1, 12344} : new int[]{12440, 2, 12344}, 0);
                        if (eglCreateContext != null) {
                            bkk2.f4219e = eglCreateContext;
                            EGLDisplay eGLDisplay = bkk2.f4218d;
                            EGLContext eGLContext = bkk2.f4219e;
                            if (i2 != 1) {
                                eGLSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i2 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
                                if (eGLSurface == null) {
                                    throw new bkj("eglCreatePbufferSurface failed");
                                }
                            } else {
                                eGLSurface = EGL14.EGL_NO_SURFACE;
                            }
                            if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext)) {
                                bkk2.f4220f = eGLSurface;
                                GLES20.glGenTextures(1, bkk2.f4217c, 0);
                                while (true) {
                                    int glGetError = GLES20.glGetError();
                                    if (glGetError == 0) {
                                        break;
                                    }
                                    String valueOf = String.valueOf(GLU.gluErrorString(glGetError));
                                    Log.e("GlUtil", valueOf.length() == 0 ? new String("glError ") : "glError ".concat(valueOf));
                                }
                                bkk2.f4221g = new SurfaceTexture(bkk2.f4217c[0]);
                                bkk2.f4221g.setOnFrameAvailableListener(bkk2);
                                this.f4320e = new bls(this, (SurfaceTexture) bks.m3507a(this.f4316a.f4221g));
                                synchronized (this) {
                                    notify();
                                }
                                return true;
                            }
                            throw new bkj("eglMakeCurrent failed");
                        }
                        throw new bkj("eglCreateContext failed");
                    }
                    throw new bkj("eglInitialize failed");
                }
                throw new bkj("eglGetDisplay failed");
            } catch (RuntimeException e) {
                Log.e("DummySurface", "Failed to initialize dummy surface", e);
                this.f4319d = e;
                synchronized (this) {
                    notify();
                }
            } catch (Error e2) {
                try {
                    Log.e("DummySurface", "Failed to initialize dummy surface", e2);
                    this.f4318c = e2;
                    synchronized (this) {
                        notify();
                    }
                } catch (Throwable th) {
                    synchronized (this) {
                        notify();
                        throw th;
                    }
                }
            }
        } else if (i != 2) {
            return true;
        } else {
            try {
                bks.m3507a(this.f4316a);
                bkk = this.f4316a;
                bkk.f4216b.removeCallbacks(bkk);
                SurfaceTexture surfaceTexture = bkk.f4221g;
                if (surfaceTexture != null) {
                    surfaceTexture.release();
                    GLES20.glDeleteTextures(1, bkk.f4217c, 0);
                }
                EGLDisplay eGLDisplay2 = bkk.f4218d;
                if (eGLDisplay2 != null && !eGLDisplay2.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglMakeCurrent(bkk.f4218d, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_SURFACE, EGL14.EGL_NO_CONTEXT);
                }
                EGLSurface eGLSurface2 = bkk.f4220f;
                if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface(bkk.f4218d, bkk.f4220f);
                }
                EGLContext eGLContext2 = bkk.f4219e;
                if (eGLContext2 != null) {
                    EGL14.eglDestroyContext(bkk.f4218d, eGLContext2);
                }
                if (blm.f4293a >= 19) {
                    EGL14.eglReleaseThread();
                }
                EGLDisplay eGLDisplay3 = bkk.f4218d;
                if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                    EGL14.eglTerminate(bkk.f4218d);
                }
                bkk.f4218d = null;
                bkk.f4219e = null;
                bkk.f4220f = null;
                bkk.f4221g = null;
            } catch (Throwable th2) {
                try {
                    Log.e("DummySurface", "Failed to release dummy surface", th2);
                } catch (Throwable th3) {
                    quit();
                    throw th3;
                }
            }
            quit();
            return true;
        }
    }
}
