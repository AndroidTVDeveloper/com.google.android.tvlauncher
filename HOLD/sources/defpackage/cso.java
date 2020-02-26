package defpackage;

import android.view.View;

/* renamed from: cso  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cso implements View.OnFocusChangeListener {
    private final csq a;

    public cso(csq csq) {
        this.a = csq;
    }

    public final void onFocusChange(View view, boolean z) {
        csq csq = this.a;
        if (csq.d() != -1) {
            crk crk = csq.r.f;
            if (crk != null && z) {
                crk.a(null);
            }
            csq.r.l.removeCallbacks(csq.q);
            cst cst = csq.r;
            if (cst.d == 5) {
                if (csq.p.e && !z) {
                    csq.u();
                }
            } else if (!z) {
                cst.e = csq.d();
            } else {
                csq.u();
            }
        }
    }
}
