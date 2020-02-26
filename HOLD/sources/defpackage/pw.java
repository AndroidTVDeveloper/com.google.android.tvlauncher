package defpackage;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* renamed from: pw  reason: default package */
/* compiled from: PG */
public final class pw implements qp {
    public static pw a;

    public final /* bridge */ /* synthetic */ CharSequence a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.g) ? editTextPreference.j.getString(R.string.not_set) : editTextPreference.g;
    }
}
