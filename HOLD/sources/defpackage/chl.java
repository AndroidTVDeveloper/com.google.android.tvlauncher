package defpackage;

import android.view.animation.Animation;

/* renamed from: chl  reason: default package */
/* compiled from: PG */
final class chl implements Animation.AnimationListener {
    private final /* synthetic */ chm a;

    public chl(chm chm) {
        this.a = chm;
    }

    public final void onAnimationRepeat(Animation animation) {
    }

    public final void onAnimationStart(Animation animation) {
    }

    public final void onAnimationEnd(Animation animation) {
        chm chm = this.a;
        chm.f.removeView(chm.a);
        this.a.q = null;
    }
}
