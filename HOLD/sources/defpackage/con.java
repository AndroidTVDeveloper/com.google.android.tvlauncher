package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import com.google.android.tvlauncher.home.view.ProgramView;

/* renamed from: con  reason: default package */
/* compiled from: PG */
public final class con extends km implements crl, csa, cez, cfp {
    public final crz p;
    public final Runnable q = new com(this);
    public final /* synthetic */ coo r;
    private final cfp s;
    private final Runnable t = new col(this);

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public con(coo coo, ProgramView programView, cfp cfp) {
        super(programView);
        this.r = coo;
        this.s = cfp;
        crz crz = new crz(programView, this, coo.m, coo.n);
        this.p = crz;
        crz.n = this;
        crz.j = false;
        crz.o = this;
    }

    public final void a(cfs cfs) {
        cfs.a(d());
        dja c = cfs.c();
        String str = this.r.d;
        if (c.b) {
            c.b();
            c.b = false;
        }
        dmk dmk = (dmk) c.a;
        dmk dmk2 = dmk.f;
        str.getClass();
        dmk.a |= 1;
        dmk.b = str;
        int a = this.r.a();
        if (c.b) {
            c.b();
            c.b = false;
        }
        dmk dmk3 = (dmk) c.a;
        dmk3.a |= 4;
        dmk3.d = a;
        this.s.a(cfs);
    }

    private final void u() {
        RecyclerView recyclerView = this.r.o;
        if (recyclerView != null && !recyclerView.l()) {
            this.t.run();
            return;
        }
        Log.w("ChannelItemsAdapter", "list is still computing layout => schedule program selection change");
        this.r.p.post(this.t);
    }

    public final void d(Context context) {
        this.p.d(context);
    }

    public final void b(boolean z) {
        int d = d();
        if (d != -1) {
            coo coo = this.r;
            if (coo.g != null && z) {
                coo.b.a(coo.c, d);
                this.r.g.a(this.p);
            }
            this.r.p.removeCallbacks(this.t);
            coo coo2 = this.r;
            if (coo2.e == 5) {
                if (this.p.g && !z) {
                    u();
                }
            } else if (!z) {
                coo2.f = d();
            } else {
                u();
            }
        }
    }
}
