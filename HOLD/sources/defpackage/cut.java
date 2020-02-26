package defpackage;

import com.google.android.tvlauncher.home.view.HomeListView;

/* renamed from: cut  reason: default package */
/* compiled from: PG */
public final class cut implements jr {
    private final /* synthetic */ HomeListView a;

    public cut(HomeListView homeListView) {
        this.a = homeListView;
    }

    public final void a() {
        if (!this.a.l()) {
            HomeListView homeListView = this.a;
            if (homeListView.q) {
                homeListView.suppressLayout(false);
                this.a.requestLayout();
            }
        }
    }
}
