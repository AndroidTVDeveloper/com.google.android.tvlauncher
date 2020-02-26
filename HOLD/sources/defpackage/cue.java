package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cue  reason: default package */
/* compiled from: PG */
public final class cue extends AnimatorListenerAdapter {
    private final /* synthetic */ ChannelView a;

    public cue(ChannelView channelView) {
        this.a = channelView;
    }

    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        this.a.y.start();
    }
}
