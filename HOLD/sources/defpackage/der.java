package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: der  reason: default package */
/* compiled from: PG */
final class der extends AnimatorListenerAdapter {
    private final /* synthetic */ km a;
    private final /* synthetic */ ViewPropertyAnimator b;
    private final /* synthetic */ View c;
    private final /* synthetic */ dey d;

    public der(dey dey, km kmVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = dey;
        this.a = kmVar;
        this.b = viewPropertyAnimator;
        this.c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.setListener(null);
        this.c.setAlpha(1.0f);
        this.d.e(this.a);
        this.d.l.remove(this.a);
        this.d.c();
    }
}
