package defpackage;

import android.view.View;

/* renamed from: csp  reason: default package */
/* compiled from: PG */
final /* synthetic */ class csp implements View.OnClickListener {
    private final csq a;

    public csp(csq csq) {
        this.a = csq;
    }

    public final void onClick(View view) {
        csq csq = this.a;
        cst cst = csq.r;
        if (cst.n) {
            cst.n = false;
            cst.e(1);
            csq.r.m.edit().putBoolean("watch_next_info_acknowledged", true).apply();
        }
    }
}
