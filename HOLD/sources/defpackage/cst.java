package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.home.view.ProgramView;
import com.google.android.tvlauncher.home.view.WatchNextInfoView;
import java.util.List;

/* renamed from: cst  reason: default package */
/* compiled from: PG */
final class cst extends jp {
    public final cla b;
    public final cfp c;
    public int d = 0;
    public int e = -1;
    public crk f;
    public cey g;
    public csf h;
    public csf i;
    public boolean j;
    public RecyclerView k;
    public final Handler l = new Handler();
    public final SharedPreferences m;
    public boolean n;
    private final cle o = new csm(this);

    public cst(Context context, cfp cfp) {
        this.b = cla.a(context);
        this.c = cfp;
        a(true);
        SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.tvlauncher.data.TvDataManager.WATCH_NEXT_PREF_FILE_NAME", 0);
        this.m = sharedPreferences;
        this.n = !sharedPreferences.getBoolean("watch_next_info_acknowledged", false);
    }

    /* access modifiers changed from: package-private */
    public final int f(int i2) {
        return (!this.n || i2 <= 0) ? i2 : i2 - 1;
    }

    public final double f() {
        return dhz.a(this.b.c(0).g());
    }

    public final int a() {
        if (!this.b.i()) {
            return 0;
        }
        int j2 = this.b.j();
        return this.n ? j2 + 1 : j2;
    }

    public final long b(int i2) {
        if (a(i2) != 1) {
            return this.b.c(f(i2)).a();
        }
        return -2;
    }

    public final int a(int i2) {
        if (this.b.j() > 0) {
            return (!this.n || i2 != 1) ? 0 : 1;
        }
        return 1;
    }

    public final void a(RecyclerView recyclerView) {
        this.k = recyclerView;
        cga.a().b(this.k);
    }

    public final void a(km kmVar, int i2) {
        if (kmVar instanceof css) {
            css css = (css) kmVar;
            css.p.a(this.b.c(f(i2)), null, this.d, false, false, false);
            if (css.q.f != null && css.p.i()) {
                css.q.f.a(css.p);
            }
        } else if (kmVar instanceof csq) {
            csq csq = (csq) kmVar;
            csq.v();
            csq.w();
        }
    }

    public final void a(km kmVar, int i2, List list) {
        if (list.isEmpty()) {
            a(kmVar, i2);
        } else if (kmVar instanceof css) {
            css css = (css) kmVar;
            if (list.contains("PAYLOAD_STATE")) {
                css.p.b(this.d);
            }
            if (list.contains("PAYLOAD_STATE") || list.contains("PAYLOAD_FOCUS_CHANGED")) {
                css.p.g();
            }
        } else if (kmVar instanceof csq) {
            csq csq = (csq) kmVar;
            if (list.contains("PAYLOAD_STATE")) {
                csq.v();
            }
            if (list.contains("PAYLOAD_STATE") || list.contains("PAYLOAD_FOCUS_CHANGED")) {
                csq.w();
            }
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final km a(ViewGroup viewGroup, int i2) {
        if (i2 != 0) {
            return new csq(this, (WatchNextInfoView) LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_watch_next_info, viewGroup, false));
        }
        css css = new css(this, (ProgramView) LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_program, viewGroup, false), this.c);
        css.p.p = this.g;
        return css;
    }

    public final void c() {
        this.k = null;
    }

    public final void e() {
        if (this.j) {
            this.b.b(this.o);
        }
        this.j = false;
    }

    public final boolean d() {
        this.b.a(this.o);
        if (this.b.i() && !this.b.t) {
            return false;
        }
        this.b.n();
        this.b.o();
        return true;
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2, boolean z) {
        if (this.d != i2) {
            this.d = i2;
            if (z) {
                this.e = -1;
                a(0, a(), "PAYLOAD_STATE");
            }
        }
    }
}
