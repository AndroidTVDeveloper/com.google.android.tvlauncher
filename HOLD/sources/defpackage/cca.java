package defpackage;

import android.os.SystemClock;
import java.util.Collections;

/* renamed from: cca  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cca implements Runnable {
    private final ccb a;

    public cca(ccb ccb) {
        this.a = ccb;
    }

    public final void run() {
        ccb ccb = this.a;
        if (ccb.a.b.h == 0) {
            ccb.a.b.h = SystemClock.elapsedRealtime();
            ccb.a.b.i.f = true;
            cce cce = ccb.a.b;
            synchronized (cce.l) {
                for (ccf a2 : cce.k) {
                    try {
                        a2.a();
                    } catch (RuntimeException e) {
                        bog.a("PrimesStartupMeasure", "Error running onDraw listener", e, new Object[0]);
                    }
                }
                cce.k = Collections.emptyList();
            }
        }
    }
}
