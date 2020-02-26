package p000;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: crb */
/* compiled from: PG */
public final class crb implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ HomeTopRowButton f7066a;

    public crb(HomeTopRowButton homeTopRowButton) {
        this.f7066a = homeTopRowButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ImageView imageView = this.f7066a.f6440f;
        if (imageView != null && imageView.getDrawable() != null) {
            this.f7066a.f6440f.getDrawable().setTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
