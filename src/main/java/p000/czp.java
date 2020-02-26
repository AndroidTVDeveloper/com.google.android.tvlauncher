package p000;

import android.app.Fragment;
import androidx.preference.Preference;

/* renamed from: czp */
/* compiled from: PG */
public final class czp extends C0336mj {
    /* renamed from: b */
    public final void mo3833b() {
    }

    /* renamed from: b */
    public final boolean mo3834b(C0458qx qxVar, Preference preference) {
        Fragment instantiate = Fragment.instantiate(getActivity(), preference.f1366t, preference.mo1105h());
        instantiate.setTargetFragment(qxVar, 0);
        mo5584a(instantiate);
        return true;
    }

    /* renamed from: a */
    public final void mo3832a() {
        mo5584a(new czr());
    }
}
