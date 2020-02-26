package p000;

import android.os.Handler;
import android.os.Looper;

/* renamed from: cev */
/* compiled from: PG */
public final class cev {

    /* renamed from: a */
    private static Thread f5388a;

    /* renamed from: b */
    private static volatile Handler f5389b;

    public cev() {
        cdj cdj = cdj.f5320b;
    }

    /* renamed from: a */
    public static void m4630a(dhb dhb) {
        cbl cbl = cbl.f5217a;
        dgq dgq = dgq.INSTANCE;
        dgx.m6401a(cbl);
        dhb.mo4303a(new dgv(dhb, cbl), dgq);
    }

    /* renamed from: a */
    public static void m4632a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: a */
    public static void m4633a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    /* renamed from: a */
    public static Object m4629a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    /* renamed from: b */
    public static void m4635b() {
        if (m4634a()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    /* renamed from: a */
    public static boolean m4634a() {
        if (f5388a == null) {
            f5388a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == f5388a;
    }

    /* renamed from: a */
    public static void m4631a(Runnable runnable) {
        if (f5389b == null) {
            f5389b = new Handler(Looper.getMainLooper());
        }
        f5389b.post(runnable);
    }
}
