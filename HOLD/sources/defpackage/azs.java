package defpackage;

/* renamed from: azs  reason: default package */
/* compiled from: PG */
public final class azs implements azr {
    private final aod a;
    private final long b;

    public azs(aod aod, long j) {
        this.a = aod;
        this.b = j;
    }

    public final long a() {
        return 0;
    }

    public final boolean b() {
        return true;
    }

    public final int c(long j) {
        return this.a.a;
    }

    public final long b(long j, long j2) {
        return this.a.d[(int) j];
    }

    public final long a(long j, long j2) {
        return (long) this.a.b(j + this.b);
    }

    public final baj b(long j) {
        aod aod = this.a;
        int i = (int) j;
        return new baj(null, aod.c[i], (long) aod.b[i]);
    }

    public final long a(long j) {
        return this.a.e[(int) j] - this.b;
    }
}
