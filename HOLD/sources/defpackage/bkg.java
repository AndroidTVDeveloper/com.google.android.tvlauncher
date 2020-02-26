package defpackage;

import android.util.Pair;

/* renamed from: bkg  reason: default package */
/* compiled from: PG */
public final class bkg {
    public static final byte[] a = {0, 0, 0, 1};
    private static final int[] b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};
    private static final int[] c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static byte[] b(int i, int i2) {
        return new byte[]{(byte) (((i >> 1) & 7) | 16), (byte) (((i << 7) & 128) | ((i2 << 3) & 120))};
    }

    public static byte[] a(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = b;
            if (i4 >= iArr.length) {
                break;
            }
            if (i == iArr[i4]) {
                i5 = i4;
            }
            i4++;
        }
        int i6 = -1;
        while (true) {
            int[] iArr2 = c;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return b(i5, i6);
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Invalid sample rate or number of channels: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    public static String a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    private static int a(bkx bkx) {
        int c2 = bkx.c(5);
        return c2 == 31 ? bkx.c(6) + 32 : c2;
    }

    private static int b(bkx bkx) {
        boolean z;
        int c2 = bkx.c(4);
        if (c2 == 15) {
            return bkx.c(24);
        }
        if (c2 < 13) {
            z = true;
        } else {
            z = false;
        }
        bks.a(z);
        return b[c2];
    }

    public static boolean a(byte[] bArr, int i) {
        if (bArr.length - i <= a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    public static Pair a(bkx bkx, boolean z) {
        int a2 = a(bkx);
        int b2 = b(bkx);
        int c2 = bkx.c(4);
        if (a2 == 5 || a2 == 29) {
            b2 = b(bkx);
            a2 = a(bkx);
            if (a2 == 22) {
                c2 = bkx.c(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(a2 == 1 || a2 == 2 || a2 == 3 || a2 == 4 || a2 == 6 || a2 == 7 || a2 == 17)) {
                switch (a2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(a2);
                        throw new ako(sb.toString());
                }
            }
            bkx.b(1);
            if (bkx.e()) {
                bkx.b(14);
            }
            boolean e = bkx.e();
            if (c2 != 0) {
                if (a2 == 6 || a2 == 20) {
                    bkx.b(3);
                }
                if (e) {
                    if (a2 == 22) {
                        bkx.b(16);
                    }
                    if (a2 == 17 || a2 == 19 || a2 == 20 || a2 == 23) {
                        bkx.b(3);
                    }
                    bkx.b(1);
                }
                switch (a2) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int c3 = bkx.c(2);
                        if (c3 == 2 || c3 == 3) {
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Unsupported epConfig: ");
                            sb2.append(c3);
                            throw new ako(sb2.toString());
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i = c[c2];
        if (i == -1) {
            z2 = false;
        }
        bks.a(z2);
        return Pair.create(Integer.valueOf(b2), Integer.valueOf(i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkg.a(bkx, boolean):android.util.Pair
     arg types: [bkx, int]
     candidates:
      bkg.a(byte[], int):boolean
      bkg.a(int, int):byte[]
      bkg.a(bkx, boolean):android.util.Pair */
    public static Pair a(byte[] bArr) {
        return a(new bkx(bArr), false);
    }
}
