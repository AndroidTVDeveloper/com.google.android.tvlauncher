package defpackage;

import android.net.Uri;
import java.util.Map;

/* renamed from: axk  reason: default package */
/* compiled from: PG */
final class axk implements bit, awp {
    public long a;
    public long b = -1;
    public aov c;
    public boolean d;
    public final /* synthetic */ axq e;
    private final Uri f;
    private final bjd g;
    private final axl h;
    private final aok i;
    private final bki j;
    private final aop k = new aop();
    private volatile boolean l;
    private boolean m = true;
    private bhy n = a(0);

    public axk(axq axq, Uri uri, bhv bhv, axl axl, aok aok, bki bki) {
        this.e = axq;
        this.f = uri;
        this.g = new bjd(bhv);
        this.h = axl;
        this.i = aok;
        this.j = bki;
    }

    private final bhy a(long j2) {
        Uri uri = this.f;
        axq axq = this.e;
        Map map = axq.a;
        String str = axq.e;
        return new bhy(uri, j2, axq.a);
    }

    public final void a() {
        this.l = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0096 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void b() {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x00eb
            boolean r2 = r12.l
            if (r2 != 0) goto L_0x00eb
            r2 = 1
            aop r3 = r12.k     // Catch:{ all -> 0x00d9 }
            long r10 = r3.a     // Catch:{ all -> 0x00d9 }
            bhy r3 = r12.a(r10)     // Catch:{ all -> 0x00d9 }
            r12.n = r3     // Catch:{ all -> 0x00d9 }
            bjd r4 = r12.g     // Catch:{ all -> 0x00d9 }
            long r3 = r4.a(r3)     // Catch:{ all -> 0x00d9 }
            r12.b = r3     // Catch:{ all -> 0x00d9 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            long r3 = r3 + r10
            r12.b = r3     // Catch:{ all -> 0x00d9 }
        L_0x0025:
            bjd r3 = r12.g     // Catch:{ all -> 0x00d9 }
            android.net.Uri r3 = r3.a()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r3 = defpackage.bks.a(r3)     // Catch:{ all -> 0x00d9 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x00d9 }
            axq r3 = r12.e     // Catch:{ all -> 0x00d9 }
            bjd r4 = r12.g     // Catch:{ all -> 0x00d9 }
            java.util.Map r4 = r4.b()     // Catch:{ all -> 0x00d9 }
            aul r4 = defpackage.aul.a(r4)     // Catch:{ all -> 0x00d9 }
            java.util.Map r5 = defpackage.axq.a     // Catch:{ all -> 0x00d9 }
            r3.m = r4     // Catch:{ all -> 0x00d9 }
            bjd r3 = r12.g     // Catch:{ all -> 0x00d9 }
            axq r4 = r12.e     // Catch:{ all -> 0x00d9 }
            aul r4 = r4.m     // Catch:{ all -> 0x00d9 }
            if (r4 != 0) goto L_0x004a
            goto L_0x0069
        L_0x004a:
            int r4 = r4.b     // Catch:{ all -> 0x00d9 }
            r5 = -1
            if (r4 == r5) goto L_0x0069
            awq r5 = new awq     // Catch:{ all -> 0x00d9 }
            r5.<init>(r3, r4, r12)     // Catch:{ all -> 0x00d9 }
            axq r3 = r12.e     // Catch:{ all -> 0x00d9 }
            axp r4 = new axp     // Catch:{ all -> 0x00d9 }
            r4.<init>(r0, r2)     // Catch:{ all -> 0x00d9 }
            aov r3 = r3.a(r4)     // Catch:{ all -> 0x00d9 }
            r12.c = r3     // Catch:{ all -> 0x00d9 }
            akh r4 = defpackage.axq.b     // Catch:{ all -> 0x00d9 }
            r3.a(r4)     // Catch:{ all -> 0x00d9 }
            goto L_0x006a
        L_0x0069:
            r5 = r3
        L_0x006a:
            aof r3 = new aof     // Catch:{ all -> 0x00d9 }
            long r8 = r12.b     // Catch:{ all -> 0x00d9 }
            r4 = r3
            r6 = r10
            r4.<init>(r5, r6, r8)     // Catch:{ all -> 0x00d9 }
            axl r4 = r12.h     // Catch:{ all -> 0x00d6 }
            aok r5 = r12.i     // Catch:{ all -> 0x00d6 }
            aoi r4 = r4.a(r3, r5)     // Catch:{ all -> 0x00d6 }
            axq r5 = r12.e     // Catch:{ all -> 0x00d6 }
            aul r5 = r5.m     // Catch:{ all -> 0x00d6 }
            if (r5 == 0) goto L_0x008a
            boolean r5 = r4 instanceof defpackage.apo     // Catch:{ all -> 0x00d6 }
            if (r5 == 0) goto L_0x008a
            r5 = r4
            apo r5 = (defpackage.apo) r5     // Catch:{ all -> 0x00d6 }
            r5.a = r2     // Catch:{ all -> 0x00d6 }
        L_0x008a:
            boolean r5 = r12.m     // Catch:{ all -> 0x00d6 }
            if (r5 == 0) goto L_0x00c3
            long r5 = r12.a     // Catch:{ all -> 0x00d6 }
            r4.a(r10, r5)     // Catch:{ all -> 0x00d6 }
            r12.m = r0     // Catch:{ all -> 0x00d6 }
            goto L_0x00c3
        L_0x0096:
            if (r1 != 0) goto L_0x00c4
            boolean r5 = r12.l     // Catch:{ all -> 0x00d6 }
            if (r5 != 0) goto L_0x00c4
            bki r5 = r12.j     // Catch:{ all -> 0x00d6 }
            r5.b()     // Catch:{ all -> 0x00d6 }
            aop r5 = r12.k     // Catch:{ all -> 0x00d6 }
            int r1 = r4.a(r3, r5)     // Catch:{ all -> 0x00d6 }
            long r5 = r3.c     // Catch:{ all -> 0x00d6 }
            axq r7 = r12.e     // Catch:{ all -> 0x00d6 }
            long r7 = r7.f     // Catch:{ all -> 0x00d6 }
            long r7 = r7 + r10
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c3
            bki r7 = r12.j     // Catch:{ all -> 0x00d6 }
            r7.d()     // Catch:{ all -> 0x00d6 }
            axq r7 = r12.e     // Catch:{ all -> 0x00d6 }
            android.os.Handler r8 = r7.j     // Catch:{ all -> 0x00d6 }
            java.lang.Runnable r7 = r7.i     // Catch:{ all -> 0x00d6 }
            r8.post(r7)     // Catch:{ all -> 0x00d6 }
            r10 = r5
            goto L_0x0096
        L_0x00c3:
            goto L_0x0096
        L_0x00c4:
            if (r1 == r2) goto L_0x00cd
            aop r2 = r12.k
            long r3 = r3.c
            r2.a = r3
            goto L_0x00cf
        L_0x00cd:
            r1 = 0
        L_0x00cf:
            bjd r2 = r12.g
            defpackage.blm.a(r2)
            goto L_0x0002
        L_0x00d6:
            r0 = move-exception
            goto L_0x00db
        L_0x00d9:
            r0 = move-exception
            r3 = 0
        L_0x00db:
            if (r1 == r2) goto L_0x00e5
            if (r3 == 0) goto L_0x00e5
            aop r1 = r12.k
            long r2 = r3.c
            r1.a = r2
        L_0x00e5:
            bjd r1 = r12.g
            defpackage.blm.a(r1)
            throw r0
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axk.b():void");
    }

    public final void a(long j2, long j3) {
        this.k.a = j2;
        this.a = j3;
        this.m = true;
        this.d = false;
    }
}
