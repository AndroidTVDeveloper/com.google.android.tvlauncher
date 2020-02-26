package p000;

import java.util.regex.Pattern;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: bfa */
/* compiled from: PG */
public final class bfa extends anm {

    /* renamed from: d */
    private static final Pattern f3614d = Pattern.compile("^([0-9][0-9]+):([0-9][0-9]):([0-9][0-9])(?:(\\.[0-9]+)|:([0-9][0-9])(?:\\.([0-9]+))?)?$");

    /* renamed from: e */
    private static final Pattern f3615e = Pattern.compile("^([0-9]+(?:\\.[0-9]+)?)(h|m|s|ms|f|t)$");

    /* renamed from: f */
    private static final Pattern f3616f = Pattern.compile("^(([0-9]*.)?[0-9]+)(px|em|%)$");

    /* renamed from: g */
    private static final Pattern f3617g = Pattern.compile("^(\\d+\\.?\\d*?)% (\\d+\\.?\\d*?)%$");

    /* renamed from: h */
    private static final Pattern f3618h = Pattern.compile("^(\\d+\\.?\\d*?)px (\\d+\\.?\\d*?)px$");

    /* renamed from: i */
    private static final Pattern f3619i = Pattern.compile("^(\\d+) (\\d+)$");

    /* renamed from: j */
    private static final bey f3620j = new bey(30.0f, 1, 1);

    /* renamed from: k */
    private static final bex f3621k = new bex(15);

    /* renamed from: l */
    private final XmlPullParserFactory f3622l;

