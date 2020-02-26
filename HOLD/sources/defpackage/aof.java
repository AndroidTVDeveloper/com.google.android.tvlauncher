package defpackage;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: aof  reason: default package */
/* compiled from: PG */
public final class aof implements aoj {
    public final byte[] a = new byte[4096];
    public final long b;
    public long c;
    private final bhv d;
    private byte[] e = new byte[65536];
    private int f;
    private int g;

    public aof(bhv bhv, long j, long j2) {
        this.d = bhv;
        this.c = j;
        this.b = j2;
    }

    public final long b() {
        return this.c + ((long) this.f);
    }

    public final void b(int i) {
        a(i, false);
    }

    private final boolean a(int i, boolean z) {
        int i2 = this.f + i;
        int length = this.e.length;
        if (i2 > length) {
            this.e = Arrays.copyOf(this.e, blm.a(length + length, 65536 + i2, i2 + 524288));
        }
        int i3 = this.g - this.f;
        while (i3 < i) {
            i3 = a(this.e, this.f, i, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.g = this.f + i3;
        }
        this.f += i;
        return true;
    }

    public final void d(int i) {
        if (i != -1) {
            this.c += (long) i;
        }
    }

    public final void c(byte[] bArr, int i, int i2) {
        b(bArr, i, i2, false);
    }

    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        System.arraycopy(this.e, this.f - i2, bArr, i, i2);
        return true;
    }

    public final int a(byte[] bArr, int i, int i2) {
        int d2 = d(bArr, i, i2);
        if (d2 == 0) {
            d2 = a(bArr, i, i2, 0, true);
        }
        d(d2);
        return d2;
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a2 = this.d.a(bArr, i + i3, i2 - i3);
            if (a2 != -1) {
                return i3 + a2;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    private final int d(byte[] bArr, int i, int i2) {
        int i3 = this.g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.e, 0, bArr, i, min);
        e(min);
        return min;
    }

    public final void b(byte[] bArr, int i, int i2) {
        a(bArr, i, i2, false);
    }

    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        int d2 = d(bArr, i, i2);
        while (d2 < i2 && d2 != -1) {
            d2 = a(bArr, i, i2, d2, z);
        }
        d(d2);
        return d2 != -1;
    }

    public final void a() {
        this.f = 0;
    }

    public final int c(int i) {
        int min = Math.min(this.g, i);
        e(min);
        return min;
    }

    public final void a(int i) {
        int c2 = c(i);
        while (c2 < i && c2 != -1) {
            c2 = a(this.a, -c2, Math.min(i, this.a.length + c2), c2, false);
        }
        d(c2);
    }

    private final void e(int i) {
        int i2 = this.g - i;
        this.g = i2;
        this.f = 0;
        byte[] bArr = this.e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.e = bArr2;
    }
}
