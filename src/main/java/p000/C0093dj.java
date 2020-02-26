package p000;

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

/* renamed from: dj */
/* compiled from: PG */
public class C0093dj {

    /* renamed from: b */
    private static final View.AccessibilityDelegate f8669b = new View.AccessibilityDelegate();

    /* renamed from: a */
    public final View.AccessibilityDelegate f8670a;

    /* renamed from: c */
    private final View.AccessibilityDelegate f8671c;

    public C0093dj() {
        this(f8669b);
    }

    public C0093dj(View.AccessibilityDelegate accessibilityDelegate) {
        this.f8671c = accessibilityDelegate;
        this.f8670a = new C0092di(this);
    }

    /* renamed from: b */
    public boolean mo4499b(View view, AccessibilityEvent accessibilityEvent) {
        return this.f8671c.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public C0117eg mo4493a(View view) {
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeProvider accessibilityNodeProvider = this.f8671c.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new C0117eg(accessibilityNodeProvider);
        }
        return null;
    }

    /* renamed from: b */
    static List m6651b(View view) {
        List list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    /* renamed from: d */
    public void mo4501d(View view, AccessibilityEvent accessibilityEvent) {
        this.f8671c.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public void mo4496a(View view, C0114ed edVar) {
        this.f8671c.onInitializeAccessibilityNodeInfo(view, edVar.f9123a);
    }

    /* renamed from: c */
    public void mo4500c(View view, AccessibilityEvent accessibilityEvent) {
        this.f8671c.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo4498a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.f8671c.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public boolean mo4497a(View view, int i, Bundle bundle) {
        WeakReference weakReference;
        ClickableSpan clickableSpan;
        List b = m6651b(view);
        int i2 = 0;
        while (i2 < b.size() && ((C0111ea) b.get(i2)).mo4693a() != i) {
            i2++;
        }
        int i3 = Build.VERSION.SDK_INT;
        boolean performAccessibilityAction = this.f8671c.performAccessibilityAction(view, i, bundle);
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

    /* renamed from: a */
    public void mo4494a(View view, int i) {
        this.f8671c.sendAccessibilityEvent(view, i);
    }

    /* renamed from: a */
    public void mo4495a(View view, AccessibilityEvent accessibilityEvent) {
        this.f8671c.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }
}
