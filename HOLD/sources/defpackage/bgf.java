package defpackage;

/* renamed from: bgf  reason: default package */
/* compiled from: PG */
public final class bgf implements Comparable {
    public final boolean a;
    private final boolean b;
    private final boolean c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgg.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      bgg.a(int, int):int
      bgg.a(int, boolean):boolean */
    public bgf(akh akh, bgc bgc, int i, String str) {
        this.b = bgg.a(i, false);
        int i2 = akh.c & (bgc.A ^ -1);
        boolean z = true;
        this.c = (i2 & 1) != 0;
        int i3 = i2 & 2;
        this.e = bgg.a(akh, bgc.x, bgc.z);
        this.f = Integer.bitCount(akh.d & bgc.y);
        this.h = (akh.d & 1088) != 0;
        int i4 = this.e;
        this.d = (i4 > 0 && i3 == 0) || (i4 == 0 && i3 != 0);
        int a2 = bgg.a(akh, str, bgg.a(str) == null);
        this.g = a2;
        if (this.e <= 0 && ((bgc.x != null || this.f <= 0) && !this.c && (i3 == 0 || a2 <= 0))) {
            z = false;
        }
        this.a = z;
    }

    /* renamed from: a */
    public final int compareTo(bgf bgf) {
        boolean z;
        boolean z2 = this.b;
        if (z2 != bgf.b) {
            return z2 ? 1 : -1;
        }
        int i = this.e;
        int i2 = bgf.e;
        if (i != i2) {
            return bgg.b(i, i2);
        }
        int i3 = this.f;
        int i4 = bgf.f;
        if (i3 != i4) {
            return bgg.b(i3, i4);
        }
        boolean z3 = this.c;
        if (z3 != bgf.c) {
            return z3 ? 1 : -1;
        }
        boolean z4 = this.d;
        if (z4 != bgf.d) {
            return z4 ? 1 : -1;
        }
        int i5 = this.g;
        int i6 = bgf.g;
        if (i5 != i6) {
            return bgg.b(i5, i6);
        }
        if (i3 != 0 || (z = this.h) == bgf.h) {
            return 0;
        }
        return z ? -1 : 1;
    }
}
