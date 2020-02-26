package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;
import android.os.Build;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;

@Deprecated
/* renamed from: afn  reason: default package */
/* compiled from: PG */
public final class afn extends Fragment {
    public final afa a;
    public final afr b = new afm(this);
    public sx c;
    public Fragment d;
    private final Set e = new HashSet();
    private afn f;

    public afn() {
        afa afa = new afa();
        this.a = afa;
    }

    public final void onAttach(Activity activity) {
        super.onAttach(activity);
        try {
            a(activity);
        } catch (IllegalStateException e2) {
            if (Log.isLoggable("RMFragment", 5)) {
                Log.w("RMFragment", "Unable to register fragment with root", e2);
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        afa afa = this.a;
        afa.c = true;
        for (afk c2 : aie.a(afa.a)) {
            c2.c();
        }
        a();
    }

    public final void onDetach() {
        super.onDetach();
        a();
    }

    public final void onStart() {
        super.onStart();
        this.a.a();
    }

    public final void onStop() {
        super.onStop();
        afa afa = this.a;
        afa.b = false;
        for (afk b2 : aie.a(afa.a)) {
            b2.b();
        }
    }

    public final void a(Activity activity) {
        a();
        afn a2 = si.a((Context) activity).e.a(activity.getFragmentManager(), null, afq.b((Context) activity));
        this.f = a2;
        if (!equals(a2)) {
            this.f.e.add(this);
        }
    }

    public final String toString() {
        String fragment = super.toString();
        int i = Build.VERSION.SDK_INT;
        Fragment parentFragment = getParentFragment();
        if (parentFragment == null) {
            parentFragment = this.d;
        }
        String valueOf = String.valueOf(parentFragment);
        StringBuilder sb = new StringBuilder(String.valueOf(fragment).length() + 9 + String.valueOf(valueOf).length());
        sb.append(fragment);
        sb.append("{parent=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }

    private final void a() {
        afn afn = this.f;
        if (afn != null) {
            afn.e.remove(this);
            this.f = null;
        }
    }
}
