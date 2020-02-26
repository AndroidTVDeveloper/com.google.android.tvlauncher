package p000;

import android.util.Log;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: crr */
/* compiled from: PG */
public final class crr extends dlk {

    /* renamed from: a */
    public final /* synthetic */ crz f7076a;

    public crr(crz crz) {
        this.f7076a = crz;
    }

    /* renamed from: a */
    public final void mo3667a(InstantVideoView instantVideoView) {
        String valueOf = String.valueOf(instantVideoView.f6601c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("onVideoError: uri=[");
        sb.append(valueOf);
        sb.append("]");
        Log.e("ProgramController", sb.toString());
        this.f7076a.mo3678a(true, 2);
    }
}
