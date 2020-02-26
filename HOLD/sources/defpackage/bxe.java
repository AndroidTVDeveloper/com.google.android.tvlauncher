package defpackage;

/* renamed from: bxe  reason: default package */
/* compiled from: PG */
public final class bxe {
    public final bxh a = new bxh();

    public final void a(Exception exc) {
        bxh bxh = this.a;
        buh.a(exc, "Exception must not be null");
        synchronized (bxh.a) {
            if (!bxh.c) {
                bxh.c = true;
                bxh.e = exc;
                bxh.b.a(bxh);
            }
        }
    }
}
