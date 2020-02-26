package p000;

import android.net.Uri;
import java.util.Map;

/* renamed from: axk */
/* compiled from: PG */
final class axk implements bit, awp {

    /* renamed from: a */
    public long f2614a;

    /* renamed from: b */
    public long f2615b = -1;

    /* renamed from: c */
    public aov f2616c;

    /* renamed from: d */
    public boolean f2617d;

    /* renamed from: e */
    public final /* synthetic */ axq f2618e;

    /* renamed from: f */
    private final Uri f2619f;

    /* renamed from: g */
    private final bjd f2620g;

    /* renamed from: h */
    private final axl f2621h;

    /* renamed from: i */
    private final aok f2622i;

    /* renamed from: j */
    private final bki f2623j;

    /* renamed from: k */
    private final aop f2624k = new aop();

    /* renamed from: l */
    private volatile boolean f2625l;

    /* renamed from: m */
    private boolean f2626m = true;

    /* renamed from: n */
    private bhy f2627n = m2318a(0);

    public axk(axq axq, Uri uri, bhv bhv, axl axl, aok aok, bki bki) {
        this.f2618e = axq;
        this.f2619f = uri;
        this.f2620g = new bjd(bhv);
        this.f2621h = axl;
        this.f2622i = aok;
        this.f2623j = bki;
    }

    /* renamed from: a */
    private final bhy m2318a(long j) {
        Uri uri = this.f2619f;
        axq axq = this.f2618e;
        Map map = axq.f2639a;
        String str = axq.f2657e;
        return new bhy(uri, j, axq.f2639a);
    }

