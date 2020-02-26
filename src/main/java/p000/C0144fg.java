package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.List;

/* renamed from: fg */
/* compiled from: PG */
final class C0144fg implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ C0149fl f9261a;

    public C0144fg(C0149fl flVar) {
        this.f9261a = flVar;
    }

    public final void onGlobalLayout() {
        if (this.f9261a.mo4850e() && this.f9261a.f9272b.size() > 0) {
            if (!((C0148fk) this.f9261a.f9272b.get(0)).f9268a.f9673m) {
                View view = this.f9261a.f9274d;
                if (view != null && view.isShown()) {
                    List list = this.f9261a.f9272b;
                    int size = list.size();
                    for (int i = 0; i < size; i++) {
                        ((C0148fk) list.get(i)).f9268a.mo4847c();
                    }
                    return;
                }
                this.f9261a.mo4849d();
            }
        }
    }
}
