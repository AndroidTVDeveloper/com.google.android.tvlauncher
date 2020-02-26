package p000;

import android.animation.ValueAnimator;
import androidx.leanback.widget.SearchOrbView;

/* renamed from: oq */
/* compiled from: PG */
public final class C0397oq implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ SearchOrbView f10086a;

    public C0397oq(SearchOrbView searchOrbView) {
        this.f10086a = searchOrbView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        this.f10086a.mo1050a(((Integer) valueAnimator.getAnimatedValue()).intValue());
    }
}
