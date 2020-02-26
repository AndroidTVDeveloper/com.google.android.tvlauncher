package defpackage;

/* renamed from: aoo  reason: default package */
/* compiled from: PG */
public final class aoo {
    private static final String[] h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};
    private static final int[] i = {44100, 48000, 32000};
    private static final int[] j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};
    private static final int[] k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};
    private static final int[] l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};
    private static final int[] m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};
    private static final int[] n = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};
    public int a;
    public String b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;

    public static int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        if ((i2 & -2097152) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return -1;
        }
        int i8 = i[i6];
        if (i3 == 2) {
            i8 /= 2;
        } else if (i3 == 0) {
            i8 /= 4;
        }
        int i9 = (i2 >>> 9) & 1;
        if (i4 != 3) {
            if (i3 != 3) {
                i7 = n[i5 - 1];
            } else {
                i7 = i4 != 2 ? m[i5 - 1] : l[i5 - 1];
            }
            int i10 = 144;
            if (i3 == 3) {
                return ((i7 * 144) / i8) + i9;
            }
            if (i4 == 1) {
                i10 = 72;
            }
            return ((i10 * i7) / i8) + i9;
        }
        return ((((i3 != 3 ? k[i5 - 1] : j[i5 - 1]) * 12) / i8) + i9) << 2;
    }

    public static boolean a(int i2, aoo aoo) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        if ((i2 & -2097152) != -2097152 || (i3 = (i2 >>> 19) & 3) == 1 || (i4 = (i2 >>> 17) & 3) == 0 || (i5 = (i2 >>> 12) & 15) == 0 || i5 == 15 || (i6 = (i2 >>> 10) & 3) == 3) {
            return false;
        }
        int i10 = i[i6];
        int i11 = 2;
        if (i3 == 2) {
            i10 /= 2;
        } else if (i3 == 0) {
            i10 /= 4;
        }
        int i12 = (i2 >>> 9) & 1;
        int i13 = 1152;
        if (i4 == 3) {
            i8 = i3 != 3 ? k[i5 - 1] : j[i5 - 1];
            i7 = (((i8 * 12) / i10) + i12) << 2;
            i13 = 384;
        } else if (i3 != 3) {
            i8 = n[i5 - 1];
            if (i4 == 1) {
                i13 = 576;
            }
            if (i4 == 1) {
                i9 = 72;
            } else {
                i9 = 144;
            }
            i7 = ((i9 * i8) / i10) + i12;
        } else {
            i8 = i4 != 2 ? m[i5 - 1] : l[i5 - 1];
            i7 = ((i8 * 144) / i10) + i12;
        }
        String str = h[3 - i4];
        if (((i2 >> 6) & 3) == 3) {
            i11 = 1;
        }
        aoo.a = i3;
        aoo.b = str;
        aoo.c = i7;
        aoo.d = i10;
        aoo.e = i11;
        aoo.f = i8;
        aoo.g = i13;
        return true;
    }
}
