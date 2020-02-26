package defpackage;

import android.graphics.PointF;

/* renamed from: nn  reason: default package */
/* compiled from: PG */
final class nn extends no {
    private final /* synthetic */ nt j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public nn(nt ntVar) {
        super(ntVar);
        this.j = ntVar;
    }

    public final PointF a(int i) {
        if (b() == 0) {
            return null;
        }
        boolean z = false;
        int c = ((jy) this.j.d(0).getLayoutParams()).c();
        nt ntVar = this.j;
        int i2 = 1;
        if ((ntVar.p & 262144) != 0 ? i > c : i < c) {
            z = true;
        }
        if (z) {
            i2 = -1;
        }
        if (ntVar.l != 0) {
            return new PointF(0.0f, (float) i2);
        }
        return new PointF((float) i2, 0.0f);
    }
}
