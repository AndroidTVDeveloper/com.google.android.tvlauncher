package defpackage;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: aqt  reason: default package */
/* compiled from: PG */
final class aqt implements aqz {
    public final long a;
    public final long b;
    public final ard c;
    public long d;
    private final aqy e = new aqy();
    private int f;
    private long g;
    private long h;
    private long i;
    private long j;
    private long k;
    private long l;

    public aqt(ard ard, long j2, long j3, long j4, long j5, boolean z) {
        boolean z2;
        if (j2 < 0 || j3 <= j2) {
            z2 = false;
        } else {
            z2 = true;
        }
        bks.a(z2);
        this.c = ard;
        this.a = j2;
        this.b = j3;
        if (j4 == j3 - j2 || z) {
            this.d = j5;
            this.f = 4;
            return;
        }
        this.f = 0;
    }

    public final /* bridge */ /* synthetic */ aos a() {
        if (this.d != 0) {
            return new aqs(this);
        }
        return null;
    }

    public final long a(aoj aoj) {
        aoj aoj2;
        aqy aqy;
        long j2;
        aoj aoj3 = aoj;
        int i2 = this.f;
        if (i2 == 0) {
            aoj2 = aoj3;
            long j3 = ((aof) aoj2).c;
            this.g = j3;
            this.f = 1;
            long j4 = this.b - 65307;
            if (j4 > j3) {
                return j4;
            }
        } else if (i2 != 1) {
            long j5 = -1;
            if (i2 == 2) {
                long j6 = this.i;
                long j7 = this.j;
                if (j6 != j7) {
                    aof aof = (aof) aoj3;
                    long j8 = aof.c;
                    if (a(aoj3, j7)) {
                        this.e.a(aoj3, false);
                        aoj.a();
                        long j9 = this.h;
                        aqy aqy2 = this.e;
                        long j10 = aqy2.b;
                        long j11 = j9 - j10;
                        int i3 = aqy2.d + aqy2.e;
                        if (j11 < 0 || j11 >= 72000) {
                            if (j11 >= 0) {
                                this.i = aof.c + ((long) i3);
                                this.k = j10;
                            } else {
                                this.j = j8;
                                this.l = j10;
                            }
                            long j12 = this.j;
                            long j13 = this.i;
                            long j14 = j12 - j13;
                            if (j14 >= 100000) {
                                long j15 = (long) i3;
                                if (j11 <= 0) {
                                    j2 = 2;
                                } else {
                                    j2 = 1;
                                }
                                j5 = blm.a((aof.c - (j15 * j2)) + ((j11 * j14) / (this.l - this.k)), j13, j12 - 1);
                            } else {
                                this.j = j13;
                                j5 = j13;
                            }
                        }
                    } else {
                        j5 = this.i;
                        if (j5 == j8) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                } else {
                    j5 = -1;
                }
                if (j5 != -1) {
                    return j5;
                }
                this.f = 3;
            } else if (i2 != 3) {
                return -1;
            }
            aoj aoj4 = aoj;
            this.e.a(aoj4, false);
            while (true) {
                aqy aqy3 = this.e;
                if (aqy3.b <= this.h) {
                    aoj4.a(aqy3.d + aqy3.e);
                    this.i = ((aof) aoj4).c;
                    aqy aqy4 = this.e;
                    this.k = aqy4.b;
                    aqy4.a(aoj4, false);
                } else {
                    aoj.a();
                    this.f = 4;
                    return -(this.k + 2);
                }
            }
        } else {
            aoj2 = aoj3;
        }
        if (a(aoj2, this.b)) {
            this.e.a();
            while (true) {
                aqy = this.e;
                if ((aqy.a & 4) == 4 || ((aof) aoj2).c >= this.b) {
                    this.d = aqy.b;
                    this.f = 4;
                } else {
                    aqy.a(aoj2, false);
                    aqy aqy5 = this.e;
                    aoj2.a(aqy5.d + aqy5.e);
                }
            }
            this.d = aqy.b;
            this.f = 4;
            return this.g;
        }
        throw new EOFException();
    }

    private final boolean a(aoj aoj, long j2) {
        int i2;
        long min = Math.min(j2 + 3, this.b);
        int i3 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j3 = ((aof) aoj).c;
            int i4 = 0;
            if (((long) i3) + j3 <= min || (i3 = (int) (min - j3)) >= 4) {
                aoj.b(bArr, 0, i3, false);
                while (true) {
                    i2 = i3 - 3;
                    if (i4 >= i2) {
                        break;
                    } else if (bArr[i4] == 79 && bArr[i4 + 1] == 103 && bArr[i4 + 2] == 103 && bArr[i4 + 3] == 83) {
                        aoj.a(i4);
                        return true;
                    } else {
                        i4++;
                    }
                }
            } else {
                return false;
            }
            aoj.a(i2);
        }
    }

    public final void a(long j2) {
        this.h = blm.a(j2, 0, this.d - 1);
        this.f = 2;
        this.i = this.a;
        this.j = this.b;
        this.k = 0;
        this.l = this.d;
    }
}
