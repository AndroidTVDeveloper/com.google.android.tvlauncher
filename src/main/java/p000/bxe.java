package p000;

/* renamed from: bxe */
/* compiled from: PG */
public final class bxe {

    /* renamed from: a */
    public final bxh f4974a = new bxh();

    /* renamed from: a */
    public final void mo2515a(Exception exc) {
        bxh bxh = this.f4974a;
        buh.m4200a(exc, "Exception must not be null");
        synchronized (bxh.f4977a) {
            if (!bxh.f4979c) {
                bxh.f4979c = true;
                bxh.f4981e = exc;
                bxh.f4978b.mo2513a(bxh);
            }
        }
    }
}
