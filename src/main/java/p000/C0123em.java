package p000;

import android.os.Build;
import android.os.Bundle;
import android.support.p001v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* renamed from: em */
/* compiled from: PG */
public final class C0123em extends C0093dj {
    /* renamed from: d */
    public final void mo4501d(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.mo4501d(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.mo688a() > 0) {
            z = true;
        } else {
            z = false;
        }
        accessibilityEvent.setScrollable(z);
        accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
        accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
        int scrollX = nestedScrollView.getScrollX();
        int i = Build.VERSION.SDK_INT;
        accessibilityEvent.setMaxScrollX(scrollX);
        int a = nestedScrollView.mo688a();
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setMaxScrollY(a);
    }

    /* renamed from: a */
    public final void mo4496a(View view, C0114ed edVar) {
        int a;
        super.mo4496a(view, edVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        edVar.f9123a.setClassName(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (a = nestedScrollView.mo688a()) > 0) {
            edVar.mo4697a();
            if (nestedScrollView.getScrollY() > 0) {
                edVar.mo4699a(C0111ea.f9115b);
                edVar.mo4699a(C0111ea.f9116c);
            }
            if (nestedScrollView.getScrollY() < a) {
                edVar.mo4699a(C0111ea.f9114a);
                edVar.mo4699a(C0111ea.f9118e);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo4497a(View view, int i, Bundle bundle) {
        if (super.mo4497a(view, i, bundle)) {
            return true;
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        if (!nestedScrollView.isEnabled()) {
            return false;
        }
        if (i != 4096) {
            if (i == 8192 || i == 16908344) {
                int height = nestedScrollView.getHeight();
                int paddingBottom = nestedScrollView.getPaddingBottom();
                int max = Math.max(nestedScrollView.getScrollY() - ((height - paddingBottom) - nestedScrollView.getPaddingTop()), 0);
                if (max == nestedScrollView.getScrollY()) {
                    return false;
                }
                nestedScrollView.mo698b(max);
                return true;
            } else if (i != 16908346) {
                return false;
            }
        }
        int height2 = nestedScrollView.getHeight();
        int paddingBottom2 = nestedScrollView.getPaddingBottom();
        int min = Math.min(nestedScrollView.getScrollY() + ((height2 - paddingBottom2) - nestedScrollView.getPaddingTop()), nestedScrollView.mo688a());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.mo698b(min);
        return true;
    }
}
