package p000;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.BannerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: chy */
/* compiled from: PG */
public final class chy extends C0261jp {

    /* renamed from: b */
    public List f5585b = new ArrayList();

    /* renamed from: c */
    public chr f5586c;

    /* renamed from: d */
    private final agj f5587d;

    public chy(Context context) {
        ColorDrawable colorDrawable = new ColorDrawable(C0035bg.m3116b(context, R.color.app_banner_background_color));
        this.f5587d = new agj((byte) 0).mo195a(colorDrawable).mo205c(colorDrawable).mo199a(C0594vy.f10649a);
    }

    /* renamed from: a */
    public final int mo2794a() {
        return this.f5585b.size();
    }

    /* renamed from: b */
    public final long mo2835b(int i) {
        return (long) ((dby) this.f5585b.get(i)).f8193k.hashCode();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo2797a(C0285km kmVar, int i) {
        chx chx = (chx) kmVar;
        dby dby = (dby) this.f5585b.get(i);
        chx.f5584r = dby;
        BannerView bannerView = chx.f5582p;
        boolean isFocused = bannerView.isFocused();
        float f = 1.0f;
        float f2 = isFocused ? bannerView.f6401j : 1.0f;
        float f3 = isFocused ? bannerView.f6400i : 0.0f;
        if (!isFocused) {
            f = 0.0f;
        }
        bannerView.setTranslationZ(f3);
        bannerView.setScaleX(f2);
        bannerView.setScaleY(f2);
        bannerView.f6396e.setSelected(isFocused);
        bannerView.f6396e.setAlpha(f);
        BannerView bannerView2 = chx.f5582p;
        String str = dby.f8183a;
        if (!TextUtils.equals(str, bannerView2.f6396e.getText())) {
            bannerView2.f6396e.setText(str);
        }
        C0512sx c = C0497si.m8296c(chx.f5582p.getContext());
        c.mo5946a(chx.f5583q.f5587d);
        c.mo5945a(dby.f8185c).mo5937a((ahg) new chw(chx.f5582p.f6395d));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C0285km mo2795a(ViewGroup viewGroup, int i) {
        return new chx(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_app_banner, viewGroup, false));
    }
}
