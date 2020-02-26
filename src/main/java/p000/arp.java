package p000;

import android.util.Log;
import android.util.Pair;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: arp */
/* compiled from: PG */
public final class arp implements art {

    /* renamed from: b */
    private static final byte[] f2028b = {73, 68, 51};

    /* renamed from: a */
    public long f2029a;

    /* renamed from: c */
    private final boolean f2030c;

    /* renamed from: d */
    private final bkx f2031d;

    /* renamed from: e */
    private final bky f2032e;

    /* renamed from: f */
    private final String f2033f;

    /* renamed from: g */
    private String f2034g;

    /* renamed from: h */
    private aov f2035h;

    /* renamed from: i */
    private aov f2036i;

    /* renamed from: j */
    private int f2037j;

    /* renamed from: k */
    private int f2038k;

    /* renamed from: l */
    private int f2039l;

    /* renamed from: m */
    private boolean f2040m;

    /* renamed from: n */
    private boolean f2041n;

    /* renamed from: o */
    private int f2042o;

    /* renamed from: p */
    private int f2043p;

    /* renamed from: q */
    private int f2044q;

    /* renamed from: r */
    private boolean f2045r;

    /* renamed from: s */
    private long f2046s;

    /* renamed from: t */
    private int f2047t;

    /* renamed from: u */
    private aov f2048u;

    /* renamed from: v */
    private long f2049v;

    /* renamed from: a */
    public static boolean m1912a(int i) {
        return (i & 65526) == 65520;
    }

    /* renamed from: b */
    public final void mo1285b() {
    }

    public arp() {
        this(true, null);
    }

    public arp(boolean z, String str) {
        this.f2031d = new bkx(new byte[7]);
        this.f2032e = new bky(Arrays.copyOf(f2028b, 10));
        m1915d();
        this.f2042o = -1;
        this.f2043p = -1;
        this.f2046s = -9223372036854775807L;
        this.f2030c = z;
        this.f2033f = str;
    }

