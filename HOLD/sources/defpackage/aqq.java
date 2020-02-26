package defpackage;

/* renamed from: aqq  reason: default package */
/* compiled from: PG */
final class aqq {
    public aqc a;
    public long b;
    public long c;
    public int d;
    public int e;
    public long[] f;
    public int[] g;
    public int[] h;
    public int[] i;
    public long[] j;
    public boolean[] k;
    public boolean l;
    public boolean[] m;
    public aqp n;
    public int o;
    public bky p;
    public boolean q;
    public long r;

    public final long b(int i2) {
        return this.j[i2] + ((long) this.i[i2]);
    }

    public final void a(int i2) {
        bky bky = this.p;
        if (bky == null || bky.c < i2) {
            this.p = new bky(i2);
        }
        this.o = i2;
        this.l = true;
        this.q = true;
    }

    public final boolean c(int i2) {
        return this.l && this.m[i2];
    }
}
