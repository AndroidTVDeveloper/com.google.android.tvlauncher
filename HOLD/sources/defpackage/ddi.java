package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.view.HomeTopRowView;
import com.google.android.tvlauncher.view.SearchOrb;

/* renamed from: ddi  reason: default package */
/* compiled from: PG */
public final class ddi implements ViewTreeObserver.OnGlobalFocusChangeListener {
    private final /* synthetic */ HomeTopRowView a;

    public ddi(HomeTopRowView homeTopRowView) {
        this.a = homeTopRowView;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        HomeTopRowView homeTopRowView;
        ddn ddn;
        int i;
        HomeTopRowView homeTopRowView2;
        cri cri;
        if (this.a.findFocus() == view2 && (cri = this.a.i) != null) {
            cri.u();
        }
        if (!this.a.f.hasFocus()) {
            if (this.a.d.hasFocus()) {
                homeTopRowView2 = this.a;
                i = 1;
            }
            homeTopRowView = this.a;
            if ((homeTopRowView.k != homeTopRowView.l || (view instanceof SearchOrb) || (view2 instanceof SearchOrb)) && (ddn = homeTopRowView.j) != null) {
                cqp cqp = (cqp) ddn;
                cqp.B.removeCallbacks(cqp.M);
                if (cqp.e.l()) {
                    Log.w("HomeController", "onHomeTopRowStateChange: still computing layout => scheduling");
                    cqp.B.post(cqp.M);
                    return;
                }
                cqp.M.run();
                return;
            }
        }
        homeTopRowView2 = this.a;
        i = 2;
        homeTopRowView2.l = i;
        homeTopRowView = this.a;
        if (homeTopRowView.k != homeTopRowView.l) {
        }
    }
}
