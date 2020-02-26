package p000;

import java.util.Queue;

/* renamed from: aag */
/* compiled from: PG */
public final class aag {

    /* renamed from: a */
    private static final Queue f9a = aie.m558a(0);

    /* renamed from: b */
    private Object f10b;

    private aag() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aag) || !this.f10b.equals(((aag) obj).f10b)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static aag m11a(Object obj) {
        aag aag;
        synchronized (f9a) {
            aag = (aag) f9a.poll();
        }
        if (aag == null) {
            aag = new aag();
        }
        aag.f10b = obj;
        return aag;
    }

    public final int hashCode() {
        return this.f10b.hashCode();
    }

    /* renamed from: a */
    public final void mo15a() {
        synchronized (f9a) {
            f9a.offer(this);
        }
    }
}
