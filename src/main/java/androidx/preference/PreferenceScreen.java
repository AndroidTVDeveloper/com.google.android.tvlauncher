package androidx.preference;

import android.content.Context;
import android.util.AttributeSet;
import com.google.android.tvlauncher.R;

/* compiled from: PG */
public final class PreferenceScreen extends PreferenceGroup {

    /* renamed from: e */
    public boolean f1381e = true;

    public PreferenceScreen(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, C0035bg.m3102a(context, (int) R.attr.preferenceScreenStyle, 16842891));
    }

    /* renamed from: t */
    public final boolean mo1124t() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1070a() {
        C0468rg rgVar;
        if (this.f1366t == null && mo1122g() != 0 && (rgVar = this.f1357k.f10251e) != null) {
            rgVar.mo5791X();
        }
    }
}
