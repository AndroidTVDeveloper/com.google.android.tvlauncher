package defpackage;

/* renamed from: ash  reason: default package */
/* compiled from: PG */
final class ash {
    public final blj a = new blj(0);
    public final bky b = new bky();
    public boolean c;
    public boolean d;
    public boolean e;
    public long f = -9223372036854775807L;
    public long g = -9223372036854775807L;
    public long h = -9223372036854775807L;

    public final int a(aoj aoj) {
        this.b.a(blm.f);
        this.c = true;
        aoj.a();
        return 0;
    }

    public static final int a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public static long a(bky bky) {
        bky bky2 = bky;
        int i = bky2.b;
        if (bky.b() >= 9) {
            byte[] bArr = new byte[9];
            bky2.a(bArr, 0, 9);
            bky2.c(i);
            byte b2 = bArr[0];
            if ((b2 & 196) == 68) {
                byte b3 = bArr[2];
                if ((b3 & 4) == 4) {
                    byte b4 = bArr[4];
                    if ((b4 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = (long) b2;
                        long j2 = (long) b3;
                        return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b4) & 248) >> 3);
                    }
                }
            }
        }
        return -9223372036854775807L;
    }
}
