package defpackage;

import android.os.RemoteException;
import android.util.Log;

/* renamed from: cwu  reason: default package */
/* compiled from: PG */
final class cwu implements cwh {
    private final /* synthetic */ cwv a;

    public cwu(cwv cwv) {
        this.a = cwv;
    }

    public final void a() {
        try {
            this.a.d.b();
        } catch (RemoteException e) {
            Log.e("RemoteYTPlayerService", "Video callback failed", e);
        }
    }

    public final void c() {
        try {
            this.a.d.d();
        } catch (RemoteException e) {
            Log.e("RemoteYTPlayerService", "Video callback failed", e);
        }
    }

    public final void b() {
        try {
            this.a.d.c();
        } catch (RemoteException e) {
            Log.e("RemoteYTPlayerService", "Video callback failed", e);
        }
    }
}
