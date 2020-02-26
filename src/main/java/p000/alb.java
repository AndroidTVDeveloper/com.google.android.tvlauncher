package p000;

/* renamed from: alb */
/* compiled from: PG */
public final class alb {

    /* renamed from: a */
    public static final alb f639a = new alb(0, 0);

    /* renamed from: b */
    public static final alb f640b = f639a;

    /* renamed from: c */
    public final long f641c;

    /* renamed from: d */
    public final long f642d;

    static {
        new alb(Long.MAX_VALUE, Long.MAX_VALUE);
        new alb(Long.MAX_VALUE, 0);
        new alb(0, Long.MAX_VALUE);
    }

    public final int hashCode() {
        return (((int) this.f641c) * 31) + ((int) this.f642d);
    }

    public alb(long j, long j2) {
        boolean z = true;
        bks.m3510a(j >= 0);
        bks.m3510a(j2 < 0 ? false : z);
        this.f641c = j;
        this.f642d = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            alb alb = (alb) obj;
            return this.f641c == alb.f641c && this.f642d == alb.f642d;
        }
    }
}
