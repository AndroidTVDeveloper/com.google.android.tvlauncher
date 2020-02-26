package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: ccb  reason: default package */
/* compiled from: PG */
final class ccb implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ ccc a;
    private View b;

    public /* synthetic */ ccb(ccc ccc, View view) {
        this.a = ccc;
        this.b = view;
    }

    public final boolean onPreDraw() {
        try {
            if (this.b != null) {
                ccc ccc = this.a;
                ccc.a.unregisterActivityLifecycleCallbacks(ccc);
                this.b.getViewTreeObserver().removeOnPreDrawListener(this);
                cev.a((Runnable) new cca(this));
            }
        } catch (RuntimeException e) {
            bog.a("PrimesStartupMeasure", "Error handling PrimesStartupMeasure's onPreDraw", e, new Object[0]);
        } catch (Throwable th) {
            this.b = null;
            throw th;
        }
        this.b = null;
        return true;
    }
}
