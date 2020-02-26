package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: deu */
/* compiled from: PG */
final class deu extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ dew f8407a;

    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f8408b;

    /* renamed from: c */
    private final /* synthetic */ View f8409c;

    /* renamed from: d */
    private final /* synthetic */ dey f8410d;

    public deu(dey dey, dew dew, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f8410d = dey;
        this.f8407a = dew;
        this.f8408b = viewPropertyAnimator;
        this.f8409c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8408b.setListener(null);
        this.f8409c.setAlpha(1.0f);
        this.f8409c.setTranslationX(0.0f);
        this.f8409c.setTranslationY(0.0f);
        this.f8410d.mo5324e(this.f8407a.f8415a);
        this.f8410d.f8435m.remove(this.f8407a.f8415a);
        this.f8410d.mo4193c();
    }
}
