package defpackage;

import android.media.MediaCodecInfo;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: att  reason: default package */
/* compiled from: PG */
public final class att {
    public static /* synthetic */ int a;
    private static final Pattern b = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap c = new HashMap();
    private static final SparseIntArray d;
    private static final SparseIntArray e;
    private static final SparseIntArray f;
    private static final SparseIntArray g;
    private static final Map h;
    private static final Map i;
    private static final Map j;
    private static final SparseIntArray k;
    private static final SparseIntArray l;
    private static int m = -1;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        d = sparseIntArray;
        sparseIntArray.put(66, 1);
        d.put(77, 2);
        d.put(88, 4);
        d.put(100, 8);
        d.put(110, 16);
        d.put(122, 32);
        d.put(244, 64);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        e = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        e.put(11, 4);
        e.put(12, 8);
        e.put(13, 16);
        e.put(20, 32);
        e.put(21, 64);
        e.put(22, 128);
        e.put(30, 256);
        e.put(31, 512);
        e.put(32, 1024);
        e.put(40, 2048);
        e.put(41, 4096);
        e.put(42, 8192);
        e.put(50, 16384);
        e.put(51, 32768);
        e.put(52, 65536);
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        f = sparseIntArray3;
        sparseIntArray3.put(0, 1);
        f.put(1, 2);
        f.put(2, 4);
        f.put(3, 8);
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        g = sparseIntArray4;
        sparseIntArray4.put(10, 1);
        g.put(11, 2);
        g.put(20, 4);
        g.put(21, 8);
        g.put(30, 16);
        g.put(31, 32);
        g.put(40, 64);
        g.put(41, 128);
        g.put(50, 256);
        g.put(51, 512);
        g.put(60, 2048);
        g.put(61, 4096);
        g.put(62, 8192);
        HashMap hashMap = new HashMap();
        h = hashMap;
        hashMap.put("L30", 1);
        h.put("L60", 4);
        h.put("L63", 16);
        h.put("L90", 64);
        h.put("L93", 256);
        h.put("L120", 1024);
        h.put("L123", 4096);
        h.put("L150", 16384);
        h.put("L153", 65536);
        h.put("L156", 262144);
        h.put("L180", 1048576);
        h.put("L183", 4194304);
        h.put("L186", 16777216);
        h.put("H30", 2);
        h.put("H60", 8);
        h.put("H63", 32);
        h.put("H90", 128);
        h.put("H93", 512);
        h.put("H120", 2048);
        h.put("H123", 8192);
        h.put("H150", 32768);
        h.put("H153", 131072);
        h.put("H156", 524288);
        h.put("H180", 2097152);
        h.put("H183", 8388608);
        h.put("H186", 33554432);
        HashMap hashMap2 = new HashMap();
        i = hashMap2;
        hashMap2.put("00", 1);
        i.put("01", 2);
        i.put("02", 4);
        i.put("03", 8);
        i.put("04", 16);
        i.put("05", 32);
        i.put("06", 64);
        i.put("07", 128);
        i.put("08", 256);
        i.put("09", 512);
        HashMap hashMap3 = new HashMap();
        j = hashMap3;
        hashMap3.put("01", 1);
        j.put("02", 2);
        j.put("03", 4);
        j.put("04", 8);
        j.put("05", 16);
        j.put("06", 32);
        j.put("07", 64);
        j.put("08", 128);
        j.put("09", 256);
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        k = sparseIntArray5;
        sparseIntArray5.put(0, 1);
        k.put(1, 2);
        k.put(2, 4);
        k.put(3, 8);
        k.put(4, 16);
        k.put(5, 32);
        k.put(6, 64);
        k.put(7, 128);
        k.put(8, 256);
        k.put(9, 512);
        k.put(10, 1024);
        k.put(11, 2048);
        k.put(12, 4096);
        k.put(13, 8192);
        k.put(14, 16384);
        k.put(15, 32768);
        k.put(16, 65536);
        k.put(17, 131072);
        k.put(18, 262144);
        k.put(19, 524288);
        k.put(20, 1048576);
        k.put(21, 2097152);
        k.put(22, 4194304);
        k.put(23, 8388608);
        SparseIntArray sparseIntArray6 = new SparseIntArray();
        l = sparseIntArray6;
        sparseIntArray6.put(1, 1);
        l.put(2, 2);
        l.put(3, 3);
        l.put(4, 4);
        l.put(5, 5);
        l.put(6, 6);
        l.put(17, 17);
        l.put(20, 20);
        l.put(23, 23);
        l.put(29, 29);
        l.put(39, 39);
        l.put(42, 42);
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    public static Pair a(akh akh) {
        char c2;
        int i2;
        int i3;
        int i4;
        int i5;
        akh akh2 = akh;
        String str = akh2.f;
        if (str == null) {
            return null;
        }
        String[] split = str.split("\\.");
        int i6 = 2;
        if ("video/dolby-vision".equals(akh2.i)) {
            String str2 = akh2.f;
            if (split.length >= 3) {
                Matcher matcher = b.matcher(split[1]);
                if (!matcher.matches()) {
                    String valueOf = String.valueOf(str2);
                    Log.w("MediaCodecUtil", valueOf.length() == 0 ? new String("Ignoring malformed Dolby Vision codec string: ") : "Ignoring malformed Dolby Vision codec string: ".concat(valueOf));
                } else {
                    String group = matcher.group(1);
                    Integer num = (Integer) i.get(group);
                    if (num == null) {
                        String valueOf2 = String.valueOf(group);
                        Log.w("MediaCodecUtil", valueOf2.length() == 0 ? new String("Unknown Dolby Vision profile string: ") : "Unknown Dolby Vision profile string: ".concat(valueOf2));
                        return null;
                    }
                    String str3 = split[2];
                    Integer num2 = (Integer) j.get(str3);
                    if (num2 != null) {
                        return new Pair(num, num2);
                    }
                    String valueOf3 = String.valueOf(str3);
                    Log.w("MediaCodecUtil", valueOf3.length() == 0 ? new String("Unknown Dolby Vision level string: ") : "Unknown Dolby Vision level string: ".concat(valueOf3));
                    return null;
                }
            } else {
                String valueOf4 = String.valueOf(str2);
                Log.w("MediaCodecUtil", valueOf4.length() == 0 ? new String("Ignoring malformed Dolby Vision codec string: ") : "Ignoring malformed Dolby Vision codec string: ".concat(valueOf4));
            }
            return null;
        }
        String str4 = split[0];
        switch (str4.hashCode()) {
            case 3004662:
                if (str4.equals("av01")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3006243:
                if (str4.equals("avc1")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 3006244:
                if (str4.equals("avc2")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 3199032:
                if (str4.equals("hev1")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3214780:
                if (str4.equals("hvc1")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3356560:
                if (str4.equals("mp4a")) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3624515:
                if (str4.equals("vp09")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 1:
                String str5 = akh2.f;
                int length = split.length;
                if (length < 2) {
                    String valueOf5 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", valueOf5.length() == 0 ? new String("Ignoring malformed AVC codec string: ") : "Ignoring malformed AVC codec string: ".concat(valueOf5));
                    return null;
                }
                try {
                    if (split[1].length() == 6) {
                        i3 = Integer.parseInt(split[1].substring(0, 2), 16);
                        i2 = Integer.parseInt(split[1].substring(4), 16);
                    } else if (length < 3) {
                        String valueOf6 = String.valueOf(str5);
                        Log.w("MediaCodecUtil", valueOf6.length() == 0 ? new String("Ignoring malformed AVC codec string: ") : "Ignoring malformed AVC codec string: ".concat(valueOf6));
                        return null;
                    } else {
                        i3 = Integer.parseInt(split[1]);
                        i2 = Integer.parseInt(split[2]);
                    }
                    int i7 = d.get(i3, -1);
                    if (i7 == -1) {
                        StringBuilder sb = new StringBuilder(32);
                        sb.append("Unknown AVC profile: ");
                        sb.append(i3);
                        Log.w("MediaCodecUtil", sb.toString());
                        return null;
                    }
                    int i8 = e.get(i2, -1);
                    if (i8 != -1) {
                        return new Pair(Integer.valueOf(i7), Integer.valueOf(i8));
                    }
                    StringBuilder sb2 = new StringBuilder(30);
                    sb2.append("Unknown AVC level: ");
                    sb2.append(i2);
                    Log.w("MediaCodecUtil", sb2.toString());
                    return null;
                } catch (NumberFormatException e2) {
                    String valueOf7 = String.valueOf(str5);
                    Log.w("MediaCodecUtil", valueOf7.length() == 0 ? new String("Ignoring malformed AVC codec string: ") : "Ignoring malformed AVC codec string: ".concat(valueOf7));
                    return null;
                }
            case 2:
                String str6 = akh2.f;
                if (split.length < 3) {
                    String valueOf8 = String.valueOf(str6);
                    Log.w("MediaCodecUtil", valueOf8.length() == 0 ? new String("Ignoring malformed VP9 codec string: ") : "Ignoring malformed VP9 codec string: ".concat(valueOf8));
                    return null;
                }
                try {
                    int parseInt = Integer.parseInt(split[1]);
                    int parseInt2 = Integer.parseInt(split[2]);
                    int i9 = f.get(parseInt, -1);
                    if (i9 == -1) {
                        StringBuilder sb3 = new StringBuilder(32);
                        sb3.append("Unknown VP9 profile: ");
                        sb3.append(parseInt);
                        Log.w("MediaCodecUtil", sb3.toString());
                        return null;
                    }
                    int i10 = g.get(parseInt2, -1);
                    if (i10 != -1) {
                        return new Pair(Integer.valueOf(i9), Integer.valueOf(i10));
                    }
                    StringBuilder sb4 = new StringBuilder(30);
                    sb4.append("Unknown VP9 level: ");
                    sb4.append(parseInt2);
                    Log.w("MediaCodecUtil", sb4.toString());
                    return null;
                } catch (NumberFormatException e3) {
                    String valueOf9 = String.valueOf(str6);
                    Log.w("MediaCodecUtil", valueOf9.length() == 0 ? new String("Ignoring malformed VP9 codec string: ") : "Ignoring malformed VP9 codec string: ".concat(valueOf9));
                    return null;
                }
            case 3:
            case 4:
                String str7 = akh2.f;
                if (split.length >= 4) {
                    Matcher matcher2 = b.matcher(split[1]);
                    if (!matcher2.matches()) {
                        String valueOf10 = String.valueOf(str7);
                        Log.w("MediaCodecUtil", valueOf10.length() == 0 ? new String("Ignoring malformed HEVC codec string: ") : "Ignoring malformed HEVC codec string: ".concat(valueOf10));
                    } else {
                        String group2 = matcher2.group(1);
                        if ("1".equals(group2)) {
                            i6 = 1;
                        } else if (!"2".equals(group2)) {
                            String valueOf11 = String.valueOf(group2);
                            Log.w("MediaCodecUtil", valueOf11.length() == 0 ? new String("Unknown HEVC profile string: ") : "Unknown HEVC profile string: ".concat(valueOf11));
                            return null;
                        }
                        String str8 = split[3];
                        Integer num3 = (Integer) h.get(str8);
                        if (num3 != null) {
                            return new Pair(Integer.valueOf(i6), num3);
                        }
                        String valueOf12 = String.valueOf(str8);
                        Log.w("MediaCodecUtil", valueOf12.length() == 0 ? new String("Unknown HEVC level string: ") : "Unknown HEVC level string: ".concat(valueOf12));
                        return null;
                    }
                } else {
                    String valueOf13 = String.valueOf(str7);
                    Log.w("MediaCodecUtil", valueOf13.length() == 0 ? new String("Ignoring malformed HEVC codec string: ") : "Ignoring malformed HEVC codec string: ".concat(valueOf13));
                }
                return null;
            case 5:
                String str9 = akh2.f;
                blp blp = akh2.u;
                if (split.length < 4) {
                    String valueOf14 = String.valueOf(str9);
                    Log.w("MediaCodecUtil", valueOf14.length() == 0 ? new String("Ignoring malformed AV1 codec string: ") : "Ignoring malformed AV1 codec string: ".concat(valueOf14));
                    return null;
                }
                try {
                    int parseInt3 = Integer.parseInt(split[1]);
                    int parseInt4 = Integer.parseInt(split[2].substring(0, 2));
                    int parseInt5 = Integer.parseInt(split[3]);
                    if (parseInt3 != 0) {
                        StringBuilder sb5 = new StringBuilder(32);
                        sb5.append("Unknown AV1 profile: ");
                        sb5.append(parseInt3);
                        Log.w("MediaCodecUtil", sb5.toString());
                        return null;
                    }
                    int i11 = 4096;
                    if (parseInt5 == 8) {
                        i11 = 1;
                    } else if (parseInt5 != 10) {
                        StringBuilder sb6 = new StringBuilder(34);
                        sb6.append("Unknown AV1 bit depth: ");
                        sb6.append(parseInt5);
                        Log.w("MediaCodecUtil", sb6.toString());
                        return null;
                    } else if (blp == null || !(blp.d != null || (i4 = blp.c) == 7 || i4 == 6)) {
                        i11 = 2;
                    }
                    int i12 = k.get(parseInt4, -1);
                    if (i12 != -1) {
                        return new Pair(Integer.valueOf(i11), Integer.valueOf(i12));
                    }
                    StringBuilder sb7 = new StringBuilder(30);
                    sb7.append("Unknown AV1 level: ");
                    sb7.append(parseInt4);
                    Log.w("MediaCodecUtil", sb7.toString());
                    return null;
                } catch (NumberFormatException e4) {
                    String valueOf15 = String.valueOf(str9);
                    Log.w("MediaCodecUtil", valueOf15.length() == 0 ? new String("Ignoring malformed AV1 codec string: ") : "Ignoring malformed AV1 codec string: ".concat(valueOf15));
                    return null;
                }
            case 6:
                String str10 = akh2.f;
                if (split.length != 3) {
                    String valueOf16 = String.valueOf(str10);
                    Log.w("MediaCodecUtil", valueOf16.length() == 0 ? new String("Ignoring malformed MP4A codec string: ") : "Ignoring malformed MP4A codec string: ".concat(valueOf16));
                } else {
                    try {
                        if ("audio/mp4a-latm".equals(bkt.a(Integer.parseInt(split[1], 16))) && (i5 = l.get(Integer.parseInt(split[2]), -1)) != -1) {
                            return new Pair(Integer.valueOf(i5), 0);
                        }
                    } catch (NumberFormatException e5) {
                        String valueOf17 = String.valueOf(str10);
                        Log.w("MediaCodecUtil", valueOf17.length() == 0 ? new String("Ignoring malformed MP4A codec string: ") : "Ignoring malformed MP4A codec string: ".concat(valueOf17));
                        return null;
                    }
                }
                return null;
            default:
                return null;
        }
    }

    public static atd a(String str) {
        List a2 = a(str, false, false);
        if (!a2.isEmpty()) {
            return (atd) a2.get(0);
        }
        return null;
    }

    public static synchronized List a(String str, boolean z, boolean z2) {
        atp atp;
        synchronized (att.class) {
            atn atn = new atn(str, z, z2);
            List list = (List) c.get(atn);
            if (list != null) {
                return list;
            }
            if (blm.a < 21) {
                atp = new atq((byte) 0);
            } else {
                atp = new atr(z, z2);
            }
            ArrayList a2 = a(atn, atp);
            if (z && a2.isEmpty() && blm.a >= 21 && blm.a <= 23) {
                a2 = a(atn, new atq((byte) 0));
                if (!a2.isEmpty()) {
                    String str2 = ((atd) a2.get(0)).a;
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            if ("audio/raw".equals(str)) {
                if (blm.a < 26 && blm.b.equals("R9") && a2.size() == 1 && ((atd) a2.get(0)).a.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    a2.add(atd.a("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, false));
                }
                a(a2, atk.a);
            } else if (blm.a < 21 && a2.size() > 1) {
                String str3 = ((atd) a2.get(0)).a;
                if ("OMX.SEC.mp3.dec".equals(str3) || "OMX.SEC.MP3.Decoder".equals(str3) || "OMX.brcm.audio.mp3.decoder".equals(str3)) {
                    a(a2, atl.a);
                }
            }
            List unmodifiableList = Collections.unmodifiableList(a2);
            c.put(atn, unmodifiableList);
            return unmodifiableList;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:106:0x01c4, code lost:
        if ("SCV31".equals(defpackage.blm.b) != false) goto L_0x002a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0033, code lost:
        if (r10.endsWith(".secure") == false) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x020c, code lost:
        if (defpackage.blm.b.startsWith("t0") != false) goto L_0x002a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:168:0x0299 A[SYNTHETIC, Splitter:B:168:0x0299] */
    /* JADX WARNING: Removed duplicated region for block: B:214:0x033a A[Catch:{ Exception -> 0x0378 }] */
    /* JADX WARNING: Removed duplicated region for block: B:222:0x0358 A[Catch:{ Exception -> 0x0356 }] */
    /* JADX WARNING: Removed duplicated region for block: B:236:0x0389 A[SYNTHETIC, Splitter:B:236:0x0389] */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:252:0x03b8 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.ArrayList a(defpackage.atn r19, defpackage.atp r20) {
        /*
            r1 = r19
            r2 = r20
            java.lang.String r3 = "secure-playback"
            java.lang.String r4 = "tunneled-playback"
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x03f7 }
            r5.<init>()     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r12 = r1.a     // Catch:{ Exception -> 0x03f7 }
            int r13 = r20.a()     // Catch:{ Exception -> 0x03f7 }
            boolean r14 = r20.b()     // Catch:{ Exception -> 0x03f7 }
            r11 = 0
        L_0x0018:
            if (r11 >= r13) goto L_0x03f6
            android.media.MediaCodecInfo r0 = r2.a(r11)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r10 = r0.getName()     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r0.isEncoder()     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r7 = ".secure"
            if (r6 == 0) goto L_0x002d
        L_0x002a:
            r15 = 0
            goto L_0x0297
        L_0x002d:
            if (r14 != 0) goto L_0x0035
            boolean r6 = r10.endsWith(r7)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
        L_0x0035:
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x03f7 }
            r9 = 21
            if (r6 >= r9) goto L_0x006b
            java.lang.String r6 = "CIPAACDecoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "CIPMP3Decoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "CIPVorbisDecoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "CIPAMRNBDecoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "AACDecoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "MP3Decoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
        L_0x006b:
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x03f7 }
            r9 = 18
            if (r6 >= r9) goto L_0x0097
            java.lang.String r6 = "OMX.MTK.AUDIO.DECODER.AAC"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x0097
            java.lang.String r6 = "a70"
            java.lang.String r9 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r9)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "Xiaomi"
            java.lang.String r9 = defpackage.blm.c     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r9)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x0097
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r9 = "HM"
            boolean r6 = r6.startsWith(r9)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
        L_0x0097:
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x03f7 }
            r9 = 16
            if (r6 != r9) goto L_0x011d
            java.lang.String r6 = "OMX.qcom.audio.decoder.mp3"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x011d
            java.lang.String r6 = "dlxu"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "protou"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "ville"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "villeplus"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "villec2"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r8 = "gee"
            boolean r6 = r6.startsWith(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "C6602"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "C6603"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "C6606"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "C6616"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "L36h"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "SO-02E"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
        L_0x011d:
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x03f7 }
            if (r6 != r9) goto L_0x0154
            java.lang.String r6 = "OMX.qcom.audio.decoder.aac"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x0154
            java.lang.String r6 = "C1504"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "C1505"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "C1604"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "C1605"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x0152
            goto L_0x0154
        L_0x0152:
            goto L_0x002a
        L_0x0154:
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x03f7 }
            r8 = 24
            java.lang.String r9 = "samsung"
            if (r6 >= r8) goto L_0x01c6
            java.lang.String r6 = "OMX.SEC.aac.dec"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x0165
        L_0x0164:
            goto L_0x016e
        L_0x0165:
            java.lang.String r6 = "OMX.Exynos.AAC.Decoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x01c6
            goto L_0x0164
        L_0x016e:
            java.lang.String r6 = defpackage.blm.c     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r9.equals(r6)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x01c6
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r8 = "zeroflte"
            boolean r6 = r6.startsWith(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r8 = "zerolte"
            boolean r6 = r6.startsWith(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r8 = "zenlte"
            boolean r6 = r6.startsWith(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "SC-05G"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "marinelteatt"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "404SC"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "SC-04G"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = "SCV31"
            java.lang.String r8 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
        L_0x01c6:
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r8 = "jflte"
            r15 = 19
            if (r6 > r15) goto L_0x020e
            java.lang.String r6 = "OMX.SEC.vp8.dec"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x020e
            java.lang.String r6 = defpackage.blm.c     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r9.equals(r6)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x020e
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r9 = "d2"
            boolean r6 = r6.startsWith(r9)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r9 = "serrano"
            boolean r6 = r6.startsWith(r9)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.startsWith(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r9 = "santos"
            boolean r6 = r6.startsWith(r9)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r9 = "t0"
            boolean r6 = r6.startsWith(r9)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
        L_0x020e:
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x03f7 }
            if (r6 > r15) goto L_0x0222
            java.lang.String r6 = defpackage.blm.b     // Catch:{ Exception -> 0x03f7 }
            boolean r6 = r6.startsWith(r8)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x0222
            java.lang.String r6 = "OMX.qcom.video.decoder.vp8"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x002a
        L_0x0222:
            java.lang.String r6 = "audio/eac3-joc"
            boolean r6 = r6.equals(r12)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x0235
            java.lang.String r6 = "OMX.MTK.AUDIO.DECODER.DSPAC3"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x0233
            goto L_0x0235
        L_0x0233:
            goto L_0x002a
        L_0x0235:
            java.lang.String[] r6 = r0.getSupportedTypes()     // Catch:{ Exception -> 0x03f7 }
            int r8 = r6.length     // Catch:{ Exception -> 0x03f7 }
            r9 = 0
        L_0x023b:
            if (r9 >= r8) goto L_0x0249
            r15 = r6[r9]     // Catch:{ Exception -> 0x03f7 }
            boolean r17 = r15.equalsIgnoreCase(r12)     // Catch:{ Exception -> 0x03f7 }
            if (r17 != 0) goto L_0x0248
            int r9 = r9 + 1
            goto L_0x023b
        L_0x0248:
            goto L_0x0297
        L_0x0249:
            java.lang.String r6 = "video/dolby-vision"
            boolean r6 = r12.equals(r6)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x0279
            java.lang.String r6 = "audio/alac"
            boolean r6 = r12.equals(r6)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x0266
            java.lang.String r6 = "OMX.lge.alac.decoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x0262
            goto L_0x0266
        L_0x0262:
            java.lang.String r6 = "audio/x-lg-alac"
        L_0x0264:
            r15 = r6
            goto L_0x0297
        L_0x0266:
            java.lang.String r6 = "audio/flac"
            boolean r6 = r12.equals(r6)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x002a
            java.lang.String r6 = "OMX.lge.flac.decoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x002a
            java.lang.String r6 = "audio/x-lg-flac"
            goto L_0x0264
        L_0x0279:
            java.lang.String r6 = "OMX.MS.HEVCDV.Decoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x0294
            java.lang.String r6 = "OMX.RTK.video.decoder"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 != 0) goto L_0x0291
            java.lang.String r6 = "OMX.realtek.video.decoder.tunneled"
            boolean r6 = r6.equals(r10)     // Catch:{ Exception -> 0x03f7 }
            if (r6 == 0) goto L_0x0233
        L_0x0291:
            java.lang.String r6 = "video/dv_hevc"
            goto L_0x0296
        L_0x0294:
            java.lang.String r6 = "video/hevcdv"
        L_0x0296:
            r15 = r6
        L_0x0297:
            if (r15 == 0) goto L_0x03ec
            android.media.MediaCodecInfo$CodecCapabilities r9 = r0.getCapabilitiesForType(r15)     // Catch:{ Exception -> 0x037a }
            boolean r6 = r2.a(r4, r15, r9)     // Catch:{ Exception -> 0x037a }
            boolean r8 = r2.a(r4, r9)     // Catch:{ Exception -> 0x037a }
            r16 = r4
            boolean r4 = r1.c     // Catch:{ Exception -> 0x0378 }
            if (r4 == 0) goto L_0x02b2
            if (r6 == 0) goto L_0x02ae
            goto L_0x02b4
        L_0x02ae:
            r18 = r11
            goto L_0x03f0
        L_0x02b2:
            if (r8 != 0) goto L_0x0374
        L_0x02b4:
            boolean r4 = r2.a(r3, r15, r9)     // Catch:{ Exception -> 0x0378 }
            boolean r6 = r2.a(r3, r9)     // Catch:{ Exception -> 0x0378 }
            boolean r8 = r1.b     // Catch:{ Exception -> 0x0378 }
            if (r8 == 0) goto L_0x02c7
            if (r4 != 0) goto L_0x02cd
            r18 = r11
            goto L_0x03f0
        L_0x02c7:
            if (r6 == 0) goto L_0x02cd
            r18 = r11
            goto L_0x03f0
        L_0x02cd:
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x0378 }
            r8 = 29
            if (r6 < r8) goto L_0x02d7
            r0.isHardwareAccelerated()     // Catch:{ Exception -> 0x0378 }
            goto L_0x02da
        L_0x02d7:
            a(r0)     // Catch:{ Exception -> 0x0378 }
        L_0x02da:
            a(r0)     // Catch:{ Exception -> 0x0378 }
            int r6 = defpackage.blm.a     // Catch:{ Exception -> 0x0378 }
            if (r6 >= r8) goto L_0x02ff
            java.lang.String r0 = r0.getName()     // Catch:{ Exception -> 0x0378 }
            java.lang.String r0 = defpackage.blm.d(r0)     // Catch:{ Exception -> 0x0378 }
            java.lang.String r6 = "omx.google."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0378 }
            if (r6 != 0) goto L_0x0302
            java.lang.String r6 = "c2.android."
            boolean r6 = r0.startsWith(r6)     // Catch:{ Exception -> 0x0378 }
            if (r6 != 0) goto L_0x0302
            java.lang.String r6 = "c2.google."
            r0.startsWith(r6)     // Catch:{ Exception -> 0x0378 }
            goto L_0x0302
        L_0x02ff:
            r0.isVendor()     // Catch:{ Exception -> 0x0378 }
        L_0x0302:
            int r0 = defpackage.blm.a     // Catch:{ Exception -> 0x0378 }
            r6 = 22
            r8 = 1
            if (r0 > r6) goto L_0x0331
            java.lang.String r0 = "ODROID-XU3"
            java.lang.String r6 = defpackage.blm.d     // Catch:{ Exception -> 0x0378 }
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x0378 }
            if (r0 != 0) goto L_0x031d
            java.lang.String r0 = "Nexus 10"
            java.lang.String r6 = defpackage.blm.d     // Catch:{ Exception -> 0x0378 }
            boolean r0 = r0.equals(r6)     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x0331
        L_0x031d:
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0378 }
            if (r0 != 0) goto L_0x032f
            java.lang.String r0 = "OMX.Exynos.AVC.Decoder.secure"
            boolean r0 = r0.equals(r10)     // Catch:{ Exception -> 0x0378 }
            if (r0 == 0) goto L_0x032e
            goto L_0x032f
        L_0x032e:
            goto L_0x0331
        L_0x032f:
            r0 = 1
            goto L_0x0332
        L_0x0331:
            r0 = 0
        L_0x0332:
            if (r14 == 0) goto L_0x0338
            boolean r6 = r1.b     // Catch:{ Exception -> 0x0378 }
            if (r6 == r4) goto L_0x0343
        L_0x0338:
            if (r14 != 0) goto L_0x0358
            boolean r6 = r1.b     // Catch:{ Exception -> 0x0378 }
            if (r6 == 0) goto L_0x0343
            r17 = r10
            r18 = r11
            goto L_0x035c
        L_0x0343:
            r4 = 0
            r6 = r10
            r7 = r12
            r8 = r15
            r17 = r10
            r10 = r0
            r18 = r11
            r11 = r4
            atd r0 = defpackage.atd.a(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0356 }
            r5.add(r0)     // Catch:{ Exception -> 0x0356 }
            goto L_0x03f0
        L_0x0356:
            r0 = move-exception
            goto L_0x0381
        L_0x0358:
            r17 = r10
            r18 = r11
        L_0x035c:
            if (r14 != 0) goto L_0x03f0
            if (r4 == 0) goto L_0x03f0
            java.lang.String r4 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x0356 }
            java.lang.String r6 = r4.concat(r7)     // Catch:{ Exception -> 0x0356 }
            r11 = 1
            r7 = r12
            r8 = r15
            r10 = r0
            atd r0 = defpackage.atd.a(r6, r7, r8, r9, r10, r11)     // Catch:{ Exception -> 0x0356 }
            r5.add(r0)     // Catch:{ Exception -> 0x0356 }
            return r5
        L_0x0374:
            r18 = r11
            goto L_0x03f0
        L_0x0378:
            r0 = move-exception
            goto L_0x037d
        L_0x037a:
            r0 = move-exception
            r16 = r4
        L_0x037d:
            r17 = r10
            r18 = r11
        L_0x0381:
            int r4 = defpackage.blm.a     // Catch:{ Exception -> 0x03f7 }
            r6 = 23
            java.lang.String r7 = "MediaCodecUtil"
            if (r4 > r6) goto L_0x03b8
            boolean r4 = r5.isEmpty()     // Catch:{ Exception -> 0x03f7 }
            if (r4 != 0) goto L_0x03b5
            java.lang.String r0 = java.lang.String.valueOf(r17)     // Catch:{ Exception -> 0x03f7 }
            int r0 = r0.length()     // Catch:{ Exception -> 0x03f7 }
            int r0 = r0 + 46
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f7 }
            r4.<init>(r0)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r0 = "Skipping codec "
            r4.append(r0)     // Catch:{ Exception -> 0x03f7 }
            r6 = r17
            r4.append(r6)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r0 = " (failed to query capabilities)"
            r4.append(r0)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r0 = r4.toString()     // Catch:{ Exception -> 0x03f7 }
            android.util.Log.e(r7, r0)     // Catch:{ Exception -> 0x03f7 }
            goto L_0x03f0
        L_0x03b5:
            r6 = r17
            goto L_0x03ba
        L_0x03b8:
            r6 = r17
        L_0x03ba:
            java.lang.String r1 = java.lang.String.valueOf(r6)     // Catch:{ Exception -> 0x03f7 }
            int r1 = r1.length()     // Catch:{ Exception -> 0x03f7 }
            int r1 = r1 + 25
            int r2 = r15.length()     // Catch:{ Exception -> 0x03f7 }
            int r1 = r1 + r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x03f7 }
            r2.<init>(r1)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r1 = "Failed to query codec "
            r2.append(r1)     // Catch:{ Exception -> 0x03f7 }
            r2.append(r6)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r1 = " ("
            r2.append(r1)     // Catch:{ Exception -> 0x03f7 }
            r2.append(r15)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r1 = ")"
            r2.append(r1)     // Catch:{ Exception -> 0x03f7 }
            java.lang.String r1 = r2.toString()     // Catch:{ Exception -> 0x03f7 }
            android.util.Log.e(r7, r1)     // Catch:{ Exception -> 0x03f7 }
            throw r0     // Catch:{ Exception -> 0x03f7 }
        L_0x03ec:
            r16 = r4
            r18 = r11
        L_0x03f0:
            int r11 = r18 + 1
            r4 = r16
            goto L_0x0018
        L_0x03f6:
            return r5
        L_0x03f7:
            r0 = move-exception
            ato r1 = new ato
            r1.<init>(r0)
            goto L_0x03ff
        L_0x03fe:
            throw r1
        L_0x03ff:
            goto L_0x03fe
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.att.a(atn, atp):java.util.ArrayList");
    }

    public static List a(List list, akh akh) {
        ArrayList arrayList = new ArrayList(list);
        a(arrayList, new atj(akh));
        return arrayList;
    }

    private static void a(MediaCodecInfo mediaCodecInfo) {
        if (blm.a < 29) {
            String d2 = blm.d(mediaCodecInfo.getName());
            if (!d2.startsWith("arc.") && !d2.startsWith("omx.google.") && !d2.startsWith("omx.ffmpeg.")) {
                if ((!d2.startsWith("omx.sec.") || !d2.contains(".sw.")) && !d2.equals("omx.qcom.video.decoder.hevcswvdec") && !d2.startsWith("c2.android.") && !d2.startsWith("c2.google.") && !d2.startsWith("omx.") && d2.startsWith("c2.")) {
                }
                return;
            }
            return;
        }
        mediaCodecInfo.isSoftwareOnly();
    }

    public static int a() {
        int i2;
        int i3;
        if (m == -1) {
            atd a2 = a("video/avc");
            int i4 = 0;
            if (a2 != null) {
                MediaCodecInfo.CodecProfileLevel[] a3 = a2.a();
                int length = a3.length;
                int i5 = 0;
                while (i4 < length) {
                    int i6 = a3[i4].level;
                    if (i6 == 1 || i6 == 2) {
                        i3 = 25344;
                    } else {
                        switch (i6) {
                            case 8:
                            case 16:
                            case 32:
                                i3 = 101376;
                                continue;
                            case 64:
                                i3 = 202752;
                                continue;
                            case 128:
                            case 256:
                                i3 = 414720;
                                continue;
                            case 512:
                                i3 = 921600;
                                continue;
                            case 1024:
                                i3 = 1310720;
                                continue;
                            case 2048:
                            case 4096:
                                i3 = 2097152;
                                continue;
                            case 8192:
                                i3 = 2228224;
                                continue;
                            case 16384:
                                i3 = 5652480;
                                continue;
                            case 32768:
                            case 65536:
                                i3 = 9437184;
                                continue;
                            default:
                                i3 = -1;
                                continue;
                        }
                    }
                    i5 = Math.max(i3, i5);
                    i4++;
                }
                if (blm.a >= 21) {
                    i2 = 345600;
                } else {
                    i2 = 172800;
                }
                i4 = Math.max(i5, i2);
            }
            m = i4;
        }
        return m;
    }

    private static void a(List list, ats ats) {
        Collections.sort(list, new atm(ats));
    }
}
