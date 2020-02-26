package p000;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: atq */
/* compiled from: PG */
final class atq implements atp {
    private atq() {
    }

    /* renamed from: a */
    public final boolean mo1339a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    /* renamed from: b */
    public final boolean mo1341b() {
        return false;
    }

    public /* synthetic */ atq(byte b) {
    }

    /* renamed from: a */
    public final int mo1337a() {
        return MediaCodecList.getCodecCount();
    }

    /* renamed from: a */
    public final MediaCodecInfo mo1338a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    /* renamed from: a */
    public final boolean mo1340a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
