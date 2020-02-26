package defpackage;

/* renamed from: alb  reason: default package */
/* compiled from: PG */
public final class alb {
    public static final alb a = new alb(0, 0);
    public static final alb b = a;
    public final long c;
    public final long d;

    static {
        new alb(Long.MAX_VALUE, Long.MAX_VALUE);
        new alb(Long.MAX_VALUE, 0);
        new alb(0, Long.MAX_VALUE);
    }

    public final int hashCode() {
        return (((int) this.c) * 31) + ((int) this.d);
    }

    public alb(long j, long j2) {
        boolean z = true;
        bks.a(j >= 0);
        bks.a(j2 < 0 ? false : z);
        this.c = j;
        this.d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            alb alb = (alb) obj;
            return this.c == alb.c && this.d == alb.d;
        }
    }
}
