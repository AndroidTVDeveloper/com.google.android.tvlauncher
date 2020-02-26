package defpackage;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: arp  reason: default package */
/* compiled from: PG */
public final class arp implements art {
    private static final byte[] b = {73, 68, 51};
    public long a;
    private final boolean c;
    private final bkx d;
    private final bky e;
    private final String f;
    private String g;
    private aov h;
    private aov i;
    private int j;
    private int k;
    private int l;
    private boolean m;
    private boolean n;
    private int o;
    private int p;
    private int q;
    private boolean r;
    private long s;
    private int t;
    private aov u;
    private long v;

    public static boolean a(int i2) {
        return (i2 & 65526) == 65520;
    }

    public final void b() {
    }

    public arp() {
        this(true, null);
    }

    public arp(boolean z, String str) {
        this.d = new bkx(new byte[7]);
        this.e = new bky(Arrays.copyOf(b, 10));
        d();
        this.o = -1;
        this.p = -1;
        this.s = -9223372036854775807L;
        this.c = z;
        this.f = str;
    }

    public final void a(bky bky) {
        int i2;
        byte b2;
        int i3;
        bky bky2 = bky;
        while (bky.b() > 0) {
            int i4 = this.j;
            int i5 = 2;
            if (i4 == 0) {
                byte[] bArr = bky2.a;
                int i6 = bky2.b;
                int i7 = bky2.c;
                while (true) {
                    if (i6 >= i7) {
                        bky2.c(i6);
                        break;
                    }
                    i2 = i6 + 1;
                    b2 = bArr[i6] & 255;
                    if (this.l == 512 && a((byte) -1, (byte) b2)) {
                        if (this.n) {
                            break;
                        }
                        int i8 = i2 - 2;
                        bky2.c(i8 + 1);
                        if (b(bky2, this.d.a, 1)) {
                            this.d.a(4);
                            int c2 = this.d.c(1);
                            int i9 = this.o;
                            if (i9 == -1 || c2 == i9) {
                                if (this.p != -1) {
                                    if (!b(bky2, this.d.a, 1)) {
                                        break;
                                    }
                                    this.d.a(i5);
                                    if (this.d.c(4) == this.p) {
                                        bky2.c(i8 + 2);
                                    }
                                }
                                if (!b(bky2, this.d.a, 4)) {
                                    break;
                                }
                                this.d.a(14);
                                int c3 = this.d.c(13);
                                if (c3 > 6) {
                                    int i10 = i8 + c3;
                                    int i11 = i10 + 1;
                                    if (i11 >= bky2.c) {
                                        break;
                                    }
                                    byte[] bArr2 = bky2.a;
                                    if (a(bArr2[i10], bArr2[i11])) {
                                        if (this.o != -1) {
                                            if (((bky2.a[i11] & 8) >> 3) == c2) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    int i12 = this.l;
                    byte b3 = i12 | b2;
                    if (b3 == 329) {
                        this.l = 768;
                    } else if (b3 == 511) {
                        this.l = 512;
                    } else if (b3 != 836) {
                        if (b3 == 1075) {
                            this.j = 2;
                            this.k = b.length;
                            this.t = 0;
                            this.e.c(0);
                            bky2.c(i2);
                            break;
                        } else if (i12 != 256) {
                            this.l = 256;
                            i6 = i2 - 1;
                            i5 = 2;
                        }
                    } else {
                        this.l = 1024;
                    }
                    i6 = i2;
                    i5 = 2;
                }
                this.q = (b2 & 8) >> 3;
                this.m = ((b2 & 1) ^ 1) != 0;
                if (this.n) {
                    e();
                } else {
                    this.j = 1;
                    this.k = 0;
                }
                bky2.c(i2);
            } else if (i4 != 1) {
                if (i4 != 2) {
                    if (i4 != 3) {
                        int min = Math.min(bky.b(), this.t - this.k);
                        this.u.a(bky2, min);
                        int i13 = this.k + min;
                        this.k = i13;
                        int i14 = this.t;
                        if (i13 == i14) {
                            this.u.a(this.a, 1, i14, 0, null);
                            this.a += this.v;
                            d();
                        }
                    } else {
                        if (!this.m) {
                            i3 = 5;
                        } else {
                            i3 = 7;
                        }
                        if (a(bky2, this.d.a, i3)) {
                            this.d.a(0);
                            if (!this.r) {
                                int c4 = this.d.c(2) + 1;
                                if (c4 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(c4);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.d.b(5);
                                byte[] b4 = bkg.b(this.p, this.d.c(3));
                                Pair a2 = bkg.a(b4);
                                akh a3 = akh.a(this.g, "audio/mp4a-latm", -1, -1, ((Integer) a2.second).intValue(), ((Integer) a2.first).intValue(), Collections.singletonList(b4), (anq) null, this.f);
                                this.s = 1024000000 / ((long) a3.w);
                                this.h.a(a3);
                                this.r = true;
                            } else {
                                this.d.b(10);
                            }
                            this.d.b(4);
                            int c5 = this.d.c(13) - 7;
                            if (this.m) {
                                c5 -= 2;
                            }
                            a(this.h, this.s, 0, c5);
                        }
                    }
                } else if (a(bky2, this.e.a, 10)) {
                    this.i.a(this.e, 10);
                    this.e.c(6);
                    a(this.i, 0, 10, 10 + this.e.m());
                }
            } else if (bky.b() != 0) {
                bkx bkx = this.d;
                bkx.a[0] = bky2.a[bky2.b];
                bkx.a(2);
                int c6 = this.d.c(4);
                int i15 = this.p;
                if (i15 == -1 || c6 == i15) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = c6;
                    }
                    e();
                } else {
                    c();
                }
            }
        }
    }

    private final boolean a(bky bky, byte[] bArr, int i2) {
        int min = Math.min(bky.b(), i2 - this.k);
        bky.a(bArr, this.k, min);
        int i3 = this.k + min;
        this.k = i3;
        return i3 == i2;
    }

    public final void a(aok aok, asw asw) {
        asw.a();
        this.g = asw.c();
        this.h = aok.a(asw.b(), 1);
        if (this.c) {
            asw.a();
            aov a2 = aok.a(asw.b(), 4);
            this.i = a2;
            a2.a(akh.a(asw.c(), "application/id3"));
            return;
        }
        this.i = new aoh();
    }

    private static final boolean a(byte b2, byte b3) {
        return a(((b2 & 255) << 8) | (b3 & 255));
    }

    public final void a(long j2, int i2) {
        this.a = j2;
    }

    public final void c() {
        this.n = false;
        d();
    }

    public final void a() {
        c();
    }

    private final void d() {
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    private final void e() {
        this.j = 3;
        this.k = 0;
    }

    private final void a(aov aov, long j2, int i2, int i3) {
        this.j = 4;
        this.k = i2;
        this.u = aov;
        this.v = j2;
        this.t = i3;
    }

    private static final boolean b(bky bky, byte[] bArr, int i2) {
        if (bky.b() < i2) {
            return false;
        }
        bky.a(bArr, 0, i2);
        return true;
    }
}
