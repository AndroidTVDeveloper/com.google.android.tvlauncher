package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: dba  reason: default package */
/* compiled from: PG */
final class dba extends Handler {
    private final /* synthetic */ dbc a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public dba(dbc dbc) {
        super(Looper.getMainLooper());
        this.a = dbc;
    }

    public final void handleMessage(Message message) {
        dbc dbc = this.a;
        dbc.d();
        dbc.d.a(dbc);
    }
}