    /* renamed from: a */
    public final void mo1538a() {
        this.f2625l = true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x008e A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00b2 A[Catch:{ all -> 0x00d6 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00c6  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0096 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1540b() {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
        L_0x0002:
            if (r1 != 0) goto L_0x00eb
            boolean r2 = r12.f2625l
            if (r2 != 0) goto L_0x00eb
            r2 = 1
            aop r3 = r12.f2624k     // Catch:{ all -> 0x00d9 }
            long r10 = r3.f1514a     // Catch:{ all -> 0x00d9 }
            bhy r3 = r12.m2318a(r10)     // Catch:{ all -> 0x00d9 }
            r12.f2627n = r3     // Catch:{ all -> 0x00d9 }
            bjd r4 = r12.f2620g     // Catch:{ all -> 0x00d9 }
            long r3 = r4.mo1499a(r3)     // Catch:{ all -> 0x00d9 }
            r12.f2615b = r3     // Catch:{ all -> 0x00d9 }
            r5 = -1
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x0022
            goto L_0x0025
        L_0x0022:
            long r3 = r3 + r10
            r12.f2615b = r3     // Catch:{ all -> 0x00d9 }
        L_0x0025:
            bjd r3 = r12.f2620g     // Catch:{ all -> 0x00d9 }
            android.net.Uri r3 = r3.mo1500a()     // Catch:{ all -> 0x00d9 }
            java.lang.Object r3 = p000.bks.m3507a(r3)     // Catch:{ all -> 0x00d9 }
            android.net.Uri r3 = (android.net.Uri) r3     // Catch:{ all -> 0x00d9 }
            axq r3 = r12.f2618e     // Catch:{ all -> 0x00d9 }
            bjd r4 = r12.f2620g     // Catch:{ all -> 0x00d9 }
            java.util.Map r4 = r4.mo1502b()     // Catch:{ all -> 0x00d9 }
            aul r4 = p000.aul.m2169a(r4)     // Catch:{ all -> 0x00d9 }
            java.util.Map r5 = p000.axq.f2639a     // Catch:{ all -> 0x00d9 }
            r3.f2665m = r4     // Catch:{ all -> 0x00d9 }
            bjd r3 = r12.f2620g     // Catch:{ all -> 0x00d9 }
            axq r4 = r12.f2618e     // Catch:{ all -> 0x00d9 }
            aul r4 = r4.f2665m     // Catch:{ all -> 0x00d9 }
            if (r4 != 0) goto L_0x004a
            goto L_0x0069
        L_0x004a:
            int r4 = r4.f2449b     // Catch:{ all -> 0x00d9 }
            r5 = -1
            if (r4 == r5) goto L_0x0069
            awq r5 = new awq     // Catch:{ all -> 0x00d9 }
            r5.<init>(r3, r4, r12)     // Catch:{ all -> 0x00d9 }
            axq r3 = r12.f2618e     // Catch:{ all -> 0x00d9 }
            axp r4 = new axp     // Catch:{ all -> 0x00d9 }
            r4.<init>(r0, r2)     // Catch:{ all -> 0x00d9 }
            aov r3 = r3.mo1545a(r4)     // Catch:{ all -> 0x00d9 }
            r12.f2616c = r3     // Catch:{ all -> 0x00d9 }
            akh r4 = p000.axq.f2640b     // Catch:{ all -> 0x00d9 }
            r3.mo1204a(r4)     // Catch:{ all -> 0x00d9 }
            goto L_0x006a
        L_0x0069:
            r5 = r3
        L_0x006a:
            aof r3 = new aof     // Catch:{ all -> 0x00d9 }
            long r8 = r12.f2615b     // Catch:{ all -> 0x00d9 }
            r4 = r3
            r6 = r10
            r4.<init>(r5, r6, r8)     // Catch:{ all -> 0x00d9 }
            axl r4 = r12.f2621h     // Catch:{ all -> 0x00d6 }
            aok r5 = r12.f2622i     // Catch:{ all -> 0x00d6 }
            aoi r4 = r4.mo1541a(r3, r5)     // Catch:{ all -> 0x00d6 }
            axq r5 = r12.f2618e     // Catch:{ all -> 0x00d6 }
            aul r5 = r5.f2665m     // Catch:{ all -> 0x00d6 }
            if (r5 == 0) goto L_0x008a
            boolean r5 = r4 instanceof p000.apo     // Catch:{ all -> 0x00d6 }
            if (r5 == 0) goto L_0x008a
            r5 = r4
            apo r5 = (p000.apo) r5     // Catch:{ all -> 0x00d6 }
            r5.f1706a = r2     // Catch:{ all -> 0x00d6 }
        L_0x008a:
            boolean r5 = r12.f2626m     // Catch:{ all -> 0x00d6 }
            if (r5 == 0) goto L_0x00c3
            long r5 = r12.f2614a     // Catch:{ all -> 0x00d6 }
            r4.mo1207a(r10, r5)     // Catch:{ all -> 0x00d6 }
            r12.f2626m = r0     // Catch:{ all -> 0x00d6 }
            goto L_0x00c3
        L_0x0096:
            if (r1 != 0) goto L_0x00c4
            boolean r5 = r12.f2625l     // Catch:{ all -> 0x00d6 }
            if (r5 != 0) goto L_0x00c4
            bki r5 = r12.f2623j     // Catch:{ all -> 0x00d6 }
            r5.mo2034b()     // Catch:{ all -> 0x00d6 }
            aop r5 = r12.f2624k     // Catch:{ all -> 0x00d6 }
            int r1 = r4.mo1206a(r3, r5)     // Catch:{ all -> 0x00d6 }
            long r5 = r3.f1490c     // Catch:{ all -> 0x00d6 }
            axq r7 = r12.f2618e     // Catch:{ all -> 0x00d6 }
            long r7 = r7.f2658f     // Catch:{ all -> 0x00d6 }
            long r7 = r7 + r10
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 <= 0) goto L_0x00c3
            bki r7 = r12.f2623j     // Catch:{ all -> 0x00d6 }
            r7.mo2036d()     // Catch:{ all -> 0x00d6 }
            axq r7 = r12.f2618e     // Catch:{ all -> 0x00d6 }
            android.os.Handler r8 = r7.f2662j     // Catch:{ all -> 0x00d6 }
            java.lang.Runnable r7 = r7.f2661i     // Catch:{ all -> 0x00d6 }
            r8.post(r7)     // Catch:{ all -> 0x00d6 }
            r10 = r5
            goto L_0x0096
        L_0x00c3:
            goto L_0x0096
        L_0x00c4:
            if (r1 == r2) goto L_0x00cd
            aop r2 = r12.f2624k
            long r3 = r3.f1490c
            r2.f1514a = r3
            goto L_0x00cf
        L_0x00cd:
            r1 = 0
        L_0x00cf:
            bjd r2 = r12.f2620g
            p000.blm.m3644a(r2)
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
            aop r1 = r12.f2624k
            long r2 = r3.f1490c
            r1.f1514a = r2
        L_0x00e5:
            bjd r1 = r12.f2620g
            p000.blm.m3644a(r1)
            throw r0
        L_0x00eb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.axk.mo1540b():void");
    }

    /* renamed from: a */
    public final void mo1539a(long j, long j2) {
        this.f2624k.f1514a = j;
        this.f2614a = j2;
        this.f2626m = true;
        this.f2617d = false;
    }
}
