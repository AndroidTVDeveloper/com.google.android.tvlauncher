package p000;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: axw */
/* compiled from: PG */
public class axw implements aov {

    /* renamed from: a */
    public final axt f2719a;

    /* renamed from: b */
    public boolean f2720b;

    /* renamed from: c */
    public axv f2721c;

    /* renamed from: d */
    private final bhk f2722d;

    /* renamed from: e */
    private final int f2723e = 65536;

    /* renamed from: f */
    private final axs f2724f;

    /* renamed from: g */
    private final bky f2725g;

    /* renamed from: h */
    private axu f2726h;

    /* renamed from: i */
    private axu f2727i;

    /* renamed from: j */
    private axu f2728j;

    /* renamed from: k */
    private boolean f2729k;

    /* renamed from: l */
    private akh f2730l;

    /* renamed from: m */
    private long f2731m;

    /* renamed from: n */
    private long f2732n;

    public axw(bhk bhk, anu anu) {
        this.f2722d = bhk;
        this.f2719a = new axt(anu);
        this.f2724f = new axs();
        this.f2725g = new bky(32);
        axu axu = new axu(0, this.f2723e);
        this.f2726h = axu;
        this.f2727i = axu;
        this.f2728j = axu;
    }

    /* renamed from: d */
    public final int mo1591d() {
        return this.f2719a.f2697g;
    }

    /* renamed from: e */
    public final int mo1592e() {
        axt axt = this.f2719a;
        return axt.f2697g + axt.f2699i;
    }

