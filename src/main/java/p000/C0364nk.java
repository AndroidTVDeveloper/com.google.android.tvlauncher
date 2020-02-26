package p000;

/* renamed from: nk */
/* compiled from: PG */
abstract class C0364nk {

    /* renamed from: a */
    public final Object[] f9991a = new Object[1];

    /* renamed from: b */
    public C0363nj f9992b;

    /* renamed from: c */
    public boolean f9993c;

    /* renamed from: d */
    public int f9994d;

    /* renamed from: e */
    public int f9995e;

    /* renamed from: f */
    public int f9996f = -1;

    /* renamed from: g */
    public int f9997g = -1;

    /* renamed from: h */
    public C0072cp[] f9998h;

    /* renamed from: i */
    public int f9999i = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract int mo5635a(boolean z, int i, int[] iArr);

    /* renamed from: a */
    public void mo5639a(int i, int i2, C0268jw jwVar) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo5640a(int i, boolean z);

    /* renamed from: a */
    public abstract C0072cp[] mo5641a(int i, int i2);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract int mo5642b(boolean z, int i, int[] iArr);

    /* renamed from: d */
    public abstract C0362ni mo5648d(int i);

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public abstract void mo5651g(int i);

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(int, boolean):boolean
     arg types: [int, int]
     candidates:
      nk.a(boolean, int[]):int
      nk.a(int, int):cp[]
      nk.a(int, boolean):boolean */
    /* renamed from: b */
    public final boolean mo5645b() {
        return mo5640a(!this.f9993c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nk.a(boolean, int[]):int
     arg types: [int, ?[OBJECT, ARRAY]]
     candidates:
      nk.a(int, boolean):boolean
      nk.a(int, int):cp[]
      nk.a(boolean, int[]):int */
    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final boolean mo5649e(int i) {
        if (this.f9997g < 0) {
            return false;
        }
        if (this.f9993c) {
            if (mo5636a(true, (int[]) null) <= i + this.f9994d) {
                return true;
            }
        } else if (mo5643b(false, null) >= i - this.f9994d) {
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
    /* renamed from: f */
    public final boolean mo5650f(int i) {
        if (this.f9997g < 0) {
            return false;
        }
        if (this.f9993c) {
            if (mo5643b(false, null) >= i - this.f9994d) {
                return true;
            }
        } else if (mo5636a(true, (int[]) null) <= i + this.f9994d) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int mo5643b(boolean z, int[] iArr) {
        return mo5642b(z, this.f9993c ? this.f9996f : this.f9997g, iArr);
    }

    /* renamed from: a */
    public final int mo5636a(boolean z, int[] iArr) {
        return mo5635a(z, this.f9993c ? this.f9997g : this.f9996f, iArr);
    }

    /* renamed from: c */
    public final int mo5646c(int i) {
        C0362ni d = mo5648d(i);
        if (d == null) {
            return -1;
        }
        return d.f9990a;
    }

    /* renamed from: b */
    public void mo5644b(int i) {
        int i2;
        if (i >= 0 && (i2 = this.f9997g) >= 0) {
            if (i2 >= i) {
                this.f9997g = i - 1;
            }
            mo5647c();
            if (this.f9996f < 0) {
                this.f9999i = i;
            }
        }
    }

    /* renamed from: a */
    public final void mo5637a() {
        this.f9997g = -1;
        this.f9996f = -1;
    }

    /* renamed from: c */
    public final void mo5647c() {
        if (this.f9997g < this.f9996f) {
            mo5637a();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo5638a(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException();
        } else if (this.f9995e != i) {
            this.f9995e = i;
            this.f9998h = new C0072cp[i];
            for (int i2 = 0; i2 < this.f9995e; i2++) {
                this.f9998h[i2] = new C0072cp();
            }
        }
    }
}
