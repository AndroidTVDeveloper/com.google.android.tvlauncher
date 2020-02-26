package defpackage;

/* renamed from: pj  reason: default package */
/* compiled from: PG */
final class pj {
    public final int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public final /* synthetic */ pk j;

    public pj(pk pkVar, int i2, int i3) {
        this.j = pkVar;
        this.a = i2;
        this.b = i3;
        c();
    }

    /* access modifiers changed from: package-private */
    public final int a() {
        return ((this.e - this.d) + 1) * ((this.g - this.f) + 1) * ((this.i - this.h) + 1);
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return (this.b + 1) - this.a > 1;
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        pk pkVar = this.j;
        int[] iArr = pkVar.a;
        int[] iArr2 = pkVar.b;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        int i7 = Integer.MIN_VALUE;
        int i8 = 0;
        for (int i9 = this.a; i9 <= this.b; i9++) {
            int i10 = iArr[i9];
            i8 += iArr2[i10];
            int a2 = pk.a(i10);
            int b2 = pk.b(i10);
            int c2 = pk.c(i10);
            if (a2 > i2) {
                i2 = a2;
            }
            if (a2 < i3) {
                i3 = a2;
            }
            if (b2 > i5) {
                i5 = b2;
            }
            if (b2 < i4) {
                i4 = b2;
            }
            if (c2 > i7) {
                i7 = c2;
            }
            if (c2 < i6) {
                i6 = c2;
            }
        }
        this.d = i3;
        this.e = i2;
        this.f = i4;
        this.g = i5;
        this.h = i6;
        this.i = i7;
        this.c = i8;
    }
}
