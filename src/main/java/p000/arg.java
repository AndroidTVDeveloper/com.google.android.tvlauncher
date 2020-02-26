package p000;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: arg */
/* compiled from: PG */
final class arg extends ard {

    /* renamed from: a */
    private arf f1969a;

    /* renamed from: o */
    private int f1970o;

    /* renamed from: p */
    private boolean f1971p;

    /* renamed from: q */
    private ari f1972q;

    /* renamed from: r */
    private buh f1973r;

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo1277c(long j) {
        this.f1954h = j;
        int i = 0;
        this.f1971p = j != 0;
        ari ari = this.f1972q;
        if (ari != null) {
            i = ari.f1978d;
        }
        this.f1970o = i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final long mo1269a(bky bky) {
        int i;
        int i2 = 0;
        byte b = bky.f4258a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        arf arf = this.f1969a;
        if (!arf.f1967c[(b >> 1) & (255 >>> (8 - arf.f1968d))].f1974a) {
            i = arf.f1965a.f1978d;
        } else {
            i = arf.f1965a.f1979e;
        }
        if (this.f1971p) {
            i2 = (this.f1970o + i) / 4;
        }
        long j = (long) i2;
        bky.mo2071b(bky.f4260c + 4);
        byte[] bArr = bky.f4258a;
        int i3 = bky.f4260c;
        bArr[i3 - 4] = (byte) ((int) (j & 255));
        bArr[i3 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i3 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr[i3 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.f1971p = true;
        this.f1970o = i;
        return j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: buh.a(int, bky, boolean):boolean
     arg types: [int, bky, int]
     candidates:
      buh.a(android.os.Parcel, int, android.os.Parcelable$Creator):android.os.Parcelable
      buh.a(android.os.Parcel, int, int):void
      buh.a(int, bky, boolean):boolean */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1271a(bky bky, long j, arb arb) {
        int i;
        int i2;
        int i3;
        bky bky2 = bky;
        int i4 = 0;
        if (this.f1969a != null) {
            return false;
        }
        arf arf = null;
        if (this.f1972q == null) {
            buh.m4207a(1, bky2, false);
            bky.mo2082i();
            int d = bky.mo2074d();
            long i5 = bky.mo2082i();
            bky.mo2084k();
            int k = bky.mo2084k();
            bky.mo2084k();
            int d2 = bky.mo2074d();
            double pow = Math.pow(2.0d, (double) (d2 & 15));
            double pow2 = Math.pow(2.0d, (double) ((d2 & 240) >> 4));
            bky.mo2074d();
            this.f1972q = new ari(d, i5, k, (int) pow, (int) pow2, Arrays.copyOf(bky2.f4258a, bky2.f4260c));
        } else if (this.f1973r != null) {
            int i6 = bky2.f4260c;
            byte[] bArr = new byte[i6];
            System.arraycopy(bky2.f4258a, 0, bArr, 0, i6);
            int i7 = this.f1972q.f1975a;
            int i8 = 5;
            buh.m4207a(5, bky2, false);
            int d3 = bky.mo2074d() + 1;
            are are = new are(bky2.f4258a);
            are.mo1280b(bky2.f4259b << 3);
            int i9 = 0;
            while (true) {
                int i10 = 16;
                if (i9 >= d3) {
                    int a = are.mo1278a(6) + 1;
                    int i11 = 0;
                    while (i11 < a) {
                        if (are.mo1278a(16) == 0) {
                            i11++;
                        } else {
                            throw new ako("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int a2 = are.mo1278a(6) + 1;
                    int i12 = 0;
                    while (i12 < a2) {
                        int a3 = are.mo1278a(i10);
                        if (a3 == 0) {
                            are.mo1280b(8);
                            are.mo1280b(16);
                            are.mo1280b(16);
                            are.mo1280b(6);
                            are.mo1280b(8);
                            int a4 = are.mo1278a(4) + 1;
                            for (int i13 = 0; i13 < a4; i13++) {
                                are.mo1280b(8);
                            }
                        } else if (a3 == 1) {
                            int a5 = are.mo1278a(5);
                            int[] iArr = new int[a5];
                            int i14 = -1;
                            for (int i15 = 0; i15 < a5; i15++) {
                                int a6 = are.mo1278a(4);
                                iArr[i15] = a6;
                                if (a6 > i14) {
                                    i14 = a6;
                                }
                            }
                            int i16 = i14 + 1;
                            int[] iArr2 = new int[i16];
                            for (int i17 = 0; i17 < i16; i17++) {
                                iArr2[i17] = are.mo1278a(3) + 1;
                                int a7 = are.mo1278a(2);
                                if (a7 > 0) {
                                    are.mo1280b(8);
                                }
                                for (int i18 = 0; i18 < (1 << a7); i18++) {
                                    are.mo1280b(8);
                                }
                            }
                            are.mo1280b(2);
                            int a8 = are.mo1278a(4);
                            int i19 = 0;
                            int i20 = 0;
                            for (int i21 = 0; i21 < a5; i21++) {
                                i19 += iArr2[iArr[i21]];
                                while (i20 < i19) {
                                    are.mo1280b(a8);
                                    i20++;
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(52);
                            sb.append("floor type greater than 1 not decodable: ");
                            sb.append(a3);
                            throw new ako(sb.toString());
                        }
                        i12++;
                        i10 = 16;
                    }
                    int a9 = are.mo1278a(6) + 1;
                    int i22 = 0;
                    while (i22 < a9) {
                        if (are.mo1278a(16) <= 2) {
                            are.mo1280b(24);
                            are.mo1280b(24);
                            are.mo1280b(24);
                            int a10 = are.mo1278a(6) + 1;
                            are.mo1280b(8);
                            int[] iArr3 = new int[a10];
                            for (int i23 = 0; i23 < a10; i23++) {
                                iArr3[i23] = ((are.mo1279a() ? are.mo1278a(5) : 0) << 3) + are.mo1278a(3);
                            }
                            for (int i24 = 0; i24 < a10; i24++) {
                                for (int i25 = 0; i25 < 8; i25++) {
                                    if ((iArr3[i24] & (1 << i25)) != 0) {
                                        are.mo1280b(8);
                                    }
                                }
                            }
                            i22++;
                        } else {
                            throw new ako("residueType greater than 2 is not decodable");
                        }
                    }
                    int a11 = are.mo1278a(6) + 1;
                    for (int i26 = 0; i26 < a11; i26++) {
                        int a12 = are.mo1278a(16);
                        if (a12 != 0) {
                            StringBuilder sb2 = new StringBuilder(52);
                            sb2.append("mapping type other than 0 not supported: ");
                            sb2.append(a12);
                            Log.e("VorbisUtil", sb2.toString());
                        } else {
                            int a13 = are.mo1279a() ? are.mo1278a(4) + 1 : 1;
                            if (are.mo1279a()) {
                                int a14 = are.mo1278a(8) + 1;
                                for (int i27 = 0; i27 < a14; i27++) {
                                    int i28 = i7 - 1;
                                    are.mo1280b(buh.m4208b(i28));
                                    are.mo1280b(buh.m4208b(i28));
                                }
                            }
                            if (are.mo1278a(2) == 0) {
                                if (a13 > 1) {
                                    for (int i29 = 0; i29 < i7; i29++) {
                                        are.mo1280b(4);
                                    }
                                }
                                for (int i30 = 0; i30 < a13; i30++) {
                                    are.mo1280b(8);
                                    are.mo1280b(8);
                                    are.mo1280b(8);
                                }
                            } else {
                                throw new ako("to reserved bits must be zero after mapping coupling steps");
                            }
                        }
                    }
                    int a15 = are.mo1278a(6) + 1;
                    arh[] arhArr = new arh[a15];
                    for (int i31 = 0; i31 < a15; i31++) {
                        boolean a16 = are.mo1279a();
                        are.mo1278a(16);
                        are.mo1278a(16);
                        are.mo1278a(8);
                        arhArr[i31] = new arh(a16);
                    }
                    if (are.mo1279a()) {
                        arf = new arf(this.f1972q, bArr, arhArr, buh.m4208b(a15 - 1));
                    } else {
                        throw new ako("framing bit after modes not set as expected");
                    }
                } else if (are.mo1278a(24) == 5653314) {
                    int a17 = are.mo1278a(16);
                    int a18 = are.mo1278a(24);
                    long[] jArr = new long[a18];
                    long j2 = 0;
                    if (!are.mo1279a()) {
                        boolean a19 = are.mo1279a();
                        while (i4 < a18) {
                            if (!a19) {
                                i3 = a17;
                                jArr[i4] = (long) (are.mo1278a(i8) + 1);
                            } else {
                                i3 = a17;
                                if (are.mo1279a()) {
                                    jArr[i4] = (long) (are.mo1278a(i8) + 1);
                                } else {
                                    jArr[i4] = 0;
                                }
                            }
                            i4++;
                            a17 = i3;
                        }
                        i2 = a17;
                        i = d3;
                    } else {
                        i2 = a17;
                        int a20 = are.mo1278a(i8) + 1;
                        int i32 = 0;
                        while (i32 < a18) {
                            int a21 = are.mo1278a(buh.m4208b(a18 - i32));
                            int i33 = i32;
                            int i34 = 0;
                            while (i34 < a21 && i33 < a18) {
                                jArr[i33] = (long) a20;
                                i33++;
                                i34++;
                                d3 = d3;
                            }
                            a20++;
                            i32 = i33;
                            d3 = d3;
                        }
                        i = d3;
                    }
                    int a22 = are.mo1278a(4);
                    if (a22 <= 2) {
                        if (a22 == 1 || a22 == 2) {
                            are.mo1280b(32);
                            are.mo1280b(32);
                            int a23 = are.mo1278a(4) + 1;
                            are.mo1280b(1);
                            if (a22 != 1) {
                                j2 = ((long) a18) * ((long) i2);
                            } else {
                                int i35 = i2;
                                if (i35 != 0) {
                                    double d4 = (double) ((long) i35);
                                    Double.isNaN(d4);
                                    j2 = (long) Math.floor(Math.pow((double) ((long) a18), 1.0d / d4));
                                }
                            }
                            are.mo1280b((int) (((long) a23) * j2));
                        }
                        i9++;
                        d3 = i;
                        i4 = 0;
                        i8 = 5;
                    } else {
                        StringBuilder sb3 = new StringBuilder(53);
                        sb3.append("lookup type greater than 2 not decodable: ");
                        sb3.append(a22);
                        throw new ako(sb3.toString());
                    }
                } else {
                    int i36 = are.f1961a;
                    int i37 = are.f1962b;
                    StringBuilder sb4 = new StringBuilder(66);
                    sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                    sb4.append((i36 << 3) + i37);
                    throw new ako(sb4.toString());
                }
            }
        } else {
            buh.m4207a(3, bky2, false);
            bky2.mo2077e((int) bky.mo2082i()).length();
            long i38 = bky.mo2082i();
            String[] strArr = new String[((int) i38)];
            for (int i39 = 0; ((long) i39) < i38; i39++) {
                String e = bky2.mo2077e((int) bky.mo2082i());
                strArr[i39] = e;
                e.length();
            }
            if ((bky.mo2074d() & 1) != 0) {
                this.f1973r = new buh();
            } else {
                throw new ako("framing bit expected to be set");
            }
        }
        this.f1969a = arf;
        if (arf != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.f1969a.f1965a.f1980f);
            arrayList.add(this.f1969a.f1966b);
            ari ari = this.f1969a.f1965a;
            arb.f1946a = akh.m731a((String) null, "audio/vorbis", ari.f1977c, -1, ari.f1975a, (int) ari.f1976b, arrayList, (anq) null, (String) null);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1270a(boolean z) {
        super.mo1270a(z);
        if (z) {
            this.f1969a = null;
            this.f1972q = null;
            this.f1973r = null;
        }
        this.f1970o = 0;
        this.f1971p = false;
    }
}
