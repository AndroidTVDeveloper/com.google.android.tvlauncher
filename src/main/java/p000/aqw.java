package p000;

import java.util.Arrays;

/* renamed from: aqw */
/* compiled from: PG */
public final class aqw implements aoi {

    /* renamed from: a */
    private aok f1927a;

    /* renamed from: b */
    private ard f1928b;

    /* renamed from: c */
    private boolean f1929c;

    /* renamed from: a */
    public final void mo1208a(aok aok) {
        this.f1927a = aok;
    }

    /* renamed from: a */
    public final int mo1206a(aoj aoj, aop aop) {
        int i;
        boolean z;
        aoj aoj2 = aoj;
        if (this.f1928b == null) {
            if (m1851b(aoj)) {
                aoj.mo1191a();
            } else {
                throw new ako("Failed to determine bitstream type");
            }
        }
        if (!this.f1929c) {
            aov a = this.f1927a.mo1211a(0, 1);
            this.f1927a.mo1210S();
            ard ard = this.f1928b;
            ard.f1950d = this.f1927a;
            ard.f1949c = a;
            ard.mo1270a(true);
            this.f1929c = true;
        }
        ard ard2 = this.f1928b;
        int i2 = ard2.f1955i;
        if (i2 == 0) {
            while (ard2.f1948b.mo1272a(aoj2)) {
                aof aof = (aof) aoj2;
                long j = aof.f1490c;
                long j2 = ard2.f1953g;
                ard2.f1958l = j - j2;
                if (!ard2.mo1271a(ard2.f1948b.f1931b, j2, ard2.f1957k)) {
                    akh akh = ard2.f1957k.f1946a;
                    ard2.f1956j = akh.f570w;
                    if (!ard2.f1960n) {
                        ard2.f1949c.mo1204a(akh);
                        ard2.f1960n = true;
                    }
                    aqz aqz = ard2.f1957k.f1947b;
                    if (aqz == null) {
                        long j3 = aof.f1489b;
                        if (j3 != -1) {
                            aqy aqy = ard2.f1948b.f1930a;
                            if ((aqy.f1935a & 4) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ard2.f1951e = new aqt(ard2, ard2.f1953g, j3, (long) (aqy.f1938d + aqy.f1939e), aqy.f1936b, z);
                            i = 2;
                        } else {
                            ard2.f1951e = new arc((byte) 0);
                            i = 2;
                        }
                    } else {
                        i = 2;
                        ard2.f1951e = aqz;
                    }
                    ard2.f1957k = null;
                    ard2.f1955i = i;
                    bky bky = ard2.f1948b.f1931b;
                    byte[] bArr = bky.f4258a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    bky.f4258a = Arrays.copyOf(bArr, Math.max(65025, bky.f4260c));
                    return 0;
                }
                ard2.f1953g = aof.f1490c;
            }
            ard2.f1955i = 3;
            return -1;
        } else if (i2 == 1) {
            aoj2.mo1192a((int) ard2.f1953g);
            ard2.f1955i = 2;
            return 0;
        } else if (i2 == 2) {
            long a2 = ard2.f1951e.mo1266a(aoj2);
            if (a2 >= 0) {
                aop.f1514a = a2;
                return 1;
            }
            if (a2 < -1) {
                ard2.mo1277c(-(a2 + 2));
            }
            if (!ard2.f1959m) {
                ard2.f1950d.mo1212a(ard2.f1951e.mo1267a());
                ard2.f1959m = true;
            }
            if (ard2.f1958l > 0 || ard2.f1948b.mo1272a(aoj2)) {
                ard2.f1958l = 0;
                bky bky2 = ard2.f1948b.f1931b;
                long a3 = ard2.mo1269a(bky2);
                if (a3 >= 0) {
                    long j4 = ard2.f1954h;
                    if (j4 + a3 >= ard2.f1952f) {
                        long a4 = ard2.mo1275a(j4);
                        ard2.f1949c.mo1205a(bky2, bky2.f4260c);
                        ard2.f1949c.mo1203a(a4, 1, bky2.f4260c, 0, null);
                        ard2.f1952f = -1;
                    }
                }
                ard2.f1954h += a3;
                return 0;
            }
            ard2.f1955i = 3;
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    /* renamed from: a */
    private static bky m1850a(bky bky) {
        bky.mo2073c(0);
        return bky;
    }

    /* renamed from: a */
    public final void mo1207a(long j, long j2) {
        ard ard = this.f1928b;
        if (ard != null) {
            aqx aqx = ard.f1948b;
            aqx.f1930a.mo1273a();
            aqx.f1931b.mo2064a();
            aqx.f1932c = -1;
            aqx.f1933d = false;
            if (j == 0) {
                ard.mo1270a(!ard.f1959m);
            } else if (ard.f1955i != 0) {
                long b = ard.mo1276b(j2);
                ard.f1952f = b;
                ard.f1951e.mo1268a(b);
                ard.f1955i = 2;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1209a(aoj aoj) {
        try {
            return m1851b(aoj);
        } catch (ako e) {
            return false;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buh.a(int, bky, boolean):boolean
     arg types: [int, bky, int]
     candidates:
      buh.a(android.os.Parcel, int, android.os.Parcelable$Creator):android.os.Parcelable
      buh.a(android.os.Parcel, int, int):void
      buh.a(int, bky, boolean):boolean */
    /* renamed from: b */
    private final boolean m1851b(aoj aoj) {
        aqy aqy = new aqy();
        if (aqy.mo1274a(aoj, true) && (aqy.f1935a & 2) == 2) {
            int min = Math.min(aqy.f1939e, 8);
            bky bky = new bky(min);
            aoj.mo1199c(bky.f4258a, 0, min);
            bky a = m1850a(bky);
            if (a.mo2070b() >= 5 && a.mo2074d() == 127 && a.mo2081h() == 1179402563) {
                this.f1928b = new aqv();
            } else {
                try {
                    if (buh.m4207a(1, m1850a(bky), true)) {
                        this.f1928b = new arg();
                    }
                } catch (ako e) {
                }
                if (ara.m1864b(m1850a(bky))) {
                    this.f1928b = new ara();
                }
            }
            return true;
        }
        return false;
    }
}
