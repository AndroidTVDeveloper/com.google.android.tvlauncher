package p000;

import java.io.EOFException;
import java.util.Arrays;

/* renamed from: aof */
/* compiled from: PG */
public final class aof implements aoj {

    /* renamed from: a */
    public final byte[] f1488a = new byte[4096];

    /* renamed from: b */
    public final long f1489b;

    /* renamed from: c */
    public long f1490c;

    /* renamed from: d */
    private final bhv f1491d;

    /* renamed from: e */
    private byte[] f1492e = new byte[65536];

    /* renamed from: f */
    private int f1493f;

    /* renamed from: g */
    private int f1494g;

    public aof(bhv bhv, long j, long j2) {
        this.f1491d = bhv;
        this.f1490c = j;
        this.f1489b = j2;
    }

    /* renamed from: b */
    public final long mo1194b() {
        return this.f1490c + ((long) this.f1493f);
    }

    /* renamed from: b */
    public final void mo1195b(int i) {
        m1631a(i, false);
    }

    /* renamed from: a */
    private final boolean m1631a(int i, boolean z) {
        int i2 = this.f1493f + i;
        int length = this.f1492e.length;
        if (i2 > length) {
            this.f1492e = Arrays.copyOf(this.f1492e, blm.m3624a(length + length, 65536 + i2, i2 + 524288));
        }
        int i3 = this.f1494g - this.f1493f;
        while (i3 < i) {
            i3 = mo1190a(this.f1492e, this.f1493f, i, i3, z);
            if (i3 == -1) {
                return false;
            }
            this.f1494g = this.f1493f + i3;
        }
        this.f1493f += i;
        return true;
    }

    /* renamed from: d */
    public final void mo1200d(int i) {
        if (i != -1) {
            this.f1490c += (long) i;
        }
    }

    /* renamed from: c */
    public final void mo1199c(byte[] bArr, int i, int i2) {
        mo1197b(bArr, i, i2, false);
    }

    /* renamed from: b */
    public final boolean mo1197b(byte[] bArr, int i, int i2, boolean z) {
        if (!m1631a(i2, z)) {
            return false;
        }
        System.arraycopy(this.f1492e, this.f1493f - i2, bArr, i, i2);
        return true;
    }

    /* renamed from: a */
    public final int mo1189a(byte[] bArr, int i, int i2) {
        int d = m1632d(bArr, i, i2);
        if (d == 0) {
            d = mo1190a(bArr, i, i2, 0, true);
        }
        mo1200d(d);
        return d;
    }

    /* renamed from: a */
    public final int mo1190a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!Thread.interrupted()) {
            int a = this.f1491d.mo1498a(bArr, i + i3, i2 - i3);
            if (a != -1) {
                return i3 + a;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new EOFException();
        }
        throw new InterruptedException();
    }

    /* renamed from: d */
    private final int m1632d(byte[] bArr, int i, int i2) {
        int i3 = this.f1494g;
        if (i3 == 0) {
            return 0;
        }
        int min = Math.min(i3, i2);
        System.arraycopy(this.f1492e, 0, bArr, i, min);
        m1633e(min);
        return min;
    }

    /* renamed from: b */
    public final void mo1196b(byte[] bArr, int i, int i2) {
        mo1193a(bArr, i, i2, false);
    }

    /* renamed from: a */
    public final boolean mo1193a(byte[] bArr, int i, int i2, boolean z) {
        int d = m1632d(bArr, i, i2);
        while (d < i2 && d != -1) {
            d = mo1190a(bArr, i, i2, d, z);
        }
        mo1200d(d);
        return d != -1;
    }

    /* renamed from: a */
    public final void mo1191a() {
        this.f1493f = 0;
    }

    /* renamed from: c */
    public final int mo1198c(int i) {
        int min = Math.min(this.f1494g, i);
        m1633e(min);
        return min;
    }

    /* renamed from: a */
    public final void mo1192a(int i) {
        int c = mo1198c(i);
        while (c < i && c != -1) {
            c = mo1190a(this.f1488a, -c, Math.min(i, this.f1488a.length + c), c, false);
        }
        mo1200d(c);
    }

    /* renamed from: e */
    private final void m1633e(int i) {
        int i2 = this.f1494g - i;
        this.f1494g = i2;
        this.f1493f = 0;
        byte[] bArr = this.f1492e;
        byte[] bArr2 = i2 < bArr.length + -524288 ? new byte[(65536 + i2)] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i2);
        this.f1492e = bArr2;
    }
}
