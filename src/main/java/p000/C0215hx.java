package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: hx */
/* compiled from: PG */
final class C0215hx extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0216hy f9518a;

    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9519b;

    /* renamed from: c */
    private final /* synthetic */ View f9520c;

    /* renamed from: d */
    private final /* synthetic */ C0219ia f9521d;

    public C0215hx(C0219ia iaVar, C0216hy hyVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9521d = iaVar;
        this.f9518a = hyVar;
        this.f9519b = viewPropertyAnimator;
        this.f9520c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9519b.setListener(null);
        this.f9520c.setAlpha(1.0f);
        this.f9520c.setTranslationX(0.0f);
        this.f9520c.setTranslationY(0.0f);
        this.f9521d.mo5324e(this.f9518a.f9523b);
        this.f9521d.f9544g.remove(this.f9518a.f9523b);
        this.f9521d.mo5230c();
    }
}
