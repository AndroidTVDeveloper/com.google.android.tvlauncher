package defpackage;

/* renamed from: bkz  reason: default package */
/* compiled from: PG */
public final class bkz {
    private byte[] a;
    private int b;
    private int c;
    private int d;

    public bkz(byte[] bArr, int i, int i2) {
        a(bArr, i, i2);
    }

    private final void f() {
        int i = this.c;
        boolean z = false;
        if (i >= 0) {
            int i2 = this.b;
            if (i < i2) {
                z = true;
            } else if (i == i2 && this.d == 0) {
                z = true;
            }
        }
        bks.b(z);
    }

    public final boolean b(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.d + i) - (i3 << 3);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 <= i4 && i4 < this.b) {
                if (d(i2)) {
                    i4++;
                    i2 += 2;
                }
            }
        }
        int i6 = this.b;
        if (i4 < i6) {
            return true;
        }
        return i4 == i6 && i5 == 0;
    }

    public final boolean c() {
        int i = this.c;
        int i2 = this.d;
        int i3 = 0;
        while (this.c < this.b && !b()) {
            i3++;
        }
        int i4 = this.c;
        int i5 = this.b;
        this.c = i;
        this.d = i2;
        if (i4 == i5 || !b(i3 + i3 + 1)) {
            return false;
        }
        return true;
    }

    public final boolean b() {
        boolean z;
        if ((this.a[this.c] & (128 >> this.d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        a();
        return z;
    }

    public final int c(int i) {
        int i2;
        int i3;
        this.d += i;
        int i4 = 0;
        while (true) {
            i2 = this.d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.d = i5;
            byte[] bArr = this.a;
            int i6 = this.c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!d(i6 + 1)) {
                i3 = 1;
            }
            this.c = i6 + i3;
        }
        byte[] bArr2 = this.a;
        int i7 = this.c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.d = 0;
            if (!d(i7 + 1)) {
                i3 = 1;
            }
            this.c = i7 + i3;
        }
        f();
        return i8;
    }

    public final int e() {
        int i = 0;
        int i2 = 0;
        while (!b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = c(i2);
        }
        return i3 + i;
    }

    public final int d() {
        int e = e();
        return (e % 2 == 0 ? -1 : 1) * ((e + 1) / 2);
    }

    public final void a(byte[] bArr, int i, int i2) {
        this.a = bArr;
        this.c = i;
        this.b = i2;
        this.d = 0;
        f();
    }

    private final boolean d(int i) {
        if (i < 2 || i >= this.b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    public final void a() {
        int i = 1;
        int i2 = this.d + 1;
        this.d = i2;
        if (i2 == 8) {
            this.d = 0;
            int i3 = this.c;
            if (d(i3 + 1)) {
                i = 2;
            }
            this.c = i3 + i;
        }
        f();
    }

    public final void a(int i) {
        int i2 = this.c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.c = i4;
        int i5 = this.d + (i - (i3 << 3));
        this.d = i5;
        if (i5 > 7) {
            this.c = i4 + 1;
            this.d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.c) {
                f();
                return;
            } else if (d(i2)) {
                this.c++;
                i2 += 2;
            }
        }
    }
}
