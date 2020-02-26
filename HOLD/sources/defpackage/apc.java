package defpackage;

/* renamed from: apc  reason: default package */
/* compiled from: PG */
final class apc extends apb {
    private final bky a = new bky(bkw.a);
    private final bky c = new bky(4);
    private int d;
    private boolean e;
    private boolean f;
    private int g;

    public apc(aov aov) {
        super(aov);
    }

    /* access modifiers changed from: protected */
    public final boolean a(bky bky) {
        int d2 = bky.d();
        int i = (d2 >> 4) & 15;
        int i2 = d2 & 15;
        if (i2 == 7) {
            this.g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new apa(sb.toString());
    }

    /* access modifiers changed from: protected */
    public final boolean a(bky bky, long j) {
        int d2 = bky.d();
        byte[] bArr = bky.a;
        int i = bky.b;
        int i2 = i + 1;
        bky.b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        bky.b = i3;
        byte b2 = bArr[i2];
        bky.b = i3 + 1;
        long j2 = j + (((long) ((bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8))) * 1000);
        if (d2 == 0) {
            if (!this.e) {
                bky bky2 = new bky(new byte[bky.b()]);
                bky.a(bky2.a, 0, bky.b());
                bln a2 = bln.a(bky2);
                this.d = a2.b;
                this.b.a(akh.a(null, "video/avc", null, a2.c, a2.d, a2.a, a2.e));
                this.e = true;
                return false;
            }
        } else if (d2 == 1 && this.e) {
            int i4 = this.g == 1 ? 1 : 0;
            if (!this.f && i4 == 0) {
                return false;
            }
            byte[] bArr2 = this.c.a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i5 = 4 - this.d;
            int i6 = 0;
            while (bky.b() > 0) {
                bky.a(this.c.a, i5, this.d);
                this.c.c(0);
                int n = this.c.n();
                this.a.c(0);
                this.b.a(this.a, 4);
                this.b.a(bky, n);
                i6 = i6 + 4 + n;
            }
            this.b.a(j2, i4, i6, 0, null);
            this.f = true;
            return true;
        }
        return false;
    }
}
