package com.google.android.tvlauncher.settings;

import android.app.Activity;
import android.os.Bundle;

/* compiled from: PG */
public class HomeScreenSettingsActivity extends cfu {
    public HomeScreenSettingsActivity() {
        super(dhs.f8548l);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            getFragmentManager().beginTransaction().add(16908290, new czv()).commit();
        }
    }

    /* access modifiers changed from: protected */
    public final void onResume() {
        super.onResume();
        dcy.m6187a((Activity) this);
    }
}
