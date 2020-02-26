package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.View;

/* renamed from: jn */
/* compiled from: PG */
public final class C0259jn implements C0205hn {

    /* renamed from: a */
    public final /* synthetic */ RecyclerView f9696a;

    public C0259jn(RecyclerView recyclerView) {
        this.f9696a = recyclerView;
    }

    /* renamed from: b */
    public final View mo5194b(int i) {
        return this.f9696a.getChildAt(i);
    }

    /* renamed from: a */
    public final int mo5191a() {
        return this.f9696a.getChildCount();
    }

    /* renamed from: a */
    public final int mo5192a(View view) {
        return this.f9696a.indexOfChild(view);
    }

    /* renamed from: b */
    public final void mo5195b(View view) {
        C0285km c = RecyclerView.m1301c(view);
        if (c != null) {
            this.f9696a.mo835a(c, c.f9795m);
            c.f9795m = 0;
        }
    }

    /* renamed from: a */
    public final void mo5193a(int i) {
        View childAt = this.f9696a.getChildAt(i);
        if (childAt != null) {
            RecyclerView.m1301c(childAt);
            childAt.clearAnimation();
        }
        this.f9696a.removeViewAt(i);
    }
}
