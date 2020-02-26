package defpackage;

import android.animation.ValueAnimator;
import androidx.leanback.widget.SearchOrbView;

/* renamed from: oq  reason: default package */
/* compiled from: PG */
public final class oq implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ SearchOrbView a;

    public oq(SearchOrbView searchOrbView) {
        this.a = searchOrbView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.a.a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
