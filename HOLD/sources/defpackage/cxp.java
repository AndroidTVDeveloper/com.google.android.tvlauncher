package defpackage;

import android.animation.ValueAnimator;
import android.os.SystemClock;
import android.util.Log;
import com.google.android.tvlauncher.instantvideo.widget.InstantVideoView;

/* renamed from: cxp  reason: default package */
/* compiled from: PG */
public final class cxp implements cwh {
    private final /* synthetic */ InstantVideoView a;
    private final /* synthetic */ dlk b;

    public cxp(InstantVideoView instantVideoView, dlk dlk, byte b2, byte b3) {
        this.a = instantVideoView;
        this.b = dlk;
    }

    public final void a() {
        InstantVideoView instantVideoView = this.a;
        if (instantVideoView.f) {
            instantVideoView.a(2);
            dlk dlk = this.b;
            if (dlk != null) {
                crr crr = (crr) dlk;
                crr.a.q = SystemClock.elapsedRealtime();
                crz crz = crr.a;
                ValueAnimator valueAnimator = crz.w;
                if (valueAnimator == null || !valueAnimator.isRunning()) {
                    ValueAnimator valueAnimator2 = crz.x;
                    if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                        crz.x.cancel();
                        crz.x = null;
                    }
                    if (crz.y == null) {
                        crz.y = new cro(crz);
                    }
                    crz.w = ValueAnimator.ofFloat(crz.v, 0.0f);
                    crz.w.addUpdateListener(crz.h());
                    crz.w.addListener(crz.y);
                    crz.w.setDuration(300L);
                    crz.w.start();
                }
                crr.a.a.setVisibility(4);
                csi csi = crr.a.B;
                if (csi == null) {
                    return;
                }
                if (csi.f == null) {
                    throw new IllegalStateException("OutstreamVideoAd is null for a video ad that is about to start playing.");
                } else if (csi.d()) {
                    clz clz = csi.k;
                    clf clf = csi.j;
                    if (!clz.e.contains(clf)) {
                        clz.e.add(clf);
                    }
                    clz clz2 = csi.k;
                    long j = csi.f.k;
                    if (clz2.a) {
                        long j2 = clz2.b;
                        StringBuilder sb = new StringBuilder(130);
                        sb.append("startTracking was called while the tracking is in progress, last duration: ");
                        sb.append(j2);
                        sb.append(" new duration: ");
                        sb.append(j);
                        Log.e("VideoProgressPoller", sb.toString());
                        clz2.a();
                    }
                    clz2.a = true;
                    clz2.b = j;
                    long j3 = j / 4;
                    clz2.c = j3;
                    if (j3 >= 0) {
                        clz2.d.sendEmptyMessage(1);
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

    public final void c() {
        dlk dlk;
        if (this.a.f && (dlk = this.b) != null) {
            ((crr) dlk).a.a(true, 1);
        }
    }

    public final void b() {
        dlk dlk;
        InstantVideoView instantVideoView = this.a;
        if (instantVideoView.f && (dlk = this.b) != null) {
            dlk.a(instantVideoView);
        }
    }
}
