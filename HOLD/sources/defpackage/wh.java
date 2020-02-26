package defpackage;

/* renamed from: wh  reason: default package */
/* compiled from: PG */
final class wh implements Runnable {
    private final agr a;
    private final /* synthetic */ wk b;

    public wh(wk wkVar, agr agr) {
        this.b = wkVar;
        this.a = agr;
    }

    public final void run() {
        synchronized (this.a.h()) {
            synchronized (this.b) {
                if (this.b.a.a(this.a)) {
                    this.b.l.e();
                    wk wkVar = this.b;
                    try {
                        this.a.a(wkVar.l, wkVar.n);
                        this.b.a(this.a);
                    } catch (Throwable th) {
                        throw new vg(th);
                    }
                }
                this.b.a();
            }
        }
    }
}
