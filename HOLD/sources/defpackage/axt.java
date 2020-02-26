package defpackage;

import android.os.Looper;

/* renamed from: axt  reason: default package */
/* compiled from: PG */
public final class axt {
    public final anu a;
    public akh b;
    public ans c;
    public int[] d = new int[1000];
    public akh[] e = new akh[1000];
    public int f;
    public int g;
    public int h;
    public int i;
    public long j = Long.MIN_VALUE;
    public long k = Long.MIN_VALUE;
    public boolean l;
    public boolean m = true;
    public boolean n = true;
    public akh o;
    public akh p;
    public int q;
    private int r = 1000;
    private int[] s = new int[1000];
    private long[] t = new long[1000];
    private int[] u = new int[1000];
    private long[] v = new long[1000];
    private aou[] w = new aou[1000];

    public axt(anu anu) {
        this.a = anu;
    }

    public final int a() {
        return this.g + this.f;
    }

    public final int c(int i2) {
        int i3 = this.h + i2;
        int i4 = this.r;
        return i3 >= i4 ? i3 - i4 : i3;
    }

    public final synchronized akh d() {
        if (this.n) {
            return null;
        }
        return this.o;
    }

    public final synchronized long e() {
        return this.k;
    }

    public final synchronized boolean f() {
        return this.l;
    }

