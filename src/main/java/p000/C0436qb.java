package p000;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* renamed from: qb */
/* compiled from: PG */
public final class C0436qb implements C0450qp {

    /* renamed from: a */
    public static C0436qb f10196a;

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ CharSequence mo5764a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.mo1081g())) {
            return listPreference.f1356j.getString(R.string.not_set);
        }
        return listPreference.mo1081g();
    }
}
