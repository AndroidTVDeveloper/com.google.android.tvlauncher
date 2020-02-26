package defpackage;

import android.animation.ValueAnimator;
import com.google.android.tvlauncher.util.NowPlayingIndicatorView;

/* renamed from: dbw  reason: default package */
/* compiled from: PG */
public final class dbw implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ NowPlayingIndicatorView a;

    public dbw(NowPlayingIndicatorView nowPlayingIndicatorView) {
        this.a = nowPlayingIndicatorView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.a.invalidate();
    }
}
