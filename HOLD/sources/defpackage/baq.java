package defpackage;

/* renamed from: baq  reason: default package */
/* compiled from: PG */
public final class baq {
    public final long a;
    public final long b;

    public baq(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final int hashCode() {
        return (((int) this.a) * 31) + ((int) this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            baq baq = (baq) obj;
            return this.a == baq.a && this.b == baq.b;
        }
    }
}
