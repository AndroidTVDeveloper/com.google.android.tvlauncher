package defpackage;

import android.util.Base64;
import java.io.BufferedReader;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: bck  reason: default package */
/* compiled from: PG */
public final class bck implements biz {
    private static final Pattern A = Pattern.compile("NAME=\"(.+?)\"");
    private static final Pattern B = Pattern.compile("GROUP-ID=\"(.+?)\"");
    private static final Pattern C = Pattern.compile("CHARACTERISTICS=\"(.+?)\"");
    private static final Pattern D = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");
    private static final Pattern E = b("AUTOSELECT");
    private static final Pattern F = b("DEFAULT");
    private static final Pattern G = b("FORCED");
    private static final Pattern H = Pattern.compile("VALUE=\"(.+?)\"");
    private static final Pattern I = Pattern.compile("IMPORT=\"(.+?)\"");
    private static final Pattern J = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");
    private static final Pattern a = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");
    private static final Pattern b = Pattern.compile("VIDEO=\"(.+?)\"");
    private static final Pattern c = Pattern.compile("AUDIO=\"(.+?)\"");
    private static final Pattern d = Pattern.compile("SUBTITLES=\"(.+?)\"");
    private static final Pattern e = Pattern.compile("CLOSED-CAPTIONS=\"(.+?)\"");
    private static final Pattern f = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");
    private static final Pattern g = Pattern.compile("CHANNELS=\"(.+?)\"");
    private static final Pattern h = Pattern.compile("CODECS=\"(.+?)\"");
    private static final Pattern i = Pattern.compile("RESOLUTION=(\\d+x\\d+)");
    private static final Pattern j = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");
    private static final Pattern k = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");
    private static final Pattern l = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");
    private static final Pattern m = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");
    private static final Pattern n = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");
    private static final Pattern o = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");
    private static final Pattern p = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");
    private static final Pattern q = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");
    private static final Pattern r = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");
    private static final Pattern s = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");
    private static final Pattern t = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");
    private static final Pattern u = Pattern.compile("KEYFORMAT=\"(.+?)\"");
    private static final Pattern v = Pattern.compile("KEYFORMATVERSIONS=\"(.+?)\"");
    private static final Pattern w = Pattern.compile("URI=\"(.+?)\"");
    private static final Pattern x = Pattern.compile("IV=([^,.*]+)");
    private static final Pattern y = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");
    private static final Pattern z = Pattern.compile("LANGUAGE=\"(.+?)\"");
    private final bcf K;

    public bck() {
        this(bcf.a);
    }

    public bck(bcf bcf) {
        this.K = bcf;
    }

