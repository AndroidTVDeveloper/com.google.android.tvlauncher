package defpackage;

import android.view.KeyEvent;
import android.view.View;

/* renamed from: mi  reason: default package */
/* compiled from: PG */
final class mi implements View.OnKeyListener {
    private final /* synthetic */ mj a;

    public mi(mj mjVar) {
        this.a = mjVar;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i == 4) {
            return this.a.getChildFragmentManager().popBackStackImmediate();
        }
        return false;
    }
}
