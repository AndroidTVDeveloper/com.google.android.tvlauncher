package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.View;

/* renamed from: csh  reason: default package */
/* compiled from: PG */
final class csh implements Runnable {
    private final /* synthetic */ csi a;

    public csh(csi csi) {
        this.a = csi;
    }

    public final void run() {
        View view;
        csi csi = this.a;
        if (csi.a.f.getVisibility() != 8) {
            view = csi.a.f;
        } else {
            view = csi.a.d;
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
                clv clv = csi.f;
                if (clv != null) {
                    String str = clv.c;
                    cll cll = csi.g;
                    cll.c.a(new clk(cll.b, csi.l, str));
                    csi.l = str;
                    return;
                }
                Log.e("SponsoredProgramControllerHelper", "Outstream video ad is invalid but the runnable is still running");
                return;
            }
        }
        csi.h.postDelayed(csi.m, 500);
    }
}
