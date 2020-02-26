package p000;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: aln */
/* compiled from: PG */
public final class aln {

    /* renamed from: a */
    private static final int[] f706a = {1, 2, 3, 6};

    /* renamed from: b */
    private static final int[] f707b = {48000, 44100, 32000};

    /* renamed from: c */
    private static final int[] f708c = {24000, 22050, 16000};

    /* renamed from: d */
    private static final int[] f709d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e */
    private static final int[] f710e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f */
    private static final int[] f711f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    /* renamed from: a */
    public static int m1026a() {
        return 1536;
    }

    /* renamed from: b */
    public static int m1033b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    /* renamed from: a */
    private static int m1027a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f707b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f711f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            int i5 = iArr2[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = f710e[i3];
        return i4 == 32000 ? i6 * 6 : i6 << 2;
    }

    /* renamed from: a */
    public static akh m1031a(bky bky, String str, String str2, anq anq) {
        int i = f707b[(bky.mo2074d() & 192) >> 6];
        int d = bky.mo2074d();
        int i2 = f709d[(d & 56) >> 3];
        if ((d & 4) != 0) {
            i2++;
        }
        return akh.m731a(str, "audio/ac3", -1, -1, i2, i, (List) null, anq, str2);
    }

    /* renamed from: a */
    public static alm m1032a(bkx bkx) {
        int i;
        int i2;
        int i3;
        int i4;
        String str;
        String str2;
        int i5;
        int i6;
        int i7;
        int i8;
        bkx bkx2 = bkx;
        int b = bkx.mo2053b();
        bkx2.mo2054b(40);
        int c = bkx2.mo2057c(5);
        bkx2.mo2050a(b);
        char c2 = 65535;
        if (c == 16) {
            bkx2.mo2054b(16);
            int c3 = bkx2.mo2057c(2);
            if (c3 == 0) {
                c2 = 0;
            } else if (c3 == 1) {
                c2 = 1;
            } else if (c3 == 2) {
                c2 = 2;
            }
            bkx2.mo2054b(3);
            int c4 = bkx2.mo2057c(11) + 1;
            int i9 = c4 + c4;
            int c5 = bkx2.mo2057c(2);
            if (c5 == 3) {
                i5 = f708c[bkx2.mo2057c(2)];
                i7 = 3;
                i6 = 6;
            } else {
                i7 = bkx2.mo2057c(2);
                i6 = f706a[i7];
                i5 = f707b[c5];
            }
            int i10 = i6 << 8;
            int c6 = bkx2.mo2057c(3);
            boolean e = bkx.mo2060e();
            int i11 = f709d[c6] + (e ? 1 : 0);
            bkx2.mo2054b(10);
            if (bkx.mo2060e()) {
                bkx2.mo2054b(8);
            }
            if (c6 == 0) {
                bkx2.mo2054b(5);
                if (bkx.mo2060e()) {
                    bkx2.mo2054b(8);
                }
            }
            if (c2 == 1 && bkx.mo2060e()) {
                bkx2.mo2054b(16);
            }
            if (bkx.mo2060e()) {
                if (c6 > 2) {
                    bkx2.mo2054b(2);
                }
                if ((c6 & 1) != 0 && c6 > 2) {
                    bkx2.mo2054b(6);
                }
                if ((c6 & 4) != 0) {
                    bkx2.mo2054b(6);
                }
                if (e && bkx.mo2060e()) {
                    bkx2.mo2054b(5);
                }
                if (c2 == 0) {
                    if (bkx.mo2060e()) {
                        bkx2.mo2054b(6);
                    }
                    if (c6 == 0 && bkx.mo2060e()) {
                        bkx2.mo2054b(6);
                    }
                    if (bkx.mo2060e()) {
                        bkx2.mo2054b(6);
                    }
                    int c7 = bkx2.mo2057c(2);
                    if (c7 == 1) {
                        bkx2.mo2054b(5);
                    } else if (c7 == 2) {
                        bkx2.mo2054b(12);
                    } else if (c7 == 3) {
                        int c8 = bkx2.mo2057c(5);
                        if (bkx.mo2060e()) {
                            bkx2.mo2054b(5);
                            if (bkx.mo2060e()) {
                                bkx2.mo2054b(4);
                            }
                            if (bkx.mo2060e()) {
                                bkx2.mo2054b(4);
                            }
                            if (bkx.mo2060e()) {
                                bkx2.mo2054b(4);
                            }
                            if (bkx.mo2060e()) {
                                bkx2.mo2054b(4);
                            }
                            if (bkx.mo2060e()) {
                                bkx2.mo2054b(4);
                            }
                            if (bkx.mo2060e()) {
                                bkx2.mo2054b(4);
                            }
                            if (bkx.mo2060e()) {
                                bkx2.mo2054b(4);
                            }
                            if (bkx.mo2060e()) {
                                if (bkx.mo2060e()) {
                                    bkx2.mo2054b(4);
                                }
                                if (bkx.mo2060e()) {
                                    bkx2.mo2054b(4);
                                }
                            }
                        }
                        if (bkx.mo2060e()) {
                            bkx2.mo2054b(5);
                            if (bkx.mo2060e()) {
                                bkx2.mo2054b(7);
                                if (bkx.mo2060e()) {
                                    bkx2.mo2054b(8);
                                }
                            }
                        }
                        bkx2.mo2054b((c8 + 2) << 3);
                        bkx.mo2061f();
                    }
                    if (c6 < 2) {
                        if (bkx.mo2060e()) {
                            bkx2.mo2054b(14);
                        }
                        if (c6 == 0 && bkx.mo2060e()) {
                            bkx2.mo2054b(14);
                        }
                    }
                    if (bkx.mo2060e()) {
                        if (i7 == 0) {
                            bkx2.mo2054b(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (bkx.mo2060e()) {
                                    bkx2.mo2054b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (bkx.mo2060e()) {
                bkx2.mo2054b(5);
                if (c6 == 2) {
                    bkx2.mo2054b(4);
                }
                if (c6 >= 6) {
                    bkx2.mo2054b(2);
                }
                if (bkx.mo2060e()) {
                    bkx2.mo2054b(8);
                }
                if (c6 == 0 && bkx.mo2060e()) {
                    bkx2.mo2054b(8);
                }
                i8 = 3;
                if (c5 < 3) {
                    bkx.mo2059d();
                }
            } else {
                i8 = 3;
            }
            if (c2 == 0 && i7 != i8) {
                bkx.mo2059d();
            }
            if (c2 == 2 && (i7 == 3 || bkx.mo2060e())) {
                bkx2.mo2054b(6);
            }
            str = (bkx.mo2060e() && bkx2.mo2057c(6) == 1 && bkx2.mo2057c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i9;
            i3 = i5;
            i = i10;
            i4 = i11;
        } else {
            bkx2.mo2054b(32);
            int c9 = bkx2.mo2057c(2);
            if (c9 != 3) {
                str2 = "audio/ac3";
            } else {
                str2 = null;
            }
            int a = m1027a(c9, bkx2.mo2057c(6));
            bkx2.mo2054b(8);
            int c10 = bkx2.mo2057c(3);
            if (!((c10 & 1) == 0 || c10 == 1)) {
                bkx2.mo2054b(2);
            }
            if ((c10 & 4) != 0) {
                bkx2.mo2054b(2);
            }
            if (c10 == 2) {
                bkx2.mo2054b(2);
            }
            int[] iArr = f707b;
            int i13 = c9 < iArr.length ? iArr[c9] : -1;
            str = str2;
            i2 = a;
            i3 = i13;
            i4 = f709d[c10] + (bkx.mo2060e() ? 1 : 0);
            i = 1536;
        }
        return new alm(str, i4, i3, i2, i);
    }

    /* renamed from: a */
    public static int m1030a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 255) >> 3) == 16) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b = bArr[4];
        return m1027a((b & 192) >> 6, b & 63);
    }

    /* renamed from: b */
    public static akh m1035b(bky bky, String str, String str2, anq anq) {
        int i;
        bky.mo2075d(2);
        int i2 = f707b[(bky.mo2074d() & 192) >> 6];
        int d = bky.mo2074d();
        int i3 = f709d[(d & 14) >> 1];
        if ((d & 1) != 0) {
            i3++;
        }
        if (((bky.mo2074d() & 30) >> 1) > 0 && (2 & bky.mo2074d()) != 0) {
            i = i3 + 2;
        } else {
            i = i3;
        }
        return akh.m731a(str, (bky.mo2070b() <= 0 || (bky.mo2074d() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", -1, -1, i, i2, (List) null, anq, str2);
    }

    /* renamed from: a */
    public static int m1028a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = f706a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i << 8;
    }

    /* renamed from: a */
    public static int m1029a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    /* renamed from: b */
    public static int m1034b(byte[] bArr) {
        char c;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111) {
            return 0;
        }
        byte b = bArr[7];
        if ((b & 254) != 186) {
            return 0;
        }
        if ((b & 255) == 187) {
            c = 9;
        } else {
            c = 8;
        }
        return 40 << ((bArr[c] >> 4) & 7);
    }
}
