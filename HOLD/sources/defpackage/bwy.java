package defpackage;

import android.util.Log;

/* renamed from: bwy  reason: default package */
/* compiled from: PG */
final class bwy implements Runnable {
    private final /* synthetic */ bxb a;
    private final /* synthetic */ bwz b;

    public bwy(bwz bwz, bxb bxb) {
        this.b = bwz;
        this.a = bxb;
    }

    public final void run() {
        Exception exc;
        synchronized (this.b.a) {
            bxb bxb = this.a;
            synchronized (((bxh) bxb).a) {
                exc = ((bxh) bxb).e;
            }
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("FeedbackClient silent feedback failed with exception: ");
            sb.append(valueOf);
            Log.e("SilentFeedbackReceiver", sb.toString());
        }
    }
}
