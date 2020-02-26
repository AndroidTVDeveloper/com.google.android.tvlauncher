package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cue */
/* compiled from: PG */
public final class cue extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ ChannelView f7512a;

    public cue(ChannelView channelView) {
        this.f7512a = channelView;
    }

    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.f7512a.f6540y.start();
    }
}
