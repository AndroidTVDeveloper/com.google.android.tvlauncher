package p000;

/* renamed from: apc */
/* compiled from: PG */
final class apc extends apb {

    /* renamed from: a */
    private final bky f1567a = new bky(bkw.f4250a);

    /* renamed from: c */
    private final bky f1568c = new bky(4);

    /* renamed from: d */
    private int f1569d;

    /* renamed from: e */
    private boolean f1570e;

    /* renamed from: f */
    private boolean f1571f;

    /* renamed from: g */
    private int f1572g;

    public apc(aov aov) {
        super(aov);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1224a(bky bky) {
        int d = bky.mo2074d();
        int i = (d >> 4) & 15;
        int i2 = d & 15;
        if (i2 == 7) {
            this.f1572g = i;
            return i != 5;
        }
        StringBuilder sb = new StringBuilder(39);
        sb.append("Video format not supported: ");
        sb.append(i2);
        throw new apa(sb.toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1225a(bky bky, long j) {
        int d = bky.mo2074d();
        byte[] bArr = bky.f4258a;
        int i = bky.f4259b;
        int i2 = i + 1;
        bky.f4259b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        bky.f4259b = i3;
        byte b2 = bArr[i2];
        bky.f4259b = i3 + 1;
        long j2 = j + (((long) ((bArr[i3] & 255) | (((b & 255) << 24) >> 8) | ((b2 & 255) << 8))) * 1000);
        if (d == 0) {
            if (!this.f1570e) {
                bky bky2 = new bky(new byte[bky.mo2070b()]);
                bky.mo2069a(bky2.f4258a, 0, bky.mo2070b());
                bln a = bln.m3683a(bky2);
                this.f1569d = a.f4306b;
                this.f1566b.mo1204a(akh.m737a(null, "video/avc", null, a.f4307c, a.f4308d, a.f4305a, a.f4309e));
                this.f1570e = true;
                return false;
            }
        } else if (d == 1 && this.f1570e) {
            int i4 = this.f1572g == 1 ? 1 : 0;
            if (!this.f1571f && i4 == 0) {
                return false;
            }
            byte[] bArr2 = this.f1568c.f4258a;
            bArr2[0] = 0;
            bArr2[1] = 0;
            bArr2[2] = 0;
            int i5 = 4 - this.f1569d;
            int i6 = 0;
            while (bky.mo2070b() > 0) {
                bky.mo2069a(this.f1568c.f4258a, i5, this.f1569d);
                this.f1568c.mo2073c(0);
                int n = this.f1568c.mo2087n();
                this.f1567a.mo2073c(0);
                this.f1566b.mo1205a(this.f1567a, 4);
                this.f1566b.mo1205a(bky, n);
                i6 = i6 + 4 + n;
            }
            this.f1566b.mo1203a(j2, i4, i6, 0, null);
            this.f1571f = true;
            return true;
        }
        return false;
    }
}
