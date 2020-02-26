package defpackage;

import android.support.v7.widget.RecyclerView;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: pb  reason: default package */
/* compiled from: PG */
final class pb extends boc {
    private final /* synthetic */ pe a;

    public pb(pe peVar) {
        this.a = peVar;
    }

    public final void a(RecyclerView recyclerView, km kmVar, int i) {
        int indexOf = this.a.i.indexOf((VerticalGridView) recyclerView);
        this.a.b(indexOf);
        if (kmVar != null) {
            this.a.a(indexOf, ((pf) this.a.j.get(indexOf)).b + i);
        }
    }
}
