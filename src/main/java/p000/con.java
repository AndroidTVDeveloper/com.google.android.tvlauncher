package p000;

import android.content.Context;
import android.support.p002v7.widget.RecyclerView;
import android.util.Log;
import com.google.android.tvlauncher.home.view.ProgramView;

/* renamed from: con */
/* compiled from: PG */
public final class con extends C0285km implements crl, csa, cez, cfp {

    /* renamed from: p */
    public final crz f6780p;

    /* renamed from: q */
    public final Runnable f6781q = new C0071com(this);

    /* renamed from: r */
    public final /* synthetic */ coo f6782r;

    /* renamed from: s */
    private final cfp f6783s;

    /* renamed from: t */
    private final Runnable f6784t = new col(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public con(coo coo, ProgramView programView, cfp cfp) {
        super(programView);
        this.f6782r = coo;
        this.f6783s = cfp;
        crz crz = new crz(programView, this, coo.f6796m, coo.f6797n);
        this.f6780p = crz;
        crz.f7145n = this;
        crz.f7141j = false;
        crz.f7146o = this;
    }

    /* renamed from: a */
    public final void mo2714a(cfs cfs) {
        cfs.mo2724a(mo5436d());
        dja c = cfs.mo2730c();
        String str = this.f6782r.f6787d;
        if (c.f8673b) {
            c.mo4505b();
            c.f8673b = false;
        }
        dmk dmk = (dmk) c.f8672a;
        dmk dmk2 = dmk.f8838f;
        str.getClass();
        dmk.f8839a |= 1;
        dmk.f8840b = str;
        int a = this.f6782r.mo2794a();
        if (c.f8673b) {
            c.mo4505b();
            c.f8673b = false;
        }
        dmk dmk3 = (dmk) c.f8672a;
        dmk3.f8839a |= 4;
        dmk3.f8842d = a;
        this.f6783s.mo2714a(cfs);
    }

    /* renamed from: u */
    private final void m5394u() {
        RecyclerView recyclerView = this.f6782r.f6798o;
        if (recyclerView != null && !recyclerView.mo892l()) {
            this.f6784t.run();
            return;
        }
        Log.w("ChannelItemsAdapter", "list is still computing layout => schedule program selection change");
        this.f6782r.f6799p.post(this.f6784t);
    }

    /* renamed from: d */
    public final void mo2705d(Context context) {
        this.f6780p.mo2705d(context);
    }

    /* renamed from: b */
    public final void mo3507b(boolean z) {
        int d = mo5436d();
        if (d != -1) {
            coo coo = this.f6782r;
            if (coo.f6790g != null && z) {
                coo.f6785b.mo3046a(coo.f6786c, d);
                this.f6782r.f6790g.mo3575a(this.f6780p);
            }
            this.f6782r.f6799p.removeCallbacks(this.f6784t);
            coo coo2 = this.f6782r;
            if (coo2.f6788e == 5) {
                if (this.f6780p.f7138g && !z) {
                    m5394u();
                }
            } else if (!z) {
                coo2.f6789f = mo5436d();
            } else {
                m5394u();
            }
        }
    }
}
