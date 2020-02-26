package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: di  reason: default package */
/* compiled from: PG */
public final class di extends View.AccessibilityDelegate {
    public final dj a;

    public di(dj djVar) {
        this.a = djVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.a.b(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        eg a2 = this.a.a(view);
        if (a2 != null) {
            return (AccessibilityNodeProvider) a2.a;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.d(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        ed edVar = new ed(accessibilityNodeInfo);
        boolean q = dx.q(view);
        if (Build.VERSION.SDK_INT >= 28) {
            edVar.a.setScreenReaderFocusable(q);
        } else {
            edVar.a(1, q);
        }
        Boolean bool = (Boolean) new ds(Boolean.class).b(view);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            edVar.a.setHeading(z);
        } else {
            edVar.a(2, z);
        }
        CharSequence r = dx.r(view);
        if (Build.VERSION.SDK_INT >= 28) {
            edVar.a.setPaneTitle(r);
        } else {
            int i = Build.VERSION.SDK_INT;
            edVar.a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", r);
        }
        this.a.a(view, edVar);
        accessibilityNodeInfo.getText();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        List b = dj.b(view);
        for (int i4 = 0; i4 < b.size(); i4++) {
            edVar.a((ea) b.get(i4));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.a.c(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.a.a(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.a.a(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.a.a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.a.a(view, accessibilityEvent);
    }
}
