package com.google.android.tvlauncher.settings;

import android.content.Context;
import androidx.preference.PreferenceCategory;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public class SummaryPreferenceCategory extends PreferenceCategory {
    private boolean e;

    public SummaryPreferenceCategory(Context context) {
        super(context);
        this.y = R.layout.preference_category_with_summary;
    }

    public final boolean i() {
        return this.e;
    }

    public final void a(rl rlVar) {
        super.a(rlVar);
        rlVar.a.setEnabled(this.e);
    }

    public final void d(boolean z) {
        this.e = z;
        if (this.u != z) {
            this.u = z;
            a(c());
            b();
        }
    }
}
