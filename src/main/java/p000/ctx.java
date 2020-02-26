package p000;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: ctx */
/* compiled from: PG */
public final /* synthetic */ class ctx implements View.OnClickListener {

    /* renamed from: a */
    private final ChannelView f7504a;

    public ctx(ChannelView channelView) {
        this.f7504a = channelView;
    }

    public final void onClick(View view) {
        cuq cuq;
        ChannelView channelView = this.f7504a;
        if (channelView.f6450A == 15 && (cuq = channelView.f6464O) != null) {
            cuq.mo3521c(10);
        }
    }
}
