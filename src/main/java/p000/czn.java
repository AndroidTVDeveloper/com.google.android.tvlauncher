package p000;

import android.app.Fragment;
import com.google.android.tvlauncher.settings.FavoriteLaunchItemsActivity;

/* renamed from: czn */
/* compiled from: PG */
public final class czn implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Fragment f7993a;

    /* renamed from: b */
    private final /* synthetic */ FavoriteLaunchItemsActivity f7994b;

    public czn(FavoriteLaunchItemsActivity favoriteLaunchItemsActivity, Fragment fragment) {
        this.f7994b = favoriteLaunchItemsActivity;
        this.f7993a = fragment;
    }

    public final void run() {
        this.f7994b.getFragmentManager().beginTransaction().remove(this.f7993a).commitNow();
    }
}
