package p000;

import android.app.AlertDialog;
import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: qh */
/* compiled from: PG */
public final class C0442qh extends C0451qq {

    /* renamed from: a */
    public final Set f10203a = new HashSet();

    /* renamed from: b */
    public boolean f10204b;

    /* renamed from: c */
    public CharSequence[] f10205c;

    /* renamed from: e */
    private CharSequence[] f10206e;

    /* renamed from: c */
    private final MultiSelectListPreference m8226c() {
        return (MultiSelectListPreference) mo5785b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference c = m8226c();
            if (c.f1331g == null || c.f1332h == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.f10203a.clear();
            this.f10203a.addAll(c.f1333i);
            this.f10204b = false;
            this.f10206e = c.f1331g;
            this.f10205c = c.f1332h;
            return;
        }
        this.f10203a.clear();
        this.f10203a.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
        this.f10204b = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
        this.f10206e = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
        this.f10205c = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo5766a(boolean z) {
        MultiSelectListPreference c = m8226c();
        if (z && this.f10204b) {
            Set set = this.f10203a;
            if (c.mo1095b((Object) set)) {
                c.mo1082a(set);
            }
        }
        this.f10204b = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5774a(AlertDialog.Builder builder) {
        int length = this.f10205c.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.f10203a.contains(this.f10205c[i].toString());
        }
        builder.setMultiChoiceItems(this.f10206e, zArr, new C0441qg(this));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList(this.f10203a));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.f10204b);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.f10206e);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.f10205c);
    }
}
