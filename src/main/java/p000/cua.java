package p000;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cua */
/* compiled from: PG */
public final /* synthetic */ class cua implements View.OnClickListener {

    /* renamed from: a */
    private final ChannelView f7508a;

    public cua(ChannelView channelView) {
        this.f7508a = channelView;
    }

    public final void onClick(View view) {
        ChannelView channelView = this.f7508a;
        cup cup = channelView.f6462M;
        if (cup != null) {
            cup.mo3524d(channelView);
        }
    }
}
