package p000;

import android.util.DisplayMetrics;
import android.view.View;

/* renamed from: no */
/* compiled from: PG */
class C0368no extends C0282kj {

    /* renamed from: i */
    public boolean f10003i;

    /* renamed from: j */
    private final /* synthetic */ C0373nt f10004j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0368no(C0373nt ntVar) {
        super(ntVar.f10042k.getContext());
        this.f10004j = ntVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final float mo5409a(DisplayMetrics displayMetrics) {
        return super.mo5409a(displayMetrics) * this.f10004j.f10041j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final int mo5419d(int i) {
        int d = super.mo5419d(i);
        int i2 = this.f10004j.f10023D.f10113d.f10106h;
        if (i2 > 0) {
            float f = (30.0f / ((float) i2)) * ((float) i);
            if (((float) d) < f) {
                return (int) f;
            }
        }
        return d;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo5418c() {
        super.mo5418c();
        if (!this.f10003i) {
            mo5653d();
        }
        C0373nt ntVar = this.f10004j;
        if (ntVar.f10051t == this) {
            ntVar.f10051t = null;
        }
        if (ntVar.f10052u == this) {
            ntVar.f10052u = null;
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
    /* renamed from: d */
    public void mo5653d() {
        View b = mo5416b(this.f9743a);
        if (b != null) {
            C0373nt ntVar = this.f10004j;
            int i = ntVar.f10049r;
            int i2 = this.f9743a;
            if (i != i2) {
                ntVar.f10049r = i2;
            }
            if (ntVar.mo5379l()) {
                this.f10004j.f10047p |= 32;
                b.requestFocus();
                this.f10004j.f10047p &= -33;
            }
            this.f10004j.mo5676s();
            this.f10004j.mo5677t();
            return;
        }
        int i3 = this.f9743a;
        if (i3 >= 0) {
            this.f10004j.mo5664b(i3, false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5413a(View view, C0280kh khVar) {
        int i;
        int i2;
        if (this.f10004j.mo5663a(view, (View) null, C0373nt.f10018F)) {
            if (this.f10004j.f10043l != 0) {
                i = C0373nt.f10018F[1];
                i2 = C0373nt.f10018F[0];
            } else {
                i = C0373nt.f10018F[0];
                i2 = C0373nt.f10018F[1];
            }
            khVar.mo5407a(i, i2, mo5417c((int) Math.sqrt((double) ((i * i) + (i2 * i2)))), this.f9750h);
        }
    }
}
