package defpackage;

import android.text.TextUtils;
import androidx.preference.ListPreference;
import androidx.preference.Preference;
import com.google.android.tvlauncher.R;

/* renamed from: qb  reason: default package */
/* compiled from: PG */
public final class qb implements qp {
    public static qb a;

    public final /* bridge */ /* synthetic */ CharSequence a(Preference preference) {
        ListPreference listPreference = (ListPreference) preference;
        if (TextUtils.isEmpty(listPreference.g())) {
            return listPreference.j.getString(R.string.not_set);
        }
        return listPreference.g();
    }
}
