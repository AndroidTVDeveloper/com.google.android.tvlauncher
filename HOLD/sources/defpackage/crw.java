package defpackage;

import android.text.TextUtils;
import android.view.View;

/* renamed from: crw  reason: default package */
/* compiled from: PG */
final class crw implements View.OnFocusChangeListener {
    private final /* synthetic */ crz a;

    public crw(crz crz) {
        this.a = crz;
    }

    public final void onFocusChange(View view, boolean z) {
        clv clv;
        daw daw = this.a.r;
        if (daw != null && daw.o) {
            daw.a();
        }
        crz crz = this.a;
        if (!crz.j) {
            if (crz.k == null) {
                if (crz.m != null) {
                    int i = 8;
                    crz.e.setVisibility(!z ? 8 : 0);
                    View view2 = this.a.b.b;
                    if (!z) {
                        i = 0;
                    }
                    view2.setVisibility(i);
                }
                if (this.a.l != null) {
                    if (z && view.hasWindowFocus() && !coi.a(view.getContext()).a() && this.a.a()) {
                        crz crz2 = this.a;
                        crz2.b.removeCallbacks(crz2.C);
                        crz2.b.postDelayed(crz2.C, 1250);
                        crz2.a.setVisibility(0);
                    } else {
                        this.a.b();
                    }
                }
            } else {
                if (z && view.hasWindowFocus() && !coi.a(view.getContext()).a()) {
                    crz crz3 = this.a;
                    if (!crz3.h && crz3.s.getBoolean("show_preview_video_key", true)) {
                        this.a.c();
                    }
                }
                this.a.a(true, 0);
            }
        }
        crl crl = this.a.n;
        if (crl != null) {
            crl.b(z);
        }
        crz crz4 = this.a;
        csi csi = crz4.B;
        if (csi != null && crz4.i == 1002 && (clv = csi.f) != null && z && csi.e) {
            String str = clv.e;
            if (!TextUtils.isEmpty(str)) {
                cll cll = csi.g;
                cll.c.a(new cli(cll.b, str));
            }
        }
    }
}
