package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: dap */
/* compiled from: PG */
final class dap extends View.AccessibilityDelegate {

    /* renamed from: a */
    private final /* synthetic */ daw f8062a;

    public dap(daw daw) {
        this.f8062a = daw;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(this.f8062a.f8098h.size(), 0, false));
    }
}
