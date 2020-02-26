package p000;

/* renamed from: bgf */
/* compiled from: PG */
public final class bgf implements Comparable {

    /* renamed from: a */
    public final boolean f3789a;

    /* renamed from: b */
    private final boolean f3790b;

    /* renamed from: c */
    private final boolean f3791c;

    /* renamed from: d */
    private final boolean f3792d;

    /* renamed from: e */
    private final int f3793e;

    /* renamed from: f */
    private final int f3794f;

    /* renamed from: g */
    private final int f3795g;

    /* renamed from: h */
    private final boolean f3796h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgg.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      bgg.a(int, int):int
      bgg.a(int, boolean):boolean */
    public bgf(akh akh, bgc bgc, int i, String str) {
        this.f3790b = bgg.m3127a(i, false);
        int i2 = akh.f550c & (bgc.f3827A ^ -1);
        boolean z = true;
        this.f3791c = (i2 & 1) != 0;
        int i3 = i2 & 2;
        this.f3793e = bgg.m3124a(akh, bgc.f3829x, bgc.f3831z);
        this.f3794f = Integer.bitCount(akh.f551d & bgc.f3830y);
        this.f3796h = (akh.f551d & 1088) != 0;
        int i4 = this.f3793e;
        this.f3792d = (i4 > 0 && i3 == 0) || (i4 == 0 && i3 != 0);
        int a = bgg.m3124a(akh, str, bgg.m3125a(str) == null);
        this.f3795g = a;
        if (this.f3793e <= 0 && ((bgc.f3829x != null || this.f3794f <= 0) && !this.f3791c && (i3 == 0 || a <= 0))) {
            z = false;
        }
        this.f3789a = z;
    }

    /* renamed from: a */
    public final int compareTo(bgf bgf) {
        boolean z;
        boolean z2 = this.f3790b;
        if (z2 != bgf.f3790b) {
            return z2 ? 1 : -1;
        }
        int i = this.f3793e;
        int i2 = bgf.f3793e;
        if (i != i2) {
            return bgg.m3130b(i, i2);
        }
        int i3 = this.f3794f;
        int i4 = bgf.f3794f;
        if (i3 != i4) {
            return bgg.m3130b(i3, i4);
        }
        boolean z3 = this.f3791c;
        if (z3 != bgf.f3791c) {
            return z3 ? 1 : -1;
        }
        boolean z4 = this.f3792d;
        if (z4 != bgf.f3792d) {
            return z4 ? 1 : -1;
        }
        int i5 = this.f3795g;
        int i6 = bgf.f3795g;
        if (i5 != i6) {
            return bgg.m3130b(i5, i6);
        }
        if (i3 != 0 || (z = this.f3796h) == bgf.f3796h) {
            return 0;
        }
        return z ? -1 : 1;
    }
}
