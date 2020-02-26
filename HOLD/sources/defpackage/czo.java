package defpackage;

import android.transition.Transition;
import com.google.android.tvlauncher.settings.FavoriteLaunchItemsActivity;

/* renamed from: czo  reason: default package */
/* compiled from: PG */
public final class czo implements Transition.TransitionListener {
    private final /* synthetic */ FavoriteLaunchItemsActivity a;

    public czo(FavoriteLaunchItemsActivity favoriteLaunchItemsActivity) {
        this.a = favoriteLaunchItemsActivity;
    }

    public final void onTransitionCancel(Transition transition) {
    }

    public final void onTransitionPause(Transition transition) {
    }

    public final void onTransitionResume(Transition transition) {
    }

    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
        czo.super.finish();
    }

    public final void onTransitionStart(Transition transition) {
        this.a.getWindow().setDimAmount(0.0f);
    }
}
