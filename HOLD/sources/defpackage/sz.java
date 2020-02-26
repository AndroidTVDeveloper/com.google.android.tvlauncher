package defpackage;

import java.util.concurrent.Callable;

/* renamed from: sz  reason: default package */
/* compiled from: PG */
final class sz implements Callable {
    private final /* synthetic */ te a;

    public sz(te teVar) {
        this.a = teVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:?, code lost:
        return null;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object call() {
        /*
            r3 = this;
            te r0 = r3.a
            monitor-enter(r0)
            te r1 = r3.a     // Catch:{ all -> 0x0023 }
            java.io.Writer r2 = r1.f     // Catch:{ all -> 0x0023 }
            if (r2 == 0) goto L_0x0020
            r1.d()     // Catch:{ all -> 0x0023 }
            te r1 = r3.a     // Catch:{ all -> 0x0023 }
            boolean r1 = r1.c()     // Catch:{ all -> 0x0023 }
            if (r1 == 0) goto L_0x001e
            te r1 = r3.a     // Catch:{ all -> 0x0023 }
            r1.b()     // Catch:{ all -> 0x0023 }
            te r1 = r3.a     // Catch:{ all -> 0x0023 }
            r2 = 0
            r1.h = r2     // Catch:{ all -> 0x0023 }
        L_0x001e:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            goto L_0x0021
        L_0x0020:
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
        L_0x0021:
            r0 = 0
            return r0
        L_0x0023:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0023 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sz.call():java.lang.Object");
    }
}
