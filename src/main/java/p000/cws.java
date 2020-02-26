package p000;

import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cws */
/* compiled from: PG */
final class cws implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f7783a;

    /* renamed from: b */
    private final /* synthetic */ float f7784b;

    /* renamed from: c */
    private final /* synthetic */ cwo f7785c;

    public cws(cwo cwo, String str, float f) {
        this.f7785c = cwo;
        this.f7783a = str;
        this.f7784b = f;
    }

    public final void run() {
        cxe cxe;
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.f7785c.f7772a;
        String str = this.f7783a;
        float f = this.f7784b;
        cwv cwv = (cwv) remoteYoutubePlayerService.f6596b.get(str);
        if (cwv != null && (cxe = cwv.f7795e) != null) {
            cxe.mo3882a(f);
        }
    }
}
