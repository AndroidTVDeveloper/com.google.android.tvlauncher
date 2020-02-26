package p000;

import android.widget.AbsListView;

/* renamed from: ix */
/* compiled from: PG */
final class C0242ix implements AbsListView.OnScrollListener {

    /* renamed from: a */
    private final /* synthetic */ C0246ja f9649a;

    public C0242ix(C0246ja jaVar) {
        this.f9649a = jaVar;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.f9649a.mo5290b() && this.f9649a.f9674n.getContentView() != null) {
            C0246ja jaVar = this.f9649a;
            jaVar.f9672l.removeCallbacks(jaVar.f9671k);
            this.f9649a.f9671k.run();
        }
    }
}
