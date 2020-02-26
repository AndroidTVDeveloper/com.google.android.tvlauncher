package defpackage;

/* renamed from: bda  reason: default package */
/* compiled from: PG */
public final class bda {
    public final boolean a;
    public final bcy b;
    public final bcz[] c;
    public final long d;
    public final long e;

    public bda(long j, long j2, long j3, boolean z, bcy bcy, bcz[] bczArr) {
        long j4 = -9223372036854775807L;
        long b2 = j2 != 0 ? blm.b(j2, 1000000, j) : -9223372036854775807L;
        j4 = j3 != 0 ? blm.b(j3, 1000000, j) : j4;
        this.d = b2;
        this.e = j4;
        this.a = z;
        this.b = bcy;
        this.c = bczArr;
    }
}
