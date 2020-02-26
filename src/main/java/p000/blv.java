package p000;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: blv */
/* compiled from: PG */
final class blv implements MediaCodec.OnFrameRenderedListener {

    /* renamed from: a */
    private final /* synthetic */ blx f4330a;

    public /* synthetic */ blv(blx blx, MediaCodec mediaCodec) {
        this.f4330a = blx;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        blx blx = this.f4330a;
        if (this == blx.f4356f) {
            blx.mo2130e(j);
        }
    }
}
