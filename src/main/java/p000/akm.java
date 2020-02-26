package p000;

/* renamed from: akm */
/* compiled from: PG */
final class akm {

    /* renamed from: a */
    public final awt f591a;

    /* renamed from: b */
    public final long f592b;

    /* renamed from: c */
    public final long f593c = -9223372036854775807L;

    /* renamed from: d */
    public final long f594d;

    /* renamed from: e */
    public final long f595e;

    /* renamed from: f */
    public final boolean f596f;

    /* renamed from: g */
    public final boolean f597g;

    public akm(awt awt, long j, long j2, long j3, boolean z, boolean z2) {
        this.f591a = awt;
        this.f592b = j;
        this.f594d = j2;
        this.f595e = j3;
        this.f596f = z;
        this.f597g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        akm akm = (akm) obj;
        return this.f592b == akm.f592b && this.f594d == akm.f594d && this.f595e == akm.f595e && this.f596f == akm.f596f && this.f597g == akm.f597g && blm.m3652a(this.f591a, akm.f591a);
    }

    public final int hashCode() {
        return ((((((((((((this.f591a.hashCode() + 527) * 31) + ((int) this.f592b)) * 31) + 1) * 31) + ((int) this.f594d)) * 31) + ((int) this.f595e)) * 31) + (this.f596f ? 1 : 0)) * 31) + (this.f597g ? 1 : 0);
    }
}
