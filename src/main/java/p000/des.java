package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: des */
/* compiled from: PG */
final class des extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f8397a;

    /* renamed from: b */
    private final /* synthetic */ View f8398b;

    /* renamed from: c */
    private final /* synthetic */ ViewPropertyAnimator f8399c;

    /* renamed from: d */
    private final /* synthetic */ dey f8400d;

    public des(dey dey, C0285km kmVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f8400d = dey;
        this.f8397a = kmVar;
        this.f8398b = view;
        this.f8399c = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.f8398b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8399c.setListener(null);
        this.f8400d.mo5324e(this.f8397a);
        this.f8400d.f8432g.remove(this.f8397a);
        this.f8400d.mo4193c();
    }
}
