package com.google.android.tvlauncher.settings;

import android.content.Context;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class AppBannerDrillDownPreference extends Preference {

    /* renamed from: a */
    public boolean f6683a;

    /* renamed from: b */
    private float f6684b;

    public AppBannerDrillDownPreference(Context context) {
        super(context);
        this.f1371y = R.layout.view_app_banner_drill_down_preference;
        this.f6684b = dcy.m6184a(context.getResources(), (int) R.dimen.preference_app_banner_disabled_alpha);
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        int i;
        super.mo1069a(rlVar);
        ImageView imageView = (ImageView) rlVar.mo5812c(16908294);
        imageView.setClipToOutline(true);
        imageView.setAlpha(!mo1106i() ? this.f6684b : 1.0f);
        if (!this.f6683a) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }
}
