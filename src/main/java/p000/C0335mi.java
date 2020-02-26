package p000;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: mi */
/* compiled from: PG */
final class C0335mi implements View.OnKeyListener {

    /* renamed from: a */
    private final /* synthetic */ C0336mj f9963a;

    public C0335mi(C0336mj mjVar) {
        this.f9963a = mjVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 4) {
            return this.f9963a.getChildFragmentManager().popBackStackImmediate();
        }
        return false;
    }
}
