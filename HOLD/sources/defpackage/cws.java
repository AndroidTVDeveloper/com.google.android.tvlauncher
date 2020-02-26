package defpackage;

import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cws  reason: default package */
/* compiled from: PG */
final class cws implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ float b;
    private final /* synthetic */ cwo c;

    public cws(cwo cwo, String str, float f) {
        this.c = cwo;
        this.a = str;
        this.b = f;
    }

    public final void run() {
        cxe cxe;
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.c.a;
        String str = this.a;
        float f = this.b;
        cwv cwv = (cwv) remoteYoutubePlayerService.b.get(str);
        if (cwv != null && (cxe = cwv.e) != null) {
            cxe.a(f);
        }
    }
}
