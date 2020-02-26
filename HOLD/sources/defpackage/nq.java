package defpackage;

import android.graphics.PointF;
import android.view.View;

/* renamed from: nq  reason: default package */
/* compiled from: PG */
final class nq extends no {
    public final boolean j;
    public int k;
    public final /* synthetic */ nt l;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nq(nt ntVar, int i, boolean z) {
        super(ntVar);
        this.l = ntVar;
        this.k = i;
        this.j = z;
        this.a = -2;
    }

    public final PointF a(int i) {
        int i2 = this.k;
        if (i2 == 0) {
            return null;
        }
        nt ntVar = this.l;
        int i3 = -1;
        if ((ntVar.p & 262144) == 0 ? i2 >= 0 : i2 <= 0) {
            i3 = 1;
        }
        if (ntVar.l == 0) {
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
    public final void d() {
        super.d();
        this.k = 0;
        View b = b(this.a);
        if (b != null) {
            this.l.a(b, true);
        }
    }

    /* access modifiers changed from: protected */
    public final void a(kh khVar) {
        if (this.k != 0) {
            super.a(khVar);
        }
    }
}
