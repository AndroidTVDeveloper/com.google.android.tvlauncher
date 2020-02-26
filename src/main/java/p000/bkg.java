package p000;

import android.util.Pair;

/* renamed from: bkg */
/* compiled from: PG */
public final class bkg {

    /* renamed from: a */
    public static final byte[] f4207a = {0, 0, 0, 1};

    /* renamed from: b */
    private static final int[] f4208b = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: c */
    private static final int[] f4209c = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: b */
    public static byte[] m3485b(int i, int i2) {
        return new byte[]{(byte) (((i >> 1) & 7) | 16), (byte) (((i << 7) & 128) | ((i2 << 3) & 120))};
    }

    /* renamed from: a */
    public static byte[] m3483a(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (true) {
            int[] iArr = f4208b;
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
            int[] iArr2 = f4209c;
            if (i3 >= iArr2.length) {
                break;
            }
            if (i2 == iArr2[i3]) {
                i6 = i3;
            }
            i3++;
        }
        if (i != -1 && i6 != -1) {
            return m3485b(i5, i6);
        }
        StringBuilder sb = new StringBuilder(67);
        sb.append("Invalid sample rate or number of channels: ");
        sb.append(i);
        sb.append(", ");
        sb.append(i2);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static String m3481a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* renamed from: a */
    private static int m3478a(bkx bkx) {
        int c = bkx.mo2057c(5);
        return c == 31 ? bkx.mo2057c(6) + 32 : c;
    }

    /* renamed from: b */
    private static int m3484b(bkx bkx) {
        boolean z;
        int c = bkx.mo2057c(4);
        if (c == 15) {
            return bkx.mo2057c(24);
        }
        if (c < 13) {
            z = true;
        } else {
            z = false;
        }
        bks.m3510a(z);
        return f4208b[c];
    }

    /* renamed from: a */
    public static boolean m3482a(byte[] bArr, int i) {
        if (bArr.length - i <= f4207a.length) {
            return false;
        }
        int i2 = 0;
        while (true) {
            byte[] bArr2 = f4207a;
            if (i2 >= bArr2.length) {
                return true;
            }
            if (bArr[i + i2] != bArr2[i2]) {
                return false;
            }
            i2++;
        }
    }

    /* renamed from: a */
    public static Pair m3479a(bkx bkx, boolean z) {
        int a = m3478a(bkx);
        int b = m3484b(bkx);
        int c = bkx.mo2057c(4);
        if (a == 5 || a == 29) {
            b = m3484b(bkx);
            a = m3478a(bkx);
            if (a == 22) {
                c = bkx.mo2057c(4);
            }
        }
        boolean z2 = true;
        if (z) {
            if (!(a == 1 || a == 2 || a == 3 || a == 4 || a == 6 || a == 7 || a == 17)) {
                switch (a) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        StringBuilder sb = new StringBuilder(42);
                        sb.append("Unsupported audio object type: ");
                        sb.append(a);
                        throw new ako(sb.toString());
                }
            }
            bkx.mo2054b(1);
            if (bkx.mo2060e()) {
                bkx.mo2054b(14);
            }
            boolean e = bkx.mo2060e();
            if (c != 0) {
                if (a == 6 || a == 20) {
                    bkx.mo2054b(3);
                }
                if (e) {
                    if (a == 22) {
                        bkx.mo2054b(16);
                    }
                    if (a == 17 || a == 19 || a == 20 || a == 23) {
                        bkx.mo2054b(3);
                    }
                    bkx.mo2054b(1);
                }
                switch (a) {
                    case 17:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        int c2 = bkx.mo2057c(2);
                        if (c2 == 2 || c2 == 3) {
                            StringBuilder sb2 = new StringBuilder(33);
                            sb2.append("Unsupported epConfig: ");
                            sb2.append(c2);
                            throw new ako(sb2.toString());
                        }
                }
            } else {
                throw new UnsupportedOperationException();
            }
        }
        int i = f4209c[c];
        if (i == -1) {
            z2 = false;
        }
        bks.m3510a(z2);
        return Pair.create(Integer.valueOf(b), Integer.valueOf(i));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bkg.a(bkx, boolean):android.util.Pair
     arg types: [bkx, int]
     candidates:
      bkg.a(byte[], int):boolean
      bkg.a(int, int):byte[]
      bkg.a(bkx, boolean):android.util.Pair */
    /* renamed from: a */
    public static Pair m3480a(byte[] bArr) {
        return m3479a(new bkx(bArr), false);
    }
}
