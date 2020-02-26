package p000;

import android.os.SystemClock;
import java.util.Collections;

/* renamed from: cca */
/* compiled from: PG */
final /* synthetic */ class cca implements Runnable {

    /* renamed from: a */
    private final ccb f5236a;

    public cca(ccb ccb) {
        this.f5236a = ccb;
    }

    public final void run() {
        ccb ccb = this.f5236a;
        if (ccb.f5237a.f5240b.f5256h == 0) {
            ccb.f5237a.f5240b.f5256h = SystemClock.elapsedRealtime();
            ccb.f5237a.f5240b.f5257i.f5246f = true;
            cce cce = ccb.f5237a.f5240b;
            synchronized (cce.f5260l) {
                for (ccf a : cce.f5259k) {
                    try {
                        a.mo2666a();
                    } catch (RuntimeException e) {
                        bog.m3831a("PrimesStartupMeasure", "Error running onDraw listener", e, new Object[0]);
                    }
                }
                cce.f5259k = Collections.emptyList();
            }
        }
    }
}
