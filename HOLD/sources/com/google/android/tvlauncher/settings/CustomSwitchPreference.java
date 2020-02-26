package com.google.android.tvlauncher.settings;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
public class CustomSwitchPreference extends SwitchPreference {
    public boolean d = true;
    public boolean e;

    public CustomSwitchPreference(Context context) {
        super(context);
    }

    public void a(rl rlVar) {
        super.a(rlVar);
        boolean z = false;
        rlVar.c(16908352).setVisibility(!this.d ? 4 : 0);
        rlVar.a.setClickable(this.d);
        TextView textView = (TextView) rlVar.c(16908304);
        if (i() && !this.e) {
            z = true;
        }
        textView.setEnabled(z);
    }
}
