package p000;

/* renamed from: r */
/* compiled from: PG */
final class C0461r implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0488s f10233a;

    public C0461r(C0488s sVar) {
        this.f10233a = sVar;
    }

    public final void run() {
        Object obj;
        synchronized (this.f10233a.f10290a) {
            obj = this.f10233a.f10293e;
            this.f10233a.f10293e = C0488s.f10289b;
        }
        this.f10233a.mo627a(obj);
    }
}
