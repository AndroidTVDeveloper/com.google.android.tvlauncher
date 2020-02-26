package defpackage;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cub  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class cub implements View.OnClickListener {
    private final ChannelView a;

    public cub(ChannelView channelView) {
        this.a = channelView;
    }

    public final void onClick(View view) {
        cuq cuq = this.a.O;
        if (cuq != null) {
            cuq.c(15);
        }
    }
}
