package defpackage;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: vf  reason: default package */
/* compiled from: PG */
public final class vf {
    public final ReferenceQueue a = new ReferenceQueue();
    public volatile boolean b;
    public volatile vd c;
    private final Map d = new HashMap();

    public vf() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new vb());
        newSingleThreadExecutor.execute(new vc(this));
    }

    public final synchronized void a(ts tsVar, wo woVar) {
        ve veVar = (ve) this.d.put(tsVar, new ve(tsVar, woVar, this.a));
        if (veVar != null) {
            veVar.clear();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(ve veVar) {
        synchronized (this) {
            this.d.remove(veVar.a);
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(ts tsVar) {
        ve veVar = (ve) this.d.remove(tsVar);
        if (veVar != null) {
            veVar.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return r0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized defpackage.wo b(defpackage.ts r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.d     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            ve r2 = (defpackage.ve) r2     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x0018
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            wo r0 = (defpackage.wo) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0016
            r1.a(r2)     // Catch:{ all -> 0x001b }
        L_0x0016:
            monitor-exit(r1)
            return r0
        L_0x0018:
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vf.b(ts):wo");
    }
}
