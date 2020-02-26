package p000;

import android.support.p002v7.widget.RecyclerView;
import android.view.ViewTreeObserver;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: cfw */
/* compiled from: PG */
public final class cfw implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ VerticalGridView f5440a;

    /* renamed from: b */
    private final /* synthetic */ cga f5441b;

    public cfw(cga cga, VerticalGridView verticalGridView) {
        this.f5441b = cga;
        this.f5440a = verticalGridView;
    }

    public final void onGlobalLayout() {
        if (cga.m4693a((RecyclerView) this.f5440a)) {
            this.f5441b.f5451b = this.f5440a.getChildCount();
            this.f5440a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
