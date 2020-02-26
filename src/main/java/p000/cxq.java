package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: cxq */
/* compiled from: PG */
public final class cxq extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ InstantVideoView f7854a;

    public cxq(InstantVideoView instantVideoView) {
        this.f7854a = instantVideoView;
    }

    public final void onAnimationEnd(Animator animator) {
        InstantVideoView instantVideoView = this.f7854a;
        instantVideoView.f6605g = null;
        instantVideoView.f6599a.setVisibility(8);
    }
}