    public final boolean l() {
        return this.i != this.f;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0037, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(long r9, boolean r11) {
        /*
            r8 = this;
            monitor-enter(r8)
            int r0 = r8.i     // Catch:{ all -> 0x0038 }
            int r2 = r8.c(r0)     // Catch:{ all -> 0x0038 }
            boolean r0 = r8.l()     // Catch:{ all -> 0x0038 }
            r7 = -1
            if (r0 == 0) goto L_0x0036
            long[] r0 = r8.v     // Catch:{ all -> 0x0038 }
            r3 = r0[r2]     // Catch:{ all -> 0x0038 }
            int r0 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r0 < 0) goto L_0x0036
            long r0 = r8.k     // Catch:{ all -> 0x0038 }
            int r3 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r3 > 0) goto L_0x001d
            goto L_0x0020
        L_0x001d:
            if (r11 != 0) goto L_0x0020
            goto L_0x0036
        L_0x0020:
            int r11 = r8.f     // Catch:{ all -> 0x0038 }
            int r0 = r8.i     // Catch:{ all -> 0x0038 }
            int r3 = r11 - r0
            r6 = 1
            r1 = r8
            r4 = r9
            int r9 = r1.a(r2, r3, r4, r6)     // Catch:{ all -> 0x0038 }
            if (r9 == r7) goto L_0x0036
            int r10 = r8.i     // Catch:{ all -> 0x0038 }
            int r10 = r10 + r9
            r8.i = r10     // Catch:{ all -> 0x0038 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axt.a(long, boolean):int");
    }

    public final synchronized int i() {
        int i2;
        int i3;
        i2 = this.f;
        i3 = this.i;
        this.i = i2;
        return i2 - i3;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0046, code lost:
        if (r8 > r7.j) goto L_0x0049;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0048, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0049, code lost:
        return true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(long r8) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f     // Catch:{ all -> 0x004a }
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0041
            long r3 = r7.j     // Catch:{ all -> 0x004a }
            int r0 = r7.i     // Catch:{ all -> 0x004a }
            long r5 = r7.e(r0)     // Catch:{ all -> 0x004a }
            long r3 = java.lang.Math.max(r3, r5)     // Catch:{ all -> 0x004a }
            int r0 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r0 >= 0) goto L_0x003f
            int r0 = r7.f     // Catch:{ all -> 0x004a }
            int r1 = r0 + -1
            int r1 = r7.c(r1)     // Catch:{ all -> 0x004a }
        L_0x001f:
            int r3 = r7.i     // Catch:{ all -> 0x004a }
            if (r0 > r3) goto L_0x0024
            goto L_0x0037
        L_0x0024:
            long[] r3 = r7.v     // Catch:{ all -> 0x004a }
            r4 = r3[r1]     // Catch:{ all -> 0x004a }
            int r3 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r3 < 0) goto L_0x0037
            int r0 = r0 + -1
            int r1 = r1 + -1
            r3 = -1
            if (r1 != r3) goto L_0x001f
            int r1 = r7.r     // Catch:{ all -> 0x004a }
            int r1 = r1 + r3
            goto L_0x001f
        L_0x0037:
            int r8 = r7.g     // Catch:{ all -> 0x004a }
            int r8 = r8 + r0
            r7.a(r8)     // Catch:{ all -> 0x004a }
            monitor-exit(r7)
            return r2
        L_0x003f:
            monitor-exit(r7)
            return r1
        L_0x0041:
            long r3 = r7.j     // Catch:{ all -> 0x004a }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axt.a(long):boolean");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00d5, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(long r6, int r8, long r9, int r11, defpackage.aou r12) {
        /*
            r5 = this;
            monitor-enter(r5)
            boolean r0 = r5.m     // Catch:{ all -> 0x00d8 }
            r1 = 0
            if (r0 != 0) goto L_0x0007
            goto L_0x000e
        L_0x0007:
            r0 = r8 & 1
            if (r0 == 0) goto L_0x00d6
            r5.m = r1     // Catch:{ all -> 0x00d8 }
        L_0x000e:
            boolean r0 = r5.n     // Catch:{ all -> 0x00d8 }
            r2 = 1
            r0 = r0 ^ r2
            defpackage.bks.b(r0)     // Catch:{ all -> 0x00d8 }
            r0 = 536870912(0x20000000, float:1.0842022E-19)
            r0 = r0 & r8
            if (r0 == 0) goto L_0x001c
            r0 = 1
            goto L_0x001e
        L_0x001c:
            r0 = 0
        L_0x001e:
            r5.l = r0     // Catch:{ all -> 0x00d8 }
            long r3 = r5.k     // Catch:{ all -> 0x00d8 }
            long r3 = java.lang.Math.max(r3, r6)     // Catch:{ all -> 0x00d8 }
            r5.k = r3     // Catch:{ all -> 0x00d8 }
            int r0 = r5.f     // Catch:{ all -> 0x00d8 }
            int r0 = r5.c(r0)     // Catch:{ all -> 0x00d8 }
            long[] r3 = r5.v     // Catch:{ all -> 0x00d8 }
            r3[r0] = r6     // Catch:{ all -> 0x00d8 }
            long[] r6 = r5.t     // Catch:{ all -> 0x00d8 }
            r6[r0] = r9     // Catch:{ all -> 0x00d8 }
            int[] r7 = r5.u     // Catch:{ all -> 0x00d8 }
            r7[r0] = r11     // Catch:{ all -> 0x00d8 }
            int[] r7 = r5.d     // Catch:{ all -> 0x00d8 }
            r7[r0] = r8     // Catch:{ all -> 0x00d8 }
            aou[] r7 = r5.w     // Catch:{ all -> 0x00d8 }
            r7[r0] = r12     // Catch:{ all -> 0x00d8 }
            akh[] r7 = r5.e     // Catch:{ all -> 0x00d8 }
            akh r8 = r5.o     // Catch:{ all -> 0x00d8 }
            r7[r0] = r8     // Catch:{ all -> 0x00d8 }
            int[] r7 = r5.s     // Catch:{ all -> 0x00d8 }
            int r9 = r5.q     // Catch:{ all -> 0x00d8 }
            r7[r0] = r9     // Catch:{ all -> 0x00d8 }
            r5.p = r8     // Catch:{ all -> 0x00d8 }
            int r7 = r5.f     // Catch:{ all -> 0x00d8 }
            int r7 = r7 + r2
            r5.f = r7     // Catch:{ all -> 0x00d8 }
            int r8 = r5.r     // Catch:{ all -> 0x00d8 }
            if (r7 != r8) goto L_0x00d4
            int r7 = r8 + 1000
            int[] r9 = new int[r7]     // Catch:{ all -> 0x00d8 }
            long[] r10 = new long[r7]     // Catch:{ all -> 0x00d8 }
            long[] r11 = new long[r7]     // Catch:{ all -> 0x00d8 }
            int[] r12 = new int[r7]     // Catch:{ all -> 0x00d8 }
            int[] r0 = new int[r7]     // Catch:{ all -> 0x00d8 }
            aou[] r2 = new defpackage.aou[r7]     // Catch:{ all -> 0x00d8 }
            akh[] r3 = new defpackage.akh[r7]     // Catch:{ all -> 0x00d8 }
            int r4 = r5.h     // Catch:{ all -> 0x00d8 }
            int r8 = r8 - r4
            java.lang.System.arraycopy(r6, r4, r10, r1, r8)     // Catch:{ all -> 0x00d8 }
            long[] r6 = r5.v     // Catch:{ all -> 0x00d8 }
            int r4 = r5.h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r11, r1, r8)     // Catch:{ all -> 0x00d8 }
            int[] r6 = r5.d     // Catch:{ all -> 0x00d8 }
            int r4 = r5.h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r12, r1, r8)     // Catch:{ all -> 0x00d8 }
            int[] r6 = r5.u     // Catch:{ all -> 0x00d8 }
            int r4 = r5.h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r0, r1, r8)     // Catch:{ all -> 0x00d8 }
            aou[] r6 = r5.w     // Catch:{ all -> 0x00d8 }
            int r4 = r5.h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r2, r1, r8)     // Catch:{ all -> 0x00d8 }
            akh[] r6 = r5.e     // Catch:{ all -> 0x00d8 }
            int r4 = r5.h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r3, r1, r8)     // Catch:{ all -> 0x00d8 }
            int[] r6 = r5.s     // Catch:{ all -> 0x00d8 }
            int r4 = r5.h     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r6, r4, r9, r1, r8)     // Catch:{ all -> 0x00d8 }
            int r6 = r5.h     // Catch:{ all -> 0x00d8 }
            long[] r4 = r5.t     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r10, r8, r6)     // Catch:{ all -> 0x00d8 }
            long[] r4 = r5.v     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r11, r8, r6)     // Catch:{ all -> 0x00d8 }
            int[] r4 = r5.d     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r12, r8, r6)     // Catch:{ all -> 0x00d8 }
            int[] r4 = r5.u     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r0, r8, r6)     // Catch:{ all -> 0x00d8 }
            aou[] r4 = r5.w     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r2, r8, r6)     // Catch:{ all -> 0x00d8 }
            akh[] r4 = r5.e     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r3, r8, r6)     // Catch:{ all -> 0x00d8 }
            int[] r4 = r5.s     // Catch:{ all -> 0x00d8 }
            java.lang.System.arraycopy(r4, r1, r9, r8, r6)     // Catch:{ all -> 0x00d8 }
            r5.t = r10     // Catch:{ all -> 0x00d8 }
            r5.v = r11     // Catch:{ all -> 0x00d8 }
            r5.d = r12     // Catch:{ all -> 0x00d8 }
            r5.u = r0     // Catch:{ all -> 0x00d8 }
            r5.w = r2     // Catch:{ all -> 0x00d8 }
            r5.e = r3     // Catch:{ all -> 0x00d8 }
            r5.s = r9     // Catch:{ all -> 0x00d8 }
            r5.h = r1     // Catch:{ all -> 0x00d8 }
            int r6 = r5.r     // Catch:{ all -> 0x00d8 }
            r5.f = r6     // Catch:{ all -> 0x00d8 }
            r5.r = r7     // Catch:{ all -> 0x00d8 }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axt.a(long, int, long, int, aou):void");
    }

    private final long d(int i2) {
        this.j = Math.max(this.j, e(i2));
        int i3 = this.f - i2;
        this.f = i3;
        this.g += i2;
        int i4 = this.h + i2;
        this.h = i4;
        int i5 = this.r;
        if (i4 >= i5) {
            i4 -= i5;
            this.h = i4;
        }
        int i6 = this.i - i2;
        this.i = i6;
        if (i6 < 0) {
            this.i = 0;
        }
        if (i3 != 0) {
            return this.t[i4];
        }
        if (i4 == 0) {
            i4 = i5;
        }
        int i7 = i4 - 1;
        return this.t[i7] + ((long) this.u[i7]);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x002c, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized long b(long r11, boolean r13) {
        /*
            r10 = this;
            monitor-enter(r10)
            int r0 = r10.f     // Catch:{ all -> 0x002d }
            r1 = -1
            if (r0 != 0) goto L_0x0008
            goto L_0x002b
        L_0x0008:
            long[] r3 = r10.v     // Catch:{ all -> 0x002d }
            int r5 = r10.h     // Catch:{ all -> 0x002d }
            r6 = r3[r5]     // Catch:{ all -> 0x002d }
            int r3 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r3 < 0) goto L_0x002b
            if (r13 == 0) goto L_0x001a
            int r13 = r10.i     // Catch:{ all -> 0x002d }
            if (r13 == r0) goto L_0x001a
            int r0 = r13 + 1
        L_0x001a:
            r6 = r0
            r9 = 0
            r4 = r10
            r7 = r11
            int r11 = r4.a(r5, r6, r7, r9)     // Catch:{ all -> 0x002d }
            r12 = -1
            if (r11 == r12) goto L_0x002b
            long r11 = r10.d(r11)     // Catch:{ all -> 0x002d }
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axt.b(long, boolean):long");
    }

    public final synchronized long k() {
        int i2;
        i2 = this.f;
        return i2 == 0 ? -1 : d(i2);
    }

    public final synchronized long j() {
        int i2;
        i2 = this.i;
        return i2 == 0 ? -1 : d(i2);
    }

    public final long a(int i2) {
        int a2 = a() - i2;
        boolean z = false;
        bks.a(a2 >= 0 && a2 <= this.f - this.i);
        int i3 = this.f - a2;
        this.f = i3;
        this.k = Math.max(this.j, e(i3));
        if (a2 == 0 && this.l) {
            z = true;
        }
        this.l = z;
        int i4 = this.f;
        if (i4 == 0) {
            return 0;
        }
        int c2 = c(i4 - 1);
        return this.t[c2] + ((long) this.u[c2]);
    }

    private final int a(int i2, int i3, long j2, boolean z) {
        int i4 = i2;
        int i5 = -1;
        for (int i6 = 0; i6 < i3 && this.v[i4] <= j2; i6++) {
            if (!z || (this.d[i4] & 1) != 0) {
                i5 = i6;
            }
            i4++;
            if (i4 == this.r) {
                i4 = 0;
            }
        }
        return i5;
    }

    public final synchronized boolean a(akh akh) {
        if (akh != null) {
            this.n = false;
            if (blm.a(akh, this.o)) {
                return false;
            }
            if (blm.a(akh, this.p)) {
                this.o = this.p;
                return true;
            }
            this.o = akh;
            return true;
        }
        this.n = true;
        return false;
    }

    public final synchronized long g() {
        if (this.f == 0) {
            return Long.MIN_VALUE;
        }
        return this.v[this.h];
    }

    private final long e(int i2) {
        long j2 = Long.MIN_VALUE;
        if (i2 != 0) {
            int c2 = c(i2 - 1);
            for (int i3 = 0; i3 < i2; i3++) {
                j2 = Math.max(j2, this.v[c2]);
                if ((this.d[c2] & 1) != 0) {
                    break;
                }
                c2--;
                if (c2 == -1) {
                    c2 = this.r - 1;
                }
            }
        }
        return j2;
    }

    private final void a(akh akh, aki aki) {
        aki.c = akh;
        akh akh2 = this.b;
        anv anv = null;
        anq anq = akh2 != null ? akh2.l : null;
        this.b = akh;
        if (this.a != anu.a) {
            anq anq2 = akh.l;
            aki.a = true;
            aki.b = this.c;
            if (akh2 == null || !blm.a(anq, anq2)) {
                ans ans = this.c;
                Looper looper = (Looper) bks.a(Looper.myLooper());
                if (anq2 != null) {
                    anv = new anv(new anr(new anx()));
                }
                this.c = anv;
                aki.b = anv;
            }
        }
    }

    public final synchronized int c() {
        return l() ? this.s[c(this.i)] : this.q;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0066, code lost:
        return -4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x008f, code lost:
        return -3;
     */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:23:0x0067=Splitter:B:23:0x0067, B:17:0x003b=Splitter:B:17:0x003b} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized int a(defpackage.aki r5, defpackage.anj r6, boolean r7, boolean r8, defpackage.axs r9) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = r4.l()     // Catch:{ all -> 0x0095 }
            r1 = -5
            r2 = -3
            r3 = -4
            if (r0 == 0) goto L_0x0070
            int r8 = r4.i     // Catch:{ all -> 0x0095 }
            int r8 = r4.c(r8)     // Catch:{ all -> 0x0095 }
            if (r7 != 0) goto L_0x0067
            akh[] r7 = r4.e     // Catch:{ all -> 0x0095 }
            r7 = r7[r8]     // Catch:{ all -> 0x0095 }
            akh r0 = r4.b     // Catch:{ all -> 0x0095 }
            if (r7 == r0) goto L_0x001b
            goto L_0x0067
        L_0x001b:
            anu r5 = r4.a     // Catch:{ all -> 0x0095 }
            anu r7 = defpackage.anu.a     // Catch:{ all -> 0x0095 }
            if (r5 != r7) goto L_0x0022
            goto L_0x003b
        L_0x0022:
            akh r5 = r4.b     // Catch:{ all -> 0x0095 }
            java.lang.Object r5 = defpackage.blm.a(r5)     // Catch:{ all -> 0x0095 }
            akh r5 = (defpackage.akh) r5     // Catch:{ all -> 0x0095 }
            anq r5 = r5.l     // Catch:{ all -> 0x0095 }
            if (r5 == 0) goto L_0x003b
            ans r5 = r4.c     // Catch:{ all -> 0x0095 }
            java.lang.Object r5 = defpackage.bks.a(r5)     // Catch:{ all -> 0x0095 }
            ans r5 = (defpackage.ans) r5     // Catch:{ all -> 0x0095 }
            r5.a()     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)
            return r2
        L_0x003b:
            int[] r5 = r4.d     // Catch:{ all -> 0x0095 }
            r5 = r5[r8]     // Catch:{ all -> 0x0095 }
            r6.a = r5     // Catch:{ all -> 0x0095 }
            long[] r5 = r4.v     // Catch:{ all -> 0x0095 }
            r0 = r5[r8]     // Catch:{ all -> 0x0095 }
            r6.d = r0     // Catch:{ all -> 0x0095 }
            boolean r5 = r6.e()     // Catch:{ all -> 0x0095 }
            if (r5 != 0) goto L_0x0065
            int[] r5 = r4.u     // Catch:{ all -> 0x0095 }
            r5 = r5[r8]     // Catch:{ all -> 0x0095 }
            r9.a = r5     // Catch:{ all -> 0x0095 }
            long[] r5 = r4.t     // Catch:{ all -> 0x0095 }
            r6 = r5[r8]     // Catch:{ all -> 0x0095 }
            r9.b = r6     // Catch:{ all -> 0x0095 }
            aou[] r5 = r4.w     // Catch:{ all -> 0x0095 }
            r5 = r5[r8]     // Catch:{ all -> 0x0095 }
            r9.c = r5     // Catch:{ all -> 0x0095 }
            int r5 = r4.i     // Catch:{ all -> 0x0095 }
            int r5 = r5 + 1
            r4.i = r5     // Catch:{ all -> 0x0095 }
        L_0x0065:
            monitor-exit(r4)
            return r3
        L_0x0067:
            akh[] r6 = r4.e     // Catch:{ all -> 0x0095 }
            r6 = r6[r8]     // Catch:{ all -> 0x0095 }
            r4.a(r6, r5)     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)
            return r1
        L_0x0070:
            if (r8 == 0) goto L_0x0073
            goto L_0x0090
        L_0x0073:
            boolean r8 = r4.l     // Catch:{ all -> 0x0095 }
            if (r8 != 0) goto L_0x0090
            akh r6 = r4.o     // Catch:{ all -> 0x0095 }
            if (r6 == 0) goto L_0x008e
            if (r7 == 0) goto L_0x007e
            goto L_0x0083
        L_0x007e:
            akh r7 = r4.b     // Catch:{ all -> 0x0095 }
            if (r6 != r7) goto L_0x0083
            goto L_0x008e
        L_0x0083:
            java.lang.Object r6 = defpackage.bks.a(r6)     // Catch:{ all -> 0x0095 }
            akh r6 = (defpackage.akh) r6     // Catch:{ all -> 0x0095 }
            r4.a(r6, r5)     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)
            return r1
        L_0x008e:
            monitor-exit(r4)
            return r2
        L_0x0090:
            r5 = 4
            r6.a = r5     // Catch:{ all -> 0x0095 }
            monitor-exit(r4)
            return r3
        L_0x0095:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axt.a(aki, anj, boolean, boolean, axs):int");
    }

    public final void b() {
        if (this.c != null) {
            this.c = null;
            this.b = null;
        }
    }

    public final synchronized void h() {
        this.i = 0;
    }

    public final synchronized boolean b(int i2) {
        boolean z;
        int i3 = this.g;
        if (i3 > i2 || i2 > this.f + i3) {
            z = false;
        } else {
            this.i = i2 - i3;
            z = true;
        }
        return z;
    }
}
