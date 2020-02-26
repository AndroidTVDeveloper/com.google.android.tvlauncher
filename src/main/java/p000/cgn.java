package p000;

import android.transition.Transition;
import com.google.android.tvlauncher.appsview.AppsViewActivity;

/* renamed from: cgn */
/* compiled from: PG */
public final class cgn implements Transition.TransitionListener {

    /* renamed from: a */
    private final /* synthetic */ AppsViewActivity f5473a;

    public cgn(AppsViewActivity appsViewActivity) {
        this.f5473a = appsViewActivity;
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
        this.f5473a.getWindow().setDimAmount(0.0f);
    }
}
