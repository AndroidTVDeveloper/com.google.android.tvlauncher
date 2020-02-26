package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: cfw  reason: default package */
/* compiled from: PG */
public final class cfw implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ VerticalGridView a;
    private final /* synthetic */ cga b;

    public cfw(cga cga, VerticalGridView verticalGridView) {
        this.b = cga;
        this.a = verticalGridView;
    }

    public final void onGlobalLayout() {
        if (cga.a((RecyclerView) this.a)) {
            this.b.b = this.a.getChildCount();
            this.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
