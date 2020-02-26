package p000;

/* renamed from: bkz */
/* compiled from: PG */
public final class bkz {

    /* renamed from: a */
    private byte[] f4261a;

    /* renamed from: b */
    private int f4262b;

    /* renamed from: c */
    private int f4263c;

    /* renamed from: d */
    private int f4264d;

    public bkz(byte[] bArr, int i, int i2) {
        mo2094a(bArr, i, i2);
    }

    /* renamed from: f */
    private final void m3577f() {
        int i = this.f4263c;
        boolean z = false;
        if (i >= 0) {
            int i2 = this.f4262b;
            if (i < i2) {
                z = true;
            } else if (i == i2 && this.f4264d == 0) {
                z = true;
            }
        }
        bks.m3512b(z);
    }

    /* renamed from: b */
    public final boolean mo2096b(int i) {
        int i2 = this.f4263c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f4264d + i) - (i3 << 3);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 <= i4 && i4 < this.f4262b) {
                if (m3576d(i2)) {
                    i4++;
                    i2 += 2;
                }
            }
        }
        int i6 = this.f4262b;
        if (i4 < i6) {
            return true;
        }
        return i4 == i6 && i5 == 0;
    }

    /* renamed from: c */
    public final boolean mo2098c() {
        int i = this.f4263c;
        int i2 = this.f4264d;
        int i3 = 0;
        while (this.f4263c < this.f4262b && !mo2095b()) {
            i3++;
        }
        int i4 = this.f4263c;
        int i5 = this.f4262b;
        this.f4263c = i;
        this.f4264d = i2;
        if (i4 == i5 || !mo2096b(i3 + i3 + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo2095b() {
        boolean z;
        if ((this.f4261a[this.f4263c] & (128 >> this.f4264d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        mo2092a();
        return z;
    }

    /* renamed from: c */
    public final int mo2097c(int i) {
        int i2;
        int i3;
        this.f4264d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f4264d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f4264d = i5;
            byte[] bArr = this.f4261a;
            int i6 = this.f4263c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!m3576d(i6 + 1)) {
                i3 = 1;
            }
            this.f4263c = i6 + i3;
        }
        byte[] bArr2 = this.f4261a;
        int i7 = this.f4263c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f4264d = 0;
            if (!m3576d(i7 + 1)) {
                i3 = 1;
            }
            this.f4263c = i7 + i3;
        }
        m3577f();
        return i8;
    }

    /* renamed from: e */
    public final int mo2100e() {
        int i = 0;
        int i2 = 0;
        while (!mo2095b()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo2097c(i2);
        }
        return i3 + i;
    }

    /* renamed from: d */
    public final int mo2099d() {
        int e = mo2100e();
        return (e % 2 == 0 ? -1 : 1) * ((e + 1) / 2);
    }

    /* renamed from: a */
    public final void mo2094a(byte[] bArr, int i, int i2) {
        this.f4261a = bArr;
        this.f4263c = i;
        this.f4262b = i2;
        this.f4264d = 0;
        m3577f();
    }

    /* renamed from: d */
    private final boolean m3576d(int i) {
        if (i < 2 || i >= this.f4262b) {
            return false;
        }
        byte[] bArr = this.f4261a;
        return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i + -1] == 0;
    }

    /* renamed from: a */
    public final void mo2092a() {
        int i = 1;
        int i2 = this.f4264d + 1;
        this.f4264d = i2;
        if (i2 == 8) {
            this.f4264d = 0;
            int i3 = this.f4263c;
            if (m3576d(i3 + 1)) {
                i = 2;
            }
            this.f4263c = i3 + i;
        }
        m3577f();
    }

    /* renamed from: a */
    public final void mo2093a(int i) {
        int i2 = this.f4263c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f4263c = i4;
        int i5 = this.f4264d + (i - (i3 << 3));
        this.f4264d = i5;
        if (i5 > 7) {
            this.f4263c = i4 + 1;
            this.f4264d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f4263c) {
                m3577f();
                return;
            } else if (m3576d(i2)) {
                this.f4263c++;
                i2 += 2;
            }
        }
    }
}
