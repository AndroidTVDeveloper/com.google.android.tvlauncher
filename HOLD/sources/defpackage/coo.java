package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ProgramView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: coo  reason: default package */
/* compiled from: PG */
public final class coo extends jp {
    public final cla b;
    public long c = -1;
    public String d;
    public int e = 0;
    public int f = -1;
    public crk g;
    public cey h;
    public csf i;
    public csf j;
    public final Set k = new HashSet();
    public boolean l;
    public boolean m;
    public boolean n;
    public RecyclerView o;
    public final Handler p = new Handler();
    public final cjt q = new cjt(this);
    private final cfp r;
    private boolean s;
    private boolean t;
    private boolean u;

    public coo(Context context, cfp cfp) {
        this.b = cla.a(context);
        this.r = cfp;
        a(true);
    }

    /* access modifiers changed from: package-private */
    public final void a(long j2, String str, int i2, boolean z, boolean z2, boolean z3) {
        this.d = str;
        this.s = z;
        this.t = z2;
        this.u = z3;
        int i3 = this.e;
        this.e = i2;
        long j3 = this.c;
        if (j2 != j3) {
            if (j3 != -1) {
                this.b.a(j3, this.q);
            }
            this.c = j2;
            if (j2 != -1) {
                if (!d()) {
                    this.f = -1;
                    O();
                }
                this.l = true;
                return;
            }
            this.l = false;
        } else if (i3 != i2) {
            this.f = -1;
            a(0, a(), "PAYLOAD_STATE");
        }
    }

    public final int a() {
        if (this.b.c(this.c)) {
            return this.b.d(this.c);
        }
        return 0;
    }

    public final long b(int i2) {
        return this.b.a(this.c, i2).a();
    }

    public final void a(RecyclerView recyclerView) {
        this.o = recyclerView;
        cga.a().b(this.o);
    }

    public final void a(km kmVar, int i2) {
        con con = (con) kmVar;
        cxu a = this.b.a(this.c, i2);
        crz crz = con.p;
        coo coo = con.r;
        crz.a(a, coo.d, coo.e, coo.s, coo.t, coo.u);
        if (con.r.g != null && con.p.i()) {
            con.r.g.a(con.p);
        }
        crz crz2 = con.p;
        coo coo2 = con.r;
        crz2.z = coo2.i;
        crz2.A = coo2.j;
        this.k.add(crz2);
    }

    public final void a(km kmVar, int i2, List list) {
        if (list.isEmpty()) {
            a(kmVar, i2);
            return;
        }
        con con = (con) kmVar;
        if (list.contains("PAYLOAD_STATE")) {
            con.p.b(this.e);
        }
        if (list.contains("PAYLOAD_STATE") || list.contains("PAYLOAD_FOCUS_CHANGED")) {
            con.p.g();
        }
        if (list.contains("PAYLOAD_LIVE_PROGRESS_UPDATE")) {
            con.p.a(this.b.a(this.c, i2));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final km a(ViewGroup viewGroup, int i2) {
        con con = new con(this, (ProgramView) LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_program, viewGroup, false), this.r);
        con.p.p = this.h;
        return con;
    }

    public final void c() {
        this.o = null;
    }

    public final void a(km kmVar) {
        if (kmVar instanceof con) {
            con con = (con) kmVar;
            crz crz = con.p;
            crz.z = null;
            crz.A = null;
            crz.d();
            if (dcy.c(crz.b.getContext())) {
                si.c(crz.b.getContext()).a((ahg) new agz(crz.b.d));
            }
            crz.b.d.setImageDrawable(null);
            csi csi = crz.B;
            if (csi != null) {
                csi.b();
            }
            con.r.p.removeCallbacks(con.q);
            this.k.remove(con.p);
        }
    }

    public final boolean d() {
        cla cla = this.b;
        long j2 = this.c;
        cla.a(cla.c, Long.valueOf(j2), this.q);
        cla.b();
        if (this.b.c(this.c)) {
            if (!this.b.p.contains(Long.valueOf(this.c))) {
                return false;
            }
        }
        this.b.e(this.c);
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (this.e != i2) {
            this.e = i2;
            if (z) {
                this.f = -1;
                a(0, a(), "PAYLOAD_STATE");
            }
        }
    }
}
