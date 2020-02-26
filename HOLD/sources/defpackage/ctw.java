package defpackage;

import com.google.android.tvlauncher.home.view.ChannelItemsListView;

/* renamed from: ctw  reason: default package */
/* compiled from: PG */
public final class ctw implements jr {
    private final /* synthetic */ ChannelItemsListView a;

    public ctw(ChannelItemsListView channelItemsListView) {
        this.a = channelItemsListView;
    }

    public final void a() {
        if (!this.a.l()) {
            ChannelItemsListView channelItemsListView = this.a;
            if (channelItemsListView.q) {
                channelItemsListView.suppressLayout(false);
                this.a.requestLayout();
            }
        }
    }
}
