package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: ht */
/* compiled from: PG */
final class C0211ht extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f9500a;

    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f9501b;

    /* renamed from: c */
    private final /* synthetic */ View f9502c;

    /* renamed from: d */
    private final /* synthetic */ C0219ia f9503d;

    public C0211ht(C0219ia iaVar, C0285km kmVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f9503d = iaVar;
        this.f9500a = kmVar;
        this.f9501b = viewPropertyAnimator;
        this.f9502c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9501b.setListener(null);
        this.f9502c.setAlpha(1.0f);
        this.f9503d.mo5324e(this.f9500a);
        this.f9503d.f9543f.remove(this.f9500a);
        this.f9503d.mo5230c();
    }
}
