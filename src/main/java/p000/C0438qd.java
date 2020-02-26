package p000;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.preference.ListPreference;

@Deprecated
/* renamed from: qd */
/* compiled from: PG */
public final class C0438qd extends C0451qq {

    /* renamed from: a */
    public int f10198a;

    /* renamed from: b */
    private CharSequence[] f10199b;

    /* renamed from: c */
    private CharSequence[] f10200c;

    /* renamed from: c */
    private final ListPreference m8223c() {
        return (ListPreference) mo5785b();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            ListPreference c = m8223c();
            if (c.f1328g == null || c.f1329h == null) {
                throw new IllegalStateException("ListPreference requires an entries array and an entryValues array.");
            }
            this.f10198a = c.mo1079b(c.f1330i);
            this.f10199b = c.f1328g;
            this.f10200c = c.f1329h;
            return;
        }
        this.f10198a = bundle.getInt("ListPreferenceDialogFragment.index", 0);
        this.f10199b = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entries");
        this.f10200c = bundle.getCharSequenceArray("ListPreferenceDialogFragment.entryValues");
    }

    @Deprecated
    /* renamed from: a */
    public final void mo5766a(boolean z) {
        int i;
        ListPreference c = m8223c();
        if (z && (i = this.f10198a) >= 0) {
            String charSequence = this.f10200c[i].toString();
            if (c.mo1095b((Object) charSequence)) {
                c.mo1075a(charSequence);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5774a(AlertDialog.Builder builder) {
        builder.setSingleChoiceItems(this.f10199b, this.f10198a, new C0437qc(this));
        builder.setPositiveButton((CharSequence) null, (DialogInterface.OnClickListener) null);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("ListPreferenceDialogFragment.index", this.f10198a);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entries", this.f10199b);
        bundle.putCharSequenceArray("ListPreferenceDialogFragment.entryValues", this.f10200c);
    }
}
