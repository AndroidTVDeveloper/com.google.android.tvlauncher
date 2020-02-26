package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import com.google.android.tvlauncher.notifications.NotificationsPanelButtonView;

/* renamed from: cyg  reason: default package */
/* compiled from: PG */
public final class cyg implements ValueAnimator.AnimatorUpdateListener {
    private final /* synthetic */ NotificationsPanelButtonView a;

    public cyg(NotificationsPanelButtonView notificationsPanelButtonView) {
        this.a = notificationsPanelButtonView;
    }

    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        this.a.a.setTextColor(intValue);
        Drawable drawable = this.a.b;
        if (drawable != null) {
            drawable.setTint(intValue);
        }
    }
}
