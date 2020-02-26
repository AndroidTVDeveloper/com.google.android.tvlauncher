package com.google.android.tvlauncher.settings;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class AppBannerSwitchPreference extends CustomSwitchPreference {
    public boolean c;
    private float f;

    public AppBannerSwitchPreference(Context context) {
        super(context);
        this.y = R.layout.appchannel_app_banner;
        this.f = dcy.a(context.getResources(), (int) R.dimen.preference_app_banner_disabled_alpha);
    }

    public final void a(rl rlVar) {
        float f2;
        int i;
        super.a(rlVar);
        ImageView imageView = (ImageView) rlVar.c(16908294);
        imageView.setClipToOutline(true);
        if (!i()) {
            f2 = this.f;
        } else {
            f2 = 1.0f;
        }
        imageView.setAlpha(f2);
        View c2 = rlVar.c(R.id.icon_container);
        if (!this.c) {
            i = 8;
        } else {
            i = 0;
        }
        c2.setVisibility(i);
    }
}
