package defpackage;

import java.util.Queue;

/* renamed from: aag  reason: default package */
/* compiled from: PG */
public final class aag {
    private static final Queue a = aie.a(0);
    private Object b;

    private aag() {
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof aag) || !this.b.equals(((aag) obj).b)) {
            return false;
        }
        return true;
    }

    public static aag a(Object obj) {
        aag aag;
        synchronized (a) {
            aag = (aag) a.poll();
        }
        if (aag == null) {
            aag = new aag();
        }
        aag.b = obj;
        return aag;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final void a() {
        synchronized (a) {
            a.offer(this);
        }
    }
}
