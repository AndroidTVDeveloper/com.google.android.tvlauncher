package p000;

import android.media.tv.TvView;

/* renamed from: cww */
/* compiled from: PG */
final class cww extends TvView.TvInputCallback {

    /* renamed from: a */
    private final /* synthetic */ cwz f7799a;

    public cww(cwz cwz) {
        this.f7799a = cwz;
    }

    public final void onConnectionFailed(String str) {
        this.f7799a.mo3888d();
        cwh cwh = this.f7799a.f7806e;
        if (cwh != null) {
            cwh.mo3879b();
        }
    }

    public final void onDisconnected(String str) {
        this.f7799a.mo3888d();
        cwh cwh = this.f7799a.f7806e;
        if (cwh != null) {
            cwh.mo3879b();
        }
    }

    public final void onVideoAvailable(String str) {
        cwz cwz = this.f7799a;
        cwh cwh = cwz.f7806e;
        if (cwh != null) {
            cwz.f7808g = 3;
            cwh.mo3878a();
        }
    }

    public final void onVideoUnavailable(String str, int i) {
        if (i == 0) {
            this.f7799a.mo3888d();
            cwh cwh = this.f7799a.f7806e;
            if (cwh != null) {
                cwh.mo3879b();
            }
        }
    }
}
