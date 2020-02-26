package p000;

import android.view.animation.Animation;

/* renamed from: chl */
/* compiled from: PG */
final class chl implements Animation.AnimationListener {

    /* renamed from: a */
    private final /* synthetic */ chm f5532a;

    public chl(chm chm) {
        this.f5532a = chm;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        chm chm = this.f5532a;
        chm.f5540f.removeView(chm.f5535a);
        this.f5532a.f5551q = null;
    }
}
