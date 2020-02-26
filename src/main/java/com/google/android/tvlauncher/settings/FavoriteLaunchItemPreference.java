package com.google.android.tvlauncher.settings;

import android.content.Context;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class FavoriteLaunchItemPreference extends Preference {
    public FavoriteLaunchItemPreference(Context context) {
        super(context);
        this.f1371y = R.layout.favorite_app_preference;
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        ((ImageView) rlVar.mo5812c(16908294)).setClipToOutline(true);
    }
}
