package p000;

/* renamed from: cxc */
/* compiled from: PG */
final class cxc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f7815a;

    /* renamed from: b */
    private final /* synthetic */ cxe f7816b;

    public cxc(cxe cxe, int i) {
        this.f7816b = cxe;
        this.f7815a = i;
    }

    public final void run() {
        int i;
        cxe cxe = this.f7816b;
        if (!cxe.f7825f) {
            int i2 = cxe.f7823d;
            if (!(i2 == 0 || (i = cxe.f7824e) == 0)) {
                StringBuilder sb = new StringBuilder(40);
                sb.append("player.setSize(");
                sb.append(i2);
                sb.append(",");
                sb.append(i);
                sb.append(");");
                cxe.mo3925a(sb.toString());
            }
            this.f7816b.f7825f = true;
        }
        int i3 = this.f7815a;
        if (i3 == 1 || i3 == 2) {
            cxe cxe2 = this.f7816b;
            if (!cxe2.f7826g) {
                cwh cwh = cxe2.f7828i;
                if (cwh != null) {
                    cwh.mo3878a();
                }
                this.f7816b.f7826g = true;
            }
            this.f7816b.f7829j = 3;
        } else if (i3 == 0) {
            cxe cxe3 = this.f7816b;
            cxe3.f7829j = 4;
            cwh cwh2 = cxe3.f7828i;
            if (cwh2 != null) {
                cwh2.mo3880c();
            }
        }
    }
}
