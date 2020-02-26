package defpackage;

import android.util.Log;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: cqd  reason: default package */
/* compiled from: PG */
final class cqd implements crk {
    private final /* synthetic */ cqp a;

    public cqd(cqp cqp) {
        this.a = cqp;
    }

    public final void a(crz crz) {
        cqp cqp = this.a;
        cqp.v = crz;
        if (cqp.p != 0 || !cqp.w.b || !cqp.h(cqp.r)) {
            cqp cqp2 = this.a;
            if (cqp2.f != null) {
                cqp2.B.removeCallbacks(cqp2.Q);
                cqp cqp3 = this.a;
                cqp3.B.postDelayed(cqp3.Q, 2000);
            }
            cqp cqp4 = this.a;
            int a2 = cqp4.a(cqp4.r);
            if (a2 != 4 && a2 != 5) {
                cqp cqp5 = this.a;
                cqp5.B.removeCallbacks(cqp5.O);
                VerticalGridView verticalGridView = this.a.e;
                if (verticalGridView != null && !verticalGridView.l()) {
                    this.a.O.run();
                } else {
                    Log.w("HomeController", "list is still computing layout => schedule item metadata change");
                    cqp cqp6 = this.a;
                    cqp6.B.post(cqp6.O);
                }
                cqp cqp7 = this.a;
                if (cqp7.a(cqp7.r) == 2) {
                    cqp cqp8 = this.a;
                    cqp8.B.removeCallbacks(cqp8.P);
                    VerticalGridView verticalGridView2 = this.a.e;
                    if (verticalGridView2 != null && !verticalGridView2.l()) {
                        this.a.P.run();
                        return;
                    }
                    Log.w("HomeController", "list is still computing layout => schedule watch next card selection changed");
                    cqp cqp9 = this.a;
                    cqp9.B.post(cqp9.P);
                }
            }
        }
    }
}
