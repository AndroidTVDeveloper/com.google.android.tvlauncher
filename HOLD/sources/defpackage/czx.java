package defpackage;

import android.view.View;

/* renamed from: czx  reason: default package */
/* compiled from: PG */
final class czx implements View.OnFocusChangeListener {
    public final void onFocusChange(View view, boolean z) {
        if (z) {
            view.setAccessibilityLiveRegion(1);
        } else {
            view.setAccessibilityLiveRegion(0);
        }
    }
}
