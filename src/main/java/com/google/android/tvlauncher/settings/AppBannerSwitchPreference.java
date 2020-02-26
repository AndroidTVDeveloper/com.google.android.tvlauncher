package com.google.android.tvlauncher.settings;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class AppBannerSwitchPreference extends CustomSwitchPreference {

    /* renamed from: c */
    public boolean f6685c;

    /* renamed from: f */
    private float f6686f;

    public AppBannerSwitchPreference(Context context) {
        super(context);
        this.f1371y = R.layout.appchannel_app_banner;
        this.f6686f = dcy.m6184a(context.getResources(), (int) R.dimen.preference_app_banner_disabled_alpha);
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        float f;
        int i;
        super.mo1069a(rlVar);
        ImageView imageView = (ImageView) rlVar.mo5812c(16908294);
        imageView.setClipToOutline(true);
        if (!mo1106i()) {
            f = this.f6686f;
        } else {
            f = 1.0f;
        }
        imageView.setAlpha(f);
        View c = rlVar.mo5812c(R.id.icon_container);
        if (!this.f6685c) {
            i = 8;
        } else {
            i = 0;
        }
        c.setVisibility(i);
    }
}
