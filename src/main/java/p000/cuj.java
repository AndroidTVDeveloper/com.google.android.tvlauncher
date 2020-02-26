package p000;

import android.view.View;
import com.google.android.tvlauncher.home.view.ChannelView;

/* renamed from: cuj */
/* compiled from: PG */
public final class cuj extends dcw {

    /* renamed from: g */
    private final /* synthetic */ ChannelView f7516g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cuj(ChannelView channelView, int i, float f, float f2) {
        super(i, f, f2);
        this.f7516g = channelView;
    }

    public final void onFocusChange(View view, boolean z) {
        float f;
        cul cul;
        if (!dcy.m6193b(this.f7516g.getContext())) {
            f = this.f7516g.f6535t;
        } else {
            f = 1.0f;
        }
        this.f8305b = f;
        if (z && dcy.m6193b(this.f7516g.getContext()) && (cul = this.f7516g.f6463N) != null) {
            cul.mo3526f();
        }
        super.onFocusChange(view, z);
    }
}
