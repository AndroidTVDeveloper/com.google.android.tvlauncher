package defpackage;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cac  reason: default package */
/* compiled from: PG */
final class cac extends byo {
    private bzz d;

    public cac(dnj dnj, Application application, dff dff, dff dff2, int i) {
        super(dnj, application, dff, dff2, 1, i);
        new AtomicReference(bzt.a);
        new ConcurrentHashMap();
    }

    public final synchronized void d() {
        bzz bzz = this.d;
        if (bzz != null) {
            bzz.f.b(bzz.g);
            bzz.f.b(bzz.h);
            this.d = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void e() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.c     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002c
            bzz r0 = r4.d     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002c
            caa r0 = new caa     // Catch:{ all -> 0x003e }
            r0.<init>(r4)     // Catch:{ all -> 0x003e }
            bzz r1 = new bzz     // Catch:{ all -> 0x003e }
            android.app.Application r2 = r4.a     // Catch:{ all -> 0x003e }
            dff r3 = r4.b     // Catch:{ all -> 0x003e }
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x003e }
            r4.d = r1     // Catch:{ all -> 0x003e }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.a     // Catch:{ all -> 0x003e }
            r2 = 1
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "MemoryMetricMonitor"
            java.lang.String r1 = "Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x003e }
            defpackage.bog.c(r0, r1, r2)     // Catch:{ all -> 0x003e }
        L_0x002c:
            monitor-exit(r4)
            return
        L_0x002e:
            bze r0 = r1.f     // Catch:{ all -> 0x003e }
            bza r2 = r1.g     // Catch:{ all -> 0x003e }
            r0.a(r2)     // Catch:{ all -> 0x003e }
            bze r0 = r1.f     // Catch:{ all -> 0x003e }
            bzb r1 = r1.h     // Catch:{ all -> 0x003e }
            r0.a(r1)     // Catch:{ all -> 0x003e }
            monitor-exit(r4)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cac.e():void");
    }
}
