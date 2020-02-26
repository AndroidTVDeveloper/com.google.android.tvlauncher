package defpackage;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cua  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cua implements View.OnClickListener {
    private final ChannelView a;

    public cua(ChannelView channelView) {
        this.a = channelView;
    }

    public final void onClick(View view) {
        ChannelView channelView = this.a;
        cup cup = channelView.M;
        if (cup != null) {
            cup.d(channelView);
        }
    }
}
