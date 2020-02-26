package defpackage;

import android.transition.Transition;
import com.google.android.tvlauncher.inputs.InputsPanelActivity;

/* renamed from: cvq  reason: default package */
/* compiled from: PG */
public final class cvq implements Transition.TransitionListener {
    private final /* synthetic */ Runnable a;
    private final /* synthetic */ InputsPanelActivity b;

    public cvq(InputsPanelActivity inputsPanelActivity, Runnable runnable) {
        this.b = inputsPanelActivity;
        this.a = runnable;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        this.a.run();
    }

    public final void onTransitionStart(Transition transition) {
        this.b.getWindow().setDimAmount(0.0f);
    }
}
