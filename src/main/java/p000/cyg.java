package p000;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyg */
/* compiled from: PG */
public final class cyg implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a */
    private final /* synthetic */ NotificationsPanelButtonView f7913a;

    public cyg(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.f7913a = notificationsPanelButtonView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.f7913a.f6639a.setTextColor(intValue);
        Drawable drawable = this.f7913a.f6640b;
        if (drawable != null) {
            drawable.setTint(intValue);
        }
    }
}
