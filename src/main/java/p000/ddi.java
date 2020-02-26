package p000;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.tvlauncher.view.HomeTopRowView;
import com.google.android.tvlauncher.view.SearchOrb;

/* renamed from: ddi */
/* compiled from: PG */
public final class ddi implements ViewTreeObserver.OnGlobalFocusChangeListener {

    /* renamed from: a */
    private final /* synthetic */ HomeTopRowView f8337a;

    public ddi(HomeTopRowView homeTopRowView) {
        this.f8337a = homeTopRowView;
    }

    public final void onGlobalFocusChanged(View view, View view2) {
        HomeTopRowView homeTopRowView;
        ddn ddn;
        int i;
        HomeTopRowView homeTopRowView2;
        cri cri;
        if (this.f8337a.findFocus() == view2 && (cri = this.f8337a.f6706i) != null) {
            cri.mo3585u();
        }
        if (!this.f8337a.f6703f.hasFocus()) {
            if (this.f8337a.f6701d.hasFocus()) {
                homeTopRowView2 = this.f8337a;
                i = 1;
            }
            homeTopRowView = this.f8337a;
            if ((homeTopRowView.f6708k != homeTopRowView.f6709l || (view instanceof SearchOrb) || (view2 instanceof SearchOrb)) && (ddn = homeTopRowView.f6707j) != null) {
                cqp cqp = (cqp) ddn;
                cqp.f6976B.removeCallbacks(cqp.f6987M);
                if (cqp.f7013e.mo892l()) {
                    Log.w("HomeController", "onHomeTopRowStateChange: still computing layout => scheduling");
                    cqp.f6976B.post(cqp.f6987M);
                    return;
                }
                cqp.f6987M.run();
                return;
            }
        }
        homeTopRowView2 = this.f8337a;
        i = 2;
        homeTopRowView2.f6709l = i;
        homeTopRowView = this.f8337a;
        if (homeTopRowView.f6708k != homeTopRowView.f6709l) {
        }
    }
}
