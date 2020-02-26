package defpackage;

/* renamed from: oy  reason: default package */
/* compiled from: PG */
public final class oy {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e = 3;
    public int f = 0;
    public float g = 50.0f;
    public int h;
    public int i;
    public int j;
    public boolean k;

    public oy() {
        a();
    }

    private final int d() {
        int i2;
        if (!this.k) {
            i2 = this.f;
            if (i2 < 0) {
                i2 += this.h;
            }
            float f2 = this.g;
            if (f2 != -1.0f) {
                return i2 + ((int) ((((float) this.h) * f2) / 100.0f));
            }
        } else {
            int i3 = this.f;
            i2 = i3 >= 0 ? this.h - i3 : -i3;
            float f3 = this.g;
            if (f3 != -1.0f) {
                return i2 - ((int) ((((float) this.h) * f3) / 100.0f));
            }
        }
        return i2;
    }

    public final boolean b() {
        return this.b == Integer.MIN_VALUE;
    }

    public final boolean c() {
        return this.a == Integer.MAX_VALUE;
    }

    public final int a(int i2) {
        int i3;
        int i4;
        int i5 = this.h;
        int d2 = d();
        boolean b2 = b();
        boolean c2 = c();
        if (!b2) {
            int i6 = this.i;
            int i7 = d2 - i6;
            if (this.k ? (this.e & 2) != 0 : (this.e & 1) != 0) {
                int i8 = this.b;
                if (i2 - i8 <= i7) {
                    int i9 = i8 - i6;
                    return (c2 || i9 <= (i4 = this.c)) ? i9 : i4;
                }
            }
        }
        if (!c2) {
            int i10 = this.j;
            int i11 = (i5 - d2) - i10;
            if (this.k ? (this.e & 1) != 0 : (this.e & 2) != 0) {
                int i12 = this.a;
                if (i12 - i2 <= i11) {
                    int i13 = i12 - (i5 - i10);
                    return (b2 || i13 >= (i3 = this.d)) ? i13 : i3;
                }
            }
        }
        return i2 - d2;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        this.b = Integer.MIN_VALUE;
        this.a = Integer.MAX_VALUE;
    }

    public final void a(int i2, int i3) {
        this.i = i2;
        this.j = i3;
    }

    public final String toString() {
        return " min:" + this.b + " " + this.d + " max:" + this.a + " " + this.c;
    }

    public final void a(int i2, int i3, int i4, int i5) {
        int i6;
        this.b = i2;
        this.a = i3;
        int i7 = (this.h - this.i) - this.j;
        int d2 = d();
        boolean b2 = b();
        boolean c2 = c();
        if (!b2) {
            if (this.k) {
                this.d = i4 - d2;
            } else {
                this.d = i4 - d2;
            }
            this.d = this.b - this.i;
        }
        if (!c2) {
            boolean z = this.k;
            if (!z ? (this.e & 2) == 0 : (this.e & 1) == 0) {
                i6 = i5 - d2;
                this.c = i6;
            } else {
                i6 = (this.a - this.i) - i7;
                this.c = i6;
            }
            if (b2) {
                return;
            }
            if (z) {
                int i8 = this.e;
                if ((i8 & 1) != 0) {
                    this.d = Math.min(this.d, i6);
                } else if ((i8 & 2) != 0) {
                    int min = Math.min(this.d, i5 - d2);
                    this.d = min;
                    this.c = Math.max(min, this.c);
                }
            } else {
                int i9 = this.e;
                if ((i9 & 1) != 0) {
                    this.c = Math.max(this.d, i6);
                } else if ((i9 & 2) != 0) {
                    int max = Math.max(i6, i4 - d2);
                    this.c = max;
                    this.d = Math.min(this.d, max);
                }
            }
        }
    }
}
