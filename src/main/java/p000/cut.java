package p000;

import com.google.android.tvlauncher.home.view.HomeListView;

/* renamed from: cut */
/* compiled from: PG */
public final class cut implements C0263jr {

    /* renamed from: a */
    private final /* synthetic */ HomeListView f7519a;

    public cut(HomeListView homeListView) {
        this.f7519a = homeListView;
    }

    /* renamed from: a */
    public final void mo3747a() {
        if (!this.f7519a.mo892l()) {
            HomeListView homeListView = this.f7519a;
            if (homeListView.f1077q) {
                homeListView.suppressLayout(false);
                this.f7519a.requestLayout();
            }
        }
    }
}
