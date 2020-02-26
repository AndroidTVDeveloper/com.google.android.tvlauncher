package defpackage;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.tvlauncher.R;
import com.google.android.tvlauncher.appsview.BannerView;
import java.util.ArrayList;
import java.util.List;

/* renamed from: chy  reason: default package */
/* compiled from: PG */
public final class chy extends jp {
    public List b = new ArrayList();
    public chr c;
    private final agj d;

    public chy(Context context) {
        ColorDrawable colorDrawable = new ColorDrawable(bg.b(context, R.color.app_banner_background_color));
        this.d = new agj((byte) 0).a(colorDrawable).c(colorDrawable).a(vy.a);
    }

    public final int a() {
        return this.b.size();
    }

    public final long b(int i) {
        return (long) ((dby) this.b.get(i)).k.hashCode();
    }

    public final /* bridge */ /* synthetic */ void a(km kmVar, int i) {
        chx chx = (chx) kmVar;
        dby dby = (dby) this.b.get(i);
        chx.r = dby;
        BannerView bannerView = chx.p;
        boolean isFocused = bannerView.isFocused();
        float f = 1.0f;
        float f2 = isFocused ? bannerView.j : 1.0f;
        float f3 = isFocused ? bannerView.i : 0.0f;
        if (!isFocused) {
            f = 0.0f;
        }
        bannerView.setTranslationZ(f3);
        bannerView.setScaleX(f2);
        bannerView.setScaleY(f2);
        bannerView.e.setSelected(isFocused);
        bannerView.e.setAlpha(f);
        BannerView bannerView2 = chx.p;
        String str = dby.a;
        if (!TextUtils.equals(str, bannerView2.e.getText())) {
            bannerView2.e.setText(str);
        }
        sx c2 = si.c(chx.p.getContext());
        c2.a(chx.q.d);
        c2.a(dby.c).a((ahg) new chw(chx.p.d));
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View}
     arg types: [?, android.view.ViewGroup, int]
     candidates:
      ClspMth{android.view.LayoutInflater.inflate(org.xmlpull.v1.XmlPullParser, android.view.ViewGroup, boolean):android.view.View}
      ClspMth{android.view.LayoutInflater.inflate(int, android.view.ViewGroup, boolean):android.view.View} */
    public final /* bridge */ /* synthetic */ km a(ViewGroup viewGroup, int i) {
        return new chx(this, LayoutInflater.from(viewGroup.getContext()).inflate((int) R.layout.view_app_banner, viewGroup, false));
    }
}
