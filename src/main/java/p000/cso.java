package p000;

import android.view.View;

/* renamed from: cso */
/* compiled from: PG */
final /* synthetic */ class cso implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final csq f7265a;

    public cso(csq csq) {
        this.f7265a = csq;
    }

    public final void onFocusChange(View view, boolean z) {
        csq csq = this.f7265a;
        if (csq.mo5436d() != -1) {
            crk crk = csq.f7269r.f7283f;
            if (crk != null && z) {
                crk.mo3575a(null);
            }
            csq.f7269r.f7289l.removeCallbacks(csq.f7268q);
            cst cst = csq.f7269r;
            if (cst.f7281d == 5) {
                if (csq.f7267p.f7216e && !z) {
                    csq.mo3712u();
                }
            } else if (!z) {
                cst.f7282e = csq.mo5436d();
            } else {
                csq.mo3712u();
            }
        }
    }
}
