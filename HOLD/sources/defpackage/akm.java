package defpackage;

/* renamed from: akm  reason: default package */
/* compiled from: PG */
final class akm {
    public final awt a;
    public final long b;
    public final long c = -9223372036854775807L;
    public final long d;
    public final long e;
    public final boolean f;
    public final boolean g;

    public akm(awt awt, long j, long j2, long j3, boolean z, boolean z2) {
        this.a = awt;
        this.b = j;
        this.d = j2;
        this.e = j3;
        this.f = z;
        this.g = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        akm akm = (akm) obj;
        return this.b == akm.b && this.d == akm.d && this.e == akm.e && this.f == akm.f && this.g == akm.g && blm.a(this.a, akm.a);
    }

    public final int hashCode() {
        return ((((((((((((this.a.hashCode() + 527) * 31) + ((int) this.b)) * 31) + 1) * 31) + ((int) this.d)) * 31) + ((int) this.e)) * 31) + (this.f ? 1 : 0)) * 31) + (this.g ? 1 : 0);
    }
}
