package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: chk */
/* compiled from: PG */
final class chk extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ chm f5531a;

    public chk(chm chm) {
        this.f5531a = chm;
    }

    public final void onAnimationEnd(Animator animator) {
        chm chm = this.f5531a;
        chm.f5540f.removeView(chm.f5535a);
        this.f5531a.f5551q = null;
    }
}
