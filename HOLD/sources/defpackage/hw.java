package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: hw  reason: default package */
/* compiled from: PG */
final class hw extends AnimatorListenerAdapter {
    private final /* synthetic */ hy a;
    private final /* synthetic */ ViewPropertyAnimator b;
    private final /* synthetic */ View c;
    private final /* synthetic */ ia d;

    public hw(ia iaVar, hy hyVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = iaVar;
        this.a = hyVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.c.setTranslationX(0.0f);
        this.c.setTranslationY(0.0f);
        this.d.e(this.a.a);
        this.d.g.remove(this.a.a);
        this.d.c();
    }
}
