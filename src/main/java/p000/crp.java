package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: crp */
/* compiled from: PG */
final class crp extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ int f7073a;

    /* renamed from: b */
    private final /* synthetic */ crz f7074b;

    public crp(crz crz, int i) {
        this.f7074b = crz;
        this.f7073a = i;
    }

    public final void onAnimationEnd(Animator animator) {
        this.f7074b.mo3675a(this.f7073a);
    }

    public final void onAnimationStart(Animator animator) {
        this.f7074b.f7133b.f6566b.setVisibility(0);
    }
}
