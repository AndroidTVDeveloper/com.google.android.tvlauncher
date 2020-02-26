package defpackage;

/* renamed from: bko  reason: default package */
/* compiled from: PG */
public final class bko {
    public final int a;
    public final int b;
    public final int c;
    public final long d;

    public bko(byte[] bArr) {
        bkx bkx = new bkx(bArr);
        bkx.a(136);
        bkx.c(16);
        bkx.c(16);
        bkx.c(24);
        bkx.c(24);
        this.a = bkx.c(20);
        this.b = bkx.c(3) + 1;
        this.c = bkx.c(5) + 1;
        this.d = ((((long) bkx.c(4)) & 15) << 32) | (((long) bkx.c(32)) & 4294967295L);
    }
}
