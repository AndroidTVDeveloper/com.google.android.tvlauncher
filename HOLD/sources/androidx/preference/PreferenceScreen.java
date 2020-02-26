package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public final class PreferenceScreen extends PreferenceGroup {
    public boolean e = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, bg.a(context, (int) R.attr.preferenceScreenStyle, 16842891));
    }

    public final boolean t() {
        return false;
    }

    /* access modifiers changed from: protected */
    public final void a() {
        rg rgVar;
        if (this.t == null && g() != 0 && (rgVar = this.k.e) != null) {
            rgVar.X();
        }
    }
}
