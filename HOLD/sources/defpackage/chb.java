package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: chb  reason: default package */
/* compiled from: PG */
final class chb implements ViewTreeObserver.OnGlobalLayoutListener {
    private final /* synthetic */ chc a;

    public chb(chc chc) {
        this.a = chc;
    }

    public final void onGlobalLayout() {
        View focusedChild = this.a.a.getFocusedChild();
        if (focusedChild instanceof BannerView) {
            focusedChild.setSelected(true);
            this.a.b.a(true);
            this.a.a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
