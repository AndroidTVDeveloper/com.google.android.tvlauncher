package p000;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;

/* renamed from: csh */
/* compiled from: PG */
final class csh implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ csi f7183a;

    public csh(csi csi) {
        this.f7183a = csi;
    }

    public final void run() {
        View view;
        csi csi = this.f7183a;
        if (csi.f7184a.f6570f.getVisibility() != 8) {
            view = csi.f7184a.f6570f;
        } else {
            view = csi.f7184a.f6568d;
        }
        Rect rect = new Rect();
        if (view.getVisibility() == 0 && view.isShown() && view.getGlobalVisibleRect(rect)) {
            int width = view.getWidth();
            int height = view.getHeight();
            double width2 = (double) (rect.width() * rect.height());
            double d = (double) (width * height);
            Double.isNaN(width2);
            Double.isNaN(d);
            if (width2 / d >= 0.01d) {
                clv clv = csi.f7189f;
                if (clv != null) {
                    String str = clv.f5943c;
                    cll cll = csi.f7190g;
                    cll.f5918c.mo3105a(new clk(cll.f5917b, csi.f7195l, str));
                    csi.f7195l = str;
                    return;
                }
                Log.e("SponsoredProgramControllerHelper", "Outstream video ad is invalid but the runnable is still running");
                return;
            }
        }
        csi.f7191h.postDelayed(csi.f7196m, 500);
    }
}
