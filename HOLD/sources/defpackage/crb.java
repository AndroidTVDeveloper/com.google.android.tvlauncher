package defpackage;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: crb  reason: default package */
/* compiled from: PG */
public final class crb implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ HomeTopRowButton a;

    public crb(HomeTopRowButton homeTopRowButton) {
        this.a = homeTopRowButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ImageView imageView = this.a.f;
        if (imageView != null && imageView.getDrawable() != null) {
            this.a.f.getDrawable().setTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
