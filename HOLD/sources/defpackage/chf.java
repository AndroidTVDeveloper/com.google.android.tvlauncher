package defpackage;

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

/* renamed from: chf  reason: default package */
/* compiled from: PG */
public final class chf extends jp implements cit {
    public final ArrayList b = new ArrayList();
    public cht c;
    public che d;
    public int e;
    public int f;
    public final int g;
    public final int h;
    public final cfp i;
    private final int j;
    private final int k;
    private final int l;
    private final int m;
    private final Drawable n;

    public chf(Context context, cfp cfp) {
        Resources resources = context.getResources();
        resources.getDimensionPixelSize(R.dimen.app_view_grid_keyline_app_row_two);
        this.g = resources.getDimensionPixelSize(R.dimen.app_view_grid_keyline_app_row_two_title_above);
        this.h = resources.getDimensionPixelSize(R.dimen.app_view_grid_keyline_last_row);
        this.j = resources.getDimensionPixelSize(R.dimen.app_banner_margin_end);
        this.k = resources.getDimensionPixelSize(R.dimen.app_row_view_margin_bottom);
        this.n = new ColorDrawable(bg.b(context, R.color.app_banner_background_color));
        this.l = resources.getDimensionPixelOffset(R.dimen.app_banner_image_max_width);
        this.m = resources.getDimensionPixelOffset(R.dimen.app_banner_image_max_height);
        this.i = cfp;
    }

    public final void a(boolean z, Pair pair) {
    }

    public final void d() {
    }

    public final int a() {
        return this.b.size();
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i2) {
        chd chd = (chd) kmVar;
        chn chn = (chn) this.b.get(i2);
        chd.p.a(chn);
        chp chp = new chp(chd.a.getContext());
        chp.a = new cir(chn, cjd.BANNER, dbq.a(chd.a.getContext()).h());
        chp.b = chd.p.d;
        chf chf = chd.q;
        chp.c = chf.n;
        chp.d = chf.l;
        chp.e = chf.m;
        chp.a();
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i2) {
        BannerView bannerView = (BannerView) LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_app_banner, viewGroup, false);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(bannerView.getLayoutParams());
        layoutParams.bottomMargin = this.k;
        layoutParams.setMarginEnd(this.j);
        bannerView.setLayoutParams(layoutParams);
        return new chd(this, bannerView);
    }

    public final void a(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            chn chn = (chn) arrayList.get(i2);
            int indexOf = this.b.indexOf(chn);
            if (indexOf != -1) {
                c(indexOf);
            } else if (this.b.size() <= 0 || ((chn) this.b.get(0)).g == chn.g) {
                this.b.add(chn);
                d(this.b.size() - 1);
            }
        }
    }

    public final void b(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            int indexOf = this.b.indexOf((chn) arrayList.get(i2));
            if (indexOf != -1) {
                this.b.remove(indexOf);
                chc chc = ((cgz) this.d).a;
                EditModeGridView editModeGridView = chc.a;
                if (editModeGridView != null && editModeGridView.r() == indexOf && !chc.getFragmentManager().isStateSaved()) {
                    chc.getFragmentManager().popBackStack();
                }
                e(indexOf);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void c(ArrayList arrayList) {
        this.b.clear();
        this.b.addAll(arrayList);
        O();
    }
}
