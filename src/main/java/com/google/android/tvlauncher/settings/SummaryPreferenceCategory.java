package com.google.android.tvlauncher.settings;

import android.content.Context;
import androidx.preference.PreferenceCategory;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SummaryPreferenceCategory extends PreferenceCategory {

    /* renamed from: e */
    private boolean f6689e;

    public SummaryPreferenceCategory(Context context) {
        super(context);
        this.f1371y = R.layout.preference_category_with_summary;
    }

    /* renamed from: i */
    public final boolean mo1106i() {
        return this.f6689e;
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        rlVar.f9783a.setEnabled(this.f6689e);
    }

    /* renamed from: d */
    public final void mo1131d(boolean z) {
        this.f6689e = z;
        if (this.f1367u != z) {
            this.f1367u = z;
            mo1090a(mo1076c());
            mo1071b();
        }
    }
}
