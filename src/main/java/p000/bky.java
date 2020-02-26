package p000;

import java.nio.charset.Charset;

/* renamed from: bky */
/* compiled from: PG */
public final class bky {

    /* renamed from: a */
    public byte[] f4258a;

    /* renamed from: b */
    public int f4259b;

    /* renamed from: c */
    public int f4260c;

    public bky() {
        this.f4258a = blm.f4298f;
    }

    /* renamed from: b */
    public final int mo2070b() {
        return this.f4260c - this.f4259b;
    }

    public bky(int i) {
        this.f4258a = new byte[i];
        this.f4260c = i;
    }

    public bky(byte[] bArr) {
        this.f4258a = bArr;
        this.f4260c = bArr.length;
    }

    public bky(byte[] bArr, int i) {
        this.f4258a = bArr;
        this.f4260c = i;
    }

    /* renamed from: c */
    public final int mo2072c() {
        return this.f4258a.length;
    }

    /* renamed from: a */
    public final void mo2066a(bkx bkx, int i) {
        mo2069a(bkx.f4254a, 0, i);
        bkx.mo2050a(0);
    }

    /* renamed from: a */
    public final void mo2069a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f4258a, this.f4259b, bArr, i, i2);
        this.f4259b += i2;
    }

    /* renamed from: j */
    public final int mo2083j() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        int i2 = i + 1;
        this.f4259b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f4259b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f4259b = i4;
        byte b3 = bArr[i3];
        this.f4259b = i4 + 1;
        return (bArr[i4] & 255) | ((b & 255) << 24) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    /* renamed from: r */
    public final String mo2091r() {
        if (mo2070b() == 0) {
            return null;
        }
        int i = this.f4259b;
        while (i < this.f4260c && !blm.m3648a(this.f4258a[i])) {
            i++;
        }
        int i2 = this.f4259b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f4258a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.f4259b = i2;
            }
        }
        String a = blm.m3641a(this.f4258a, i2, i - i2);
        this.f4259b = i;
        int i3 = this.f4260c;
        if (i != i3) {
            byte[] bArr2 = this.f4258a;
            if (bArr2[i] == 13) {
                i++;
                this.f4259b = i;
                if (i == i3) {
                    return a;
                }
            }
            if (bArr2[i] == 10) {
                this.f4259b = i + 1;
            }
        }
        return a;
    }

    /* renamed from: k */
    public final int mo2084k() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        int i2 = i + 1;
        this.f4259b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f4259b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f4259b = i4;
        byte b3 = bArr[i3];
        this.f4259b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b & 255) | ((b2 & 255) << 8) | ((b3 & 255) << 16);
    }

    /* renamed from: i */
    public final long mo2082i() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        int i2 = i + 1;
        this.f4259b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f4259b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f4259b = i4;
        byte b3 = bArr[i3];
        this.f4259b = i4 + 1;
        return ((((long) b2) & 255) << 8) | (((long) b) & 255) | ((((long) b3) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: o */
    public final int mo2088o() {
        int k = mo2084k();
        if (k >= 0) {
            return k;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(k);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: f */
    public final int mo2078f() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        int i2 = i + 1;
        this.f4259b = i2;
        byte b = bArr[i];
        this.f4259b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b & 255);
    }

    /* renamed from: l */
    public final long mo2085l() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        int i2 = i + 1;
        this.f4259b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f4259b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f4259b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f4259b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f4259b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f4259b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f4259b = i8;
        byte b7 = bArr[i7];
        this.f4259b = i8 + 1;
        return ((((long) b2) & 255) << 48) | ((((long) b) & 255) << 56) | ((((long) b3) & 255) << 40) | ((((long) b4) & 255) << 32) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 16) | ((((long) b7) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: q */
    public final String mo2090q() {
        if (mo2070b() == 0) {
            return null;
        }
        int i = this.f4259b;
        while (i < this.f4260c && this.f4258a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f4258a;
        int i2 = this.f4259b;
        String a = blm.m3641a(bArr, i2, i - i2);
        this.f4259b = i;
        if (i < this.f4260c) {
            this.f4259b = i + 1;
        }
        return a;
    }

    /* renamed from: f */
    public final String mo2079f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f4259b;
        int i3 = (i2 + i) - 1;
        String a = blm.m3641a(this.f4258a, i2, (i3 >= this.f4260c || this.f4258a[i3] != 0) ? i : i - 1);
        this.f4259b += i;
        return a;
    }

    /* renamed from: e */
    public final String mo2077e(int i) {
        return mo2063a(i, Charset.forName("UTF-8"));
    }

    /* renamed from: a */
    public final String mo2063a(int i, Charset charset) {
        String str = new String(this.f4258a, this.f4259b, i, charset);
        this.f4259b += i;
        return str;
    }

    /* renamed from: m */
    public final int mo2086m() {
        return (mo2074d() << 21) | (mo2074d() << 14) | (mo2074d() << 7) | mo2074d();
    }

    /* renamed from: d */
    public final int mo2074d() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        this.f4259b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: h */
    public final long mo2081h() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        int i2 = i + 1;
        this.f4259b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f4259b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f4259b = i4;
        byte b3 = bArr[i3];
        this.f4259b = i4 + 1;
        return ((((long) b2) & 255) << 16) | ((((long) b) & 255) << 24) | ((((long) b3) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: g */
    public final int mo2080g() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        int i2 = i + 1;
        this.f4259b = i2;
        byte b = bArr[i];
        int i3 = i2 + 1;
        this.f4259b = i3;
        byte b2 = bArr[i2];
        this.f4259b = i3 + 1;
        return (bArr[i3] & 255) | ((b & 255) << 16) | ((b2 & 255) << 8);
    }

    /* renamed from: n */
    public final int mo2087n() {
        int j = mo2083j();
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: p */
    public final long mo2089p() {
        long l = mo2085l();
        if (l >= 0) {
            return l;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(l);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: e */
    public final int mo2076e() {
        byte[] bArr = this.f4258a;
        int i = this.f4259b;
        int i2 = i + 1;
        this.f4259b = i2;
        byte b = bArr[i];
        this.f4259b = i2 + 1;
        return (bArr[i2] & 255) | ((b & 255) << 8);
    }

    /* renamed from: a */
    public final void mo2064a() {
        this.f4259b = 0;
        this.f4260c = 0;
    }

    /* renamed from: a */
    public final void mo2065a(int i) {
        mo2068a(mo2072c() < i ? new byte[i] : this.f4258a, i);
    }

    /* renamed from: a */
    public final void mo2067a(byte[] bArr) {
        mo2068a(bArr, bArr.length);
    }

    /* renamed from: a */
    public final void mo2068a(byte[] bArr, int i) {
        this.f4258a = bArr;
        this.f4260c = i;
        this.f4259b = 0;
    }

    /* renamed from: b */
    public final void mo2071b(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f4258a.length) {
            z = true;
        }
        bks.m3510a(z);
        this.f4260c = i;
    }

    /* renamed from: c */
    public final void mo2073c(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.f4260c) {
            z = true;
        }
        bks.m3510a(z);
        this.f4259b = i;
    }

    /* renamed from: d */
    public final void mo2075d(int i) {
        mo2073c(this.f4259b + i);
    }
}
