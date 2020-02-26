package p000;

import android.app.Fragment;
import com.google.android.tvlauncher.settings.AppChannelPermissionActivity;

/* renamed from: cza */
/* compiled from: PG */
public final /* synthetic */ class cza implements Runnable {

    /* renamed from: a */
    private final AppChannelPermissionActivity f7953a;

    /* renamed from: b */
    private final Fragment f7954b;

    public cza(AppChannelPermissionActivity appChannelPermissionActivity, Fragment fragment) {
        this.f7953a = appChannelPermissionActivity;
        this.f7954b = fragment;
    }

    public final void run() {
        AppChannelPermissionActivity appChannelPermissionActivity = this.f7953a;
        appChannelPermissionActivity.getFragmentManager().beginTransaction().remove(this.f7954b).commitNow();
    }
}
