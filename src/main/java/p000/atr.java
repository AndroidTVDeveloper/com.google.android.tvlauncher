package p000;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: atr */
/* compiled from: PG */
final class atr implements atp {

    /* renamed from: a */
    private final int f2397a;

    /* renamed from: b */
    private MediaCodecInfo[] f2398b;

    public atr(boolean z, boolean z2) {
        int i = 1;
        if (!z && !z2) {
            i = 0;
        }
        this.f2397a = i;
    }

    /* renamed from: b */
    public final boolean mo1341b() {
        return true;
    }

    /* renamed from: c */
    private final void m2117c() {
        if (this.f2398b == null) {
            this.f2398b = new MediaCodecList(this.f2397a).getCodecInfos();
        }
    }

    /* renamed from: a */
    public final int mo1337a() {
        m2117c();
        return this.f2398b.length;
    }

    /* renamed from: a */
    public final MediaCodecInfo mo1338a(int i) {
        m2117c();
        return this.f2398b[i];
    }

    /* renamed from: a */
    public final boolean mo1339a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    /* renamed from: a */
    public final boolean mo1340a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }
}
