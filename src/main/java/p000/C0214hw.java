package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: hw */
/* compiled from: PG */
final class C0214hw extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0216hy f9514a;

    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9515b;

    /* renamed from: c */
    private final /* synthetic */ View f9516c;

    /* renamed from: d */
    private final /* synthetic */ C0219ia f9517d;

    public C0214hw(C0219ia iaVar, C0216hy hyVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9517d = iaVar;
        this.f9514a = hyVar;
        this.f9515b = viewPropertyAnimator;
        this.f9516c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9515b.setListener(null);
        this.f9516c.setAlpha(1.0f);
        this.f9516c.setTranslationX(0.0f);
        this.f9516c.setTranslationY(0.0f);
        this.f9517d.mo5324e(this.f9514a.f9522a);
        this.f9517d.f9544g.remove(this.f9514a.f9522a);
        this.f9517d.mo5230c();
    }
}
