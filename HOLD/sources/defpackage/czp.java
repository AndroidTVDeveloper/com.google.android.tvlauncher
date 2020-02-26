package defpackage;

import android.app.Fragment;
import androidx.preference.Preference;

/* renamed from: czp  reason: default package */
/* compiled from: PG */
public final class czp extends mj {
    public final void b() {
    }

    public final boolean b(qx qxVar, Preference preference) {
        Fragment instantiate = Fragment.instantiate(getActivity(), preference.t, preference.h());
        instantiate.setTargetFragment(qxVar, 0);
        a(instantiate);
        return true;
    }

    public final void a() {
        a(new czr());
    }
}
