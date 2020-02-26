package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ccb */
/* compiled from: PG */
final class ccb implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a */
    public final /* synthetic */ ccc f5237a;

    /* renamed from: b */
    private View f5238b;

    public /* synthetic */ ccb(ccc ccc, View view) {
        this.f5237a = ccc;
        this.f5238b = view;
    }

    public final boolean onPreDraw() {
        try {
            if (this.f5238b != null) {
                ccc ccc = this.f5237a;
                ccc.f5239a.unregisterActivityLifecycleCallbacks(ccc);
                this.f5238b.getViewTreeObserver().removeOnPreDrawListener(this);
                cev.m4631a((Runnable) new cca(this));
            }
        } catch (RuntimeException e) {
            bog.m3831a("PrimesStartupMeasure", "Error handling PrimesStartupMeasure's onPreDraw", e, new Object[0]);
        } catch (Throwable th) {
            this.f5238b = null;
            throw th;
        }
        this.f5238b = null;
        return true;
    }
}
