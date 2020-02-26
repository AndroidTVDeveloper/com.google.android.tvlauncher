package p000;

/* renamed from: are */
/* compiled from: PG */
final class are {

    /* renamed from: a */
    public int f1961a;

    /* renamed from: b */
    public int f1962b;

    /* renamed from: c */
    private final byte[] f1963c;

    /* renamed from: d */
    private final int f1964d;

    public are(byte[] bArr) {
        this.f1963c = bArr;
        this.f1964d = bArr.length;
    }

    /* renamed from: a */
    public final boolean mo1279a() {
        byte b = this.f1963c[this.f1961a];
        int i = this.f1962b;
        mo1280b(1);
        return (((b & 255) >> i) & 1) != 0;
    }

    /* renamed from: a */
    public final int mo1278a(int i) {
        int i2 = this.f1961a;
        int min = Math.min(i, 8 - this.f1962b);
        int i3 = i2 + 1;
        int i4 = ((this.f1963c[i2] & 255) >> this.f1962b) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.f1963c[i3] & 255) << min;
            min += 8;
            i3++;
        }
        mo1280b(i);
        return (-1 >>> (32 - i)) & i4;
    }

    /* renamed from: b */
    public final void mo1280b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.f1961a + i3;
        this.f1961a = i4;
        int i5 = this.f1962b + (i - (i3 << 3));
        this.f1962b = i5;
        if (i5 > 7) {
            i4++;
            this.f1961a = i4;
            i5 -= 8;
            this.f1962b = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.f1964d) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        bks.m3512b(z);
    }
}
