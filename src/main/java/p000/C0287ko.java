package p000;

import android.os.Bundle;
import android.support.p002v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: ko */
/* compiled from: PG */
public class C0287ko extends C0093dj {

    /* renamed from: b */
    public final RecyclerView f9803b;

    /* renamed from: c */
    public final C0286kn f9804c;

    public C0287ko(RecyclerView recyclerView) {
        this.f9803b = recyclerView;
        C0093dj b = mo5456b();
        if (b == null || !(b instanceof C0286kn)) {
            this.f9804c = new C0286kn(this);
        } else {
            this.f9804c = (C0286kn) b;
        }
    }

    /* renamed from: b */
    public C0093dj mo5456b() {
        return this.f9804c;
    }

    /* renamed from: d */
    public final void mo4501d(View view, AccessibilityEvent accessibilityEvent) {
        C0269jx jxVar;
        super.mo4501d(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !mo5455a() && (jxVar = ((RecyclerView) view).f1068h) != null) {
            RecyclerView recyclerView = jxVar.f9709b;
            C0275kc kcVar = recyclerView.f1041a;
            C0283kk kkVar = recyclerView.f1024D;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !jxVar.f9709b.canScrollVertically(-1) && !jxVar.f9709b.canScrollHorizontally(-1) && !jxVar.f9709b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                C0261jp jpVar = jxVar.f9709b.f1067g;
                if (jpVar != null) {
                    accessibilityEvent.setItemCount(jpVar.mo2794a());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo4496a(View view, C0114ed edVar) {
        C0269jx jxVar;
        super.mo4496a(view, edVar);
        if (!mo5455a() && (jxVar = this.f9803b.f1068h) != null) {
            RecyclerView recyclerView = jxVar.f9709b;
            jxVar.mo5350a(recyclerView.f1041a, recyclerView.f1024D, edVar);
        }
    }

    /* renamed from: a */
    public final boolean mo4497a(View view, int i, Bundle bundle) {
        C0269jx jxVar;
        if (super.mo4497a(view, i, bundle)) {
            return true;
        }
        if (mo5455a() || (jxVar = this.f9803b.f1068h) == null) {
            return false;
        }
        RecyclerView recyclerView = jxVar.f9709b;
        return jxVar.mo5351a(recyclerView.f1041a, recyclerView.f1024D, i);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo5455a() {
        return this.f9803b.mo909q();
    }
}
