package defpackage;

import android.os.RemoteException;
import android.util.Log;
import android.view.Surface;
import com.google.android.tvlauncher.instantvideo.media.impl.RemoteYoutubePlayerService;

/* renamed from: cwp  reason: default package */
/* compiled from: PG */
final class cwp implements Runnable {
    private final /* synthetic */ Surface a;
    private final /* synthetic */ int b;
    private final /* synthetic */ int c;
    private final /* synthetic */ cwn d;
    private final /* synthetic */ cwo e;

    public cwp(cwo cwo, Surface surface, int i, int i2, cwn cwn) {
        this.e = cwo;
        this.a = surface;
        this.b = i;
        this.c = i2;
        this.d = cwn;
    }

    public final void run() {
        RemoteYoutubePlayerService remoteYoutubePlayerService = this.e.a;
        Surface surface = this.a;
        int i = this.b;
        int i2 = this.c;
        cwn cwn = this.d;
        cwv cwv = new cwv(remoteYoutubePlayerService, surface, i, i2, cwn);
        int i3 = remoteYoutubePlayerService.c;
        remoteYoutubePlayerService.c = i3 + 1;
        String valueOf = String.valueOf(i3);
        remoteYoutubePlayerService.b.put(valueOf, cwv);
        try {
            cwn.a(valueOf);
        } catch (RemoteException e2) {
            Log.e("RemoteYTPlayerService", "Cannot start session", e2);
            remoteYoutubePlayerService.b.remove(valueOf);
        }
    }
}
