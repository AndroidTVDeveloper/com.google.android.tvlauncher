package p000;

import android.os.Looper;

/* renamed from: axt */
/* compiled from: PG */
public final class axt {

    /* renamed from: a */
    public final anu f2691a;

    /* renamed from: b */
    public akh f2692b;

    /* renamed from: c */
    public ans f2693c;

    /* renamed from: d */
    public int[] f2694d = new int[1000];

    /* renamed from: e */
    public akh[] f2695e = new akh[1000];

    /* renamed from: f */
    public int f2696f;

    /* renamed from: g */
    public int f2697g;

    /* renamed from: h */
    public int f2698h;

    /* renamed from: i */
    public int f2699i;

    /* renamed from: j */
    public long f2700j = Long.MIN_VALUE;

    /* renamed from: k */
    public long f2701k = Long.MIN_VALUE;

    /* renamed from: l */
    public boolean f2702l;

    /* renamed from: m */
    public boolean f2703m = true;

    /* renamed from: n */
    public boolean f2704n = true;

    /* renamed from: o */
    public akh f2705o;

    /* renamed from: p */
    public akh f2706p;

    /* renamed from: q */
    public int f2707q;

    /* renamed from: r */
    private int f2708r = 1000;

    /* renamed from: s */
    private int[] f2709s = new int[1000];

    /* renamed from: t */
    private long[] f2710t = new long[1000];

    /* renamed from: u */
    private int[] f2711u = new int[1000];

    /* renamed from: v */
    private long[] f2712v = new long[1000];

    /* renamed from: w */
    private aou[] f2713w = new aou[1000];

    public axt(anu anu) {
        this.f2691a = anu;
    }

    /* renamed from: a */
    public final int mo1556a() {
        return this.f2697g + this.f2696f;
    }

    /* renamed from: c */
    public final int mo1567c(int i) {
        int i2 = this.f2698h + i;
        int i3 = this.f2708r;
        return i2 >= i3 ? i2 - i3 : i2;
    }

    /* renamed from: d */
    public final synchronized akh mo1568d() {
        if (this.f2704n) {
            return null;
        }
        return this.f2705o;
    }

    /* renamed from: e */
    public final synchronized long mo1569e() {
        return this.f2701k;
    }

    /* renamed from: f */
    public final synchronized boolean mo1570f() {
        return this.f2702l;
    }

