package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dao */
/* compiled from: PG */
final class dao extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ daw f8061a;

    public dao(daw daw) {
        this.f8061a = daw;
    }

    public final void onAnimationEnd(Animator animator) {
        daw daw = this.f8061a;
        daw.f8097g.removeView(daw.f8100j);
    }
}
