package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: cxq  reason: default package */
/* compiled from: PG */
public final class cxq extends AnimatorListenerAdapter {
    private final /* synthetic */ InstantVideoView a;

    public cxq(InstantVideoView instantVideoView) {
        this.a = instantVideoView;
    }

    public final void onAnimationEnd(Animator animator) {
        InstantVideoView instantVideoView = this.a;
        instantVideoView.g = null;
        instantVideoView.a.setVisibility(8);
    }
}
