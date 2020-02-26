package p000;

import android.content.Context;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ProgramView;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: coo */
/* compiled from: PG */
public final class coo extends C0261jp {

    /* renamed from: b */
    public final cla f6785b;

    /* renamed from: c */
    public long f6786c = -1;

    /* renamed from: d */
    public String f6787d;

    /* renamed from: e */
    public int f6788e = 0;

    /* renamed from: f */
    public int f6789f = -1;

    /* renamed from: g */
    public crk f6790g;

    /* renamed from: h */
    public cey f6791h;

    /* renamed from: i */
    public csf f6792i;

    /* renamed from: j */
    public csf f6793j;

    /* renamed from: k */
    public final Set f6794k = new HashSet();

    /* renamed from: l */
    public boolean f6795l;

    /* renamed from: m */
    public boolean f6796m;

    /* renamed from: n */
    public boolean f6797n;

    /* renamed from: o */
    public RecyclerView f6798o;

    /* renamed from: p */
    public final Handler f6799p = new Handler();

    /* renamed from: q */
    public final cjt f6800q = new cjt(this);

    /* renamed from: r */
    private final cfp f6801r;

    /* renamed from: s */
    private boolean f6802s;

    /* renamed from: t */
    private boolean f6803t;

    /* renamed from: u */
    private boolean f6804u;

    public coo(Context context, cfp cfp) {
        this.f6785b = cla.m5025a(context);
        this.f6801r = cfp;
        mo5308a(true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3509a(long j, String str, int i, boolean z, boolean z2, boolean z3) {
        this.f6787d = str;
        this.f6802s = z;
        this.f6803t = z2;
        this.f6804u = z3;
        int i2 = this.f6788e;
        this.f6788e = i;
        long j2 = this.f6786c;
        if (j != j2) {
            if (j2 != -1) {
                this.f6785b.mo3051a(j2, this.f6800q);
            }
            this.f6786c = j;
            if (j != -1) {
                if (!mo3512d()) {
                    this.f6789f = -1;
                    mo5303O();
                }
                this.f6795l = true;
                return;
            }
            this.f6795l = false;
        } else if (i2 != i) {
            this.f6789f = -1;
            mo5305a(0, mo2794a(), "PAYLOAD_STATE");
        }
    }

    /* renamed from: a */
    public final int mo2794a() {
        if (this.f6785b.mo3067c(this.f6786c)) {
            return this.f6785b.mo3068d(this.f6786c);
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo2835b(int i) {
        return this.f6785b.mo3046a(this.f6786c, i).mo3001a();
    }

    /* renamed from: a */
    public final void mo3510a(RecyclerView recyclerView) {
        this.f6798o = recyclerView;
        cga.m4692a().mo2747b(this.f6798o);
    }

    /* renamed from: a */
    public final void mo2797a(C0285km kmVar, int i) {
        con con = (con) kmVar;
        cxu a = this.f6785b.mo3046a(this.f6786c, i);
        crz crz = con.f6780p;
        coo coo = con.f6782r;
        crz.mo3677a(a, coo.f6787d, coo.f6788e, coo.f6802s, coo.f6803t, coo.f6804u);
        if (con.f6782r.f6790g != null && con.f6780p.mo3688i()) {
            con.f6782r.f6790g.mo3575a(con.f6780p);
        }
        crz crz2 = con.f6780p;
        coo coo2 = con.f6782r;
        crz2.f7157z = coo2.f6792i;
        crz2.f7084A = coo2.f6793j;
        this.f6794k.add(crz2);
    }

    /* renamed from: a */
    public final void mo2854a(C0285km kmVar, int i, List list) {
        if (list.isEmpty()) {
            mo2797a(kmVar, i);
            return;
        }
        con con = (con) kmVar;
        if (list.contains("PAYLOAD_STATE")) {
            con.f6780p.mo3681b(this.f6788e);
        }
        if (list.contains("PAYLOAD_STATE") || list.contains("PAYLOAD_FOCUS_CHANGED")) {
            con.f6780p.mo3686g();
        }
        if (list.contains("PAYLOAD_LIVE_PROGRESS_UPDATE")) {
            con.f6780p.mo3676a(this.f6785b.mo3046a(this.f6786c, i));
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final C0285km mo2795a(ViewGroup viewGroup, int i) {
        con con = new con(this, (ProgramView) LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_program, viewGroup, false), this.f6801r);
        con.f6780p.f7147p = this.f6791h;
        return con;
    }

    /* renamed from: c */
    public final void mo3511c() {
        this.f6798o = null;
    }

    /* renamed from: a */
    public final void mo2853a(C0285km kmVar) {
        if (kmVar instanceof con) {
            con con = (con) kmVar;
            crz crz = con.f6780p;
            crz.f7157z = null;
            crz.f7084A = null;
            crz.mo3683d();
            if (dcy.m6194c(crz.f7133b.getContext())) {
                C0497si.m8296c(crz.f7133b.getContext()).mo5947a((ahg) new agz(crz.f7133b.f6568d));
            }
            crz.f7133b.f6568d.setImageDrawable(null);
            csi csi = crz.f7085B;
            if (csi != null) {
                csi.mo3702b();
            }
            con.f6782r.f6799p.removeCallbacks(con.f6781q);
            this.f6794k.remove(con.f6780p);
        }
    }

    /* renamed from: d */
    public final boolean mo3512d() {
        cla cla = this.f6785b;
        long j = this.f6786c;
        cla.m5028a(cla.f5875c, Long.valueOf(j), this.f6800q);
        cla.mo3061b();
        if (this.f6785b.mo3067c(this.f6786c)) {
            if (!this.f6785b.f5888p.contains(Long.valueOf(this.f6786c))) {
                return false;
            }
        }
        this.f6785b.mo3071e(this.f6786c);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3508a(int i, boolean z) {
        if (this.f6788e != i) {
            this.f6788e = i;
            if (z) {
                this.f6789f = -1;
                mo5305a(0, mo2794a(), "PAYLOAD_STATE");
            }
        }
    }
}
