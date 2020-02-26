package com.google.android.tvlauncher.settings;

import android.content.Context;
import android.widget.TextView;
import androidx.preference.SwitchPreference;

/* compiled from: PG */
public class CustomSwitchPreference extends SwitchPreference {

    /* renamed from: d */
    public boolean f6687d = true;

    /* renamed from: e */
    public boolean f6688e;

    public CustomSwitchPreference(Context context) {
        super(context);
    }

    /* renamed from: a */
    public void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        boolean z = false;
        rlVar.mo5812c(16908352).setVisibility(!this.f6687d ? 4 : 0);
        rlVar.f9783a.setClickable(this.f6687d);
        TextView textView = (TextView) rlVar.mo5812c(16908304);
        if (mo1106i() && !this.f6688e) {
            z = true;
        }
        textView.setEnabled(z);
    }
}
