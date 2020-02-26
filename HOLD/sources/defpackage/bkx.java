package defpackage;

/* renamed from: bkx  reason: default package */
/* compiled from: PG */
public final class bkx {
    public byte[] a;
    public int b;
    public int c;
    private int d;

    public bkx() {
        this.a = blm.f;
    }

    public final int a() {
        return ((this.d - this.b) << 3) - this.c;
    }

    public final int b() {
        return (this.b << 3) + this.c;
    }

    public bkx(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public bkx(byte[] bArr, int i) {
        this.a = bArr;
        this.d = i;
    }

    public final void g() {
        int i = this.b;
        boolean z = false;
        if (i >= 0) {
            int i2 = this.d;
            if (i < i2) {
                z = true;
            } else if (i == i2 && this.c == 0) {
                z = true;
            }
        }
        bks.b(z);
    }

    public final void f() {
        if (this.c != 0) {
            this.c = 0;
            this.b++;
            g();
        }
    }

    public final int c() {
        bks.b(this.c == 0);
        return this.b;
    }

    public final boolean e() {
        boolean z;
        if ((this.a[this.b] & (128 >> this.c)) != 0) {
            z = true;
        } else {
            z = false;
        }
        d();
        return z;
    }

    public final int c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.c += i;
        int i3 = 0;
        while (true) {
            i2 = this.c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.c = i4;
            byte[] bArr = this.a;
            int i5 = this.b;
            this.b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.a;
        int i6 = this.b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.c = 0;
            this.b = i6 + 1;
        }
        g();
        return i7;
    }

    public final void b(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.a;
            int i4 = this.b;
            int i5 = i4 + 1;
            this.b = i5;
            byte b2 = bArr2[i4];
            int i6 = this.c;
            byte b3 = (byte) (b2 << i6);
            bArr[i3] = b3;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b3);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b4 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b4;
            int i8 = this.c;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.a;
                int i9 = this.b;
                this.b = i9 + 1;
                b4 = (byte) (b4 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b4;
                i8 -= 8;
            }
            int i10 = i8 + i7;
            this.c = i10;
            byte[] bArr4 = this.a;
            int i11 = this.b;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b4);
            if (i10 == 8) {
                this.c = 0;
                this.b = i11 + 1;
            }
            g();
        }
    }

    public final void c(byte[] bArr, int i) {
        bks.b(this.c == 0);
        System.arraycopy(this.a, this.b, bArr, 0, i);
        this.b += i;
        g();
    }

    public final void a(byte[] bArr) {
        a(bArr, bArr.length);
    }

    public final void a(byte[] bArr, int i) {
        this.a = bArr;
        this.b = 0;
        this.c = 0;
        this.d = i;
    }

    public final void a(int i) {
        int i2 = i / 8;
        this.b = i2;
        this.c = i - (i2 << 3);
        g();
    }

    public final void d() {
        int i = this.c + 1;
        this.c = i;
        if (i == 8) {
            this.c = 0;
            this.b++;
        }
        g();
    }

    public final void b(int i) {
        int i2 = i / 8;
        int i3 = this.b + i2;
        this.b = i3;
        int i4 = this.c + (i - (i2 << 3));
        this.c = i4;
        if (i4 > 7) {
            this.b = i3 + 1;
            this.c = i4 - 8;
        }
        g();
    }
}
