package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: hu */
/* compiled from: PG */
final class C0212hu extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f9504a;

    /* renamed from: b */
    private final /* synthetic */ View f9505b;

    /* renamed from: c */
    private final /* synthetic */ ViewPropertyAnimator f9506c;

    /* renamed from: d */
    private final /* synthetic */ C0219ia f9507d;

    public C0212hu(C0219ia iaVar, C0285km kmVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9507d = iaVar;
        this.f9504a = kmVar;
        this.f9505b = view;
        this.f9506c = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        this.f9505b.setAlpha(1.0f);
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9506c.setListener(null);
        this.f9507d.mo5324e(this.f9504a);
        this.f9507d.f9541d.remove(this.f9504a);
        this.f9507d.mo5230c();
    }
}
