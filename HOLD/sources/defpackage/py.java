package defpackage;

import android.content.Context;
import android.text.TextUtils;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.google.android.tvlauncher.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: py  reason: default package */
/* compiled from: PG */
final class py extends Preference {
    private long a;

    public py(Context context, List list, long j) {
        super(context);
        this.y = R.layout.expand_button;
        a(es.b(this.j, R.drawable.ic_arrow_down_24dp));
        this.r = R.drawable.ic_arrow_down_24dp;
        b((int) R.string.expand_button_title);
        a(999);
        ArrayList arrayList = new ArrayList();
        int size = list.size();
        CharSequence charSequence = null;
        for (int i = 0; i < size; i++) {
            Preference preference = (Preference) list.get(i);
            CharSequence charSequence2 = preference.q;
            boolean z = preference instanceof PreferenceGroup;
            if (z && !TextUtils.isEmpty(charSequence2)) {
                arrayList.add((PreferenceGroup) preference);
            }
            if (!arrayList.contains(preference.B)) {
                if (!TextUtils.isEmpty(charSequence2)) {
                    if (charSequence != null) {
                        charSequence = this.j.getString(R.string.summary_collapsed_preference_list, charSequence, charSequence2);
                    } else {
                        charSequence = charSequence2;
                    }
                }
            } else if (z) {
                arrayList.add((PreferenceGroup) preference);
            }
        }
        a(charSequence);
        this.a = j + 1000000;
    }

    public final long e() {
        return this.a;
    }

    public final void a(rl rlVar) {
        super.a(rlVar);
        rlVar.p = false;
    }
}
