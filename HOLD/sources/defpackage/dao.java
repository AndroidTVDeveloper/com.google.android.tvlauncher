package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dao  reason: default package */
/* compiled from: PG */
final class dao extends AnimatorListenerAdapter {
    private final /* synthetic */ daw a;

    public dao(daw daw) {
        this.a = daw;
    }

    public final void onAnimationEnd(Animator animator) {
        daw daw = this.a;
        daw.g.removeView(daw.j);
    }
}
