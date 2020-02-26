package p000;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: py */
/* compiled from: PG */
final class C0432py extends Preference {

    /* renamed from: a */
    private long f10194a;

    public C0432py(Context context, List list, long j) {
        super(context);
        this.f1371y = R.layout.expand_button;
        mo1084a(C0129es.m7262b(this.f1356j, R.drawable.ic_arrow_down_24dp));
        this.f1364r = R.drawable.ic_arrow_down_24dp;
        mo1092b((int) R.string.expand_button_title);
        mo1083a(999);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        CharSequence charSequence = null;
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            CharSequence charSequence2 = preference.f1363q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (!arrayList.contains(preference.f1335B)) {
                if (!TextUtils.isEmpty(charSequence2)) {
                    if (charSequence != null) {
                        charSequence = this.f1356j.getString(R.string.summary_collapsed_preference_list, charSequence, charSequence2);
                    } else {
                        charSequence = charSequence2;
                    }
                }
            } else if (z) {
                arrayList.add((PreferenceGroup) preference);
            }
        }
        mo1078a(charSequence);
        this.f10194a = j + 1000000;
    }

    /* renamed from: e */
    public final long mo1103e() {
        return this.f10194a;
    }

    /* renamed from: a */
    public final void mo1069a(C0473rl rlVar) {
        super.mo1069a(rlVar);
        rlVar.f10259p = false;
    }
}
