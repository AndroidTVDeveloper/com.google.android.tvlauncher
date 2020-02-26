package defpackage;

import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: cru  reason: default package */
/* compiled from: PG */
final class cru implements Runnable {
    private final /* synthetic */ crz a;

    public cru(crz crz) {
        this.a = crz;
    }

    public final void run() {
        crz crz = this.a;
        if (!crz.j && crz.k != null) {
            if (crz.g) {
                crz.c.setVisibility(0);
                if (!this.a.a()) {
                    this.a.c.a(0.0f);
                }
                crz crz2 = this.a;
                InstantVideoView instantVideoView = crz2.c;
                dlk dlk = crz2.D;
                if (!instantVideoView.f) {
                    if (instantVideoView.d != null) {
                        instantVideoView.b();
                    }
                    instantVideoView.f = true;
                    cxg a2 = cxg.a(instantVideoView.getContext());
                    instantVideoView.e = a2.a.a(instantVideoView.c);
                    cwi cwi = instantVideoView.e;
                    if (cwi == null) {
                        instantVideoView.f = false;
                        if (dlk != null) {
                            dlk.a(instantVideoView);
                            return;
                        }
                        return;
                    }
                    instantVideoView.d = cwi.f();
                    instantVideoView.addView(instantVideoView.d, new FrameLayout.LayoutParams(-1, -1, 17));
                    ImageView imageView = instantVideoView.a;
                    if (imageView != null) {
                        instantVideoView.bringChildToFront(imageView);
                    }
                    if (!(instantVideoView.getWidth() == 0 || instantVideoView.getHeight() == 0)) {
                        instantVideoView.e.a(instantVideoView.getWidth(), instantVideoView.getHeight());
                    }
                    instantVideoView.a(1);
                    instantVideoView.e.c();
                    instantVideoView.e.a(true);
                    instantVideoView.e.a(instantVideoView.b);
                    instantVideoView.e.a(new cxp(instantVideoView, dlk, (byte) 0, (byte) 0));
                    return;
                }
                return;
            }
            crz.c();
        }
    }
}
