package p000;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: cfy */
/* compiled from: PG */
final class cfy implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ View f5444a;

    /* renamed from: b */
    private final /* synthetic */ cga f5445b;

    public cfy(cga cga, View view) {
        this.f5445b = cga;
        this.f5444a = view;
    }

    public final void onGlobalLayout() {
        if (!this.f5445b.f5452c) {
            this.f5444a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        } else if (this.f5444a.getVisibility() == 0) {
            this.f5445b.mo2748c();
            this.f5444a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
