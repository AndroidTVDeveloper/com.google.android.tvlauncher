package p000;

import android.support.p002v7.widget.Toolbar;
import android.view.View;

/* renamed from: lc */
/* compiled from: PG */
final class C0302lc implements View.OnClickListener {

    /* renamed from: a */
    private final /* synthetic */ Toolbar f9837a;

    public C0302lc(Toolbar toolbar) {
        this.f9837a = toolbar;
    }

    public final void onClick(View view) {
        C0303ld ldVar = this.f9837a.f1155q;
        C0153fp fpVar = ldVar != null ? ldVar.f9838a : null;
        if (fpVar != null) {
            fpVar.collapseActionView();
        }
    }
}
