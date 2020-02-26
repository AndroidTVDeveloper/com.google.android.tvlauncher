package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.appsview.LaunchItemsRowView;

/* renamed from: cgq */
/* compiled from: PG */
final class cgq implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ int f5476a;

    /* renamed from: b */
    private final /* synthetic */ cgr f5477b;

    public cgq(cgr cgr, int i) {
        this.f5477b = cgr;
        this.f5476a = i;
    }

    public final void onGlobalLayout() {
        View focusedChild = this.f5477b.f5478a.f5481c.getFocusedChild();
        if (focusedChild instanceof LaunchItemsRowView) {
            LaunchItemsRowView launchItemsRowView = (LaunchItemsRowView) focusedChild;
            int i = this.f5476a;
            if (i < launchItemsRowView.getChildCount()) {
                launchItemsRowView.getChildAt(i).requestFocus();
            }
        }
        this.f5477b.f5478a.f5481c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
