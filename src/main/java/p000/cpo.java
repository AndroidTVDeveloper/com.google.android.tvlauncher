package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.support.p002v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import java.util.List;

/* renamed from: cpo */
/* compiled from: PG */
public final class cpo extends C0261jp implements cfp {

    /* renamed from: b */
    public final cja f6896b;

    /* renamed from: c */
    public int f6897c = 0;

    /* renamed from: d */
    public int f6898d = -1;

    /* renamed from: e */
    public final dcw f6899e;

    /* renamed from: f */
    public final int f6900f;

    /* renamed from: g */
    public final int f6901g;

    /* renamed from: h */
    public final int f6902h;

    /* renamed from: i */
    public final int f6903i;

    /* renamed from: j */
    public final int f6904j;

    /* renamed from: k */
    public final int f6905k;

    /* renamed from: l */
    public final int f6906l;

    /* renamed from: m */
    public final int f6907m;

    /* renamed from: n */
    public final int f6908n;

    /* renamed from: o */
    public final int f6909o;

    /* renamed from: p */
    public final Drawable f6910p;

    /* renamed from: q */
    public final float f6911q;

    /* renamed from: r */
    public final float f6912r;

    /* renamed from: s */
    public cpr f6913s;

    /* renamed from: t */
    public cey f6914t;

    /* renamed from: u */
    public cew f6915u;

    /* renamed from: v */
    public csf f6916v;

    /* renamed from: w */
    public csf f6917w;

    /* renamed from: x */
    public RecyclerView f6918x;

    /* renamed from: y */
    public final Handler f6919y = new Handler();

    /* renamed from: z */
    private final cfp f6920z;

    public cpo(Context context, cfp cfp) {
        cja a = dbq.m6093a(context);
        this.f6896b = a;
        this.f6920z = cfp;
        a.f5689k.f5656e = new coy(this);
        Resources resources = context.getResources();
        this.f6911q = resources.getFraction(R.fraction.home_app_banner_focused_scale, 1, 1);
        this.f6912r = resources.getDimension(R.dimen.home_app_banner_focused_elevation);
        this.f6899e = new dcw(resources.getInteger(R.integer.home_app_banner_focused_animation_duration_ms), this.f6911q, this.f6912r);
        this.f6900f = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_top);
        this.f6901g = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_bottom);
        this.f6902h = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_bottom);
        this.f6903i = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_margin_horizontal);
        this.f6904j = resources.getDimensionPixelSize(R.dimen.home_app_banner_default_above_selected_margin_bottom);
        this.f6905k = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_horizontal);
        this.f6906l = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_top);
        this.f6907m = resources.getDimensionPixelSize(R.dimen.home_app_banner_zoomed_out_margin_bottom);
        this.f6910p = new ColorDrawable(C0035bg.m3116b(context, R.color.app_banner_background_color));
        this.f6908n = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_width);
        this.f6909o = resources.getDimensionPixelSize(R.dimen.app_banner_image_max_height);
        mo5308a(true);
        cja cja = this.f6896b;
        if (!cja.f5681c || cja.f5682d) {
            cja.mo2897e();
        }
    }

    /* renamed from: a */
    public final int mo2794a() {
        cja cja = this.f6896b;
        if (cja.f5681c) {
            return cja.mo2899f().size();
        }
        return 0;
    }

    /* renamed from: b */
    public final long mo2835b(int i) {
        return (long) ((chn) this.f6896b.mo2899f().get(i)).f5563c.hashCode();
    }

    /* renamed from: a */
    public final int mo2850a(int i) {
        chn chn = (chn) this.f6896b.mo2899f().get(i);
        return (this.f6896b.mo2892b(chn) || this.f6896b.mo2894c(chn)) ? 0 : 1;
    }

    /* renamed from: a */
    public final void mo2714a(cfs cfs) {
        cfs.mo2725a(dhs.f8543g);
        this.f6920z.mo2714a(cfs);
    }

    /* renamed from: a */
    public final void mo3510a(RecyclerView recyclerView) {
        this.f6918x = recyclerView;
        cga.m4692a().mo2747b(this.f6918x);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2854a(C0285km kmVar, int i, List list) {
        cpn cpn = (cpn) kmVar;
        if (!list.isEmpty()) {
            if (list.contains("PAYLOAD_STATE")) {
                cpn.mo3562y();
            }
            if ((list.contains("PAYLOAD_FOCUS_CHANGED") || list.contains("PAYLOAD_STATE") || list.contains("PAYLOAD_UPDATE_PIVOT")) && dcy.m6195d(cpn.f9783a.getContext())) {
                cpn.mo3548u();
                return;
            }
            return;
        }
        mo2797a(cpn, i);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void mo2797a(cpn cpn, int i) {
        cpn.mo3546a((chn) this.f6896b.mo2899f().get(i));
        cpn.mo3562y();
        if (dcy.m6195d(cpn.f9783a.getContext())) {
            cpn.mo3548u();
        } else {
            cpn.f6890B.mo4131a();
        }
        if (cpn instanceof cpi) {
            int i2 = cpi.f6873x;
            ((cpi) cpn).mo3556x();
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        if (i != 0) {
            return new cpc(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_home_add_more_apps_banner, viewGroup, false));
        }
        cpi cpi = new cpi(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_app_banner_home, viewGroup, false));
        cpi.f6878r = this.f6914t;
        cpi.f6879s = this.f6915u;
        return cpi;
    }

    /* renamed from: c */
    public final void mo3511c() {
        this.f6918x = null;
    }
}
