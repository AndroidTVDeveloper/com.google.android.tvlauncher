package com.google.android.tvlauncher.settings;

import android.content.Context;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class AppBannerDrillDownPreference extends Preference {
    public boolean a;
    private float b;

    public AppBannerDrillDownPreference(Context context) {
        super(context);
        this.y = R.layout.view_app_banner_drill_down_preference;
        this.b = dcy.a(context.getResources(), (int) R.dimen.preference_app_banner_disabled_alpha);
    }

    public final void a(rl rlVar) {
        int i;
        super.a(rlVar);
        ImageView imageView = (ImageView) rlVar.c(16908294);
        imageView.setClipToOutline(true);
        imageView.setAlpha(!i() ? this.b : 1.0f);
        if (!this.a) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
    }
}
