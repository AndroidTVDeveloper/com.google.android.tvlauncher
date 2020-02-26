package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;

/* renamed from: arg  reason: default package */
/* compiled from: PG */
final class arg extends ard {
    private arf a;
    private int o;
    private boolean p;
    private ari q;
    private buh r;

    /* access modifiers changed from: protected */
    public final void c(long j) {
        this.h = j;
        int i = 0;
        this.p = j != 0;
        ari ari = this.q;
        if (ari != null) {
            i = ari.d;
        }
        this.o = i;
    }

    /* access modifiers changed from: protected */
    public final long a(bky bky) {
        int i;
        int i2 = 0;
        byte b = bky.a[0];
        if ((b & 1) == 1) {
            return -1;
        }
        arf arf = this.a;
        if (!arf.c[(b >> 1) & (255 >>> (8 - arf.d))].a) {
            i = arf.a.d;
        } else {
            i = arf.a.e;
        }
        if (this.p) {
            i2 = (this.o + i) / 4;
        }
        long j = (long) i2;
        bky.b(bky.c + 4);
        byte[] bArr = bky.a;
        int i3 = bky.c;
        bArr[i3 - 4] = (byte) ((int) (j & 255));
        bArr[i3 - 3] = (byte) ((int) ((j >>> 8) & 255));
        bArr[i3 - 2] = (byte) ((int) ((j >>> 16) & 255));
        bArr[i3 - 1] = (byte) ((int) ((j >>> 24) & 255));
        this.p = true;
        this.o = i;
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
    public final boolean a(bky bky, long j, arb arb) {
        int i;
        int i2;
        int i3;
        bky bky2 = bky;
        int i4 = 0;
        if (this.a != null) {
            return false;
        }
        arf arf = null;
        if (this.q == null) {
            buh.a(1, bky2, false);
            bky.i();
            int d = bky.d();
            long i5 = bky.i();
            bky.k();
            int k = bky.k();
            bky.k();
            int d2 = bky.d();
            double pow = Math.pow(2.0d, (double) (d2 & 15));
            double pow2 = Math.pow(2.0d, (double) ((d2 & 240) >> 4));
            bky.d();
            this.q = new ari(d, i5, k, (int) pow, (int) pow2, Arrays.copyOf(bky2.a, bky2.c));
        } else if (this.r != null) {
            int i6 = bky2.c;
            byte[] bArr = new byte[i6];
            System.arraycopy(bky2.a, 0, bArr, 0, i6);
            int i7 = this.q.a;
            int i8 = 5;
            buh.a(5, bky2, false);
            int d3 = bky.d() + 1;
            are are = new are(bky2.a);
            are.b(bky2.b << 3);
            int i9 = 0;
            while (true) {
                int i10 = 16;
                if (i9 >= d3) {
                    int a2 = are.a(6) + 1;
                    int i11 = 0;
                    while (i11 < a2) {
                        if (are.a(16) == 0) {
                            i11++;
                        } else {
                            throw new ako("placeholder of time domain transforms not zeroed out");
                        }
                    }
                    int a3 = are.a(6) + 1;
                    int i12 = 0;
                    while (i12 < a3) {
                        int a4 = are.a(i10);
                        if (a4 == 0) {
                            are.b(8);
                            are.b(16);
                            are.b(16);
                            are.b(6);
                            are.b(8);
                            int a5 = are.a(4) + 1;
                            for (int i13 = 0; i13 < a5; i13++) {
                                are.b(8);
                            }
                        } else if (a4 == 1) {
                            int a6 = are.a(5);
                            int[] iArr = new int[a6];
                            int i14 = -1;
                            for (int i15 = 0; i15 < a6; i15++) {
                                int a7 = are.a(4);
                                iArr[i15] = a7;
                                if (a7 > i14) {
                                    i14 = a7;
                                }
                            }
                            int i16 = i14 + 1;
                            int[] iArr2 = new int[i16];
                            for (int i17 = 0; i17 < i16; i17++) {
                                iArr2[i17] = are.a(3) + 1;
                                int a8 = are.a(2);
                                if (a8 > 0) {
                                    are.b(8);
                                }
                                for (int i18 = 0; i18 < (1 << a8); i18++) {
                                    are.b(8);
                                }
                            }
                            are.b(2);
                            int a9 = are.a(4);
                            int i19 = 0;
                            int i20 = 0;
                            for (int i21 = 0; i21 < a6; i21++) {
                                i19 += iArr2[iArr[i21]];
                                while (i20 < i19) {
                                    are.b(a9);
                                    i20++;
                                }
                            }
                        } else {
                            StringBuilder sb = new StringBuilder(52);
                            sb.append("floor type greater than 1 not decodable: ");
                            sb.append(a4);
                            throw new ako(sb.toString());
                        }
                        i12++;
                        i10 = 16;
                    }
                    int a10 = are.a(6) + 1;
                    int i22 = 0;
                    while (i22 < a10) {
                        if (are.a(16) <= 2) {
                            are.b(24);
                            are.b(24);
                            are.b(24);
                            int a11 = are.a(6) + 1;
                            are.b(8);
                            int[] iArr3 = new int[a11];
                            for (int i23 = 0; i23 < a11; i23++) {
                                iArr3[i23] = ((are.a() ? are.a(5) : 0) << 3) + are.a(3);
                            }
                            for (int i24 = 0; i24 < a11; i24++) {
                                for (int i25 = 0; i25 < 8; i25++) {
                                    if ((iArr3[i24] & (1 << i25)) != 0) {
                                        are.b(8);
                                    }
                                }
                            }
                            i22++;
                        } else {
                            throw new ako("residueType greater than 2 is not decodable");
                        }
                    }
                    int a12 = are.a(6) + 1;
                    for (int i26 = 0; i26 < a12; i26++) {
                        int a13 = are.a(16);
                        if (a13 != 0) {
                            StringBuilder sb2 = new StringBuilder(52);
                            sb2.append("mapping type other than 0 not supported: ");
                            sb2.append(a13);
                            Log.e("VorbisUtil", sb2.toString());
                        } else {
                            int a14 = are.a() ? are.a(4) + 1 : 1;
                            if (are.a()) {
                                int a15 = are.a(8) + 1;
                                for (int i27 = 0; i27 < a15; i27++) {
                                    int i28 = i7 - 1;
                                    are.b(buh.b(i28));
                                    are.b(buh.b(i28));
                                }
                            }
                            if (are.a(2) == 0) {
                                if (a14 > 1) {
                                    for (int i29 = 0; i29 < i7; i29++) {
                                        are.b(4);
                                    }
                                }
                                for (int i30 = 0; i30 < a14; i30++) {
                                    are.b(8);
                                    are.b(8);
                                    are.b(8);
                                }
                            } else {
                                throw new ako("to reserved bits must be zero after mapping coupling steps");
                            }
                        }
                    }
                    int a16 = are.a(6) + 1;
                    arh[] arhArr = new arh[a16];
                    for (int i31 = 0; i31 < a16; i31++) {
                        boolean a17 = are.a();
                        are.a(16);
                        are.a(16);
                        are.a(8);
                        arhArr[i31] = new arh(a17);
                    }
                    if (are.a()) {
                        arf = new arf(this.q, bArr, arhArr, buh.b(a16 - 1));
                    } else {
                        throw new ako("framing bit after modes not set as expected");
                    }
                } else if (are.a(24) == 5653314) {
                    int a18 = are.a(16);
                    int a19 = are.a(24);
                    long[] jArr = new long[a19];
                    long j2 = 0;
                    if (!are.a()) {
                        boolean a20 = are.a();
                        while (i4 < a19) {
                            if (!a20) {
                                i3 = a18;
                                jArr[i4] = (long) (are.a(i8) + 1);
                            } else {
                                i3 = a18;
                                if (are.a()) {
                                    jArr[i4] = (long) (are.a(i8) + 1);
                                } else {
                                    jArr[i4] = 0;
                                }
                            }
                            i4++;
                            a18 = i3;
                        }
                        i2 = a18;
                        i = d3;
                    } else {
                        i2 = a18;
                        int a21 = are.a(i8) + 1;
                        int i32 = 0;
                        while (i32 < a19) {
                            int a22 = are.a(buh.b(a19 - i32));
                            int i33 = i32;
                            int i34 = 0;
                            while (i34 < a22 && i33 < a19) {
                                jArr[i33] = (long) a21;
                                i33++;
                                i34++;
                                d3 = d3;
                            }
                            a21++;
                            i32 = i33;
                            d3 = d3;
                        }
                        i = d3;
                    }
                    int a23 = are.a(4);
                    if (a23 <= 2) {
                        if (a23 == 1 || a23 == 2) {
                            are.b(32);
                            are.b(32);
                            int a24 = are.a(4) + 1;
                            are.b(1);
                            if (a23 != 1) {
                                j2 = ((long) a19) * ((long) i2);
                            } else {
                                int i35 = i2;
                                if (i35 != 0) {
                                    double d4 = (double) ((long) i35);
                                    Double.isNaN(d4);
                                    j2 = (long) Math.floor(Math.pow((double) ((long) a19), 1.0d / d4));
                                }
                            }
                            are.b((int) (((long) a24) * j2));
                        }
                        i9++;
                        d3 = i;
                        i4 = 0;
                        i8 = 5;
                    } else {
                        StringBuilder sb3 = new StringBuilder(53);
                        sb3.append("lookup type greater than 2 not decodable: ");
                        sb3.append(a23);
                        throw new ako(sb3.toString());
                    }
                } else {
                    int i36 = are.a;
                    int i37 = are.b;
                    StringBuilder sb4 = new StringBuilder(66);
                    sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                    sb4.append((i36 << 3) + i37);
                    throw new ako(sb4.toString());
                }
            }
        } else {
            buh.a(3, bky2, false);
            bky2.e((int) bky.i()).length();
            long i38 = bky.i();
            String[] strArr = new String[((int) i38)];
            for (int i39 = 0; ((long) i39) < i38; i39++) {
                String e = bky2.e((int) bky.i());
                strArr[i39] = e;
                e.length();
            }
            if ((bky.d() & 1) != 0) {
                this.r = new buh();
            } else {
                throw new ako("framing bit expected to be set");
            }
        }
        this.a = arf;
        if (arf != null) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(this.a.a.f);
            arrayList.add(this.a.b);
            ari ari = this.a.a;
            arb.a = akh.a((String) null, "audio/vorbis", ari.c, -1, ari.a, (int) ari.b, arrayList, (anq) null, (String) null);
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public final void a(boolean z) {
        super.a(z);
        if (z) {
            this.a = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
