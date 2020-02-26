package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeProvider;
import com.google.android.tvlauncher.R;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

/* renamed from: dj  reason: default package */
/* compiled from: PG */
public class dj {
    private static final View.AccessibilityDelegate b = new View.AccessibilityDelegate();
    public final View.AccessibilityDelegate a;
    private final View.AccessibilityDelegate c;

    public dj() {
        this(b);
    }

    public dj(View.AccessibilityDelegate accessibilityDelegate) {
        this.c = accessibilityDelegate;
        this.a = new di(this);
    }

    public boolean b(View view, AccessibilityEvent accessibilityEvent) {
        return this.c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public eg a(View view) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeProvider accessibilityNodeProvider = this.c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new eg(accessibilityNodeProvider);
        }
        return null;
    }

    static List b(View view) {
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    public void d(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void a(View view, ed edVar) {
        this.c.onInitializeAccessibilityNodeInfo(view, edVar.a);
    }

    public void c(View view, AccessibilityEvent accessibilityEvent) {
        this.c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    public boolean a(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List b2 = b(view);
        int i2 = 0;
        while (i2 < b2.size() && ((ea) b2.get(i2)).a() != i) {
            i2++;
        }
        int i3 = Build.VERSION.SDK_INT;
        boolean performAccessibilityAction = this.c.performAccessibilityAction(view, i, bundle);
        if (performAccessibilityAction || i != R.id.accessibility_action_clickable_span) {
            return performAccessibilityAction;
        }
        int i4 = bundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i4)) == null || (clickableSpan = (ClickableSpan) weakReference.get()) == null) {
            return false;
        }
        CharSequence text = view.createAccessibilityNodeInfo().getText();
        ClickableSpan[] clickableSpanArr = text instanceof Spanned ? (ClickableSpan[]) ((Spanned) text).getSpans(0, text.length(), ClickableSpan.class) : null;
        int i5 = 0;
        while (clickableSpanArr != null && i5 < clickableSpanArr.length) {
            if (!clickableSpan.equals(clickableSpanArr[i5])) {
                i5++;
            } else {
                clickableSpan.onClick(view);
                return true;
            }
        }
        return false;
    }

    public void a(View view, int i) {
        this.c.sendAccessibilityEvent(view, i);
    }

    public void a(View view, AccessibilityEvent accessibilityEvent) {
        this.c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
