package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: cgv  reason: default package */
/* compiled from: PG */
public final class cgv extends ViewOutlineProvider {
    private final /* synthetic */ BannerView a;

    public cgv(BannerView bannerView) {
        this.a = bannerView;
    }

    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        BannerView bannerView = this.a;
        outline.setRoundRect(0, 0, width, bannerView.b, (float) bannerView.a);
    }
}
