package defpackage;

import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: aln  reason: default package */
/* compiled from: PG */
public final class aln {
    private static final int[] a = {1, 2, 3, 6};
    private static final int[] b = {48000, 44100, 32000};
    private static final int[] c = {24000, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static int a() {
        return 1536;
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((byteBuffer.getInt(i + 4) & -16777217) == -1167101192) {
                return i - position;
            }
        }
        return -1;
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            int i5 = iArr2[i3] + (i2 & 1);
            return i5 + i5;
        }
        int i6 = e[i3];
        return i4 == 32000 ? i6 * 6 : i6 << 2;
    }

    public static akh a(bky bky, String str, String str2, anq anq) {
        int i = b[(bky.d() & 192) >> 6];
        int d2 = bky.d();
        int i2 = d[(d2 & 56) >> 3];
        if ((d2 & 4) != 0) {
            i2++;
        }
        return akh.a(str, "audio/ac3", -1, -1, i2, i, (List) null, anq, str2);
    }

    public static alm a(bkx bkx) {
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
        int b2 = bkx.b();
        bkx2.b(40);
        int c2 = bkx2.c(5);
        bkx2.a(b2);
        char c3 = 65535;
        if (c2 == 16) {
            bkx2.b(16);
            int c4 = bkx2.c(2);
            if (c4 == 0) {
                c3 = 0;
            } else if (c4 == 1) {
                c3 = 1;
            } else if (c4 == 2) {
                c3 = 2;
            }
            bkx2.b(3);
            int c5 = bkx2.c(11) + 1;
            int i9 = c5 + c5;
            int c6 = bkx2.c(2);
            if (c6 == 3) {
                i5 = c[bkx2.c(2)];
                i7 = 3;
                i6 = 6;
            } else {
                i7 = bkx2.c(2);
                i6 = a[i7];
                i5 = b[c6];
            }
            int i10 = i6 << 8;
            int c7 = bkx2.c(3);
            boolean e2 = bkx.e();
            int i11 = d[c7] + (e2 ? 1 : 0);
            bkx2.b(10);
            if (bkx.e()) {
                bkx2.b(8);
            }
            if (c7 == 0) {
                bkx2.b(5);
                if (bkx.e()) {
                    bkx2.b(8);
                }
            }
            if (c3 == 1 && bkx.e()) {
                bkx2.b(16);
            }
            if (bkx.e()) {
                if (c7 > 2) {
                    bkx2.b(2);
                }
                if ((c7 & 1) != 0 && c7 > 2) {
                    bkx2.b(6);
                }
                if ((c7 & 4) != 0) {
                    bkx2.b(6);
                }
                if (e2 && bkx.e()) {
                    bkx2.b(5);
                }
                if (c3 == 0) {
                    if (bkx.e()) {
                        bkx2.b(6);
                    }
                    if (c7 == 0 && bkx.e()) {
                        bkx2.b(6);
                    }
                    if (bkx.e()) {
                        bkx2.b(6);
                    }
                    int c8 = bkx2.c(2);
                    if (c8 == 1) {
                        bkx2.b(5);
                    } else if (c8 == 2) {
                        bkx2.b(12);
                    } else if (c8 == 3) {
                        int c9 = bkx2.c(5);
                        if (bkx.e()) {
                            bkx2.b(5);
                            if (bkx.e()) {
                                bkx2.b(4);
                            }
                            if (bkx.e()) {
                                bkx2.b(4);
                            }
                            if (bkx.e()) {
                                bkx2.b(4);
                            }
                            if (bkx.e()) {
                                bkx2.b(4);
                            }
                            if (bkx.e()) {
                                bkx2.b(4);
                            }
                            if (bkx.e()) {
                                bkx2.b(4);
                            }
                            if (bkx.e()) {
                                bkx2.b(4);
                            }
                            if (bkx.e()) {
                                if (bkx.e()) {
                                    bkx2.b(4);
                                }
                                if (bkx.e()) {
                                    bkx2.b(4);
                                }
                            }
                        }
                        if (bkx.e()) {
                            bkx2.b(5);
                            if (bkx.e()) {
                                bkx2.b(7);
                                if (bkx.e()) {
                                    bkx2.b(8);
                                }
                            }
                        }
                        bkx2.b((c9 + 2) << 3);
                        bkx.f();
                    }
                    if (c7 < 2) {
                        if (bkx.e()) {
                            bkx2.b(14);
                        }
                        if (c7 == 0 && bkx.e()) {
                            bkx2.b(14);
                        }
                    }
                    if (bkx.e()) {
                        if (i7 == 0) {
                            bkx2.b(5);
                        } else {
                            for (int i12 = 0; i12 < i6; i12++) {
                                if (bkx.e()) {
                                    bkx2.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (bkx.e()) {
                bkx2.b(5);
                if (c7 == 2) {
                    bkx2.b(4);
                }
                if (c7 >= 6) {
                    bkx2.b(2);
                }
                if (bkx.e()) {
                    bkx2.b(8);
                }
                if (c7 == 0 && bkx.e()) {
                    bkx2.b(8);
                }
                i8 = 3;
                if (c6 < 3) {
                    bkx.d();
                }
            } else {
                i8 = 3;
            }
            if (c3 == 0 && i7 != i8) {
                bkx.d();
            }
            if (c3 == 2 && (i7 == 3 || bkx.e())) {
                bkx2.b(6);
            }
            str = (bkx.e() && bkx2.c(6) == 1 && bkx2.c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i2 = i9;
            i3 = i5;
            i = i10;
            i4 = i11;
        } else {
            bkx2.b(32);
            int c10 = bkx2.c(2);
            if (c10 != 3) {
                str2 = "audio/ac3";
            } else {
                str2 = null;
            }
            int a2 = a(c10, bkx2.c(6));
            bkx2.b(8);
            int c11 = bkx2.c(3);
            if (!((c11 & 1) == 0 || c11 == 1)) {
                bkx2.b(2);
            }
            if ((c11 & 4) != 0) {
                bkx2.b(2);
            }
            if (c11 == 2) {
                bkx2.b(2);
            }
            int[] iArr = b;
            int i13 = c10 < iArr.length ? iArr[c10] : -1;
            str = str2;
            i2 = a2;
            i3 = i13;
            i4 = d[c11] + (bkx.e() ? 1 : 0);
            i = 1536;
        }
        return new alm(str, i4, i3, i2, i);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 255) >> 3) == 16) {
            int i = ((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1;
            return i + i;
        }
        byte b2 = bArr[4];
        return a((b2 & 192) >> 6, b2 & 63);
    }

    public static akh b(bky bky, String str, String str2, anq anq) {
        int i;
        bky.d(2);
        int i2 = b[(bky.d() & 192) >> 6];
        int d2 = bky.d();
        int i3 = d[(d2 & 14) >> 1];
        if ((d2 & 1) != 0) {
            i3++;
        }
        if (((bky.d() & 30) >> 1) > 0 && (2 & bky.d()) != 0) {
            i = i3 + 2;
        } else {
            i = i3;
        }
        return akh.a(str, (bky.b() <= 0 || (bky.d() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc", -1, -1, i, i2, (List) null, anq, str2);
    }

    public static int a(ByteBuffer byteBuffer) {
        int i = 6;
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = a[(byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4];
        }
        return i << 8;
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int b(byte[] bArr) {
        char c2;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111) {
            return 0;
        }
        byte b2 = bArr[7];
        if ((b2 & 254) != 186) {
            return 0;
        }
        if ((b2 & 255) == 187) {
            c2 = 9;
        } else {
            c2 = 8;
        }
        return 40 << ((bArr[c2] >> 4) & 7);
    }
}
