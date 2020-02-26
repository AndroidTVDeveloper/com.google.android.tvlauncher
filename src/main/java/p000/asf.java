package p000;

import android.util.Log;

/* renamed from: asf */
/* compiled from: PG */
public final class asf implements asx {

    /* renamed from: a */
    private final art f2213a;

    /* renamed from: b */
    private final bkx f2214b = new bkx(new byte[10]);

    /* renamed from: c */
    private int f2215c = 0;

    /* renamed from: d */
    private int f2216d;

    /* renamed from: e */
    private blj f2217e;

    /* renamed from: f */
    private boolean f2218f;

    /* renamed from: g */
    private boolean f2219g;

    /* renamed from: h */
    private boolean f2220h;

    /* renamed from: i */
    private int f2221i;

    /* renamed from: j */
    private int f2222j;

    /* renamed from: k */
    private boolean f2223k;

    public asf(art art) {
        this.f2213a = art;
    }

    /* renamed from: a */
    public final void mo1300a(bky bky, int i) {
        long j;
        int i2;
        bky bky2 = bky;
        int i3 = -1;
        int i4 = 2;
        if ((i & 1) != 0) {
            int i5 = this.f2215c;
            if (!(i5 == 0 || i5 == 1)) {
                if (i5 != 2) {
                    int i6 = this.f2222j;
                    if (i6 != -1) {
                        StringBuilder sb = new StringBuilder(59);
                        sb.append("Unexpected start indicator: expected ");
                        sb.append(i6);
                        sb.append(" more bytes");
                        Log.w("PesReader", sb.toString());
                    }
                    this.f2213a.mo1285b();
                } else {
                    Log.w("PesReader", "Unexpected start indicator reading extended header");
                }
            }
            m1988a(1);
        }
        int i7 = i;
        while (bky.mo2070b() > 0) {
            int i8 = this.f2215c;
            if (i8 != 0) {
                int i9 = 0;
                if (i8 != 1) {
                    if (i8 != i4) {
                        int b = bky.mo2070b();
                        int i10 = this.f2222j;
                        if (i10 != i3) {
                            i9 = b - i10;
                        }
                        if (i9 > 0) {
                            b -= i9;
                            bky2.mo2071b(bky2.f4259b + b);
                        }
                        this.f2213a.mo1284a(bky2);
                        int i11 = this.f2222j;
                        if (i11 != i3) {
                            int i12 = i11 - b;
                            this.f2222j = i12;
                            if (i12 == 0) {
                                this.f2213a.mo1285b();
                                m1988a(1);
                            }
                        }
                    } else {
                        if (!m1989a(bky2, this.f2214b.f4254a, Math.min(10, this.f2221i))) {
                            i3 = -1;
                        } else if (m1989a(bky2, (byte[]) null, this.f2221i)) {
                            this.f2214b.mo2050a(0);
                            if (this.f2218f) {
                                this.f2214b.mo2054b(4);
                                int c = this.f2214b.mo2057c(3);
                                this.f2214b.mo2054b(1);
                                int c2 = this.f2214b.mo2057c(15);
                                this.f2214b.mo2054b(1);
                                long c3 = ((long) (c2 << 15)) | (((long) c) << 30) | ((long) this.f2214b.mo2057c(15));
                                this.f2214b.mo2054b(1);
                                if (!this.f2220h && this.f2219g) {
                                    this.f2214b.mo2054b(4);
                                    int c4 = this.f2214b.mo2057c(3);
                                    this.f2214b.mo2054b(1);
                                    int c5 = this.f2214b.mo2057c(15);
                                    this.f2214b.mo2054b(1);
                                    int c6 = this.f2214b.mo2057c(15);
                                    this.f2214b.mo2054b(1);
                                    this.f2217e.mo2115b((((long) c4) << 30) | ((long) (c5 << 15)) | ((long) c6));
                                    this.f2220h = true;
                                }
                                j = this.f2217e.mo2115b(c3);
                            } else {
                                j = -9223372036854775807L;
                            }
                            if (!this.f2223k) {
                                i2 = 0;
                            } else {
                                i2 = 4;
                            }
                            i7 |= i2;
                            this.f2213a.mo1282a(j, i7);
                            m1988a(3);
                            i3 = -1;
                            i4 = 2;
                        } else {
                            i3 = -1;
                        }
                    }
                } else if (m1989a(bky2, this.f2214b.f4254a, 9)) {
                    int i13 = 0;
                    this.f2214b.mo2050a(0);
                    int c7 = this.f2214b.mo2057c(24);
                    if (c7 != 1) {
                        StringBuilder sb2 = new StringBuilder(41);
                        sb2.append("Unexpected start code prefix: ");
                        sb2.append(c7);
                        Log.w("PesReader", sb2.toString());
                        i3 = -1;
                        this.f2222j = -1;
                    } else {
                        this.f2214b.mo2054b(8);
                        int c8 = this.f2214b.mo2057c(16);
                        this.f2214b.mo2054b(5);
                        this.f2223k = this.f2214b.mo2060e();
                        this.f2214b.mo2054b(2);
                        this.f2218f = this.f2214b.mo2060e();
                        this.f2219g = this.f2214b.mo2060e();
                        this.f2214b.mo2054b(6);
                        int c9 = this.f2214b.mo2057c(8);
                        this.f2221i = c9;
                        if (c8 != 0) {
                            this.f2222j = (c8 - 3) - c9;
                            i3 = -1;
                            i13 = 2;
                        } else {
                            i3 = -1;
                            this.f2222j = -1;
                            i13 = 2;
                        }
                    }
                    m1988a(i13);
                } else {
                    i3 = -1;
                }
            } else {
                bky2.mo2075d(bky.mo2070b());
            }
            i4 = 2;
        }
    }

    /* renamed from: a */
    private final boolean m1989a(bky bky, byte[] bArr, int i) {
        int min = Math.min(bky.mo2070b(), i - this.f2216d);
        if (min <= 0) {
            return true;
        }
        if (bArr != null) {
            bky.mo2069a(bArr, this.f2216d, min);
        } else {
            bky.mo2075d(min);
        }
        int i2 = this.f2216d + min;
        this.f2216d = i2;
        if (i2 != i) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo1301a(blj blj, aok aok, asw asw) {
        this.f2217e = blj;
        this.f2213a.mo1283a(aok, asw);
    }

    /* renamed from: a */
    public final void mo1299a() {
        this.f2215c = 0;
        this.f2216d = 0;
        this.f2220h = false;
        this.f2213a.mo1281a();
    }

    /* renamed from: a */
    private final void m1988a(int i) {
        this.f2215c = i;
        this.f2216d = 0;
    }
}
