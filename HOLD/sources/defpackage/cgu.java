package defpackage;

import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: cgu  reason: default package */
/* compiled from: PG */
public final class cgu extends ViewOutlineProvider {
    private final /* synthetic */ BannerView a;

    public cgu(BannerView bannerView) {
        this.a = bannerView;
    }

    public final void getOutline(View view, Outline outline) {
        outline.setRoundRect(0, 0, view.getWidth(), view.getHeight(), (float) this.a.a);
    }
}
