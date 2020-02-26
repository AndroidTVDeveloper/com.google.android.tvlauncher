package p000;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.BannerView;
import com.google.android.tvlauncher.appsview.EditModeGridView;
import java.util.ArrayList;

/* renamed from: chf */
/* compiled from: PG */
public final class chf extends C0261jp implements cit {

    /* renamed from: b */
    public final ArrayList f5514b = new ArrayList();

    /* renamed from: c */
    public cht f5515c;

    /* renamed from: d */
    public che f5516d;

    /* renamed from: e */
    public int f5517e;

    /* renamed from: f */
    public int f5518f;

    /* renamed from: g */
    public final int f5519g;

    /* renamed from: h */
    public final int f5520h;

    /* renamed from: i */
    public final cfp f5521i;

    /* renamed from: j */
    private final int f5522j;

    /* renamed from: k */
    private final int f5523k;

    /* renamed from: l */
    private final int f5524l;

    /* renamed from: m */
    private final int f5525m;

    /* renamed from: n */
    private final Drawable f5526n;

    public chf(Context context, cfp cfp) {
        Resources resources = context.getResources();
        resources.getDimensionPixelSize(R.dimen.app_view_grid_keyline_app_row_two);
        this.f5519g = resources.getDimensionPixelSize(R.dimen.app_view_grid_keyline_app_row_two_title_above);
        this.f5520h = resources.getDimensionPixelSize(R.dimen.app_view_grid_keyline_last_row);
        this.f5522j = resources.getDimensionPixelSize(R.dimen.app_banner_margin_end);
        this.f5523k = resources.getDimensionPixelSize(R.dimen.app_row_view_margin_bottom);
        this.f5526n = new ColorDrawable(C0035bg.m3116b(context, R.color.app_banner_background_color));
        this.f5524l = resources.getDimensionPixelOffset(R.dimen.app_banner_image_max_width);
        this.f5525m = resources.getDimensionPixelOffset(R.dimen.app_banner_image_max_height);
        this.f5521i = cfp;
    }

    /* renamed from: a */
    public final void mo2798a(boolean z, Pair pair) {
    }

    /* renamed from: d */
    public final void mo2801d() {
    }

    /* renamed from: a */
    public final int mo2794a() {
        return this.f5514b.size();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        chd chd = (chd) kmVar;
        chn chn = (chn) this.f5514b.get(i);
        chd.f5512p.mo3225a(chn);
        chp chp = new chp(chd.f9783a.getContext());
        chp.f5574a = new cir(chn, cjd.BANNER, dbq.m6093a(chd.f9783a.getContext()).mo2902h());
        chp.f5575b = chd.f5512p.f6395d;
        chf chf = chd.f5513q;
        chp.f5576c = chf.f5526n;
        chp.f5577d = chf.f5524l;
        chp.f5578e = chf.f5525m;
        chp.mo2819a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        BannerView bannerView = (BannerView) LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_app_banner, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bannerView.getLayoutParams());
        layoutParams.bottomMargin = this.f5523k;
        layoutParams.setMarginEnd(this.f5522j);
        bannerView.setLayoutParams(layoutParams);
        return new chd(this, bannerView);
    }

    /* renamed from: a */
    public final void mo2796a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            chn chn = (chn) arrayList.get(i);
            int indexOf = this.f5514b.indexOf(chn);
            if (indexOf != -1) {
                mo5312c(indexOf);
            } else if (this.f5514b.size() <= 0 || ((chn) this.f5514b.get(0)).f5567g == chn.f5567g) {
                this.f5514b.add(chn);
                mo5313d(this.f5514b.size() - 1);
            }
        }
    }

    /* renamed from: b */
    public final void mo2799b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            int indexOf = this.f5514b.indexOf((chn) arrayList.get(i));
            if (indexOf != -1) {
                this.f5514b.remove(indexOf);
                chc chc = ((cgz) this.f5516d).f5494a;
                EditModeGridView editModeGridView = chc.f5502a;
                if (editModeGridView != null && editModeGridView.mo5622r() == indexOf && !chc.getFragmentManager().isStateSaved()) {
                    chc.getFragmentManager().popBackStack();
                }
                mo5314e(indexOf);
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo2800c(ArrayList arrayList) {
        this.f5514b.clear();
        this.f5514b.addAll(arrayList);
        mo5303O();
    }
}
