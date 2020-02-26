package p000;

/* renamed from: apl */
/* compiled from: PG */
final class apl {

    /* renamed from: a */
    public final bky f1697a = new bky(8);

    /* renamed from: b */
    public int f1698b;

    /* renamed from: a */
    public final long mo1232a(aoj aoj) {
        int i = 0;
        aoj.mo1199c(this.f1697a.f4258a, 0, 1);
        byte b = this.f1697a.f4258a[0] & 255;
        if (b == 0) {
            return Long.MIN_VALUE;
        }
        int i2 = 128;
        int i3 = 0;
        while ((b & i2) == 0) {
            i2 >>= 1;
            i3++;
        }
        int i4 = b & (i2 ^ -1);
        aoj.mo1199c(this.f1697a.f4258a, 1, i3);
        while (i < i3) {
            i++;
            i4 = (this.f1697a.f4258a[i] & 255) + (i4 << 8);
        }
        this.f1698b += i3 + 1;
        return (long) i4;
    }
}
