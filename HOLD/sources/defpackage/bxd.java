package defpackage;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: bxd  reason: default package */
/* compiled from: PG */
public final class bxd {
    private final Object a = new Object();
    private Queue b;
    private boolean c;

    public final void a(bxc bxc) {
        synchronized (this.a) {
            if (this.b == null) {
                this.b = new ArrayDeque();
            }
            this.b.add(bxc);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0011, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:?, code lost:
        r0 = (defpackage.bxc) r2.b.poll();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x001a, code lost:
        if (r0 == null) goto L_0x0021;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x001c, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x001d, code lost:
        r0.a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:?, code lost:
        r2.c = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0024, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0025, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x000f, code lost:
        r1 = r2.a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bxb r3) {
        /*
            r2 = this;
            java.lang.Object r0 = r2.a
            monitor-enter(r0)
            java.util.Queue r1 = r2.b     // Catch:{ all -> 0x002b }
            if (r1 == 0) goto L_0x0029
            boolean r1 = r2.c     // Catch:{ all -> 0x002b }
            if (r1 != 0) goto L_0x0029
            r1 = 1
            r2.c = r1     // Catch:{ all -> 0x002b }
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
        L_0x000f:
            java.lang.Object r1 = r2.a
            monitor-enter(r1)
            java.util.Queue r0 = r2.b     // Catch:{ all -> 0x0026 }
            java.lang.Object r0 = r0.poll()     // Catch:{ all -> 0x0026 }
            bxc r0 = (defpackage.bxc) r0     // Catch:{ all -> 0x0026 }
            if (r0 == 0) goto L_0x0021
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            r0.a(r3)
            goto L_0x000f
        L_0x0021:
            r3 = 0
            r2.c = r3     // Catch:{ all -> 0x0026 }
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            return
        L_0x0026:
            r3 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0026 }
            throw r3
        L_0x0029:
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            return
        L_0x002b:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002b }
            goto L_0x002f
        L_0x002e:
            throw r3
        L_0x002f:
            goto L_0x002e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bxd.a(bxb):void");
    }
}
