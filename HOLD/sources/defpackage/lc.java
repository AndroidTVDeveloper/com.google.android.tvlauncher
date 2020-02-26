package defpackage;

import android.support.v7.widget.Toolbar;
import android.view.View;

/* renamed from: lc  reason: default package */
/* compiled from: PG */
final class lc implements View.OnClickListener {
    private final /* synthetic */ Toolbar a;

    public lc(Toolbar toolbar) {
        this.a = toolbar;
    }

    public final void onClick(View view) {
        ld ldVar = this.a.q;
        fp fpVar = ldVar != null ? ldVar.a : null;
        if (fpVar != null) {
            fpVar.collapseActionView();
        }
    }
}
