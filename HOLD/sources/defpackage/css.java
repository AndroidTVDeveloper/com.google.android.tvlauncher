package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.google.android.tvlauncher.home.view.ProgramView;

/* renamed from: css  reason: default package */
/* compiled from: PG */
final class css extends km implements crl, cez, cfp {
    public final crz p;
    public final /* synthetic */ cst q;
    private final cfp r;
    private final Runnable s = new csr(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public css(cst cst, ProgramView programView, cfp cfp) {
        super(programView);
        this.q = cst;
        crz crz = new crz(programView, this, false, false);
        this.p = crz;
        this.r = cfp;
        crz.n = this;
        crz.j = true;
        crz.z = cst.h;
        crz.A = cst.i;
    }

    public final void a(cfs cfs) {
        dja j = cfs.a(this.q.f(d())).a(dhs.z).j();
        cst cst = this.q;
        int a = cst.n ? cst.a() - 1 : cst.a();
        if (j.b) {
            j.b();
            j.b = false;
        }
        dnf dnf = (dnf) j.a;
        dnf dnf2 = dnf.c;
        dnf.a |= 1;
        dnf.b = a;
        this.r.a(cfs);
    }

    private final void u() {
        RecyclerView recyclerView = this.q.k;
        if (recyclerView != null && !recyclerView.l()) {
            this.s.run();
            return;
        }
        Log.w("WatchNextItemsAdapter", "list is still computing layout => schedule program selection change");
        this.q.l.post(this.s);
    }

    public final void d(Context context) {
        this.p.d(context);
    }

    public final void b(boolean z) {
        int d = d();
        if (d != -1) {
            cst cst = this.q;
            if (cst.f != null && z) {
                cst.b.c(cst.f(d));
                this.q.f.a(this.p);
            }
            this.q.l.removeCallbacks(this.s);
            cst cst2 = this.q;
            if (cst2.d == 5) {
                if (this.p.g && !z) {
                    u();
                }
            } else if (!z) {
                cst2.e = d();
            } else {
                u();
            }
        }
    }
}
