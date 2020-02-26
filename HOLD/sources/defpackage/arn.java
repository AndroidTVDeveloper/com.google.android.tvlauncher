package defpackage;

import java.util.List;

/* renamed from: arn  reason: default package */
/* compiled from: PG */
public final class arn implements art {
    public long a;
    private final bkx b;
    private final bky c;
    private final String d;
    private String e;
    private aov f;
    private int g;
    private int h;
    private boolean i;
    private long j;
    private akh k;
    private int l;

    public arn() {
        this(null);
    }

    public final void b() {
    }

    public arn(String str) {
        this.b = new bkx(new byte[16]);
        this.c = new bky(this.b.a);
        this.g = 0;
        this.h = 0;
        this.i = false;
        this.d = str;
    }

    public final void a(bky bky) {
        int d2;
        boolean z;
        byte b2;
        bky bky2 = bky;
        while (bky.b() > 0) {
            int i2 = this.g;
            if (i2 == 0) {
                while (true) {
                    if (bky.b() <= 0) {
                        break;
                    } else if (this.i) {
                        d2 = bky.d();
                        if (d2 == 172) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.i = z;
                        b2 = 64;
                        if (!(d2 == 64 || d2 == 65)) {
                        }
                    } else {
                        this.i = bky.d() == 172;
                    }
                }
                this.g = 1;
                byte[] bArr = this.c.a;
                bArr[0] = -84;
                if (d2 == 65) {
                    b2 = 65;
                }
                bArr[1] = b2;
                this.h = 2;
            } else if (i2 != 1) {
                int min = Math.min(bky.b(), this.l - this.h);
                this.f.a(bky2, min);
                int i3 = this.h + min;
                this.h = i3;
                int i4 = this.l;
                if (i3 == i4) {
                    this.f.a(this.a, 1, i4, 0, null);
                    this.a += this.j;
                    this.g = 0;
                }
            } else {
                byte[] bArr2 = this.c.a;
                int min2 = Math.min(bky.b(), 16 - this.h);
                bky2.a(bArr2, this.h, min2);
                int i5 = this.h + min2;
                this.h = i5;
                if (i5 == 16) {
                    this.b.a(0);
                    alo a2 = alp.a(this.b);
                    akh akh = this.k;
                    if (akh == null || akh.v != 2 || a2.a != akh.w || !"audio/ac4".equals(akh.i)) {
                        akh a3 = akh.a(this.e, "audio/ac4", -1, -1, 2, a2.a, (List) null, (anq) null, this.d);
                        this.k = a3;
                        this.f.a(a3);
                    }
                    this.l = a2.b;
                    this.j = (((long) a2.c) * 1000000) / ((long) this.k.w);
                    this.c.c(0);
                    this.f.a(this.c, 16);
                    this.g = 2;
                }
            }
        }
    }

    public final void a(aok aok, asw asw) {
        asw.a();
        this.e = asw.c();
        this.f = aok.a(asw.b(), 1);
    }

    public final void a(long j2, int i2) {
        this.a = j2;
    }

    public final void a() {
        this.g = 0;
        this.h = 0;
        this.i = false;
    }
}
