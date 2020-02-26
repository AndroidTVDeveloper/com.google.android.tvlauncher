package defpackage;

import android.app.Fragment;
import com.google.android.tvlauncher.settings.AppChannelPermissionActivity;

/* renamed from: cza  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cza implements Runnable {
    private final AppChannelPermissionActivity a;
    private final Fragment b;

    public cza(AppChannelPermissionActivity appChannelPermissionActivity, Fragment fragment) {
        this.a = appChannelPermissionActivity;
        this.b = fragment;
    }

    public final void run() {
        AppChannelPermissionActivity appChannelPermissionActivity = this.a;
        appChannelPermissionActivity.getFragmentManager().beginTransaction().remove(this.b).commitNow();
    }
}
