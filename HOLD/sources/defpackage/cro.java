package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: cro  reason: default package */
/* compiled from: PG */
public final class cro extends AnimatorListenerAdapter {
    private final /* synthetic */ crz a;

    public cro(crz crz) {
        this.a = crz;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b.b.setVisibility(8);
    }

    public final void onAnimationStart(Animator animator) {
        this.a.c.setVisibility(0);
    }
}
