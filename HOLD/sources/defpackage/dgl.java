package defpackage;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: dgl  reason: default package */
/* compiled from: PG */
final class dgl extends dga {
    public static final Unsafe a;
    public static final long b;
    public static final long c;
    public static final long d;
    public static final long e;
    public static final long f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e2) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new dgk());
            } catch (PrivilegedActionException e3) {
                throw new RuntimeException("Could not initialize intrinsics", e3.getCause());
            }
        }
        Class<dgn> cls = dgn.class;
        try {
            c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            e = unsafe.objectFieldOffset(dgm.class.getDeclaredField("thread"));
            f = unsafe.objectFieldOffset(dgm.class.getDeclaredField("next"));
            a = unsafe;
        } catch (Exception e4) {
            dfj.a(e4);
            throw new RuntimeException(e4);
        }
    }

    private dgl() {
    }

    public /* synthetic */ dgl(byte b2) {
    }

    public final boolean a(dgn dgn, dge dge, dge dge2) {
        return a.compareAndSwapObject(dgn, b, dge, dge2);
    }

    public final boolean a(dgn dgn, Object obj, Object obj2) {
        return a.compareAndSwapObject(dgn, d, obj, obj2);
    }

    public final boolean a(dgn dgn, dgm dgm, dgm dgm2) {
        return a.compareAndSwapObject(dgn, c, dgm, dgm2);
    }

    public final void a(dgm dgm, dgm dgm2) {
        a.putObject(dgm, f, dgm2);
    }

    public final void a(dgm dgm, Thread thread) {
        a.putObject(dgm, e, thread);
    }
}
