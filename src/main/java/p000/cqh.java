package p000;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cqh */
/* compiled from: PG */
final class cqh extends BroadcastReceiver {

    /* renamed from: a */
    private final /* synthetic */ cqp f6965a;

    public cqh(cqp cqp) {
        this.f6965a = cqp;
    }

    public final void onReceive(Context context, Intent intent) {
        cqp cqp = this.f6965a;
        cqp.f6982H.removeCallbacks(cqp.f6983I);
        cqp cqp2 = this.f6965a;
        cqp2.f6982H.removeCallbacks(cqp2.f6984J);
        cqp cqp3 = this.f6965a;
        cqp3.f6982H.post(cqp3.f6983I);
        cqp cqp4 = this.f6965a;
        cqp4.f6982H.post(cqp4.f6984J);
    }
}
