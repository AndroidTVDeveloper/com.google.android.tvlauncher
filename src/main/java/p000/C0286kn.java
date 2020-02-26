package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: kn */
/* compiled from: PG */
public final class C0286kn extends C0093dj {

    /* renamed from: b */
    public final Map f9801b = new WeakHashMap();

    /* renamed from: c */
    private final C0287ko f9802c;

    public C0286kn(C0287ko koVar) {
        this.f9802c = koVar;
    }

    /* renamed from: b */
    public final boolean mo4499b(View view, AccessibilityEvent accessibilityEvent) {
        C0093dj djVar = (C0093dj) this.f9801b.get(view);
        if (djVar != null) {
            return djVar.mo4499b(view, accessibilityEvent);
        }
        return super.mo4499b(view, accessibilityEvent);
    }

    /* renamed from: a */
    public final C0117eg mo4493a(View view) {
        C0093dj djVar = (C0093dj) this.f9801b.get(view);
        if (djVar != null) {
            return djVar.mo4493a(view);
        }
        return super.mo4493a(view);
    }

    /* renamed from: d */
    public final void mo4501d(View view, AccessibilityEvent accessibilityEvent) {
        C0093dj djVar = (C0093dj) this.f9801b.get(view);
        if (djVar != null) {
            djVar.mo4501d(view, accessibilityEvent);
        } else {
            super.mo4501d(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public final void mo4496a(View view, C0114ed edVar) {
        C0269jx jxVar;
        if (this.f9802c.mo5455a() || (jxVar = this.f9802c.f9803b.f1068h) == null) {
            super.mo4496a(view, edVar);
            return;
        }
        C0285km c = RecyclerView.m1301c(view);
        if (c != null && !c.mo5445m() && !jxVar.f9708a.mo5205c(c.f9783a)) {
            RecyclerView recyclerView = jxVar.f9709b;
            C0275kc kcVar = recyclerView.f1041a;
            C0283kk kkVar = recyclerView.f1024D;
            jxVar.mo5342a(view, edVar);
        }
        C0093dj djVar = (C0093dj) this.f9801b.get(view);
        if (djVar != null) {
            djVar.mo4496a(view, edVar);
        } else {
            super.mo4496a(view, edVar);
        }
    }

    /* renamed from: c */
    public final void mo4500c(View view, AccessibilityEvent accessibilityEvent) {
        C0093dj djVar = (C0093dj) this.f9801b.get(view);
        if (djVar != null) {
            djVar.mo4500c(view, accessibilityEvent);
        } else {
            super.mo4500c(view, accessibilityEvent);
        }
    }

    /* renamed from: a */
    public final boolean mo4498a(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        C0093dj djVar = (C0093dj) this.f9801b.get(viewGroup);
        if (djVar != null) {
            return djVar.mo4498a(viewGroup, view, accessibilityEvent);
        }
        return super.mo4498a(viewGroup, view, accessibilityEvent);
    }

    /* renamed from: a */
    public final boolean mo4497a(View view, int i, Bundle bundle) {
        if (this.f9802c.mo5455a() || this.f9802c.f9803b.f1068h == null) {
            return super.mo4497a(view, i, bundle);
        }
        C0093dj djVar = (C0093dj) this.f9801b.get(view);
        if (djVar != null) {
            if (djVar.mo4497a(view, i, bundle)) {
                return true;
            }
        } else if (super.mo4497a(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.f9802c.f9803b.f1068h.f9709b;
        C0275kc kcVar = recyclerView.f1041a;
        C0283kk kkVar = recyclerView.f1024D;
        return false;
    }

    /* renamed from: a */
    public final void mo4494a(View view, int i) {
        C0093dj djVar = (C0093dj) this.f9801b.get(view);
        if (djVar != null) {
            djVar.mo4494a(view, i);
        } else {
            super.mo4494a(view, i);
        }
    }

    /* renamed from: a */
    public final void mo4495a(View view, AccessibilityEvent accessibilityEvent) {
        C0093dj djVar = (C0093dj) this.f9801b.get(view);
        if (djVar != null) {
            djVar.mo4495a(view, accessibilityEvent);
        } else {
            super.mo4495a(view, accessibilityEvent);
        }
    }
}
