package defpackage;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/* renamed from: u  reason: default package */
/* compiled from: PG */
public final class u extends Fragment {
    private final void a(int i) {
        Activity activity = getActivity();
        if (activity instanceof p) {
            ((p) activity).b().a(i);
        } else if (activity instanceof m) {
            hc a = ((m) activity).a();
            if (a instanceof o) {
                ((o) a).a(i);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        a(1);
    }

    public final void onDestroy() {
        super.onDestroy();
        a(6);
    }

    public final void onPause() {
        super.onPause();
        a(4);
    }

    public final void onResume() {
        super.onResume();
        a(3);
    }

    public final void onStart() {
        super.onStart();
        a(2);
    }

    public final void onStop() {
        super.onStop();
        a(5);
    }
}
