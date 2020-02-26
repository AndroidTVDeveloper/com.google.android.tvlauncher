package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.support.v7.widget.ActionBarOverlayLayout;

/* renamed from: gf  reason: default package */
/* compiled from: PG */
public final class gf extends AnimatorListenerAdapter {
    private final /* synthetic */ ActionBarOverlayLayout a;

    public gf(ActionBarOverlayLayout actionBarOverlayLayout) {
        this.a = actionBarOverlayLayout;
    }

    public final void onAnimationCancel(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.c = null;
        actionBarOverlayLayout.b = false;
    }

    public final void onAnimationEnd(Animator animator) {
        ActionBarOverlayLayout actionBarOverlayLayout = this.a;
        actionBarOverlayLayout.c = null;
        actionBarOverlayLayout.b = false;
    }
}
