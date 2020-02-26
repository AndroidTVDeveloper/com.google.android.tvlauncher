package defpackage;

import android.os.AsyncTask;

/* renamed from: dcl  reason: default package */
/* compiled from: PG */
final /* synthetic */ class dcl implements Runnable {
    private final dcn a;
    private final dcm b;

    public dcl(dcn dcn, dcm dcm) {
        this.a = dcn;
        this.b = dcm;
    }

    public final void run() {
        dcn dcn = this.a;
        dcm dcm = this.b;
        if (dcm.getStatus() == AsyncTask.Status.RUNNING) {
            dcm.cancel(true);
            dcn.b();
            dcn.a();
        }
    }
}
