package com.google.android.tvlauncher.settings;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.transition.Scene;
import android.transition.Slide;
import android.transition.TransitionManager;
import android.view.ViewGroup;

/* compiled from: PG */
public class AppChannelPermissionActivity extends cfu {
    public AppChannelPermissionActivity() {
        super("ManageChannels");
    }

    public final void finish() {
        Fragment findFragmentByTag = getFragmentManager().findFragmentByTag("apps_channel_permission_fragment");
        if (findFragmentByTag == null || !findFragmentByTag.isResumed()) {
            super.finish();
            return;
        }
        Scene scene = new Scene((ViewGroup) findViewById(16908290));
        scene.setEnterAction(new cza(this, findFragmentByTag));
        Slide slide = new Slide(8388613);
        slide.addListener(new czb(this));
        TransitionManager.go(scene, slide);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            getFragmentManager().beginTransaction().add(16908290, new czc(), "apps_channel_permission_fragment").commit();
            TransitionManager.go(new Scene((ViewGroup) findViewById(16908290)), new Slide(8388613));
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.a((Activity) this);
    }
}
