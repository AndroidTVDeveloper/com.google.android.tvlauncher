package defpackage;

/* renamed from: ot  reason: default package */
/* compiled from: PG */
final class ot extends nk {
    private final ni j = new ni(0);

    public ot() {
        a(1);
    }

    public final ni d(int i) {
        return this.j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* access modifiers changed from: protected */
    public final boolean a(int i, boolean z) {
        int i2;
        if (this.b.a() == 0) {
            return false;
        }
        if (!z && e(i)) {
            return false;
        }
        int d = d();
        boolean z2 = false;
        while (d < this.b.a()) {
            int a = this.b.a(d, true, this.a, false);
            if (this.f >= 0 && this.g >= 0) {
                if (!this.c) {
                    int i3 = d - 1;
                    i2 = this.b.b(i3) + this.b.c(i3) + this.d;
                } else {
                    int i4 = d - 1;
                    i2 = (this.b.b(i4) - this.b.c(i4)) - this.d;
                }
                this.g = d;
            } else {
                i2 = !this.c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f = d;
                this.g = d;
            }
            this.b.a(this.a[0], a, 0, i2);
            if (z || e(i)) {
                return true;
            }
            d++;
            z2 = true;
        }
        return z2;
    }

    public final void a(int i, int i2, jw jwVar) {
        int i3;
        int i4;
        if (!this.c ? i2 < 0 : i2 > 0) {
            if (this.f != 0) {
                i3 = e();
                i4 = (!this.c ? -this.d : this.d) + this.b.b(this.f);
            } else {
                return;
            }
        } else if (this.g != this.b.a() - 1) {
            i3 = d();
            int c = this.b.c(this.g) + this.d;
            int b = this.b.b(this.g);
            if (this.c) {
                c = -c;
            }
            i4 = b + c;
        } else {
            return;
        }
        jwVar.a(i3, Math.abs(i4 - i));
    }

    /* access modifiers changed from: protected */
    public final int b(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (!this.c) {
            return this.b.b(i) + this.b.c(i);
        }
        return this.b.b(i);
    }

    /* access modifiers changed from: protected */
    public final int a(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (this.c) {
            return this.b.b(i) - this.b.c(i);
        }
        return this.b.b(i);
    }

    public final cp[] a(int i, int i2) {
        this.h[0].a();
        this.h[0].a(i);
        this.h[0].a(i2);
        return this.h;
    }

    private final int d() {
        int i = this.g;
        if (i >= 0) {
            return i + 1;
        }
        int i2 = this.i;
        if (i2 != -1) {
            return Math.min(i2, this.b.a() - 1);
        }
        return 0;
    }

    private final int e() {
        int i = this.f;
        if (i < 0) {
            int i2 = this.i;
            if (i2 != -1) {
                return Math.min(i2, this.b.a() - 1);
            }
            i = this.b.a();
        }
        return i - 1;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* access modifiers changed from: protected */
    public final void g(int i) {
        int i2;
        int i3;
        if (this.b.a() != 0 && !f(i)) {
            int b = this.b.b();
            int e = e();
            while (e >= b) {
                int a = this.b.a(e, false, this.a, false);
                if (this.f >= 0 && this.g >= 0) {
                    if (!this.c) {
                        i2 = (this.b.b(e + 1) - this.d) - a;
                    } else {
                        i2 = this.b.b(e + 1) + this.d + a;
                    }
                    this.f = e;
                } else {
                    if (!this.c) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    this.f = e;
                    this.g = e;
                }
                this.b.a(this.a[0], a, 0, i2);
                if (!f(i)) {
                    e--;
                } else {
                    return;
                }
            }
        }
    }
}
