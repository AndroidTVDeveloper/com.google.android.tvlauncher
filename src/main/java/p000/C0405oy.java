package p000;

/* renamed from: oy */
/* compiled from: PG */
public final class C0405oy {

    /* renamed from: a */
    public int f10099a;

    /* renamed from: b */
    public int f10100b;

    /* renamed from: c */
    public int f10101c;

    /* renamed from: d */
    public int f10102d;

    /* renamed from: e */
    public int f10103e = 3;

    /* renamed from: f */
    public int f10104f = 0;

    /* renamed from: g */
    public float f10105g = 50.0f;

    /* renamed from: h */
    public int f10106h;

    /* renamed from: i */
    public int f10107i;

    /* renamed from: j */
    public int f10108j;

    /* renamed from: k */
    public boolean f10109k;

    public C0405oy() {
        mo5723a();
    }

    /* renamed from: d */
    private final int m8161d() {
        int i;
        if (!this.f10109k) {
            i = this.f10104f;
            if (i < 0) {
                i += this.f10106h;
            }
            float f = this.f10105g;
            if (f != -1.0f) {
                return i + ((int) ((((float) this.f10106h) * f) / 100.0f));
            }
        } else {
            int i2 = this.f10104f;
            i = i2 >= 0 ? this.f10106h - i2 : -i2;
            float f2 = this.f10105g;
            if (f2 != -1.0f) {
                return i - ((int) ((((float) this.f10106h) * f2) / 100.0f));
            }
        }
        return i;
    }

    /* renamed from: b */
    public final boolean mo5726b() {
        return this.f10100b == Integer.MIN_VALUE;
    }

    /* renamed from: c */
    public final boolean mo5727c() {
        return this.f10099a == Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final int mo5722a(int i) {
        int i2;
        int i3;
        int i4 = this.f10106h;
        int d = m8161d();
        boolean b = mo5726b();
        boolean c = mo5727c();
        if (!b) {
            int i5 = this.f10107i;
            int i6 = d - i5;
            if (this.f10109k ? (this.f10103e & 2) != 0 : (this.f10103e & 1) != 0) {
                int i7 = this.f10100b;
                if (i - i7 <= i6) {
                    int i8 = i7 - i5;
                    return (c || i8 <= (i3 = this.f10101c)) ? i8 : i3;
                }
            }
        }
        if (!c) {
            int i9 = this.f10108j;
            int i10 = (i4 - d) - i9;
            if (this.f10109k ? (this.f10103e & 1) != 0 : (this.f10103e & 2) != 0) {
                int i11 = this.f10099a;
                if (i11 - i <= i10) {
                    int i12 = i11 - (i4 - i9);
                    return (b || i12 >= (i2 = this.f10102d)) ? i12 : i2;
                }
            }
        }
        return i - d;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5723a() {
        this.f10100b = Integer.MIN_VALUE;
        this.f10099a = Integer.MAX_VALUE;
    }

    /* renamed from: a */
    public final void mo5724a(int i, int i2) {
        this.f10107i = i;
        this.f10108j = i2;
    }

    public final String toString() {
        return " min:" + this.f10100b + " " + this.f10102d + " max:" + this.f10099a + " " + this.f10101c;
    }

    /* renamed from: a */
    public final void mo5725a(int i, int i2, int i3, int i4) {
        int i5;
        this.f10100b = i;
        this.f10099a = i2;
        int i6 = (this.f10106h - this.f10107i) - this.f10108j;
        int d = m8161d();
        boolean b = mo5726b();
        boolean c = mo5727c();
        if (!b) {
            if (this.f10109k) {
                this.f10102d = i3 - d;
            } else {
                this.f10102d = i3 - d;
            }
            this.f10102d = this.f10100b - this.f10107i;
        }
        if (!c) {
            boolean z = this.f10109k;
            if (!z ? (this.f10103e & 2) == 0 : (this.f10103e & 1) == 0) {
                i5 = i4 - d;
                this.f10101c = i5;
            } else {
                i5 = (this.f10099a - this.f10107i) - i6;
                this.f10101c = i5;
            }
            if (b) {
                return;
            }
            if (z) {
                int i7 = this.f10103e;
                if ((i7 & 1) != 0) {
                    this.f10102d = Math.min(this.f10102d, i5);
                } else if ((i7 & 2) != 0) {
                    int min = Math.min(this.f10102d, i4 - d);
                    this.f10102d = min;
                    this.f10101c = Math.max(min, this.f10101c);
                }
            } else {
                int i8 = this.f10103e;
                if ((i8 & 1) != 0) {
                    this.f10101c = Math.max(this.f10102d, i5);
                } else if ((i8 & 2) != 0) {
                    int max = Math.max(i5, i3 - d);
                    this.f10101c = max;
                    this.f10102d = Math.min(this.f10102d, max);
                }
            }
        }
    }
}
