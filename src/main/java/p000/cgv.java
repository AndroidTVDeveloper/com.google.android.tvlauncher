package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: cgv */
/* compiled from: PG */
public final class cgv extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ BannerView f5491a;

    public cgv(BannerView bannerView) {
        this.f5491a = bannerView;
    }

    public final void getOutline(View view, Outline outline) {
        int width = view.getWidth();
        BannerView bannerView = this.f5491a;
        outline.setRoundRect(0, 0, width, bannerView.f6393b, (float) bannerView.f6392a);
    }
}
