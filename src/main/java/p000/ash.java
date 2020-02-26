package p000;

/* renamed from: ash */
/* compiled from: PG */
final class ash {

    /* renamed from: a */
    public final blj f2226a = new blj(0);

    /* renamed from: b */
    public final bky f2227b = new bky();

    /* renamed from: c */
    public boolean f2228c;

    /* renamed from: d */
    public boolean f2229d;

    /* renamed from: e */
    public boolean f2230e;

    /* renamed from: f */
    public long f2231f = -9223372036854775807L;

    /* renamed from: g */
    public long f2232g = -9223372036854775807L;

    /* renamed from: h */
    public long f2233h = -9223372036854775807L;

    /* renamed from: a */
    public final int mo1302a(aoj aoj) {
        this.f2227b.mo2067a(blm.f4298f);
        this.f2228c = true;
        aoj.mo1191a();
        return 0;
    }

    /* renamed from: a */
    public static final int m1995a(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* renamed from: a */
    public static long m1996a(bky bky) {
        bky bky2 = bky;
        int i = bky2.f4259b;
        if (bky.mo2070b() >= 9) {
            byte[] bArr = new byte[9];
            bky2.mo2069a(bArr, 0, 9);
            bky2.mo2073c(i);
            byte b = bArr[0];
            if ((b & 196) == 68) {
                byte b2 = bArr[2];
                if ((b2 & 4) == 4) {
                    byte b3 = bArr[4];
                    if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                        long j = (long) b;
                        long j2 = (long) b2;
                        return ((j2 & 3) << 13) | ((j & 3) << 28) | (((56 & j) >> 3) << 30) | ((((long) bArr[1]) & 255) << 20) | (((j2 & 248) >> 3) << 15) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                    }
                }
            }
        }
        return -9223372036854775807L;
    }
}
