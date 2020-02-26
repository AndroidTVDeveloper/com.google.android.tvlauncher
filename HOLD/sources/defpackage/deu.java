package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: deu  reason: default package */
/* compiled from: PG */
final class deu extends AnimatorListenerAdapter {
    private final /* synthetic */ dew a;
    private final /* synthetic */ ViewPropertyAnimator b;
    private final /* synthetic */ View c;
    private final /* synthetic */ dey d;

    public deu(dey dey, dew dew, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.d = dey;
        this.a = dew;
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
        this.d.m.remove(this.a.a);
        this.d.c();
    }
}
