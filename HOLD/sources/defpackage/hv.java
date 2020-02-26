package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: hv  reason: default package */
/* compiled from: PG */
final class hv extends AnimatorListenerAdapter {
    private final /* synthetic */ km a;
    private final /* synthetic */ int b;
    private final /* synthetic */ View c;
    private final /* synthetic */ int d;
    private final /* synthetic */ ViewPropertyAnimator e;
    private final /* synthetic */ ia f;

    public hv(ia iaVar, km kmVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f = iaVar;
        this.a = kmVar;
        this.b = i;
        this.c = view;
        this.d = i2;
        this.e = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.b != 0) {
            this.c.setTranslationX(0.0f);
        }
        if (this.d != 0) {
            this.c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.e.setListener(null);
        this.f.e(this.a);
        this.f.e.remove(this.a);
        this.f.c();
    }
}
