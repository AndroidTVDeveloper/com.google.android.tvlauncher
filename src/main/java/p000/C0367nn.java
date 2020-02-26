package p000;

import android.graphics.PointF;

/* renamed from: nn */
/* compiled from: PG */
final class C0367nn extends C0368no {

    /* renamed from: j */
    private final /* synthetic */ C0373nt f10002j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C0367nn(C0373nt ntVar) {
        super(ntVar);
        this.f10002j = ntVar;
    }

    /* renamed from: a */
    public final PointF mo5410a(int i) {
        if (mo5415b() == 0) {
            return null;
        }
        boolean z = false;
        int c = ((C0270jy) this.f10002j.mo5368d(0).getLayoutParams()).mo5388c();
        C0373nt ntVar = this.f10002j;
        int i2 = 1;
        if ((ntVar.f10047p & 262144) != 0 ? i > c : i < c) {
            z = true;
        }
        if (z) {
            i2 = -1;
        }
        if (ntVar.f10043l != 0) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }
}
