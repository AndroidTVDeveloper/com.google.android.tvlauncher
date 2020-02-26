package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import java.util.List;

/* renamed from: cpo  reason: default package */
/* compiled from: PG */
public final class cpo extends jp implements cfp {
    public final cja b;
    public int c = 0;
    public int d = -1;
    public final dcw e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final Drawable p;
    public final float q;
    public final float r;
    public cpr s;
    public cey t;
    public cew u;
    public csf v;
    public csf w;
    public RecyclerView x;
    public final Handler y = new Handler();
    private final cfp z;

    public cpo(Context context, cfp cfp) {
        cja a = dbq.a(context);
        this.b = a;
        this.z = cfp;
        a.k.e = new coy(this);
        Resources resources = context.getResources();
        this.q = resources.getFraction(R.fraction.home_app_banner_focused_scale, 1, 1);
        this.r = resources.getDimension(R.dimen.home_app_banner_focused_elevation);
        this.e = new dcw(resources.getInteger(R.integer.home_app_banner_focused_animation_duration_ms), this.q, this.r);
        this.f = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_top);
        this.g = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_bottom);
        this.h = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_bottom);
        this.i = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_horizontal);
        this.j = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_above_selected_margin_bottom);
        this.k = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_horizontal);
        this.l = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_top);
        this.m = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_bottom);
        this.p = new ColorDrawable(bg.b(context, R.color.app_banner_background_color));
        this.n = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_width);
        this.o = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_height);
        a(true);
        cja cja = this.b;
        if (!cja.c || cja.d) {
            cja.e();
        }
    }

    public final int a() {
        cja cja = this.b;
        if (cja.c) {
            return cja.f().size();
        }
        return 0;
    }

    public final long b(int i2) {
        return (long) ((chn) this.b.f().get(i2)).c.hashCode();
    }

    public final int a(int i2) {
        chn chn = (chn) this.b.f().get(i2);
        return (this.b.b(chn) || this.b.c(chn)) ? 0 : 1;
    }

    public final void a(cfs cfs) {
        cfs.a(dhs.g);
        this.z.a(cfs);
    }

    public final void a(RecyclerView recyclerView) {
        this.x = recyclerView;
        cga.a().b(this.x);
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i2, List list) {
        cpn cpn = (cpn) kmVar;
        if (!list.isEmpty()) {
            if (list.contains("PAYLOAD_STATE")) {
                cpn.y();
            }
            if ((list.contains("PAYLOAD_FOCUS_CHANGED") || list.contains("PAYLOAD_STATE") || list.contains("PAYLOAD_UPDATE_PIVOT")) && dcy.d(cpn.a.getContext())) {
                cpn.u();
                return;
            }
            return;
        }
        a(cpn, i2);
    }

    /* access modifiers changed from: private */
    public final void a(cpn cpn, int i2) {
        cpn.a((chn) this.b.f().get(i2));
        cpn.y();
        if (dcy.d(cpn.a.getContext())) {
            cpn.u();
        } else {
            cpn.B.a();
        }
        if (cpn instanceof cpi) {
            int i3 = cpi.x;
            ((cpi) cpn).x();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i2) {
        if (i2 != 0) {
            return new cpc(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_home_add_more_apps_banner, viewGroup, false));
        }
        cpi cpi = new cpi(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_app_banner_home, viewGroup, false));
        cpi.r = this.t;
        cpi.s = this.u;
        return cpi;
    }

    public final void c() {
        this.x = null;
    }
}
