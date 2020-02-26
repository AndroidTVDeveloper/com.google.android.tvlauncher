package p000;

import android.animation.ValueAnimator;
import com.google.android.tvlauncher.util.NowPlayingIndicatorView;

/* renamed from: dbw */
/* compiled from: PG */
public final class dbw implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ NowPlayingIndicatorView f8172a;

    public dbw(NowPlayingIndicatorView nowPlayingIndicatorView) {
        this.f8172a = nowPlayingIndicatorView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f8172a.f6691a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        this.f8172a.invalidate();
    }
}
