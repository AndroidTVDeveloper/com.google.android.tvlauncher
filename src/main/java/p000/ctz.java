package p000;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: ctz */
/* compiled from: PG */
public final /* synthetic */ class ctz implements View.OnFocusChangeListener {

    /* renamed from: a */
    private final ChannelView f7506a;

    public ctz(ChannelView channelView) {
        this.f7506a = channelView;
    }

    public final void onFocusChange(View view, boolean z) {
        cul cul;
        ChannelView channelView = this.f7506a;
        if (z && dcy.m6193b(channelView.getContext()) && (cul = channelView.f6463N) != null) {
            cul.mo3526f();
        }
    }
}
