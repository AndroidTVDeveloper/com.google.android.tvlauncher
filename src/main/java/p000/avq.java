package p000;

import java.nio.ByteBuffer;

/* renamed from: avq */
/* compiled from: PG */
public final class avq implements atx {

    /* renamed from: a */
    private final bky f2501a = new bky();

    /* renamed from: b */
    private final bkx f2502b = new bkx();

    /* renamed from: c */
    private blj f2503c;

    /* renamed from: a */
    public final atw mo1353a(aua aua) {
        atv atv;
        blj blj = this.f2503c;
        if (blj == null || aua.f2417f != blj.mo2113a()) {
            blj blj2 = new blj(aua.f1426d);
            this.f2503c = blj2;
            blj2.mo2117c(aua.f1426d - aua.f2417f);
        }
        ByteBuffer byteBuffer = aua.f1425c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f2501a.mo2068a(array, limit);
        this.f2502b.mo2052a(array, limit);
        this.f2502b.mo2054b(39);
        long c = (((long) this.f2502b.mo2057c(1)) << 32) | ((long) this.f2502b.mo2057c(32));
        this.f2502b.mo2054b(20);
        int c2 = this.f2502b.mo2057c(12);
        int c3 = this.f2502b.mo2057c(8);
        this.f2501a.mo2075d(14);
        if (c3 == 0) {
            atv = new avv();
        } else if (c3 == 255) {
            atv = avo.m2188a(this.f2501a, c2, c);
        } else if (c3 == 4) {
            atv = avz.m2193a(this.f2501a);
        } else if (c3 == 5) {
            atv = avt.m2192a(this.f2501a, c, this.f2503c);
        } else if (c3 != 6) {
            atv = null;
        } else {
            bky bky = this.f2501a;
            blj blj3 = this.f2503c;
            long a = awb.m2194a(bky, c);
            atv = new awb(a, blj3.mo2115b(a));
        }
        if (atv == null) {
            return new atw(new atv[0]);
        }
        return new atw(atv);
    }
}
