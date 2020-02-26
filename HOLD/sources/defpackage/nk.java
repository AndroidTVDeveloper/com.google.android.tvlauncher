package defpackage;

/* renamed from: nk  reason: default package */
/* compiled from: PG */
abstract class nk {
    public final Object[] a = new Object[1];
    public nj b;
    public boolean c;
    public int d;
    public int e;
    public int f = -1;
    public int g = -1;
    public cp[] h;
    public int i = -1;

    /* access modifiers changed from: protected */
    public abstract int a(boolean z, int i2, int[] iArr);

    public void a(int i2, int i3, jw jwVar) {
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(int i2, boolean z);

    public abstract cp[] a(int i2, int i3);

    /* access modifiers changed from: protected */
    public abstract int b(boolean z, int i2, int[] iArr);

    public abstract ni d(int i2);

    /* access modifiers changed from: protected */
    public abstract void g(int i2);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      nk.a(boolean, int[]):int
      nk.a(int, int):cp[]
      nk.a(int, boolean):boolean */
    public final boolean b() {
        return a(!this.c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(boolean, int[]):int
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      nk.a(int, boolean):boolean
      nk.a(int, int):cp[]
      nk.a(boolean, int[]):int */
    /* access modifiers changed from: protected */
    public final boolean e(int i2) {
        if (this.g < 0) {
            return false;
        }
        if (this.c) {
            if (a(true, (int[]) null) <= i2 + this.d) {
                return true;
            }
        } else if (b(false, null) >= i2 - this.d) {
            return true;
        }
        return false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(boolean, int[]):int
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      nk.a(int, boolean):boolean
      nk.a(int, int):cp[]
      nk.a(boolean, int[]):int */
    /* access modifiers changed from: protected */
    public final boolean f(int i2) {
        if (this.g < 0) {
            return false;
        }
        if (this.c) {
            if (b(false, null) >= i2 - this.d) {
                return true;
            }
        } else if (a(true, (int[]) null) <= i2 + this.d) {
            return true;
        }
        return false;
    }

    public final int b(boolean z, int[] iArr) {
        return b(z, this.c ? this.f : this.g, iArr);
    }

    public final int a(boolean z, int[] iArr) {
        return a(z, this.c ? this.g : this.f, iArr);
    }

    public final int c(int i2) {
        ni d2 = d(i2);
        if (d2 == null) {
            return -1;
        }
        return d2.a;
    }

    public void b(int i2) {
        int i3;
        if (i2 >= 0 && (i3 = this.g) >= 0) {
            if (i3 >= i2) {
                this.g = i2 - 1;
            }
            c();
            if (this.f < 0) {
                this.i = i2;
            }
        }
    }

    public final void a() {
        this.g = -1;
        this.f = -1;
    }

    public final void c() {
        if (this.g < this.f) {
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException();
        } else if (this.e != i2) {
            this.e = i2;
            this.h = new cp[i2];
            for (int i3 = 0; i3 < this.e; i3++) {
                this.h[i3] = new cp();
            }
        }
    }
}
