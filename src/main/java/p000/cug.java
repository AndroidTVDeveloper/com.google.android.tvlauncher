package p000;

import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cug */
/* compiled from: PG */
public final class cug implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ ChannelView f7514a;

    public cug(ChannelView channelView) {
        this.f7514a = channelView;
    }

    public final void run() {
        if (this.f7514a.f6517b.mo895o()) {
            this.f7514a.f6517b.f1084x.mo5322a(new cuf(this));
            return;
        }
        ChannelView channelView = this.f7514a;
        if (!channelView.f6458I) {
            channelView.mo3385c();
        }
    }
}
