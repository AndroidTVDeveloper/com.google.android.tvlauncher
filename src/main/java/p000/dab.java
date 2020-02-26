package p000;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

/* renamed from: dab */
/* compiled from: PG */
final class dab extends View.AccessibilityDelegate {

    /* renamed from: a */
    private final /* synthetic */ dad f8014a;

    public dab(dad dad) {
        this.f8014a = dad;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(this.f8014a.f8017a.size(), 0, false));
    }
}
