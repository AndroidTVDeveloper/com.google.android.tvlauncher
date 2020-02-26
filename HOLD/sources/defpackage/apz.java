package defpackage;

/* renamed from: apz  reason: default package */
/* compiled from: PG */
final class apz implements apw {
    private final bky a;
    private final int b = this.a.n();
    private final int c = (this.a.n() & 255);
    private int d;
    private int e;

    public apz(apt apt) {
        bky bky = apt.a;
        this.a = bky;
        bky.c(12);
    }

    public final int a() {
        return this.b;
    }

    public final boolean c() {
        return false;
    }

    public final int b() {
        int i = this.c;
        if (i == 8) {
            return this.a.d();
        }
        if (i == 16) {
            return this.a.e();
        }
        int i2 = this.d;
        this.d = i2 + 1;
        if (i2 % 2 != 0) {
            return this.e & 15;
        }
        int d2 = this.a.d();
        this.e = d2;
        return (d2 & 240) >> 4;
    }
}
