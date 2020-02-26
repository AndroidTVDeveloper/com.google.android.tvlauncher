package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: cgw */
/* compiled from: PG */
public final class cgw extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ BannerView f5492a;

    public cgw(BannerView bannerView) {
        this.f5492a = bannerView;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.f5492a.f6396e.getAlpha() == 0.0f) {
            this.f5492a.f6396e.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.f5492a.f6396e.setVisibility(0);
    }
}
