package defpackage;

import java.nio.charset.Charset;

/* renamed from: bky  reason: default package */
/* compiled from: PG */
public final class bky {
    public byte[] a;
    public int b;
    public int c;

    public bky() {
        this.a = blm.f;
    }

    public final int b() {
        return this.c - this.b;
    }

    public bky(int i) {
        this.a = new byte[i];
        this.c = i;
    }

    public bky(byte[] bArr) {
        this.a = bArr;
        this.c = bArr.length;
    }

    public bky(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
    }

    public final int c() {
        return this.a.length;
    }

    public final void a(bkx bkx, int i) {
        a(bkx.a, 0, i);
        bkx.a(0);
    }

    public final void a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final int j() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b4 = bArr[i3];
        this.b = i4 + 1;
        return (bArr[i4] & 255) | ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8);
    }

    public final String r() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && !blm.a(this.a[i])) {
            i++;
        }
        int i2 = this.b;
        if (i - i2 >= 3) {
            byte[] bArr = this.a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                i2 += 3;
                this.b = i2;
            }
        }
        String a2 = blm.a(this.a, i2, i - i2);
        this.b = i;
        int i3 = this.c;
        if (i != i3) {
            byte[] bArr2 = this.a;
            if (bArr2[i] == 13) {
                i++;
                this.b = i;
                if (i == i3) {
                    return a2;
                }
            }
            if (bArr2[i] == 10) {
                this.b = i + 1;
            }
        }
        return a2;
    }

    public final int k() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b4 = bArr[i3];
        this.b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | (b2 & 255) | ((b3 & 255) << 8) | ((b4 & 255) << 16);
    }

    public final long i() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b4 = bArr[i3];
        this.b = i4 + 1;
        return ((((long) b3) & 255) << 8) | (((long) b2) & 255) | ((((long) b4) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final int o() {
        int k = k();
        if (k >= 0) {
            return k;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(k);
        throw new IllegalStateException(sb.toString());
    }

    public final int f() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i];
        this.b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b2 & 255);
    }

    public final long l() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b4 = bArr[i3];
        int i5 = i4 + 1;
        this.b = i5;
        byte b5 = bArr[i4];
        int i6 = i5 + 1;
        this.b = i6;
        byte b6 = bArr[i5];
        int i7 = i6 + 1;
        this.b = i7;
        byte b7 = bArr[i6];
        int i8 = i7 + 1;
        this.b = i8;
        byte b8 = bArr[i7];
        this.b = i8 + 1;
        return ((((long) b3) & 255) << 48) | ((((long) b2) & 255) << 56) | ((((long) b4) & 255) << 40) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 24) | ((((long) b7) & 255) << 16) | ((((long) b8) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public final String q() {
        if (b() == 0) {
            return null;
        }
        int i = this.b;
        while (i < this.c && this.a[i] != 0) {
            i++;
        }
        byte[] bArr = this.a;
        int i2 = this.b;
        String a2 = blm.a(bArr, i2, i - i2);
        this.b = i;
        if (i < this.c) {
            this.b = i + 1;
        }
        return a2;
    }

    public final String f(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        String a2 = blm.a(this.a, i2, (i3 >= this.c || this.a[i3] != 0) ? i : i - 1);
        this.b += i;
        return a2;
    }

    public final String e(int i) {
        return a(i, Charset.forName("UTF-8"));
    }

    public final String a(int i, Charset charset) {
        String str = new String(this.a, this.b, i, charset);
        this.b += i;
        return str;
    }

    public final int m() {
        return (d() << 21) | (d() << 14) | (d() << 7) | d();
    }

    public final int d() {
        byte[] bArr = this.a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final long h() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.b = i4;
        byte b4 = bArr[i3];
        this.b = i4 + 1;
        return ((((long) b3) & 255) << 16) | ((((long) b2) & 255) << 24) | ((((long) b4) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public final int g() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.b = i3;
        byte b3 = bArr[i2];
        this.b = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << 16) | ((b3 & 255) << 8);
    }

    public final int n() {
        int j = j();
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    public final long p() {
        long l = l();
        if (l >= 0) {
            return l;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(l);
        throw new IllegalStateException(sb.toString());
    }

    public final int e() {
        byte[] bArr = this.a;
        int i = this.b;
        int i2 = i + 1;
        this.b = i2;
        byte b2 = bArr[i];
        this.b = i2 + 1;
        return (bArr[i2] & 255) | ((b2 & 255) << 8);
    }

    public final void a() {
        this.b = 0;
        this.c = 0;
    }

    public final void a(int i) {
        a(c() < i ? new byte[i] : this.a, i);
    }

    public final void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.c = i;
        this.b = 0;
    }

    public final void b(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.a.length) {
            z = true;
        }
        bks.a(z);
        this.c = i;
    }

    public final void c(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.c) {
            z = true;
        }
        bks.a(z);
        this.b = i;
    }

    public final void d(int i) {
        c(this.b + i);
    }
}
