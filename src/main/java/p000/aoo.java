package p000;

/* renamed from: aoo */
/* compiled from: PG */
public final class aoo {

    /* renamed from: h */
    private static final String[] f1500h = {"audio/mpeg-L1", "audio/mpeg-L2", "audio/mpeg"};

    /* renamed from: i */
    private static final int[] f1501i = {44100, 48000, 32000};

    /* renamed from: j */
    private static final int[] f1502j = {32000, 64000, 96000, 128000, 160000, 192000, 224000, 256000, 288000, 320000, 352000, 384000, 416000, 448000};

    /* renamed from: k */
    private static final int[] f1503k = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000, 176000, 192000, 224000, 256000};

    /* renamed from: l */
    private static final int[] f1504l = {32000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000, 384000};

    /* renamed from: m */
    private static final int[] f1505m = {32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 160000, 192000, 224000, 256000, 320000};

    /* renamed from: n */
    private static final int[] f1506n = {8000, 16000, 24000, 32000, 40000, 48000, 56000, 64000, 80000, 96000, 112000, 128000, 144000, 160000};

    /* renamed from: a */
    public int f1507a;

    /* renamed from: b */
    public String f1508b;

    /* renamed from: c */
    public int f1509c;

    /* renamed from: d */
    public int f1510d;

    /* renamed from: e */
    public int f1511e;

    /* renamed from: f */
    public int f1512f;

    /* renamed from: g */
    public int f1513g;

    /* renamed from: a */
    public static int m1672a(int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return -1;
        }
        int i7 = f1501i[i5];
        if (i2 == 2) {
            i7 /= 2;
        } else if (i2 == 0) {
            i7 /= 4;
        }
        int i8 = (i >>> 9) & 1;
        if (i3 != 3) {
            if (i2 != 3) {
                i6 = f1506n[i4 - 1];
            } else {
                i6 = i3 != 2 ? f1505m[i4 - 1] : f1504l[i4 - 1];
            }
            int i9 = 144;
            if (i2 == 3) {
                return ((i6 * 144) / i7) + i8;
            }
            if (i3 == 1) {
                i9 = 72;
            }
            return ((i9 * i6) / i7) + i8;
        }
        return ((((i2 != 3 ? f1503k[i4 - 1] : f1502j[i4 - 1]) * 12) / i7) + i8) << 2;
    }

    /* renamed from: a */
    public static boolean m1673a(int i, aoo aoo) {
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        if ((i & -2097152) != -2097152 || (i2 = (i >>> 19) & 3) == 1 || (i3 = (i >>> 17) & 3) == 0 || (i4 = (i >>> 12) & 15) == 0 || i4 == 15 || (i5 = (i >>> 10) & 3) == 3) {
            return false;
        }
        int i9 = f1501i[i5];
        int i10 = 2;
        if (i2 == 2) {
            i9 /= 2;
        } else if (i2 == 0) {
            i9 /= 4;
        }
        int i11 = (i >>> 9) & 1;
        int i12 = 1152;
        if (i3 == 3) {
            i7 = i2 != 3 ? f1503k[i4 - 1] : f1502j[i4 - 1];
            i6 = (((i7 * 12) / i9) + i11) << 2;
            i12 = 384;
        } else if (i2 != 3) {
            i7 = f1506n[i4 - 1];
            if (i3 == 1) {
                i12 = 576;
            }
            if (i3 == 1) {
                i8 = 72;
            } else {
                i8 = 144;
            }
            i6 = ((i8 * i7) / i9) + i11;
        } else {
            i7 = i3 != 2 ? f1505m[i4 - 1] : f1504l[i4 - 1];
            i6 = ((i7 * 144) / i9) + i11;
        }
        String str = f1500h[3 - i3];
        if (((i >> 6) & 3) == 3) {
            i10 = 1;
        }
        aoo.f1507a = i2;
        aoo.f1508b = str;
        aoo.f1509c = i6;
        aoo.f1510d = i9;
        aoo.f1511e = i10;
        aoo.f1512f = i7;
        aoo.f1513g = i12;
        return true;
    }
}
