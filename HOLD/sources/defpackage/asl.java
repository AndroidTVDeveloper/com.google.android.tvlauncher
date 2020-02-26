package defpackage;

/* renamed from: asl  reason: default package */
/* compiled from: PG */
public final class asl implements asx {
    private final ask a;
    private final bky b = new bky(32);
    private int c;
    private int d;
    private boolean e;
    private boolean f;

    public asl(ask ask) {
        this.a = ask;
    }

    public final void a(bky bky, int i) {
        int i2 = i & 1;
        int d2 = i2 != 0 ? bky.d() + bky.b : -1;
        if (this.f) {
            if (i2 != 0) {
                this.f = false;
                bky.c(d2);
                this.d = 0;
            } else {
                return;
            }
        }
        while (bky.b() > 0) {
            int i3 = this.d;
            if (i3 >= 3) {
                int min = Math.min(bky.b(), this.c - this.d);
                bky.a(this.b.a, this.d, min);
                int i4 = this.d + min;
                this.d = i4;
                int i5 = this.c;
                if (i4 != i5) {
                    continue;
                } else {
                    if (!this.e) {
                        this.b.a(i5);
                    } else if (blm.a(this.b.a, i5) == 0) {
                        this.b.a(this.c - 4);
                    } else {
                        this.f = true;
                        return;
                    }
                    this.a.a(this.b);
                    this.d = 0;
                }
            } else {
                if (i3 == 0) {
                    int d3 = bky.d();
                    bky.c(bky.b - 1);
                    if (d3 == 255) {
                        this.f = true;
                        return;
                    }
                }
                int min2 = Math.min(bky.b(), 3 - this.d);
                bky.a(this.b.a, this.d, min2);
                int i6 = this.d + min2;
                this.d = i6;
                if (i6 == 3) {
                    this.b.a(3);
                    this.b.d(1);
                    int d4 = this.b.d();
                    int d5 = this.b.d();
                    this.e = (d4 & 128) != 0;
                    this.c = (((d4 & 15) << 8) | d5) + 3;
                    int c2 = this.b.c();
                    int i7 = this.c;
                    if (c2 < i7) {
                        bky bky2 = this.b;
                        byte[] bArr = bky2.a;
                        int length = bArr.length;
                        bky2.a(Math.min(4098, Math.max(i7, length + length)));
                        System.arraycopy(bArr, 0, this.b.a, 0, 3);
                    }
                }
            }
        }
    }

    public final void a(blj blj, aok aok, asw asw) {
        this.a.a(blj, aok, asw);
        this.f = true;
    }

    public final void a() {
        this.f = true;
    }
}
