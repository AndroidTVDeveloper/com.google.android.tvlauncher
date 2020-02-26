package p000;

import android.util.Log;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ckd */
/* compiled from: PG */
final class ckd implements dbb {

    /* renamed from: a */
    private final /* synthetic */ cke f5794a;

    public /* synthetic */ ckd(cke cke) {
        this.f5794a = cke;
    }

    /* renamed from: a */
    public final void mo2968a(dbc dbc) {
        long j = dbc.f8130a;
        if (j == -1000) {
            ckx ckx = (ckx) this.f5794a.f5798c;
            if (ckx.f5845a.f5874b.size() <= 0) {
                ckx.f5845a.f5886n = true;
            } else {
                ckx.f5845a.mo3077k();
            }
            ckx.f5845a.mo3079m();
            if (ckx.f5845a.f5878f.size() > 0) {
                dck.m6123a(ckx.f5845a.f5873a);
            }
        } else if (j == -5000) {
            ((ckx) this.f5794a.f5798c).f5845a.mo3079m();
        } else if (j == -2000) {
            ckx ckx2 = (ckx) this.f5794a.f5798c;
            for (Long a : ckx2.f5845a.f5887o.keySet()) {
                ckx2.mo3041a(a);
            }
            HashSet hashSet = new HashSet(ckx2.f5845a.f5882j.keySet());
            hashSet.removeAll(ckx2.f5845a.f5875c.keySet());
            ckx2.f5845a.mo3064b(hashSet);
        } else if (j == -3000) {
            ckx ckx3 = (ckx) this.f5794a.f5798c;
            if (ckx3.f5845a.f5879g.size() > 0) {
                ckx3.f5845a.mo3080n();
                ckx3.f5845a.mo3081o();
                return;
            }
            ckx3.f5845a.f5892t = true;
        } else if (j == -4000) {
            this.f5794a.mo2974d();
        } else if (j != -6000) {
            Map map = this.f5794a.f5803h;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                this.f5794a.f5803h.remove(valueOf);
                dbc.mo4062b();
                ckx ckx4 = (ckx) this.f5794a.f5798c;
                if (ckx4.f5845a.f5887o.containsKey(valueOf)) {
                    ckx4.mo3041a(valueOf);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown timer ID: ");
            sb.append(j);
            Log.w("DataSourceObserver", sb.toString());
        } else {
            dbc dbc2 = this.f5794a.f5806k;
            if (dbc2 != null) {
                dbc2.mo4064d();
            }
            cke cke = this.f5794a;
            ckc ckc = cke.f5798c;
            ((ckx) ckc).f5845a.mo3064b(cke.f5801f);
            this.f5794a.f5801f.clear();
        }
    }
}
