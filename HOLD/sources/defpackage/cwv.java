package defpackage;

import android.hardware.display.VirtualDisplay;
import android.view.Surface;
import android.view.WindowManager;
import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwv  reason: default package */
/* compiled from: PG */
final class cwv {
    public final Surface a;
    public final int b;
    public final int c;
    public final cwn d;
    public cxe e;
    public VirtualDisplay f;
    public WindowManager g;
    public final /* synthetic */ RemoteYoutubePlayerService h;

    public cwv(RemoteYoutubePlayerService remoteYoutubePlayerService, Surface surface, int i, int i2, cwn cwn) {
        this.h = remoteYoutubePlayerService;
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = cwn;
    }
}
