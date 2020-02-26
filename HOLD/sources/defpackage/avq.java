package defpackage;

import java.nio.ByteBuffer;

/* renamed from: avq  reason: default package */
/* compiled from: PG */
public final class avq implements atx {
    private final bky a = new bky();
    private final bkx b = new bkx();
    private blj c;

    public final atw a(aua aua) {
        atv atv;
        blj blj = this.c;
        if (blj == null || aua.f != blj.a()) {
            blj blj2 = new blj(aua.d);
            this.c = blj2;
            blj2.c(aua.d - aua.f);
        }
        ByteBuffer byteBuffer = aua.c;
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.a.a(array, limit);
        this.b.a(array, limit);
        this.b.b(39);
        long c2 = (((long) this.b.c(1)) << 32) | ((long) this.b.c(32));
        this.b.b(20);
        int c3 = this.b.c(12);
        int c4 = this.b.c(8);
        this.a.d(14);
        if (c4 == 0) {
            atv = new avv();
        } else if (c4 == 255) {
            atv = avo.a(this.a, c3, c2);
        } else if (c4 == 4) {
            atv = avz.a(this.a);
        } else if (c4 == 5) {
            atv = avt.a(this.a, c2, this.c);
        } else if (c4 != 6) {
            atv = null;
        } else {
            bky bky = this.a;
            blj blj3 = this.c;
            long a2 = awb.a(bky, c2);
            atv = new awb(a2, blj3.b(a2));
        }
        if (atv == null) {
            return new atw(new atv[0]);
        }
        return new atw(atv);
    }
}
