package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;

/* renamed from: atd  reason: default package */
/* compiled from: PG */
public final class atd {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    private final boolean g;
    private final boolean h;

    public atd(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.a = (String) bks.a((Object) str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.f = z;
        boolean z4 = false;
        this.g = !z2 && codecCapabilities != null && blm.a >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback");
        if (codecCapabilities != null && blm.a >= 21) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z3 || (codecCapabilities != null && blm.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
            z4 = true;
        }
        this.e = z4;
        this.h = bkt.b(str2);
    }

    public final String toString() {
        return this.a;
    }

    public static Point a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        return new Point(blm.a(i, widthAlignment) * widthAlignment, blm.a(i2, heightAlignment) * heightAlignment);
    }

    private static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d2) {
        Point a2 = a(videoCapabilities, i, i2);
        int i3 = a2.x;
        int i4 = a2.y;
        if (d2 == -1.0d || d2 <= 0.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        return videoCapabilities.areSizeAndRateSupported(i3, i4, Math.floor(d2));
    }

    public final MediaCodecInfo.CodecProfileLevel[] a() {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        return (codecCapabilities == null || codecCapabilities.profileLevels == null) ? new MediaCodecInfo.CodecProfileLevel[0] : this.d.profileLevels;
    }

    public final boolean a(akh akh) {
        String f2;
        String str = akh.f;
        boolean z = false;
        if (!(str == null || this.b == null || (f2 = bkt.f(str)) == null)) {
            if (!this.b.equals(f2)) {
                String str2 = akh.f;
                StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 13 + f2.length());
                sb.append("codec.mime ");
                sb.append(str2);
                sb.append(", ");
                sb.append(f2);
                a(sb.toString());
            } else {
                Pair a2 = att.a(akh);
                if (a2 != null) {
                    int intValue = ((Integer) a2.first).intValue();
                    int intValue2 = ((Integer) a2.second).intValue();
                    if (this.h || intValue == 42) {
                        MediaCodecInfo.CodecProfileLevel[] a3 = a();
                        int length = a3.length;
                        int i = 0;
                        while (i < length) {
                            MediaCodecInfo.CodecProfileLevel codecProfileLevel = a3[i];
                            if (codecProfileLevel.profile != intValue || codecProfileLevel.level < intValue2) {
                                i++;
                            }
                        }
                        String str3 = akh.f;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str3).length() + 22 + f2.length());
                        sb2.append("codec.profileLevel, ");
                        sb2.append(str3);
                        sb2.append(", ");
                        sb2.append(f2);
                        a(sb2.toString());
                    }
                }
            }
            return false;
        }
        if (!this.h) {
            if (blm.a >= 21) {
                int i2 = akh.w;
                if (i2 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (codecCapabilities == null) {
                        a("sampleRate.caps");
                        return false;
                    }
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a("sampleRate.aCaps");
                        return false;
                    } else if (!audioCapabilities.isSampleRateSupported(i2)) {
                        StringBuilder sb3 = new StringBuilder(31);
                        sb3.append("sampleRate.support, ");
                        sb3.append(i2);
                        a(sb3.toString());
                        return false;
                    }
                }
                int i3 = akh.v;
                if (i3 != -1) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
                    if (codecCapabilities2 != null) {
                        MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities2.getAudioCapabilities();
                        if (audioCapabilities2 == null) {
                            a("channelCount.aCaps");
                        } else {
                            String str4 = this.a;
                            String str5 = this.b;
                            int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                            if (maxInputChannelCount <= 1 && ((blm.a < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str5) && !"audio/3gpp".equals(str5) && !"audio/amr-wb".equals(str5) && !"audio/mp4a-latm".equals(str5) && !"audio/vorbis".equals(str5) && !"audio/opus".equals(str5) && !"audio/raw".equals(str5) && !"audio/flac".equals(str5) && !"audio/g711-alaw".equals(str5) && !"audio/g711-mlaw".equals(str5) && !"audio/gsm".equals(str5))) {
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
                                a(sb5.toString());
                            }
                        }
                    } else {
                        a("channelCount.caps");
                    }
                    return false;
                }
            }
            return true;
        } else if (akh.n <= 0 || akh.o <= 0) {
            return true;
        } else {
            if (blm.a >= 21) {
                return a(akh.n, akh.o, (double) akh.p);
            }
            if (akh.n * akh.o <= att.a()) {
                z = true;
            }
            if (!z) {
                int i5 = akh.n;
                int i6 = akh.o;
                StringBuilder sb6 = new StringBuilder(40);
                sb6.append("legacyFrameSize, ");
                sb6.append(i5);
                sb6.append("x");
                sb6.append(i6);
                a(sb6.toString());
            }
            return z;
        }
    }

    public final boolean b(akh akh) {
        if (this.h) {
            return this.g;
        }
        Pair a2 = att.a(akh);
        return a2 != null && ((Integer) a2.first).intValue() == 42;
    }

    public final boolean a(akh akh, akh akh2, boolean z) {
        if (this.h) {
            if (!akh.i.equals(akh2.i) || akh.q != akh2.q) {
                return false;
            }
            if (this.g || (akh.n == akh2.n && akh.o == akh2.o)) {
                return (!z && akh2.u == null) || blm.a(akh.u, akh2.u);
            }
            return false;
        } else if (!"audio/mp4a-latm".equals(this.b) || !akh.i.equals(akh2.i) || akh.v != akh2.v || akh.w != akh2.w) {
            return false;
        } else {
            Pair a2 = att.a(akh);
            Pair a3 = att.a(akh2);
            if (!(a2 == null || a3 == null)) {
                return ((Integer) a2.first).intValue() == 42 && ((Integer) a3.first).intValue() == 42;
            }
        }
    }

    public final boolean a(int i, int i2, double d2) {
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities != null) {
            MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
            if (videoCapabilities == null) {
                a("sizeAndRate.vCaps");
                return false;
            } else if (a(videoCapabilities, i, i2, d2)) {
                return true;
            } else {
                if (i < i2 && a(videoCapabilities, i2, i, d2)) {
                    StringBuilder sb = new StringBuilder(69);
                    sb.append("sizeAndRate.rotated, ");
                    sb.append(i);
                    sb.append("x");
                    sb.append(i2);
                    sb.append("x");
                    sb.append(d2);
                    String sb2 = sb.toString();
                    String str = this.a;
                    String str2 = this.b;
                    String str3 = blm.e;
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
                sb4.append(d2);
                a(sb4.toString());
                return false;
            }
        } else {
            a("sizeAndRate.caps");
            return false;
        }
    }

    private final void a(String str) {
        String str2 = this.a;
        String str3 = this.b;
        String str4 = blm.e;
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

    public static atd a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        return new atd(str, str2, str3, codecCapabilities, false, z, z2);
    }
}
