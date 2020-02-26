package p000;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: din */
/* compiled from: PG */
public final class din extends diq {

    /* renamed from: b */
    private static final Logger f8588b = Logger.getLogger(din.class.getName());

    /* renamed from: c */
    private static final boolean f8589c = dlv.f8780b;

    /* renamed from: a */
    public dio f8590a;

    /* renamed from: d */
    private final byte[] f8591d;

    /* renamed from: e */
    private final int f8592e;

    /* renamed from: f */
    private int f8593f;

    private din(byte[] bArr, int i) {
        if (bArr != null) {
            int length = bArr.length;
            if (((length - i) | i) >= 0) {
                this.f8591d = bArr;
                this.f8593f = 0;
                this.f8592e = i;
                return;
            }
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i)));
        }
        throw new NullPointerException("buffer");
    }

    /* renamed from: a */
    public static int m6533a(long j) {
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

    /* renamed from: b */
    public static int m6541b() {
        return 1;
    }

    /* renamed from: c */
    public static int m6549c() {
        return 8;
    }

    /* renamed from: c */
    public static int m6550c(int i) {
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

    /* renamed from: c */
    public static long m6553c(long j) {
        return (j >> 63) ^ (j + j);
    }

    /* renamed from: d */
    public static int m6554d() {
        return 4;
    }

    /* renamed from: e */
    public static int m6558e() {
        return 8;
    }

    /* renamed from: e */
    public static int m6559e(int i) {
        return (i >> 31) ^ (i + i);
    }

    /* renamed from: f */
    public static int m6561f() {
        return 4;
    }

    /* renamed from: g */
    public static int m6562g() {
        return 4;
    }

    /* renamed from: h */
    public static int m6563h() {
        return 8;
    }

    /* renamed from: i */
    private final int m6564i() {
        return this.f8592e - this.f8593f;
    }

    /* renamed from: a */
    public final void mo4424a(byte b) {
        try {
            byte[] bArr = this.f8591d;
            int i = this.f8593f;
            this.f8593f = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8593f), Integer.valueOf(this.f8592e), 1), e);
        }
    }

    /* renamed from: a */
    public final void mo4430a(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.f8591d, this.f8593f, i2);
            this.f8593f += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8593f), Integer.valueOf(this.f8592e), Integer.valueOf(i2)), e);
        }
    }

    /* renamed from: a */
    public final void mo4429a(int i, boolean z) {
        mo4437f(i, 0);
        mo4424a(z ? (byte) 1 : 0);
    }

    /* renamed from: b */
    public final void mo4431b(int i, dik dik) {
        mo4437f(i, 2);
        mo4439g(dik.mo4408a());
        dik.mo4415a(this);
    }

    /* renamed from: i */
    public final void mo4443i(int i, int i2) {
        mo4437f(i, 5);
        mo4441h(i2);
    }

    /* renamed from: h */
    public final void mo4441h(int i) {
        try {
            byte[] bArr = this.f8591d;
            int i2 = this.f8593f;
            int i3 = i2 + 1;
            this.f8593f = i3;
            bArr[i2] = (byte) i;
            int i4 = i3 + 1;
            this.f8593f = i4;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i4 + 1;
            this.f8593f = i5;
            bArr[i4] = (byte) (i >> 16);
            this.f8593f = i5 + 1;
            bArr[i5] = (byte) (i >> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8593f), Integer.valueOf(this.f8592e), 1), e);
        }
    }

    /* renamed from: f */
    public final void mo4438f(int i, long j) {
        mo4437f(i, 1);
        mo4435e(j);
    }

    /* renamed from: e */
    public final void mo4435e(long j) {
        try {
            byte[] bArr = this.f8591d;
            int i = this.f8593f;
            int i2 = i + 1;
            this.f8593f = i2;
            bArr[i] = (byte) ((int) j);
            int i3 = i2 + 1;
            this.f8593f = i3;
            bArr[i2] = (byte) ((int) (j >> 8));
            int i4 = i3 + 1;
            this.f8593f = i4;
            bArr[i3] = (byte) ((int) (j >> 16));
            int i5 = i4 + 1;
            this.f8593f = i5;
            bArr[i4] = (byte) ((int) (j >> 24));
            int i6 = i5 + 1;
            this.f8593f = i6;
            bArr[i5] = (byte) ((int) (j >> 32));
            int i7 = i6 + 1;
            this.f8593f = i7;
            bArr[i6] = (byte) ((int) (j >> 40));
            int i8 = i7 + 1;
            this.f8593f = i8;
            bArr[i7] = (byte) ((int) (j >> 48));
            this.f8593f = i8 + 1;
            bArr[i8] = (byte) ((int) (j >> 56));
        } catch (IndexOutOfBoundsException e) {
            throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8593f), Integer.valueOf(this.f8592e), 1), e);
        }
    }

    /* renamed from: g */
    public final void mo4440g(int i, int i2) {
        mo4437f(i, 0);
        mo4436f(i2);
    }

    /* renamed from: f */
    public final void mo4436f(int i) {
        if (i < 0) {
            mo4433d((long) i);
        } else {
            mo4439g(i);
        }
    }

    /* renamed from: b */
    public final void mo4432b(int i, String str) {
        mo4437f(i, 2);
        m6548b(str);
    }

    /* renamed from: b */
    private final void m6548b(String str) {
        int i = this.f8593f;
        try {
            int c = m6550c(str.length() * 3);
            int c2 = m6550c(str.length());
            if (c2 != c) {
                mo4439g(dmb.m7088a(str));
                this.f8593f = dmb.m7089a(str, this.f8591d, this.f8593f, m6564i());
                return;
            }
            int i2 = i + c2;
            this.f8593f = i2;
            int a = dmb.m7089a(str, this.f8591d, i2, m6564i());
            this.f8593f = i;
            mo4439g((a - i) - c2);
            this.f8593f = a;
        } catch (dlz e) {
            this.f8593f = i;
            m6540a(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new dim(e2);
        }
    }

    /* renamed from: f */
    public final void mo4437f(int i, int i2) {
        mo4439g(dme.m7093a(i, i2));
    }

    /* renamed from: h */
    public final void mo4442h(int i, int i2) {
        mo4437f(i, 0);
        mo4439g(i2);
    }

    /* renamed from: g */
    public final void mo4439g(int i) {
        if (!f8589c || dhx.m6468a() || m6564i() < 5) {
            while ((i & -128) != 0) {
                try {
                    byte[] bArr = this.f8591d;
                    int i2 = this.f8593f;
                    this.f8593f = i2 + 1;
                    bArr[i2] = (byte) ((i & 127) | 128);
                    i >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8593f), Integer.valueOf(this.f8592e), 1), e);
                }
            }
            byte[] bArr2 = this.f8591d;
            int i3 = this.f8593f;
            this.f8593f = i3 + 1;
            bArr2[i3] = (byte) i;
        } else if ((i & -128) != 0) {
            byte[] bArr3 = this.f8591d;
            int i4 = this.f8593f;
            this.f8593f = i4 + 1;
            dlv.m7035a(bArr3, (long) i4, (byte) (i | 128));
            int i5 = i >>> 7;
            if ((i5 & -128) == 0) {
                byte[] bArr4 = this.f8591d;
                int i6 = this.f8593f;
                this.f8593f = i6 + 1;
                dlv.m7035a(bArr4, (long) i6, (byte) i5);
                return;
            }
            byte[] bArr5 = this.f8591d;
            int i7 = this.f8593f;
            this.f8593f = i7 + 1;
            dlv.m7035a(bArr5, (long) i7, (byte) (i5 | 128));
            int i8 = i5 >>> 7;
            if ((i8 & -128) == 0) {
                byte[] bArr6 = this.f8591d;
                int i9 = this.f8593f;
                this.f8593f = i9 + 1;
                dlv.m7035a(bArr6, (long) i9, (byte) i8);
                return;
            }
            byte[] bArr7 = this.f8591d;
            int i10 = this.f8593f;
            this.f8593f = i10 + 1;
            dlv.m7035a(bArr7, (long) i10, (byte) (i8 | 128));
            int i11 = i8 >>> 7;
            if ((i11 & -128) == 0) {
                byte[] bArr8 = this.f8591d;
                int i12 = this.f8593f;
                this.f8593f = i12 + 1;
                dlv.m7035a(bArr8, (long) i12, (byte) i11);
                return;
            }
            byte[] bArr9 = this.f8591d;
            int i13 = this.f8593f;
            this.f8593f = i13 + 1;
            dlv.m7035a(bArr9, (long) i13, (byte) (i11 | 128));
            byte[] bArr10 = this.f8591d;
            int i14 = this.f8593f;
            this.f8593f = i14 + 1;
            dlv.m7035a(bArr10, (long) i14, (byte) (i11 >>> 7));
        } else {
            byte[] bArr11 = this.f8591d;
            int i15 = this.f8593f;
            this.f8593f = i15 + 1;
            dlv.m7035a(bArr11, (long) i15, (byte) i);
        }
    }

    /* renamed from: e */
    public final void mo4434e(int i, long j) {
        mo4437f(i, 0);
        mo4433d(j);
    }

    /* renamed from: d */
    public final void mo4433d(long j) {
        if (!f8589c || m6564i() < 10) {
            while ((j & -128) != 0) {
                try {
                    byte[] bArr = this.f8591d;
                    int i = this.f8593f;
                    this.f8593f = i + 1;
                    bArr[i] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new dim(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f8593f), Integer.valueOf(this.f8592e), 1), e);
                }
            }
            byte[] bArr2 = this.f8591d;
            int i2 = this.f8593f;
            this.f8593f = i2 + 1;
            bArr2[i2] = (byte) ((int) j);
            return;
        }
        while ((j & -128) != 0) {
            byte[] bArr3 = this.f8591d;
            int i3 = this.f8593f;
            this.f8593f = i3 + 1;
            dlv.m7035a(bArr3, (long) i3, (byte) ((((int) j) & 127) | 128));
            j >>>= 7;
        }
        byte[] bArr4 = this.f8591d;
        int i4 = this.f8593f;
        this.f8593f = i4 + 1;
        dlv.m7035a(bArr4, (long) i4, (byte) ((int) j));
    }

    private din() {
    }

    /* renamed from: a */
    public final void mo4423a() {
        if (m6564i() != 0) {
            throw new IllegalStateException("Did not write as much data as expected.");
        }
    }

    /* renamed from: i */
    public static int m6565i(int i) {
        return m6528a(i) + 1;
    }

    /* renamed from: b */
    public static int m6547b(byte[] bArr) {
        return m6572p(bArr.length);
    }

    /* renamed from: a */
    public static int m6529a(int i, dik dik) {
        return m6528a(i) + m6534a(dik);
    }

    /* renamed from: a */
    public static int m6534a(dik dik) {
        return m6572p(dik.mo4408a());
    }

    /* renamed from: j */
    public static int m6566j(int i) {
        return m6528a(i) + 8;
    }

    /* renamed from: e */
    public static int m6560e(int i, int i2) {
        return m6528a(i) + m6542b(i2);
    }

    /* renamed from: k */
    public static int m6567k(int i) {
        return m6528a(i) + 4;
    }

    /* renamed from: l */
    public static int m6568l(int i) {
        return m6528a(i) + 8;
    }

    /* renamed from: m */
    public static int m6569m(int i) {
        return m6528a(i) + 4;
    }

    @Deprecated
    /* renamed from: a */
    static int m6531a(int i, dkk dkk, dkw dkw) {
        int a = m6528a(i);
        int i2 = a + a;
        dhu dhu = (dhu) dkk;
        int k = dhu.mo4372k();
        if (k == -1) {
            k = dkw.mo4580b(dhu);
            dhu.mo4369a(k);
        }
        return i2 + k;
    }

    @Deprecated
    /* renamed from: b */
    public static int m6546b(dkk dkk) {
        return dkk.mo4517m();
    }

    /* renamed from: b */
    public static int m6543b(int i, int i2) {
        return m6528a(i) + m6542b(i2);
    }

    /* renamed from: b */
    public static int m6542b(int i) {
        if (i >= 0) {
            return m6550c(i);
        }
        return 10;
    }

    /* renamed from: b */
    public static int m6544b(int i, long j) {
        return m6528a(i) + m6533a(j);
    }

    /* renamed from: a */
    public static int m6530a(int i, djs djs) {
        return m6528a(i) + m6535a(djs);
    }

    /* renamed from: a */
    public static int m6535a(djs djs) {
        int i;
        if (djs.f8698b != null) {
            i = djs.f8698b.mo4408a();
        } else {
            i = djs.f8697a != null ? djs.f8697a.mo4517m() : 0;
        }
        return m6572p(i);
    }

    /* renamed from: p */
    private static int m6572p(int i) {
        return m6550c(i) + i;
    }

    /* renamed from: a */
    public static int m6536a(dkk dkk) {
        return m6572p(dkk.mo4517m());
    }

    /* renamed from: a */
    static int m6537a(dkk dkk, dkw dkw) {
        dhu dhu = (dhu) dkk;
        int k = dhu.mo4372k();
        if (k == -1) {
            k = dkw.mo4580b(dhu);
            dhu.mo4369a(k);
        }
        return m6572p(k);
    }

    /* renamed from: n */
    public static int m6570n(int i) {
        return m6528a(i) + 4;
    }

    /* renamed from: o */
    public static int m6571o(int i) {
        return m6528a(i) + 8;
    }

    /* renamed from: d */
    public static int m6556d(int i, int i2) {
        return m6528a(i) + m6555d(i2);
    }

    /* renamed from: d */
    public static int m6555d(int i) {
        return m6550c(m6559e(i));
    }

    /* renamed from: d */
    public static int m6557d(int i, long j) {
        return m6528a(i) + m6545b(j);
    }

    /* renamed from: b */
    public static int m6545b(long j) {
        return m6533a(m6553c(j));
    }

    /* renamed from: a */
    public static int m6532a(int i, String str) {
        return m6528a(i) + m6538a(str);
    }

    /* renamed from: a */
    public static int m6538a(String str) {
        int i;
        try {
            i = dmb.m7088a(str);
        } catch (dlz e) {
            i = str.getBytes(djl.f8682a).length;
        }
        return m6572p(i);
    }

    /* renamed from: a */
    public static int m6528a(int i) {
        return m6550c(dme.m7093a(i, 0));
    }

    /* renamed from: c */
    public static int m6551c(int i, int i2) {
        return m6528a(i) + m6550c(i2);
    }

    /* renamed from: c */
    public static int m6552c(int i, long j) {
        return m6528a(i) + m6533a(j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void}
     arg types: [java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, dlz]
     candidates:
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.Throwable, java.util.function.Supplier<java.lang.String>):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object[]):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Object):void}
      ClspMth{java.util.logging.Logger.logp(java.util.logging.Level, java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void} */
    /* renamed from: a */
    private final void m6540a(String str, dlz dlz) {
        f8588b.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dlz);
        byte[] bytes = str.getBytes(djl.f8682a);
        try {
            int length = bytes.length;
            mo4439g(length);
            mo4430a(bytes, 0, length);
        } catch (IndexOutOfBoundsException e) {
            throw new dim(e);
        } catch (dim e2) {
            throw e2;
        }
    }

    /* renamed from: a */
    public static din m6539a(byte[] bArr) {
        return new din(bArr, bArr.length);
    }

    /* renamed from: a */
    public final void mo4425a(int i, double d) {
        mo4438f(i, Double.doubleToRawLongBits(d));
    }

    /* renamed from: a */
    public final void mo4426a(int i, float f) {
        mo4443i(i, Float.floatToRawIntBits(f));
    }

    /* renamed from: a */
    public final void mo4427a(int i, int i2) {
        mo4442h(i, m6559e(i2));
    }

    /* renamed from: a */
    public final void mo4428a(int i, long j) {
        mo4434e(i, m6553c(j));
    }
}
