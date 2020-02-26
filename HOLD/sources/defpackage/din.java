package defpackage;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: din  reason: default package */
/* compiled from: PG */
public final class din extends diq {
    private static final Logger b = Logger.getLogger(din.class.getName());
    private static final boolean c = dlv.b;
    public dio a;
    private final byte[] d;
    private final int e;
    private int f;

    private din(byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i) | i) >= 0) {
                this.d = bArr;
                this.f = 0;
                this.e = i;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        throw new NullPointerException("buffer");
    }

    public static int a(long j) {
        int i;
        if ((-128 & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if ((-34359738368L & j) != 0) {
            j >>>= 28;
            i = 6;
        } else {
            i = 2;
        }
        if ((-2097152 & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & -16384) != 0 ? i + 1 : i;
    }

    public static int b() {
        return 1;
    }

    public static int c() {
        return 8;
    }

    public static int c(int i) {
        if ((i & -128) == 0) {
            return 1;
        }
        if ((i & -16384) == 0) {
            return 2;
        }
        if ((-2097152 & i) != 0) {
            return (i & -268435456) == 0 ? 4 : 5;
        }
        return 3;
    }

    public static long c(long j) {
        return (j >> 63) ^ (j + j);
    }

    public static int d() {
        return 4;
    }

    public static int e() {
        return 8;
    }

    public static int e(int i) {
        return (i >> 31) ^ (i + i);
    }

    public static int f() {
        return 4;
    }

    public static int g() {
        return 4;
    }

    public static int h() {
        return 8;
    }

    private final int i() {
        return this.e - this.f;
    }

    public final void a(byte b2) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            this.f = i + 1;
            bArr[i] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
        }
    }

    public final void a(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.d, this.f, i2);
            this.f += i2;
        } catch (IndexOutOfBoundsException e2) {
            throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), Integer.valueOf(i2)), e2);
        }
    }

    public final void a(int i, boolean z) {
        f(i, 0);
        a(z ? (byte) 1 : 0);
    }

    public final void b(int i, dik dik) {
        f(i, 2);
        g(dik.a());
        dik.a(this);
    }

    public final void i(int i, int i2) {
        f(i, 5);
        h(i2);
    }

    public final void h(int i) {
        try {
            byte[] bArr = this.d;
            int i2 = this.f;
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) i;
            int i4 = i3 + 1;
            this.f = i4;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i4 + 1;
            this.f = i5;
            bArr[i4] = (byte) (i >> 16);
            this.f = i5 + 1;
            bArr[i5] = (byte) (i >> 24);
        } catch (IndexOutOfBoundsException e2) {
            throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
        }
    }

    public final void f(int i, long j) {
        f(i, 1);
        e(j);
    }

    public final void e(long j) {
        try {
            byte[] bArr = this.d;
            int i = this.f;
            int i2 = i + 1;
            this.f = i2;
            bArr[i] = (byte) ((int) j);
            int i3 = i2 + 1;
            this.f = i3;
            bArr[i2] = (byte) ((int) (j >> 8));
            int i4 = i3 + 1;
            this.f = i4;
            bArr[i3] = (byte) ((int) (j >> 16));
            int i5 = i4 + 1;
            this.f = i5;
            bArr[i4] = (byte) ((int) (j >> 24));
            int i6 = i5 + 1;
            this.f = i6;
            bArr[i5] = (byte) ((int) (j >> 32));
            int i7 = i6 + 1;
            this.f = i7;
            bArr[i6] = (byte) ((int) (j >> 40));
            int i8 = i7 + 1;
            this.f = i8;
            bArr[i7] = (byte) ((int) (j >> 48));
            this.f = i8 + 1;
            bArr[i8] = (byte) ((int) (j >> 56));
        } catch (IndexOutOfBoundsException e2) {
            throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
        }
    }

    public final void g(int i, int i2) {
        f(i, 0);
        f(i2);
    }

    public final void f(int i) {
        if (i < 0) {
            d((long) i);
        } else {
            g(i);
        }
    }

    public final void b(int i, String str) {
        f(i, 2);
        b(str);
    }

    private final void b(String str) {
        int i = this.f;
        try {
            int c2 = c(str.length() * 3);
            int c3 = c(str.length());
            if (c3 != c2) {
                g(dmb.a(str));
                this.f = dmb.a(str, this.d, this.f, i());
                return;
            }
            int i2 = i + c3;
            this.f = i2;
            int a2 = dmb.a(str, this.d, i2, i());
            this.f = i;
            g((a2 - i) - c3);
            this.f = a2;
        } catch (dlz e2) {
            this.f = i;
            a(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new dim(e3);
        }
    }

    public final void f(int i, int i2) {
        g(dme.a(i, i2));
    }

    public final void h(int i, int i2) {
        f(i, 0);
        g(i2);
    }

    public final void g(int i) {
        if (!c || dhx.a() || i() < 5) {
            while ((i & -128) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i2 = this.f;
                    this.f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
                }
            }
            byte[] bArr2 = this.d;
            int i3 = this.f;
            this.f = i3 + 1;
            bArr2[i3] = (byte) i;
        } else if ((i & -128) != 0) {
            byte[] bArr3 = this.d;
            int i4 = this.f;
            this.f = i4 + 1;
            dlv.a(bArr3, (long) i4, (byte) (i | 128));
            int i5 = i >>> 7;
            if ((i5 & -128) == 0) {
                byte[] bArr4 = this.d;
                int i6 = this.f;
                this.f = i6 + 1;
                dlv.a(bArr4, (long) i6, (byte) i5);
                return;
            }
            byte[] bArr5 = this.d;
            int i7 = this.f;
            this.f = i7 + 1;
            dlv.a(bArr5, (long) i7, (byte) (i5 | 128));
            int i8 = i5 >>> 7;
            if ((i8 & -128) == 0) {
                byte[] bArr6 = this.d;
                int i9 = this.f;
                this.f = i9 + 1;
                dlv.a(bArr6, (long) i9, (byte) i8);
                return;
            }
            byte[] bArr7 = this.d;
            int i10 = this.f;
            this.f = i10 + 1;
            dlv.a(bArr7, (long) i10, (byte) (i8 | 128));
            int i11 = i8 >>> 7;
            if ((i11 & -128) == 0) {
                byte[] bArr8 = this.d;
                int i12 = this.f;
                this.f = i12 + 1;
                dlv.a(bArr8, (long) i12, (byte) i11);
                return;
            }
            byte[] bArr9 = this.d;
            int i13 = this.f;
            this.f = i13 + 1;
            dlv.a(bArr9, (long) i13, (byte) (i11 | 128));
            byte[] bArr10 = this.d;
            int i14 = this.f;
            this.f = i14 + 1;
            dlv.a(bArr10, (long) i14, (byte) (i11 >>> 7));
        } else {
            byte[] bArr11 = this.d;
            int i15 = this.f;
            this.f = i15 + 1;
            dlv.a(bArr11, (long) i15, (byte) i);
        }
    }

    public final void e(int i, long j) {
        f(i, 0);
        d(j);
    }

    public final void d(long j) {
        if (!c || i() < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.d;
                    int i = this.f;
                    this.f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e2) {
                    throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f), Integer.valueOf(this.e), 1), e2);
                }
            }
            byte[] bArr2 = this.d;
            int i2 = this.f;
            this.f = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.d;
            int i3 = this.f;
            this.f = i3 + 1;
            dlv.a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.d;
        int i4 = this.f;
        this.f = i4 + 1;
        dlv.a(bArr4, (long) i4, (byte) ((int) j));
    }

    private din() {
    }

    public final void a() {
        if (i() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    public static int i(int i) {
        return a(i) + 1;
    }

    public static int b(byte[] bArr) {
        return p(bArr.length);
    }

    public static int a(int i, dik dik) {
        return a(i) + a(dik);
    }

    public static int a(dik dik) {
        return p(dik.a());
    }

    public static int j(int i) {
        return a(i) + 8;
    }

    public static int e(int i, int i2) {
        return a(i) + b(i2);
    }

    public static int k(int i) {
        return a(i) + 4;
    }

    public static int l(int i) {
        return a(i) + 8;
    }

    public static int m(int i) {
        return a(i) + 4;
    }

    @Deprecated
    static int a(int i, dkk dkk, dkw dkw) {
        int a2 = a(i);
        int i2 = a2 + a2;
        dhu dhu = (dhu) dkk;
        int k = dhu.k();
        if (k == -1) {
            k = dkw.b(dhu);
            dhu.a(k);
        }
        return i2 + k;
    }

    @Deprecated
    public static int b(dkk dkk) {
        return dkk.m();
    }

    public static int b(int i, int i2) {
        return a(i) + b(i2);
    }

    public static int b(int i) {
        if (i >= 0) {
            return c(i);
        }
        return 10;
    }

    public static int b(int i, long j) {
        return a(i) + a(j);
    }

    public static int a(int i, djs djs) {
        return a(i) + a(djs);
    }

    public static int a(djs djs) {
        int i;
        if (djs.b != null) {
            i = djs.b.a();
        } else {
            i = djs.a != null ? djs.a.m() : 0;
        }
        return p(i);
    }

    private static int p(int i) {
        return c(i) + i;
    }

    public static int a(dkk dkk) {
        return p(dkk.m());
    }

    static int a(dkk dkk, dkw dkw) {
        dhu dhu = (dhu) dkk;
        int k = dhu.k();
        if (k == -1) {
            k = dkw.b(dhu);
            dhu.a(k);
        }
        return p(k);
    }

    public static int n(int i) {
        return a(i) + 4;
    }

    public static int o(int i) {
        return a(i) + 8;
    }

    public static int d(int i, int i2) {
        return a(i) + d(i2);
    }

    public static int d(int i) {
        return c(e(i));
    }

    public static int d(int i, long j) {
        return a(i) + b(j);
    }

    public static int b(long j) {
        return a(c(j));
    }

    public static int a(int i, String str) {
        return a(i) + a(str);
    }

    public static int a(String str) {
        int i;
        try {
            i = dmb.a(str);
        } catch (dlz e2) {
            i = str.getBytes(djl.a).length;
        }
        return p(i);
    }

    public static int a(int i) {
        return c(dme.a(i, 0));
    }

    public static int c(int i, int i2) {
        return a(i) + c(i2);
    }

    public static int c(int i, long j) {
        return a(i) + a(j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, dlz]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    private final void a(String str, dlz dlz) {
        b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dlz);
        byte[] bytes = str.getBytes(djl.a);
        try {
            int length = bytes.length;
            g(length);
            a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e2) {
            throw new dim(e2);
        } catch (dim e3) {
            throw e3;
        }
    }

    public static din a(byte[] bArr) {
        return new din(bArr, bArr.length);
    }

    public final void a(int i, double d2) {
        f(i, Double.doubleToRawLongBits(d2));
    }

    public final void a(int i, float f2) {
        i(i, Float.floatToRawIntBits(f2));
    }

    public final void a(int i, int i2) {
        h(i, e(i2));
    }

    public final void a(int i, long j) {
        e(i, c(j));
    }
}
