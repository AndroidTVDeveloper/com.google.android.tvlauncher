package defpackage;

import android.util.Log;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: crr  reason: default package */
/* compiled from: PG */
public final class crr extends dlk {
    public final /* synthetic */ crz a;

    public crr(crz crz) {
        this.a = crz;
    }

    public final void a(InstantVideoView instantVideoView) {
        String valueOf = String.valueOf(instantVideoView.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 20);
        sb.append("onVideoError: uri=[");
        sb.append(valueOf);
        sb.append("]");
        Log.e("ProgramController", sb.toString());
        this.a.a(true, 2);
    }
}
