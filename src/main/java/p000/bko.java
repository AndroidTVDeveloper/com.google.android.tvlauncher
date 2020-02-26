package p000;

/* renamed from: bko */
/* compiled from: PG */
public final class bko {

    /* renamed from: a */
    public final int f4227a;

    /* renamed from: b */
    public final int f4228b;

    /* renamed from: c */
    public final int f4229c;

    /* renamed from: d */
    public final long f4230d;

    public bko(byte[] bArr) {
        bkx bkx = new bkx(bArr);
        bkx.mo2050a(136);
        bkx.mo2057c(16);
        bkx.mo2057c(16);
        bkx.mo2057c(24);
        bkx.mo2057c(24);
        this.f4227a = bkx.mo2057c(20);
        this.f4228b = bkx.mo2057c(3) + 1;
        this.f4229c = bkx.mo2057c(5) + 1;
        this.f4230d = ((((long) bkx.mo2057c(4)) & 15) << 32) | (((long) bkx.mo2057c(32)) & 4294967295L);
    }
}
