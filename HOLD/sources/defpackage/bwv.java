package defpackage;

/* renamed from: bwv  reason: default package */
/* compiled from: PG */
final class bwv implements Runnable {
    private final /* synthetic */ bww a;

    public bwv(bww bww) {
        this.a = bww;
    }

    public final void run() {
        synchronized (this.a.a) {
            bwx bwx = this.a.b;
            if (bwx != null) {
                bwx.a();
            }
        }
    }
}
