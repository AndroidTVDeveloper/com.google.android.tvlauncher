package defpackage;

/* renamed from: blj  reason: default package */
/* compiled from: PG */
public final class blj {
    public long a;
    public long b;
    public volatile long c = -9223372036854775807L;

    public blj(long j) {
        a(j);
    }

    public static long d(long j) {
        return (j * 1000000) / 90000;
    }

    public static long e(long j) {
        return (j * 90000) / 1000000;
    }

    public final long a() {
        if (this.a == Long.MAX_VALUE) {
            return 0;
        }
        if (this.c == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return this.b;
    }

    public final long c(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c == -9223372036854775807L) {
            long j2 = this.a;
            if (j2 != Long.MAX_VALUE) {
                this.b = j2 - j;
            }
            synchronized (this) {
                this.c = j;
                notifyAll();
            }
        } else {
            this.c = j;
        }
        return j + this.b;
    }

    public final long b(long j) {
        if (j == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        if (this.c != -9223372036854775807L) {
            long e = e(this.c);
            long j2 = (4294967296L + e) / 8589934592L;
            long j3 = ((-1 + j2) * 8589934592L) + j;
            j += j2 * 8589934592L;
            if (Math.abs(j3 - e) < Math.abs(j - e)) {
                j = j3;
            }
        }
        return c(d(j));
    }

    public final void b() {
        this.c = -9223372036854775807L;
    }

    public final synchronized void a(long j) {
        bks.b(this.c == -9223372036854775807L);
        this.a = j;
    }

    public final synchronized void c() {
        while (this.c == -9223372036854775807L) {
            wait();
        }
    }
}
