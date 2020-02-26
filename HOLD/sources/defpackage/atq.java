package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;

/* renamed from: atq  reason: default package */
/* compiled from: PG */
final class atq implements atp {
    private atq() {
    }

    public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return false;
    }

    public final boolean b() {
        return false;
    }

    public /* synthetic */ atq(byte b) {
    }

    public final int a() {
        return MediaCodecList.getCodecCount();
    }

    public final MediaCodecInfo a(int i) {
        return MediaCodecList.getCodecInfoAt(i);
    }

    public final boolean a(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return "secure-playback".equals(str) && "video/avc".equals(str2);
    }
}
