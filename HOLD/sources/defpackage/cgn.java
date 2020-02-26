package defpackage;

import android.transition.Transition;
import com.google.android.tvlauncher.appsview.AppsViewActivity;

/* renamed from: cgn  reason: default package */
/* compiled from: PG */
public final class cgn implements Transition.TransitionListener {
    private final /* synthetic */ AppsViewActivity a;

    public cgn(AppsViewActivity appsViewActivity) {
        this.a = appsViewActivity;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        cgn.super.finish();
    }

    public final void onTransitionStart(Transition transition) {
        this.a.getWindow().setDimAmount(0.0f);
    }
}