    public bfa() {
        try {
            XmlPullParserFactory newInstance = XmlPullParserFactory.newInstance();
            this.f3622l = newInstance;
            newInstance.setNamespaceAware(true);
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: a */
    private static final bfd m3018a(bfd bfd) {
        return bfd == null ? new bfd() : bfd;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0212 A[SYNTHETIC, Splitter:B:103:0x0212] */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x02a0 A[Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }, LOOP:1: B:139:0x02a0->B:283:0x0558, LOOP_START, PHI: r2 r4 
      PHI: (r2v25 java.lang.String) = (r2v10 java.lang.String), (r2v27 java.lang.String) binds: [B:138:0x029e, B:283:0x0558] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r4v15 java.lang.String) = (r4v3 java.lang.String), (r4v16 java.lang.String) binds: [B:138:0x029e, B:283:0x0558] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x048a  */
    /* JADX WARNING: Removed duplicated region for block: B:249:0x0496  */
    /* JADX WARNING: Removed duplicated region for block: B:284:0x055e  */
    /* JADX WARNING: Removed duplicated region for block: B:307:0x05aa  */
    /* JADX WARNING: Removed duplicated region for block: B:327:0x05dd A[Catch:{ bdn -> 0x05e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:328:0x05de A[Catch:{ bdn -> 0x05e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0158 A[Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x015e A[Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x0192 A[Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01e8 A[Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.bdl mo1155a(byte[] r40, int r41, boolean r42) {
        /*
            r39 = this;
            java.lang.String r1 = ""
            java.lang.String r2 = "\n"
            java.lang.String r3 = "http://www.w3.org/ns/ttml#parameter"
            r4 = r39
            org.xmlpull.v1.XmlPullParserFactory r5 = r4.f3622l     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            org.xmlpull.v1.XmlPullParser r5 = r5.newPullParser()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.HashMap r6 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.HashMap r7 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r7.<init>()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.HashMap r8 = new java.util.HashMap     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bfc r9 = new bfc     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r7.put(r1, r9)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.io.ByteArrayInputStream r9 = new java.io.ByteArrayInputStream     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r10 = 0
            r11 = r40
            r12 = r41
            r9.<init>(r11, r10, r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r11 = 0
            r5.setInput(r9, r11)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.ArrayDeque r9 = new java.util.ArrayDeque     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r12 = r5.getEventType()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bey r13 = p000.bfa.f3620j     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bex r14 = p000.bfa.f3621k     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r17 = r11
            r15 = r13
            r16 = r14
            r14 = 0
            r13 = r17
        L_0x0048:
            r11 = 1
            if (r12 == r11) goto L_0x07a9
            java.lang.Object r18 = r9.peek()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r11 = r18
            bfb r11 = (p000.bfb) r11     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r14 != 0) goto L_0x0772
            java.lang.String r10 = r5.getName()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r19 = r1
            java.lang.String r1 = "tt"
            java.lang.String r4 = " "
            r20 = r15
            r15 = 2
            if (r12 != r15) goto L_0x06ee
            boolean r12 = r1.equals(r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r15 = "TtmlDecoder"
            if (r12 == 0) goto L_0x01ef
            java.lang.String r12 = "frameRate"
            java.lang.String r12 = r5.getAttributeValue(r3, r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r12 == 0) goto L_0x0079
            int r12 = java.lang.Integer.parseInt(r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x007b
        L_0x0079:
            r12 = 30
        L_0x007b:
            r21 = r13
            java.lang.String r13 = "frameRateMultiplier"
            java.lang.String r13 = r5.getAttributeValue(r3, r13)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r13 == 0) goto L_0x00ae
            java.lang.String[] r13 = p000.blm.m3658a(r13, r4)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r22 = r14
            int r14 = r13.length     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r23 = r2
            r2 = 2
            if (r14 != r2) goto L_0x00a6
            r2 = 0
            r14 = r13[r2]     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r14 = java.lang.Integer.parseInt(r14)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            float r14 = (float) r14     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r16 = 1
            r13 = r13[r16]     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r13 = java.lang.Integer.parseInt(r13)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            float r13 = (float) r13     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            float r13 = r14 / r13
            goto L_0x00b5
        L_0x00a6:
            bdn r1 = new bdn     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r2 = "frameRateMultiplier doesn't have 2 parts"
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            throw r1     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x00ae:
            r23 = r2
            r22 = r14
            r2 = 0
            r13 = 1065353216(0x3f800000, float:1.0)
        L_0x00b5:
            bey r14 = p000.bfa.f3620j     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r14 = r14.f3608b     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r2 = "subFrameRate"
            java.lang.String r2 = r5.getAttributeValue(r3, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r2 != 0) goto L_0x00c2
            goto L_0x00c6
        L_0x00c2:
            int r14 = java.lang.Integer.parseInt(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x00c6:
            bey r2 = p000.bfa.f3620j     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r2 = r2.f3609c     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r16 = r2
            java.lang.String r2 = "tickRate"
            java.lang.String r2 = r5.getAttributeValue(r3, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r2 != 0) goto L_0x00d7
            r2 = r16
            goto L_0x00db
        L_0x00d7:
            int r2 = java.lang.Integer.parseInt(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x00db:
            r24 = r9
            bey r9 = new bey     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            float r12 = (float) r12     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            float r12 = r12 * r13
            r9.<init>(r12, r14, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bex r2 = p000.bfa.f3621k     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r12 = "cellResolution"
            java.lang.String r12 = r5.getAttributeValue(r3, r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r12 == 0) goto L_0x0184
            java.util.regex.Pattern r13 = p000.bfa.f3619i     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.regex.Matcher r13 = r13.matcher(r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            boolean r14 = r13.matches()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r14 == 0) goto L_0x0167
            r14 = 1
            java.lang.String r16 = r13.group(r14)     // Catch:{ NumberFormatException -> 0x0149 }
            int r14 = java.lang.Integer.parseInt(r16)     // Catch:{ NumberFormatException -> 0x0149 }
            r16 = r2
            r2 = 2
            java.lang.String r13 = r13.group(r2)     // Catch:{ NumberFormatException -> 0x0147 }
            int r2 = java.lang.Integer.parseInt(r13)     // Catch:{ NumberFormatException -> 0x0147 }
            if (r14 == 0) goto L_0x0120
            if (r2 == 0) goto L_0x0120
            bex r4 = new bex     // Catch:{ NumberFormatException -> 0x0147 }
            r4.<init>(r2)     // Catch:{ NumberFormatException -> 0x0147 }
            r25 = r3
            r16 = r4
            r17 = r9
            goto L_0x018a
        L_0x0120:
            bdn r13 = new bdn     // Catch:{ NumberFormatException -> 0x0147 }
            r25 = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ NumberFormatException -> 0x0145 }
            r17 = r9
            r9 = 47
            r3.<init>(r9)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r9 = "Invalid cell resolution "
            r3.append(r9)     // Catch:{ NumberFormatException -> 0x0143 }
            r3.append(r14)     // Catch:{ NumberFormatException -> 0x0143 }
            r3.append(r4)     // Catch:{ NumberFormatException -> 0x0143 }
            r3.append(r2)     // Catch:{ NumberFormatException -> 0x0143 }
            java.lang.String r2 = r3.toString()     // Catch:{ NumberFormatException -> 0x0143 }
            r13.<init>(r2)     // Catch:{ NumberFormatException -> 0x0143 }
            throw r13     // Catch:{ NumberFormatException -> 0x0143 }
        L_0x0143:
            r0 = move-exception
            goto L_0x0150
        L_0x0145:
            r0 = move-exception
            goto L_0x014e
        L_0x0147:
            r0 = move-exception
            goto L_0x014c
        L_0x0149:
            r0 = move-exception
            r16 = r2
        L_0x014c:
            r25 = r3
        L_0x014e:
            r17 = r9
        L_0x0150:
            java.lang.String r2 = "Ignoring malformed cell resolution: "
            int r3 = r12.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r3 != 0) goto L_0x015e
            java.lang.String r3 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r3.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x0162
        L_0x015e:
            java.lang.String r3 = r2.concat(r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x0162:
            android.util.Log.w(r15, r3)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x018a
        L_0x0167:
            r16 = r2
            r25 = r3
            r17 = r9
            java.lang.String r2 = "Ignoring malformed cell resolution: "
            int r3 = r12.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r3 != 0) goto L_0x017b
            java.lang.String r3 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r3.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x017f
        L_0x017b:
            java.lang.String r3 = r2.concat(r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x017f:
            android.util.Log.w(r15, r3)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x018a
        L_0x0184:
            r16 = r2
            r25 = r3
            r17 = r9
        L_0x018a:
            java.lang.String r2 = "extent"
            java.lang.String r2 = p000.bmp.m3768c(r5, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r2 == 0) goto L_0x01e8
            java.util.regex.Pattern r3 = p000.bfa.f3618h     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.regex.Matcher r3 = r3.matcher(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            boolean r4 = r3.matches()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r4 == 0) goto L_0x01cf
            r4 = 1
            java.lang.String r9 = r3.group(r4)     // Catch:{ NumberFormatException -> 0x01b6 }
            int r4 = java.lang.Integer.parseInt(r9)     // Catch:{ NumberFormatException -> 0x01b6 }
            r9 = 2
            java.lang.String r3 = r3.group(r9)     // Catch:{ NumberFormatException -> 0x01b6 }
            int r3 = java.lang.Integer.parseInt(r3)     // Catch:{ NumberFormatException -> 0x01b6 }
            bez r9 = new bez     // Catch:{ NumberFormatException -> 0x01b6 }
            r9.<init>(r4, r3)     // Catch:{ NumberFormatException -> 0x01b6 }
            goto L_0x01ea
        L_0x01b6:
            r0 = move-exception
            java.lang.String r3 = "Ignoring malformed tts extent: "
            int r4 = r2.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r4 != 0) goto L_0x01c5
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x01c9
        L_0x01c5:
            java.lang.String r2 = r3.concat(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x01c9:
            android.util.Log.w(r15, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r9 = 0
            goto L_0x01ea
        L_0x01cf:
            java.lang.String r3 = "Ignoring non-pixel tts extent: "
            int r4 = r2.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r4 != 0) goto L_0x01de
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x01e2
        L_0x01de:
            java.lang.String r2 = r3.concat(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x01e2:
            android.util.Log.w(r15, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r9 = 0
            goto L_0x01ea
        L_0x01e8:
            r9 = 0
        L_0x01ea:
            r3 = r16
            r2 = r17
            goto L_0x01ff
        L_0x01ef:
            r23 = r2
            r25 = r3
            r24 = r9
            r21 = r13
            r22 = r14
            r3 = r16
            r9 = r17
            r2 = r20
        L_0x01ff:
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r4 = "image"
            java.lang.String r12 = "metadata"
            java.lang.String r13 = "region"
            java.lang.String r14 = "head"
            r16 = r2
            java.lang.String r2 = "style"
            if (r1 != 0) goto L_0x0299
            boolean r1 = r10.equals(r14)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "body"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "div"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "p"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "span"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "br"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            boolean r1 = r10.equals(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "styling"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "layout"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            boolean r1 = r10.equals(r13)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            boolean r1 = r10.equals(r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            boolean r1 = r10.equals(r4)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "data"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "information"
            boolean r1 = r10.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x0299
            java.lang.String r1 = "Ignoring unsupported tag: "
            java.lang.String r2 = r5.getName()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r4 = r2.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r4 == 0) goto L_0x0293
            r1.concat(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x028b:
            r10 = r23
            r2 = r24
            r22 = 1
            goto L_0x0767
        L_0x0293:
            java.lang.String r2 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2.<init>(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x028b
        L_0x0299:
            boolean r1 = r14.equals(r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x055e
        L_0x02a0:
            r5.next()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            boolean r1 = p000.bmp.m3767b(r5, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x02e9
            java.lang.String r1 = p000.bmp.m3768c(r5, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bfd r11 = new bfd     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bfd r11 = m3019a(r5, r11)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x02d4
            java.lang.String[] r1 = m3020a(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r10 = r1.length     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r20 = r2
            r2 = 0
        L_0x02c0:
            if (r2 >= r10) goto L_0x02d6
            r18 = r10
            r10 = r1[r2]     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.Object r10 = r6.get(r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bfd r10 = (p000.bfd) r10     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r11.mo1815a(r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r2 = r2 + 1
            r10 = r18
            goto L_0x02c0
        L_0x02d4:
            r20 = r2
        L_0x02d6:
            java.lang.String r1 = r11.f3655l     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 != 0) goto L_0x02e0
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x054c
        L_0x02e0:
            r6.put(r1, r11)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x054c
        L_0x02e9:
            r20 = r2
            boolean r1 = p000.bmp.m3767b(r5, r13)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r2 = "id"
            if (r1 != 0) goto L_0x0322
            boolean r1 = p000.bmp.m3767b(r5, r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x031c
        L_0x02f9:
            r5.next()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            boolean r1 = p000.bmp.m3767b(r5, r4)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x030f
            java.lang.String r1 = p000.bmp.m3768c(r5, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x030f
            java.lang.String r10 = r5.nextText()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r8.put(r1, r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x030f:
            boolean r1 = p000.bmp.m3764a(r5, r12)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x02f9
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x054c
        L_0x031c:
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x054c
        L_0x0322:
            java.lang.String r27 = p000.bmp.m3768c(r5, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r27 == 0) goto L_0x0540
            java.lang.String r1 = "origin"
            java.lang.String r1 = p000.bmp.m3768c(r5, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x0534
            java.util.regex.Pattern r2 = p000.bfa.f3617g     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.regex.Matcher r2 = r2.matcher(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.regex.Pattern r10 = p000.bfa.f3618h     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.regex.Matcher r10 = r10.matcher(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            boolean r11 = r2.matches()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r18 = 1120403456(0x42c80000, float:100.0)
            if (r11 == 0) goto L_0x037c
            r10 = 1
            java.lang.String r11 = r2.group(r10)     // Catch:{ NumberFormatException -> 0x035e }
            float r10 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x035e }
            float r10 = r10 / r18
            r11 = 2
            java.lang.String r2 = r2.group(r11)     // Catch:{ NumberFormatException -> 0x035e }
            float r2 = java.lang.Float.parseFloat(r2)     // Catch:{ NumberFormatException -> 0x035e }
            float r2 = r2 / r18
            r28 = r10
            goto L_0x03c0
        L_0x035e:
            r0 = move-exception
            java.lang.String r2 = "Ignoring region with malformed origin: "
            int r10 = r1.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 != 0) goto L_0x036d
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x0371
        L_0x036d:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x0371:
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r36 = r4
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0545
        L_0x037c:
            boolean r2 = r10.matches()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r2 != 0) goto L_0x039f
            java.lang.String r2 = "Ignoring region with unsupported origin: "
            int r10 = r1.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 != 0) goto L_0x0390
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x0394
        L_0x0390:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x0394:
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r36 = r4
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0545
        L_0x039f:
            if (r9 == 0) goto L_0x0518
            r2 = 1
            java.lang.String r11 = r10.group(r2)     // Catch:{ NumberFormatException -> 0x04fb }
            int r2 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x04fb }
            r11 = 2
            java.lang.String r10 = r10.group(r11)     // Catch:{ NumberFormatException -> 0x04fb }
            int r10 = java.lang.Integer.parseInt(r10)     // Catch:{ NumberFormatException -> 0x04fb }
            float r2 = (float) r2     // Catch:{ NumberFormatException -> 0x04fb }
            int r11 = r9.f3610a     // Catch:{ NumberFormatException -> 0x04fb }
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x04fb }
            float r2 = r2 / r11
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x04fb }
            int r11 = r9.f3611b     // Catch:{ NumberFormatException -> 0x04fb }
            float r11 = (float) r11
            float r10 = r10 / r11
            r28 = r2
            r2 = r10
        L_0x03c0:
            java.lang.String r10 = "extent"
            java.lang.String r10 = p000.bmp.m3768c(r5, r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 == 0) goto L_0x04ef
            java.util.regex.Pattern r11 = p000.bfa.f3617g     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.regex.Matcher r11 = r11.matcher(r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r36 = r4
            java.util.regex.Pattern r4 = p000.bfa.f3618h     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.util.regex.Matcher r4 = r4.matcher(r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            boolean r10 = r11.matches()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 == 0) goto L_0x0413
            r4 = 1
            java.lang.String r10 = r11.group(r4)     // Catch:{ NumberFormatException -> 0x03f7 }
            float r4 = java.lang.Float.parseFloat(r10)     // Catch:{ NumberFormatException -> 0x03f7 }
            float r4 = r4 / r18
            r10 = 2
            java.lang.String r11 = r11.group(r10)     // Catch:{ NumberFormatException -> 0x03f7 }
            float r1 = java.lang.Float.parseFloat(r11)     // Catch:{ NumberFormatException -> 0x03f7 }
            float r1 = r1 / r18
            r33 = r1
            r32 = r4
            goto L_0x0457
        L_0x03f7:
            r0 = move-exception
            java.lang.String r2 = "Ignoring region with malformed extent: "
            int r4 = r1.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r4 != 0) goto L_0x0406
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x040a
        L_0x0406:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x040a:
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0545
        L_0x0413:
            boolean r10 = r4.matches()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 != 0) goto L_0x0434
            java.lang.String r2 = "Ignoring region with unsupported extent: "
            int r4 = r1.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r4 != 0) goto L_0x0427
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x042b
        L_0x0427:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x042b:
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2 = 0
            r4 = 1065353216(0x3f800000, float:1.0)
            goto L_0x0545
        L_0x0434:
            if (r9 == 0) goto L_0x04d5
            r10 = 1
            java.lang.String r11 = r4.group(r10)     // Catch:{ NumberFormatException -> 0x04b9 }
            int r10 = java.lang.Integer.parseInt(r11)     // Catch:{ NumberFormatException -> 0x04b9 }
            r11 = 2
            java.lang.String r4 = r4.group(r11)     // Catch:{ NumberFormatException -> 0x04b9 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ NumberFormatException -> 0x04b9 }
            float r10 = (float) r10     // Catch:{ NumberFormatException -> 0x04b9 }
            int r11 = r9.f3610a     // Catch:{ NumberFormatException -> 0x04b9 }
            float r11 = (float) r11     // Catch:{ NumberFormatException -> 0x04b9 }
            float r10 = r10 / r11
            float r4 = (float) r4     // Catch:{ NumberFormatException -> 0x04b9 }
            int r1 = r9.f3611b     // Catch:{ NumberFormatException -> 0x04b9 }
            float r1 = (float) r1
            float r4 = r4 / r1
            r33 = r4
            r32 = r10
        L_0x0457:
            java.lang.String r1 = "displayAlign"
            java.lang.String r1 = p000.bmp.m3768c(r5, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x04a1
            java.lang.String r1 = p000.blm.m3675d(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r4 = r1.hashCode()
            r10 = -1364013995(0xffffffffaeb2cc55, float:-8.1307995E-11)
            if (r4 == r10) goto L_0x047d
            r10 = 92734940(0x58705dc, float:1.2697491E-35)
            if (r4 == r10) goto L_0x0472
        L_0x0471:
            goto L_0x0487
        L_0x0472:
            java.lang.String r4 = "after"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0471
            r1 = 1
            goto L_0x0488
        L_0x047d:
            java.lang.String r4 = "center"
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0471
            r1 = 0
            goto L_0x0488
        L_0x0487:
            r1 = -1
        L_0x0488:
            if (r1 == 0) goto L_0x0496
            r4 = 1
            if (r1 == r4) goto L_0x048e
            goto L_0x04a1
        L_0x048e:
            float r2 = r2 + r33
            r29 = r2
            r31 = 2
            goto L_0x04a5
        L_0x0496:
            r1 = 1073741824(0x40000000, float:2.0)
            float r1 = r33 / r1
            float r2 = r2 + r1
            r29 = r2
            r31 = 1
            goto L_0x04a5
        L_0x04a1:
            r29 = r2
            r31 = 0
        L_0x04a5:
            int r1 = r3.f3606a     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bfc r2 = new bfc     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r30 = 0
            r34 = 1
            float r1 = (float) r1     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r4 = 1065353216(0x3f800000, float:1.0)
            float r35 = r4 / r1
            r26 = r2
            r26.<init>(r27, r28, r29, r30, r31, r32, r33, r34, r35)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x0545
        L_0x04b9:
            r0 = move-exception
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = "Ignoring region with malformed extent: "
            int r10 = r1.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 != 0) goto L_0x04ca
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x04ce
        L_0x04ca:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x04ce:
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2 = 0
            goto L_0x0545
        L_0x04d5:
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            int r10 = r1.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 != 0) goto L_0x04e5
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x04e9
        L_0x04e5:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x04e9:
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2 = 0
            goto L_0x0545
        L_0x04ef:
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "Ignoring region without an extent"
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2 = 0
            goto L_0x0545
        L_0x04fb:
            r0 = move-exception
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = "Ignoring region with malformed origin: "
            int r10 = r1.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 != 0) goto L_0x050e
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x0512
        L_0x050e:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x0512:
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2 = 0
            goto L_0x0545
        L_0x0518:
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r2 = "Ignoring region with missing tts:extent: "
            int r10 = r1.length()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r10 != 0) goto L_0x052a
            java.lang.String r1 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x052e
        L_0x052a:
            java.lang.String r1 = r2.concat(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x052e:
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2 = 0
            goto L_0x0545
        L_0x0534:
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            java.lang.String r1 = "Ignoring region without an origin"
            android.util.Log.w(r15, r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r2 = 0
            goto L_0x0545
        L_0x0540:
            r36 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r2 = 0
        L_0x0545:
            if (r2 == 0) goto L_0x054c
            java.lang.String r1 = r2.f3635a     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r7.put(r1, r2)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
        L_0x054c:
            boolean r1 = p000.bmp.m3764a(r5, r14)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x0558
            r10 = r3
            r2 = r24
            goto L_0x05e3
        L_0x0558:
            r2 = r20
            r4 = r36
            goto L_0x02a0
        L_0x055e:
            r20 = r2
            int r1 = r5.getAttributeCount()     // Catch:{ bdn -> 0x06d7 }
            r2 = 0
            bfd r33 = m3019a(r5, r2)     // Catch:{ bdn -> 0x06d7 }
            r26 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r34 = r2
            r36 = r34
            r35 = r19
            r28 = r26
            r30 = r28
            r37 = r30
            r4 = 0
        L_0x057c:
            if (r4 < r1) goto L_0x05f1
            if (r11 == 0) goto L_0x0597
            long r12 = r11.f3623a     // Catch:{ bdn -> 0x059a }
            int r1 = (r12 > r26 ? 1 : (r12 == r26 ? 0 : -1))
            if (r1 != 0) goto L_0x0587
            goto L_0x05a4
        L_0x0587:
            int r1 = (r28 > r26 ? 1 : (r28 == r26 ? 0 : -1))
            if (r1 == 0) goto L_0x058d
            long r28 = r28 + r12
        L_0x058d:
            int r1 = (r30 > r26 ? 1 : (r30 == r26 ? 0 : -1))
            if (r1 == 0) goto L_0x0597
            long r30 = r30 + r12
            r12 = r28
            goto L_0x05a6
        L_0x0597:
            goto L_0x05a4
        L_0x059a:
            r0 = move-exception
            r4 = r0
            r10 = r3
        L_0x059d:
            r3 = r16
            r2 = r24
        L_0x05a1:
            r1 = 1
            goto L_0x06df
        L_0x05a4:
            r12 = r28
        L_0x05a6:
            int r1 = (r30 > r26 ? 1 : (r30 == r26 ? 0 : -1))
            if (r1 != 0) goto L_0x05c4
            int r1 = (r37 > r26 ? 1 : (r37 == r26 ? 0 : -1))
            if (r1 == 0) goto L_0x05b4
            long r37 = r12 + r37
            r10 = r3
            r31 = r37
            goto L_0x05c7
        L_0x05b4:
            if (r11 == 0) goto L_0x05c4
            r10 = r3
            long r2 = r11.f3624b     // Catch:{ bdn -> 0x05c1 }
            int r1 = (r2 > r26 ? 1 : (r2 == r26 ? 0 : -1))
            if (r1 != 0) goto L_0x05be
            goto L_0x05c5
        L_0x05be:
            r31 = r2
            goto L_0x05c7
        L_0x05c1:
            r0 = move-exception
            r4 = r0
            goto L_0x059d
        L_0x05c4:
            r10 = r3
        L_0x05c5:
            r31 = r30
        L_0x05c7:
            java.lang.String r27 = r5.getName()     // Catch:{ bdn -> 0x05ea }
            bfb r1 = new bfb     // Catch:{ bdn -> 0x05ea }
            r28 = 0
            r26 = r1
            r29 = r12
            r26.<init>(r27, r28, r29, r31, r33, r34, r35, r36)     // Catch:{ bdn -> 0x05ea }
            r2 = r24
            r2.push(r1)     // Catch:{ bdn -> 0x05e8 }
            if (r11 != 0) goto L_0x05de
            goto L_0x05e3
        L_0x05de:
            r11.mo1811a(r1)     // Catch:{ bdn -> 0x05e8 }
        L_0x05e3:
            r3 = r10
            r10 = r23
            goto L_0x0767
        L_0x05e8:
            r0 = move-exception
            goto L_0x05ed
        L_0x05ea:
            r0 = move-exception
            r2 = r24
        L_0x05ed:
            r4 = r0
            r3 = r16
            goto L_0x05a1
        L_0x05f1:
            r10 = r3
            r2 = r24
            java.lang.String r3 = r5.getAttributeName(r4)     // Catch:{ bdn -> 0x06d3 }
            java.lang.String r12 = r5.getAttributeValue(r4)     // Catch:{ bdn -> 0x06d3 }
            int r14 = r3.hashCode()
            switch(r14) {
                case -934795532: goto L_0x0652;
                case 99841: goto L_0x0644;
                case 100571: goto L_0x0636;
                case 93616297: goto L_0x0628;
                case 109780401: goto L_0x061c;
                case 1292595405: goto L_0x0608;
                default: goto L_0x0603;
            }
        L_0x0603:
            r14 = r20
            r20 = r1
            goto L_0x065e
        L_0x0608:
            java.lang.String r14 = "backgroundImage"
            boolean r3 = r3.equals(r14)
            if (r3 == 0) goto L_0x0617
            r3 = 5
            r14 = r20
            r20 = r1
            goto L_0x065f
        L_0x0617:
            r14 = r20
            r20 = r1
            goto L_0x065e
        L_0x061c:
            r14 = r20
            boolean r3 = r3.equals(r14)
            r20 = r1
            if (r3 == 0) goto L_0x065e
            r3 = 3
            goto L_0x065f
        L_0x0628:
            r14 = r20
            r20 = r1
            java.lang.String r1 = "begin"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x065e
            r3 = 0
            goto L_0x065f
        L_0x0636:
            r14 = r20
            r20 = r1
            java.lang.String r1 = "end"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x065e
            r3 = 1
            goto L_0x065f
        L_0x0644:
            r14 = r20
            r20 = r1
            java.lang.String r1 = "dur"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x065e
            r3 = 2
            goto L_0x065f
        L_0x0652:
            r14 = r20
            r20 = r1
            boolean r1 = r3.equals(r13)
            if (r1 == 0) goto L_0x065e
            r3 = 4
            goto L_0x065f
        L_0x065e:
            r3 = -1
        L_0x065f:
            if (r3 == 0) goto L_0x06b8
            r1 = 1
            if (r3 == r1) goto L_0x06b0
            r1 = 2
            if (r3 == r1) goto L_0x06a7
            r1 = 3
            if (r3 == r1) goto L_0x0695
            r1 = 4
            if (r3 == r1) goto L_0x068a
            r1 = 5
            if (r3 == r1) goto L_0x0672
            r1 = 1
            goto L_0x069f
        L_0x0672:
            java.lang.String r1 = "#"
            boolean r1 = r12.startsWith(r1)     // Catch:{ bdn -> 0x0687 }
            if (r1 == 0) goto L_0x0685
            r1 = 1
            java.lang.String r3 = r12.substring(r1)     // Catch:{ bdn -> 0x06a2 }
            r36 = r3
            r3 = r16
            goto L_0x06c1
        L_0x0685:
            r1 = 1
            goto L_0x0694
        L_0x0687:
            r0 = move-exception
            r1 = 1
            goto L_0x06a3
        L_0x068a:
            r1 = 1
            boolean r3 = r7.containsKey(r12)     // Catch:{ bdn -> 0x06a2 }
            if (r3 == 0) goto L_0x0694
            r35 = r12
            goto L_0x069f
        L_0x0694:
            goto L_0x069f
        L_0x0695:
            r1 = 1
            java.lang.String[] r3 = m3020a(r12)     // Catch:{ bdn -> 0x06a2 }
            int r12 = r3.length     // Catch:{ bdn -> 0x06a2 }
            if (r12 <= 0) goto L_0x0694
            r34 = r3
        L_0x069f:
            r3 = r16
            goto L_0x06c1
        L_0x06a2:
            r0 = move-exception
        L_0x06a3:
            r4 = r0
            r3 = r16
            goto L_0x06df
        L_0x06a7:
            r1 = 1
            r3 = r16
            long r37 = m3017a(r12, r3)     // Catch:{ bdn -> 0x06d1 }
            goto L_0x06c1
        L_0x06b0:
            r3 = r16
            long r30 = m3017a(r12, r3)     // Catch:{ bdn -> 0x06d1 }
            goto L_0x06c1
        L_0x06b8:
            r3 = r16
            r1 = 1
            long r28 = m3017a(r12, r3)     // Catch:{ bdn -> 0x06d1 }
        L_0x06c1:
            int r4 = r4 + 1
            r24 = r2
            r16 = r3
            r3 = r10
            r1 = r20
            r2 = 0
            r20 = r14
            goto L_0x057c
        L_0x06d1:
            r0 = move-exception
            goto L_0x06de
        L_0x06d3:
            r0 = move-exception
            r3 = r16
            goto L_0x06dd
        L_0x06d7:
            r0 = move-exception
            r10 = r3
            r3 = r16
            r2 = r24
        L_0x06dd:
            r1 = 1
        L_0x06de:
            r4 = r0
        L_0x06df:
            java.lang.String r11 = "Suppressing parser error"
            android.util.Log.w(r15, r11, r4)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r16 = r3
            r3 = r10
            r10 = r23
            r22 = 1
            goto L_0x0767
        L_0x06ee:
            r23 = r2
            r25 = r3
            r2 = r9
            r21 = r13
            r22 = r14
            r3 = 4
            if (r12 != r3) goto L_0x0736
            java.lang.String r1 = r5.getText()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bfb r3 = new bfb     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r27 = 0
            java.lang.String r9 = "\r\n"
            r10 = r23
            java.lang.String r1 = r1.replaceAll(r9, r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r9 = " *\n *"
            java.lang.String r1 = r1.replaceAll(r9, r10)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r1 = r1.replaceAll(r10, r4)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.String r9 = "[ \t\\x0B\f\r]+"
            java.lang.String r28 = r1.replaceAll(r9, r4)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r29 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r31 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r33 = 0
            r34 = 0
            java.lang.String r35 = ""
            r36 = 0
            r26 = r3
            r26.<init>(r27, r28, r29, r31, r33, r34, r35, r36)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r11.mo1811a(r3)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x0761
        L_0x0736:
            r10 = r23
            r3 = 3
            if (r12 != r3) goto L_0x0760
            java.lang.String r3 = r5.getName()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            boolean r1 = r3.equals(r1)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            if (r1 == 0) goto L_0x0751
            bfe r13 = new bfe     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            java.lang.Object r1 = r2.peek()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            bfb r1 = (p000.bfb) r1     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r13.<init>(r1, r6, r7, r8)     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            goto L_0x0753
        L_0x0751:
            r13 = r21
        L_0x0753:
            r2.pop()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r21 = r13
            r3 = r16
            r9 = r17
            r16 = r20
            goto L_0x0767
        L_0x0760:
        L_0x0761:
            r3 = r16
            r9 = r17
            r16 = r20
        L_0x0767:
            r17 = r9
            r15 = r16
            r13 = r21
            r14 = r22
            r16 = r3
            goto L_0x0795
        L_0x0772:
            r19 = r1
            r10 = r2
            r25 = r3
            r2 = r9
            r21 = r13
            r22 = r14
            r20 = r15
            r1 = 2
            if (r12 != r1) goto L_0x0789
            int r14 = r22 + 1
        L_0x0783:
            r15 = r20
            r13 = r21
            goto L_0x0795
        L_0x0789:
            r1 = 3
            if (r12 != r1) goto L_0x078f
            int r14 = r22 + -1
            goto L_0x0783
        L_0x078f:
            r15 = r20
            r13 = r21
            r14 = r22
        L_0x0795:
            r5.next()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            int r12 = r5.getEventType()     // Catch:{ XmlPullParserException -> 0x07b6, IOException -> 0x07ac }
            r4 = r39
            r9 = r2
            r2 = r10
            r1 = r19
            r3 = r25
            r10 = 0
            r11 = 0
            goto L_0x0048
        L_0x07a9:
            r21 = r13
            return r21
        L_0x07ac:
            r0 = move-exception
            r1 = r0
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unexpected error when reading input."
            r2.<init>(r3, r1)
            throw r2
        L_0x07b6:
            r0 = move-exception
            r1 = r0
            bdn r2 = new bdn
            java.lang.String r3 = "Unable to decode source"
            r2.<init>(r3, r1)
            goto L_0x07c1
        L_0x07c0:
            throw r2
        L_0x07c1:
            goto L_0x07c0
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bfa.mo1155a(byte[], int, boolean):bdl");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0279  */
    /* JADX WARNING: Removed duplicated region for block: B:134:0x027f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final p000.bfd m3019a(org.xmlpull.v1.XmlPullParser r14, p000.bfd r15) {
        /*
            int r0 = r14.getAttributeCount()
            r1 = 0
            r2 = r15
            r15 = 0
        L_0x0007:
            if (r15 >= r0) goto L_0x02fb
            java.lang.String r3 = r14.getAttributeValue(r15)
            java.lang.String r4 = r14.getAttributeName(r15)
            int r5 = r4.hashCode()
            r6 = 4
            r7 = -1
            r8 = 3
            r9 = 2
            r10 = 1
            switch(r5) {
                case -1550943582: goto L_0x0070;
                case -1224696685: goto L_0x0066;
                case -1065511464: goto L_0x005c;
                case -879295043: goto L_0x0051;
                case -734428249: goto L_0x0047;
                case 3355: goto L_0x003d;
                case 94842723: goto L_0x0033;
                case 365601008: goto L_0x0029;
                case 1287124693: goto L_0x001e;
                default: goto L_0x001d;
            }
        L_0x001d:
            goto L_0x007a
        L_0x001e:
            java.lang.String r5 = "backgroundColor"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 1
            goto L_0x007b
        L_0x0029:
            java.lang.String r5 = "fontSize"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 4
            goto L_0x007b
        L_0x0033:
            java.lang.String r5 = "color"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 2
            goto L_0x007b
        L_0x003d:
            java.lang.String r5 = "id"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 0
            goto L_0x007b
        L_0x0047:
            java.lang.String r5 = "fontWeight"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 5
            goto L_0x007b
        L_0x0051:
            java.lang.String r5 = "textDecoration"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 8
            goto L_0x007b
        L_0x005c:
            java.lang.String r5 = "textAlign"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 7
            goto L_0x007b
        L_0x0066:
            java.lang.String r5 = "fontFamily"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 3
            goto L_0x007b
        L_0x0070:
            java.lang.String r5 = "fontStyle"
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L_0x001d
            r4 = 6
            goto L_0x007b
        L_0x007a:
            r4 = -1
        L_0x007b:
            java.lang.String r5 = "TtmlDecoder"
            switch(r4) {
                case 0: goto L_0x02e4;
                case 1: goto L_0x02bb;
                case 2: goto L_0x0292;
                case 3: goto L_0x0288;
                case 4: goto L_0x0182;
                case 5: goto L_0x0171;
                case 6: goto L_0x0160;
                case 7: goto L_0x00e4;
                case 8: goto L_0x0082;
                default: goto L_0x0080;
            }
        L_0x0080:
            goto L_0x02f7
        L_0x0082:
            java.lang.String r3 = p000.blm.m3675d(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1461280213: goto L_0x00ad;
                case -1026963764: goto L_0x00a3;
                case 913457136: goto L_0x0099;
                case 1679736913: goto L_0x008e;
                default: goto L_0x008d;
            }
        L_0x008d:
            goto L_0x00b6
        L_0x008e:
            java.lang.String r4 = "linethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r7 = 0
            goto L_0x00b6
        L_0x0099:
            java.lang.String r4 = "nolinethrough"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r7 = 1
            goto L_0x00b6
        L_0x00a3:
            java.lang.String r4 = "underline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r7 = 2
            goto L_0x00b6
        L_0x00ad:
            java.lang.String r4 = "nounderline"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x008d
            r7 = 3
        L_0x00b6:
            if (r7 == 0) goto L_0x00db
            if (r7 == r10) goto L_0x00d2
            if (r7 == r9) goto L_0x00c9
            if (r7 == r8) goto L_0x00c0
            goto L_0x02f7
        L_0x00c0:
            bfd r2 = m3018a(r2)
            r2.mo1818b(r1)
            goto L_0x02f7
        L_0x00c9:
            bfd r2 = m3018a(r2)
            r2.mo1818b(r10)
            goto L_0x02f7
        L_0x00d2:
            bfd r2 = m3018a(r2)
            r2.mo1816a(r1)
            goto L_0x02f7
        L_0x00db:
            bfd r2 = m3018a(r2)
            r2.mo1816a(r10)
            goto L_0x02f7
        L_0x00e4:
            java.lang.String r3 = p000.blm.m3675d(r3)
            int r4 = r3.hashCode()
            switch(r4) {
                case -1364013995: goto L_0x0119;
                case 100571: goto L_0x010f;
                case 3317767: goto L_0x0105;
                case 108511772: goto L_0x00fb;
                case 109757538: goto L_0x00f0;
                default: goto L_0x00ef;
            }
        L_0x00ef:
            goto L_0x0122
        L_0x00f0:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ef
            r7 = 1
            goto L_0x0122
        L_0x00fb:
            java.lang.String r4 = "right"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ef
            r7 = 2
            goto L_0x0122
        L_0x0105:
            java.lang.String r4 = "left"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ef
            r7 = 0
            goto L_0x0122
        L_0x010f:
            java.lang.String r4 = "end"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ef
            r7 = 3
            goto L_0x0122
        L_0x0119:
            java.lang.String r4 = "center"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x00ef
            r7 = 4
        L_0x0122:
            if (r7 == 0) goto L_0x0156
            if (r7 == r10) goto L_0x014c
            if (r7 == r9) goto L_0x0142
            if (r7 == r8) goto L_0x0138
            if (r7 == r6) goto L_0x012e
            goto L_0x02f7
        L_0x012e:
            bfd r2 = m3018a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_CENTER
            r2.f3656m = r3
            goto L_0x02f7
        L_0x0138:
            bfd r2 = m3018a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r2.f3656m = r3
            goto L_0x02f7
        L_0x0142:
            bfd r2 = m3018a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_OPPOSITE
            r2.f3656m = r3
            goto L_0x02f7
        L_0x014c:
            bfd r2 = m3018a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r2.f3656m = r3
            goto L_0x02f7
        L_0x0156:
            bfd r2 = m3018a(r2)
            android.text.Layout$Alignment r3 = android.text.Layout.Alignment.ALIGN_NORMAL
            r2.f3656m = r3
            goto L_0x02f7
        L_0x0160:
            bfd r2 = m3018a(r2)
            java.lang.String r4 = "italic"
            boolean r3 = r4.equalsIgnoreCase(r3)
            p000.bks.m3512b(r10)
            r2.f3652i = r3
            goto L_0x02f7
        L_0x0171:
            bfd r2 = m3018a(r2)
            java.lang.String r4 = "bold"
            boolean r3 = r4.equalsIgnoreCase(r3)
            p000.bks.m3512b(r10)
            r2.f3651h = r3
            goto L_0x02f7
        L_0x0182:
            bfd r2 = m3018a(r2)     // Catch:{ bdn -> 0x026c }
            java.lang.String r4 = "\\s+"
            java.lang.String[] r4 = p000.blm.m3658a(r3, r4)     // Catch:{ bdn -> 0x026a }
            int r6 = r4.length     // Catch:{ bdn -> 0x026a }
            if (r6 != r10) goto L_0x0196
            java.util.regex.Pattern r4 = p000.bfa.f3616f     // Catch:{ bdn -> 0x026a }
            java.util.regex.Matcher r4 = r4.matcher(r3)     // Catch:{ bdn -> 0x026a }
        L_0x0195:
            goto L_0x01a7
        L_0x0196:
            if (r6 != r9) goto L_0x024c
            java.util.regex.Pattern r6 = p000.bfa.f3616f     // Catch:{ bdn -> 0x026a }
            r4 = r4[r10]     // Catch:{ bdn -> 0x026a }
            java.util.regex.Matcher r4 = r6.matcher(r4)     // Catch:{ bdn -> 0x026a }
            java.lang.String r6 = "Multiple values in fontSize attribute. Picking the second value for vertical font size and ignoring the first."
            android.util.Log.w(r5, r6)     // Catch:{ bdn -> 0x026a }
            goto L_0x0195
        L_0x01a7:
            boolean r6 = r4.matches()     // Catch:{ bdn -> 0x026a }
            java.lang.String r11 = "'."
            if (r6 == 0) goto L_0x0228
            java.lang.String r6 = r4.group(r8)     // Catch:{ bdn -> 0x026a }
            int r12 = r6.hashCode()
            r13 = 37
            if (r12 == r13) goto L_0x01d9
            r13 = 3240(0xca8, float:4.54E-42)
            if (r12 == r13) goto L_0x01cf
            r13 = 3592(0xe08, float:5.033E-42)
            if (r12 == r13) goto L_0x01c4
        L_0x01c3:
            goto L_0x01e2
        L_0x01c4:
            java.lang.String r12 = "px"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L_0x01c3
            r7 = 0
            goto L_0x01e2
        L_0x01cf:
            java.lang.String r12 = "em"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L_0x01c3
            r7 = 1
            goto L_0x01e2
        L_0x01d9:
            java.lang.String r12 = "%"
            boolean r12 = r6.equals(r12)
            if (r12 == 0) goto L_0x01c3
            r7 = 2
        L_0x01e2:
            if (r7 == 0) goto L_0x0214
            if (r7 == r10) goto L_0x0210
            if (r7 != r9) goto L_0x01ec
            r2.f3653j = r8     // Catch:{ bdn -> 0x026a }
            goto L_0x0216
        L_0x01ec:
            bdn r4 = new bdn     // Catch:{ bdn -> 0x026a }
            java.lang.String r7 = java.lang.String.valueOf(r6)     // Catch:{ bdn -> 0x026a }
            int r7 = r7.length()     // Catch:{ bdn -> 0x026a }
            int r7 = r7 + 30
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ bdn -> 0x026a }
            r8.<init>(r7)     // Catch:{ bdn -> 0x026a }
            java.lang.String r7 = "Invalid unit for fontSize: '"
            r8.append(r7)     // Catch:{ bdn -> 0x026a }
            r8.append(r6)     // Catch:{ bdn -> 0x026a }
            r8.append(r11)     // Catch:{ bdn -> 0x026a }
            java.lang.String r6 = r8.toString()     // Catch:{ bdn -> 0x026a }
            r4.<init>(r6)     // Catch:{ bdn -> 0x026a }
            throw r4     // Catch:{ bdn -> 0x026a }
        L_0x0210:
            r2.f3653j = r9     // Catch:{ bdn -> 0x026a }
            goto L_0x0216
        L_0x0214:
            r2.f3653j = r10     // Catch:{ bdn -> 0x026a }
        L_0x0216:
            java.lang.String r4 = r4.group(r10)     // Catch:{ bdn -> 0x026a }
            java.lang.Float r4 = java.lang.Float.valueOf(r4)     // Catch:{ bdn -> 0x026a }
            float r4 = r4.floatValue()     // Catch:{ bdn -> 0x026a }
            r2.f3654k = r4     // Catch:{ bdn -> 0x026a }
            goto L_0x02f7
        L_0x0228:
            bdn r4 = new bdn     // Catch:{ bdn -> 0x026a }
            java.lang.String r6 = java.lang.String.valueOf(r3)     // Catch:{ bdn -> 0x026a }
            int r6 = r6.length()     // Catch:{ bdn -> 0x026a }
            int r6 = r6 + 36
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ bdn -> 0x026a }
            r7.<init>(r6)     // Catch:{ bdn -> 0x026a }
            java.lang.String r6 = "Invalid expression for fontSize: '"
            r7.append(r6)     // Catch:{ bdn -> 0x026a }
            r7.append(r3)     // Catch:{ bdn -> 0x026a }
            r7.append(r11)     // Catch:{ bdn -> 0x026a }
            java.lang.String r6 = r7.toString()     // Catch:{ bdn -> 0x026a }
            r4.<init>(r6)     // Catch:{ bdn -> 0x026a }
            throw r4     // Catch:{ bdn -> 0x026a }
        L_0x024c:
            bdn r4 = new bdn     // Catch:{ bdn -> 0x026a }
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ bdn -> 0x026a }
            r8 = 52
            r7.<init>(r8)     // Catch:{ bdn -> 0x026a }
            java.lang.String r8 = "Invalid number of entries for fontSize: "
            r7.append(r8)     // Catch:{ bdn -> 0x026a }
            r7.append(r6)     // Catch:{ bdn -> 0x026a }
            java.lang.String r6 = "."
            r7.append(r6)     // Catch:{ bdn -> 0x026a }
            java.lang.String r6 = r7.toString()     // Catch:{ bdn -> 0x026a }
            r4.<init>(r6)     // Catch:{ bdn -> 0x026a }
            throw r4     // Catch:{ bdn -> 0x026a }
        L_0x026a:
            r4 = move-exception
            goto L_0x026d
        L_0x026c:
            r4 = move-exception
        L_0x026d:
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed parsing fontSize value: "
            int r6 = r3.length()
            if (r6 != 0) goto L_0x027f
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x0283
        L_0x027f:
            java.lang.String r3 = r4.concat(r3)
        L_0x0283:
            android.util.Log.w(r5, r3)
            goto L_0x02f7
        L_0x0288:
            bfd r2 = m3018a(r2)
            p000.bks.m3512b(r10)
            r2.f3644a = r3
            goto L_0x02f7
        L_0x0292:
            bfd r2 = m3018a(r2)
            int r4 = p000.bkh.m3487a(r3)     // Catch:{ IllegalArgumentException -> 0x029f }
            r2.mo1817b(r4)     // Catch:{ IllegalArgumentException -> 0x029f }
            goto L_0x02f7
        L_0x029f:
            r4 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed parsing color value: "
            int r6 = r3.length()
            if (r6 != 0) goto L_0x02b2
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x02b6
        L_0x02b2:
            java.lang.String r3 = r4.concat(r3)
        L_0x02b6:
            android.util.Log.w(r5, r3)
            goto L_0x02f7
        L_0x02bb:
            bfd r2 = m3018a(r2)
            int r4 = p000.bkh.m3487a(r3)     // Catch:{ IllegalArgumentException -> 0x02c8 }
            r2.mo1814a(r4)     // Catch:{ IllegalArgumentException -> 0x02c8 }
            goto L_0x02f7
        L_0x02c8:
            r4 = move-exception
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r4 = "Failed parsing background value: "
            int r6 = r3.length()
            if (r6 != 0) goto L_0x02db
            java.lang.String r3 = new java.lang.String
            r3.<init>(r4)
            goto L_0x02df
        L_0x02db:
            java.lang.String r3 = r4.concat(r3)
        L_0x02df:
            android.util.Log.w(r5, r3)
            goto L_0x02f7
        L_0x02e4:
            java.lang.String r4 = r14.getName()
            java.lang.String r5 = "style"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x02f7
            bfd r2 = m3018a(r2)
            r2.f3655l = r3
        L_0x02f7:
            int r15 = r15 + 1
            goto L_0x0007
        L_0x02fb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bfa.m3019a(org.xmlpull.v1.XmlPullParser, bfd):bfd");
    }

    /* renamed from: a */
    private static final String[] m3020a(String str) {
        String trim = str.trim();
        return !trim.isEmpty() ? blm.m3658a(trim, "\\s+") : new String[0];
    }

    /* JADX WARNING: Removed duplicated region for block: B:49:0x0101  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static long m3017a(java.lang.String r14, p000.bey r15) {
        /*
            java.util.regex.Pattern r0 = p000.bfa.f3614d
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            r2 = 4696837146684686336(0x412e848000000000, double:1000000.0)
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            if (r1 == 0) goto L_0x008c
            java.lang.String r14 = r0.group(r8)
            long r8 = java.lang.Long.parseLong(r14)
            r10 = 3600(0xe10, double:1.7786E-320)
            long r8 = r8 * r10
            double r8 = (double) r8
            java.lang.String r14 = r0.group(r7)
            long r10 = java.lang.Long.parseLong(r14)
            r12 = 60
            long r10 = r10 * r12
            double r10 = (double) r10
            java.lang.Double.isNaN(r8)
            java.lang.Double.isNaN(r10)
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r6)
            long r6 = java.lang.Long.parseLong(r14)
            double r6 = (double) r6
            java.lang.Double.isNaN(r6)
            double r8 = r8 + r6
            java.lang.String r14 = r0.group(r5)
            r5 = 0
            if (r14 == 0) goto L_0x0051
            double r10 = java.lang.Double.parseDouble(r14)
            goto L_0x0053
        L_0x0051:
            r10 = r5
        L_0x0053:
            double r8 = r8 + r10
            java.lang.String r14 = r0.group(r4)
            if (r14 == 0) goto L_0x0064
            long r10 = java.lang.Long.parseLong(r14)
            float r14 = (float) r10
            float r1 = r15.f3607a
            float r14 = r14 / r1
            double r10 = (double) r14
            goto L_0x0066
        L_0x0064:
            r10 = r5
        L_0x0066:
            double r8 = r8 + r10
            r14 = 6
            java.lang.String r14 = r0.group(r14)
            if (r14 == 0) goto L_0x0086
            long r0 = java.lang.Long.parseLong(r14)
            double r0 = (double) r0
            int r14 = r15.f3608b
            double r4 = (double) r14
            java.lang.Double.isNaN(r0)
            java.lang.Double.isNaN(r4)
            double r0 = r0 / r4
            float r14 = r15.f3607a
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r5 = r0 / r14
            goto L_0x0087
        L_0x0086:
        L_0x0087:
            double r8 = r8 + r5
            double r8 = r8 * r2
            long r14 = (long) r8
            return r14
        L_0x008c:
            java.util.regex.Pattern r0 = p000.bfa.f3615e
            java.util.regex.Matcher r0 = r0.matcher(r14)
            boolean r1 = r0.matches()
            if (r1 == 0) goto L_0x012f
            java.lang.String r14 = r0.group(r8)
            double r9 = java.lang.Double.parseDouble(r14)
            java.lang.String r14 = r0.group(r7)
            int r0 = r14.hashCode()
            r1 = 102(0x66, float:1.43E-43)
            if (r0 == r1) goto L_0x00f4
            r1 = 104(0x68, float:1.46E-43)
            if (r0 == r1) goto L_0x00ea
            r1 = 109(0x6d, float:1.53E-43)
            if (r0 == r1) goto L_0x00e0
            r1 = 3494(0xda6, float:4.896E-42)
            if (r0 == r1) goto L_0x00d5
            r1 = 115(0x73, float:1.61E-43)
            if (r0 == r1) goto L_0x00cb
            r1 = 116(0x74, float:1.63E-43)
            if (r0 == r1) goto L_0x00c1
        L_0x00c0:
            goto L_0x00fe
        L_0x00c1:
            java.lang.String r0 = "t"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x00c0
            r14 = 5
            goto L_0x00ff
        L_0x00cb:
            java.lang.String r0 = "s"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x00c0
            r14 = 2
            goto L_0x00ff
        L_0x00d5:
            java.lang.String r0 = "ms"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x00c0
            r14 = 3
            goto L_0x00ff
        L_0x00e0:
            java.lang.String r0 = "m"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x00c0
            r14 = 1
            goto L_0x00ff
        L_0x00ea:
            java.lang.String r0 = "h"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x00c0
            r14 = 0
            goto L_0x00ff
        L_0x00f4:
            java.lang.String r0 = "f"
            boolean r14 = r14.equals(r0)
            if (r14 == 0) goto L_0x00c0
            r14 = 4
            goto L_0x00ff
        L_0x00fe:
            r14 = -1
        L_0x00ff:
            if (r14 == 0) goto L_0x0124
            if (r14 == r8) goto L_0x0121
            if (r14 == r6) goto L_0x0119
            if (r14 == r5) goto L_0x0111
            if (r14 == r4) goto L_0x010a
            goto L_0x012b
        L_0x010a:
            int r14 = r15.f3609c
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            goto L_0x011f
        L_0x0111:
            float r14 = r15.f3607a
            double r14 = (double) r14
            java.lang.Double.isNaN(r14)
            double r9 = r9 / r14
            goto L_0x012b
        L_0x0119:
            r14 = 4652007308841189376(0x408f400000000000, double:1000.0)
        L_0x011f:
            double r9 = r9 / r14
            goto L_0x012b
        L_0x0121:
            r14 = 4633641066610819072(0x404e000000000000, double:60.0)
            goto L_0x0129
        L_0x0124:
            r14 = 4660134898793709568(0x40ac200000000000, double:3600.0)
        L_0x0129:
            double r9 = r9 * r14
        L_0x012b:
            double r9 = r9 * r2
            long r14 = (long) r9
            return r14
        L_0x012f:
            bdn r15 = new bdn
            java.lang.String r14 = java.lang.String.valueOf(r14)
            java.lang.String r0 = "Malformed time expression: "
            int r1 = r14.length()
            if (r1 != 0) goto L_0x0143
            java.lang.String r14 = new java.lang.String
            r14.<init>(r0)
            goto L_0x0147
        L_0x0143:
            java.lang.String r14 = r0.concat(r14)
        L_0x0147:
            r15.<init>(r14)
            goto L_0x014c
        L_0x014b:
            throw r15
        L_0x014c:
            goto L_0x014b
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bfa.m3017a(java.lang.String, bey):long");
    }
}
