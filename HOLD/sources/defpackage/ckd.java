package defpackage;

import android.util.Log;
import java.util.HashSet;
import java.util.Map;

/* renamed from: ckd  reason: default package */
/* compiled from: PG */
final class ckd implements dbb {
    private final /* synthetic */ cke a;

    public /* synthetic */ ckd(cke cke) {
        this.a = cke;
    }

    public final void a(dbc dbc) {
        long j = dbc.a;
        if (j == -1000) {
            ckx ckx = (ckx) this.a.c;
            if (ckx.a.b.size() <= 0) {
                ckx.a.n = true;
            } else {
                ckx.a.k();
            }
            ckx.a.m();
            if (ckx.a.f.size() > 0) {
                dck.a(ckx.a.a);
            }
        } else if (j == -5000) {
            ((ckx) this.a.c).a.m();
        } else if (j == -2000) {
            ckx ckx2 = (ckx) this.a.c;
            for (Long a2 : ckx2.a.o.keySet()) {
                ckx2.a(a2);
            }
            HashSet hashSet = new HashSet(ckx2.a.j.keySet());
            hashSet.removeAll(ckx2.a.c.keySet());
            ckx2.a.b(hashSet);
        } else if (j == -3000) {
            ckx ckx3 = (ckx) this.a.c;
            if (ckx3.a.g.size() > 0) {
                ckx3.a.n();
                ckx3.a.o();
                return;
            }
            ckx3.a.t = true;
        } else if (j == -4000) {
            this.a.d();
        } else if (j != -6000) {
            Map map = this.a.h;
            Long valueOf = Long.valueOf(j);
            if (map.containsKey(valueOf)) {
                this.a.h.remove(valueOf);
                dbc.b();
                ckx ckx4 = (ckx) this.a.c;
                if (ckx4.a.o.containsKey(valueOf)) {
                    ckx4.a(valueOf);
                    return;
                }
                return;
            }
            StringBuilder sb = new StringBuilder(38);
            sb.append("Unknown timer ID: ");
            sb.append(j);
            Log.w("DataSourceObserver", sb.toString());
        } else {
            dbc dbc2 = this.a.k;
            if (dbc2 != null) {
                dbc2.d();
            }
            cke cke = this.a;
            ckc ckc = cke.c;
            ((ckx) ckc).a.b(cke.f);
            this.a.f.clear();
        }
    }
}
