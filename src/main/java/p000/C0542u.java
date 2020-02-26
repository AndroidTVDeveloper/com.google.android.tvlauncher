package p000;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;

/* renamed from: u */
/* compiled from: PG */
public final class C0542u extends Fragment {
    /* renamed from: a */
    private final void m8398a(int i) {
        Activity activity = getActivity();
        if (activity instanceof C0407p) {
            ((C0407p) activity).mo5730b().mo5692a(i);
        } else if (activity instanceof C0326m) {
            C0194hc a = ((C0326m) activity).mo61a();
            if (a instanceof C0380o) {
                ((C0380o) a).mo5692a(i);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m8398a(1);
    }

    public final void onDestroy() {
        super.onDestroy();
        m8398a(6);
    }

    public final void onPause() {
        super.onPause();
        m8398a(4);
    }

    public final void onResume() {
        super.onResume();
        m8398a(3);
    }

    public final void onStart() {
        super.onStart();
        m8398a(2);
    }

    public final void onStop() {
        super.onStop();
        m8398a(5);
    }
}
