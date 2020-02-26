package p000;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ProgramView;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;
import java.util.List;

/* renamed from: cst */
/* compiled from: PG */
final class cst extends C0261jp {

    /* renamed from: b */
    public final cla f7279b;

    /* renamed from: c */
    public final cfp f7280c;

    /* renamed from: d */
    public int f7281d = 0;

    /* renamed from: e */
    public int f7282e = -1;

    /* renamed from: f */
    public crk f7283f;

    /* renamed from: g */
    public cey f7284g;

    /* renamed from: h */
    public csf f7285h;

    /* renamed from: i */
    public csf f7286i;

    /* renamed from: j */
    public boolean f7287j;

    /* renamed from: k */
    public RecyclerView f7288k;

    /* renamed from: l */
    public final Handler f7289l = new Handler();

    /* renamed from: m */
    public final SharedPreferences f7290m;

    /* renamed from: n */
    public boolean f7291n;

    /* renamed from: o */
    private final cle f7292o = new csm(this);

    public cst(Context context, cfp cfp) {
        this.f7279b = cla.m5025a(context);
        this.f7280c = cfp;
        mo5308a(true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        this.f7290m = sharedPreferences;
        this.f7291n = !sharedPreferences.getBoolean("watch_next_info_acknowledged", false);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final int mo3720f(int i) {
        return (!this.f7291n || i <= 0) ? i : i - 1;
    }

    /* renamed from: f */
    public final double mo3719f() {
        return dhz.m6469a(this.f7279b.mo3065c(0).mo3007g());
    }

    /* renamed from: a */
    public final int mo2794a() {
        if (!this.f7279b.mo3075i()) {
            return 0;
        }
        int j = this.f7279b.mo3076j();
        return this.f7291n ? j + 1 : j;
    }

    /* renamed from: b */
    public final long mo2835b(int i) {
        if (mo2850a(i) != 1) {
            return this.f7279b.mo3065c(mo3720f(i)).mo3001a();
        }
        return -2;
    }

    /* renamed from: a */
    public final int mo2850a(int i) {
        if (this.f7279b.mo3076j() > 0) {
            return (!this.f7291n || i != 1) ? 0 : 1;
        }
        return 1;
    }

    /* renamed from: a */
    public final void mo3510a(RecyclerView recyclerView) {
        this.f7288k = recyclerView;
        cga.m4692a().mo2747b(this.f7288k);
    }

    /* renamed from: a */
    public final void mo2797a(C0285km kmVar, int i) {
        if (kmVar instanceof css) {
            css css = (css) kmVar;
            css.f7275p.mo3677a(this.f7279b.mo3065c(mo3720f(i)), null, this.f7281d, false, false, false);
            if (css.f7276q.f7283f != null && css.f7275p.mo3688i()) {
                css.f7276q.f7283f.mo3575a(css.f7275p);
            }
        } else if (kmVar instanceof csq) {
            csq csq = (csq) kmVar;
            csq.mo3713v();
            csq.mo3714w();
        }
    }

    /* renamed from: a */
    public final void mo2854a(C0285km kmVar, int i, List list) {
        if (list.isEmpty()) {
            mo2797a(kmVar, i);
        } else if (kmVar instanceof css) {
            css css = (css) kmVar;
            if (list.contains("PAYLOAD_STATE")) {
                css.f7275p.mo3681b(this.f7281d);
            }
            if (list.contains("PAYLOAD_STATE") || list.contains("PAYLOAD_FOCUS_CHANGED")) {
                css.f7275p.mo3686g();
            }
        } else if (kmVar instanceof csq) {
            csq csq = (csq) kmVar;
            if (list.contains("PAYLOAD_STATE")) {
                csq.mo3713v();
            }
            if (list.contains("PAYLOAD_STATE") || list.contains("PAYLOAD_FOCUS_CHANGED")) {
                csq.mo3714w();
            }
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
        if (i != 0) {
            return new csq(this, (WatchNextInfoView) LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_watch_next_info, viewGroup, false));
        }
        css css = new css(this, (ProgramView) LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_program, viewGroup, false), this.f7280c);
        css.f7275p.f7147p = this.f7284g;
        return css;
    }

    /* renamed from: c */
    public final void mo3511c() {
        this.f7288k = null;
    }

    /* renamed from: e */
    public final void mo3718e() {
        if (this.f7287j) {
            this.f7279b.mo3063b(this.f7292o);
        }
        this.f7287j = false;
    }

    /* renamed from: d */
    public final boolean mo3717d() {
        this.f7279b.mo3055a(this.f7292o);
        if (this.f7279b.mo3075i() && !this.f7279b.f5892t) {
            return false;
        }
        this.f7279b.mo3080n();
        this.f7279b.mo3081o();
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo3716a(int i, boolean z) {
        if (this.f7281d != i) {
            this.f7281d = i;
            if (z) {
                this.f7282e = -1;
                mo5305a(0, mo2794a(), "PAYLOAD_STATE");
            }
        }
    }
}
