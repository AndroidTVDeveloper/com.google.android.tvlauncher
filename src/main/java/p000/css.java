package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import com.google.android.tvlauncher.home.view.ProgramView;

/* renamed from: css */
/* compiled from: PG */
final class css extends C0285km implements crl, cez, cfp {

    /* renamed from: p */
    public final crz f7275p;

    /* renamed from: q */
    public final /* synthetic */ cst f7276q;

    /* renamed from: r */
    private final cfp f7277r;

    /* renamed from: s */
    private final Runnable f7278s = new csr(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public css(cst cst, ProgramView programView, cfp cfp) {
        super(programView);
        this.f7276q = cst;
        crz crz = new crz(programView, this, false, false);
        this.f7275p = crz;
        this.f7277r = cfp;
        crz.f7145n = this;
        crz.f7141j = true;
        crz.f7157z = cst.f7285h;
        crz.f7084A = cst.f7286i;
    }

    /* renamed from: a */
    public final void mo2714a(cfs cfs) {
        dja j = cfs.mo2724a(this.f7276q.mo3720f(mo5436d())).mo2725a(dhs.f8562z).mo2737j();
        cst cst = this.f7276q;
        int a = cst.f7291n ? cst.mo2794a() - 1 : cst.mo2794a();
        if (j.f8673b) {
            j.mo4505b();
            j.f8673b = false;
        }
        dnf dnf = (dnf) j.f8672a;
        dnf dnf2 = dnf.f8927c;
        dnf.f8928a |= 1;
        dnf.f8929b = a;
        this.f7277r.mo2714a(cfs);
    }

    /* renamed from: u */
    private final void m5636u() {
        RecyclerView recyclerView = this.f7276q.f7288k;
        if (recyclerView != null && !recyclerView.mo892l()) {
            this.f7278s.run();
            return;
        }
        Log.w("WatchNextItemsAdapter", "list is still computing layout => schedule program selection change");
        this.f7276q.f7289l.post(this.f7278s);
    }

    /* renamed from: d */
    public final void mo2705d(Context context) {
        this.f7275p.mo2705d(context);
    }

    /* renamed from: b */
    public final void mo3507b(boolean z) {
        int d = mo5436d();
        if (d != -1) {
            cst cst = this.f7276q;
            if (cst.f7283f != null && z) {
                cst.f7279b.mo3065c(cst.mo3720f(d));
                this.f7276q.f7283f.mo3575a(this.f7275p);
            }
            this.f7276q.f7289l.removeCallbacks(this.f7278s);
            cst cst2 = this.f7276q;
            if (cst2.f7281d == 5) {
                if (this.f7275p.f7138g && !z) {
                    m5636u();
                }
            } else if (!z) {
                cst2.f7282e = mo5436d();
            } else {
                m5636u();
            }
        }
    }
}
