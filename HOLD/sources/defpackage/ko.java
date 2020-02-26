package defpackage;

import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

/* renamed from: ko  reason: default package */
/* compiled from: PG */
public class ko extends dj {
    public final RecyclerView b;
    public final kn c;

    public ko(RecyclerView recyclerView) {
        this.b = recyclerView;
        dj b2 = b();
        if (b2 == null || !(b2 instanceof kn)) {
            this.c = new kn(this);
        } else {
            this.c = (kn) b2;
        }
    }

    public dj b() {
        return this.c;
    }

    public final void d(View view, AccessibilityEvent accessibilityEvent) {
        jx jxVar;
        super.d(view, accessibilityEvent);
        if ((view instanceof RecyclerView) && !a() && (jxVar = ((RecyclerView) view).h) != null) {
            RecyclerView recyclerView = jxVar.b;
            kc kcVar = recyclerView.a;
            kk kkVar = recyclerView.D;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !jxVar.b.canScrollVertically(-1) && !jxVar.b.canScrollHorizontally(-1) && !jxVar.b.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                jp jpVar = jxVar.b.g;
                if (jpVar != null) {
                    accessibilityEvent.setItemCount(jpVar.a());
                }
            }
        }
    }

    public final void a(View view, ed edVar) {
        jx jxVar;
        super.a(view, edVar);
        if (!a() && (jxVar = this.b.h) != null) {
            RecyclerView recyclerView = jxVar.b;
            jxVar.a(recyclerView.a, recyclerView.D, edVar);
        }
    }

    public final boolean a(View view, int i, Bundle bundle) {
        jx jxVar;
        if (super.a(view, i, bundle)) {
            return true;
        }
        if (a() || (jxVar = this.b.h) == null) {
            return false;
        }
        RecyclerView recyclerView = jxVar.b;
        return jxVar.a(recyclerView.a, recyclerView.D, i);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.b.q();
    }
}
