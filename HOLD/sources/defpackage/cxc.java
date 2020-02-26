package defpackage;

/* renamed from: cxc  reason: default package */
/* compiled from: PG */
final class cxc implements Runnable {
    private final /* synthetic */ int a;
    private final /* synthetic */ cxe b;

    public cxc(cxe cxe, int i) {
        this.b = cxe;
        this.a = i;
    }

    public final void run() {
        int i;
        cxe cxe = this.b;
        if (!cxe.f) {
            int i2 = cxe.d;
            if (!(i2 == 0 || (i = cxe.e) == 0)) {
                StringBuilder sb = new StringBuilder(40);
                sb.append("player.setSize(");
                sb.append(i2);
                sb.append(",");
                sb.append(i);
                sb.append(");");
                cxe.a(sb.toString());
            }
            this.b.f = true;
        }
        int i3 = this.a;
        if (i3 == 1 || i3 == 2) {
            cxe cxe2 = this.b;
            if (!cxe2.g) {
                cwh cwh = cxe2.i;
                if (cwh != null) {
                    cwh.a();
                }
                this.b.g = true;
            }
            this.b.j = 3;
        } else if (i3 == 0) {
            cxe cxe3 = this.b;
            cxe3.j = 4;
            cwh cwh2 = cxe3.i;
            if (cwh2 != null) {
                cwh2.c();
            }
        }
    }
}
