package p000;

/* renamed from: apm */
/* compiled from: PG */
final class apm {

    /* renamed from: b */
    private static final long[] f1699b = {128, 64, 32, 16, 8, 4, 2, 1};

    /* renamed from: a */
    public int f1700a;

    /* renamed from: c */
    private final byte[] f1701c = new byte[8];

    /* renamed from: d */
    private int f1702d;

    /* renamed from: a */
    public static long m1733a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= f1699b[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    /* renamed from: a */
    public static int m1732a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = f1699b;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    /* renamed from: a */
    public final long mo1233a(aoj aoj, boolean z, boolean z2, int i) {
        if (this.f1702d == 0) {
            if (!aoj.mo1193a(this.f1701c, 0, 1, z)) {
                return -1;
            }
            int a = m1732a(this.f1701c[0] & 255);
            this.f1700a = a;
            if (a != -1) {
                this.f1702d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.f1700a;
        if (i2 > i) {
            this.f1702d = 0;
            return -2;
        }
        if (i2 != 1) {
            aoj.mo1196b(this.f1701c, 1, i2 - 1);
        }
        this.f1702d = 0;
        return m1733a(this.f1701c, this.f1700a, z2);
    }

    /* renamed from: a */
    public final void mo1234a() {
        this.f1702d = 0;
        this.f1700a = 0;
    }
}
