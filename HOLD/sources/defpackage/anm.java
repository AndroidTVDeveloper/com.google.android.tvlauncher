package defpackage;

import java.util.ArrayDeque;

/* renamed from: anm  reason: default package */
/* compiled from: PG */
public abstract class anm implements anh, bdm {
    public final Object a = new Object();
    public final ank[] b;
    public int c;
    private final Thread d;
    private final ArrayDeque e = new ArrayDeque();
    private final ArrayDeque f = new ArrayDeque();
    private final anj[] g = new bdq[2];
    private int h = 2;
    private anj i;
    private Exception j;
    private boolean k;
    private boolean l;
    private int m;

    private final boolean h() {
        return !this.e.isEmpty() && this.c > 0;
    }

    /* access modifiers changed from: protected */
    public abstract bdl a(byte[] bArr, int i2, boolean z);

    public final void a(long j2) {
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0033, code lost:
        if (r1.c() == false) goto L_0x003a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0035, code lost:
        r3.n(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x003e, code lost:
        if (r1.T() == false) goto L_0x0045;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0040, code lost:
        r3.n(Integer.MIN_VALUE);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:?, code lost:
        r0 = (defpackage.bdq) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r5 = r0.c;
        ((defpackage.bdr) r3).a(r0.d, a(r5.array(), r5.limit(), r4), r0.f);
        r3.a &= Integer.MAX_VALUE;
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
        r13.j = a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0076, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0077, code lost:
        r13.j = a((java.lang.Throwable) r0);
     */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0081  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008c A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean f() {
        /*
            r13 = this;
            java.lang.Object r0 = r13.a
            monitor-enter(r0)
        L_0x0003:
            boolean r1 = r13.l     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x0013
            boolean r1 = r13.h()     // Catch:{ all -> 0x00b9 }
            if (r1 != 0) goto L_0x0013
            java.lang.Object r1 = r13.a     // Catch:{ all -> 0x00b9 }
            r1.wait()     // Catch:{ all -> 0x00b9 }
            goto L_0x0003
        L_0x0013:
            boolean r1 = r13.l     // Catch:{ all -> 0x00b9 }
            r2 = 0
            if (r1 != 0) goto L_0x00b7
            java.util.ArrayDeque r1 = r13.e     // Catch:{ all -> 0x00b9 }
            java.lang.Object r1 = r1.removeFirst()     // Catch:{ all -> 0x00b9 }
            anj r1 = (defpackage.anj) r1     // Catch:{ all -> 0x00b9 }
            ank[] r3 = r13.b     // Catch:{ all -> 0x00b9 }
            int r4 = r13.c     // Catch:{ all -> 0x00b9 }
            int r4 = r4 + -1
            r13.c = r4     // Catch:{ all -> 0x00b9 }
            r3 = r3[r4]     // Catch:{ all -> 0x00b9 }
            boolean r4 = r13.k     // Catch:{ all -> 0x00b9 }
            r13.k = r2     // Catch:{ all -> 0x00b9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00b9 }
            boolean r0 = r1.c()
            if (r0 == 0) goto L_0x003a
            r0 = 4
            r3.n(r0)
            goto L_0x0089
        L_0x003a:
            boolean r0 = r1.T()
            if (r0 == 0) goto L_0x0045
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r3.n(r0)
        L_0x0045:
            r0 = r1
            bdq r0 = (defpackage.bdq) r0     // Catch:{ RuntimeException -> 0x0076, OutOfMemoryError -> 0x006e }
            java.nio.ByteBuffer r5 = r0.c     // Catch:{ bdn -> 0x006a }
            byte[] r6 = r5.array()     // Catch:{ bdn -> 0x006a }
            int r5 = r5.limit()     // Catch:{ bdn -> 0x006a }
            bdl r10 = r13.a(r6, r5, r4)     // Catch:{ bdn -> 0x006a }
            long r8 = r0.d     // Catch:{ bdn -> 0x006a }
            long r11 = r0.f     // Catch:{ bdn -> 0x006a }
            r7 = r3
            bdr r7 = (defpackage.bdr) r7     // Catch:{ bdn -> 0x006a }
            r7.a(r8, r10, r11)     // Catch:{ bdn -> 0x006a }
            int r0 = r3.a     // Catch:{ bdn -> 0x006a }
            r4 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r4
            r3.a = r0     // Catch:{ bdn -> 0x006a }
            r0 = 0
            goto L_0x006b
        L_0x006a:
            r0 = move-exception
        L_0x006b:
            r13.j = r0     // Catch:{ RuntimeException -> 0x0076, OutOfMemoryError -> 0x006e }
            goto L_0x007d
        L_0x006e:
            r0 = move-exception
            java.lang.Exception r0 = a(r0)
            r13.j = r0
            goto L_0x007d
        L_0x0076:
            r0 = move-exception
            java.lang.Exception r0 = a(r0)
            r13.j = r0
        L_0x007d:
            java.lang.Exception r0 = r13.j
            if (r0 == 0) goto L_0x0089
            java.lang.Object r0 = r13.a
            monitor-enter(r0)
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            return r2
        L_0x0086:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0086 }
            throw r1
        L_0x0089:
            java.lang.Object r4 = r13.a
            monitor-enter(r4)
            boolean r0 = r13.k     // Catch:{ all -> 0x00b4 }
            r5 = 1
            if (r0 != 0) goto L_0x00ac
            boolean r0 = r3.T()     // Catch:{ all -> 0x00b4 }
            if (r0 != 0) goto L_0x00a3
            int r0 = r13.m     // Catch:{ all -> 0x00b4 }
            r3.c = r0     // Catch:{ all -> 0x00b4 }
            r13.m = r2     // Catch:{ all -> 0x00b4 }
            java.util.ArrayDeque r0 = r13.f     // Catch:{ all -> 0x00b4 }
            r0.addLast(r3)     // Catch:{ all -> 0x00b4 }
            goto L_0x00af
        L_0x00a3:
            int r0 = r13.m     // Catch:{ all -> 0x00b4 }
            int r0 = r0 + r5
            r13.m = r0     // Catch:{ all -> 0x00b4 }
            r3.e()     // Catch:{ all -> 0x00b4 }
            goto L_0x00af
        L_0x00ac:
            r3.e()     // Catch:{ all -> 0x00b4 }
        L_0x00af:
            r13.a(r1)     // Catch:{ all -> 0x00b4 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.anm.f():boolean");
    }

    public final /* bridge */ /* synthetic */ Object a() {
        boolean z;
        anj anj;
        synchronized (this.a) {
            g();
            if (this.i == null) {
                z = true;
            } else {
                z = false;
            }
            bks.b(z);
            int i2 = this.h;
            if (i2 != 0) {
                anj[] anjArr = this.g;
                int i3 = i2 - 1;
                this.h = i3;
                anj = anjArr[i3];
            } else {
                anj = null;
            }
            this.i = anj;
        }
        return anj;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        synchronized (this.a) {
            g();
            if (this.f.isEmpty()) {
                return null;
            }
            ank ank = (ank) this.f.removeFirst();
            return ank;
        }
    }

    public final void c() {
        synchronized (this.a) {
            this.k = true;
            this.m = 0;
            anj anj = this.i;
            if (anj != null) {
                a(anj);
                this.i = null;
            }
            while (!this.e.isEmpty()) {
                a((anj) this.e.removeFirst());
            }
            while (!this.f.isEmpty()) {
                ((ank) this.f.removeFirst()).e();
            }
        }
    }

    public final void e() {
        if (h()) {
            this.a.notify();
        }
    }

    private final void g() {
        Exception exc = this.j;
        if (exc != null) {
            throw exc;
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        boolean z;
        synchronized (this.a) {
            g();
            if (obj == this.i) {
                z = true;
            } else {
                z = false;
            }
            bks.a(z);
            this.e.addLast(obj);
            e();
            this.i = null;
        }
    }

    public final void d() {
        synchronized (this.a) {
            this.l = true;
            this.a.notify();
        }
        try {
            this.d.join();
        } catch (InterruptedException e2) {
            Thread.currentThread().interrupt();
        }
    }

    private final void a(anj anj) {
        anj.a();
        anj[] anjArr = this.g;
        int i2 = this.h;
        this.h = i2 + 1;
        anjArr[i2] = (bdq) anj;
    }

    protected anm() {
        bdr[] bdrArr = new bdr[2];
        for (int i2 = 0; i2 < this.h; i2++) {
            this.g[i2] = new bdq();
        }
        this.b = bdrArr;
        this.c = 2;
        for (int i3 = 0; i3 < this.c; i3++) {
            this.b[i3] = new bdk(this);
        }
        anl anl = new anl(this);
        this.d = anl;
        anl.start();
        bks.b(this.h == 2);
        anj[] anjArr = this.g;
        for (int i4 = 0; i4 < 2; i4++) {
            anjArr[i4].c(1024);
        }
    }

    private static /* bridge */ /* synthetic */ Exception a(Throwable th) {
        return new bdn("Unexpected decode error", th);
    }
}
