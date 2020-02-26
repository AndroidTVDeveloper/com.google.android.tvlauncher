package p000;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: cru */
/* compiled from: PG */
final class cru implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ crz f7079a;

    public cru(crz crz) {
        this.f7079a = crz;
    }

    public final void run() {
        crz crz = this.f7079a;
        if (!crz.f7141j && crz.f7142k != null) {
            if (crz.f7138g) {
                crz.f7134c.setVisibility(0);
                if (!this.f7079a.mo3679a()) {
                    this.f7079a.f7134c.mo3429a(0.0f);
                }
                crz crz2 = this.f7079a;
                InstantVideoView instantVideoView = crz2.f7134c;
                dlk dlk = crz2.f7087D;
                if (!instantVideoView.f6604f) {
                    if (instantVideoView.f6602d != null) {
                        instantVideoView.mo3432b();
                    }
                    instantVideoView.f6604f = true;
                    cxg a = cxg.m5888a(instantVideoView.getContext());
                    instantVideoView.f6603e = a.f7834a.mo3932a(instantVideoView.f6601c);
                    cwi cwi = instantVideoView.f6603e;
                    if (cwi == null) {
                        instantVideoView.f6604f = false;
                        if (dlk != null) {
                            dlk.mo3667a(instantVideoView);
                            return;
                        }
                        return;
                    }
                    instantVideoView.f6602d = cwi.mo3890f();
                    instantVideoView.addView(instantVideoView.f6602d, new FrameLayout.LayoutParams(-1, -1, 17));
                    ImageView imageView = instantVideoView.f6599a;
                    if (imageView != null) {
                        instantVideoView.bringChildToFront(imageView);
                    }
                    if (!(instantVideoView.getWidth() == 0 || instantVideoView.getHeight() == 0)) {
                        instantVideoView.f6603e.mo3883a(instantVideoView.getWidth(), instantVideoView.getHeight());
                    }
                    instantVideoView.mo3430a(1);
                    instantVideoView.f6603e.mo3887c();
                    instantVideoView.f6603e.mo3885a(true);
                    instantVideoView.f6603e.mo3882a(instantVideoView.f6600b);
                    instantVideoView.f6603e.mo3884a(new cxp(instantVideoView, dlk, (byte) 0, (byte) 0));
                    return;
                }
                return;
            }
            crz.mo3682c();
        }
    }
}
