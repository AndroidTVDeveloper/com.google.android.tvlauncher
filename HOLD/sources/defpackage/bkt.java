package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;

/* renamed from: bkt  reason: default package */
/* compiled from: PG */
public final class bkt {
    private static final ArrayList a = new ArrayList();

    public static String a(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case 96:
            case 97:
            case 98:
            case 99:
            case 100:
            case 101:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static int h(String str) {
        char c;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                return 5;
            case 1:
                return 6;
            case 2:
                return 18;
            case 3:
                return 17;
            case 4:
                return 7;
            case 5:
                return 8;
            case 6:
                return 14;
            default:
                return 0;
        }
    }

    public static String e(String str) {
        if (str != null) {
            for (String f : blm.h(str)) {
                String f2 = f(f);
                if (f2 != null && a(f2)) {
                    return f2;
                }
            }
        }
        return null;
    }

    public static String f(String str) {
        String str2 = null;
        if (str == null) {
            return null;
        }
        String d = blm.d(str.trim());
        if (d.startsWith("avc1") || d.startsWith("avc3")) {
            return "video/avc";
        }
        if (d.startsWith("hev1") || d.startsWith("hvc1")) {
            return "video/hevc";
        }
        if (d.startsWith("dvav") || d.startsWith("dva1") || d.startsWith("dvhe") || d.startsWith("dvh1")) {
            return "video/dolby-vision";
        }
        if (d.startsWith("av01")) {
            return "video/av01";
        }
        if (d.startsWith("vp9") || d.startsWith("vp09")) {
            return "video/x-vnd.on2.vp9";
        }
        if (d.startsWith("vp8") || d.startsWith("vp08")) {
            return "video/x-vnd.on2.vp8";
        }
        if (d.startsWith("mp4a")) {
            if (d.startsWith("mp4a.")) {
                String substring = d.substring(5);
                if (substring.length() >= 2) {
                    try {
                        str2 = a(Integer.parseInt(blm.e(substring.substring(0, 2)), 16));
                    } catch (NumberFormatException e) {
                    }
                }
            }
            return str2 == null ? "audio/mp4a-latm" : str2;
        } else if (d.startsWith("ac-3") || d.startsWith("dac3")) {
            return "audio/ac3";
        } else {
            if (d.startsWith("ec-3") || d.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (d.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (d.startsWith("ac-4") || d.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (d.startsWith("dtsc") || d.startsWith("dtse")) {
                return "audio/vnd.dts";
            }
            if (d.startsWith("dtsh") || d.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (d.startsWith("opus")) {
                return "audio/opus";
            }
            if (d.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (d.startsWith("flac")) {
                return "audio/flac";
            }
            int size = a.size();
            for (int i = 0; i < size; i++) {
                bks bks = (bks) a.get(i);
                if (d.startsWith(null)) {
                    break;
                }
            }
            return null;
        }
    }

    private static String i(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static int g(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (a(str)) {
            return 1;
        }
        if (b(str)) {
            return 2;
        }
        if (c(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str)) {
            return 3;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str)) {
            return 4;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 5;
        }
        int size = a.size();
        for (int i = 0; i < size; i++) {
            bks bks = (bks) a.get(i);
            if (str.equals(null)) {
                return 0;
            }
        }
        return -1;
    }

    public static String d(String str) {
        if (str != null) {
            for (String f : blm.h(str)) {
                String f2 = f(f);
                if (f2 != null && b(f2)) {
                    return f2;
                }
            }
        }
        return null;
    }

    public static boolean a(String str) {
        return "audio".equals(i(str));
    }

    public static boolean c(String str) {
        return "text".equals(i(str));
    }

    public static boolean b(String str) {
        return "video".equals(i(str));
    }
}
