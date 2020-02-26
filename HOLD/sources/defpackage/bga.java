package defpackage;

/* renamed from: bga  reason: default package */
/* compiled from: PG */
public final class bga implements Comparable {
    public final boolean a;
    private final String b;
    private final bgc c;
    private final boolean d;
    private final int e;
    private final int f;
    private final int g;
    private final boolean h;
    private final int i;
    private final int j;
    private final int k;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bgg.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      bgg.a(int, int):int
      bgg.a(int, boolean):boolean */
    public bga(akh akh, bgc bgc, int i2) {
        int i3;
        this.c = bgc;
        this.b = bgg.a(akh.A);
        int i4 = 0;
        this.d = bgg.a(i2, false);
        this.e = bgg.a(akh, bgc.w, false);
        boolean z = true;
        this.h = (akh.c & 1) != 0;
        this.i = akh.v;
        this.j = akh.w;
        this.k = akh.e;
        int i5 = akh.e;
        if ((i5 != -1 && i5 > bgc.m) || ((i3 = akh.v) != -1 && i3 > bgc.l)) {
            z = false;
        }
        this.a = z;
        String[] b2 = blm.b();
        int i6 = 0;
        while (true) {
            if (i6 >= b2.length) {
                i6 = Integer.MAX_VALUE;
                break;
            }
            int a2 = bgg.a(akh, b2[i6], false);
            if (a2 > 0) {
                i4 = a2;
                break;
            }
            i6++;
        }
        this.f = i6;
        this.g = i4;
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
        int b2;
        int a2;
        boolean z = this.d;
        int i2 = -1;
        if (z != bga.d) {
            return z ? 1 : -1;
        }
        int i3 = this.e;
        int i4 = bga.e;
        if (i3 != i4) {
            return bgg.b(i3, i4);
        }
        boolean z2 = this.a;
        if (z2 != bga.a) {
            return z2 ? 1 : -1;
        }
        if (this.c.r && (a2 = bgg.a(this.k, bga.k)) != 0) {
            return a2 <= 0 ? 1 : -1;
        }
        boolean z3 = this.h;
        if (z3 != bga.h) {
            return z3 ? 1 : -1;
        }
        int i5 = this.f;
        int i6 = bga.f;
        if (i5 != i6) {
            return -bgg.b(i5, i6);
        }
        int i7 = this.g;
        int i8 = bga.g;
        if (i7 != i8) {
            return bgg.b(i7, i8);
        }
        if (this.a && this.d) {
            i2 = 1;
        }
        int i9 = this.i;
        int i10 = bga.i;
        if (i9 != i10 || (i9 = this.j) != (i10 = bga.j)) {
            b2 = bgg.b(i9, i10);
        } else if (!blm.a((Object) this.b, (Object) bga.b)) {
            return 0;
        } else {
            b2 = bgg.b(this.k, bga.k);
        }
        return i2 * b2;
    }
}
