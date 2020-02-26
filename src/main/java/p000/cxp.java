package p000;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: cxp */
/* compiled from: PG */
public final class cxp implements cwh {

    /* renamed from: a */
    private final /* synthetic */ InstantVideoView f7852a;

    /* renamed from: b */
    private final /* synthetic */ dlk f7853b;

    public cxp(InstantVideoView instantVideoView, dlk dlk, byte b, byte b2) {
        this.f7852a = instantVideoView;
        this.f7853b = dlk;
    }

    /* renamed from: a */
    public final void mo3878a() {
        InstantVideoView instantVideoView = this.f7852a;
        if (instantVideoView.f6604f) {
            instantVideoView.mo3430a(2);
            dlk dlk = this.f7853b;
            if (dlk != null) {
                crr crr = (crr) dlk;
                crr.f7076a.f7148q = SystemClock.elapsedRealtime();
                crz crz = crr.f7076a;
                ValueAnimator valueAnimator = crz.f7154w;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ValueAnimator valueAnimator2 = crz.f7155x;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        crz.f7155x.cancel();
                        crz.f7155x = null;
                    }
                    if (crz.f7156y == null) {
                        crz.f7156y = new cro(crz);
                    }
                    crz.f7154w = ValueAnimator.ofFloat(crz.f7153v, 0.0f);
                    crz.f7154w.addUpdateListener(crz.mo3687h());
                    crz.f7154w.addListener(crz.f7156y);
                    crz.f7154w.setDuration(300L);
                    crz.f7154w.start();
                }
                crr.f7076a.f7109a.setVisibility(4);
                csi csi = crr.f7076a.f7085B;
                if (csi == null) {
                    return;
                }
                if (csi.f7189f == null) {
                    throw new IllegalStateException("OutstreamVideoAd is null for a video ad that is about to start playing.");
                } else if (csi.mo3704d()) {
                    clz clz = csi.f7194k;
                    clf clf = csi.f7193j;
                    if (!clz.f5959e.contains(clf)) {
                        clz.f5959e.add(clf);
                    }
                    clz clz2 = csi.f7194k;
                    long j = csi.f7189f.f5951k;
                    if (clz2.f5955a) {
                        long j2 = clz2.f5956b;
                        StringBuilder sb = new StringBuilder(130);
                        sb.append("startTracking was called while the tracking is in progress, last duration: ");
                        sb.append(j2);
                        sb.append(" new duration: ");
                        sb.append(j);
                        Log.e("VideoProgressPoller", sb.toString());
                        clz2.mo3112a();
                    }
                    clz2.f5955a = true;
                    clz2.f5956b = j;
                    long j3 = j / 4;
                    clz2.f5957c = j3;
                    if (j3 >= 0) {
                        clz2.f5958d.sendEmptyMessage(1);
                        return;
                    }
                    StringBuilder sb2 = new StringBuilder(81);
                    sb2.append("A negative refresh interval obtained from video duration of: ");
                    sb2.append(j);
                    throw new IllegalArgumentException(sb2.toString());
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo3880c() {
        dlk dlk;
        if (this.f7852a.f6604f && (dlk = this.f7853b) != null) {
            ((crr) dlk).f7076a.mo3678a(true, 1);
        }
    }

    /* renamed from: b */
    public final void mo3879b() {
        dlk dlk;
        InstantVideoView instantVideoView = this.f7852a;
        if (instantVideoView.f6604f && (dlk = this.f7853b) != null) {
            dlk.mo3667a(instantVideoView);
        }
    }
}
