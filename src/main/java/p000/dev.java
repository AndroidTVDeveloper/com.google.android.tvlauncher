package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* renamed from: dev */
/* compiled from: PG */
final class dev extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ dew f8411a;

    /* renamed from: b */
    private final /* synthetic */ ViewPropertyAnimator f8412b;

    /* renamed from: c */
    private final /* synthetic */ View f8413c;

    /* renamed from: d */
    private final /* synthetic */ dey f8414d;

    public dev(dey dey, dew dew, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.f8414d = dey;
        this.f8411a = dew;
        this.f8412b = viewPropertyAnimator;
        this.f8413c = view;
    }

    public final void onAnimationStart(Animator animator) {
    }

    public final void onAnimationEnd(Animator animator) {
        this.f8412b.setListener(null);
        this.f8413c.setAlpha(1.0f);
        this.f8413c.setTranslationX(0.0f);
        this.f8413c.setTranslationY(0.0f);
        this.f8414d.mo5324e(this.f8411a.f8416b);
        this.f8414d.f8435m.remove(this.f8411a.f8416b);
        this.f8414d.mo4193c();
    }
}
