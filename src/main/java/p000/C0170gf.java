package p000;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.p002v7.widget.ActionBarOverlayLayout;

/* renamed from: gf */
/* compiled from: PG */
public final class C0170gf extends AnimatorListenerAdapter {

    /* renamed from: a */
    private final /* synthetic */ ActionBarOverlayLayout f9394a;

    public C0170gf(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.f9394a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9394a;
        actionBarOverlayLayout.f989c = null;
        actionBarOverlayLayout.f988b = false;
    }

    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.f9394a;
        actionBarOverlayLayout.f989c = null;
        actionBarOverlayLayout.f988b = false;
    }
}
