package p000;

/* renamed from: blj */
/* compiled from: PG */
public final class blj {

    /* renamed from: a */
    public long f4289a;

    /* renamed from: b */
    public long f4290b;

    /* renamed from: c */
    public volatile long f4291c = -9223372036854775807L;

    public blj(long j) {
        mo2114a(j);
    }

    /* renamed from: d */
    public static long m3608d(long j) {
        return (j * 1000000) / 90000;
    }

    /* renamed from: e */
    public static long m3609e(long j) {
        return (j * 90000) / 1000000;
    }

    /* renamed from: a */
    public final long mo2113a() {
        if (this.f4289a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.f4291c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.f4290b;
    }

    /* renamed from: c */
    public final long mo2117c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f4291c == -9223372036854775807L) {
            long j2 = this.f4289a;
            if (j2 != Long.MAX_VALUE) {
                this.f4290b = j2 - j;
            }
            synchronized (this) {
                this.f4291c = j;
                notifyAll();
            }
        } else {
            this.f4291c = j;
        }
        return j + this.f4290b;
    }

    /* renamed from: b */
    public final long mo2115b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.f4291c != -9223372036854775807L) {
            long e = m3609e(this.f4291c);
            long j2 = (4294967296L + e) / 8589934592L;
            long j3 = ((-1 + j2) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - e) < Math.abs(j - e)) {
                j = j3;
            }
        }
        return mo2117c(m3608d(j));
    }

    /* renamed from: b */
    public final void mo2116b() {
        this.f4291c = -9223372036854775807L;
    }

    /* renamed from: a */
    public final synchronized void mo2114a(long j) {
        bks.m3512b(this.f4291c == -9223372036854775807L);
        this.f4289a = j;
    }

    /* renamed from: c */
    public final synchronized void mo2118c() {
        while (this.f4291c == -9223372036854775807L) {
            wait();
        }
    }
}
