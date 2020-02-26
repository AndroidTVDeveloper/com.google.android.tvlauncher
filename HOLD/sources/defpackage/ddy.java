package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: ddy  reason: default package */
/* compiled from: PG */
final class ddy extends AnimatorListenerAdapter {
    private final /* synthetic */ View a;

    public ddy(View view) {
        this.a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        animator.removeListener(this);
    }
}
