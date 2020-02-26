package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.tvlauncher.notifications.NotificationPanelItemView;

/* renamed from: cxv */
/* compiled from: PG */
final class cxv extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f7887a;

    /* renamed from: b */
    private final /* synthetic */ cxw f7888b;

    /* renamed from: c */
    private final /* synthetic */ cxx f7889c;

    public cxv(cxx cxx, C0285km kmVar, cxw cxw) {
        this.f7889c = cxx;
        this.f7887a = kmVar;
        this.f7888b = cxw;
    }

    public final void onAnimationCancel(Animator animator) {
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        animator.removeListener(this);
        dei.m6237a(this.f7887a.f9783a, this.f7888b.f7890e);
        NotificationPanelItemView notificationPanelItemView = (NotificationPanelItemView) this.f7887a.f9783a;
        cxw cxw = this.f7888b;
        notificationPanelItemView.f6625o.setTranslationX(0.0f);
        notificationPanelItemView.f6625o.setAlpha(cxw.f7893h);
        this.f7889c.mo5324e(this.f7887a);
        this.f7889c.f8386c.remove(this.f7887a);
        this.f7889c.mo4193c();
    }
}
