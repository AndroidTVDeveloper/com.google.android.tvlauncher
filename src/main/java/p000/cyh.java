package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyh */
/* compiled from: PG */
public final class cyh implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsPanelButtonView f7914a;

    public cyh(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.f7914a = notificationsPanelButtonView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f7914a.f6639a.setTextColor(intValue);
        Drawable drawable = this.f7914a.f6640b;
        if (drawable != null) {
            drawable.setTint(intValue);
        }
    }
}
