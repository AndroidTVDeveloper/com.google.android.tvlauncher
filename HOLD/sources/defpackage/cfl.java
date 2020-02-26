package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: cfl  reason: default package */
/* compiled from: PG */
final class cfl extends Handler {
    private final /* synthetic */ cfm a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfl(cfm cfm, Looper looper) {
        super(looper);
        this.a = cfm;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.a.b();
        }
    }
}
