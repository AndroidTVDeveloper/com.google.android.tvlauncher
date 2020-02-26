package defpackage;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: ctz  reason: default package */
/* compiled from: PG */
public final /* synthetic */ class ctz implements View.OnFocusChangeListener {
    private final ChannelView a;

    public ctz(ChannelView channelView) {
        this.a = channelView;
    }

    public final void onFocusChange(View view, boolean z) {
        cul cul;
        ChannelView channelView = this.a;
        if (z && dcy.b(channelView.getContext()) && (cul = channelView.N) != null) {
            cul.f();
        }
    }
}
