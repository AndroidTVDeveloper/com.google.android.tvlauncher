package p000;

/* renamed from: baq */
/* compiled from: PG */
public final class baq {

    /* renamed from: a */
    public final long f3025a;

    /* renamed from: b */
    public final long f3026b;

    public baq(long j, long j2) {
        this.f3025a = j;
        this.f3026b = j2;
    }

    public final int hashCode() {
        return (((int) this.f3025a) * 31) + ((int) this.f3026b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            baq baq = (baq) obj;
            return this.f3025a == baq.f3025a && this.f3026b == baq.f3026b;
        }
    }
}
