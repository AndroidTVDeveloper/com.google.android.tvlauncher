package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: det */
/* compiled from: PG */
final class det extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ C0285km f8401a;

    /* renamed from: b */
    private final /* synthetic */ int f8402b;

    /* renamed from: c */
    private final /* synthetic */ View f8403c;

    /* renamed from: d */
    private final /* synthetic */ int f8404d;

    /* renamed from: e */
    private final /* synthetic */ ViewPropertyAnimator f8405e;

    /* renamed from: f */
    private final /* synthetic */ dey f8406f;

    public det(dey dey, C0285km kmVar, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
        this.f8406f = dey;
        this.f8401a = kmVar;
        this.f8402b = i;
        this.f8403c = view;
        this.f8404d = i2;
        this.f8405e = viewPropertyAnimator;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationCancel(Animator animator) {
        if (this.f8402b != 0) {
            this.f8403c.setTranslationX(0.0f);
        }
        if (this.f8404d != 0) {
            this.f8403c.setTranslationY(0.0f);
        }
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8405e.setListener(null);
        this.f8406f.mo5324e(this.f8401a);
        this.f8406f.f8433k.remove(this.f8401a);
        this.f8406f.mo4193c();
    }
}
