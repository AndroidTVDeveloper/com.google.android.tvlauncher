package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: cgw  reason: default package */
/* compiled from: PG */
public final class cgw extends AnimatorListenerAdapter {
    private final /* synthetic */ BannerView a;

    public cgw(BannerView bannerView) {
        this.a = bannerView;
    }

    public final void onAnimationEnd(Animator animator) {
        if (this.a.e.getAlpha() == 0.0f) {
            this.a.e.setVisibility(4);
        }
    }

    public final void onAnimationStart(Animator animator) {
        this.a.e.setVisibility(0);
    }
}
