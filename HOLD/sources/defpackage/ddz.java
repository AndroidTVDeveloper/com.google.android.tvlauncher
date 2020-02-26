package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: ddz  reason: default package */
/* compiled from: PG */
final class ddz extends AnimatorListenerAdapter {
    private final /* synthetic */ View a;

    public ddz(View view) {
        this.a = view;
    }

    public final void onAnimationStart(Animator animator) {
        this.a.setVisibility(0);
        animator.removeListener(this);
    }
}
