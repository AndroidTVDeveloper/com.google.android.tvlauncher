package p000;

/* renamed from: ot */
/* compiled from: PG */
final class C0400ot extends C0364nk {

    /* renamed from: j */
    private final C0362ni f10091j = new C0362ni(0);

    public C0400ot() {
        mo5638a(1);
    }

    /* renamed from: d */
    public final C0362ni mo5648d(int i) {
        return this.f10091j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nj.a(int, boolean, java.lang.Object[], boolean):int
     arg types: [int, int, java.lang.Object[], int]
     candidates:
      nj.a(java.lang.Object, int, int, int):void
      nj.a(int, boolean, java.lang.Object[], boolean):int */
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo5640a(int i, boolean z) {
        int i2;
        if (this.f9992b.mo5628a() == 0) {
            return false;
        }
        if (!z && mo5649e(i)) {
            return false;
        }
        int d = m8137d();
        boolean z2 = false;
        while (d < this.f9992b.mo5628a()) {
            int a = this.f9992b.mo5629a(d, true, this.f9991a, false);
            if (this.f9996f >= 0 && this.f9997g >= 0) {
                if (!this.f9993c) {
                    int i3 = d - 1;
                    i2 = this.f9992b.mo5633b(i3) + this.f9992b.mo5634c(i3) + this.f9994d;
                } else {
                    int i4 = d - 1;
                    i2 = (this.f9992b.mo5633b(i4) - this.f9992b.mo5634c(i4)) - this.f9994d;
                }
                this.f9997g = d;
            } else {
                i2 = !this.f9993c ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                this.f9996f = d;
                this.f9997g = d;
            }
            this.f9992b.mo5631a(this.f9991a[0], a, 0, i2);
            if (z || mo5649e(i)) {
                return true;
            }
            d++;
            z2 = true;
        }
        return z2;
    }

    /* renamed from: a */
    public final void mo5639a(int i, int i2, C0268jw jwVar) {
        int i3;
        int i4;
        if (!this.f9993c ? i2 < 0 : i2 > 0) {
            if (this.f9996f != 0) {
                i3 = m8138e();
                i4 = (!this.f9993c ? -this.f9994d : this.f9994d) + this.f9992b.mo5633b(this.f9996f);
            } else {
                return;
            }
        } else if (this.f9997g != this.f9992b.mo5628a() - 1) {
            i3 = m8137d();
            int c = this.f9992b.mo5634c(this.f9997g) + this.f9994d;
            int b = this.f9992b.mo5633b(this.f9997g);
            if (this.f9993c) {
                c = -c;
            }
            i4 = b + c;
        } else {
            return;
        }
        jwVar.mo5261a(i3, Math.abs(i4 - i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final int mo5642b(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (!this.f9993c) {
            return this.f9992b.mo5633b(i) + this.f9992b.mo5634c(i);
        }
        return this.f9992b.mo5633b(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo5635a(boolean z, int i, int[] iArr) {
        if (iArr != null) {
            iArr[0] = 0;
            iArr[1] = i;
        }
        if (this.f9993c) {
            return this.f9992b.mo5633b(i) - this.f9992b.mo5634c(i);
        }
        return this.f9992b.mo5633b(i);
    }

    /* renamed from: a */
    public final C0072cp[] mo5641a(int i, int i2) {
        this.f9998h[0].mo3539a();
        this.f9998h[0].mo3540a(i);
        this.f9998h[0].mo3540a(i2);
        return this.f9998h;
    }

    /* renamed from: d */
    private final int m8137d() {
        int i = this.f9997g;
        if (i >= 0) {
            return i + 1;
        }
        int i2 = this.f9999i;
        if (i2 != -1) {
            return Math.min(i2, this.f9992b.mo5628a() - 1);
        }
        return 0;
    }

    /* renamed from: e */
    private final int m8138e() {
        int i = this.f9996f;
        if (i < 0) {
            int i2 = this.f9999i;
            if (i2 != -1) {
                return Math.min(i2, this.f9992b.mo5628a() - 1);
            }
            i = this.f9992b.mo5628a();
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
    /* renamed from: g */
    public final void mo5651g(int i) {
        int i2;
        int i3;
        if (this.f9992b.mo5628a() != 0 && !mo5650f(i)) {
            int b = this.f9992b.mo5632b();
            int e = m8138e();
            while (e >= b) {
                int a = this.f9992b.mo5629a(e, false, this.f9991a, false);
                if (this.f9996f >= 0 && this.f9997g >= 0) {
                    if (!this.f9993c) {
                        i2 = (this.f9992b.mo5633b(e + 1) - this.f9994d) - a;
                    } else {
                        i2 = this.f9992b.mo5633b(e + 1) + this.f9994d + a;
                    }
                    this.f9996f = e;
                } else {
                    if (!this.f9993c) {
                        i3 = Integer.MAX_VALUE;
                    } else {
                        i3 = Integer.MIN_VALUE;
                    }
                    this.f9996f = e;
                    this.f9997g = e;
                }
                this.f9992b.mo5631a(this.f9991a[0], a, 0, i2);
                if (!mo5650f(i)) {
                    e--;
                } else {
                    return;
                }
            }
        }
    }
}
