package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: der */
/* compiled from: PG */
final class der extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f8393a;

    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f8394b;

    /* renamed from: c */
    private final /* synthetic */ View f8395c;

    /* renamed from: d */
    private final /* synthetic */ dey f8396d;

    public der(dey dey, C0285km kmVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f8396d = dey;
        this.f8393a = kmVar;
        this.f8394b = viewPropertyAnimator;
        this.f8395c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8394b.setListener(null);
        this.f8395c.setAlpha(1.0f);
        this.f8396d.mo5324e(this.f8393a);
        this.f8396d.f8434l.remove(this.f8393a);
        this.f8396d.mo4193c();
    }
}
