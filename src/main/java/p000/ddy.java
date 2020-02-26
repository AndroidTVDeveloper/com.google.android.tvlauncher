package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: ddy */
/* compiled from: PG */
final class ddy extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ View f8355a;

    public ddy(View view) {
        this.f8355a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f8355a.setVisibility(0);
        animator.removeListener(this);
    }
}
