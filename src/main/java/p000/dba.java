package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: dba */
/* compiled from: PG */
final class dba extends Handler {

    /* renamed from: a */
    private final /* synthetic */ dbc f8126a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dba(dbc dbc) {
        super(Looper.getMainLooper());
        this.f8126a = dbc;
    }

    public final void handleMessage(Message message) {
        dbc dbc = this.f8126a;
        dbc.mo4064d();
        dbc.f8133d.mo2968a(dbc);
    }
}
