package defpackage;

/* renamed from: aoa  reason: default package */
/* compiled from: PG */
public final class aoa {
    public static final aoa a = new aoa(-3, -9223372036854775807L, -1);
    public final int b;
    public final long c;
    public final long d;

    private aoa(int i, long j, long j2) {
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public static aoa a(long j, long j2) {
        return new aoa(-1, j, j2);
    }

    public static aoa a(long j) {
        return new aoa(0, -9223372036854775807L, j);
    }

    public static aoa b(long j, long j2) {
        return new aoa(-2, j, j2);
    }
}
