package p000;

import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwq */
/* compiled from: PG */
final class cwq implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f7778a;

    /* renamed from: b */
    private final /* synthetic */ cwo f7779b;

    public cwq(cwo cwo, String str) {
        this.f7779b = cwo;
        this.f7778a = str;
    }

    public final void run() {
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.f7779b.f7772a;
        String str = this.f7778a;
        cwv cwv = (cwv) remoteYoutubePlayerService.f6596b.get(str);
        if (cwv != null) {
            cxe cxe = cwv.f7795e;
            if (cxe != null) {
                cxe.mo3888d();
                cwv.f7797g.removeViewImmediate(cwv.f7795e.f7820a);
                cwv.f7796f.release();
            }
            remoteYoutubePlayerService.f6596b.remove(str);
        }
    }
}
