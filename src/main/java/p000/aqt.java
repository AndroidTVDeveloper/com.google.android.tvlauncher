package p000;

import java.io.EOFException;
import java.io.IOException;

/* renamed from: aqt */
/* compiled from: PG */
final class aqt implements aqz {

    /* renamed from: a */
    public final long f1908a;

    /* renamed from: b */
    public final long f1909b;

    /* renamed from: c */
    public final ard f1910c;

    /* renamed from: d */
    public long f1911d;

    /* renamed from: e */
    private final aqy f1912e = new aqy();

    /* renamed from: f */
    private int f1913f;

    /* renamed from: g */
    private long f1914g;

    /* renamed from: h */
    private long f1915h;

    /* renamed from: i */
    private long f1916i;

    /* renamed from: j */
    private long f1917j;

    /* renamed from: k */
    private long f1918k;

    /* renamed from: l */
    private long f1919l;

    public aqt(ard ard, long j, long j2, long j3, long j4, boolean z) {
        boolean z2;
        if (j < 0 || j2 <= j) {
            z2 = false;
        } else {
            z2 = true;
        }
        bks.m3510a(z2);
        this.f1910c = ard;
        this.f1908a = j;
        this.f1909b = j2;
        if (j3 == j2 - j || z) {
            this.f1911d = j4;
            this.f1913f = 4;
            return;
        }
        this.f1913f = 0;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aos mo1267a() {
        if (this.f1911d != 0) {
            return new aqs(this);
        }
        return null;
    }

    /* renamed from: a */
    public final long mo1266a(aoj aoj) {
        aoj aoj2;
        aqy aqy;
        long j;
        aoj aoj3 = aoj;
        int i = this.f1913f;
        if (i == 0) {
            aoj2 = aoj3;
            long j2 = ((aof) aoj2).f1490c;
            this.f1914g = j2;
            this.f1913f = 1;
            long j3 = this.f1909b - 65307;
            if (j3 > j2) {
                return j3;
            }
        } else if (i != 1) {
            long j4 = -1;
            if (i == 2) {
                long j5 = this.f1916i;
                long j6 = this.f1917j;
                if (j5 != j6) {
                    aof aof = (aof) aoj3;
                    long j7 = aof.f1490c;
                    if (m1836a(aoj3, j6)) {
                        this.f1912e.mo1274a(aoj3, false);
                        aoj.mo1191a();
                        long j8 = this.f1915h;
                        aqy aqy2 = this.f1912e;
                        long j9 = aqy2.f1936b;
                        long j10 = j8 - j9;
                        int i2 = aqy2.f1938d + aqy2.f1939e;
                        if (j10 < 0 || j10 >= 72000) {
                            if (j10 >= 0) {
                                this.f1916i = aof.f1490c + ((long) i2);
                                this.f1918k = j9;
                            } else {
                                this.f1917j = j7;
                                this.f1919l = j9;
                            }
                            long j11 = this.f1917j;
                            long j12 = this.f1916i;
                            long j13 = j11 - j12;
                            if (j13 >= 100000) {
                                long j14 = (long) i2;
                                if (j10 <= 0) {
                                    j = 2;
                                } else {
                                    j = 1;
                                }
                                j4 = blm.m3632a((aof.f1490c - (j14 * j)) + ((j10 * j13) / (this.f1919l - this.f1918k)), j12, j11 - 1);
                            } else {
                                this.f1917j = j12;
                                j4 = j12;
                            }
                        }
                    } else {
                        j4 = this.f1916i;
                        if (j4 == j7) {
                            throw new IOException("No ogg page can be found.");
                        }
                    }
                } else {
                    j4 = -1;
                }
                if (j4 != -1) {
                    return j4;
                }
                this.f1913f = 3;
            } else if (i != 3) {
                return -1;
            }
            aoj aoj4 = aoj;
            this.f1912e.mo1274a(aoj4, false);
            while (true) {
                aqy aqy3 = this.f1912e;
                if (aqy3.f1936b <= this.f1915h) {
                    aoj4.mo1192a(aqy3.f1938d + aqy3.f1939e);
                    this.f1916i = ((aof) aoj4).f1490c;
                    aqy aqy4 = this.f1912e;
                    this.f1918k = aqy4.f1936b;
                    aqy4.mo1274a(aoj4, false);
                } else {
                    aoj.mo1191a();
                    this.f1913f = 4;
                    return -(this.f1918k + 2);
                }
            }
        } else {
            aoj2 = aoj3;
        }
        if (m1836a(aoj2, this.f1909b)) {
            this.f1912e.mo1273a();
            while (true) {
                aqy = this.f1912e;
                if ((aqy.f1935a & 4) == 4 || ((aof) aoj2).f1490c >= this.f1909b) {
                    this.f1911d = aqy.f1936b;
                    this.f1913f = 4;
                } else {
                    aqy.mo1274a(aoj2, false);
                    aqy aqy5 = this.f1912e;
                    aoj2.mo1192a(aqy5.f1938d + aqy5.f1939e);
                }
            }
            this.f1911d = aqy.f1936b;
            this.f1913f = 4;
            return this.f1914g;
        }
        throw new EOFException();
    }

    /* renamed from: a */
    private final boolean m1836a(aoj aoj, long j) {
        int i;
        long min = Math.min(j + 3, this.f1909b);
        int i2 = 2048;
        byte[] bArr = new byte[2048];
        while (true) {
            long j2 = ((aof) aoj).f1490c;
            int i3 = 0;
            if (((long) i2) + j2 <= min || (i2 = (int) (min - j2)) >= 4) {
                aoj.mo1197b(bArr, 0, i2, false);
                while (true) {
                    i = i2 - 3;
                    if (i3 >= i) {
                        break;
                    } else if (bArr[i3] == 79 && bArr[i3 + 1] == 103 && bArr[i3 + 2] == 103 && bArr[i3 + 3] == 83) {
                        aoj.mo1192a(i3);
                        return true;
                    } else {
                        i3++;
                    }
                }
            } else {
                return false;
            }
            aoj.mo1192a(i);
        }
    }

    /* renamed from: a */
    public final void mo1268a(long j) {
        this.f1915h = blm.m3632a(j, 0, this.f1911d - 1);
        this.f1913f = 2;
        this.f1916i = this.f1908a;
        this.f1917j = this.f1909b;
        this.f1918k = 0;
        this.f1919l = this.f1911d;
    }
}
