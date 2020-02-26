package p000;

import android.graphics.PointF;
import android.view.View;

/* renamed from: nq */
/* compiled from: PG */
final class C0370nq extends C0368no {

    /* renamed from: j */
    public final boolean f10013j;

    /* renamed from: k */
    public int f10014k;

    /* renamed from: l */
    public final /* synthetic */ C0373nt f10015l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0370nq(C0373nt ntVar, int i, boolean z) {
        super(ntVar);
        this.f10015l = ntVar;
        this.f10014k = i;
        this.f10013j = z;
        this.f9743a = -2;
    }

    /* renamed from: a */
    public final PointF mo5410a(int i) {
        int i2 = this.f10014k;
        if (i2 == 0) {
            return null;
        }
        C0373nt ntVar = this.f10015l;
        int i3 = -1;
        if ((ntVar.f10047p & 262144) == 0 ? i2 >= 0 : i2 <= 0) {
            i3 = 1;
        }
        if (ntVar.f10043l == 0) {
            return new PointF((float) i3, 0.0f);
        }
        return new PointF(0.0f, (float) i3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: nt.a(android.view.View, boolean):void
     arg types: [android.view.View, int]
     candidates:
      nt.a(boolean, int):int
      nt.a(android.content.Context, android.util.AttributeSet):jy
      nt.a(int, jw):void
      nt.a(int, boolean):void
      nt.a(android.view.View, android.graphics.Rect):void
      nt.a(android.view.View, android.view.View):void
      nt.a(android.view.View, ed):void
      nt.a(jp, jp):void
      nt.a(kc, kk):void
      jx.a(android.content.Context, android.util.AttributeSet):jy
      jx.a(int, int):void
      jx.a(int, jw):void
      jx.a(android.view.View, int):void
      jx.a(android.view.View, android.graphics.Rect):void
      jx.a(android.view.View, android.view.View):void
      jx.a(android.view.View, ed):void
      jx.a(android.view.View, kc):void
      jx.a(jp, jp):void
      jx.a(kc, kk):void
      nt.a(android.view.View, boolean):void */
    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo5653d() {
        super.mo5653d();
        this.f10014k = 0;
        View b = mo5416b(this.f9743a);
        if (b != null) {
            this.f10015l.mo5662a(b, true);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo5414a(C0280kh khVar) {
        if (this.f10014k != 0) {
            super.mo5414a(khVar);
        }
    }
}
