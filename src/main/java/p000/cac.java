package p000;

import android.app.Application;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: cac */
/* compiled from: PG */
final class cac extends byo {

    /* renamed from: d */
    private bzz f5102d;

    public cac(dnj dnj, Application application, dff dff, dff dff2, int i) {
        super(dnj, application, dff, dff2, 1, i);
        new AtomicReference(bzt.f5080a);
        new ConcurrentHashMap();
    }

    /* renamed from: d */
    public final synchronized void mo2549d() {
        bzz bzz = this.f5102d;
        if (bzz != null) {
            bzz.f5092f.mo2565b(bzz.f5093g);
            bzz.f5092f.mo2565b(bzz.f5094h);
            this.f5102d = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002d, code lost:
        return;
     */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo2597e() {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.f5027c     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002c
            bzz r0 = r4.f5102d     // Catch:{ all -> 0x003e }
            if (r0 != 0) goto L_0x002c
            caa r0 = new caa     // Catch:{ all -> 0x003e }
            r0.<init>(r4)     // Catch:{ all -> 0x003e }
            bzz r1 = new bzz     // Catch:{ all -> 0x003e }
            android.app.Application r2 = r4.f5025a     // Catch:{ all -> 0x003e }
            dff r3 = r4.f5026b     // Catch:{ all -> 0x003e }
            r1.<init>(r0, r2, r3)     // Catch:{ all -> 0x003e }
            r4.f5102d = r1     // Catch:{ all -> 0x003e }
            java.util.concurrent.atomic.AtomicBoolean r0 = r1.f5087a     // Catch:{ all -> 0x003e }
            r2 = 1
            boolean r0 = r0.getAndSet(r2)     // Catch:{ all -> 0x003e }
            if (r0 == 0) goto L_0x002e
            java.lang.String r0 = "MemoryMetricMonitor"
            java.lang.String r1 = "Memory Monitor has already started. This MemoryMetricMonitor.start() is ignored."
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch:{ all -> 0x003e }
            p000.bog.m3837c(r0, r1, r2)     // Catch:{ all -> 0x003e }
        L_0x002c:
            monitor-exit(r4)
            return
        L_0x002e:
            bze r0 = r1.f5092f     // Catch:{ all -> 0x003e }
            bza r2 = r1.f5093g     // Catch:{ all -> 0x003e }
            r0.mo2564a(r2)     // Catch:{ all -> 0x003e }
            bze r0 = r1.f5092f     // Catch:{ all -> 0x003e }
            bzb r1 = r1.f5094h     // Catch:{ all -> 0x003e }
            r0.mo2564a(r1)     // Catch:{ all -> 0x003e }
            monitor-exit(r4)
            return
        L_0x003e:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.cac.mo2597e():void");
    }
}