    /* renamed from: l */
    public final boolean mo1576l() {
        return this.f2699i != this.f2696f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return -1;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo1557a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.f2699i     // Catch:{ all -> 0x0038 }
            int r2 = r8.mo1567c(r0)     // Catch:{ all -> 0x0038 }
            boolean r0 = r8.mo1576l()     // Catch:{ all -> 0x0038 }
            r7 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r8.f2712v     // Catch:{ all -> 0x0038 }
            r3 = r0[r2]     // Catch:{ all -> 0x0038 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0036
            long r0 = r8.f2701k     // Catch:{ all -> 0x0038 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            if (r11 != 0) goto L_0x0020
            goto L_0x0036
        L_0x0020:
            int r11 = r8.f2696f     // Catch:{ all -> 0x0038 }
            int r0 = r8.f2699i     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.m2367a(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            if (r9 == r7) goto L_0x0036
            int r10 = r8.f2699i     // Catch:{ all -> 0x0038 }
            int r10 = r10 + r9
            r8.f2699i = r10     // Catch:{ all -> 0x0038 }
            monitor-exit(r8)
            return r9
        L_0x0036:
            monitor-exit(r8)
            return r7
        L_0x0038:
            r9 = move-exception
            monitor-exit(r8)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.axt.mo1557a(long, boolean):int");
    }

    /* renamed from: i */
    public final synchronized int mo1573i() {
        int i;
        int i2;
        i = this.f2696f;
        i2 = this.f2699i;
        this.f2699i = i;
        return i - i2;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r8 > r7.f2700j) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        return true;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo1561a(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f2696f     // Catch:{ all -> 0x004a }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0041
            long r3 = r7.f2700j     // Catch:{ all -> 0x004a }
            int r0 = r7.f2699i     // Catch:{ all -> 0x004a }
            long r5 = r7.m2370e(r0)     // Catch:{ all -> 0x004a }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x004a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            int r0 = r7.f2696f     // Catch:{ all -> 0x004a }
            int r1 = r0 + -1
            int r1 = r7.mo1567c(r1)     // Catch:{ all -> 0x004a }
        L_0x001f:
            int r3 = r7.f2699i     // Catch:{ all -> 0x004a }
            if (r0 > r3) goto L_0x0024
            goto L_0x0037
        L_0x0024:
            long[] r3 = r7.f2712v     // Catch:{ all -> 0x004a }
            r4 = r3[r1]     // Catch:{ all -> 0x004a }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0037
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x001f
            int r1 = r7.f2708r     // Catch:{ all -> 0x004a }
            int r1 = r1 + r3
            goto L_0x001f
        L_0x0037:
            int r8 = r7.f2697g     // Catch:{ all -> 0x004a }
            int r8 = r8 + r0
            r7.mo1559a(r8)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r2
        L_0x003f:
            monitor-exit(r7)
            return r1
        L_0x0041:
            long r3 = r7.f2700j     // Catch:{ all -> 0x004a }
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            monitor-exit(r7)
            if (r0 > 0) goto L_0x0049
            return r1
        L_0x0049:
            return r2
        L_0x004a:
            r8 = move-exception
            monitor-exit(r7)
            goto L_0x004e
        L_0x004d:
            throw r8
        L_0x004e:
            goto L_0x004d
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.axt.mo1561a(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d5, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo1560a(long r6, int r8, long r9, int r11, p000.aou r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.f2703m     // Catch:{ all -> 0x00d8 }
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x000e
        L_0x0007:
            r0 = r8 & 1
            if (r0 == 0) goto L_0x00d6
            r5.f2703m = r1     // Catch:{ all -> 0x00d8 }
        L_0x000e:
            boolean r0 = r5.f2704n     // Catch:{ all -> 0x00d8 }
            r2 = 1
            r0 = r0 ^ r2
            p000.bks.m3512b(r0)     // Catch:{ all -> 0x00d8 }
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001e
        L_0x001c:
            r0 = 0
        L_0x001e:
            r5.f2702l = r0     // Catch:{ all -> 0x00d8 }
            long r3 = r5.f2701k     // Catch:{ all -> 0x00d8 }
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ all -> 0x00d8 }
            r5.f2701k = r3     // Catch:{ all -> 0x00d8 }
            int r0 = r5.f2696f     // Catch:{ all -> 0x00d8 }
            int r0 = r5.mo1567c(r0)     // Catch:{ all -> 0x00d8 }
            long[] r3 = r5.f2712v     // Catch:{ all -> 0x00d8 }
            r3[r0] = r6     // Catch:{ all -> 0x00d8 }
            long[] r6 = r5.f2710t     // Catch:{ all -> 0x00d8 }
            r6[r0] = r9     // Catch:{ all -> 0x00d8 }
            int[] r7 = r5.f2711u     // Catch:{ all -> 0x00d8 }
            r7[r0] = r11     // Catch:{ all -> 0x00d8 }
            int[] r7 = r5.f2694d     // Catch:{ all -> 0x00d8 }
            r7[r0] = r8     // Catch:{ all -> 0x00d8 }
            aou[] r7 = r5.f2713w     // Catch:{ all -> 0x00d8 }
            r7[r0] = r12     // Catch:{ all -> 0x00d8 }
            akh[] r7 = r5.f2695e     // Catch:{ all -> 0x00d8 }
            akh r8 = r5.f2705o     // Catch:{ all -> 0x00d8 }
            r7[r0] = r8     // Catch:{ all -> 0x00d8 }
            int[] r7 = r5.f2709s     // Catch:{ all -> 0x00d8 }
            int r9 = r5.f2707q     // Catch:{ all -> 0x00d8 }
            r7[r0] = r9     // Catch:{ all -> 0x00d8 }
            r5.f2706p = r8     // Catch:{ all -> 0x00d8 }
            int r7 = r5.f2696f     // Catch:{ all -> 0x00d8 }
            int r7 = r7 + r2
            r5.f2696f = r7     // Catch:{ all -> 0x00d8 }
            int r8 = r5.f2708r     // Catch:{ all -> 0x00d8 }
            if (r7 != r8) goto L_0x00d4
            int r7 = r8 + 1000
            int[] r9 = new int[r7]     // Catch:{ all -> 0x00d8 }
            long[] r10 = new long[r7]     // Catch:{ all -> 0x00d8 }
            long[] r11 = new long[r7]     // Catch:{ all -> 0x00d8 }
            int[] r12 = new int[r7]     // Catch:{ all -> 0x00d8 }
            int[] r0 = new int[r7]     // Catch:{ all -> 0x00d8 }
            aou[] r2 = new p000.aou[r7]     // Catch:{ all -> 0x00d8 }
            akh[] r3 = new p000.akh[r7]     // Catch:{ all -> 0x00d8 }
            int r4 = r5.f2698h     // Catch:{ all -> 0x00d8 }
            int r8 = r8 - r4
            java.lang.System.arraycopy(r6, r4, r10, r1, r8)     // Catch:{ all -> 0x00d8 }
            long[] r6 = r5.f2712v     // Catch:{ all -> 0x00d8 }
            int r4 = r5.f2698h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r11, r1, r8)     // Catch:{ all -> 0x00d8 }
            int[] r6 = r5.f2694d     // Catch:{ all -> 0x00d8 }
            int r4 = r5.f2698h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r12, r1, r8)     // Catch:{ all -> 0x00d8 }
            int[] r6 = r5.f2711u     // Catch:{ all -> 0x00d8 }
            int r4 = r5.f2698h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r0, r1, r8)     // Catch:{ all -> 0x00d8 }
            aou[] r6 = r5.f2713w     // Catch:{ all -> 0x00d8 }
            int r4 = r5.f2698h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r2, r1, r8)     // Catch:{ all -> 0x00d8 }
            akh[] r6 = r5.f2695e     // Catch:{ all -> 0x00d8 }
            int r4 = r5.f2698h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r3, r1, r8)     // Catch:{ all -> 0x00d8 }
            int[] r6 = r5.f2709s     // Catch:{ all -> 0x00d8 }
            int r4 = r5.f2698h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r9, r1, r8)     // Catch:{ all -> 0x00d8 }
            int r6 = r5.f2698h     // Catch:{ all -> 0x00d8 }
            long[] r4 = r5.f2710t     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r10, r8, r6)     // Catch:{ all -> 0x00d8 }
            long[] r4 = r5.f2712v     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r11, r8, r6)     // Catch:{ all -> 0x00d8 }
            int[] r4 = r5.f2694d     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r12, r8, r6)     // Catch:{ all -> 0x00d8 }
            int[] r4 = r5.f2711u     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r0, r8, r6)     // Catch:{ all -> 0x00d8 }
            aou[] r4 = r5.f2713w     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r2, r8, r6)     // Catch:{ all -> 0x00d8 }
            akh[] r4 = r5.f2695e     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r3, r8, r6)     // Catch:{ all -> 0x00d8 }
            int[] r4 = r5.f2709s     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r9, r8, r6)     // Catch:{ all -> 0x00d8 }
            r5.f2710t = r10     // Catch:{ all -> 0x00d8 }
            r5.f2712v = r11     // Catch:{ all -> 0x00d8 }
            r5.f2694d = r12     // Catch:{ all -> 0x00d8 }
            r5.f2711u = r0     // Catch:{ all -> 0x00d8 }
            r5.f2713w = r2     // Catch:{ all -> 0x00d8 }
            r5.f2695e = r3     // Catch:{ all -> 0x00d8 }
            r5.f2709s = r9     // Catch:{ all -> 0x00d8 }
            r5.f2698h = r1     // Catch:{ all -> 0x00d8 }
            int r6 = r5.f2708r     // Catch:{ all -> 0x00d8 }
            r5.f2696f = r6     // Catch:{ all -> 0x00d8 }
            r5.f2708r = r7     // Catch:{ all -> 0x00d8 }
        L_0x00d4:
            monitor-exit(r5)
            return
        L_0x00d6:
            monitor-exit(r5)
            return
        L_0x00d8:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.axt.mo1560a(long, int, long, int, aou):void");
    }

    /* renamed from: d */
    private final long m2369d(int i) {
        this.f2700j = Math.max(this.f2700j, m2370e(i));
        int i2 = this.f2696f - i;
        this.f2696f = i2;
        this.f2697g += i;
        int i3 = this.f2698h + i;
        this.f2698h = i3;
        int i4 = this.f2708r;
        if (i3 >= i4) {
            i3 -= i4;
            this.f2698h = i3;
        }
        int i5 = this.f2699i - i;
        this.f2699i = i5;
        if (i5 < 0) {
            this.f2699i = 0;
        }
        if (i2 != 0) {
            return this.f2710t[i3];
        }
        if (i3 == 0) {
            i3 = i4;
        }
        int i6 = i3 - 1;
        return this.f2710t[i6] + ((long) this.f2711u[i6]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return -1;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long mo1563b(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f2696f     // Catch:{ all -> 0x002d }
            r1 = -1
            if (r0 != 0) goto L_0x0008
            goto L_0x002b
        L_0x0008:
            long[] r3 = r10.f2712v     // Catch:{ all -> 0x002d }
            int r5 = r10.f2698h     // Catch:{ all -> 0x002d }
            r6 = r3[r5]     // Catch:{ all -> 0x002d }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x002b
            if (r13 == 0) goto L_0x001a
            int r13 = r10.f2699i     // Catch:{ all -> 0x002d }
            if (r13 == r0) goto L_0x001a
            int r0 = r13 + 1
        L_0x001a:
            r6 = r0
            r9 = 0
            r4 = r10
            r7 = r11
            int r11 = r4.m2367a(r5, r6, r7, r9)     // Catch:{ all -> 0x002d }
            r12 = -1
            if (r11 == r12) goto L_0x002b
            long r11 = r10.m2369d(r11)     // Catch:{ all -> 0x002d }
            monitor-exit(r10)
            return r11
        L_0x002b:
            monitor-exit(r10)
            return r1
        L_0x002d:
            r11 = move-exception
            monitor-exit(r10)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.axt.mo1563b(long, boolean):long");
    }

    /* renamed from: k */
    public final synchronized long mo1575k() {
        int i;
        i = this.f2696f;
        return i == 0 ? -1 : m2369d(i);
    }

    /* renamed from: j */
    public final synchronized long mo1574j() {
        int i;
        i = this.f2699i;
        return i == 0 ? -1 : m2369d(i);
    }

    /* renamed from: a */
    public final long mo1559a(int i) {
        int a = mo1556a() - i;
        boolean z = false;
        bks.m3510a(a >= 0 && a <= this.f2696f - this.f2699i);
        int i2 = this.f2696f - a;
        this.f2696f = i2;
        this.f2701k = Math.max(this.f2700j, m2370e(i2));
        if (a == 0 && this.f2702l) {
            z = true;
        }
        this.f2702l = z;
        int i3 = this.f2696f;
        if (i3 == 0) {
            return 0;
        }
        int c = mo1567c(i3 - 1);
        return this.f2710t[c] + ((long) this.f2711u[c]);
    }

    /* renamed from: a */
    private final int m2367a(int i, int i2, long j, boolean z) {
        int i3 = i;
        int i4 = -1;
        for (int i5 = 0; i5 < i2 && this.f2712v[i3] <= j; i5++) {
            if (!z || (this.f2694d[i3] & 1) != 0) {
                i4 = i5;
            }
            i3++;
            if (i3 == this.f2708r) {
                i3 = 0;
            }
        }
        return i4;
    }

    /* renamed from: a */
    public final synchronized boolean mo1562a(akh akh) {
        if (akh != null) {
            this.f2704n = false;
            if (blm.m3652a(akh, this.f2705o)) {
                return false;
            }
            if (blm.m3652a(akh, this.f2706p)) {
                this.f2705o = this.f2706p;
                return true;
            }
            this.f2705o = akh;
            return true;
        }
        this.f2704n = true;
        return false;
    }

    /* renamed from: g */
    public final synchronized long mo1571g() {
        if (this.f2696f == 0) {
            return Long.MIN_VALUE;
        }
        return this.f2712v[this.f2698h];
    }

    /* renamed from: e */
    private final long m2370e(int i) {
        long j = Long.MIN_VALUE;
        if (i != 0) {
            int c = mo1567c(i - 1);
            for (int i2 = 0; i2 < i; i2++) {
                j = Math.max(j, this.f2712v[c]);
                if ((this.f2694d[c] & 1) != 0) {
                    break;
                }
                c--;
                if (c == -1) {
                    c = this.f2708r - 1;
                }
            }
        }
        return j;
    }

    /* renamed from: a */
    private final void m2368a(akh akh, aki aki) {
        aki.f576c = akh;
        akh akh2 = this.f2692b;
        anv anv = null;
        anq anq = akh2 != null ? akh2.f559l : null;
        this.f2692b = akh;
        if (this.f2691a != anu.f1453a) {
            anq anq2 = akh.f559l;
            aki.f574a = true;
            aki.f575b = this.f2693c;
            if (akh2 == null || !blm.m3652a(anq, anq2)) {
                ans ans = this.f2693c;
                Looper looper = (Looper) bks.m3507a(Looper.myLooper());
                if (anq2 != null) {
                    anv = new anv(new anr(new anx()));
                }
                this.f2693c = anv;
                aki.f575b = anv;
            }
        }
    }

    /* renamed from: c */
    public final synchronized int mo1566c() {
        return mo1576l() ? this.f2709s[mo1567c(this.f2699i)] : this.f2707q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        return -3;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0067=Splitter:B:23:0x0067, B:17:0x003b=Splitter:B:17:0x003b} */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int mo1558a(p000.aki r5, p000.anj r6, boolean r7, boolean r8, p000.axs r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.mo1576l()     // Catch:{ all -> 0x0095 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 == 0) goto L_0x0070
            int r8 = r4.f2699i     // Catch:{ all -> 0x0095 }
            int r8 = r4.mo1567c(r8)     // Catch:{ all -> 0x0095 }
            if (r7 != 0) goto L_0x0067
            akh[] r7 = r4.f2695e     // Catch:{ all -> 0x0095 }
            r7 = r7[r8]     // Catch:{ all -> 0x0095 }
            akh r0 = r4.f2692b     // Catch:{ all -> 0x0095 }
            if (r7 == r0) goto L_0x001b
            goto L_0x0067
        L_0x001b:
            anu r5 = r4.f2691a     // Catch:{ all -> 0x0095 }
            anu r7 = p000.anu.f1453a     // Catch:{ all -> 0x0095 }
            if (r5 != r7) goto L_0x0022
            goto L_0x003b
        L_0x0022:
            akh r5 = r4.f2692b     // Catch:{ all -> 0x0095 }
            java.lang.Object r5 = p000.blm.m3636a(r5)     // Catch:{ all -> 0x0095 }
            akh r5 = (p000.akh) r5     // Catch:{ all -> 0x0095 }
            anq r5 = r5.f559l     // Catch:{ all -> 0x0095 }
            if (r5 == 0) goto L_0x003b
            ans r5 = r4.f2693c     // Catch:{ all -> 0x0095 }
            java.lang.Object r5 = p000.bks.m3507a(r5)     // Catch:{ all -> 0x0095 }
            ans r5 = (p000.ans) r5     // Catch:{ all -> 0x0095 }
            r5.mo1174a()     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)
            return r2
        L_0x003b:
            int[] r5 = r4.f2694d     // Catch:{ all -> 0x0095 }
            r5 = r5[r8]     // Catch:{ all -> 0x0095 }
            r6.f1407a = r5     // Catch:{ all -> 0x0095 }
            long[] r5 = r4.f2712v     // Catch:{ all -> 0x0095 }
            r0 = r5[r8]     // Catch:{ all -> 0x0095 }
            r6.f1426d = r0     // Catch:{ all -> 0x0095 }
            boolean r5 = r6.mo1150e()     // Catch:{ all -> 0x0095 }
            if (r5 != 0) goto L_0x0065
            int[] r5 = r4.f2711u     // Catch:{ all -> 0x0095 }
            r5 = r5[r8]     // Catch:{ all -> 0x0095 }
            r9.f2688a = r5     // Catch:{ all -> 0x0095 }
            long[] r5 = r4.f2710t     // Catch:{ all -> 0x0095 }
            r6 = r5[r8]     // Catch:{ all -> 0x0095 }
            r9.f2689b = r6     // Catch:{ all -> 0x0095 }
            aou[] r5 = r4.f2713w     // Catch:{ all -> 0x0095 }
            r5 = r5[r8]     // Catch:{ all -> 0x0095 }
            r9.f2690c = r5     // Catch:{ all -> 0x0095 }
            int r5 = r4.f2699i     // Catch:{ all -> 0x0095 }
            int r5 = r5 + 1
            r4.f2699i = r5     // Catch:{ all -> 0x0095 }
        L_0x0065:
            monitor-exit(r4)
            return r3
        L_0x0067:
            akh[] r6 = r4.f2695e     // Catch:{ all -> 0x0095 }
            r6 = r6[r8]     // Catch:{ all -> 0x0095 }
            r4.m2368a(r6, r5)     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)
            return r1
        L_0x0070:
            if (r8 == 0) goto L_0x0073
            goto L_0x0090
        L_0x0073:
            boolean r8 = r4.f2702l     // Catch:{ all -> 0x0095 }
            if (r8 != 0) goto L_0x0090
            akh r6 = r4.f2705o     // Catch:{ all -> 0x0095 }
            if (r6 == 0) goto L_0x008e
            if (r7 == 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            akh r7 = r4.f2692b     // Catch:{ all -> 0x0095 }
            if (r6 != r7) goto L_0x0083
            goto L_0x008e
        L_0x0083:
            java.lang.Object r6 = p000.bks.m3507a(r6)     // Catch:{ all -> 0x0095 }
            akh r6 = (p000.akh) r6     // Catch:{ all -> 0x0095 }
            r4.m2368a(r6, r5)     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)
            return r1
        L_0x008e:
            monitor-exit(r4)
            return r2
        L_0x0090:
            r5 = 4
            r6.f1407a = r5     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)
            return r3
        L_0x0095:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.axt.mo1558a(aki, anj, boolean, boolean, axs):int");
    }

    /* renamed from: b */
    public final void mo1564b() {
        if (this.f2693c != null) {
            this.f2693c = null;
            this.f2692b = null;
        }
    }

    /* renamed from: h */
    public final synchronized void mo1572h() {
        this.f2699i = 0;
    }

    /* renamed from: b */
    public final synchronized boolean mo1565b(int i) {
        boolean z;
        int i2 = this.f2697g;
        if (i2 > i || i > this.f2696f + i2) {
            z = false;
        } else {
            this.f2699i = i - i2;
            z = true;
        }
        return z;
    }
}
