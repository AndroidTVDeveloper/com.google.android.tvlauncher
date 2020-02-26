package defpackage;

import android.app.Fragment;
import com.google.android.tvlauncher.settings.FavoriteLaunchItemsActivity;

/* renamed from: czn  reason: default package */
/* compiled from: PG */
public final class czn implements Runnable {
    private final /* synthetic */ Fragment a;
    private final /* synthetic */ FavoriteLaunchItemsActivity b;

    public czn(FavoriteLaunchItemsActivity favoriteLaunchItemsActivity, Fragment fragment) {
        this.b = favoriteLaunchItemsActivity;
        this.a = fragment;
    }

    public final void run() {
        this.b.getFragmentManager().beginTransaction().remove(this.a).commitNow();
    }
}
