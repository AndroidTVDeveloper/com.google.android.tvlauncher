package defpackage;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cuj  reason: default package */
/* compiled from: PG */
public final class cuj extends dcw {
    private final /* synthetic */ ChannelView g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cuj(ChannelView channelView, int i, float f, float f2) {
        super(i, f, f2);
        this.g = channelView;
    }

    public final void onFocusChange(View view, boolean z) {
        float f;
        cul cul;
        if (!dcy.b(this.g.getContext())) {
            f = this.g.t;
        } else {
            f = 1.0f;
        }
        this.b = f;
        if (z && dcy.b(this.g.getContext()) && (cul = this.g.N) != null) {
            cul.f();
        }
        super.onFocusChange(view, z);
    }
}
