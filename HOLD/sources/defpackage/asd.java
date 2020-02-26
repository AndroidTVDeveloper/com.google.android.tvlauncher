package defpackage;

import java.util.List;

/* renamed from: asd  reason: default package */
/* compiled from: PG */
public final class asd implements art {
    private final bky a;
    private final aoo b;
    private final String c;
    private String d;
    private aov e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private long j;
    private int k;
    private long l;

    public asd() {
        this(null);
    }

    public final void b() {
    }

    public asd(String str) {
        this.f = 0;
        bky bky = new bky(4);
        this.a = bky;
        bky.a[0] = -1;
        this.b = new aoo();
        this.c = str;
    }

    public final void a(bky bky) {
        boolean z;
        bky bky2 = bky;
        while (bky.b() > 0) {
            int i2 = this.f;
            if (i2 == 0) {
                byte[] bArr = bky2.a;
                int i3 = bky2.b;
                int i4 = bky2.c;
                while (true) {
                    if (i3 >= i4) {
                        bky2.c(i4);
                        break;
                    }
                    byte b2 = bArr[i3];
                    boolean z2 = (b2 & 255) == 255;
                    if (!this.i || (b2 & 224) != 224) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.i = z2;
                    if (z) {
                        bky2.c(i3 + 1);
                        this.i = false;
                        this.a.a[1] = bArr[i3];
                        this.g = 2;
                        this.f = 1;
                        break;
                    }
                    i3++;
                }
            } else if (i2 != 1) {
                int min = Math.min(bky.b(), this.k - this.g);
                this.e.a(bky2, min);
                int i5 = this.g + min;
                this.g = i5;
                int i6 = this.k;
                if (i5 >= i6) {
                    this.e.a(this.l, 1, i6, 0, null);
                    this.l += this.j;
                    this.g = 0;
                    this.f = 0;
                }
            } else {
                int min2 = Math.min(bky.b(), 4 - this.g);
                bky2.a(this.a.a, this.g, min2);
                int i7 = this.g + min2;
                this.g = i7;
                if (i7 >= 4) {
                    this.a.c(0);
                    if (!aoo.a(this.a.j(), this.b)) {
                        this.g = 0;
                        this.f = 1;
                    } else {
                        aoo aoo = this.b;
                        this.k = aoo.c;
                        if (!this.h) {
                            int i8 = aoo.g;
                            int i9 = aoo.d;
                            this.j = (((long) i8) * 1000000) / ((long) i9);
                            this.e.a(akh.a(this.d, aoo.b, -1, 4096, aoo.e, i9, (List) null, (anq) null, this.c));
                            this.h = true;
                        }
                        this.a.c(0);
                        this.e.a(this.a, 4);
                        this.f = 2;
                    }
                }
            }
        }
    }

    public final void a(aok aok, asw asw) {
        asw.a();
        this.d = asw.c();
        this.e = aok.a(asw.b(), 1);
    }

    public final void a(long j2, int i2) {
        this.l = j2;
    }

    public final void a() {
        this.f = 0;
        this.g = 0;
        this.i = false;
    }
}
