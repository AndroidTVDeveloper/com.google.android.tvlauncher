package p000;

import android.os.AsyncTask;

/* renamed from: dcl */
/* compiled from: PG */
final /* synthetic */ class dcl implements Runnable {

    /* renamed from: a */
    private final dcn f8230a;

    /* renamed from: b */
    private final dcm f8231b;

    public dcl(dcn dcn, dcm dcm) {
        this.f8230a = dcn;
        this.f8231b = dcm;
    }

    public final void run() {
        dcn dcn = this.f8230a;
        dcm dcm = this.f8231b;
        if (dcm.getStatus() == AsyncTask.Status.RUNNING) {
            dcm.cancel(true);
            dcn.mo4119b();
            dcn.mo4109a();
        }
    }
}
