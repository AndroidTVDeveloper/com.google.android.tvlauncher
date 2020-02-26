package p000;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: cgu */
/* compiled from: PG */
public final class cgu extends ViewOutlineProvider {

    /* renamed from: a */
    private final /* synthetic */ BannerView f5490a;

    public cgu(BannerView bannerView) {
        this.f5490a = bannerView;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.f5490a.f6392a);
    }
}
