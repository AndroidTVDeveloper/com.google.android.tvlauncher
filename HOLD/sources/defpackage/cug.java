package defpackage;

import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cug  reason: default package */
/* compiled from: PG */
public final class cug implements Runnable {
    public final /* synthetic */ ChannelView a;

    public cug(ChannelView channelView) {
        this.a = channelView;
    }

    public final void run() {
        if (this.a.b.o()) {
            this.a.b.x.a(new cuf(this));
            return;
        }
        ChannelView channelView = this.a;
        if (!channelView.I) {
            channelView.c();
        }
    }
}
