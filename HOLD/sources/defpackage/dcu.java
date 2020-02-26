package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: dcu  reason: default package */
/* compiled from: PG */
final class dcu extends AnimatorListenerAdapter {
    private final /* synthetic */ dcw a;

    public dcu(dcw dcw) {
        this.a = dcw;
    }

    public final void onAnimationEnd(Animator animator) {
        this.a.b();
    }
}
