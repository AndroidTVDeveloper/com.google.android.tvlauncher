package p000;

import android.view.View;

/* renamed from: gk */
/* compiled from: PG */
final class C0175gk implements Runnable {

    /* renamed from: a */
    private final C0178gn f9398a;

    /* renamed from: b */
    private final /* synthetic */ C0180gp f9399b;

    public C0175gk(C0180gp gpVar, C0178gn gnVar) {
        this.f9399b = gpVar;
        this.f9398a = gnVar;
    }

    public final void run() {
        C0161fx fxVar = this.f9399b.f9260f;
        if (!(fxVar == null || ((View) fxVar).getWindowToken() == null || !this.f9398a.mo5032b())) {
            this.f9399b.f9408k = this.f9398a;
        }
        this.f9399b.f9410m = null;
    }
}
