package defpackage;

import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwq  reason: default package */
/* compiled from: PG */
final class cwq implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ cwo b;

    public cwq(cwo cwo, String str) {
        this.b = cwo;
        this.a = str;
    }

    public final void run() {
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.b.a;
        String str = this.a;
        cwv cwv = (cwv) remoteYoutubePlayerService.b.get(str);
        if (cwv != null) {
            cxe cxe = cwv.e;
            if (cxe != null) {
                cxe.d();
                cwv.g.removeViewImmediate(cwv.e.a);
                cwv.f.release();
            }
            remoteYoutubePlayerService.b.remove(str);
        }
    }
}
