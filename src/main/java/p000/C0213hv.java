package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: hv */
/* compiled from: PG */
final class C0213hv extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f9508a;

    /* renamed from: b */
    private final /* synthetic */ int f9509b;

    /* renamed from: c */
    private final /* synthetic */ View f9510c;

    /* renamed from: d */
    private final /* synthetic */ int f9511d;

    /* renamed from: e */
    private final /* synthetic */ ViewPropertyAnimator f9512e;

    /* renamed from: f */
    private final /* synthetic */ C0219ia f9513f;

    public C0213hv(C0219ia iaVar, C0285km kmVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f9513f = iaVar;
        this.f9508a = kmVar;
        this.f9509b = i;
        this.f9510c = view;
        this.f9511d = i2;
        this.f9512e = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f9509b != 0) {
            this.f9510c.setTranslationX(0.0f);
        }
        if (this.f9511d != 0) {
            this.f9510c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f9512e.setListener(null);
        this.f9513f.mo5324e(this.f9508a);
        this.f9513f.f9542e.remove(this.f9508a);
        this.f9513f.mo5230c();
    }
}
