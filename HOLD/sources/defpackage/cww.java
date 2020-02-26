package defpackage;

import android.media.tv.TvView;

/* renamed from: cww  reason: default package */
/* compiled from: PG */
final class cww extends TvView.TvInputCallback {
    private final /* synthetic */ cwz a;

    public cww(cwz cwz) {
        this.a = cwz;
    }

    public final void onConnectionFailed(String str) {
        this.a.d();
        cwh cwh = this.a.e;
        if (cwh != null) {
            cwh.b();
        }
    }

    public final void onDisconnected(String str) {
        this.a.d();
        cwh cwh = this.a.e;
        if (cwh != null) {
            cwh.b();
        }
    }

    public final void onVideoAvailable(String str) {
        cwz cwz = this.a;
        cwh cwh = cwz.e;
        if (cwh != null) {
            cwz.g = 3;
            cwh.a();
        }
    }

    public final void onVideoUnavailable(String str, int i) {
        if (i == 0) {
            this.a.d();
            cwh cwh = this.a.e;
            if (cwh != null) {
                cwh.b();
            }
        }
    }
}
