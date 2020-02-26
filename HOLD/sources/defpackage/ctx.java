package defpackage;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: ctx  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class ctx implements View.OnClickListener {
    private final ChannelView a;

    public ctx(ChannelView channelView) {
        this.a = channelView;
    }

    public final void onClick(View view) {
        cuq cuq;
        ChannelView channelView = this.a;
        if (channelView.A == 15 && (cuq = channelView.O) != null) {
            cuq.c(10);
        }
    }
}
