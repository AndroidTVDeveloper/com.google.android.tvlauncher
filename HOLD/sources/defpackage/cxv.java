package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;

/* renamed from: cxv  reason: default package */
/* compiled from: PG */
final class cxv extends AnimatorListenerAdapter {
    private final /* synthetic */ km a;
    private final /* synthetic */ cxw b;
    private final /* synthetic */ cxx c;

    public cxv(cxx cxx, km kmVar, cxw cxw) {
        this.c = cxx;
        this.a = kmVar;
        this.b = cxw;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        dei.a(this.a.a, this.b.e);
        NotificationPanelItemView notificationPanelItemView = (NotificationPanelItemView) this.a.a;
        cxw cxw = this.b;
        notificationPanelItemView.o.setTranslationX(0.0f);
        notificationPanelItemView.o.setAlpha(cxw.h);
        this.c.e(this.a);
        this.c.c.remove(this.a);
        this.c.c();
    }
}
