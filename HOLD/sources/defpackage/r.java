package defpackage;

/* renamed from: r  reason: default package */
/* compiled from: PG */
final class r implements Runnable {
    private final /* synthetic */ s a;

    public r(s sVar) {
        this.a = sVar;
    }

    public final void run() {
        Object obj;
        synchronized (this.a.a) {
            obj = this.a.e;
            this.a.e = s.b;
        }
        this.a.a(obj);
    }
}
