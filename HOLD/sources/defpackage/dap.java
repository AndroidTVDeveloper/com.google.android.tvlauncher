package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: dap  reason: default package */
/* compiled from: PG */
final class dap extends View.AccessibilityDelegate {
    private final /* synthetic */ daw a;

    public dap(daw daw) {
        this.a = daw;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(this.a.h.size(), 0, false));
    }
}
