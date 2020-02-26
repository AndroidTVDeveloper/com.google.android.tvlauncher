package defpackage;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: no  reason: default package */
/* compiled from: PG */
class no extends kj {
    public boolean i;
    private final /* synthetic */ nt j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public no(nt ntVar) {
        super(ntVar.k.getContext());
        this.j = ntVar;
    }

    /* access modifiers changed from: protected */
    public final float a(DisplayMetrics displayMetrics) {
        return super.a(displayMetrics) * this.j.j;
    }

    /* access modifiers changed from: protected */
    public final int d(int i2) {
        int d = super.d(i2);
        int i3 = this.j.D.d.h;
        if (i3 > 0) {
            float f = (30.0f / ((float) i3)) * ((float) i2);
            if (((float) d) < f) {
                return (int) f;
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    public final void c() {
        super.c();
        if (!this.i) {
            d();
        }
        nt ntVar = this.j;
        if (ntVar.t == this) {
            ntVar.t = null;
        }
        if (ntVar.u == this) {
            ntVar.u = null;
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.b(int, boolean):void
     arg types: [int, int]
     candidates:
      nt.b(android.view.View, android.view.View):void
      nt.b(kc, kk):void
      nt.b(int, int):void
      jx.b(int, int):void
      jx.b(android.view.View, int):void
      jx.b(android.view.View, android.graphics.Rect):void
      jx.b(android.view.View, kc):void
      nt.b(int, boolean):void */
    /* access modifiers changed from: protected */
    public void d() {
        View b = b(this.a);
        if (b != null) {
            nt ntVar = this.j;
            int i2 = ntVar.r;
            int i3 = this.a;
            if (i2 != i3) {
                ntVar.r = i3;
            }
            if (ntVar.l()) {
                this.j.p |= 32;
                b.requestFocus();
                this.j.p &= -33;
            }
            this.j.s();
            this.j.t();
            return;
        }
        int i4 = this.a;
        if (i4 >= 0) {
            this.j.b(i4, false);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(View view, kh khVar) {
        int i2;
        int i3;
        if (this.j.a(view, (View) null, nt.F)) {
            if (this.j.l != 0) {
                i2 = nt.F[1];
                i3 = nt.F[0];
            } else {
                i2 = nt.F[0];
                i3 = nt.F[1];
            }
            khVar.a(i2, i3, c((int) Math.sqrt((double) ((i2 * i2) + (i3 * i3)))), this.h);
        }
    }
}
