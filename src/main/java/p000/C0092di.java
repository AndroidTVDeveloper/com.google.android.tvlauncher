package p000;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;

/* renamed from: di */
/* compiled from: PG */
public final class C0092di extends View.AccessibilityDelegate {

    /* renamed from: a */
    public final C0093dj f8571a;

    public C0092di(C0093dj djVar) {
        this.f8571a = djVar;
    }

    public final boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.f8571a.mo4499b(view, accessibilityEvent);
    }

    public final AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
        C0117eg a = this.f8571a.mo4493a(view);
        if (a != null) {
            return (AccessibilityNodeProvider) a.f9124a;
        }
        return null;
    }

    public final void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f8571a.mo4501d(view, accessibilityEvent);
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean z;
        C0114ed edVar = new C0114ed(accessibilityNodeInfo);
        boolean q = C0107dx.m7220q(view);
        if (Build.VERSION.SDK_INT >= 28) {
            edVar.f9123a.setScreenReaderFocusable(q);
        } else {
            edVar.mo4698a(1, q);
        }
        Boolean bool = (Boolean) new C0102ds(Boolean.class).mo4687b(view);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        if (Build.VERSION.SDK_INT >= 28) {
            edVar.f9123a.setHeading(z);
        } else {
            edVar.mo4698a(2, z);
        }
        CharSequence r = C0107dx.m7221r(view);
        if (Build.VERSION.SDK_INT >= 28) {
            edVar.f9123a.setPaneTitle(r);
        } else {
            int i = Build.VERSION.SDK_INT;
            edVar.f9123a.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", r);
        }
        this.f8571a.mo4496a(view, edVar);
        accessibilityNodeInfo.getText();
        int i2 = Build.VERSION.SDK_INT;
        int i3 = Build.VERSION.SDK_INT;
        List b = C0093dj.m6651b(view);
        for (int i4 = 0; i4 < b.size(); i4++) {
            edVar.mo4699a((C0111ea) b.get(i4));
        }
    }

    public final void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.f8571a.mo4500c(view, accessibilityEvent);
    }

    public final boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f8571a.mo4498a(viewGroup, view, accessibilityEvent);
    }

    public final boolean performAccessibilityAction(View view, int i, Bundle bundle) {
        return this.f8571a.mo4497a(view, i, bundle);
    }

    public final void sendAccessibilityEvent(View view, int i) {
        this.f8571a.mo4494a(view, i);
    }

    public final void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.f8571a.mo4495a(view, accessibilityEvent);
    }
}
