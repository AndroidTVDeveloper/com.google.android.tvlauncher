package defpackage;

import java.io.EOFException;
import java.nio.ByteBuffer;

/* renamed from: axw  reason: default package */
/* compiled from: PG */
public class axw implements aov {
    public final axt a;
    public boolean b;
    public axv c;
    private final bhk d;
    private final int e = 65536;
    private final axs f;
    private final bky g;
    private axu h;
    private axu i;
    private axu j;
    private boolean k;
    private akh l;
    private long m;
    private long n;

    public axw(bhk bhk, anu anu) {
        this.d = bhk;
        this.a = new axt(anu);
        this.f = new axs();
        this.g = new bky(32);
        axu axu = new axu(0, this.e);
        this.h = axu;
        this.i = axu;
        this.j = axu;
    }

    public final int d() {
        return this.a.g;
    }

    public final int e() {
        axt axt = this.a;
        return axt.g + axt.i;
    }

    private final void c(long j2) {
        while (true) {
            axu axu = this.i;
            if (j2 >= axu.b) {
                this.i = axu.e;
            } else {
                return;
            }
        }
    }

    public final int a(long j2, boolean z) {
        return this.a.a(j2, z);
    }

    public final int m() {
        return this.a.i();
    }

    private final void a(axu axu) {
        if (axu.c) {
            axu axu2 = this.j;
            int i2 = (axu2.c ? 1 : 0) + (((int) (axu2.a - axu.a)) / this.e);
            bhj[] bhjArr = new bhj[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                bhjArr[i3] = axu.d;
                axu = axu.a();
            }
            this.d.a(bhjArr);
        }
    }

    public final void a(long j2) {
        axu axu;
        if (j2 != -1) {
            while (true) {
                axu = this.h;
                if (j2 < axu.b) {
                    break;
                }
                this.d.a(axu.d);
                this.h = this.h.a();
            }
            if (this.i.a < axu.a) {
                this.i = axu;
            }
        }
    }

    public final void b(long j2, boolean z) {
        a(this.a.b(j2, z));
    }

    public final void l() {
        a(this.a.k());
    }

    public final void b(int i2) {
        long a2 = this.a.a(i2);
        this.n = a2;
        if (a2 != 0) {
            axu axu = this.h;
            if (a2 != axu.a) {
                while (this.n > axu.b) {
                    axu = axu.e;
                }
                axu axu2 = axu.e;
                a(axu2);
                axu.e = new axu(axu.b, this.e);
                this.j = this.n == axu.b ? axu.e : axu;
                if (this.i == axu2) {
                    this.i = axu.e;
                    return;
                }
                return;
            }
        }
        a(this.h);
        axu axu3 = new axu(this.n, this.e);
        this.h = axu3;
        this.i = axu3;
        this.j = axu3;
    }

    public void a(akh akh) {
        akh akh2;
        long j2 = this.m;
        if (akh != null) {
            if (j2 != 0) {
                long j3 = akh.m;
                if (j3 != Long.MAX_VALUE) {
                    akh2 = akh.a(j3 + j2);
                }
            }
            akh2 = akh;
        } else {
            akh2 = null;
        }
        boolean a2 = this.a.a(akh2);
        this.l = akh;
        this.k = false;
        axv axv = this.c;
        if (axv != null && a2) {
            axv.k();
        }
    }

    public final long h() {
        return this.a.e();
    }

    public final akh g() {
        return this.a.d();
    }

