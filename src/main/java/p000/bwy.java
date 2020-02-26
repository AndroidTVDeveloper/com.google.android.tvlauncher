package p000;

import android.util.Log;

/* renamed from: bwy */
/* compiled from: PG */
final class bwy implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ bxb f4966a;

    /* renamed from: b */
    private final /* synthetic */ bwz f4967b;

    public bwy(bwz bwz, bxb bxb) {
        this.f4967b = bwz;
        this.f4966a = bxb;
    }

    public final void run() {
        Exception exc;
        synchronized (this.f4967b.f4968a) {
            bxb bxb = this.f4966a;
            synchronized (((bxh) bxb).f4977a) {
                exc = ((bxh) bxb).f4981e;
            }
            String valueOf = String.valueOf(exc);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54);
            sb.append("FeedbackClient silent feedback failed with exception: ");
            sb.append(valueOf);
            Log.e("SilentFeedbackReceiver", sb.toString());
        }
    }
}
