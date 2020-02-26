package p000;

import android.text.TextUtils;
import android.view.View;

/* renamed from: crw */
/* compiled from: PG */
final class crw implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ crz f7081a;

    public crw(crz crz) {
        this.f7081a = crz;
    }

    public final void onFocusChange(View view, boolean z) {
        clv clv;
        daw daw = this.f7081a.f7149r;
        if (daw != null && daw.f8105o) {
            daw.mo4051a();
        }
        crz crz = this.f7081a;
        if (!crz.f7141j) {
            if (crz.f7142k == null) {
                if (crz.f7144m != null) {
                    int i = 8;
                    crz.f7136e.setVisibility(!z ? 8 : 0);
                    View view2 = this.f7081a.f7133b.f6566b;
                    if (!z) {
                        i = 0;
                    }
                    view2.setVisibility(i);
                }
                if (this.f7081a.f7143l != null) {
                    if (z && view.hasWindowFocus() && !coi.m5206a(view.getContext()).mo3161a() && this.f7081a.mo3679a()) {
                        crz crz2 = this.f7081a;
                        crz2.f7133b.removeCallbacks(crz2.f7086C);
                        crz2.f7133b.postDelayed(crz2.f7086C, 1250);
                        crz2.f7109a.setVisibility(0);
                    } else {
                        this.f7081a.mo3680b();
                    }
                }
            } else {
                if (z && view.hasWindowFocus() && !coi.m5206a(view.getContext()).mo3161a()) {
                    crz crz3 = this.f7081a;
                    if (!crz3.f7139h && crz3.f7150s.getBoolean("show_preview_video_key", true)) {
                        this.f7081a.mo3682c();
                    }
                }
                this.f7081a.mo3678a(true, 0);
            }
        }
        crl crl = this.f7081a.f7145n;
        if (crl != null) {
            crl.mo3507b(z);
        }
        crz crz4 = this.f7081a;
        csi csi = crz4.f7085B;
        if (csi != null && crz4.f7140i == 1002 && (clv = csi.f7189f) != null && z && csi.f7188e) {
            String str = clv.f5945e;
            if (!TextUtils.isEmpty(str)) {
                cll cll = csi.f7190g;
                cll.f5918c.mo3105a(new cli(cll.f5917b, str));
            }
        }
    }
}
