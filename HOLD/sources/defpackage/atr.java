package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: atr  reason: default package */
/* compiled from: PG */
final class atr implements atp {
    private final int a;
    private MediaCodecInfo[] b;

    public atr(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.a = i;
    }

    public final boolean b() {
        return true;
    }

    private final void c() {
        if (this.b == null) {
            this.b = new MediaCodecList(this.a).getCodecInfos();
        }
    }

    public final int a() {
        c();
        return this.b.length;
    }

    public final MediaCodecInfo a(int i) {
        c();
        return this.b[i];
    }

    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
