package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: chk  reason: default package */
/* compiled from: PG */
final class chk extends AnimatorListenerAdapter {
    private final /* synthetic */ chm a;

    public chk(chm chm) {
        this.a = chm;
    }

    public final void onAnimationEnd(Animator animator) {
        chm chm = this.a;
        chm.f.removeView(chm.a);
        this.a.q = null;
    }
}
