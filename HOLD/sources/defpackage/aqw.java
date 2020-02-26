package defpackage;

import java.util.Arrays;

/* renamed from: aqw  reason: default package */
/* compiled from: PG */
public final class aqw implements aoi {
    private aok a;
    private ard b;
    private boolean c;

    public final void a(aok aok) {
        this.a = aok;
    }

    public final int a(aoj aoj, aop aop) {
        int i;
        boolean z;
        aoj aoj2 = aoj;
        if (this.b == null) {
            if (b(aoj)) {
                aoj.a();
            } else {
                throw new ako("Failed to determine bitstream type");
            }
        }
        if (!this.c) {
            aov a2 = this.a.a(0, 1);
            this.a.S();
            ard ard = this.b;
            ard.d = this.a;
            ard.c = a2;
            ard.a(true);
            this.c = true;
        }
        ard ard2 = this.b;
        int i2 = ard2.i;
        if (i2 == 0) {
            while (ard2.b.a(aoj2)) {
                aof aof = (aof) aoj2;
                long j = aof.c;
                long j2 = ard2.g;
                ard2.l = j - j2;
                if (!ard2.a(ard2.b.b, j2, ard2.k)) {
                    akh akh = ard2.k.a;
                    ard2.j = akh.w;
                    if (!ard2.n) {
                        ard2.c.a(akh);
                        ard2.n = true;
                    }
                    aqz aqz = ard2.k.b;
                    if (aqz == null) {
                        long j3 = aof.b;
                        if (j3 != -1) {
                            aqy aqy = ard2.b.a;
                            if ((aqy.a & 4) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            ard2.e = new aqt(ard2, ard2.g, j3, (long) (aqy.d + aqy.e), aqy.b, z);
                            i = 2;
                        } else {
                            ard2.e = new arc((byte) 0);
                            i = 2;
                        }
                    } else {
                        i = 2;
                        ard2.e = aqz;
                    }
                    ard2.k = null;
                    ard2.i = i;
                    bky bky = ard2.b.b;
                    byte[] bArr = bky.a;
                    if (bArr.length == 65025) {
                        return 0;
                    }
                    bky.a = Arrays.copyOf(bArr, Math.max(65025, bky.c));
                    return 0;
                }
                ard2.g = aof.c;
            }
            ard2.i = 3;
            return -1;
        } else if (i2 == 1) {
            aoj2.a((int) ard2.g);
            ard2.i = 2;
            return 0;
        } else if (i2 == 2) {
            long a3 = ard2.e.a(aoj2);
            if (a3 >= 0) {
                aop.a = a3;
                return 1;
            }
            if (a3 < -1) {
                ard2.c(-(a3 + 2));
            }
            if (!ard2.m) {
                ard2.d.a(ard2.e.a());
                ard2.m = true;
            }
            if (ard2.l > 0 || ard2.b.a(aoj2)) {
                ard2.l = 0;
                bky bky2 = ard2.b.b;
                long a4 = ard2.a(bky2);
                if (a4 >= 0) {
                    long j4 = ard2.h;
                    if (j4 + a4 >= ard2.f) {
                        long a5 = ard2.a(j4);
                        ard2.c.a(bky2, bky2.c);
                        ard2.c.a(a5, 1, bky2.c, 0, null);
                        ard2.f = -1;
                    }
                }
                ard2.h += a4;
                return 0;
            }
            ard2.i = 3;
            return -1;
        } else {
            throw new IllegalStateException();
        }
    }

    private static bky a(bky bky) {
        bky.c(0);
        return bky;
    }

    public final void a(long j, long j2) {
        ard ard = this.b;
        if (ard != null) {
            aqx aqx = ard.b;
            aqx.a.a();
            aqx.b.a();
            aqx.c = -1;
            aqx.d = false;
            if (j == 0) {
                ard.a(!ard.m);
            } else if (ard.i != 0) {
                long b2 = ard.b(j2);
                ard.f = b2;
                ard.e.a(b2);
                ard.i = 2;
            }
        }
    }

    public final boolean a(aoj aoj) {
        try {
            return b(aoj);
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
    private final boolean b(aoj aoj) {
        aqy aqy = new aqy();
        if (aqy.a(aoj, true) && (aqy.a & 2) == 2) {
            int min = Math.min(aqy.e, 8);
            bky bky = new bky(min);
            aoj.c(bky.a, 0, min);
            bky a2 = a(bky);
            if (a2.b() >= 5 && a2.d() == 127 && a2.h() == 1179402563) {
                this.b = new aqv();
            } else {
                try {
                    if (buh.a(1, a(bky), true)) {
                        this.b = new arg();
                    }
                } catch (ako e) {
                }
                if (ara.b(a(bky))) {
                    this.b = new ara();
                }
            }
            return true;
        }
        return false;
    }
}
