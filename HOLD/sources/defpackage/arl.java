package defpackage;

import java.util.List;

/* renamed from: arl  reason: default package */
/* compiled from: PG */
public final class arl implements art {
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

    public arl() {
        this(null);
    }

    public final void b() {
    }

    public arl(String str) {
        this.b = new bkx(new byte[128]);
        this.c = new bky(this.b.a);
        this.g = 0;
        this.d = str;
    }

    public final void a(bky bky) {
        boolean z;
        bky bky2 = bky;
        while (bky.b() > 0) {
            int i2 = this.g;
            if (i2 == 0) {
                while (true) {
                    if (bky.b() <= 0) {
                        break;
                    } else if (this.i) {
                        int d2 = bky.d();
                        if (d2 == 119) {
                            this.i = false;
                            this.g = 1;
                            byte[] bArr = this.c.a;
                            bArr[0] = 11;
                            bArr[1] = 119;
                            this.h = 2;
                            break;
                        }
                        if (d2 == 11) {
                            z = true;
                        } else {
                            z = false;
                        }
                        this.i = z;
                    } else {
                        this.i = bky.d() == 11;
                    }
                }
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
                int min2 = Math.min(bky.b(), 128 - this.h);
                bky2.a(bArr2, this.h, min2);
                int i5 = this.h + min2;
                this.h = i5;
                if (i5 == 128) {
                    this.b.a(0);
                    alm a2 = aln.a(this.b);
                    akh akh = this.k;
                    if (!(akh != null && a2.c == akh.v && a2.b == akh.w && a2.a == akh.i)) {
                        akh a3 = akh.a(this.e, a2.a, -1, -1, a2.c, a2.b, (List) null, (anq) null, this.d);
                        this.k = a3;
                        this.f.a(a3);
                    }
                    this.l = a2.d;
                    this.j = (((long) a2.e) * 1000000) / ((long) this.k.w);
                    this.c.c(0);
                    this.f.a(this.c, 128);
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
