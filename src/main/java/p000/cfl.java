package p000;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;

/* renamed from: cfl */
/* compiled from: PG */
final class cfl extends Handler {

    /* renamed from: a */
    private final /* synthetic */ cfm f5406a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public cfl(cfm cfm, Looper looper) {
        super(looper);
        this.f5406a = cfm;
    }

    public final void handleMessage(Message message) {
        if (message.what == 1) {
            this.f5406a.mo2719b();
        }
    }
}
