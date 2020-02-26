package p000;

import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwp */
/* compiled from: PG */
final class cwp implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Surface f7773a;

    /* renamed from: b */
    private final /* synthetic */ int f7774b;

    /* renamed from: c */
    private final /* synthetic */ int f7775c;

    /* renamed from: d */
    private final /* synthetic */ cwn f7776d;

    /* renamed from: e */
    private final /* synthetic */ cwo f7777e;

    public cwp(cwo cwo, Surface surface, int i, int i2, cwn cwn) {
        this.f7777e = cwo;
        this.f7773a = surface;
        this.f7774b = i;
        this.f7775c = i2;
        this.f7776d = cwn;
    }

    public final void run() {
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.f7777e.f7772a;
        Surface surface = this.f7773a;
        int i = this.f7774b;
        int i2 = this.f7775c;
        cwn cwn = this.f7776d;
        cwv cwv = new cwv(remoteYoutubePlayerService, surface, i, i2, cwn);
        int i3 = remoteYoutubePlayerService.f6597c;
        remoteYoutubePlayerService.f6597c = i3 + 1;
        String valueOf = String.valueOf(i3);
        remoteYoutubePlayerService.f6596b.put(valueOf, cwv);
        try {
            cwn.mo3891a(valueOf);
        } catch (RemoteException e) {
            Log.e("RemoteYTPlayerService", "Cannot start session", e);
            remoteYoutubePlayerService.f6596b.remove(valueOf);
        }
    }
}
