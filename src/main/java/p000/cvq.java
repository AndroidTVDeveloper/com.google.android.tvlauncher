package p000;

import android.transition.Transition;
import com.google.android.tvlauncher.inputs.InputsPanelActivity;

/* renamed from: cvq */
/* compiled from: PG */
public final class cvq implements Transition.TransitionListener {

    /* renamed from: a */
    private final /* synthetic */ Runnable f7696a;

    /* renamed from: b */
    private final /* synthetic */ InputsPanelActivity f7697b;

    public cvq(InputsPanelActivity inputsPanelActivity, Runnable runnable) {
        this.f7697b = inputsPanelActivity;
        this.f7696a = runnable;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.f7696a.run();
    }

    public final void onTransitionStart(Transition transition) {
        this.f7697b.getWindow().setDimAmount(0.0f);
    }
}
