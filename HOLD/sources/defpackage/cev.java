package defpackage;

import android.os.Handler;
import android.os.Looper;

/* renamed from: cev  reason: default package */
/* compiled from: PG */
public final class cev {
    private static Thread a;
    private static volatile Handler b;

    public cev() {
        cdj cdj = cdj.b;
    }

    public static void a(dhb dhb) {
        cbl cbl = cbl.a;
        dgq dgq = dgq.INSTANCE;
        dgx.a(cbl);
        dhb.a(new dgv(dhb, cbl), dgq);
    }

    public static void a(boolean z) {
        if (!z) {
            throw new IllegalArgumentException();
        }
    }

    public static void a(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException((String) obj);
        }
    }

    public static Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw null;
    }

    public static void b() {
        if (a()) {
            throw new RuntimeException("Must be called on a background thread");
        }
    }

    public static boolean a() {
        if (a == null) {
            a = Looper.getMainLooper().getThread();
        }
        return Thread.currentThread() == a;
    }

    public static void a(Runnable runnable) {
        if (b == null) {
            b = new Handler(Looper.getMainLooper());
        }
        b.post(runnable);
    }
}
