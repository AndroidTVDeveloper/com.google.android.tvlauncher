package p000;

import android.text.TextUtils;
import androidx.preference.EditTextPreference;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* renamed from: pw */
/* compiled from: PG */
public final class C0430pw implements C0450qp {

    /* renamed from: a */
    public static C0430pw f10191a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo5764a(Preference preference) {
        EditTextPreference editTextPreference = (EditTextPreference) preference;
        return TextUtils.isEmpty(editTextPreference.f1325g) ? editTextPreference.f1356j.getString(R.string.not_set) : editTextPreference.f1325g;
    }
}
