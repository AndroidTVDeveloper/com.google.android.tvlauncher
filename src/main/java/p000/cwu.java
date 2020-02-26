package p000;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: cwu */
/* compiled from: PG */
final class cwu implements cwh {

    /* renamed from: a */
    private final /* synthetic */ cwv f7790a;

    public cwu(cwv cwv) {
        this.f7790a = cwv;
    }

    /* renamed from: a */
    public final void mo3878a() {
        try {
            this.f7790a.f7794d.mo3892b();
        } catch (RemoteException e) {
            Log.e("RemoteYTPlayerService", "Video callback failed", e);
        }
    }

    /* renamed from: c */
    public final void mo3880c() {
        try {
            this.f7790a.f7794d.mo3894d();
        } catch (RemoteException e) {
            Log.e("RemoteYTPlayerService", "Video callback failed", e);
        }
    }

    /* renamed from: b */
    public final void mo3879b() {
        try {
            this.f7790a.f7794d.mo3893c();
        } catch (RemoteException e) {
            Log.e("RemoteYTPlayerService", "Video callback failed", e);
        }
    }
}
