package p000;

import android.transition.Transition;
import com.google.android.tvlauncher.settings.FavoriteLaunchItemsActivity;

/* renamed from: czo */
/* compiled from: PG */
public final class czo implements Transition.TransitionListener {

    /* renamed from: a */
    private final /* synthetic */ FavoriteLaunchItemsActivity f7995a;

    public czo(FavoriteLaunchItemsActivity favoriteLaunchItemsActivity) {
        this.f7995a = favoriteLaunchItemsActivity;
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
        this.f7995a.getWindow().setDimAmount(0.0f);
    }
}