    /* renamed from: a */
    public final void mo1284a(bky bky) {
        int i;
        byte b;
        int i2;
        bky bky2 = bky;
        while (bky.mo2070b() > 0) {
            int i3 = this.f2037j;
            int i4 = 2;
            if (i3 == 0) {
                byte[] bArr = bky2.f4258a;
                int i5 = bky2.f4259b;
                int i6 = bky2.f4260c;
                while (true) {
                    if (i5 >= i6) {
                        bky2.mo2073c(i5);
                        break;
                    }
                    i = i5 + 1;
                    b = bArr[i5] & 255;
                    if (this.f2039l == 512 && m1911a((byte) -1, (byte) b)) {
                        if (this.f2041n) {
                            break;
                        }
                        int i7 = i - 2;
                        bky2.mo2073c(i7 + 1);
                        if (m1914b(bky2, this.f2031d.f4254a, 1)) {
                            this.f2031d.mo2050a(4);
                            int c = this.f2031d.mo2057c(1);
                            int i8 = this.f2042o;
                            if (i8 == -1 || c == i8) {
                                if (this.f2043p != -1) {
                                    if (!m1914b(bky2, this.f2031d.f4254a, 1)) {
                                        break;
                                    }
                                    this.f2031d.mo2050a(i4);
                                    if (this.f2031d.mo2057c(4) == this.f2043p) {
                                        bky2.mo2073c(i7 + 2);
                                    }
                                }
                                if (!m1914b(bky2, this.f2031d.f4254a, 4)) {
                                    break;
                                }
                                this.f2031d.mo2050a(14);
                                int c2 = this.f2031d.mo2057c(13);
                                if (c2 > 6) {
                                    int i9 = i7 + c2;
                                    int i10 = i9 + 1;
                                    if (i10 >= bky2.f4260c) {
                                        break;
                                    }
                                    byte[] bArr2 = bky2.f4258a;
                                    if (m1911a(bArr2[i9], bArr2[i10])) {
                                        if (this.f2042o != -1) {
                                            if (((bky2.f4258a[i10] & 8) >> 3) == c) {
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
                    int i11 = this.f2039l;
                    byte b2 = i11 | b;
                    if (b2 == 329) {
                        this.f2039l = 768;
                    } else if (b2 == 511) {
                        this.f2039l = 512;
                    } else if (b2 != 836) {
                        if (b2 == 1075) {
                            this.f2037j = 2;
                            this.f2038k = f2028b.length;
                            this.f2047t = 0;
                            this.f2032e.mo2073c(0);
                            bky2.mo2073c(i);
                            break;
                        } else if (i11 != 256) {
                            this.f2039l = 256;
                            i5 = i - 1;
                            i4 = 2;
                        }
                    } else {
                        this.f2039l = 1024;
                    }
                    i5 = i;
                    i4 = 2;
                }
                this.f2044q = (b & 8) >> 3;
                this.f2040m = ((b & 1) ^ 1) != 0;
                if (this.f2041n) {
                    m1916e();
                } else {
                    this.f2037j = 1;
                    this.f2038k = 0;
                }
                bky2.mo2073c(i);
            } else if (i3 != 1) {
                if (i3 != 2) {
                    if (i3 != 3) {
                        int min = Math.min(bky.mo2070b(), this.f2047t - this.f2038k);
                        this.f2048u.mo1205a(bky2, min);
                        int i12 = this.f2038k + min;
                        this.f2038k = i12;
                        int i13 = this.f2047t;
                        if (i12 == i13) {
                            this.f2048u.mo1203a(this.f2029a, 1, i13, 0, null);
                            this.f2029a += this.f2049v;
                            m1915d();
                        }
                    } else {
                        if (!this.f2040m) {
                            i2 = 5;
                        } else {
                            i2 = 7;
                        }
                        if (m1913a(bky2, this.f2031d.f4254a, i2)) {
                            this.f2031d.mo2050a(0);
                            if (!this.f2045r) {
                                int c3 = this.f2031d.mo2057c(2) + 1;
                                if (c3 != 2) {
                                    StringBuilder sb = new StringBuilder(61);
                                    sb.append("Detected audio object type: ");
                                    sb.append(c3);
                                    sb.append(", but assuming AAC LC.");
                                    Log.w("AdtsReader", sb.toString());
                                }
                                this.f2031d.mo2054b(5);
                                byte[] b3 = bkg.m3485b(this.f2043p, this.f2031d.mo2057c(3));
                                Pair a = bkg.m3480a(b3);
                                akh a2 = akh.m731a(this.f2034g, "audio/mp4a-latm", -1, -1, ((Integer) a.second).intValue(), ((Integer) a.first).intValue(), Collections.singletonList(b3), (anq) null, this.f2033f);
                                this.f2046s = 1024000000 / ((long) a2.f570w);
                                this.f2035h.mo1204a(a2);
                                this.f2045r = true;
                            } else {
                                this.f2031d.mo2054b(10);
                            }
                            this.f2031d.mo2054b(4);
                            int c4 = this.f2031d.mo2057c(13) - 7;
                            if (this.f2040m) {
                                c4 -= 2;
                            }
                            m1910a(this.f2035h, this.f2046s, 0, c4);
                        }
                    }
                } else if (m1913a(bky2, this.f2032e.f4258a, 10)) {
                    this.f2036i.mo1205a(this.f2032e, 10);
                    this.f2032e.mo2073c(6);
                    m1910a(this.f2036i, 0, 10, 10 + this.f2032e.mo2086m());
                }
            } else if (bky.mo2070b() != 0) {
                bkx bkx = this.f2031d;
                bkx.f4254a[0] = bky2.f4258a[bky2.f4259b];
                bkx.mo2050a(2);
                int c5 = this.f2031d.mo2057c(4);
                int i14 = this.f2043p;
                if (i14 == -1 || c5 == i14) {
                    if (!this.f2041n) {
                        this.f2041n = true;
                        this.f2042o = this.f2044q;
                        this.f2043p = c5;
                    }
                    m1916e();
                } else {
                    mo1286c();
                }
            }
        }
    }

    /* renamed from: a */
    private final boolean m1913a(bky bky, byte[] bArr, int i) {
        int min = Math.min(bky.mo2070b(), i - this.f2038k);
        bky.mo2069a(bArr, this.f2038k, min);
        int i2 = this.f2038k + min;
        this.f2038k = i2;
        return i2 == i;
    }

    /* renamed from: a */
    public final void mo1283a(aok aok, asw asw) {
        asw.mo1308a();
        this.f2034g = asw.mo1310c();
        this.f2035h = aok.mo1211a(asw.mo1309b(), 1);
        if (this.f2030c) {
            asw.mo1308a();
            aov a = aok.mo1211a(asw.mo1309b(), 4);
            this.f2036i = a;
            a.mo1204a(akh.m728a(asw.mo1310c(), "application/id3"));
            return;
        }
        this.f2036i = new aoh();
    }

    /* renamed from: a */
    private static final boolean m1911a(byte b, byte b2) {
        return m1912a(((b & 255) << 8) | (b2 & 255));
    }

    /* renamed from: a */
    public final void mo1282a(long j, int i) {
        this.f2029a = j;
    }

    /* renamed from: c */
    public final void mo1286c() {
        this.f2041n = false;
        m1915d();
    }

    /* renamed from: a */
    public final void mo1281a() {
        mo1286c();
    }

    /* renamed from: d */
    private final void m1915d() {
        this.f2037j = 0;
        this.f2038k = 0;
        this.f2039l = 256;
    }

    /* renamed from: e */
    private final void m1916e() {
        this.f2037j = 3;
        this.f2038k = 0;
    }

    /* renamed from: a */
    private final void m1910a(aov aov, long j, int i, int i2) {
        this.f2037j = 4;
        this.f2038k = i;
        this.f2048u = aov;
        this.f2049v = j;
        this.f2047t = i2;
    }

    /* renamed from: b */
    private static final boolean m1914b(bky bky, byte[] bArr, int i) {
        if (bky.mo2070b() < i) {
            return false;
        }
        bky.mo2069a(bArr, 0, i);
        return true;
    }
}
