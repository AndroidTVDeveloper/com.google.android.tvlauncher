package com.google.android.tvlauncher.settings;

import android.content.Context;
import android.widget.ImageView;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class FavoriteLaunchItemPreference extends Preference {
    public FavoriteLaunchItemPreference(Context context) {
        super(context);
        this.y = R.layout.favorite_app_preference;
    }

    public final void a(rl rlVar) {
        super.a(rlVar);
        ((ImageView) rlVar.c(16908294)).setClipToOutline(true);
    }
}
