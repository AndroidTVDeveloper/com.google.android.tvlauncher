package p000;

import android.util.Log;
import androidx.leanback.widget.VerticalGridView;

/* renamed from: cqd */
/* compiled from: PG */
final class cqd implements crk {

    /* renamed from: a */
    private final /* synthetic */ cqp f6961a;

    public cqd(cqp cqp) {
        this.f6961a = cqp;
    }

    /* renamed from: a */
    public final void mo3575a(crz crz) {
        cqp cqp = this.f6961a;
        cqp.f7030v = crz;
        if (cqp.f7024p != 0 || !cqp.f7031w.f7168b || !cqp.mo3603h(cqp.f7026r)) {
            cqp cqp2 = this.f6961a;
            if (cqp2.f7014f != null) {
                cqp2.f6976B.removeCallbacks(cqp2.f6991Q);
                cqp cqp3 = this.f6961a;
                cqp3.f6976B.postDelayed(cqp3.f6991Q, 2000);
            }
            cqp cqp4 = this.f6961a;
            int a = cqp4.mo2850a(cqp4.f7026r);
            if (a != 4 && a != 5) {
                cqp cqp5 = this.f6961a;
                cqp5.f6976B.removeCallbacks(cqp5.f6989O);
                VerticalGridView verticalGridView = this.f6961a.f7013e;
                if (verticalGridView != null && !verticalGridView.mo892l()) {
                    this.f6961a.f6989O.run();
                } else {
                    Log.w("HomeController", "list is still computing layout => schedule item metadata change");
                    cqp cqp6 = this.f6961a;
                    cqp6.f6976B.post(cqp6.f6989O);
                }
                cqp cqp7 = this.f6961a;
                if (cqp7.mo2850a(cqp7.f7026r) == 2) {
                    cqp cqp8 = this.f6961a;
                    cqp8.f6976B.removeCallbacks(cqp8.f6990P);
                    VerticalGridView verticalGridView2 = this.f6961a.f7013e;
                    if (verticalGridView2 != null && !verticalGridView2.mo892l()) {
                        this.f6961a.f6990P.run();
                        return;
                    }
                    Log.w("HomeController", "list is still computing layout => schedule watch next card selection changed");
                    cqp cqp9 = this.f6961a;
                    cqp9.f6976B.post(cqp9.f6990P);
                }
            }
        }
    }
}
