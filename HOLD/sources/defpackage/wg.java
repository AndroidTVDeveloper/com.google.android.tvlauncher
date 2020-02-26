package defpackage;

/* renamed from: wg  reason: default package */
/* compiled from: PG */
final class wg implements Runnable {
    private final agr a;
    private final /* synthetic */ wk b;

    public wg(wk wkVar, agr agr) {
        this.b = wkVar;
        this.a = agr;
    }

    public final void run() {
        synchronized (this.a.h()) {
            synchronized (this.b) {
                if (this.b.a.a(this.a)) {
                    wk wkVar = this.b;
                    try {
                        this.a.a(wkVar.j);
                    } catch (Throwable th) {
                        throw new vg(th);
                    }
                }
                this.b.a();
            }
        }
    }
}