    public final int b() {
        return this.a.a();
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x004e A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean b(boolean r6) {
        /*
            r5 = this;
            axt r0 = r5.a
            boolean r1 = r0.l()
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x003f
            int r6 = r0.i
            int r6 = r0.c(r6)
            akh[] r1 = r0.e
            r1 = r1[r6]
            akh r4 = r0.b
            if (r1 != r4) goto L_0x003e
            java.lang.Object r1 = defpackage.bks.a(r4)
            akh r1 = (defpackage.akh) r1
            anq r1 = r1.l
            if (r1 == 0) goto L_0x003e
            anu r1 = r0.a
            anu r4 = defpackage.anu.a
            if (r1 == r4) goto L_0x003e
            ans r1 = r0.c
            java.lang.Object r1 = defpackage.bks.a(r1)
            ans r1 = (defpackage.ans) r1
            r1.a()
            int[] r0 = r0.d
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
            boolean r6 = r0.l
            if (r6 != 0) goto L_0x0051
            akh r6 = r0.o
            if (r6 == 0) goto L_0x0050
            akh r0 = r0.b
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.axw.b(boolean):boolean");
    }

    public final void c() {
        ans ans = this.a.c;
        if (ans != null) {
            throw ((anr) bks.a(((anv) ans).a));
        }
    }

    public final int f() {
        return this.a.c();
    }

    private final void d(int i2) {
        long j2 = this.n + ((long) i2);
        this.n = j2;
        axu axu = this.j;
        if (j2 == axu.b) {
            this.j = axu.e;
        }
    }

    private final int c(int i2) {
        axu axu = this.j;
        if (!axu.c) {
            bhj a2 = this.d.a();
            axu axu2 = new axu(this.j.b, this.e);
            axu.d = a2;
            axu.e = axu2;
            axu.c = true;
        }
        return Math.min(i2, (int) (this.j.b - this.n));
    }

    public final void j() {
        l();
        this.a.b();
    }

    public final int a(aki aki, anj anj, boolean z, boolean z2, long j2) {
        int a2 = this.a.a(aki, anj, z, z2, this.f);
        if (a2 == -4 && !anj.c()) {
            if (anj.d < j2) {
                anj.n(Integer.MIN_VALUE);
            }
            if (!anj.e()) {
                axs axs = this.f;
                if (anj.f()) {
                    long j3 = axs.b;
                    int i2 = 1;
                    this.g.a(1);
                    a(j3, this.g.a, 1);
                    long j4 = j3 + 1;
                    byte b2 = this.g.a[0];
                    byte b3 = b2 & 128;
                    byte b4 = b2 & Byte.MAX_VALUE;
                    ang ang = anj.b;
                    if (ang.a == null) {
                        ang.a = new byte[16];
                    }
                    a(j4, ang.a, b4);
                    long j5 = j4 + ((long) b4);
                    if (b3 != 0) {
                        this.g.a(2);
                        a(j5, this.g.a, 2);
                        j5 += 2;
                        i2 = this.g.e();
                    }
                    ang ang2 = anj.b;
                    int[] iArr = ang2.b;
                    if (iArr == null || iArr.length < i2) {
                        iArr = new int[i2];
                    }
                    int[] iArr2 = ang2.c;
                    if (iArr2 == null || iArr2.length < i2) {
                        iArr2 = new int[i2];
                    }
                    if (b3 != 0) {
                        int i3 = i2 * 6;
                        this.g.a(i3);
                        a(j5, this.g.a, i3);
                        j5 += (long) i3;
                        this.g.c(0);
                        for (int i4 = 0; i4 < i2; i4++) {
                            iArr[i4] = this.g.e();
                            iArr2[i4] = this.g.n();
                        }
                    } else {
                        iArr[0] = 0;
                        iArr2[0] = axs.a - ((int) (j5 - axs.b));
                    }
                    aou aou = axs.c;
                    ang ang3 = anj.b;
                    byte[] bArr = aou.b;
                    byte[] bArr2 = ang3.a;
                    int i5 = aou.a;
                    int i6 = aou.c;
                    int i7 = aou.d;
                    ang3.b = iArr;
                    ang3.c = iArr2;
                    ang3.d.numSubSamples = i2;
                    ang3.d.numBytesOfClearData = iArr;
                    ang3.d.numBytesOfEncryptedData = iArr2;
                    ang3.d.key = bArr;
                    ang3.d.iv = bArr2;
                    ang3.d.mode = i5;
                    if (blm.a >= 24) {
                        anf anf = ang3.e;
                        anf.b.set(i6, i7);
                        anf.a.setPattern(anf.b);
                    }
                    long j6 = axs.b;
                    int i8 = (int) (j5 - j6);
                    axs.b = j6 + ((long) i8);
                    axs.a -= i8;
                }
                if (anj.d()) {
                    this.g.a(4);
                    a(axs.b, this.g.a, 4);
                    int n2 = this.g.n();
                    axs.b += 4;
                    axs.a -= 4;
                    anj.c(n2);
                    a(axs.b, anj.c, n2);
                    axs.b += (long) n2;
                    int i9 = axs.a - n2;
                    axs.a = i9;
                    ByteBuffer byteBuffer = anj.e;
                    if (byteBuffer == null || byteBuffer.capacity() < i9) {
                        anj.e = ByteBuffer.allocate(i9);
                    } else {
                        anj.e.clear();
                    }
                    a(axs.b, anj.e, axs.a);
                } else {
                    anj.c(axs.a);
                    a(axs.b, anj.c, axs.a);
                }
                return -4;
            }
        }
        return a2;
    }

    private final void a(long j2, ByteBuffer byteBuffer, int i2) {
        c(j2);
        while (i2 > 0) {
            int min = Math.min(i2, (int) (this.i.b - j2));
            axu axu = this.i;
            byteBuffer.put(axu.d.a, axu.a(j2), min);
            i2 -= min;
            j2 += (long) min;
            axu axu2 = this.i;
            if (j2 == axu2.b) {
                this.i = axu2.e;
            }
        }
    }

    private final void a(long j2, byte[] bArr, int i2) {
        c(j2);
        long j3 = j2;
        int i3 = i2;
        while (i3 > 0) {
            int min = Math.min(i3, (int) (this.i.b - j3));
            axu axu = this.i;
            System.arraycopy(axu.d.a, axu.a(j3), bArr, i2 - i3, min);
            i3 -= min;
            j3 += (long) min;
            axu axu2 = this.i;
            if (j3 == axu2.b) {
                this.i = axu2.e;
            }
        }
    }

    public final void k() {
        a();
        this.a.b();
    }

    public final void a() {
        a(false);
    }

    public final void a(boolean z) {
        axt axt = this.a;
        axt.f = 0;
        axt.g = 0;
        axt.h = 0;
        axt.i = 0;
        axt.m = true;
        axt.j = Long.MIN_VALUE;
        axt.k = Long.MIN_VALUE;
        axt.l = false;
        axt.p = null;
        if (z) {
            axt.o = null;
            axt.n = true;
        }
        a(this.h);
        axu axu = new axu(0, this.e);
        this.h = axu;
        this.i = axu;
        this.j = axu;
        this.n = 0;
        this.d.b();
    }

    public final void i() {
        this.a.h();
        this.i = this.h;
    }

    public final int a(aoj aoj, int i2, boolean z) {
        int c2 = c(i2);
        axu axu = this.j;
        int a2 = aoj.a(axu.d.a, axu.a(this.n), c2);
        if (a2 != -1) {
            d(a2);
            return a2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final void a(bky bky, int i2) {
        while (i2 > 0) {
            int c2 = c(i2);
            axu axu = this.j;
            bky.a(axu.d.a, axu.a(this.n), c2);
            i2 -= c2;
            d(c2);
        }
    }

    public final void a(long j2, int i2, int i3, int i4, aou aou) {
        if (this.k) {
            a(this.l);
        }
        long j3 = j2 + this.m;
        if (this.b) {
            if ((i2 & 1) != 0 && this.a.a(j3)) {
                this.b = false;
            } else {
                return;
            }
        }
        int i5 = i3;
        this.a.a(j3, i2, (this.n - ((long) i5)) - ((long) i4), i5, aou);
    }

    public final void b(long j2) {
        if (this.m != j2) {
            this.m = j2;
            this.k = true;
        }
    }

    public final void a(int i2) {
        this.a.q = i2;
    }
}
