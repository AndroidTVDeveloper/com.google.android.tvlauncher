package defpackage;

/* renamed from: aot  reason: default package */
/* compiled from: PG */
public final class aot {
    public static final aot a = new aot(0, 0);
    public final long b;
    public final long c;

    public final int hashCode() {
        return (((int) this.b) * 31) + ((int) this.c);
    }

    public aot(long j, long j2) {
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            aot aot = (aot) obj;
            return this.b == aot.b && this.c == aot.c;
        }
    }

    public final String toString() {
        long j = this.b;
        long j2 = this.c;
        StringBuilder sb = new StringBuilder(60);
        sb.append("[timeUs=");
        sb.append(j);
        sb.append(", position=");
        sb.append(j2);
        sb.append("]");
        return sb.toString();
    }
}
