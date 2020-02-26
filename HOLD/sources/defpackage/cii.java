package defpackage;

import android.view.View;
import android.widget.TextView;

/* renamed from: cii  reason: default package */
/* compiled from: PG */
final class cii extends cif {
    public String p;
    public int q;

    public cii(View view, cfp cfp) {
        super(view, cfp);
    }

    public final void w() {
        this.p = "";
        this.q = 0;
    }

    public final void u() {
        ((TextView) this.a).setText(this.p);
        this.a.setBackgroundColor(this.q);
    }
}
