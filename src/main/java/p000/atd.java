package p000;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* renamed from: atd */
/* compiled from: PG */
public final class atd {

    /* renamed from: a */
    public final String f2328a;

    /* renamed from: b */
    public final String f2329b;

    /* renamed from: c */
    public final String f2330c;

    /* renamed from: d */
    public final MediaCodecInfo.CodecCapabilities f2331d;

    /* renamed from: e */
    public final boolean f2332e;

    /* renamed from: f */
    public final boolean f2333f;

    /* renamed from: g */
    private final boolean f2334g;

    /* renamed from: h */
    private final boolean f2335h;

    public atd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.f2328a = (String) bks.m3507a((Object) str);
        this.f2329b = str2;
        this.f2330c = str3;
        this.f2331d = codecCapabilities;
        this.f2333f = z;
        boolean z4 = false;
        this.f2334g = !z2 && codecCapabilities != null && blm.f4293a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null && blm.f4293a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z3 || (codecCapabilities != null && blm.f4293a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
            z4 = true;
        }
        this.f2332e = z4;
        this.f2335h = bkt.m3516b(str2);
    }

    public final String toString() {
        return this.f2328a;
    }

    /* renamed from: a */
    public static Point m2048a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(blm.m3623a(i, widthAlignment) * widthAlignment, blm.m3623a(i2, heightAlignment) * heightAlignment);
    }

    /* renamed from: a */
    private static boolean m2051a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        Point a = m2048a(videoCapabilities, i, i2);
        int i3 = a.x;
        int i4 = a.y;
        if (d == -1.0d || d <= 0.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d));
    }

    /* renamed from: a */
    public final MediaCodecInfo.CodecProfileLevel[] mo1319a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2331d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.f2331d.profileLevels;
    }

    /* renamed from: a */
    public final boolean mo1317a(akh akh) {
        String f;
        String str = akh.f553f;
        boolean z = false;
        if (!(str == null || this.f2329b == null || (f = bkt.m3520f(str)) == null)) {
            if (!this.f2329b.equals(f)) {
                String str2 = akh.f553f;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + f.length());
                sb.append("codec.mime ");
                sb.append(str2);
                sb.append(", ");
                sb.append(f);
                m2050a(sb.toString());
            } else {
                Pair a = att.m2125a(akh);
                if (a != null) {
                    int intValue = ((Integer) a.first).intValue();
                    int intValue2 = ((Integer) a.second).intValue();
                    if (this.f2335h || intValue == 42) {
                        MediaCodecInfo.CodecProfileLevel[] a2 = mo1319a();
                        int length = a2.length;
                        int i = 0;
                        while (i < length) {
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = a2[i];
                            if (codecProfileLevel.profile != intValue || codecProfileLevel.level < intValue2) {
                                i++;
                            }
                        }
                        String str3 = akh.f553f;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + f.length());
                        sb2.append("codec.profileLevel, ");
                        sb2.append(str3);
                        sb2.append(", ");
                        sb2.append(f);
                        m2050a(sb2.toString());
                    }
                }
            }
            return false;
        }
        if (!this.f2335h) {
            if (blm.f4293a >= 21) {
                int i2 = akh.f570w;
                if (i2 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2331d;
                    if (codecCapabilities == null) {
                        m2050a("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        m2050a("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i2)) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("sampleRate.support, ");
                        sb3.append(i2);
                        m2050a(sb3.toString());
                        return false;
                    }
                }
                int i3 = akh.f569v;
                if (i3 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.f2331d;
                    if (codecCapabilities2 != null) {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            m2050a("channelCount.aCaps");
                        } else {
                            String str4 = this.f2328a;
                            String str5 = this.f2329b;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((blm.f4293a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
                                int i4 = !"audio/ac3".equals(str5) ? !"audio/eac3".equals(str5) ? 30 : 16 : 6;
                                StringBuilder sb4 = new StringBuilder(String.valueOf(str4).length() + 59);
                                sb4.append("AssumedMaxChannelAdjustment: ");
                                sb4.append(str4);
                                sb4.append(", [");
                                sb4.append(maxInputChannelCount);
                                sb4.append(" to ");
                                sb4.append(i4);
                                sb4.append("]");
                                Log.w("MediaCodecInfo", sb4.toString());
                                maxInputChannelCount = i4;
                            }
                            if (maxInputChannelCount < i3) {
                                StringBuilder sb5 = new StringBuilder(33);
                                sb5.append("channelCount.support, ");
                                sb5.append(i3);
                                m2050a(sb5.toString());
                            }
                        }
                    } else {
                        m2050a("channelCount.caps");
                    }
                    return false;
                }
            }
            return true;
        } else if (akh.f561n <= 0 || akh.f562o <= 0) {
            return true;
        } else {
            if (blm.f4293a >= 21) {
                return mo1316a(akh.f561n, akh.f562o, (double) akh.f563p);
            }
            if (akh.f561n * akh.f562o <= att.m2124a()) {
                z = true;
            }
            if (!z) {
                int i5 = akh.f561n;
                int i6 = akh.f562o;
                StringBuilder sb6 = new StringBuilder(40);
                sb6.append("legacyFrameSize, ");
                sb6.append(i5);
                sb6.append("x");
                sb6.append(i6);
                m2050a(sb6.toString());
            }
            return z;
        }
    }

    /* renamed from: b */
    public final boolean mo1320b(akh akh) {
        if (this.f2335h) {
            return this.f2334g;
        }
        Pair a = att.m2125a(akh);
        return a != null && ((Integer) a.first).intValue() == 42;
    }

    /* renamed from: a */
    public final boolean mo1318a(akh akh, akh akh2, boolean z) {
        if (this.f2335h) {
            if (!akh.f556i.equals(akh2.f556i) || akh.f564q != akh2.f564q) {
                return false;
            }
            if (this.f2334g || (akh.f561n == akh2.f561n && akh.f562o == akh2.f562o)) {
                return (!z && akh2.f568u == null) || blm.m3652a(akh.f568u, akh2.f568u);
            }
            return false;
        } else if (!"audio/mp4a-latm".equals(this.f2329b) || !akh.f556i.equals(akh2.f556i) || akh.f569v != akh2.f569v || akh.f570w != akh2.f570w) {
            return false;
        } else {
            Pair a = att.m2125a(akh);
            Pair a2 = att.m2125a(akh2);
            if (!(a == null || a2 == null)) {
                return ((Integer) a.first).intValue() == 42 && ((Integer) a2.first).intValue() == 42;
            }
        }
    }

    /* renamed from: a */
    public final boolean mo1316a(int i, int i2, double d) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.f2331d;
        if (codecCapabilities != null) {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                m2050a("sizeAndRate.vCaps");
                return false;
            } else if (m2051a(videoCapabilities, i, i2, d)) {
                return true;
            } else {
                if (i < i2 && m2051a(videoCapabilities, i2, i, d)) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(d);
                    String sb2 = sb.toString();
                    String str = this.f2328a;
                    String str2 = this.f2329b;
                    String str3 = blm.f4297e;
                    int length = String.valueOf(sb2).length();
                    int length2 = String.valueOf(str).length();
                    StringBuilder sb3 = new StringBuilder(length + 25 + length2 + String.valueOf(str2).length() + String.valueOf(str3).length());
                    sb3.append("AssumedSupport [");
                    sb3.append(sb2);
                    sb3.append("] [");
                    sb3.append(str);
                    sb3.append(", ");
                    sb3.append(str2);
                    sb3.append("] [");
                    sb3.append(str3);
                    sb3.append("]");
                    sb3.toString();
                    return true;
                }
                StringBuilder sb4 = new StringBuilder(69);
                sb4.append("sizeAndRate.support, ");
                sb4.append(i);
                sb4.append("x");
                sb4.append(i2);
                sb4.append("x");
                sb4.append(d);
                m2050a(sb4.toString());
                return false;
            }
        } else {
            m2050a("sizeAndRate.caps");
            return false;
        }
    }

    /* renamed from: a */
    private final void m2050a(String str) {
        String str2 = this.f2328a;
        String str3 = this.f2329b;
        String str4 = blm.f4297e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(str2).length();
        StringBuilder sb = new StringBuilder(length + 20 + length2 + String.valueOf(str3).length() + String.valueOf(str4).length());
        sb.append("NoSupport [");
        sb.append(str);
        sb.append("] [");
        sb.append(str2);
        sb.append(", ");
        sb.append(str3);
        sb.append("] [");
        sb.append(str4);
        sb.append("]");
        sb.toString();
    }

    /* renamed from: a */
    public static atd m2049a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new atd(str, str2, str3, codecCapabilities, false, z, z2);
    }
}
