package defpackage;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: cg  reason: default package */
/* compiled from: PG */
final class cg implements Runnable {
    public final /* synthetic */ ci a;
    private final /* synthetic */ Callable b;
    private final /* synthetic */ Handler c;

    public cg(Callable callable, Handler handler, ci ciVar) {
        this.b = callable;
        this.c = handler;
        this.a = ciVar;
    }

    public final void run() {
        cc ccVar;
        try {
            ccVar = ((bw) this.b).call();
        } catch (Exception e) {
            ccVar = null;
        }
        this.c.post(new cf(this, ccVar));
    }
}
