package p000;

import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwt */
/* compiled from: PG */
final class cwt implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f7786a;

    /* renamed from: b */
    private final /* synthetic */ int f7787b;

    /* renamed from: c */
    private final /* synthetic */ int f7788c;

    /* renamed from: d */
    private final /* synthetic */ cwo f7789d;

    public cwt(cwo cwo, String str, int i, int i2) {
        this.f7789d = cwo;
        this.f7786a = str;
        this.f7787b = i;
        this.f7788c = i2;
    }

    public final void run() {
        cxe cxe;
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.f7789d.f7772a;
        String str = this.f7786a;
        int i = this.f7787b;
        int i2 = this.f7788c;
        cwv cwv = (cwv) remoteYoutubePlayerService.f6596b.get(str);
        if (cwv != null && (cxe = cwv.f7795e) != null) {
            cxe.mo3883a(i, i2);
        }
    }
}
