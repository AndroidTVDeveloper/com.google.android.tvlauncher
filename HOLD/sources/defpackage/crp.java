package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: crp  reason: default package */
/* compiled from: PG */
final class crp extends AnimatorListenerAdapter {
    private final /* synthetic */ int a;
    private final /* synthetic */ crz b;

    public crp(crz crz, int i) {
        this.b = crz;
        this.a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.b.a(this.a);
    }

    public final void onAnimationStart(Animator animator) {
        this.b.b.b.setVisibility(0);
    }
}
