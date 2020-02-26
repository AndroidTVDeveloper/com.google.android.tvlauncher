package defpackage;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: dab  reason: default package */
/* compiled from: PG */
final class dab extends View.AccessibilityDelegate {
    private final /* synthetic */ dad a;

    public dab(dad dad) {
        this.a = dad;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(this.a.a.size(), 0, false));
    }
}
