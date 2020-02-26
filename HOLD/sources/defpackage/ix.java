package defpackage;

import android.widget.AbsListView;

/* renamed from: ix  reason: default package */
/* compiled from: PG */
final class ix implements AbsListView.OnScrollListener {
    private final /* synthetic */ ja a;

    public ix(ja jaVar) {
        this.a = jaVar;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        if (i == 1 && !this.a.b() && this.a.n.getContentView() != null) {
            ja jaVar = this.a;
            jaVar.l.removeCallbacks(jaVar.k);
            this.a.k.run();
        }
    }
}
