package defpackage;

import android.app.AlertDialog;
import android.os.Bundle;
import androidx.preference.MultiSelectListPreference;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: qh  reason: default package */
/* compiled from: PG */
public final class qh extends qq {
    public final Set a = new HashSet();
    public boolean b;
    public CharSequence[] c;
    private CharSequence[] e;

    private final MultiSelectListPreference c() {
        return (MultiSelectListPreference) b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            MultiSelectListPreference c2 = c();
            if (c2.g == null || c2.h == null) {
                throw new IllegalStateException("MultiSelectListPreference requires an entries array and an entryValues array.");
            }
            this.a.clear();
            this.a.addAll(c2.i);
            this.b = false;
            this.e = c2.g;
            this.c = c2.h;
            return;
        }
        this.a.clear();
        this.a.addAll(bundle.getStringArrayList("MultiSelectListPreferenceDialogFragment.values"));
        this.b = bundle.getBoolean("MultiSelectListPreferenceDialogFragment.changed", false);
        this.e = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries");
        this.c = bundle.getCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues");
    }

    @Deprecated
    public final void a(boolean z) {
        MultiSelectListPreference c2 = c();
        if (z && this.b) {
            Set set = this.a;
            if (c2.b((Object) set)) {
                c2.a(set);
            }
        }
        this.b = false;
    }

    /* access modifiers changed from: protected */
    public final void a(AlertDialog.Builder builder) {
        int length = this.c.length;
        boolean[] zArr = new boolean[length];
        for (int i = 0; i < length; i++) {
            zArr[i] = this.a.contains(this.c[i].toString());
        }
        builder.setMultiChoiceItems(this.e, zArr, new qg(this));
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putStringArrayList("MultiSelectListPreferenceDialogFragment.values", new ArrayList(this.a));
        bundle.putBoolean("MultiSelectListPreferenceDialogFragment.changed", this.b);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entries", this.e);
        bundle.putCharSequenceArray("MultiSelectListPreferenceDialogFragment.entryValues", this.c);
    }
}
