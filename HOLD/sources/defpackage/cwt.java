package defpackage;

import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwt  reason: default package */
/* compiled from: PG */
final class cwt implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ cwo d;

    public cwt(cwo cwo, String str, int i, int i2) {
        this.d = cwo;
        this.a = str;
        this.b = i;
        this.c = i2;
    }

    public final void run() {
        cxe cxe;
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.d.a;
        String str = this.a;
        int i = this.b;
        int i2 = this.c;
        cwv cwv = (cwv) remoteYoutubePlayerService.b.get(str);
        if (cwv != null && (cxe = cwv.e) != null) {
            cxe.a(i, i2);
        }
    }
}
