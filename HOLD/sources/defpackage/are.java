package defpackage;

/* renamed from: are  reason: default package */
/* compiled from: PG */
final class are {
    public int a;
    public int b;
    private final byte[] c;
    private final int d;

    public are(byte[] bArr) {
        this.c = bArr;
        this.d = bArr.length;
    }

    public final boolean a() {
        byte b2 = this.c[this.a];
        int i = this.b;
        b(1);
        return (((b2 & 255) >> i) & 1) != 0;
    }

    public final int a(int i) {
        int i2 = this.a;
        int min = Math.min(i, 8 - this.b);
        int i3 = i2 + 1;
        int i4 = ((this.c[i2] & 255) >> this.b) & (255 >> (8 - min));
        while (min < i) {
            i4 |= (this.c[i3] & 255) << min;
            min += 8;
            i3++;
        }
        b(i);
        return (-1 >>> (32 - i)) & i4;
    }

    public final void b(int i) {
        int i2;
        int i3 = i / 8;
        int i4 = this.a + i3;
        this.a = i4;
        int i5 = this.b + (i - (i3 << 3));
        this.b = i5;
        if (i5 > 7) {
            i4++;
            this.a = i4;
            i5 -= 8;
            this.b = i5;
        }
        boolean z = false;
        if (i4 >= 0 && (i4 < (i2 = this.d) || (i4 == i2 && i5 == 0))) {
            z = true;
        }
        bks.b(z);
    }
}
