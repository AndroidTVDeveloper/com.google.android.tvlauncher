package defpackage;

import android.transition.Transition;
import com.google.android.tvlauncher.settings.AppChannelPermissionActivity;

/* renamed from: czb  reason: default package */
/* compiled from: PG */
public final class czb implements Transition.TransitionListener {
    private final /* synthetic */ AppChannelPermissionActivity a;

    public czb(AppChannelPermissionActivity appChannelPermissionActivity) {
        this.a = appChannelPermissionActivity;
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
        this.a.getWindow().setDimAmount(0.0f);
    }
}
