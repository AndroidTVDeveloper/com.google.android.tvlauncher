package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: des  reason: default package */
/* compiled from: PG */
final class des extends AnimatorListenerAdapter {
    private final /* synthetic */ km a;
    private final /* synthetic */ View b;
    private final /* synthetic */ ViewPropertyAnimator c;
    private final /* synthetic */ dey d;

    public des(dey dey, km kmVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.d = dey;
        this.a = kmVar;
        this.b = view;
        this.c = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.c.setListener(null);
        this.d.e(this.a);
        this.d.g.remove(this.a);
        this.d.c();
    }
}
