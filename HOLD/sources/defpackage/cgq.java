package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.appsview.LaunchItemsRowView;

/* renamed from: cgq  reason: default package */
/* compiled from: PG */
final class cgq implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ int a;
    private final /* synthetic */ cgr b;

    public cgq(cgr cgr, int i) {
        this.b = cgr;
        this.a = i;
    }

    public final void onGlobalLayout() {
        View focusedChild = this.b.a.c.getFocusedChild();
        if (focusedChild instanceof LaunchItemsRowView) {
            LaunchItemsRowView launchItemsRowView = (LaunchItemsRowView) focusedChild;
            int i = this.a;
            if (i < launchItemsRowView.getChildCount()) {
                launchItemsRowView.getChildAt(i).requestFocus();
            }
        }
        this.b.a.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
    }
}
