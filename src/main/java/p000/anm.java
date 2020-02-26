package p000;

import java.util.ArrayDeque;

/* renamed from: anm */
/* compiled from: PG */
public abstract class anm implements anh, bdm {

    /* renamed from: a */
    public final Object f1432a = new Object();

    /* renamed from: b */
    public final ank[] f1433b;

    /* renamed from: c */
    public int f1434c;

    /* renamed from: d */
    private final Thread f1435d;

    /* renamed from: e */
    private final ArrayDeque f1436e = new ArrayDeque();

    /* renamed from: f */
    private final ArrayDeque f1437f = new ArrayDeque();

    /* renamed from: g */
    private final anj[] f1438g = new bdq[2];

    /* renamed from: h */
    private int f1439h = 2;

    /* renamed from: i */
    private anj f1440i;

    /* renamed from: j */
    private Exception f1441j;

    /* renamed from: k */
    private boolean f1442k;

    /* renamed from: l */
    private boolean f1443l;

    /* renamed from: m */
    private int f1444m;

    /* renamed from: h */
    private final boolean m1586h() {
        return !this.f1436e.isEmpty() && this.f1434c > 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract bdl mo1155a(byte[] bArr, int i, boolean z);

    /* renamed from: a */
    public final void mo1156a(long j) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r1.mo1141c() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3.mo1143n(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r1.mo1138T() == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r3.mo1143n(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = (p000.bdq) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5 = r0.f1425c;
        ((p000.bdr) r3).mo1785a(r0.f1426d, mo1155a(r5.array(), r5.limit(), r4), r0.f3423f);
        r3.f1407a &= Integer.MAX_VALUE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0068, code lost:
        r0 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x006e, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x006f, code lost:
        r13.f1441j = m1583a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        r13.f1441j = m1583a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c A[SYNTHETIC] */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1158f() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.f1432a
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r13.f1443l     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r13.m1586h()     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r13.f1432a     // Catch:{ all -> 0x00b9 }
            r1.wait()     // Catch:{ all -> 0x00b9 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r13.f1443l     // Catch:{ all -> 0x00b9 }
            r2 = 0
            if (r1 != 0) goto L_0x00b7
            java.util.ArrayDeque r1 = r13.f1436e     // Catch:{ all -> 0x00b9 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00b9 }
            anj r1 = (p000.anj) r1     // Catch:{ all -> 0x00b9 }
            ank[] r3 = r13.f1433b     // Catch:{ all -> 0x00b9 }
            int r4 = r13.f1434c     // Catch:{ all -> 0x00b9 }
            int r4 = r4 + -1
            r13.f1434c = r4     // Catch:{ all -> 0x00b9 }
            r3 = r3[r4]     // Catch:{ all -> 0x00b9 }
            boolean r4 = r13.f1442k     // Catch:{ all -> 0x00b9 }
            r13.f1442k = r2     // Catch:{ all -> 0x00b9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            boolean r0 = r1.mo1141c()
            if (r0 == 0) goto L_0x003a
            r0 = 4
            r3.mo1143n(r0)
            goto L_0x0089
        L_0x003a:
            boolean r0 = r1.mo1138T()
            if (r0 == 0) goto L_0x0045
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.mo1143n(r0)
        L_0x0045:
            r0 = r1
            bdq r0 = (p000.bdq) r0     // Catch:{ RuntimeException -> 0x0076, OutOfMemoryError -> 0x006e }
            java.nio.ByteBuffer r5 = r0.f1425c     // Catch:{ bdn -> 0x006a }
            byte[] r6 = r5.array()     // Catch:{ bdn -> 0x006a }
            int r5 = r5.limit()     // Catch:{ bdn -> 0x006a }
            bdl r10 = r13.mo1155a(r6, r5, r4)     // Catch:{ bdn -> 0x006a }
            long r8 = r0.f1426d     // Catch:{ bdn -> 0x006a }
            long r11 = r0.f3423f     // Catch:{ bdn -> 0x006a }
            r7 = r3
            bdr r7 = (p000.bdr) r7     // Catch:{ bdn -> 0x006a }
            r7.mo1785a(r8, r10, r11)     // Catch:{ bdn -> 0x006a }
            int r0 = r3.f1407a     // Catch:{ bdn -> 0x006a }
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r4
            r3.f1407a = r0     // Catch:{ bdn -> 0x006a }
            r0 = 0
            goto L_0x006b
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            r13.f1441j = r0     // Catch:{ RuntimeException -> 0x0076, OutOfMemoryError -> 0x006e }
            goto L_0x007d
        L_0x006e:
            r0 = move-exception
            java.lang.Exception r0 = m1583a(r0)
            r13.f1441j = r0
            goto L_0x007d
        L_0x0076:
            r0 = move-exception
            java.lang.Exception r0 = m1583a(r0)
            r13.f1441j = r0
        L_0x007d:
            java.lang.Exception r0 = r13.f1441j
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r13.f1432a
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return r2
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r1
        L_0x0089:
            java.lang.Object r4 = r13.f1432a
            monitor-enter(r4)
            boolean r0 = r13.f1442k     // Catch:{ all -> 0x00b4 }
            r5 = 1
            if (r0 != 0) goto L_0x00ac
            boolean r0 = r3.mo1138T()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00a3
            int r0 = r13.f1444m     // Catch:{ all -> 0x00b4 }
            r3.f1430c = r0     // Catch:{ all -> 0x00b4 }
            r13.f1444m = r2     // Catch:{ all -> 0x00b4 }
            java.util.ArrayDeque r0 = r13.f1437f     // Catch:{ all -> 0x00b4 }
            r0.addLast(r3)     // Catch:{ all -> 0x00b4 }
            goto L_0x00af
        L_0x00a3:
            int r0 = r13.f1444m     // Catch:{ all -> 0x00b4 }
            int r0 = r0 + r5
            r13.f1444m = r0     // Catch:{ all -> 0x00b4 }
            r3.mo1153e()     // Catch:{ all -> 0x00b4 }
            goto L_0x00af
        L_0x00ac:
            r3.mo1153e()     // Catch:{ all -> 0x00b4 }
        L_0x00af:
            r13.m1584a(r1)     // Catch:{ all -> 0x00b4 }
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            return r5
        L_0x00b4:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x00b4 }
            throw r0
        L_0x00b7:
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            return r2
        L_0x00b9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            goto L_0x00bd
        L_0x00bc:
            throw r1
        L_0x00bd:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.anm.mo1158f():boolean");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1144a() {
        boolean z;
        anj anj;
        synchronized (this.f1432a) {
            m1585g();
            if (this.f1440i == null) {
                z = true;
            } else {
                z = false;
            }
            bks.m3512b(z);
            int i = this.f1439h;
            if (i != 0) {
                anj[] anjArr = this.f1438g;
                int i2 = i - 1;
                this.f1439h = i2;
                anj = anjArr[i2];
            } else {
                anj = null;
            }
            this.f1440i = anj;
        }
        return anj;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo1146b() {
        synchronized (this.f1432a) {
            m1585g();
            if (this.f1437f.isEmpty()) {
                return null;
            }
            ank ank = (ank) this.f1437f.removeFirst();
            return ank;
        }
    }

    /* renamed from: c */
    public final void mo1147c() {
        synchronized (this.f1432a) {
            this.f1442k = true;
            this.f1444m = 0;
            anj anj = this.f1440i;
            if (anj != null) {
                m1584a(anj);
                this.f1440i = null;
            }
            while (!this.f1436e.isEmpty()) {
                m1584a((anj) this.f1436e.removeFirst());
            }
            while (!this.f1437f.isEmpty()) {
                ((ank) this.f1437f.removeFirst()).mo1153e();
            }
        }
    }

    /* renamed from: e */
    public final void mo1157e() {
        if (m1586h()) {
            this.f1432a.notify();
        }
    }

    /* renamed from: g */
    private final void m1585g() {
        Exception exc = this.f1441j;
        if (exc != null) {
            throw exc;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1145a(Object obj) {
        boolean z;
        synchronized (this.f1432a) {
            m1585g();
            if (obj == this.f1440i) {
                z = true;
            } else {
                z = false;
            }
            bks.m3510a(z);
            this.f1436e.addLast(obj);
            mo1157e();
            this.f1440i = null;
        }
    }

    /* renamed from: d */
    public final void mo1148d() {
        synchronized (this.f1432a) {
            this.f1443l = true;
            this.f1432a.notify();
        }
        try {
            this.f1435d.join();
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    /* renamed from: a */
    private final void m1584a(anj anj) {
        anj.mo1139a();
        anj[] anjArr = this.f1438g;
        int i = this.f1439h;
        this.f1439h = i + 1;
        anjArr[i] = (bdq) anj;
    }

    protected anm() {
        bdr[] bdrArr = new bdr[2];
        for (int i = 0; i < this.f1439h; i++) {
            this.f1438g[i] = new bdq();
        }
        this.f1433b = bdrArr;
        this.f1434c = 2;
        for (int i2 = 0; i2 < this.f1434c; i2++) {
            this.f1433b[i2] = new bdk(this);
        }
        anl anl = new anl(this);
        this.f1435d = anl;
        anl.start();
        bks.m3512b(this.f1439h == 2);
        anj[] anjArr = this.f1438g;
        for (int i3 = 0; i3 < 2; i3++) {
            anjArr[i3].mo1149c(1024);
        }
    }

    /* renamed from: a */
    private static /* bridge */ /* synthetic */ Exception m1583a(Throwable th) {
        return new bdn("Unexpected decode error", th);
    }
}
