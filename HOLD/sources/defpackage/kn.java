package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: kn  reason: default package */
/* compiled from: PG */
public final class kn extends dj {
    public final Map b = new WeakHashMap();
    private final ko c;

    public kn(ko koVar) {
        this.c = koVar;
    }

    public final boolean b(View view, AccessibilityEvent accessibilityEvent) {
        dj djVar = (dj) this.b.get(view);
        if (djVar != null) {
            return djVar.b(view, accessibilityEvent);
        }
        return super.b(view, accessibilityEvent);
    }

    public final eg a(View view) {
        dj djVar = (dj) this.b.get(view);
        if (djVar != null) {
            return djVar.a(view);
        }
        return super.a(view);
    }

    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        dj djVar = (dj) this.b.get(view);
        if (djVar != null) {
            djVar.d(view, accessibilityEvent);
        } else {
            super.d(view, accessibilityEvent);
        }
    }

    public final void a(View view, ed edVar) {
        jx jxVar;
        if (this.c.a() || (jxVar = this.c.b.h) == null) {
            super.a(view, edVar);
            return;
        }
        km c2 = RecyclerView.c(view);
        if (c2 != null && !c2.m() && !jxVar.a.c(c2.a)) {
            RecyclerView recyclerView = jxVar.b;
            kc kcVar = recyclerView.a;
            kk kkVar = recyclerView.D;
            jxVar.a(view, edVar);
        }
        dj djVar = (dj) this.b.get(view);
        if (djVar != null) {
            djVar.a(view, edVar);
        } else {
            super.a(view, edVar);
        }
    }

    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        dj djVar = (dj) this.b.get(view);
        if (djVar != null) {
            djVar.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    public final boolean a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        dj djVar = (dj) this.b.get(viewGroup);
        if (djVar != null) {
            return djVar.a(viewGroup, view, accessibilityEvent);
        }
        return super.a(viewGroup, view, accessibilityEvent);
    }

    public final boolean a(View view, int i, Bundle bundle) {
        if (this.c.a() || this.c.b.h == null) {
            return super.a(view, i, bundle);
        }
        dj djVar = (dj) this.b.get(view);
        if (djVar != null) {
            if (djVar.a(view, i, bundle)) {
                return true;
            }
        } else if (super.a(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.c.b.h.b;
        kc kcVar = recyclerView.a;
        kk kkVar = recyclerView.D;
        return false;
    }

    public final void a(View view, int i) {
        dj djVar = (dj) this.b.get(view);
        if (djVar != null) {
            djVar.a(view, i);
        } else {
            super.a(view, i);
        }
    }

    public final void a(View view, AccessibilityEvent accessibilityEvent) {
        dj djVar = (dj) this.b.get(view);
        if (djVar != null) {
            djVar.a(view, accessibilityEvent);
        } else {
            super.a(view, accessibilityEvent);
        }
    }
}
