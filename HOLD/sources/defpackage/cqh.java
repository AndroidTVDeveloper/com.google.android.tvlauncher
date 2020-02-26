package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* renamed from: cqh  reason: default package */
/* compiled from: PG */
final class cqh extends BroadcastReceiver {
    private final /* synthetic */ cqp a;

    public cqh(cqp cqp) {
        this.a = cqp;
    }

    public final void onReceive(Context context, Intent intent) {
        cqp cqp = this.a;
        cqp.H.removeCallbacks(cqp.I);
        cqp cqp2 = this.a;
        cqp2.H.removeCallbacks(cqp2.J);
        cqp cqp3 = this.a;
        cqp3.H.post(cqp3.I);
        cqp cqp4 = this.a;
        cqp4.H.post(cqp4.J);
    }
}
