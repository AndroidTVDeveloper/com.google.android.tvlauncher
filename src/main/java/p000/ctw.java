package p000;

import com.google.android.tvlauncher.home.view.ChannelItemsListView;

/* renamed from: ctw */
/* compiled from: PG */
public final class ctw implements C0263jr {

    /* renamed from: a */
    private final /* synthetic */ ChannelItemsListView f7503a;

    public ctw(ChannelItemsListView channelItemsListView) {
        this.f7503a = channelItemsListView;
    }

    /* renamed from: a */
    public final void mo3747a() {
        if (!this.f7503a.mo892l()) {
            ChannelItemsListView channelItemsListView = this.f7503a;
            if (channelItemsListView.f1077q) {
                channelItemsListView.suppressLayout(false);
                this.f7503a.requestLayout();
            }
        }
    }
}
