package defpackage;

import android.media.MediaCodec;
import android.os.Handler;

/* renamed from: blv  reason: default package */
/* compiled from: PG */
final class blv implements MediaCodec.OnFrameRenderedListener {
    private final /* synthetic */ blx a;

    public /* synthetic */ blv(blx blx, MediaCodec mediaCodec) {
        this.a = blx;
        mediaCodec.setOnFrameRenderedListener(this, new Handler());
    }

    public final void onFrameRendered(MediaCodec mediaCodec, long j, long j2) {
        blx blx = this.a;
        if (this == blx.f) {
            blx.e(j);
        }
    }
}
