package p000;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: afn */
/* compiled from: PG */
public final class afn extends Fragment {

    /* renamed from: a */
    public final afa f236a;

    /* renamed from: b */
    public final afr f237b = new afm(this);

    /* renamed from: c */
    public C0512sx f238c;

    /* renamed from: d */
    public Fragment f239d;

    /* renamed from: e */
    private final Set f240e = new HashSet();

    /* renamed from: f */
    private afn f241f;

    public afn() {
        afa afa = new afa();
        this.f236a = afa;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            mo162a(activity);
        } catch (IllegalStateException e) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        afa afa = this.f236a;
        afa.f228c = true;
        for (afk c : aie.m557a(afa.f226a)) {
            c.mo160c();
        }
        m301a();
    }

    public final void onDetach() {
        super.onDetach();
        m301a();
    }

    public final void onStart() {
        super.onStart();
        this.f236a.mo154a();
    }

    public final void onStop() {
        super.onStop();
        afa afa = this.f236a;
        afa.f227b = false;
        for (afk b : aie.m557a(afa.f226a)) {
            b.mo159b();
        }
    }

    /* renamed from: a */
    public final void mo162a(Activity activity) {
        m301a();
        afn a = C0497si.m8291a((Context) activity).f10366e.mo170a(activity.getFragmentManager(), null, afq.m306b((Context) activity));
        this.f241f = a;
        if (!equals(a)) {
            this.f241f.f240e.add(this);
        }
    }

    public final String toString() {
        String fragment = super.toString();
        int i = Build.VERSION.SDK_INT;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.f239d;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder sb = new StringBuilder(String.valueOf(fragment).length() + 9 + String.valueOf(valueOf).length());
        sb.append(fragment);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: a */
    private final void m301a() {
        afn afn = this.f241f;
        if (afn != null) {
            afn.f240e.remove(this);
            this.f241f = null;
        }
    }
}
