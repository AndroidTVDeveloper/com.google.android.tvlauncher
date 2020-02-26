package p000;

import java.security.AccessController;
import java.security.PrivilegedActionException;
import sun.misc.Unsafe;

/* renamed from: dgl */
/* compiled from: PG */
final class dgl extends dga {

    /* renamed from: a */
    public static final Unsafe f8500a;

    /* renamed from: b */
    public static final long f8501b;

    /* renamed from: c */
    public static final long f8502c;

    /* renamed from: d */
    public static final long f8503d;

    /* renamed from: e */
    public static final long f8504e;

    /* renamed from: f */
    public static final long f8505f;

    static {
        Unsafe unsafe;
        try {
            unsafe = Unsafe.getUnsafe();
        } catch (SecurityException e) {
            try {
                unsafe = (Unsafe) AccessController.doPrivileged(new dgk());
            } catch (PrivilegedActionException e2) {
                throw new RuntimeException("Could not initialize intrinsics", e2.getCause());
            }
        }
        Class<dgn> cls = dgn.class;
        try {
            f8502c = unsafe.objectFieldOffset(cls.getDeclaredField("waiters"));
            f8501b = unsafe.objectFieldOffset(cls.getDeclaredField("listeners"));
            f8503d = unsafe.objectFieldOffset(cls.getDeclaredField("value"));
            f8504e = unsafe.objectFieldOffset(dgm.class.getDeclaredField("thread"));
            f8505f = unsafe.objectFieldOffset(dgm.class.getDeclaredField("next"));
            f8500a = unsafe;
        } catch (Exception e3) {
            dfj.m6304a(e3);
            throw new RuntimeException(e3);
        }
    }

    private dgl() {
    }

    public /* synthetic */ dgl(byte b) {
    }

    /* renamed from: a */
    public final boolean mo4295a(dgn dgn, dge dge, dge dge2) {
        return f8500a.compareAndSwapObject(dgn, f8501b, dge, dge2);
    }

    /* renamed from: a */
    public final boolean mo4297a(dgn dgn, Object obj, Object obj2) {
        return f8500a.compareAndSwapObject(dgn, f8503d, obj, obj2);
    }

    /* renamed from: a */
    public final boolean mo4296a(dgn dgn, dgm dgm, dgm dgm2) {
        return f8500a.compareAndSwapObject(dgn, f8502c, dgm, dgm2);
    }

    /* renamed from: a */
    public final void mo4293a(dgm dgm, dgm dgm2) {
        f8500a.putObject(dgm, f8505f, dgm2);
    }

    /* renamed from: a */
    public final void mo4294a(dgm dgm, Thread thread) {
        f8500a.putObject(dgm, f8504e, thread);
    }
}
