package p000;

import android.animation.ValueAnimator;
import androidx.leanback.widget.SearchOrbView;

/* renamed from: or */
/* compiled from: PG */
public final class C0398or implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ SearchOrbView f10087a;

    public C0398or(SearchOrbView searchOrbView) {
        this.f10087a = searchOrbView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10087a.mo1049a(valueAnimator.getAnimatedFraction());
    }
}
