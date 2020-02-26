package p000;

/* renamed from: bwv */
/* compiled from: PG */
final class bwv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bww f4962a;

    public bwv(bww bww) {
        this.f4962a = bww;
    }

    public final void run() {
        synchronized (this.f4962a.f4963a) {
            bwx bwx = this.f4962a.f4964b;
            if (bwx != null) {
                bwx.mo2302a();
            }
        }
    }
}
