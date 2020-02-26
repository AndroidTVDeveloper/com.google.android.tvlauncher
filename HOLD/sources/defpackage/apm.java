package defpackage;

/* renamed from: apm  reason: default package */
/* compiled from: PG */
final class apm {
    private static final long[] b = {128, 64, 32, 16, 8, 4, 2, 1};
    public int a;
    private final byte[] c = new byte[8];
    private int d;

    public static long a(byte[] bArr, int i, boolean z) {
        long j = ((long) bArr[0]) & 255;
        if (z) {
            j &= b[i - 1] ^ -1;
        }
        for (int i2 = 1; i2 < i; i2++) {
            j = (j << 8) | (((long) bArr[i2]) & 255);
        }
        return j;
    }

    public static int a(int i) {
        int i2;
        int i3 = 0;
        do {
            long[] jArr = b;
            if (i3 >= jArr.length) {
                return -1;
            }
            i2 = ((jArr[i3] & ((long) i)) > 0 ? 1 : ((jArr[i3] & ((long) i)) == 0 ? 0 : -1));
            i3++;
        } while (i2 == 0);
        return i3;
    }

    public final long a(aoj aoj, boolean z, boolean z2, int i) {
        if (this.d == 0) {
            if (!aoj.a(this.c, 0, 1, z)) {
                return -1;
            }
            int a2 = a(this.c[0] & 255);
            this.a = a2;
            if (a2 != -1) {
                this.d = 1;
            } else {
                throw new IllegalStateException("No valid varint length mask found");
            }
        }
        int i2 = this.a;
        if (i2 > i) {
            this.d = 0;
            return -2;
        }
        if (i2 != 1) {
            aoj.b(this.c, 1, i2 - 1);
        }
        this.d = 0;
        return a(this.c, this.a, z2);
    }

    public final void a() {
        this.d = 0;
        this.a = 0;
    }
}
