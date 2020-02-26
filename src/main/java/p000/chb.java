package p000;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.appsview.BannerView;

/* renamed from: chb */
/* compiled from: PG */
final class chb implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    private final /* synthetic */ chc f5501a;

    public chb(chc chc) {
        this.f5501a = chc;
    }

    public final void onGlobalLayout() {
        View focusedChild = this.f5501a.f5502a.getFocusedChild();
        if (focusedChild instanceof BannerView) {
            focusedChild.setSelected(true);
            this.f5501a.f5503b.mo2782a(true);
            this.f5501a.f5502a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }
}
