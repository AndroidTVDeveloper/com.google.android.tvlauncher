package p000;

import android.view.View;

/* renamed from: it */
/* compiled from: PG */
final class C0238it implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C0246ja f9645a;

    public C0238it(C0246ja jaVar) {
        this.f9645a = jaVar;
    }

    public final void run() {
        View view = this.f9645a.f9669i;
        if (view != null && view.getWindowToken() != null) {
            this.f9645a.mo4847c();
        }
    }
}
