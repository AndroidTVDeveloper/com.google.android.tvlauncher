package defpackage;

import android.view.View;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;

/* renamed from: cig  reason: default package */
/* compiled from: PG */
final class cig extends cif {
    private final HorizontalGridView p;
    private final chy q;
    private final /* synthetic */ cij r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cig(cij cij, View view, cfp cfp) {
        super(view, cfp);
        this.r = cij;
        HorizontalGridView horizontalGridView = (HorizontalGridView) view;
        this.p = horizontalGridView;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.app_banner_margin_end);
        nt ntVar = horizontalGridView.L;
        ntVar.x = dimensionPixelSize;
        ntVar.z = dimensionPixelSize;
        ntVar.y = dimensionPixelSize;
        horizontalGridView.requestLayout();
        chy chy = new chy(view.getContext());
        this.q = chy;
        chy.a(true);
        this.p.a(this.q);
        this.q.c = cij.q;
    }

    /* access modifiers changed from: protected */
    public final int v() {
        return this.r.f(d());
    }

    public final void x() {
        if (this.p.getChildCount() > 0) {
            this.p.i(0);
        }
    }

    public final void u() {
        chy chy = this.q;
        chy.b = this.r.l;
        chy.O();
    }
}
