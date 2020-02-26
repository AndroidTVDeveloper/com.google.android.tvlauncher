package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.support.v4.widget.NestedScrollView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ScrollView;

/* renamed from: em  reason: default package */
/* compiled from: PG */
public final class em extends dj {
    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        boolean z;
        super.d(view, accessibilityEvent);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        accessibilityEvent.setClassName(ScrollView.class.getName());
        if (nestedScrollView.a() > 0) {
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
        int a = nestedScrollView.a();
        int i2 = Build.VERSION.SDK_INT;
        accessibilityEvent.setMaxScrollY(a);
    }

    public final void a(View view, ed edVar) {
        int a;
        super.a(view, edVar);
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        edVar.a.setClassName(ScrollView.class.getName());
        if (nestedScrollView.isEnabled() && (a = nestedScrollView.a()) > 0) {
            edVar.a();
            if (nestedScrollView.getScrollY() > 0) {
                edVar.a(ea.b);
                edVar.a(ea.c);
            }
            if (nestedScrollView.getScrollY() < a) {
                edVar.a(ea.a);
                edVar.a(ea.e);
            }
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (super.a(view, i, bundle)) {
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
                nestedScrollView.b(max);
                return true;
            } else if (i != 16908346) {
                return false;
            }
        }
        int height2 = nestedScrollView.getHeight();
        int paddingBottom2 = nestedScrollView.getPaddingBottom();
        int min = Math.min(nestedScrollView.getScrollY() + ((height2 - paddingBottom2) - nestedScrollView.getPaddingTop()), nestedScrollView.a());
        if (min == nestedScrollView.getScrollY()) {
            return false;
        }
        nestedScrollView.b(min);
        return true;
    }
}
