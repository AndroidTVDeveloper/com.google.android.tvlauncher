package p000;

import android.support.p002v7.widget.RecyclerView;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: pb */
/* compiled from: PG */
final class C0409pb extends boc {

    /* renamed from: a */
    private final /* synthetic */ C0412pe f10116a;

    public C0409pb(C0412pe peVar) {
        this.f10116a = peVar;
    }

    /* renamed from: a */
    public final void mo2223a(RecyclerView recyclerView, C0285km kmVar, int i) {
        int indexOf = this.f10116a.f10130i.indexOf((VerticalGridView) recyclerView);
        this.f10116a.mo5737b(indexOf);
        if (kmVar != null) {
            this.f10116a.mo1067a(indexOf, ((C0413pf) this.f10116a.f10131j.get(indexOf)).f10138b + i);
        }
    }
}
