package p000;

/* renamed from: bkx */
/* compiled from: PG */
public final class bkx {

    /* renamed from: a */
    public byte[] f4254a;

    /* renamed from: b */
    public int f4255b;

    /* renamed from: c */
    public int f4256c;

    /* renamed from: d */
    private int f4257d;

    public bkx() {
        this.f4254a = blm.f4298f;
    }

    /* renamed from: a */
    public final int mo2049a() {
        return ((this.f4257d - this.f4255b) << 3) - this.f4256c;
    }

    /* renamed from: b */
    public final int mo2053b() {
        return (this.f4255b << 3) + this.f4256c;
    }

    public bkx(byte[] bArr) {
        this(bArr, bArr.length);
    }

    public bkx(byte[] bArr, int i) {
        this.f4254a = bArr;
        this.f4257d = i;
    }

    /* renamed from: g */
    public final void mo2062g() {
        int i = this.f4255b;
        boolean z = false;
        if (i >= 0) {
            int i2 = this.f4257d;
            if (i < i2) {
                z = true;
            } else if (i == i2 && this.f4256c == 0) {
                z = true;
            }
        }
        bks.m3512b(z);
    }

    /* renamed from: f */
    public final void mo2061f() {
        if (this.f4256c != 0) {
            this.f4256c = 0;
            this.f4255b++;
            mo2062g();
        }
    }

    /* renamed from: c */
    public final int mo2056c() {
        bks.m3512b(this.f4256c == 0);
        return this.f4255b;
    }

    /* renamed from: e */
    public final boolean mo2060e() {
        boolean z;
        if ((this.f4254a[this.f4255b] & (128 >> this.f4256c)) != 0) {
            z = true;
        } else {
            z = false;
        }
        mo2059d();
        return z;
    }

    /* renamed from: c */
    public final int mo2057c(int i) {
        int i2;
        if (i == 0) {
            return 0;
        }
        this.f4256c += i;
        int i3 = 0;
        while (true) {
            i2 = this.f4256c;
            if (i2 <= 8) {
                break;
            }
            int i4 = i2 - 8;
            this.f4256c = i4;
            byte[] bArr = this.f4254a;
            int i5 = this.f4255b;
            this.f4255b = i5 + 1;
            i3 |= (bArr[i5] & 255) << i4;
        }
        byte[] bArr2 = this.f4254a;
        int i6 = this.f4255b;
        int i7 = (-1 >>> (32 - i)) & (i3 | ((bArr2[i6] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f4256c = 0;
            this.f4255b = i6 + 1;
        }
        mo2062g();
        return i7;
    }

    /* renamed from: b */
    public final void mo2055b(byte[] bArr, int i) {
        int i2 = i >> 3;
        for (int i3 = 0; i3 < i2; i3++) {
            byte[] bArr2 = this.f4254a;
            int i4 = this.f4255b;
            int i5 = i4 + 1;
            this.f4255b = i5;
            byte b = bArr2[i4];
            int i6 = this.f4256c;
            byte b2 = (byte) (b << i6);
            bArr[i3] = b2;
            bArr[i3] = (byte) (((255 & bArr2[i5]) >> (8 - i6)) | b2);
        }
        int i7 = i & 7;
        if (i7 != 0) {
            byte b3 = (byte) (bArr[i2] & (255 >> i7));
            bArr[i2] = b3;
            int i8 = this.f4256c;
            if (i8 + i7 > 8) {
                byte[] bArr3 = this.f4254a;
                int i9 = this.f4255b;
                this.f4255b = i9 + 1;
                b3 = (byte) (b3 | ((bArr3[i9] & 255) << i8));
                bArr[i2] = b3;
                i8 -= 8;
            }
            int i10 = i8 + i7;
            this.f4256c = i10;
            byte[] bArr4 = this.f4254a;
            int i11 = this.f4255b;
            bArr[i2] = (byte) (((byte) (((255 & bArr4[i11]) >> (8 - i10)) << (8 - i7))) | b3);
            if (i10 == 8) {
                this.f4256c = 0;
                this.f4255b = i11 + 1;
            }
            mo2062g();
        }
    }

    /* renamed from: c */
    public final void mo2058c(byte[] bArr, int i) {
        bks.m3512b(this.f4256c == 0);
        System.arraycopy(this.f4254a, this.f4255b, bArr, 0, i);
        this.f4255b += i;
        mo2062g();
    }

    /* renamed from: a */
    public final void mo2051a(byte[] bArr) {
        mo2052a(bArr, bArr.length);
    }

    /* renamed from: a */
    public final void mo2052a(byte[] bArr, int i) {
        this.f4254a = bArr;
        this.f4255b = 0;
        this.f4256c = 0;
        this.f4257d = i;
    }

    /* renamed from: a */
    public final void mo2050a(int i) {
        int i2 = i / 8;
        this.f4255b = i2;
        this.f4256c = i - (i2 << 3);
        mo2062g();
    }

    /* renamed from: d */
    public final void mo2059d() {
        int i = this.f4256c + 1;
        this.f4256c = i;
        if (i == 8) {
            this.f4256c = 0;
            this.f4255b++;
        }
        mo2062g();
    }

    /* renamed from: b */
    public final void mo2054b(int i) {
        int i2 = i / 8;
        int i3 = this.f4255b + i2;
        this.f4255b = i3;
        int i4 = this.f4256c + (i - (i2 << 3));
        this.f4256c = i4;
        if (i4 > 7) {
            this.f4255b = i3 + 1;
            this.f4256c = i4 - 8;
        }
        mo2062g();
    }
}
