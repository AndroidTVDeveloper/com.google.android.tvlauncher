package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: ddz */
/* compiled from: PG */
final class ddz extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ View f8356a;

    public ddz(View view) {
        this.f8356a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.f8356a.setVisibility(0);
        animator.removeListener(this);
    }
}
