package defpackage;

import java.io.IOException;

/* renamed from: arj  reason: default package */
/* compiled from: PG */
public final class arj implements aoi {
    private final akh a;
    private final bky b = new bky(9);
    private aov c;
    private int d = 0;
    private int e;
    private long f;
    private int g;
    private int h;

    public arj(akh akh) {
        this.a = akh;
    }

    public final void a(aok aok) {
        aok.a(new aor(-9223372036854775807L));
        this.c = aok.a(0, 3);
        aok.S();
        this.c.a(this.a);
    }

    public final int a(aoj aoj, aop aop) {
        while (true) {
            int i = this.d;
            if (i == 0) {
                this.b.a();
                if (!aoj.a(this.b.a, 0, 8, true)) {
                    return -1;
                }
                if (this.b.j() == 1380139777) {
                    this.e = this.b.d();
                    this.d = 1;
                } else {
                    throw new IOException("Input not RawCC");
                }
            } else if (i != 1) {
                while (this.g > 0) {
                    this.b.a();
                    aoj.b(this.b.a, 0, 3);
                    this.c.a(this.b, 3);
                    this.h += 3;
                    this.g--;
                }
                int i2 = this.h;
                if (i2 > 0) {
                    this.c.a(this.f, 1, i2, 0, null);
                }
                this.d = 1;
                return 0;
            } else {
                this.b.a();
                int i3 = this.e;
                if (i3 == 0) {
                    if (!aoj.a(this.b.a, 0, 5, true)) {
                        break;
                    }
                    this.f = (this.b.h() * 1000) / 45;
                } else if (i3 == 1) {
                    if (!aoj.a(this.b.a, 0, 9, true)) {
                        break;
                    }
                    this.f = this.b.l();
                } else {
                    StringBuilder sb = new StringBuilder(39);
                    sb.append("Unsupported version number: ");
                    sb.append(i3);
                    throw new ako(sb.toString());
                }
                this.g = this.b.d();
                this.h = 0;
                this.d = 2;
            }
        }
        this.d = 0;
        return -1;
    }

    public final void a(long j, long j2) {
        this.d = 0;
    }

    public final boolean a(aoj aoj) {
        this.b.a();
        aoj.c(this.b.a, 0, 8);
        if (this.b.j() == 1380139777) {
            return true;
        }
        return false;
    }
}
