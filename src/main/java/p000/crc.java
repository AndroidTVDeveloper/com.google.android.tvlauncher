package p000;

import android.animation.ValueAnimator;
import android.widget.ImageView;
import com.google.android.tvlauncher.home.HomeTopRowButton;

/* renamed from: crc */
/* compiled from: PG */
public final class crc implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ HomeTopRowButton f7067a;

    public crc(HomeTopRowButton homeTopRowButton) {
        this.f7067a = homeTopRowButton;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        ImageView imageView = this.f7067a.f6440f;
        if (imageView != null && imageView.getDrawable() != null) {
            this.f7067a.f6440f.getDrawable().setTint(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }
}
