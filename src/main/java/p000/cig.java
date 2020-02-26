package p000;

import android.view.View;
import androidx.leanback.widget.HorizontalGridView;
import com.google.android.tvlauncher.R;

/* renamed from: cig */
/* compiled from: PG */
final class cig extends cif {

    /* renamed from: p */
    private final HorizontalGridView f5608p;

    /* renamed from: q */
    private final chy f5609q;

    /* renamed from: r */
    private final /* synthetic */ cij f5610r;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cig(cij cij, View view, cfp cfp) {
        super(view, cfp);
        this.f5610r = cij;
        HorizontalGridView horizontalGridView = (HorizontalGridView) view;
        this.f5608p = horizontalGridView;
        int dimensionPixelSize = view.getContext().getResources().getDimensionPixelSize(R.dimen.app_banner_margin_end);
        C0373nt ntVar = horizontalGridView.f9985L;
        ntVar.f10055x = dimensionPixelSize;
        ntVar.f10057z = dimensionPixelSize;
        ntVar.f10056y = dimensionPixelSize;
        horizontalGridView.requestLayout();
        chy chy = new chy(view.getContext());
        this.f5609q = chy;
        chy.mo5308a(true);
        this.f5608p.mo831a(this.f5609q);
        this.f5609q.f5586c = cij.f5635q;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo2847v() {
        return this.f5610r.mo2856f(mo5436d());
    }

    /* renamed from: x */
    public final void mo2849x() {
        if (this.f5608p.getChildCount() > 0) {
            this.f5608p.mo5617i(0);
        }
    }

    /* renamed from: u */
    public final void mo2846u() {
        chy chy = this.f5609q;
        chy.f5585b = this.f5610r.f5630l;
        chy.mo5303O();
    }
}
