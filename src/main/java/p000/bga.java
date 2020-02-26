package p000;

/* renamed from: bga */
/* compiled from: PG */
public final class bga implements Comparable {

    /* renamed from: a */
    public final boolean f3751a;

    /* renamed from: b */
    private final String f3752b;

    /* renamed from: c */
    private final bgc f3753c;

    /* renamed from: d */
    private final boolean f3754d;

    /* renamed from: e */
    private final int f3755e;

    /* renamed from: f */
    private final int f3756f;

    /* renamed from: g */
    private final int f3757g;

    /* renamed from: h */
    private final boolean f3758h;

    /* renamed from: i */
    private final int f3759i;

    /* renamed from: j */
    private final int f3760j;

    /* renamed from: k */
    private final int f3761k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgg.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      bgg.a(int, int):int
      bgg.a(int, boolean):boolean */
    public bga(akh akh, bgc bgc, int i) {
        int i2;
        this.f3753c = bgc;
        this.f3752b = bgg.m3125a(akh.f544A);
        int i3 = 0;
        this.f3754d = bgg.m3127a(i, false);
        this.f3755e = bgg.m3124a(akh, bgc.f3828w, false);
        boolean z = true;
        this.f3758h = (akh.f550c & 1) != 0;
        this.f3759i = akh.f569v;
        this.f3760j = akh.f570w;
        this.f3761k = akh.f552e;
        int i4 = akh.f552e;
        if ((i4 != -1 && i4 > bgc.f3775m) || ((i2 = akh.f569v) != -1 && i2 > bgc.f3774l)) {
            z = false;
        }
        this.f3751a = z;
        String[] b = blm.m3669b();
        int i5 = 0;
        while (true) {
            if (i5 >= b.length) {
                i5 = Integer.MAX_VALUE;
                break;
            }
            int a = bgg.m3124a(akh, b[i5], false);
            if (a > 0) {
                i3 = a;
                break;
            }
            i5++;
        }
        this.f3756f = i5;
        this.f3757g = i3;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object, java.lang.Object):boolean
     arg types: [java.lang.String, java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object, java.lang.Object):boolean */
    /* renamed from: a */
    public final int compareTo(bga bga) {
        int b;
        int a;
        boolean z = this.f3754d;
        int i = -1;
        if (z != bga.f3754d) {
            return z ? 1 : -1;
        }
        int i2 = this.f3755e;
        int i3 = bga.f3755e;
        if (i2 != i3) {
            return bgg.m3130b(i2, i3);
        }
        boolean z2 = this.f3751a;
        if (z2 != bga.f3751a) {
            return z2 ? 1 : -1;
        }
        if (this.f3753c.f3780r && (a = bgg.m3123a(this.f3761k, bga.f3761k)) != 0) {
            return a <= 0 ? 1 : -1;
        }
        boolean z3 = this.f3758h;
        if (z3 != bga.f3758h) {
            return z3 ? 1 : -1;
        }
        int i4 = this.f3756f;
        int i5 = bga.f3756f;
        if (i4 != i5) {
            return -bgg.m3130b(i4, i5);
        }
        int i6 = this.f3757g;
        int i7 = bga.f3757g;
        if (i6 != i7) {
            return bgg.m3130b(i6, i7);
        }
        if (this.f3751a && this.f3754d) {
            i = 1;
        }
        int i8 = this.f3759i;
        int i9 = bga.f3759i;
        if (i8 != i9 || (i8 = this.f3760j) != (i9 = bga.f3760j)) {
            b = bgg.m3130b(i8, i9);
        } else if (!blm.m3652a((Object) this.f3752b, (Object) bga.f3752b)) {
            return 0;
        } else {
            b = bgg.m3130b(this.f3761k, bga.f3761k);
        }
        return i * b;
    }
}
