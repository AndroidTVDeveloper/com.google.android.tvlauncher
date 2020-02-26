package defpackage;

import android.animation.ValueAnimator;
import androidx.leanback.widget.SearchOrbView;

/* renamed from: or  reason: default package */
/* compiled from: PG */
public final class or implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ SearchOrbView a;

    public or(SearchOrbView searchOrbView) {
        this.a = searchOrbView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(valueAnimator.getAnimatedFraction());
    }
}
