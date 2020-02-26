package p000;

import android.os.Handler;
import java.util.concurrent.Callable;

/* renamed from: cg */
/* compiled from: PG */
final class C0062cg implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0064ci f5446a;

    /* renamed from: b */
    private final /* synthetic */ Callable f5447b;

    /* renamed from: c */
    private final /* synthetic */ Handler f5448c;

    public C0062cg(Callable callable, Handler handler, C0064ci ciVar) {
        this.f5447b = callable;
        this.f5448c = handler;
        this.f5446a = ciVar;
    }

    public final void run() {
        C0058cc ccVar;
        try {
            ccVar = ((C0051bw) this.f5447b).call();
        } catch (Exception e) {
            ccVar = null;
        }
        this.f5448c.post(new C0061cf(this, ccVar));
    }
}
