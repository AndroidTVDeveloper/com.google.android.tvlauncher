package p000;

import android.view.View;

/* renamed from: csp */
/* compiled from: PG */
final /* synthetic */ class csp implements View.OnClickListener {

    /* renamed from: a */
    private final csq f7266a;

    public csp(csq csq) {
        this.f7266a = csq;
    }

    public final void onClick(View view) {
        csq csq = this.f7266a;
        cst cst = csq.f7269r;
        if (cst.f7291n) {
            cst.f7291n = false;
            cst.mo5314e(1);
            csq.f7269r.f7290m.edit().putBoolean("watch_next_info_acknowledged", true).apply();
        }
    }
}