    /* renamed from: c */
    private final void m2399c(long j) {
        while (true) {
            axu axu = this.f2727i;
            if (j >= axu.f2715b) {
                this.f2727i = axu.f2718e;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final int mo1579a(long j, boolean z) {
        return this.f2719a.mo1557a(j, z);
    }

    /* renamed from: m */
    public final int mo1600m() {
        return this.f2719a.mo1573i();
    }

    /* renamed from: a */
    private final void m2397a(axu axu) {
        if (axu.f2716c) {
            axu axu2 = this.f2728j;
            int i = (axu2.f2716c ? 1 : 0) + (((int) (axu2.f2714a - axu.f2714a)) / this.f2723e);
            bhj[] bhjArr = new bhj[i];
            for (int i2 = 0; i2 < i; i2++) {
                bhjArr[i2] = axu.f2717d;
                axu = axu.mo1578a();
            }
            this.f2722d.mo1939a(bhjArr);
        }
    }

    /* renamed from: a */
    public final void mo1583a(long j) {
        axu axu;
        if (j != -1) {
            while (true) {
                axu = this.f2726h;
                if (j < axu.f2715b) {
                    break;
                }
                this.f2722d.mo1938a(axu.f2717d);
                this.f2726h = this.f2726h.mo1578a();
            }
            if (this.f2727i.f2714a < axu.f2714a) {
                this.f2727i = axu;
            }
        }
    }

    /* renamed from: b */
    public final void mo1588b(long j, boolean z) {
        mo1583a(this.f2719a.mo1563b(j, z));
    }

    /* renamed from: l */
    public final void mo1599l() {
        mo1583a(this.f2719a.mo1575k());
    }

    /* renamed from: b */
    public final void mo1586b(int i) {
        long a = this.f2719a.mo1559a(i);
        this.f2732n = a;
        if (a != 0) {
            axu axu = this.f2726h;
            if (a != axu.f2714a) {
                while (this.f2732n > axu.f2715b) {
                    axu = axu.f2718e;
                }
                axu axu2 = axu.f2718e;
                m2397a(axu2);
                axu.f2718e = new axu(axu.f2715b, this.f2723e);
                this.f2728j = this.f2732n == axu.f2715b ? axu.f2718e : axu;
                if (this.f2727i == axu2) {
                    this.f2727i = axu.f2718e;
                    return;
                }
                return;
            }
        }
        m2397a(this.f2726h);
        axu axu3 = new axu(this.f2732n, this.f2723e);
        this.f2726h = axu3;
        this.f2727i = axu3;
        this.f2728j = axu3;
    }

    /* renamed from: a */
    public void mo1204a(akh akh) {
        akh akh2;
        long j = this.f2731m;
        if (akh != null) {
            if (j != 0) {
                long j2 = akh.f560m;
                if (j2 != Long.MAX_VALUE) {
                    akh2 = akh.mo421a(j2 + j);
                }
            }
            akh2 = akh;
        } else {
            akh2 = null;
        }
        boolean a = this.f2719a.mo1562a(akh2);
        this.f2730l = akh;
        this.f2729k = false;
        axv axv = this.f2721c;
        if (axv != null && a) {
            axv.mo1555k();
        }
    }

    /* renamed from: h */
    public final long mo1595h() {
        return this.f2719a.mo1569e();
    }

    /* renamed from: g */
    public final akh mo1594g() {
        return this.f2719a.mo1568d();
    }

    /* renamed from: b */
    public final int mo1585b() {
        return this.f2719a.mo1556a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo1589b(boolean r6) {
        /*
            r5 = this;
            axt r0 = r5.f2719a
            boolean r1 = r0.mo1576l()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003f
            int r6 = r0.f2699i
            int r6 = r0.mo1567c(r6)
            akh[] r1 = r0.f2695e
            r1 = r1[r6]
            akh r4 = r0.f2692b
            if (r1 != r4) goto L_0x003e
            java.lang.Object r1 = p000.bks.m3507a(r4)
            akh r1 = (p000.akh) r1
            anq r1 = r1.f559l
            if (r1 == 0) goto L_0x003e
            anu r1 = r0.f2691a
            anu r4 = p000.anu.f1453a
            if (r1 == r4) goto L_0x003e
            ans r1 = r0.f2693c
            java.lang.Object r1 = p000.bks.m3507a(r1)
            ans r1 = (p000.ans) r1
            r1.mo1174a()
            int[] r0 = r0.f2694d
            r6 = r0[r6]
            r0 = 1073741824(0x40000000, float:2.0)
            r6 = r6 & r0
            if (r6 == 0) goto L_0x003d
            goto L_0x004e
        L_0x003d:
            return r2
        L_0x003e:
            goto L_0x004f
        L_0x003f:
            if (r6 != 0) goto L_0x0051
            boolean r6 = r0.f2702l
            if (r6 != 0) goto L_0x0051
            akh r6 = r0.f2705o
            if (r6 == 0) goto L_0x0050
            akh r0 = r0.f2692b
            if (r6 == r0) goto L_0x004e
            goto L_0x0051
        L_0x004e:
            r3 = 0
        L_0x004f:
            return r3
        L_0x0050:
            r3 = 0
        L_0x0051:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.axw.mo1589b(boolean):boolean");
    }

    /* renamed from: c */
    public final void mo1590c() {
        ans ans = this.f2719a.f2693c;
        if (ans != null) {
            throw ((anr) bks.m3507a(((anv) ans).f1454a));
        }
    }

    /* renamed from: f */
    public final int mo1593f() {
        return this.f2719a.mo1566c();
    }

    /* renamed from: d */
    private final void m2400d(int i) {
        long j = this.f2732n + ((long) i);
        this.f2732n = j;
        axu axu = this.f2728j;
        if (j == axu.f2715b) {
            this.f2728j = axu.f2718e;
        }
    }

    /* renamed from: c */
    private final int m2398c(int i) {
        axu axu = this.f2728j;
        if (!axu.f2716c) {
            bhj a = this.f2722d.mo1937a();
            axu axu2 = new axu(this.f2728j.f2715b, this.f2723e);
            axu.f2717d = a;
            axu.f2718e = axu2;
            axu.f2716c = true;
        }
        return Math.min(i, (int) (this.f2728j.f2715b - this.f2732n));
    }

    /* renamed from: j */
    public final void mo1597j() {
        mo1599l();
        this.f2719a.mo1564b();
    }

    /* renamed from: a */
    public final int mo1580a(aki aki, anj anj, boolean z, boolean z2, long j) {
        int a = this.f2719a.mo1558a(aki, anj, z, z2, this.f2724f);
        if (a == -4 && !anj.mo1141c()) {
            if (anj.f1426d < j) {
                anj.mo1143n(Integer.MIN_VALUE);
            }
            if (!anj.mo1150e()) {
                axs axs = this.f2724f;
                if (anj.mo1151f()) {
                    long j2 = axs.f2689b;
                    int i = 1;
                    this.f2725g.mo2065a(1);
                    m2396a(j2, this.f2725g.f4258a, 1);
                    long j3 = j2 + 1;
                    byte b = this.f2725g.f4258a[0];
                    byte b2 = b & 128;
                    byte b3 = b & Byte.MAX_VALUE;
                    ang ang = anj.f1424b;
                    if (ang.f1410a == null) {
                        ang.f1410a = new byte[16];
                    }
                    m2396a(j3, ang.f1410a, b3);
                    long j4 = j3 + ((long) b3);
                    if (b2 != 0) {
                        this.f2725g.mo2065a(2);
                        m2396a(j4, this.f2725g.f4258a, 2);
                        j4 += 2;
                        i = this.f2725g.mo2076e();
                    }
                    ang ang2 = anj.f1424b;
                    int[] iArr = ang2.f1411b;
                    if (iArr == null || iArr.length < i) {
                        iArr = new int[i];
                    }
                    int[] iArr2 = ang2.f1412c;
                    if (iArr2 == null || iArr2.length < i) {
                        iArr2 = new int[i];
                    }
                    if (b2 != 0) {
                        int i2 = i * 6;
                        this.f2725g.mo2065a(i2);
                        m2396a(j4, this.f2725g.f4258a, i2);
                        j4 += (long) i2;
                        this.f2725g.mo2073c(0);
                        for (int i3 = 0; i3 < i; i3++) {
                            iArr[i3] = this.f2725g.mo2076e();
                            iArr2[i3] = this.f2725g.mo2087n();
                        }
                    } else {
                        iArr[0] = 0;
                        iArr2[0] = axs.f2688a - ((int) (j4 - axs.f2689b));
                    }
                    aou aou = axs.f2690c;
                    ang ang3 = anj.f1424b;
                    byte[] bArr = aou.f1523b;
                    byte[] bArr2 = ang3.f1410a;
                    int i4 = aou.f1522a;
                    int i5 = aou.f1524c;
                    int i6 = aou.f1525d;
                    ang3.f1411b = iArr;
                    ang3.f1412c = iArr2;
                    ang3.f1413d.numSubSamples = i;
                    ang3.f1413d.numBytesOfClearData = iArr;
                    ang3.f1413d.numBytesOfEncryptedData = iArr2;
                    ang3.f1413d.key = bArr;
                    ang3.f1413d.iv = bArr2;
                    ang3.f1413d.mode = i4;
                    if (blm.f4293a >= 24) {
                        anf anf = ang3.f1414e;
                        anf.f1409b.set(i5, i6);
                        anf.f1408a.setPattern(anf.f1409b);
                    }
                    long j5 = axs.f2689b;
                    int i7 = (int) (j4 - j5);
                    axs.f2689b = j5 + ((long) i7);
                    axs.f2688a -= i7;
                }
                if (anj.mo1142d()) {
                    this.f2725g.mo2065a(4);
                    m2396a(axs.f2689b, this.f2725g.f4258a, 4);
                    int n = this.f2725g.mo2087n();
                    axs.f2689b += 4;
                    axs.f2688a -= 4;
                    anj.mo1149c(n);
                    m2395a(axs.f2689b, anj.f1425c, n);
                    axs.f2689b += (long) n;
                    int i8 = axs.f2688a - n;
                    axs.f2688a = i8;
                    ByteBuffer byteBuffer = anj.f1427e;
                    if (byteBuffer == null || byteBuffer.capacity() < i8) {
                        anj.f1427e = ByteBuffer.allocate(i8);
                    } else {
                        anj.f1427e.clear();
                    }
                    m2395a(axs.f2689b, anj.f1427e, axs.f2688a);
                } else {
                    anj.mo1149c(axs.f2688a);
                    m2395a(axs.f2689b, anj.f1425c, axs.f2688a);
                }
                return -4;
            }
        }
        return a;
    }

    /* renamed from: a */
    private final void m2395a(long j, ByteBuffer byteBuffer, int i) {
        m2399c(j);
        while (i > 0) {
            int min = Math.min(i, (int) (this.f2727i.f2715b - j));
            axu axu = this.f2727i;
            byteBuffer.put(axu.f2717d.f3972a, axu.mo1577a(j), min);
            i -= min;
            j += (long) min;
            axu axu2 = this.f2727i;
            if (j == axu2.f2715b) {
                this.f2727i = axu2.f2718e;
            }
        }
    }

    /* renamed from: a */
    private final void m2396a(long j, byte[] bArr, int i) {
        m2399c(j);
        long j2 = j;
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.f2727i.f2715b - j2));
            axu axu = this.f2727i;
            System.arraycopy(axu.f2717d.f3972a, axu.mo1577a(j2), bArr, i - i2, min);
            i2 -= min;
            j2 += (long) min;
            axu axu2 = this.f2727i;
            if (j2 == axu2.f2715b) {
                this.f2727i = axu2.f2718e;
            }
        }
    }

    /* renamed from: k */
    public final void mo1598k() {
        mo1581a();
        this.f2719a.mo1564b();
    }

    /* renamed from: a */
    public final void mo1581a() {
        mo1584a(false);
    }

    /* renamed from: a */
    public final void mo1584a(boolean z) {
        axt axt = this.f2719a;
        axt.f2696f = 0;
        axt.f2697g = 0;
        axt.f2698h = 0;
        axt.f2699i = 0;
        axt.f2703m = true;
        axt.f2700j = Long.MIN_VALUE;
        axt.f2701k = Long.MIN_VALUE;
        axt.f2702l = false;
        axt.f2706p = null;
        if (z) {
            axt.f2705o = null;
            axt.f2704n = true;
        }
        m2397a(this.f2726h);
        axu axu = new axu(0, this.f2723e);
        this.f2726h = axu;
        this.f2727i = axu;
        this.f2728j = axu;
        this.f2732n = 0;
        this.f2722d.mo1940b();
    }

    /* renamed from: i */
    public final void mo1596i() {
        this.f2719a.mo1572h();
        this.f2727i = this.f2726h;
    }

    /* renamed from: a */
    public final int mo1202a(aoj aoj, int i, boolean z) {
        int c = m2398c(i);
        axu axu = this.f2728j;
        int a = aoj.mo1189a(axu.f2717d.f3972a, axu.mo1577a(this.f2732n), c);
        if (a != -1) {
            m2400d(a);
            return a;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    /* renamed from: a */
    public final void mo1205a(bky bky, int i) {
        while (i > 0) {
            int c = m2398c(i);
            axu axu = this.f2728j;
            bky.mo2069a(axu.f2717d.f3972a, axu.mo1577a(this.f2732n), c);
            i -= c;
            m2400d(c);
        }
    }

    /* renamed from: a */
    public final void mo1203a(long j, int i, int i2, int i3, aou aou) {
        if (this.f2729k) {
            mo1204a(this.f2730l);
        }
        long j2 = j + this.f2731m;
        if (this.f2720b) {
            if ((i & 1) != 0 && this.f2719a.mo1561a(j2)) {
                this.f2720b = false;
            } else {
                return;
            }
        }
        int i4 = i2;
        this.f2719a.mo1560a(j2, i, (this.f2732n - ((long) i4)) - ((long) i3), i4, aou);
    }

    /* renamed from: b */
    public final void mo1587b(long j) {
        if (this.f2731m != j) {
            this.f2731m = j;
            this.f2729k = true;
        }
    }

    /* renamed from: a */
    public final void mo1582a(int i) {
        this.f2719a.f2707q = i;
    }
}
