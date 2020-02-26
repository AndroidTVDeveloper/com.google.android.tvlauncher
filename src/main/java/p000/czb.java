package p000;

import android.transition.Transition;
import com.google.android.tvlauncher.settings.AppChannelPermissionActivity;

/* renamed from: czb */
/* compiled from: PG */
public final class czb implements Transition.TransitionListener {

    /* renamed from: a */
    private final /* synthetic */ AppChannelPermissionActivity f7955a;

    public czb(AppChannelPermissionActivity appChannelPermissionActivity) {
        this.f7955a = appChannelPermissionActivity;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        czb.super.finish();
    }

    public final void onTransitionStart(Transition transition) {
        this.f7955a.getWindow().setDimAmount(0.0f);
    }
}