    private static Pattern b(String str) {
        StringBuilder sb = new StringBuilder(str.length() + 9);
        sb.append(str);
        sb.append("=(NO|YES)");
        return Pattern.compile(sb.toString());
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v53, resolved type: java.lang.Object} */
    /* JADX WARN: Type inference failed for: r18v25, types: [bcf] */
    /* JADX WARN: Type inference failed for: r18v26, types: [bch] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bck.a(java.io.BufferedReader, boolean, int):int
     arg types: [java.io.BufferedReader, int, int]
     candidates:
      bck.a(java.lang.String, java.lang.String, java.util.Map):anp
      bck.a(java.lang.String, java.util.regex.Pattern, java.util.Map):java.lang.String
      bck.a(java.io.BufferedReader, boolean, int):int */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object[], java.lang.Object):boolean
     arg types: [java.lang.String[], java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object, java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object[], java.lang.Object):boolean */
    /* JADX WARNING: Code restructure failed: missing block: B:101:0x025c, code lost:
        if ("AES-128".equals(r4) != false) goto L_0x0263;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:102:0x025e, code lost:
        r22 = r0;
        r18 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:103:0x0263, code lost:
        r22 = r0;
        r18 = a(r14, defpackage.bck.w, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:104:0x026f, code lost:
        if (r7 != null) goto L_0x0275;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:105:0x0271, code lost:
        r7 = a(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:106:0x0275, code lost:
        r4 = a(r14, r10, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x027a, code lost:
        if (r4 == null) goto L_0x0287;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:108:0x027c, code lost:
        r1.put(r10, r4);
        r22 = r0;
        r18 = null;
        r52 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:110:0x0288, code lost:
        r1.clear();
        r18 = null;
        r22 = null;
        r52 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0292, code lost:
        r4 = r80;
        r14 = r68;
        r10 = r69;
        r0 = r70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:112:0x029d, code lost:
        r70 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:113:0x02a3, code lost:
        if (r14.startsWith("#EXT-X-BYTERANGE") == false) goto L_0x02ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:114:0x02a5, code lost:
        r0 = a(r14, defpackage.bck.r, r3).split("@");
        r60 = java.lang.Long.parseLong(r0[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:115:0x02ba, code lost:
        if (r0.length <= 1) goto L_0x02c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:116:0x02bc, code lost:
        r42 = java.lang.Long.parseLong(r0[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:117:0x02c2, code lost:
        r4 = r80;
        r14 = r68;
        r10 = r69;
        r0 = r70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:119:0x02d3, code lost:
        if (r14.startsWith("#EXT-X-DISCONTINUITY-SEQUENCE") == false) goto L_0x02f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:120:0x02d5, code lost:
        r32 = java.lang.Integer.parseInt(r14.substring(r14.indexOf(58) + 1));
        r4 = r80;
        r14 = r68;
        r10 = r69;
        r0 = r70;
        r31 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02f7, code lost:
        if (r14.equals(r8) == false) goto L_0x0305;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:123:0x02f9, code lost:
        r62 = r62 + 1;
        r4 = r80;
        r14 = r68;
        r10 = r69;
        r0 = r70;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x030b, code lost:
        if (r14.startsWith("#EXT-X-PROGRAM-DATE-TIME") != false) goto L_0x045e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:127:0x0313, code lost:
        if (r14.equals("#EXT-X-GAP") != false) goto L_0x0446;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:129:0x031b, code lost:
        if (r14.equals("#EXT-X-INDEPENDENT-SEGMENTS") != false) goto L_0x0431;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:130:0x031d, code lost:
        r0 = r68;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:131:0x0323, code lost:
        if (r14.equals(r0) != false) goto L_0x041a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x032b, code lost:
        if (r14.startsWith("#") != false) goto L_0x0408;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:134:0x032d, code lost:
        if (r18 != null) goto L_0x0331;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x032f, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x0331, code lost:
        if (r22 != null) goto L_0x0338;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:137:0x0333, code lost:
        r4 = java.lang.Long.toHexString(r53);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:138:0x0338, code lost:
        r4 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x033a, code lost:
        r71 = r53 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0340, code lost:
        if (r60 == -1) goto L_0x0343;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:0x0343, code lost:
        r42 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0346, code lost:
        if (r52 != null) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x034c, code lost:
        if (r1.isEmpty() != false) goto L_0x03af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:146:0x034e, code lost:
        r68 = r0;
        r73 = r1;
        r0 = (defpackage.anp[]) r1.values().toArray(new defpackage.anp[0]);
        r1 = new defpackage.anq(r7, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:147:0x0364, code lost:
        if (r41 == null) goto L_0x036f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:0x0366, code lost:
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:149:0x036f, code lost:
        r10 = new defpackage.anp[r0.length];
        r44 = r1;
        r1 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x0375, code lost:
        r74 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x0378, code lost:
        if (r1 < r0.length) goto L_0x038a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x037a, code lost:
        r41 = new defpackage.anq(r7, r10);
        r75 = r6;
        r76 = r7;
        r77 = r8;
        r1 = r44;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:153:0x038a, code lost:
        r5 = r0[r1];
        r10[r1] = new defpackage.anp(r5.a, r5.b, r5.c, null);
        r1 = r1 + 1;
        r0 = r0;
        r5 = r74;
        r6 = r6;
        r7 = r7;
        r8 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:154:0x03af, code lost:
        r68 = r0;
        r73 = r1;
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
        r1 = r52;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x03bd, code lost:
        r4 = r79;
        r4.add(new defpackage.bcg(a(r14, r3), r65, r66, r62, r63, r1, r18, r4, r42, r60, r59));
        r63 = r63 + r66;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x03e3, code lost:
        if (r60 == -1) goto L_0x03e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x03e5, code lost:
        r42 = r42 + r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:158:0x03e7, code lost:
        r52 = r1;
        r79 = r4;
        r60 = -1;
        r66 = 0;
        r14 = r68;
        r10 = r69;
        r0 = r70;
        r53 = r71;
        r1 = r73;
        r5 = r74;
        r6 = r75;
        r7 = r76;
        r8 = r77;
        r59 = false;
        r4 = r80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0408, code lost:
        r4 = r79;
        r68 = r0;
        r73 = r1;
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x041a, code lost:
        r4 = r79;
        r73 = r1;
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
        r14 = r0;
        r10 = r69;
        r0 = r70;
        r40 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x0431, code lost:
        r4 = r79;
        r73 = r1;
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
        r14 = r68;
        r10 = r69;
        r0 = r70;
        r39 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0446, code lost:
        r4 = r79;
        r73 = r1;
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
        r14 = r68;
        r10 = r69;
        r0 = r70;
        r59 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x045a, code lost:
        r4 = r80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:164:0x045e, code lost:
        r4 = r79;
        r73 = r1;
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x046c, code lost:
        if (r27 != 0) goto L_0x049b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x046e, code lost:
        r27 = defpackage.aja.b(defpackage.blm.f(r14.substring(r14.indexOf(58) + 1))) - r63;
        r79 = r4;
        r14 = r68;
        r10 = r69;
        r0 = r70;
        r1 = r73;
        r5 = r74;
        r6 = r75;
        r7 = r76;
        r8 = r77;
        r4 = r80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:0x049b, code lost:
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x049f, code lost:
        a(r14, defpackage.bck.p, "", r3);
        r66 = (long) (b(r14, defpackage.bck.o) * 1000000.0d);
        r79 = r79;
        r14 = r68;
        r10 = r69;
        r0 = r0;
        r1 = r1;
        r5 = r5;
        r6 = r6;
        r7 = r7;
        r8 = r8;
        r4 = r80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x04d6, code lost:
        r4 = r79;
        r70 = r0;
        r73 = r1;
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
        r0 = b(r14, defpackage.bck.I, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x04ea, code lost:
        if (r0 != null) goto L_0x04fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x04ec, code lost:
        r3.put(a(r14, defpackage.bck.A, r3), a(r14, defpackage.bck.H, r3));
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x04fe, code lost:
        r1 = r19;
        r5 = (java.lang.String) r1.h.get(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:0x0508, code lost:
        if (r5 == null) goto L_0x050d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x050a, code lost:
        r3.put(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x050d, code lost:
        r19 = r1;
        r79 = r4;
        r14 = r68;
        r10 = r69;
        r0 = r70;
        r1 = r73;
        r5 = r74;
        r6 = r75;
        r7 = r76;
        r8 = r77;
        r4 = r80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:176:0x0525, code lost:
        r36 = ((long) a(r14, defpackage.bck.k)) * 1000000;
        r19 = r19;
        r79 = r79;
        r14 = r68;
        r10 = r69;
        r0 = r0;
        r1 = r1;
        r5 = r5;
        r6 = r6;
        r7 = r7;
        r8 = r8;
        r4 = r80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x055a, code lost:
        r19 = r19;
        r79 = r79;
        r29 = (long) (b(r14, defpackage.bck.q) * 1000000.0d);
        r14 = r68;
        r10 = r10;
        r0 = r0;
        r1 = r1;
        r5 = r5;
        r6 = r6;
        r7 = r7;
        r8 = r8;
        r4 = r80;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x058f, code lost:
        r4 = r79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0595, code lost:
        if (r27 == 0) goto L_0x059a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0597, code lost:
        r16 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x059a, code lost:
        r16 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x059d, code lost:
        r18 = new defpackage.bch(r21, r20, r2, r29, r27, r31, r32, r33, r35, r36, r39, r40, r16, r41, r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x05be, code lost:
        defpackage.blm.a((java.io.Closeable) r38);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x05c3, code lost:
        r38 = r2;
        r69 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:?, code lost:
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x05cc, code lost:
        r2 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:189:?, code lost:
        r0 = new defpackage.bcj(r3, r2);
        r3 = r79.toString();
        r4 = new java.util.HashMap();
        r5 = new java.util.HashMap();
        r6 = new java.util.ArrayList();
        r7 = new java.util.ArrayList();
        r8 = new java.util.ArrayList();
        r10 = new java.util.ArrayList();
        r25 = new java.util.ArrayList();
        r12 = new java.util.ArrayList();
        r13 = new java.util.ArrayList();
        r14 = new java.util.ArrayList();
        r15 = false;
        r28 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x005d, code lost:
        if (defpackage.blm.a(a(r2, false, r7)) == false) goto L_0x0bb9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:190:0x060a, code lost:
        r19 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:191:0x0610, code lost:
        if (r0.a() != false) goto L_0x0965;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x0612, code lost:
        r0 = new java.util.ArrayList();
        r1 = new java.util.HashSet();
        r9 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0621, code lost:
        if (r9 >= r6.size()) goto L_0x06a2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x0623, code lost:
        r11 = (defpackage.bce) r6.get(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x0629, code lost:
        r38 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:199:0x0631, code lost:
        if (r1.add(r11.a) == false) goto L_0x068c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x005f, code lost:
        r4 = r2.readLine();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0637, code lost:
        if (r11.b.g != null) goto L_0x063b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x0639, code lost:
        r2 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:203:0x063b, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x063d, code lost:
        defpackage.bks.b(r2);
        r79 = r1;
        r18 = r4;
        r30 = r13;
        r20 = r14;
        r0.add(new defpackage.bce(r11.a, r11.b.a(new defpackage.atw(new defpackage.bbw(null, null, (java.util.List) defpackage.bks.a((java.util.ArrayList) r4.get(r11.a))))), r11.c, r11.d, r11.e, r11.f));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:205:0x068c, code lost:
        r79 = r1;
        r18 = r4;
        r30 = r13;
        r20 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x0694, code lost:
        r9 = r9 + 1;
        r1 = r79;
        r4 = r18;
        r14 = r20;
        r13 = r30;
        r2 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:207:0x06a2, code lost:
        r38 = r2;
        r30 = r13;
        r20 = r14;
        r1 = 0;
        r2 = null;
        r26 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:209:0x06b2, code lost:
        if (r1 >= r12.size()) goto L_0x0940;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r4 == null) goto L_0x0bac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:210:0x06b4, code lost:
        r4 = (java.lang.String) r12.get(r1);
        r9 = a(r4, defpackage.bck.B, r5);
        r11 = a(r4, defpackage.bck.A, r5);
        r13 = b(r4, defpackage.bck.w, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x06cc, code lost:
        if (r13 == null) goto L_0x06d3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x06ce, code lost:
        r13 = defpackage.blk.a(r3, r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x06d3, code lost:
        r13 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:214:0x06d5, code lost:
        r50 = b(r4, defpackage.bck.z, r5);
        r14 = c(r4, defpackage.bck.F);
        r79 = r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:0x06e9, code lost:
        if (c(r4, defpackage.bck.G) != false) goto L_0x06ec;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x06ec, code lost:
        r14 = r14 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:219:0x06f4, code lost:
        if (c(r4, defpackage.bck.E) != false) goto L_0x06f9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0065, code lost:
        r4 = r4.trim();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:220:0x06f6, code lost:
        r49 = r14;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:221:0x06f9, code lost:
        r49 = r14 | true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:222:0x06fe, code lost:
        r12 = b(r4, defpackage.bck.C, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:223:0x0708, code lost:
        if (android.text.TextUtils.isEmpty(r12) != false) goto L_0x0740;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:224:0x070a, code lost:
        r12 = defpackage.blm.a(r12, ",");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:225:0x0716, code lost:
        if (defpackage.blm.a((java.lang.Object[]) r12, (java.lang.Object) "public.accessibility.describes-video") != false) goto L_0x071a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0718, code lost:
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x071a, code lost:
        r14 = 512;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x071d, code lost:
        r21 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0725, code lost:
        if (defpackage.blm.a((java.lang.Object[]) r12, (java.lang.Object) "public.accessibility.transcribes-spoken-dialog") == false) goto L_0x0729;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x006d, code lost:
        if (r4.isEmpty() != false) goto L_0x0b9f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x0727, code lost:
        r14 = r14 | 4096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x072f, code lost:
        if (defpackage.blm.a((java.lang.Object[]) r12, (java.lang.Object) "public.accessibility.describes-music-and-sound") == false) goto L_0x0734;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x0731, code lost:
        r14 = r14 | 1024;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:0x073a, code lost:
        if (defpackage.blm.a((java.lang.Object[]) r12, (java.lang.Object) "public.easy-to-read") == false) goto L_0x0743;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:236:0x073c, code lost:
        r14 = r14 | 8192;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x0740, code lost:
        r21 = r0;
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0743, code lost:
        r12 = new java.lang.StringBuilder((java.lang.String.valueOf(r9).length() + 1) + java.lang.String.valueOf(r11).length());
        r12.append(r9);
        r12.append(":");
        r12.append(r11);
        r39 = r12.toString();
        r22 = r3;
        r23 = r15;
        r0 = new defpackage.atw(new defpackage.bbw(r9, r11, java.util.Collections.emptyList()));
        r3 = a(r4, defpackage.bck.y, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:240:0x078c, code lost:
        switch(r3.hashCode()) {
            case -959297733: goto L_0x07af;
            case -333210994: goto L_0x07a5;
            case 62628790: goto L_0x079b;
            case 81665115: goto L_0x0790;
            default: goto L_0x078f;
        };
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0797, code lost:
        if (r3.equals("VIDEO") == false) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:243:0x0799, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:245:0x07a1, code lost:
        if (r3.equals("AUDIO") == false) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:246:0x07a3, code lost:
        r3 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:248:0x07ab, code lost:
        if (r3.equals("CLOSED-CAPTIONS") == false) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:249:0x07ad, code lost:
        r3 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0073, code lost:
        r10 = "#EXT";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:251:0x07b5, code lost:
        if (r3.equals("SUBTITLES") == false) goto L_0x07b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:252:0x07b7, code lost:
        r3 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:253:0x07b9, code lost:
        r3 = 65535;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:254:0x07ba, code lost:
        if (r3 == 0) goto L_0x08c8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:256:0x07bd, code lost:
        if (r3 == 1) goto L_0x0839;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:258:0x07c0, code lost:
        if (r3 == 2) goto L_0x0816;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0079, code lost:
        if (r4.startsWith(r1) != false) goto L_0x05c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:260:0x07c3, code lost:
        if (r3 == 3) goto L_0x07c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:262:?, code lost:
        r0 = a(r4, defpackage.bck.D, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:263:0x07d3, code lost:
        if (r0.startsWith("CC") != false) goto L_0x07e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x07d5, code lost:
        r48 = java.lang.Integer.parseInt(r0.substring(7));
        r42 = "application/cea-708";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:265:0x07e5, code lost:
        r48 = java.lang.Integer.parseInt(r0.substring(2));
        r42 = "application/cea-608";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:266:0x07f6, code lost:
        if (r2 != null) goto L_0x07fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:267:0x07f8, code lost:
        r2 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x07fd, code lost:
        r2.add(defpackage.akh.a(r39, r11, null, r42, null, -1, r49, r14, r50, r48));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:269:0x0816, code lost:
        r10.add(new defpackage.bcd(r13, defpackage.akh.a(r39, r11, "application/x-mpegURL", "text/vtt", -1, r49, r14, r50).a(r0), r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:270:0x0839, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:272:0x083f, code lost:
        if (r3 >= r6.size()) goto L_0x0853;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:273:0x0841, code lost:
        r15 = (defpackage.bce) r6.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x084d, code lost:
        if (r9.equals(r15.d) != false) goto L_0x0855;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x084f, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:276:0x0853, code lost:
        r15 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x0855, code lost:
        if (r15 == null) goto L_0x0863;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:278:0x0857, code lost:
        r43 = defpackage.blm.a(r15.b.f, 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:279:0x0863, code lost:
        r43 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:280:0x0866, code lost:
        if (r43 == null) goto L_0x086d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:281:0x0868, code lost:
        r3 = defpackage.bkt.f(r43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:282:0x086d, code lost:
        r3 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:283:0x086f, code lost:
        r4 = b(r4, defpackage.bck.g, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x0875, code lost:
        if (r4 == null) goto L_0x089b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:285:0x0877, code lost:
        r9 = java.lang.Integer.parseInt(defpackage.blm.b(r4, "/")[0]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:286:0x088a, code lost:
        if ("audio/eac3".equals(r3) == false) goto L_0x0896;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:288:0x0892, code lost:
        if (r4.endsWith("/JOC") == false) goto L_0x0896;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:289:0x0894, code lost:
        r3 = "audio/eac3-joc";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x007f, code lost:
        r14 = "#EXT-X-ENDLIST";
        r8 = "#EXT-X-DISCONTINUITY";
        r5 = "#EXTINF";
        r6 = "#EXT-X-MEDIA-SEQUENCE";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:290:0x0896, code lost:
        r42 = r3;
        r45 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x089b, code lost:
        r42 = r3;
        r45 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:292:0x089f, code lost:
        r3 = defpackage.akh.a(r39, r11, "application/x-mpegURL", r42, r43, -1, r45, -1, (java.util.List) null, r49, r14, r50);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:293:0x08b1, code lost:
        if (r13 == null) goto L_0x08c3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:294:0x08b3, code lost:
        r8.add(new defpackage.bcd(r13, r3.a(r0), r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:295:0x08c3, code lost:
        r26 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:297:0x08c8, code lost:
        r3 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:299:0x08ce, code lost:
        if (r3 >= r6.size()) goto L_0x08e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x008d, code lost:
        if (r4.startsWith(r0) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:300:0x08d0, code lost:
        r4 = (defpackage.bce) r6.get(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x08dc, code lost:
        if (r9.equals(r4.c) != false) goto L_0x08e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:302:0x08de, code lost:
        r3 = r3 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:303:0x08e1, code lost:
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:304:0x08e3, code lost:
        if (r4 == null) goto L_0x08fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:305:0x08e5, code lost:
        r3 = r4.b;
        r4 = defpackage.blm.a(r3.f, 2);
        r9 = r3.n;
        r15 = r3.o;
        r47 = r3.p;
        r43 = r4;
        r45 = r9;
        r46 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:306:0x08fd, code lost:
        r43 = null;
        r45 = -1;
        r46 = -1;
        r47 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:307:0x0908, code lost:
        if (r43 == null) goto L_0x0911;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x090a, code lost:
        r42 = defpackage.bkt.f(r43);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:309:0x0911, code lost:
        r42 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:310:0x0914, code lost:
        r0 = defpackage.akh.a(r39, r11, "application/x-mpegURL", r42, r43, -1, r45, r46, r47, (java.util.List) null, r49, r14).a(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:311:0x0926, code lost:
        if (r13 == null) goto L_0x0933;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0928, code lost:
        r7.add(new defpackage.bcd(r13, r0, r11));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:313:0x0933, code lost:
        r1 = r1 + 1;
        r12 = r79;
        r0 = r21;
        r3 = r22;
        r15 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:314:0x0940, code lost:
        r21 = r0;
        r22 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:315:0x0946, code lost:
        if (r15 == false) goto L_0x094f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:316:0x0948, code lost:
        r27 = java.util.Collections.emptyList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:317:0x094f, code lost:
        r27 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:318:0x0951, code lost:
        r18 = new defpackage.bcf(r22, r20, r21, r7, r8, r10, r25, r26, r27, r28, r5, r30);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:319:0x0964, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:320:0x0965, code lost:
        r38 = r2;
        r22 = r3;
        r18 = r4;
        r79 = r12;
        r30 = r13;
        r20 = r14;
        r23 = r15;
        r2 = r0.b();
        r3 = r69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:321:0x097e, code lost:
        if (r2.startsWith(r3) != false) goto L_0x0983;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:322:0x0980, code lost:
        r4 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:323:0x0983, code lost:
        r4 = r20;
        r4.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:325:0x098d, code lost:
        if (r2.startsWith("#EXT-X-DEFINE") == false) goto L_0x09b6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:326:0x098f, code lost:
        r5.put(a(r2, defpackage.bck.A, r5), a(r2, defpackage.bck.H, r5));
        r13 = r79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:327:0x09a0, code lost:
        r24 = r0;
        r20 = r1;
        r69 = r3;
        r21 = r4;
        r79 = r5;
        r26 = r7;
        r0 = r18;
        r19 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:328:0x09b0, code lost:
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0093, code lost:
        if (r4.startsWith(r6) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:330:0x09bc, code lost:
        if (r2.equals("#EXT-X-INDEPENDENT-SEGMENTS") != false) goto L_0x0b77;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:332:0x09c4, code lost:
        if (r2.startsWith("#EXT-X-MEDIA") == false) goto L_0x09cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:333:0x09c6, code lost:
        r13 = r79;
        r13.add(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:334:0x09cc, code lost:
        r13 = r79;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:335:0x09d4, code lost:
        if (r2.startsWith("#EXT-X-SESSION-KEY") == false) goto L_0x0a25;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:336:0x09d6, code lost:
        r14 = a(r2, a(r2, defpackage.bck.u, "identity", r5), r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:337:0x09e0, code lost:
        if (r14 == null) goto L_0x0a0d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:338:0x09e2, code lost:
        r69 = r3;
        r3 = r30;
        r3.add(new defpackage.anq(a(a(r2, defpackage.bck.t, r5)), r14));
        r24 = r0;
        r20 = r1;
        r19 = r3;
        r21 = r4;
        r79 = r5;
        r26 = r7;
        r0 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:339:0x0a0d, code lost:
        r69 = r3;
        r24 = r0;
        r20 = r1;
        r19 = r30;
        r21 = r4;
        r79 = r5;
        r26 = r7;
        r0 = r18;
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:340:0x0a25, code lost:
        r69 = r3;
        r3 = r30;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:341:0x0a2d, code lost:
        if (r2.startsWith(r1) == false) goto L_0x0b4d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:342:0x0a2f, code lost:
        r15 = r23 | r2.contains("CLOSED-CAPTIONS=NONE");
        r12 = a(r2, defpackage.bck.f);
        r14 = b(r2, defpackage.bck.a, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:0x0a43, code lost:
        if (r14 != null) goto L_0x0a46;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:345:0x0a46, code lost:
        r12 = java.lang.Integer.parseInt(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:346:0x0a4a, code lost:
        r43 = b(r2, defpackage.bck.h, r5);
        r14 = b(r2, defpackage.bck.i, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:347:0x0a56, code lost:
        if (r14 == null) goto L_0x0a7e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x0a58, code lost:
        r20 = r1;
        r1 = r14.split("x");
        r17 = java.lang.Integer.parseInt(r1[0]);
        r1 = java.lang.Integer.parseInt(r1[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:349:0x0a6f, code lost:
        if (r17 > 0) goto L_0x0a74;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0099, code lost:
        if (r4.startsWith(r5) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:350:0x0a71, code lost:
        r17 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x0a74, code lost:
        if (r1 <= 0) goto L_0x0a71;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0a76, code lost:
        r19 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0a79, code lost:
        r45 = r17;
        r46 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x0a7e, code lost:
        r20 = r1;
        r45 = -1;
        r46 = -1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:355:0x0a87, code lost:
        r1 = b(r2, defpackage.bck.j, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:356:0x0a8d, code lost:
        if (r1 == null) goto L_0x0a96;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:357:0x0a8f, code lost:
        r47 = java.lang.Float.parseFloat(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:358:0x0a96, code lost:
        r47 = -1.0f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:359:0x0a9a, code lost:
        r1 = b(r2, defpackage.bck.b, r5);
        r14 = b(r2, defpackage.bck.c, r5);
        r19 = r3;
        r3 = b(r2, defpackage.bck.d, r5);
        r21 = r4;
        r2 = b(r2, defpackage.bck.e, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:360:0x0aba, code lost:
        if (r0.a() == false) goto L_0x0b45;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0abc, code lost:
        r24 = r0;
        r0 = r22;
        r4 = defpackage.blk.a(r0, a(r0.b(), r5));
        r22 = r0;
        r6.add(new defpackage.bce(r4, defpackage.akh.a(java.lang.Integer.toString(r6.size()), (java.lang.String) null, "application/x-mpegURL", (java.lang.String) null, r43, r12, r45, r46, r47, (java.util.List) null, 0, 0), r1, r14, r3, r2));
        r0 = r18;
        r18 = (java.util.ArrayList) r0.get(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0b04, code lost:
        if (r18 != null) goto L_0x0b11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x0b06, code lost:
        r79 = r5;
        r5 = new java.util.ArrayList();
        r0.put(r4, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:364:0x0b11, code lost:
        r79 = r5;
        r5 = r18;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:365:0x0b15, code lost:
        r5.add(new defpackage.bbv((long) r12, r1, r14, r3, r2));
        r5 = r79;
        r4 = r0;
        r12 = r13;
        r6 = r6;
        r13 = r19;
        r1 = r20;
        r14 = r21;
        r3 = r22;
        r0 = r24;
        r7 = r7;
        r2 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:0x0b4c, code lost:
        throw new defpackage.ako("#EXT-X-STREAM-INF tag must be followed by another line");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:368:0x0b4d, code lost:
        r24 = r0;
        r20 = r1;
        r19 = r3;
        r21 = r4;
        r79 = r5;
        r26 = r7;
        r0 = r18;
        r18 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:369:0x0b5f, code lost:
        r5 = r79;
        r4 = r0;
        r12 = r13;
        r6 = r18;
        r13 = r19;
        r1 = r20;
        r14 = r21;
        r3 = r22;
        r15 = r23;
        r0 = r24;
        r7 = r26;
        r2 = r38;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x009f, code lost:
        if (r4.startsWith("#EXT-X-KEY") != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:370:0x0b77, code lost:
        r69 = r3;
        r21 = r4;
        r4 = r18;
        r12 = r79;
        r13 = r30;
        r14 = r21;
        r3 = r22;
        r15 = r23;
        r0 = r0;
        r2 = r38;
        r28 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:372:0x0bac, code lost:
        defpackage.blm.a((java.io.Closeable) r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:373:0x0bb8, code lost:
        throw new defpackage.ako("Failed to parse the playlist, could not identify any tags.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:374:0x0bb9, code lost:
        r38 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:378:0x0bc3, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00a5, code lost:
        if (r4.startsWith("#EXT-X-BYTERANGE") != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00ab, code lost:
        if (r4.equals(r8) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00b1, code lost:
        if (r4.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00b7, code lost:
        if (r4.equals(r14) != false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b9, code lost:
        r3.add(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00c0, code lost:
        r3.add(r4);
        r1 = r7.K;
        r4 = new defpackage.bcj(r3, r2);
        r20 = r79.toString();
        r18 = r1.p;
        r3 = new java.util.HashMap();
        r7 = new java.util.ArrayList();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00de, code lost:
        r38 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:?, code lost:
        r2 = new java.util.ArrayList();
        r19 = r1;
        r1 = new java.util.TreeMap();
        r79 = r7;
        r39 = r18;
        r29 = -9223372036854775807L;
        r36 = -9223372036854775807L;
        r60 = -1;
        r27 = 0;
        r33 = 0;
        r42 = 0;
        r53 = 0;
        r63 = 0;
        r66 = 0;
        r7 = null;
        r18 = null;
        r21 = 0;
        r22 = null;
        r31 = false;
        r32 = 0;
        r35 = 1;
        r40 = false;
        r41 = null;
        r52 = null;
        r59 = false;
        r62 = 0;
        r65 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x0128, code lost:
        if (r4.a() == false) goto L_0x058f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x012a, code lost:
        r68 = r14;
        r14 = r4.b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0134, code lost:
        if (r14.startsWith(r10) != false) goto L_0x0137;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0137, code lost:
        r2.add(r14);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x013a, code lost:
        r80 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0142, code lost:
        if (r14.startsWith("#EXT-X-PLAYLIST-TYPE") == false) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0144, code lost:
        r4 = a(r14, defpackage.bck.m, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0150, code lost:
        if ("VOD".equals(r4) != false) goto L_0x0175;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0158, code lost:
        if ("EVENT".equals(r4) == false) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x015a, code lost:
        r4 = r80;
        r14 = r68;
        r21 = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0161, code lost:
        r4 = r79;
        r70 = r0;
        r73 = r1;
        r74 = r5;
        r75 = r6;
        r76 = r7;
        r77 = r8;
        r69 = r10;
        r1 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0175, code lost:
        r4 = r80;
        r14 = r68;
        r21 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0187, code lost:
        if (r14.startsWith("#EXT-X-START") != false) goto L_0x055a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x018f, code lost:
        if (r14.startsWith("#EXT-X-MAP") == false) goto L_0x01e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0191, code lost:
        r45 = a(r14, defpackage.bck.w, r3);
        r4 = b(r14, defpackage.bck.s, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019d, code lost:
        if (r4 == null) goto L_0x01b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x019f, code lost:
        r4 = r4.split("@");
        r60 = java.lang.Long.parseLong(r4[0]);
        r69 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x01b0, code lost:
        if (r4.length <= 1) goto L_0x01bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x01b2, code lost:
        r42 = java.lang.Long.parseLong(r4[1]);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01b9, code lost:
        r69 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x01bb, code lost:
        r46 = r42;
        r48 = r60;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x01bf, code lost:
        if (r18 != null) goto L_0x01c2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01c2, code lost:
        if (r22 == null) goto L_0x01dc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c4, code lost:
        r44 = new defpackage.bcg(r45, r46, r48, r18, r22);
        r4 = r80;
        r60 = -1;
        r42 = 0;
        r14 = r68;
        r10 = r69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01e3, code lost:
        throw new defpackage.ako("The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01e4, code lost:
        r69 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01ea, code lost:
        if (r14.startsWith(r0) != false) goto L_0x0525;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01f0, code lost:
        if (r14.startsWith(r6) == false) goto L_0x020b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x01f2, code lost:
        r53 = java.lang.Long.parseLong(a(r14, defpackage.bck.n, java.util.Collections.emptyMap()));
        r4 = r80;
        r33 = r53;
        r14 = r68;
        r10 = r69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0211, code lost:
        if (r14.startsWith("#EXT-X-VERSION") == false) goto L_0x0221;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0213, code lost:
        r35 = a(r14, defpackage.bck.l);
        r4 = r80;
        r14 = r68;
        r10 = r69;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x0226, code lost:
        if (r14.startsWith("#EXT-X-DEFINE") != false) goto L_0x04d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x022c, code lost:
        if (r14.startsWith(r5) != false) goto L_0x049f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x0232, code lost:
        if (r14.startsWith("#EXT-X-KEY") == false) goto L_0x029d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x0234, code lost:
        r4 = a(r14, defpackage.bck.t, r3);
        r10 = a(r14, defpackage.bck.u, "identity", r3);
        r70 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x0248, code lost:
        if ("NONE".equals(r4) != false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:98:0x024a, code lost:
        r0 = b(r14, defpackage.bck.x, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:99:0x0254, code lost:
        if ("identity".equals(r10) == false) goto L_0x026f;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object a(android.net.Uri r79, java.io.InputStream r80) {
        /*
            r78 = this;
            java.lang.String r0 = "#EXT-X-TARGETDURATION"
            java.lang.String r1 = "#EXT-X-STREAM-INF"
            java.io.BufferedReader r2 = new java.io.BufferedReader
            java.io.InputStreamReader r3 = new java.io.InputStreamReader
            r4 = r80
            r3.<init>(r4)
            r2.<init>(r3)
            java.util.ArrayDeque r3 = new java.util.ArrayDeque
            r3.<init>()
            int r4 = r2.read()     // Catch:{ all -> 0x0bc5 }
            r5 = 239(0xef, float:3.35E-43)
            if (r4 != r5) goto L_0x0036
            int r4 = r2.read()     // Catch:{ all -> 0x0bc5 }
            r5 = 187(0xbb, float:2.62E-43)
            if (r4 != r5) goto L_0x0032
            int r4 = r2.read()     // Catch:{ all -> 0x0bc5 }
            r5 = 191(0xbf, float:2.68E-43)
            if (r4 != r5) goto L_0x0032
            int r4 = r2.read()     // Catch:{ all -> 0x0bc5 }
            goto L_0x0036
        L_0x0032:
            r38 = r2
            goto L_0x0bbb
        L_0x0036:
            r5 = 1
            int r4 = a(r2, r5, r4)     // Catch:{ all -> 0x0bc5 }
            r6 = 0
            r7 = r4
            r4 = 0
        L_0x003e:
            r8 = 7
            if (r4 >= r8) goto L_0x0054
            java.lang.String r8 = "#EXTM3U"
            char r8 = r8.charAt(r4)     // Catch:{ all -> 0x0bc5 }
            if (r7 != r8) goto L_0x0050
            int r7 = r2.read()     // Catch:{ all -> 0x0bc5 }
            int r4 = r4 + 1
            goto L_0x003e
        L_0x0050:
            r38 = r2
            goto L_0x0bbb
        L_0x0054:
            int r4 = a(r2, r6, r7)     // Catch:{ all -> 0x0bc5 }
            boolean r4 = defpackage.blm.a(r4)     // Catch:{ all -> 0x0bc5 }
            if (r4 == 0) goto L_0x0bb9
        L_0x005f:
            java.lang.String r4 = r2.readLine()     // Catch:{ all -> 0x0bc5 }
            if (r4 == 0) goto L_0x0bac
            java.lang.String r4 = r4.trim()     // Catch:{ all -> 0x0bc5 }
            boolean r7 = r4.isEmpty()     // Catch:{ all -> 0x0bc5 }
            if (r7 != 0) goto L_0x0b9f
            boolean r7 = r4.startsWith(r1)     // Catch:{ all -> 0x0bc5 }
            java.lang.String r9 = "#EXT-X-DEFINE"
            java.lang.String r10 = "#EXT"
            java.lang.String r11 = "identity"
            if (r7 != 0) goto L_0x05c3
            boolean r7 = r4.startsWith(r0)     // Catch:{ all -> 0x0bc5 }
            java.lang.String r14 = "#EXT-X-ENDLIST"
            java.lang.String r15 = "#EXT-X-DISCONTINUITY-SEQUENCE"
            java.lang.String r8 = "#EXT-X-DISCONTINUITY"
            java.lang.String r12 = "#EXT-X-BYTERANGE"
            java.lang.String r13 = "#EXT-X-KEY"
            java.lang.String r5 = "#EXTINF"
            java.lang.String r6 = "#EXT-X-MEDIA-SEQUENCE"
            if (r7 != 0) goto L_0x00c0
            boolean r7 = r4.startsWith(r6)     // Catch:{ all -> 0x0bc5 }
            if (r7 != 0) goto L_0x00c0
            boolean r7 = r4.startsWith(r5)     // Catch:{ all -> 0x0bc5 }
            if (r7 != 0) goto L_0x00c0
            boolean r7 = r4.startsWith(r13)     // Catch:{ all -> 0x0bc5 }
            if (r7 != 0) goto L_0x00c0
            boolean r7 = r4.startsWith(r12)     // Catch:{ all -> 0x0bc5 }
            if (r7 != 0) goto L_0x00c0
            boolean r7 = r4.equals(r8)     // Catch:{ all -> 0x0bc5 }
            if (r7 != 0) goto L_0x00c0
            boolean r7 = r4.equals(r15)     // Catch:{ all -> 0x0bc5 }
            if (r7 != 0) goto L_0x00c0
            boolean r7 = r4.equals(r14)     // Catch:{ all -> 0x0bc5 }
            if (r7 != 0) goto L_0x00c0
            r3.add(r4)     // Catch:{ all -> 0x0bc5 }
            r5 = 1
            r6 = 0
            r8 = 7
            goto L_0x005f
        L_0x00c0:
            r3.add(r4)     // Catch:{ all -> 0x0bc5 }
            r7 = r78
            bcf r1 = r7.K     // Catch:{ all -> 0x0bc5 }
            bcj r4 = new bcj     // Catch:{ all -> 0x0bc5 }
            r4.<init>(r3, r2)     // Catch:{ all -> 0x0bc5 }
            java.lang.String r20 = r79.toString()     // Catch:{ all -> 0x0bc5 }
            boolean r3 = r1.p     // Catch:{ all -> 0x0bc5 }
            r18 = r3
            java.util.HashMap r3 = new java.util.HashMap     // Catch:{ all -> 0x0bc5 }
            r3.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r7.<init>()     // Catch:{ all -> 0x0bc5 }
            r38 = r2
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0bc3 }
            r2.<init>()     // Catch:{ all -> 0x0bc3 }
            r19 = r1
            java.util.TreeMap r1 = new java.util.TreeMap     // Catch:{ all -> 0x0bc3 }
            r1.<init>()     // Catch:{ all -> 0x0bc3 }
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r23 = -1
            r25 = 0
            r79 = r7
            r39 = r18
            r29 = r21
            r36 = r29
            r60 = r23
            r27 = r25
            r33 = r27
            r42 = r33
            r53 = r42
            r63 = r53
            r66 = r63
            r7 = 0
            r18 = 0
            r21 = 0
            r22 = 0
            r31 = 0
            r32 = 0
            r35 = 1
            r40 = 0
            r41 = 0
            r52 = 0
            r59 = 0
            r62 = 0
            r65 = 0
        L_0x0124:
            boolean r44 = r4.a()     // Catch:{ all -> 0x0bc3 }
            if (r44 == 0) goto L_0x058f
            r68 = r14
            java.lang.String r14 = r4.b()     // Catch:{ all -> 0x0bc3 }
            boolean r44 = r14.startsWith(r10)     // Catch:{ all -> 0x0bc3 }
            if (r44 != 0) goto L_0x0137
            goto L_0x013a
        L_0x0137:
            r2.add(r14)     // Catch:{ all -> 0x0bc3 }
        L_0x013a:
            r80 = r4
            java.lang.String r4 = "#EXT-X-PLAYLIST-TYPE"
            boolean r4 = r14.startsWith(r4)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x017c
            java.util.regex.Pattern r4 = defpackage.bck.m     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = a(r14, r4, r3)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r14 = "VOD"
            boolean r14 = r14.equals(r4)     // Catch:{ all -> 0x0bc3 }
            if (r14 != 0) goto L_0x0175
            java.lang.String r14 = "EVENT"
            boolean r4 = r14.equals(r4)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x0161
            r4 = r80
            r14 = r68
            r21 = 2
            goto L_0x0124
        L_0x0161:
            r4 = r79
            r70 = r0
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r69 = r10
            r1 = r19
            goto L_0x050d
        L_0x0175:
            r4 = r80
            r14 = r68
            r21 = 1
            goto L_0x0124
        L_0x017c:
            java.lang.String r4 = "#EXT-X-START"
            boolean r4 = r14.startsWith(r4)     // Catch:{ all -> 0x0bc3 }
            r44 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            if (r4 != 0) goto L_0x055a
            java.lang.String r4 = "#EXT-X-MAP"
            boolean r4 = r14.startsWith(r4)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x01e4
            java.util.regex.Pattern r4 = defpackage.bck.w     // Catch:{ all -> 0x0bc3 }
            java.lang.String r45 = a(r14, r4, r3)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r4 = defpackage.bck.s     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = b(r14, r4, r3)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x01b9
            java.lang.String r14 = "@"
            java.lang.String[] r4 = r4.split(r14)     // Catch:{ all -> 0x0bc3 }
            r14 = 0
            r44 = r4[r14]     // Catch:{ all -> 0x0bc3 }
            long r60 = java.lang.Long.parseLong(r44)     // Catch:{ all -> 0x0bc3 }
            int r14 = r4.length     // Catch:{ all -> 0x0bc3 }
            r69 = r10
            r10 = 1
            if (r14 <= r10) goto L_0x01bb
            r4 = r4[r10]     // Catch:{ all -> 0x0bc3 }
            long r42 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0bc3 }
            goto L_0x01bb
        L_0x01b9:
            r69 = r10
        L_0x01bb:
            r46 = r42
            r48 = r60
            if (r18 != 0) goto L_0x01c2
            goto L_0x01c4
        L_0x01c2:
            if (r22 == 0) goto L_0x01dc
        L_0x01c4:
            bcg r65 = new bcg     // Catch:{ all -> 0x0bc3 }
            r44 = r65
            r50 = r18
            r51 = r22
            r44.<init>(r45, r46, r48, r50, r51)     // Catch:{ all -> 0x0bc3 }
            r4 = r80
            r60 = r23
            r42 = r25
            r14 = r68
            r10 = r69
            goto L_0x0124
        L_0x01dc:
            ako r0 = new ako     // Catch:{ all -> 0x0bc3 }
            java.lang.String r1 = "The encryption IV attribute must be present when an initialization segment is encrypted with METHOD=AES-128."
            r0.<init>(r1)     // Catch:{ all -> 0x0bc3 }
            throw r0     // Catch:{ all -> 0x0bc3 }
        L_0x01e4:
            r69 = r10
            boolean r4 = r14.startsWith(r0)     // Catch:{ all -> 0x0bc3 }
            if (r4 != 0) goto L_0x0525
            boolean r4 = r14.startsWith(r6)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x020b
            java.util.regex.Pattern r4 = defpackage.bck.n     // Catch:{ all -> 0x0bc3 }
            java.util.Map r10 = java.util.Collections.emptyMap()     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = a(r14, r4, r10)     // Catch:{ all -> 0x0bc3 }
            long r53 = java.lang.Long.parseLong(r4)     // Catch:{ all -> 0x0bc3 }
            r4 = r80
            r33 = r53
            r14 = r68
            r10 = r69
            goto L_0x0124
        L_0x020b:
            java.lang.String r4 = "#EXT-X-VERSION"
            boolean r4 = r14.startsWith(r4)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x0221
            java.util.regex.Pattern r4 = defpackage.bck.l     // Catch:{ all -> 0x0bc3 }
            int r35 = a(r14, r4)     // Catch:{ all -> 0x0bc3 }
            r4 = r80
            r14 = r68
            r10 = r69
            goto L_0x0124
        L_0x0221:
            boolean r4 = r14.startsWith(r9)     // Catch:{ all -> 0x0bc3 }
            if (r4 != 0) goto L_0x04d6
            boolean r4 = r14.startsWith(r5)     // Catch:{ all -> 0x0bc3 }
            if (r4 != 0) goto L_0x049f
            boolean r4 = r14.startsWith(r13)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x029d
            java.util.regex.Pattern r4 = defpackage.bck.t     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = a(r14, r4, r3)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r10 = defpackage.bck.u     // Catch:{ all -> 0x0bc3 }
            java.lang.String r10 = a(r14, r10, r11, r3)     // Catch:{ all -> 0x0bc3 }
            r70 = r0
            java.lang.String r0 = "NONE"
            boolean r0 = r0.equals(r4)     // Catch:{ all -> 0x0bc3 }
            if (r0 != 0) goto L_0x0288
            java.util.regex.Pattern r0 = defpackage.bck.x     // Catch:{ all -> 0x0bc3 }
            java.lang.String r0 = b(r14, r0, r3)     // Catch:{ all -> 0x0bc3 }
            boolean r18 = r11.equals(r10)     // Catch:{ all -> 0x0bc3 }
            if (r18 == 0) goto L_0x026f
            java.lang.String r10 = "AES-128"
            boolean r4 = r10.equals(r4)     // Catch:{ all -> 0x0bc3 }
            if (r4 != 0) goto L_0x0263
        L_0x025e:
            r22 = r0
            r18 = 0
            goto L_0x0292
        L_0x0263:
            java.util.regex.Pattern r4 = defpackage.bck.w     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = a(r14, r4, r3)     // Catch:{ all -> 0x0bc3 }
            r22 = r0
            r18 = r4
            goto L_0x0292
        L_0x026f:
            if (r7 != 0) goto L_0x0275
            java.lang.String r7 = a(r4)     // Catch:{ all -> 0x0bc3 }
        L_0x0275:
            anp r4 = a(r14, r10, r3)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x0287
            r1.put(r10, r4)     // Catch:{ all -> 0x0bc3 }
            r22 = r0
            r18 = 0
            r52 = 0
            goto L_0x0292
        L_0x0287:
            goto L_0x025e
        L_0x0288:
            r1.clear()     // Catch:{ all -> 0x0bc3 }
            r18 = 0
            r22 = 0
            r52 = 0
        L_0x0292:
            r4 = r80
            r14 = r68
            r10 = r69
            r0 = r70
            goto L_0x0124
        L_0x029d:
            r70 = r0
            boolean r0 = r14.startsWith(r12)     // Catch:{ all -> 0x0bc3 }
            if (r0 == 0) goto L_0x02ce
            java.util.regex.Pattern r0 = defpackage.bck.r     // Catch:{ all -> 0x0bc3 }
            java.lang.String r0 = a(r14, r0, r3)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = "@"
            java.lang.String[] r0 = r0.split(r4)     // Catch:{ all -> 0x0bc3 }
            r4 = 0
            r10 = r0[r4]     // Catch:{ all -> 0x0bc3 }
            long r60 = java.lang.Long.parseLong(r10)     // Catch:{ all -> 0x0bc3 }
            int r4 = r0.length     // Catch:{ all -> 0x0bc3 }
            r10 = 1
            if (r4 <= r10) goto L_0x02c2
            r0 = r0[r10]     // Catch:{ all -> 0x0bc3 }
            long r42 = java.lang.Long.parseLong(r0)     // Catch:{ all -> 0x0bc3 }
        L_0x02c2:
            r4 = r80
            r14 = r68
            r10 = r69
            r0 = r70
            goto L_0x0124
        L_0x02ce:
            boolean r0 = r14.startsWith(r15)     // Catch:{ all -> 0x0bc3 }
            if (r0 == 0) goto L_0x02f2
            r0 = 58
            int r0 = r14.indexOf(r0)     // Catch:{ all -> 0x0bc3 }
            r4 = 1
            int r0 = r0 + r4
            java.lang.String r0 = r14.substring(r0)     // Catch:{ all -> 0x0bc3 }
            int r32 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0bc3 }
            r4 = r80
            r14 = r68
            r10 = r69
            r0 = r70
            r31 = 1
            goto L_0x0124
        L_0x02f2:
            boolean r0 = r14.equals(r8)     // Catch:{ all -> 0x0bc3 }
            if (r0 == 0) goto L_0x0305
            int r62 = r62 + 1
            r4 = r80
            r14 = r68
            r10 = r69
            r0 = r70
            goto L_0x0124
        L_0x0305:
            java.lang.String r0 = "#EXT-X-PROGRAM-DATE-TIME"
            boolean r0 = r14.startsWith(r0)     // Catch:{ all -> 0x0bc3 }
            if (r0 != 0) goto L_0x045e
            java.lang.String r0 = "#EXT-X-GAP"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0bc3 }
            if (r0 != 0) goto L_0x0446
            java.lang.String r0 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r0 = r14.equals(r0)     // Catch:{ all -> 0x0bc3 }
            if (r0 != 0) goto L_0x0431
            r0 = r68
            boolean r4 = r14.equals(r0)     // Catch:{ all -> 0x0bc3 }
            if (r4 != 0) goto L_0x041a
            java.lang.String r4 = "#"
            boolean r4 = r14.startsWith(r4)     // Catch:{ all -> 0x0bc3 }
            if (r4 != 0) goto L_0x0408
            if (r18 != 0) goto L_0x0331
            r4 = 0
            goto L_0x033a
        L_0x0331:
            if (r22 != 0) goto L_0x0338
            java.lang.String r4 = java.lang.Long.toHexString(r53)     // Catch:{ all -> 0x0bc3 }
            goto L_0x033a
        L_0x0338:
            r4 = r22
        L_0x033a:
            r44 = 1
            long r71 = r53 + r44
            int r10 = (r60 > r23 ? 1 : (r60 == r23 ? 0 : -1))
            if (r10 == 0) goto L_0x0343
            goto L_0x0346
        L_0x0343:
            r42 = r25
        L_0x0346:
            if (r52 != 0) goto L_0x03af
            boolean r10 = r1.isEmpty()     // Catch:{ all -> 0x0bc3 }
            if (r10 != 0) goto L_0x03af
            java.util.Collection r10 = r1.values()     // Catch:{ all -> 0x0bc3 }
            r68 = r0
            r73 = r1
            r0 = 0
            anp[] r1 = new defpackage.anp[r0]     // Catch:{ all -> 0x0bc3 }
            java.lang.Object[] r0 = r10.toArray(r1)     // Catch:{ all -> 0x0bc3 }
            anp[] r0 = (defpackage.anp[]) r0     // Catch:{ all -> 0x0bc3 }
            anq r1 = new anq     // Catch:{ all -> 0x0bc3 }
            r1.<init>(r7, r0)     // Catch:{ all -> 0x0bc3 }
            if (r41 == 0) goto L_0x036f
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            goto L_0x03bd
        L_0x036f:
            int r10 = r0.length     // Catch:{ all -> 0x0bc3 }
            anp[] r10 = new defpackage.anp[r10]     // Catch:{ all -> 0x0bc3 }
            r44 = r1
            r1 = 0
        L_0x0375:
            r74 = r5
            int r5 = r0.length     // Catch:{ all -> 0x0bc3 }
            if (r1 < r5) goto L_0x038a
            anq r0 = new anq     // Catch:{ all -> 0x0bc3 }
            r0.<init>(r7, r10)     // Catch:{ all -> 0x0bc3 }
            r41 = r0
            r75 = r6
            r76 = r7
            r77 = r8
            r1 = r44
            goto L_0x03bd
        L_0x038a:
            r5 = r0[r1]     // Catch:{ all -> 0x0bc3 }
            r45 = r0
            anp r0 = new anp     // Catch:{ all -> 0x0bc3 }
            r75 = r6
            java.util.UUID r6 = r5.a     // Catch:{ all -> 0x0bc3 }
            r76 = r7
            java.lang.String r7 = r5.b     // Catch:{ all -> 0x0bc3 }
            java.lang.String r5 = r5.c     // Catch:{ all -> 0x0bc3 }
            r77 = r8
            r8 = 0
            r0.<init>(r6, r7, r5, r8)     // Catch:{ all -> 0x0bc3 }
            r10[r1] = r0     // Catch:{ all -> 0x0bc3 }
            int r1 = r1 + 1
            r0 = r45
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            goto L_0x0375
        L_0x03af:
            r68 = r0
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r1 = r52
        L_0x03bd:
            bcg r0 = new bcg     // Catch:{ all -> 0x0bc3 }
            java.lang.String r45 = a(r14, r3)     // Catch:{ all -> 0x0bc3 }
            r44 = r0
            r46 = r65
            r47 = r66
            r49 = r62
            r50 = r63
            r52 = r1
            r53 = r18
            r54 = r4
            r55 = r42
            r57 = r60
            r44.<init>(r45, r46, r47, r49, r50, r52, r53, r54, r55, r57, r59)     // Catch:{ all -> 0x0bc3 }
            r4 = r79
            r4.add(r0)     // Catch:{ all -> 0x0bc3 }
            long r63 = r63 + r66
            int r0 = (r60 > r23 ? 1 : (r60 == r23 ? 0 : -1))
            if (r0 == 0) goto L_0x03e7
            long r42 = r42 + r60
        L_0x03e7:
            r52 = r1
            r79 = r4
            r60 = r23
            r66 = r25
            r14 = r68
            r10 = r69
            r0 = r70
            r53 = r71
            r1 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r59 = 0
            r4 = r80
            goto L_0x0124
        L_0x0408:
            r4 = r79
            r68 = r0
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r1 = r19
            goto L_0x050d
        L_0x041a:
            r4 = r79
            r68 = r0
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r14 = r68
            r10 = r69
            r0 = r70
            r40 = 1
            goto L_0x045a
        L_0x0431:
            r4 = r79
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r14 = r68
            r10 = r69
            r0 = r70
            r39 = 1
            goto L_0x045a
        L_0x0446:
            r4 = r79
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r14 = r68
            r10 = r69
            r0 = r70
            r59 = 1
        L_0x045a:
            r4 = r80
            goto L_0x0124
        L_0x045e:
            r4 = r79
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            int r0 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r0 != 0) goto L_0x049b
            r0 = 58
            int r0 = r14.indexOf(r0)     // Catch:{ all -> 0x0bc3 }
            r1 = 1
            int r0 = r0 + r1
            java.lang.String r0 = r14.substring(r0)     // Catch:{ all -> 0x0bc3 }
            long r0 = defpackage.blm.f(r0)     // Catch:{ all -> 0x0bc3 }
            long r0 = defpackage.aja.b(r0)     // Catch:{ all -> 0x0bc3 }
            long r27 = r0 - r63
            r79 = r4
            r14 = r68
            r10 = r69
            r0 = r70
            r1 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r4 = r80
            goto L_0x0124
        L_0x049b:
            r1 = r19
            goto L_0x050d
        L_0x049f:
            r4 = r79
            r70 = r0
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            java.util.regex.Pattern r0 = defpackage.bck.o     // Catch:{ all -> 0x0bc3 }
            double r0 = b(r14, r0)     // Catch:{ all -> 0x0bc3 }
            double r0 = r0 * r44
            long r0 = (long) r0     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r5 = defpackage.bck.p     // Catch:{ all -> 0x0bc3 }
            java.lang.String r6 = ""
            a(r14, r5, r6, r3)     // Catch:{ all -> 0x0bc3 }
            r66 = r0
            r79 = r4
            r14 = r68
            r10 = r69
            r0 = r70
            r1 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r4 = r80
            goto L_0x0124
        L_0x04d6:
            r4 = r79
            r70 = r0
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            java.util.regex.Pattern r0 = defpackage.bck.I     // Catch:{ all -> 0x0bc3 }
            java.lang.String r0 = b(r14, r0, r3)     // Catch:{ all -> 0x0bc3 }
            if (r0 != 0) goto L_0x04fe
            java.util.regex.Pattern r0 = defpackage.bck.A     // Catch:{ all -> 0x0bc3 }
            java.lang.String r0 = a(r14, r0, r3)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r1 = defpackage.bck.H     // Catch:{ all -> 0x0bc3 }
            java.lang.String r1 = a(r14, r1, r3)     // Catch:{ all -> 0x0bc3 }
            r3.put(r0, r1)     // Catch:{ all -> 0x0bc3 }
            r1 = r19
            goto L_0x050d
        L_0x04fe:
            r1 = r19
            java.util.Map r5 = r1.h     // Catch:{ all -> 0x0bc3 }
            java.lang.Object r5 = r5.get(r0)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ all -> 0x0bc3 }
            if (r5 == 0) goto L_0x050d
            r3.put(r0, r5)     // Catch:{ all -> 0x0bc3 }
        L_0x050d:
            r19 = r1
            r79 = r4
            r14 = r68
            r10 = r69
            r0 = r70
            r1 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r4 = r80
            goto L_0x0124
        L_0x0525:
            r4 = r79
            r70 = r0
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r1 = r19
            java.util.regex.Pattern r0 = defpackage.bck.k     // Catch:{ all -> 0x0bc3 }
            int r0 = a(r14, r0)     // Catch:{ all -> 0x0bc3 }
            long r5 = (long) r0     // Catch:{ all -> 0x0bc3 }
            r7 = 1000000(0xf4240, double:4.940656E-318)
            long r36 = r5 * r7
            r19 = r1
            r79 = r4
            r14 = r68
            r10 = r69
            r0 = r70
            r1 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r4 = r80
            goto L_0x0124
        L_0x055a:
            r4 = r79
            r70 = r0
            r73 = r1
            r74 = r5
            r75 = r6
            r76 = r7
            r77 = r8
            r69 = r10
            r1 = r19
            java.util.regex.Pattern r0 = defpackage.bck.q     // Catch:{ all -> 0x0bc3 }
            double r5 = b(r14, r0)     // Catch:{ all -> 0x0bc3 }
            double r5 = r5 * r44
            long r5 = (long) r5     // Catch:{ all -> 0x0bc3 }
            r19 = r1
            r79 = r4
            r29 = r5
            r14 = r68
            r10 = r69
            r0 = r70
            r1 = r73
            r5 = r74
            r6 = r75
            r7 = r76
            r8 = r77
            r4 = r80
            goto L_0x0124
        L_0x058f:
            r4 = r79
            bch r0 = new bch     // Catch:{ all -> 0x0bc3 }
            int r1 = (r27 > r25 ? 1 : (r27 == r25 ? 0 : -1))
            if (r1 == 0) goto L_0x059a
            r16 = 1
            goto L_0x059d
        L_0x059a:
            r16 = 0
        L_0x059d:
            r18 = r0
            r19 = r21
            r21 = r2
            r22 = r29
            r24 = r27
            r26 = r31
            r27 = r32
            r28 = r33
            r30 = r35
            r31 = r36
            r33 = r39
            r34 = r40
            r35 = r16
            r36 = r41
            r37 = r4
            r18.<init>(r19, r20, r21, r22, r24, r26, r27, r28, r30, r31, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0bc3 }
        L_0x05be:
            defpackage.blm.a(r38)
            goto L_0x0964
        L_0x05c3:
            r38 = r2
            r69 = r10
            r3.add(r4)     // Catch:{ all -> 0x0bc3 }
            bcj r0 = new bcj     // Catch:{ all -> 0x0bc3 }
            r2 = r38
            r0.<init>(r3, r2)     // Catch:{ all -> 0x0bc5 }
            java.lang.String r3 = r79.toString()     // Catch:{ all -> 0x0bc5 }
            java.util.HashMap r4 = new java.util.HashMap     // Catch:{ all -> 0x0bc5 }
            r4.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.HashMap r5 = new java.util.HashMap     // Catch:{ all -> 0x0bc5 }
            r5.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r6.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r7.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r8.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r10 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r10.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r25 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r25.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r12.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r13.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r14.<init>()     // Catch:{ all -> 0x0bc5 }
            r15 = 0
            r28 = 0
        L_0x060a:
            boolean r18 = r0.a()     // Catch:{ all -> 0x0bc5 }
            r19 = -1
            if (r18 != 0) goto L_0x0965
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ all -> 0x0bc5 }
            r0.<init>()     // Catch:{ all -> 0x0bc5 }
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ all -> 0x0bc5 }
            r1.<init>()     // Catch:{ all -> 0x0bc5 }
            r9 = 0
        L_0x061d:
            int r11 = r6.size()     // Catch:{ all -> 0x0bc5 }
            if (r9 >= r11) goto L_0x06a2
            java.lang.Object r11 = r6.get(r9)     // Catch:{ all -> 0x0bc5 }
            bce r11 = (defpackage.bce) r11     // Catch:{ all -> 0x0bc5 }
            r38 = r2
            android.net.Uri r2 = r11.a     // Catch:{ all -> 0x0bc3 }
            boolean r2 = r1.add(r2)     // Catch:{ all -> 0x0bc3 }
            if (r2 == 0) goto L_0x068c
            akh r2 = r11.b     // Catch:{ all -> 0x0bc3 }
            atw r2 = r2.g     // Catch:{ all -> 0x0bc3 }
            if (r2 != 0) goto L_0x063b
            r2 = 1
            goto L_0x063d
        L_0x063b:
            r2 = 0
        L_0x063d:
            defpackage.bks.b(r2)     // Catch:{ all -> 0x0bc3 }
            bbw r2 = new bbw     // Catch:{ all -> 0x0bc3 }
            r79 = r1
            android.net.Uri r1 = r11.a     // Catch:{ all -> 0x0bc3 }
            java.lang.Object r1 = r4.get(r1)     // Catch:{ all -> 0x0bc3 }
            java.util.ArrayList r1 = (java.util.ArrayList) r1     // Catch:{ all -> 0x0bc3 }
            java.lang.Object r1 = defpackage.bks.a(r1)     // Catch:{ all -> 0x0bc3 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0bc3 }
            r18 = r4
            r4 = 0
            r2.<init>(r4, r4, r1)     // Catch:{ all -> 0x0bc3 }
            akh r1 = r11.b     // Catch:{ all -> 0x0bc3 }
            atw r4 = new atw     // Catch:{ all -> 0x0bc3 }
            r30 = r13
            r20 = r14
            r13 = 1
            atv[] r14 = new defpackage.atv[r13]     // Catch:{ all -> 0x0bc3 }
            r13 = 0
            r14[r13] = r2     // Catch:{ all -> 0x0bc3 }
            r4.<init>(r14)     // Catch:{ all -> 0x0bc3 }
            akh r33 = r1.a(r4)     // Catch:{ all -> 0x0bc3 }
            bce r1 = new bce     // Catch:{ all -> 0x0bc3 }
            android.net.Uri r2 = r11.a     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = r11.c     // Catch:{ all -> 0x0bc3 }
            java.lang.String r13 = r11.d     // Catch:{ all -> 0x0bc3 }
            java.lang.String r14 = r11.e     // Catch:{ all -> 0x0bc3 }
            java.lang.String r11 = r11.f     // Catch:{ all -> 0x0bc3 }
            r31 = r1
            r32 = r2
            r34 = r4
            r35 = r13
            r36 = r14
            r37 = r11
            r31.<init>(r32, r33, r34, r35, r36, r37)     // Catch:{ all -> 0x0bc3 }
            r0.add(r1)     // Catch:{ all -> 0x0bc3 }
            goto L_0x0694
        L_0x068c:
            r79 = r1
            r18 = r4
            r30 = r13
            r20 = r14
        L_0x0694:
            int r9 = r9 + 1
            r1 = r79
            r4 = r18
            r14 = r20
            r13 = r30
            r2 = r38
            goto L_0x061d
        L_0x06a2:
            r38 = r2
            r30 = r13
            r20 = r14
            r1 = 0
            r2 = 0
            r26 = 0
        L_0x06ae:
            int r4 = r12.size()     // Catch:{ all -> 0x0bc3 }
            if (r1 >= r4) goto L_0x0940
            java.lang.Object r4 = r12.get(r1)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r9 = defpackage.bck.B     // Catch:{ all -> 0x0bc3 }
            java.lang.String r9 = a(r4, r9, r5)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r11 = defpackage.bck.A     // Catch:{ all -> 0x0bc3 }
            java.lang.String r11 = a(r4, r11, r5)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r13 = defpackage.bck.w     // Catch:{ all -> 0x0bc3 }
            java.lang.String r13 = b(r4, r13, r5)     // Catch:{ all -> 0x0bc3 }
            if (r13 == 0) goto L_0x06d3
            android.net.Uri r13 = defpackage.blk.a(r3, r13)     // Catch:{ all -> 0x0bc3 }
            goto L_0x06d5
        L_0x06d3:
            r13 = 0
        L_0x06d5:
            java.util.regex.Pattern r14 = defpackage.bck.z     // Catch:{ all -> 0x0bc3 }
            java.lang.String r50 = b(r4, r14, r5)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r14 = defpackage.bck.F     // Catch:{ all -> 0x0bc3 }
            boolean r14 = c(r4, r14)     // Catch:{ all -> 0x0bc3 }
            r79 = r12
            java.util.regex.Pattern r12 = defpackage.bck.G     // Catch:{ all -> 0x0bc3 }
            boolean r12 = c(r4, r12)     // Catch:{ all -> 0x0bc3 }
            if (r12 != 0) goto L_0x06ec
            goto L_0x06ee
        L_0x06ec:
            r14 = r14 | 2
        L_0x06ee:
            java.util.regex.Pattern r12 = defpackage.bck.E     // Catch:{ all -> 0x0bc3 }
            boolean r12 = c(r4, r12)     // Catch:{ all -> 0x0bc3 }
            if (r12 != 0) goto L_0x06f9
            r49 = r14
            goto L_0x06fe
        L_0x06f9:
            r12 = r14 | 4
            r49 = r12
        L_0x06fe:
            java.util.regex.Pattern r12 = defpackage.bck.C     // Catch:{ all -> 0x0bc3 }
            java.lang.String r12 = b(r4, r12, r5)     // Catch:{ all -> 0x0bc3 }
            boolean r14 = android.text.TextUtils.isEmpty(r12)     // Catch:{ all -> 0x0bc3 }
            if (r14 != 0) goto L_0x0740
            java.lang.String r14 = ","
            java.lang.String[] r12 = defpackage.blm.a(r12, r14)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r14 = "public.accessibility.describes-video"
            boolean r14 = defpackage.blm.a(r12, r14)     // Catch:{ all -> 0x0bc3 }
            if (r14 != 0) goto L_0x071a
            r14 = 0
            goto L_0x071d
        L_0x071a:
            r14 = 512(0x200, float:7.175E-43)
        L_0x071d:
            r21 = r0
            java.lang.String r0 = "public.accessibility.transcribes-spoken-dialog"
            boolean r0 = defpackage.blm.a(r12, r0)     // Catch:{ all -> 0x0bc3 }
            if (r0 == 0) goto L_0x0729
            r14 = r14 | 4096(0x1000, float:5.74E-42)
        L_0x0729:
            java.lang.String r0 = "public.accessibility.describes-music-and-sound"
            boolean r0 = defpackage.blm.a(r12, r0)     // Catch:{ all -> 0x0bc3 }
            if (r0 == 0) goto L_0x0734
            r0 = r14 | 1024(0x400, float:1.435E-42)
            r14 = r0
        L_0x0734:
            java.lang.String r0 = "public.easy-to-read"
            boolean r0 = defpackage.blm.a(r12, r0)     // Catch:{ all -> 0x0bc3 }
            if (r0 == 0) goto L_0x0743
            r0 = r14 | 8192(0x2000, float:1.14794E-41)
            r14 = r0
            goto L_0x0743
        L_0x0740:
            r21 = r0
            r14 = 0
        L_0x0743:
            java.lang.String r0 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x0bc3 }
            int r0 = r0.length()     // Catch:{ all -> 0x0bc3 }
            r12 = 1
            int r0 = r0 + r12
            java.lang.String r12 = java.lang.String.valueOf(r11)     // Catch:{ all -> 0x0bc3 }
            int r12 = r12.length()     // Catch:{ all -> 0x0bc3 }
            int r0 = r0 + r12
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0bc3 }
            r12.<init>(r0)     // Catch:{ all -> 0x0bc3 }
            r12.append(r9)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r0 = ":"
            r12.append(r0)     // Catch:{ all -> 0x0bc3 }
            r12.append(r11)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r39 = r12.toString()     // Catch:{ all -> 0x0bc3 }
            atw r0 = new atw     // Catch:{ all -> 0x0bc3 }
            r22 = r3
            r12 = 1
            atv[] r3 = new defpackage.atv[r12]     // Catch:{ all -> 0x0bc3 }
            bbw r12 = new bbw     // Catch:{ all -> 0x0bc3 }
            r23 = r15
            java.util.List r15 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0bc3 }
            r12.<init>(r9, r11, r15)     // Catch:{ all -> 0x0bc3 }
            r15 = 0
            r3[r15] = r12     // Catch:{ all -> 0x0bc3 }
            r0.<init>(r3)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r3 = defpackage.bck.y     // Catch:{ all -> 0x0bc3 }
            java.lang.String r3 = a(r4, r3, r5)     // Catch:{ all -> 0x0bc3 }
            int r12 = r3.hashCode()
            switch(r12) {
                case -959297733: goto L_0x07af;
                case -333210994: goto L_0x07a5;
                case 62628790: goto L_0x079b;
                case 81665115: goto L_0x0790;
                default: goto L_0x078f;
            }
        L_0x078f:
            goto L_0x07b9
        L_0x0790:
            java.lang.String r12 = "VIDEO"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x078f
            r3 = 0
            goto L_0x07ba
        L_0x079b:
            java.lang.String r12 = "AUDIO"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x078f
            r3 = 1
            goto L_0x07ba
        L_0x07a5:
            java.lang.String r12 = "CLOSED-CAPTIONS"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x078f
            r3 = 3
            goto L_0x07ba
        L_0x07af:
            java.lang.String r12 = "SUBTITLES"
            boolean r3 = r3.equals(r12)
            if (r3 == 0) goto L_0x078f
            r3 = 2
            goto L_0x07ba
        L_0x07b9:
            r3 = -1
        L_0x07ba:
            if (r3 == 0) goto L_0x08c8
            r12 = 1
            if (r3 == r12) goto L_0x0839
            r12 = 2
            if (r3 == r12) goto L_0x0816
            r0 = 3
            if (r3 == r0) goto L_0x07c7
            goto L_0x08c5
        L_0x07c7:
            java.util.regex.Pattern r0 = defpackage.bck.D     // Catch:{ all -> 0x0bc3 }
            java.lang.String r0 = a(r4, r0, r5)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r3 = "CC"
            boolean r3 = r0.startsWith(r3)     // Catch:{ all -> 0x0bc3 }
            if (r3 != 0) goto L_0x07e5
            java.lang.String r3 = "application/cea-708"
            r12 = 7
            java.lang.String r0 = r0.substring(r12)     // Catch:{ all -> 0x0bc3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0bc3 }
            r48 = r0
            r42 = r3
            goto L_0x07f6
        L_0x07e5:
            r12 = 7
            java.lang.String r3 = "application/cea-608"
            r4 = 2
            java.lang.String r0 = r0.substring(r4)     // Catch:{ all -> 0x0bc3 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ all -> 0x0bc3 }
            r48 = r0
            r42 = r3
        L_0x07f6:
            if (r2 != 0) goto L_0x07fd
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x0bc3 }
            r2.<init>()     // Catch:{ all -> 0x0bc3 }
        L_0x07fd:
            r41 = 0
            r43 = 0
            r44 = -1
            r40 = r11
            r45 = r49
            r46 = r14
            r47 = r50
            akh r0 = defpackage.akh.a(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48)     // Catch:{ all -> 0x0bc3 }
            r2.add(r0)     // Catch:{ all -> 0x0bc3 }
            r12 = 2
            goto L_0x0933
        L_0x0816:
            r12 = 7
            java.lang.String r41 = "application/x-mpegURL"
            java.lang.String r42 = "text/vtt"
            r43 = -1
            r40 = r11
            r44 = r49
            r45 = r14
            r46 = r50
            akh r3 = defpackage.akh.a(r39, r40, r41, r42, r43, r44, r45, r46)     // Catch:{ all -> 0x0bc3 }
            akh r0 = r3.a(r0)     // Catch:{ all -> 0x0bc3 }
            bcd r3 = new bcd     // Catch:{ all -> 0x0bc3 }
            r3.<init>(r13, r0, r11)     // Catch:{ all -> 0x0bc3 }
            r10.add(r3)     // Catch:{ all -> 0x0bc3 }
            r12 = 2
            goto L_0x0933
        L_0x0839:
            r12 = 7
            r3 = 0
        L_0x083b:
            int r15 = r6.size()     // Catch:{ all -> 0x0bc3 }
            if (r3 >= r15) goto L_0x0853
            java.lang.Object r15 = r6.get(r3)     // Catch:{ all -> 0x0bc3 }
            bce r15 = (defpackage.bce) r15     // Catch:{ all -> 0x0bc3 }
            java.lang.String r12 = r15.d     // Catch:{ all -> 0x0bc3 }
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x0bc3 }
            if (r12 != 0) goto L_0x0855
            int r3 = r3 + 1
            r12 = 7
            goto L_0x083b
        L_0x0853:
            r15 = 0
        L_0x0855:
            if (r15 == 0) goto L_0x0863
            akh r3 = r15.b     // Catch:{ all -> 0x0bc3 }
            java.lang.String r3 = r3.f     // Catch:{ all -> 0x0bc3 }
            r9 = 1
            java.lang.String r3 = defpackage.blm.a(r3, r9)     // Catch:{ all -> 0x0bc3 }
            r43 = r3
            goto L_0x0866
        L_0x0863:
            r43 = 0
        L_0x0866:
            if (r43 == 0) goto L_0x086d
            java.lang.String r3 = defpackage.bkt.f(r43)     // Catch:{ all -> 0x0bc3 }
            goto L_0x086f
        L_0x086d:
            r3 = 0
        L_0x086f:
            java.util.regex.Pattern r9 = defpackage.bck.g     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = b(r4, r9, r5)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x089b
            java.lang.String r9 = "/"
            java.lang.String[] r9 = defpackage.blm.b(r4, r9)     // Catch:{ all -> 0x0bc3 }
            r12 = 0
            r9 = r9[r12]     // Catch:{ all -> 0x0bc3 }
            int r9 = java.lang.Integer.parseInt(r9)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r12 = "audio/eac3"
            boolean r12 = r12.equals(r3)     // Catch:{ all -> 0x0bc3 }
            if (r12 == 0) goto L_0x0896
            java.lang.String r12 = "/JOC"
            boolean r4 = r4.endsWith(r12)     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x0896
            java.lang.String r3 = "audio/eac3-joc"
        L_0x0896:
            r42 = r3
            r45 = r9
            goto L_0x089f
        L_0x089b:
            r42 = r3
            r45 = -1
        L_0x089f:
            java.lang.String r41 = "application/x-mpegURL"
            r44 = -1
            r46 = -1
            r47 = 0
            r40 = r11
            r48 = r49
            r49 = r14
            akh r3 = defpackage.akh.a(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x0bc3 }
            if (r13 == 0) goto L_0x08c3
            bcd r4 = new bcd     // Catch:{ all -> 0x0bc3 }
            akh r0 = r3.a(r0)     // Catch:{ all -> 0x0bc3 }
            r4.<init>(r13, r0, r11)     // Catch:{ all -> 0x0bc3 }
            r8.add(r4)     // Catch:{ all -> 0x0bc3 }
            r12 = 2
            goto L_0x0933
        L_0x08c3:
            r26 = r3
        L_0x08c5:
            r12 = 2
            goto L_0x0933
        L_0x08c8:
            r3 = 0
        L_0x08ca:
            int r4 = r6.size()     // Catch:{ all -> 0x0bc3 }
            if (r3 >= r4) goto L_0x08e1
            java.lang.Object r4 = r6.get(r3)     // Catch:{ all -> 0x0bc3 }
            bce r4 = (defpackage.bce) r4     // Catch:{ all -> 0x0bc3 }
            java.lang.String r12 = r4.c     // Catch:{ all -> 0x0bc3 }
            boolean r12 = r9.equals(r12)     // Catch:{ all -> 0x0bc3 }
            if (r12 != 0) goto L_0x08e3
            int r3 = r3 + 1
            goto L_0x08ca
        L_0x08e1:
            r4 = 0
        L_0x08e3:
            if (r4 == 0) goto L_0x08fd
            akh r3 = r4.b     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = r3.f     // Catch:{ all -> 0x0bc3 }
            r12 = 2
            java.lang.String r4 = defpackage.blm.a(r4, r12)     // Catch:{ all -> 0x0bc3 }
            int r9 = r3.n     // Catch:{ all -> 0x0bc3 }
            int r15 = r3.o     // Catch:{ all -> 0x0bc3 }
            float r3 = r3.p     // Catch:{ all -> 0x0bc3 }
            r47 = r3
            r43 = r4
            r45 = r9
            r46 = r15
            goto L_0x0908
        L_0x08fd:
            r12 = 2
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r43 = 0
            r45 = -1
            r46 = -1
            r47 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0908:
            if (r43 == 0) goto L_0x0911
            java.lang.String r3 = defpackage.bkt.f(r43)     // Catch:{ all -> 0x0bc3 }
            r42 = r3
            goto L_0x0914
        L_0x0911:
            r42 = 0
        L_0x0914:
            java.lang.String r41 = "application/x-mpegURL"
            r44 = -1
            r48 = 0
            r40 = r11
            r50 = r14
            akh r3 = defpackage.akh.a(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x0bc3 }
            akh r0 = r3.a(r0)     // Catch:{ all -> 0x0bc3 }
            if (r13 == 0) goto L_0x0932
            bcd r3 = new bcd     // Catch:{ all -> 0x0bc3 }
            r3.<init>(r13, r0, r11)     // Catch:{ all -> 0x0bc3 }
            r7.add(r3)     // Catch:{ all -> 0x0bc3 }
            goto L_0x0933
        L_0x0932:
        L_0x0933:
            int r1 = r1 + 1
            r12 = r79
            r0 = r21
            r3 = r22
            r15 = r23
            goto L_0x06ae
        L_0x0940:
            r21 = r0
            r22 = r3
            r23 = r15
            if (r23 == 0) goto L_0x094f
            java.util.List r0 = java.util.Collections.emptyList()     // Catch:{ all -> 0x0bc3 }
            r27 = r0
            goto L_0x0951
        L_0x094f:
            r27 = r2
        L_0x0951:
            bcf r0 = new bcf     // Catch:{ all -> 0x0bc3 }
            r18 = r0
            r19 = r22
            r22 = r7
            r23 = r8
            r24 = r10
            r29 = r5
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ all -> 0x0bc3 }
            goto L_0x05be
        L_0x0964:
            return r0
        L_0x0965:
            r38 = r2
            r22 = r3
            r18 = r4
            r79 = r12
            r30 = r13
            r20 = r14
            r23 = r15
            r12 = 2
            java.lang.String r2 = r0.b()     // Catch:{ all -> 0x0bc3 }
            r3 = r69
            boolean r4 = r2.startsWith(r3)     // Catch:{ all -> 0x0bc3 }
            if (r4 != 0) goto L_0x0983
            r4 = r20
            goto L_0x0988
        L_0x0983:
            r4 = r20
            r4.add(r2)     // Catch:{ all -> 0x0bc3 }
        L_0x0988:
            boolean r13 = r2.startsWith(r9)     // Catch:{ all -> 0x0bc3 }
            if (r13 == 0) goto L_0x09b6
            java.util.regex.Pattern r13 = defpackage.bck.A     // Catch:{ all -> 0x0bc3 }
            java.lang.String r13 = a(r2, r13, r5)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r14 = defpackage.bck.H     // Catch:{ all -> 0x0bc3 }
            java.lang.String r2 = a(r2, r14, r5)     // Catch:{ all -> 0x0bc3 }
            r5.put(r13, r2)     // Catch:{ all -> 0x0bc3 }
            r13 = r79
        L_0x09a0:
            r24 = r0
            r20 = r1
            r69 = r3
            r21 = r4
            r79 = r5
            r26 = r7
            r0 = r18
            r19 = r30
        L_0x09b0:
            r16 = 1
            r18 = r6
            goto L_0x0b5f
        L_0x09b6:
            java.lang.String r13 = "#EXT-X-INDEPENDENT-SEGMENTS"
            boolean r13 = r2.equals(r13)     // Catch:{ all -> 0x0bc3 }
            if (r13 != 0) goto L_0x0b77
            java.lang.String r13 = "#EXT-X-MEDIA"
            boolean r13 = r2.startsWith(r13)     // Catch:{ all -> 0x0bc3 }
            if (r13 == 0) goto L_0x09cc
            r13 = r79
            r13.add(r2)     // Catch:{ all -> 0x0bc3 }
            goto L_0x09a0
        L_0x09cc:
            r13 = r79
            java.lang.String r14 = "#EXT-X-SESSION-KEY"
            boolean r14 = r2.startsWith(r14)     // Catch:{ all -> 0x0bc3 }
            if (r14 == 0) goto L_0x0a25
            java.util.regex.Pattern r14 = defpackage.bck.u     // Catch:{ all -> 0x0bc3 }
            java.lang.String r14 = a(r2, r14, r11, r5)     // Catch:{ all -> 0x0bc3 }
            anp r14 = a(r2, r14, r5)     // Catch:{ all -> 0x0bc3 }
            if (r14 == 0) goto L_0x0a0d
            java.util.regex.Pattern r15 = defpackage.bck.t     // Catch:{ all -> 0x0bc3 }
            java.lang.String r2 = a(r2, r15, r5)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r2 = a(r2)     // Catch:{ all -> 0x0bc3 }
            anq r15 = new anq     // Catch:{ all -> 0x0bc3 }
            r69 = r3
            r12 = 1
            anp[] r3 = new defpackage.anp[r12]     // Catch:{ all -> 0x0bc3 }
            r12 = 0
            r3[r12] = r14     // Catch:{ all -> 0x0bc3 }
            r15.<init>(r2, r3)     // Catch:{ all -> 0x0bc3 }
            r3 = r30
            r3.add(r15)     // Catch:{ all -> 0x0bc3 }
            r24 = r0
            r20 = r1
            r19 = r3
            r21 = r4
            r79 = r5
            r26 = r7
            r0 = r18
            goto L_0x09b0
        L_0x0a0d:
            r69 = r3
            r3 = r30
            r24 = r0
            r20 = r1
            r19 = r3
            r21 = r4
            r79 = r5
            r26 = r7
            r0 = r18
            r16 = 1
            r18 = r6
            goto L_0x0b5f
        L_0x0a25:
            r69 = r3
            r3 = r30
            boolean r12 = r2.startsWith(r1)     // Catch:{ all -> 0x0bc3 }
            if (r12 == 0) goto L_0x0b4d
            java.lang.String r12 = "CLOSED-CAPTIONS=NONE"
            boolean r12 = r2.contains(r12)     // Catch:{ all -> 0x0bc3 }
            r15 = r23 | r12
            java.util.regex.Pattern r12 = defpackage.bck.f     // Catch:{ all -> 0x0bc3 }
            int r12 = a(r2, r12)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r14 = defpackage.bck.a     // Catch:{ all -> 0x0bc3 }
            java.lang.String r14 = b(r2, r14, r5)     // Catch:{ all -> 0x0bc3 }
            if (r14 != 0) goto L_0x0a46
            goto L_0x0a4a
        L_0x0a46:
            int r12 = java.lang.Integer.parseInt(r14)     // Catch:{ all -> 0x0bc3 }
        L_0x0a4a:
            java.util.regex.Pattern r14 = defpackage.bck.h     // Catch:{ all -> 0x0bc3 }
            java.lang.String r43 = b(r2, r14, r5)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r14 = defpackage.bck.i     // Catch:{ all -> 0x0bc3 }
            java.lang.String r14 = b(r2, r14, r5)     // Catch:{ all -> 0x0bc3 }
            if (r14 == 0) goto L_0x0a7e
            r20 = r1
            java.lang.String r1 = "x"
            java.lang.String[] r1 = r14.split(r1)     // Catch:{ all -> 0x0bc3 }
            r14 = 0
            r17 = r1[r14]     // Catch:{ all -> 0x0bc3 }
            int r17 = java.lang.Integer.parseInt(r17)     // Catch:{ all -> 0x0bc3 }
            r16 = 1
            r1 = r1[r16]     // Catch:{ all -> 0x0bc3 }
            int r1 = java.lang.Integer.parseInt(r1)     // Catch:{ all -> 0x0bc3 }
            if (r17 > 0) goto L_0x0a74
        L_0x0a71:
            r17 = -1
            goto L_0x0a79
        L_0x0a74:
            if (r1 <= 0) goto L_0x0a71
            r19 = r1
        L_0x0a79:
            r45 = r17
            r46 = r19
            goto L_0x0a87
        L_0x0a7e:
            r20 = r1
            r14 = 0
            r16 = 1
            r45 = -1
            r46 = -1
        L_0x0a87:
            java.util.regex.Pattern r1 = defpackage.bck.j     // Catch:{ all -> 0x0bc3 }
            java.lang.String r1 = b(r2, r1, r5)     // Catch:{ all -> 0x0bc3 }
            if (r1 == 0) goto L_0x0a96
            float r1 = java.lang.Float.parseFloat(r1)     // Catch:{ all -> 0x0bc3 }
            r47 = r1
            goto L_0x0a9a
        L_0x0a96:
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r47 = -1082130432(0xffffffffbf800000, float:-1.0)
        L_0x0a9a:
            java.util.regex.Pattern r1 = defpackage.bck.b     // Catch:{ all -> 0x0bc3 }
            java.lang.String r1 = b(r2, r1, r5)     // Catch:{ all -> 0x0bc3 }
            java.util.regex.Pattern r14 = defpackage.bck.c     // Catch:{ all -> 0x0bc3 }
            java.lang.String r14 = b(r2, r14, r5)     // Catch:{ all -> 0x0bc3 }
            r19 = r3
            java.util.regex.Pattern r3 = defpackage.bck.d     // Catch:{ all -> 0x0bc3 }
            java.lang.String r3 = b(r2, r3, r5)     // Catch:{ all -> 0x0bc3 }
            r21 = r4
            java.util.regex.Pattern r4 = defpackage.bck.e     // Catch:{ all -> 0x0bc3 }
            java.lang.String r2 = b(r2, r4, r5)     // Catch:{ all -> 0x0bc3 }
            boolean r4 = r0.a()     // Catch:{ all -> 0x0bc3 }
            if (r4 == 0) goto L_0x0b45
            java.lang.String r4 = r0.b()     // Catch:{ all -> 0x0bc3 }
            java.lang.String r4 = a(r4, r5)     // Catch:{ all -> 0x0bc3 }
            r24 = r0
            r0 = r22
            android.net.Uri r4 = defpackage.blk.a(r0, r4)     // Catch:{ all -> 0x0bc3 }
            int r22 = r6.size()     // Catch:{ all -> 0x0bc3 }
            java.lang.String r39 = java.lang.Integer.toString(r22)     // Catch:{ all -> 0x0bc3 }
            java.lang.String r41 = "application/x-mpegURL"
            r40 = 0
            r42 = 0
            r48 = 0
            r49 = 0
            r50 = 0
            r44 = r12
            akh r31 = defpackage.akh.a(r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50)     // Catch:{ all -> 0x0bc3 }
            r22 = r0
            bce r0 = new bce     // Catch:{ all -> 0x0bc3 }
            r29 = r0
            r30 = r4
            r32 = r1
            r33 = r14
            r34 = r3
            r35 = r2
            r29.<init>(r30, r31, r32, r33, r34, r35)     // Catch:{ all -> 0x0bc3 }
            r6.add(r0)     // Catch:{ all -> 0x0bc3 }
            r0 = r18
            java.lang.Object r18 = r0.get(r4)     // Catch:{ all -> 0x0bc3 }
            java.util.ArrayList r18 = (java.util.ArrayList) r18     // Catch:{ all -> 0x0bc3 }
            if (r18 != 0) goto L_0x0b11
            r79 = r5
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ all -> 0x0bc3 }
            r5.<init>()     // Catch:{ all -> 0x0bc3 }
            r0.put(r4, r5)     // Catch:{ all -> 0x0bc3 }
            goto L_0x0b15
        L_0x0b11:
            r79 = r5
            r5 = r18
        L_0x0b15:
            bbv r4 = new bbv     // Catch:{ all -> 0x0bc3 }
            r18 = r6
            r26 = r7
            long r6 = (long) r12     // Catch:{ all -> 0x0bc3 }
            r29 = r4
            r30 = r6
            r32 = r1
            r33 = r14
            r34 = r3
            r35 = r2
            r29.<init>(r30, r32, r33, r34, r35)     // Catch:{ all -> 0x0bc3 }
            r5.add(r4)     // Catch:{ all -> 0x0bc3 }
            r5 = r79
            r4 = r0
            r12 = r13
            r6 = r18
            r13 = r19
            r1 = r20
            r14 = r21
            r3 = r22
            r0 = r24
            r7 = r26
            r2 = r38
            goto L_0x060a
        L_0x0b45:
            ako r0 = new ako     // Catch:{ all -> 0x0bc3 }
            java.lang.String r1 = "#EXT-X-STREAM-INF tag must be followed by another line"
            r0.<init>(r1)     // Catch:{ all -> 0x0bc3 }
            throw r0     // Catch:{ all -> 0x0bc3 }
        L_0x0b4d:
            r24 = r0
            r20 = r1
            r19 = r3
            r21 = r4
            r79 = r5
            r26 = r7
            r0 = r18
            r16 = 1
            r18 = r6
        L_0x0b5f:
            r5 = r79
            r4 = r0
            r12 = r13
            r6 = r18
            r13 = r19
            r1 = r20
            r14 = r21
            r3 = r22
            r15 = r23
            r0 = r24
            r7 = r26
            r2 = r38
            goto L_0x060a
        L_0x0b77:
            r13 = r79
            r24 = r0
            r20 = r1
            r69 = r3
            r21 = r4
            r79 = r5
            r26 = r7
            r0 = r18
            r19 = r30
            r16 = 1
            r18 = r6
            r4 = r0
            r12 = r13
            r13 = r19
            r14 = r21
            r3 = r22
            r15 = r23
            r0 = r24
            r2 = r38
            r28 = 1
            goto L_0x060a
        L_0x0b9f:
            r70 = r0
            r20 = r1
            r38 = r2
            r16 = 1
            r5 = 1
            r6 = 0
            r8 = 7
            goto L_0x005f
        L_0x0bac:
            r38 = r2
            defpackage.blm.a(r38)
            ako r0 = new ako
            java.lang.String r1 = "Failed to parse the playlist, could not identify any tags."
            r0.<init>(r1)
            throw r0
        L_0x0bb9:
            r38 = r2
        L_0x0bbb:
            ayf r0 = new ayf     // Catch:{ all -> 0x0bc3 }
            java.lang.String r1 = "Input does not start with the #EXTM3U header."
            r0.<init>(r1)     // Catch:{ all -> 0x0bc3 }
            throw r0     // Catch:{ all -> 0x0bc3 }
        L_0x0bc3:
            r0 = move-exception
            goto L_0x0bc8
        L_0x0bc5:
            r0 = move-exception
            r38 = r2
        L_0x0bc8:
            defpackage.blm.a(r38)
            goto L_0x0bcd
        L_0x0bcc:
            throw r0
        L_0x0bcd:
            goto L_0x0bcc
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bck.a(android.net.Uri, java.io.InputStream):java.lang.Object");
    }

    private static double b(String str, Pattern pattern) {
        return Double.parseDouble(a(str, pattern, Collections.emptyMap()));
    }

    private static anp a(String str, String str2, Map map) {
        String a2 = a(str, v, "1", map);
        if ("urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2)) {
            String a3 = a(str, w, map);
            return new anp(aja.c, "video/mp4", Base64.decode(a3.substring(a3.indexOf(44)), 0));
        } else if ("com.widevine".equals(str2)) {
            return new anp(aja.c, "hls", blm.c(str));
        } else {
            if (!"com.microsoft.playready".equals(str2) || !"1".equals(a2)) {
                return null;
            }
            String a4 = a(str, w, map);
            return new anp(aja.d, "video/mp4", bty.a(aja.d, Base64.decode(a4.substring(a4.indexOf(44)), 0)));
        }
    }

    private static String a(String str) {
        return (!"SAMPLE-AES-CENC".equals(str) && !"SAMPLE-AES-CTR".equals(str)) ? "cbcs" : "cenc";
    }

    private static int a(String str, Pattern pattern) {
        return Integer.parseInt(a(str, pattern, Collections.emptyMap()));
    }

    private static boolean c(String str, Pattern pattern) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            return matcher.group(1).equals("YES");
        }
        return false;
    }

    private static String a(String str, Pattern pattern, String str2, Map map) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            str2 = matcher.group(1);
        }
        return (map.isEmpty() || str2 == null) ? str2 : a(str2, map);
    }

    private static String b(String str, Pattern pattern, Map map) {
        return a(str, pattern, null, map);
    }

    private static String a(String str, Pattern pattern, Map map) {
        String b2 = b(str, pattern, map);
        if (b2 != null) {
            return b2;
        }
        String pattern2 = pattern.pattern();
        StringBuilder sb = new StringBuilder(String.valueOf(pattern2).length() + 19 + String.valueOf(str).length());
        sb.append("Couldn't match ");
        sb.append(pattern2);
        sb.append(" in ");
        sb.append(str);
        throw new ako(sb.toString());
    }

    private static String a(String str, Map map) {
        Matcher matcher = J.matcher(str);
        StringBuffer stringBuffer = new StringBuffer();
        while (matcher.find()) {
            String group = matcher.group(1);
            if (map.containsKey(group)) {
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    private static int a(BufferedReader bufferedReader, boolean z2, int i2) {
        while (i2 != -1 && Character.isWhitespace(i2) && (z2 || !blm.a(i2))) {
            i2 = bufferedReader.read();
        }
        return i2;
    }
}
