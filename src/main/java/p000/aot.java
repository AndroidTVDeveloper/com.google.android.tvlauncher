package p000;

/* renamed from: aot */
/* compiled from: PG */
public final class aot {

    /* renamed from: a */
    public static final aot f1519a = new aot(0, 0);

    /* renamed from: b */
    public final long f1520b;

    /* renamed from: c */
    public final long f1521c;

    public final int hashCode() {
        return (((int) this.f1520b) * 31) + ((int) this.f1521c);
    }

    public aot(long j, long j2) {
        this.f1520b = j;
        this.f1521c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aot aot = (aot) obj;
            return this.f1520b == aot.f1520b && this.f1521c == aot.f1521c;
        }
    }

    public final String toString() {
        long j = this.f1520b;
        long j2 = this.f1521c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
