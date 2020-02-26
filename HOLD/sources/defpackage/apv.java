package defpackage;

/* renamed from: apv  reason: default package */
/* compiled from: PG */
final class apv {
    public final int a;
    public int b;
    public int c;
    public long d;
    private final boolean e;
    private final bky f;
    private final bky g;
    private int h;
    private int i;

    public apv(bky bky, bky bky2, boolean z) {
        this.g = bky;
        this.f = bky2;
        this.e = z;
        bky2.c(12);
        this.a = bky2.n();
        bky.c(12);
        this.i = bky.n();
        bks.b(bky.j() != 1 ? false : true, "first_chunk must be 1");
        this.b = -1;
    }

    public final boolean a() {
        long j;
        int i2 = this.b + 1;
        this.b = i2;
        if (i2 == this.a) {
            return false;
        }
        if (!this.e) {
            j = this.f.h();
        } else {
            j = this.f.p();
        }
        this.d = j;
        if (this.b == this.h) {
            this.c = this.g.n();
            this.g.d(4);
            int i3 = -1;
            int i4 = this.i - 1;
            this.i = i4;
            if (i4 > 0) {
                i3 = -1 + this.g.n();
            }
            this.h = i3;
        }
        return true;
    }
}
