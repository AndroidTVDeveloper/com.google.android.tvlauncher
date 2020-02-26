package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.ListPreference;

@Deprecated
/* renamed from: qd  reason: default package */
/* compiled from: PG */
public final class qd extends qq {
    public int a;
    private CharSequence[] b;
    private CharSequence[] c;

    private final ListPreference c() {
        return (ListPreference) b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference c2 = c();
            if (c2.g == null || c2.h == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.a = c2.b(c2.i);
            this.b = c2.g;
            this.c = c2.h;
            return;
        }
        this.a = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.b = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.c = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Deprecated
    public final void a(boolean z) {
        int i;
        ListPreference c2 = c();
        if (z && (i = this.a) >= 0) {
            String charSequence = this.c[i].toString();
            if (c2.b((Object) charSequence)) {
                c2.a(charSequence);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.b, this.a, new qc(this));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.a);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.b);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.c);
    }
}
