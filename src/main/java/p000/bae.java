package p000;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.xml.sax.helpers.DefaultHandler;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlPullParserFactory;

/* renamed from: bae */
/* compiled from: PG */
public final class bae extends DefaultHandler implements biz {

    /* renamed from: a */
    private static final Pattern f2986a = Pattern.compile("(\\d+)(?:/(\\d+))?");

    /* renamed from: b */
    private static final Pattern f2987b = Pattern.compile("CC([1-4])=.*");

    /* renamed from: c */
    private static final Pattern f2988c = Pattern.compile("([1-9]|[1-5][0-9]|6[0-3])=.*");

    /* renamed from: d */
    private final XmlPullParserFactory f2989d;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    private static final int m2623b(String str) {
        char c;
        if (str == null) {
            return 0;
        }
        switch (str.hashCode()) {
            case -2060497896:
                if (str.equals("subtitle")) {
                    c = 7;
                    break;
                }
                c = 65535;
                break;
            case -1724546052:
                if (str.equals("description")) {
                    c = 9;
                    break;
                }
                c = 65535;
                break;
            case -1580883024:
                if (str.equals("enhanced-audio-intelligibility")) {
                    c = 10;
                    break;
                }
                c = 65535;
                break;
            case -1408024454:
                if (str.equals("alternate")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 99825:
                if (str.equals("dub")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 3343801:
                if (str.equals("main")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 3530173:
                if (str.equals("sign")) {
                    c = 8;
                    break;
                }
                c = 65535;
                break;
            case 552573414:
                if (str.equals("caption")) {
                    c = 6;
                    break;
                }
                c = 65535;
                break;
            case 899152809:
                if (str.equals("commentary")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1629013393:
                if (str.equals("emergency")) {
                    c = 5;
                    break;
                }
                c = 65535;
                break;
            case 1855372047:
                if (str.equals("supplementary")) {
                    c = 2;
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
                return 1;
            case 1:
                return 2;
            case 2:
                return 4;
            case 3:
                return 8;
            case 4:
                return 16;
            case 5:
                return 32;
            case 6:
                return 64;
            case 7:
                return 128;
            case 8:
                return 256;
            case 9:
                return 512;
            case 10:
                return 2048;
            default:
                return 0;
        }
    }

    public bae() {
        try {
            this.f2989d = XmlPullParserFactory.newInstance();
        } catch (XmlPullParserException e) {
            throw new RuntimeException("Couldn't create XmlPullParserFactory instance", e);
        }
    }

    /* renamed from: a */
    private static final long m2612a(List list, long j, long j2, int i, long j3) {
        int i2;
        if (i < 0) {
            i2 = (int) blm.m3631a(j3 - j, j2);
        } else {
            i2 = i + 1;
        }
        for (int i3 = 0; i3 < i2; i3++) {
            list.add(new baq(j, j2));
            j += j2;
        }
        return j;
    }

    /* renamed from: a */
    private static int m2610a(int i, int i2) {
        if (i == -1) {
            return i2;
        }
        if (i2 != -1) {
            bks.m3512b(i == i2);
        }
        return i;
    }

    /* renamed from: a */
    private static void m2621a(XmlPullParser xmlPullParser) {
        if (bmp.m3766b(xmlPullParser)) {
            int i = 1;
            while (i != 0) {
                xmlPullParser.next();
                if (bmp.m3766b(xmlPullParser)) {
                    i++;
                } else if (bmp.m3763a(xmlPullParser)) {
                    i--;
                }
            }
        }
    }

    /* renamed from: a */
    private static boolean m2622a(String str) {
        return bkt.m3517c(str) || "application/ttml+xml".equals(str) || "application/x-mp4-vtt".equals(str) || "application/cea-708".equals(str) || "application/cea-608".equals(str);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v0, resolved type: bao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v1, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v2, resolved type: bao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v1, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v2, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v3, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v1, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v2, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v0, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r90v0, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r90v1, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r73v7, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v2, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v3, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v4, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v40, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v5, resolved type: bao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r71v10, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v47, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v6, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v51, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r87v7, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v6, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v36, resolved type: bao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v7, resolved type: bao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v48, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r51v8, resolved type: bap} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v113, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r67v4, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v4, resolved type: bar} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v5, resolved type: bao} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r38v6, resolved type: bap} */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bae.a(org.xmlpull.v1.XmlPullParser, java.lang.String, long):long
     arg types: [org.xmlpull.v1.XmlPullParser, java.lang.String, int]
     candidates:
      bae.a(org.xmlpull.v1.XmlPullParser, java.lang.String, int):int
      bae.a(org.xmlpull.v1.XmlPullParser, bao, long):bao
      bae.a(org.xmlpull.v1.XmlPullParser, java.lang.String, bau):bau
      bae.a(org.xmlpull.v1.XmlPullParser, java.lang.String, java.lang.String):java.lang.String
      bae.a(org.xmlpull.v1.XmlPullParser, long, long):java.util.List
      bae.a(org.xmlpull.v1.XmlPullParser, java.lang.String, long):long */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:360:0x0b00 A[Catch:{ XmlPullParserException -> 0x1032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0b08 A[Catch:{ XmlPullParserException -> 0x1032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:364:0x0b21 A[Catch:{ XmlPullParserException -> 0x1032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:376:0x0b4e A[Catch:{ XmlPullParserException -> 0x1032 }, LOOP:7: B:149:0x0716->B:376:0x0b4e, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:437:0x0ddb A[Catch:{ XmlPullParserException -> 0x1032 }, LOOP:6: B:100:0x044c->B:437:0x0ddb, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:458:0x0eb9 A[Catch:{ XmlPullParserException -> 0x1032 }, LOOP:1: B:41:0x0130->B:458:0x0eb9, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:495:0x0ff8 A[Catch:{ XmlPullParserException -> 0x1032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:497:0x1009 A[Catch:{ XmlPullParserException -> 0x1032 }] */
    /* JADX WARNING: Removed duplicated region for block: B:499:0x1011 A[Catch:{ XmlPullParserException -> 0x1032 }, LOOP:0: B:21:0x009a->B:499:0x1011, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:507:0x0fd6 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:508:0x0e42 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:525:0x0c34 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:526:0x07f4 A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final p000.bac mo1648a(android.net.Uri r134, java.io.InputStream r135) {
        /*
            r133 = this;
            java.lang.String r1 = "ProgramInformation"
            java.lang.String r2 = "MPD"
            java.lang.String r3 = "SupplementalProperty"
            java.lang.String r4 = "id"
            java.lang.String r5 = "BaseURL"
            r6 = r133
            org.xmlpull.v1.XmlPullParserFactory r7 = r6.f2989d     // Catch:{ XmlPullParserException -> 0x1032 }
            org.xmlpull.v1.XmlPullParser r7 = r7.newPullParser()     // Catch:{ XmlPullParserException -> 0x1032 }
            r8 = 0
            r9 = r135
            r7.setInput(r9, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r9 = r7.next()     // Catch:{ XmlPullParserException -> 0x1032 }
            r10 = 2
            if (r9 != r10) goto L_0x102a
            java.lang.String r9 = r7.getName()     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r9 = r2.equals(r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r9 == 0) goto L_0x102a
            java.lang.String r9 = r134.toString()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r11 = "availabilityStartTime"
            long r13 = m2632d(r7, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r11 = "mediaPresentationDuration"
            r134 = r9
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r15 = m2613a(r7, r11, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r11 = "minBufferTime"
            m2613a(r7, r11, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r11 = "type"
            java.lang.String r12 = "dynamic"
            r10 = 0
            java.lang.String r11 = r7.getAttributeValue(r10, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r11 = r12.equals(r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r11 == 0) goto L_0x005b
            java.lang.String r12 = "minimumUpdatePeriod"
            long r18 = m2613a(r7, r12, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x005e
        L_0x005b:
            r18 = r8
        L_0x005e:
            if (r11 == 0) goto L_0x0067
            java.lang.String r12 = "timeShiftBufferDepth"
            long r20 = m2613a(r7, r12, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x006a
        L_0x0067:
            r20 = r8
        L_0x006a:
            if (r11 == 0) goto L_0x0073
            java.lang.String r12 = "suggestedPresentationDelay"
            long r22 = m2613a(r7, r12, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x0076
        L_0x0073:
            r22 = r8
        L_0x0076:
            java.lang.String r12 = "publishTime"
            long r24 = m2632d(r7, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r12.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r11 != 0) goto L_0x0086
            r28 = 0
            goto L_0x008c
        L_0x0086:
            r28 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x008c:
            r30 = 0
            r10 = r134
            r8 = r28
            r28 = 0
            r29 = 0
            r33 = 0
            r34 = 0
        L_0x009a:
            r7.next()     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r35 = p000.bmp.m3767b(r7, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r35 != 0) goto L_0x0fa3
            boolean r35 = p000.bmp.m3767b(r7, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r6 = "lang"
            if (r35 != 0) goto L_0x0f28
            r35 = r12
            java.lang.String r12 = "UTCTiming"
            boolean r12 = p000.bmp.m3767b(r7, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            r36 = r13
            java.lang.String r13 = "value"
            java.lang.String r14 = "schemeIdUri"
            if (r12 != 0) goto L_0x0ef0
            java.lang.String r12 = "Location"
            boolean r12 = p000.bmp.m3767b(r7, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r12 == 0) goto L_0x00e0
            java.lang.String r6 = r7.nextText()     // Catch:{ XmlPullParserException -> 0x1032 }
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            r97 = r3
            r84 = r4
            r83 = r5
            r34 = r6
            r49 = r11
            r44 = r15
            r4 = r35
            r3 = 0
            r11 = r1
            r35 = r2
            r2 = r7
            goto L_0x0fcd
        L_0x00e0:
            java.lang.String r12 = "Period"
            boolean r12 = p000.bmp.m3767b(r7, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r12 != 0) goto L_0x00ff
            r97 = r3
            r84 = r4
            r83 = r5
            r46 = r8
            r48 = r10
            r49 = r11
            r44 = r15
            r4 = r35
            r16 = r1
            r35 = r2
            r2 = r7
            goto L_0x0ee7
        L_0x00ff:
            if (r33 != 0) goto L_0x0ed2
            r12 = 0
            java.lang.String r39 = r7.getAttributeValue(r12, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r12 = r35
            r44 = r15
            java.lang.String r15 = "start"
            long r40 = m2613a(r7, r15, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r15 = "duration"
            r16 = r1
            r35 = r2
            r46 = r8
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r1 = m2613a(r7, r15, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r8.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r48 = r10
            r15 = 0
            r38 = 0
        L_0x0130:
            r7.next()     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r42 = p000.bmp.m3767b(r7, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r42 != 0) goto L_0x0e0a
            r49 = r11
            java.lang.String r11 = "AdaptationSet"
            boolean r11 = p000.bmp.m3767b(r7, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            r50 = r12
            java.lang.String r12 = "SegmentTemplate"
            r42 = r10
            java.lang.String r10 = "SegmentList"
            r43 = r15
            java.lang.String r15 = "SegmentBase"
            if (r11 != 0) goto L_0x03c0
            java.lang.String r11 = "EventStream"
            boolean r11 = p000.bmp.m3767b(r7, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r11 == 0) goto L_0x032e
            java.lang.String r10 = ""
            java.lang.String r10 = m2619a(r7, r14, r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r11 = ""
            java.lang.String r11 = m2619a(r7, r13, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r12 = "timescale"
            r59 = r13
            r60 = r14
            r13 = 1
            long r12 = m2625b(r7, r12, r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r14.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.io.ByteArrayOutputStream r15 = new java.io.ByteArrayOutputStream     // Catch:{ XmlPullParserException -> 0x1032 }
            r61 = r8
            r8 = 512(0x200, float:7.175E-43)
            r15.<init>(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x017d:
            r7.next()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r8 = "Event"
            boolean r8 = p000.bmp.m3767b(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x02c8
            r8 = r5
            r62 = r6
            r5 = 0
            long r57 = m2625b(r7, r4, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r5 = "duration"
            r6 = r3
            r63 = r4
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            long r51 = m2625b(r7, r5, r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r3 = "presentationTime"
            r4 = 0
            long r31 = m2625b(r7, r3, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r53 = 1000(0x3e8, double:4.94E-321)
            r55 = r12
            long r64 = p000.blm.m3663b(r51, r53, r55)     // Catch:{ XmlPullParserException -> 0x1032 }
            r53 = 1000000(0xf4240, double:4.940656E-318)
            r51 = r31
            r55 = r12
            long r31 = p000.blm.m3663b(r51, r53, r55)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r3 = "messageData"
            r4 = 0
            java.lang.String r3 = m2619a(r7, r3, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r15.reset()     // Catch:{ XmlPullParserException -> 0x1032 }
            org.xmlpull.v1.XmlSerializer r5 = android.util.Xml.newSerializer()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r4 = "UTF-8"
            r5.setOutput(r15, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r7.nextToken()     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x01d0:
            java.lang.String r4 = "Event"
            boolean r4 = p000.bmp.m3764a(r7, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 != 0) goto L_0x0298
            int r4 = r7.getEventType()     // Catch:{ XmlPullParserException -> 0x1032 }
            switch(r4) {
                case 0: goto L_0x0283;
                case 1: goto L_0x027b;
                case 2: goto L_0x024e;
                case 3: goto L_0x023e;
                case 4: goto L_0x0232;
                case 5: goto L_0x0226;
                case 6: goto L_0x0219;
                case 7: goto L_0x020c;
                case 8: goto L_0x01ff;
                case 9: goto L_0x01f2;
                case 10: goto L_0x01e5;
                default: goto L_0x01df;
            }     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x01df:
            r68 = r6
            r66 = r12
            goto L_0x028f
        L_0x01e5:
            java.lang.String r4 = r7.getText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.docdecl(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            r66 = r12
            goto L_0x028f
        L_0x01f2:
            java.lang.String r4 = r7.getText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.comment(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            r66 = r12
            goto L_0x028f
        L_0x01ff:
            java.lang.String r4 = r7.getText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.processingInstruction(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            r66 = r12
            goto L_0x028f
        L_0x020c:
            java.lang.String r4 = r7.getText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.ignorableWhitespace(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            r66 = r12
            goto L_0x028f
        L_0x0219:
            java.lang.String r4 = r7.getText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.entityRef(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            r66 = r12
            goto L_0x028f
        L_0x0226:
            java.lang.String r4 = r7.getText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.cdsect(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            r66 = r12
            goto L_0x028f
        L_0x0232:
            java.lang.String r4 = r7.getText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.text(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            r66 = r12
            goto L_0x028f
        L_0x023e:
            java.lang.String r4 = r7.getNamespace()     // Catch:{ XmlPullParserException -> 0x1032 }
            r66 = r12
            java.lang.String r12 = r7.getName()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.endTag(r4, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            goto L_0x028f
        L_0x024e:
            r66 = r12
            java.lang.String r4 = r7.getNamespace()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r12 = r7.getName()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.startTag(r4, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            r4 = 0
        L_0x025c:
            int r12 = r7.getAttributeCount()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 >= r12) goto L_0x0278
            java.lang.String r12 = r7.getAttributeNamespace(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r13 = r7.getAttributeName(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r6
            java.lang.String r6 = r7.getAttributeValue(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.attribute(r12, r13, r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r4 = r4 + 1
            r6 = r68
            goto L_0x025c
        L_0x0278:
            r68 = r6
            goto L_0x028f
        L_0x027b:
            r68 = r6
            r66 = r12
            r5.endDocument()     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x028f
        L_0x0283:
            r68 = r6
            r66 = r12
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r30)     // Catch:{ XmlPullParserException -> 0x1032 }
            r6 = 0
            r5.startDocument(r6, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x028f:
            r7.nextToken()     // Catch:{ XmlPullParserException -> 0x1032 }
            r12 = r66
            r6 = r68
            goto L_0x01d0
        L_0x0298:
            r68 = r6
            r66 = r12
            r5.flush()     // Catch:{ XmlPullParserException -> 0x1032 }
            byte[] r5 = r15.toByteArray()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.Long r6 = java.lang.Long.valueOf(r31)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r3 != 0) goto L_0x02ab
            r3 = r5
            goto L_0x02af
        L_0x02ab:
            byte[] r3 = p000.blm.m3674c(r3)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x02af:
            aue r5 = new aue     // Catch:{ XmlPullParserException -> 0x1032 }
            r51 = r5
            r52 = r10
            r53 = r11
            r54 = r64
            r56 = r57
            r58 = r3
            r51.<init>(r52, r53, r54, r56, r58)     // Catch:{ XmlPullParserException -> 0x1032 }
            android.util.Pair r3 = android.util.Pair.create(r6, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            r14.add(r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x02d4
        L_0x02c8:
            r68 = r3
            r63 = r4
            r8 = r5
            r62 = r6
            r66 = r12
            m2621a(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x02d4:
            java.lang.String r3 = "EventStream"
            boolean r3 = p000.bmp.m3764a(r7, r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r3 == 0) goto L_0x0323
            int r3 = r14.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            long[] r3 = new long[r3]     // Catch:{ XmlPullParserException -> 0x1032 }
            int r5 = r14.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            aue[] r5 = new p000.aue[r5]     // Catch:{ XmlPullParserException -> 0x1032 }
            r6 = 0
        L_0x02e9:
            int r12 = r14.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r6 >= r12) goto L_0x0308
            java.lang.Object r12 = r14.get(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            android.util.Pair r12 = (android.util.Pair) r12     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.Object r13 = r12.first     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.Long r13 = (java.lang.Long) r13     // Catch:{ XmlPullParserException -> 0x1032 }
            long r31 = r13.longValue()     // Catch:{ XmlPullParserException -> 0x1032 }
            r3[r6] = r31     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.Object r12 = r12.second     // Catch:{ XmlPullParserException -> 0x1032 }
            aue r12 = (p000.aue) r12     // Catch:{ XmlPullParserException -> 0x1032 }
            r5[r6] = r12     // Catch:{ XmlPullParserException -> 0x1032 }
            int r6 = r6 + 1
            goto L_0x02e9
        L_0x0308:
            bag r6 = new bag     // Catch:{ XmlPullParserException -> 0x1032 }
            r6.<init>(r10, r11, r3, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            r9.add(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r2 = r7
            r83 = r8
            r57 = r9
            r10 = r42
            r1 = r61
            r69 = r62
            r84 = r63
            r97 = r68
            goto L_0x0e38
        L_0x0323:
            r5 = r8
            r6 = r62
            r4 = r63
            r12 = r66
            r3 = r68
            goto L_0x017d
        L_0x032e:
            r68 = r3
            r63 = r4
            r62 = r6
            r61 = r8
            r59 = r13
            r60 = r14
            r8 = r5
            boolean r3 = p000.bmp.m3767b(r7, r15)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r3 != 0) goto L_0x03a3
            boolean r3 = p000.bmp.m3767b(r7, r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r3 != 0) goto L_0x0385
            boolean r3 = p000.bmp.m3767b(r7, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r3 == 0) goto L_0x036e
            java.util.List r3 = java.util.Collections.emptyList()     // Catch:{ XmlPullParserException -> 0x1032 }
            r4 = 0
            bap r3 = m2616a(r7, r4, r3, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r38 = r3
            r2 = r7
            r83 = r8
            r57 = r9
            r10 = r42
            r15 = r43
            r1 = r61
            r69 = r62
            r84 = r63
            r97 = r68
            goto L_0x0e3a
        L_0x036e:
            m2621a(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r2 = r7
            r83 = r8
            r57 = r9
            r10 = r42
            r1 = r61
            r69 = r62
            r84 = r63
            r97 = r68
            goto L_0x0e38
        L_0x0385:
            r3 = 0
            bao r4 = m2615a(r7, r3, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r38 = r4
            r2 = r7
            r83 = r8
            r57 = r9
            r10 = r42
            r15 = r43
            r1 = r61
            r69 = r62
            r84 = r63
            r97 = r68
            goto L_0x0e3a
        L_0x03a3:
            r3 = 0
            bar r4 = m2617a(r7, r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r38 = r4
            r2 = r7
            r83 = r8
            r57 = r9
            r10 = r42
            r15 = r43
            r1 = r61
            r69 = r62
            r84 = r63
            r97 = r68
            goto L_0x0e3a
        L_0x03c0:
            r68 = r3
            r63 = r4
            r62 = r6
            r61 = r8
            r59 = r13
            r60 = r14
            r8 = r5
            r4 = -1
            r5 = r63
            int r52 = m2611a(r7, r5, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r6 = m2631d(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r11 = "mimeType"
            r3 = 0
            java.lang.String r11 = r7.getAttributeValue(r3, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r13 = "codecs"
            java.lang.String r13 = r7.getAttributeValue(r3, r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r14 = "width"
            int r14 = m2611a(r7, r14, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r3 = "height"
            int r3 = m2611a(r7, r3, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r4 = m2609a(r7, r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r32 = r6
            java.lang.String r6 = "audioSamplingRate"
            r57 = r9
            r9 = -1
            int r6 = m2611a(r7, r6, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            r135 = r6
            r9 = r62
            r6 = 0
            java.lang.String r51 = r7.getAttributeValue(r6, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r6 = "label"
            r62 = r9
            r9 = 0
            java.lang.String r6 = r7.getAttributeValue(r9, r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.ArrayList r9 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r9.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r54 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r55 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r56 = r3
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r58 = r14
            java.util.ArrayList r14 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r14.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r63 = r13
            java.util.ArrayList r13 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r13.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r64 = r13
            r13 = r32
            r81 = r42
            r65 = r51
            r32 = 0
            r66 = -1
            r67 = 0
            r51 = r38
        L_0x044c:
            r7.next()     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r69 = p000.bmp.m3767b(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r69 != 0) goto L_0x0bf1
            r82 = r13
            java.lang.String r13 = "ContentProtection"
            boolean r13 = p000.bmp.m3767b(r7, r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 == 0) goto L_0x049f
            android.util.Pair r13 = m2629c(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            r83 = r8
            java.lang.Object r8 = r13.first     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x046f
            java.lang.Object r8 = r13.first     // Catch:{ XmlPullParserException -> 0x1032 }
            r67 = r8
            java.lang.String r67 = (java.lang.String) r67     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x046f:
            java.lang.Object r8 = r13.second     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0474
            goto L_0x047d
        L_0x0474:
            java.lang.Object r8 = r13.second     // Catch:{ XmlPullParserException -> 0x1032 }
            anp r8 = (p000.anp) r8     // Catch:{ XmlPullParserException -> 0x1032 }
            r9.add(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x047d:
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r97 = r68
            r13 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            r68 = r9
            goto L_0x0c2c
        L_0x049f:
            r83 = r8
            java.lang.String r8 = "ContentComponent"
            boolean r8 = p000.bmp.m3767b(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0baa
            java.lang.String r8 = "Role"
            boolean r8 = p000.bmp.m3767b(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x04e1
            java.lang.String r8 = "Role"
            baf r8 = m2614a(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            r3.add(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r97 = r68
            r5 = r81
            r8 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            r68 = r9
            r9 = r65
            goto L_0x0c27
        L_0x04e1:
            java.lang.String r8 = "AudioChannelConfiguration"
            boolean r8 = p000.bmp.m3767b(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0b7d
            java.lang.String r8 = "Accessibility"
            boolean r8 = p000.bmp.m3767b(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x0521
            java.lang.String r8 = "Accessibility"
            baf r8 = m2614a(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            r4.add(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r97 = r68
            r5 = r81
            r8 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            r68 = r9
            r9 = r65
            goto L_0x0c27
        L_0x0521:
            r8 = r68
            boolean r13 = p000.bmp.m3767b(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 == 0) goto L_0x0558
            baf r13 = m2614a(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            r14.add(r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r97 = r8
            r68 = r9
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r9 = r65
            r5 = r81
            r8 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            goto L_0x0c27
        L_0x0558:
            java.lang.String r13 = "Representation"
            boolean r13 = p000.bmp.m3767b(r7, r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            r68 = r9
            java.lang.String r9 = "InbandEventStream"
            if (r13 != 0) goto L_0x06ad
            boolean r13 = p000.bmp.m3767b(r7, r15)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 != 0) goto L_0x0682
            boolean r13 = p000.bmp.m3767b(r7, r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 != 0) goto L_0x0657
            boolean r13 = p000.bmp.m3767b(r7, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 == 0) goto L_0x05a1
            r9 = r51
            bap r9 = (p000.bap) r9     // Catch:{ XmlPullParserException -> 0x1032 }
            bap r9 = m2616a(r7, r9, r14, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r97 = r8
            r51 = r9
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r13 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            goto L_0x0c2c
        L_0x05a1:
            boolean r13 = p000.bmp.m3767b(r7, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 == 0) goto L_0x05d4
            baf r9 = m2614a(r7, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            r6.add(r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r97 = r8
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r9 = r65
            r5 = r81
            r8 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            goto L_0x0c27
        L_0x05d4:
            java.lang.String r9 = "Label"
            boolean r9 = p000.bmp.m3767b(r7, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r9 == 0) goto L_0x0605
            java.lang.String r9 = "Label"
            java.lang.String r9 = m2628b(r7, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r97 = r8
            r54 = r9
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r13 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            goto L_0x0c2c
        L_0x0605:
            boolean r9 = p000.bmp.m3766b(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r9 == 0) goto L_0x0633
            m2621a(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r97 = r8
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r9 = r65
            r5 = r81
            r8 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            goto L_0x0c27
        L_0x0633:
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r97 = r8
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r9 = r65
            r5 = r81
            r8 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            goto L_0x0c27
        L_0x0657:
            r9 = r51
            bao r9 = (p000.bao) r9     // Catch:{ XmlPullParserException -> 0x1032 }
            bao r9 = m2615a(r7, r9, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r97 = r8
            r51 = r9
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r13 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            goto L_0x0c2c
        L_0x0682:
            r9 = r51
            bar r9 = (p000.bar) r9     // Catch:{ XmlPullParserException -> 0x1032 }
            bar r9 = m2617a(r7, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r97 = r8
            r51 = r9
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r13 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            goto L_0x0c2c
        L_0x06ad:
            r13 = 0
            java.lang.String r69 = r7.getAttributeValue(r13, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r13 = "bandwidth"
            r84 = r5
            r5 = -1
            int r74 = m2611a(r7, r13, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r5 = "mimeType"
            java.lang.String r5 = m2619a(r7, r5, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r13 = "codecs"
            r85 = r11
            r11 = r63
            java.lang.String r13 = m2619a(r7, r13, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            r63 = r11
            java.lang.String r11 = "width"
            r86 = r6
            r6 = r58
            int r75 = m2611a(r7, r11, r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r11 = "height"
            r58 = r6
            r6 = r56
            int r76 = m2611a(r7, r11, r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            r11 = r55
            float r77 = m2609a(r7, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            r56 = r6
            java.lang.String r6 = "audioSamplingRate"
            r55 = r11
            r11 = r135
            int r6 = m2611a(r7, r6, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            r135 = r11
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r11.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r78 = r6
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r6.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r94 = r4
            java.util.ArrayList r4 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            r4.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r95 = r3
            r73 = r51
            r72 = r66
            r3 = r81
            r70 = 0
            r71 = 0
        L_0x0716:
            r7.next()     // Catch:{ XmlPullParserException -> 0x1032 }
            r79 = r13
            r13 = r83
            boolean r80 = p000.bmp.m3767b(r7, r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r80 != 0) goto L_0x07cf
            r83 = r13
            java.lang.String r13 = "AudioChannelConfiguration"
            boolean r13 = p000.bmp.m3767b(r7, r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 != 0) goto L_0x07c3
            boolean r13 = p000.bmp.m3767b(r7, r15)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 == 0) goto L_0x0745
            r13 = r73
            bar r13 = (p000.bar) r13     // Catch:{ XmlPullParserException -> 0x1032 }
            bar r13 = m2617a(r7, r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            r96 = r10
            r87 = r13
            r13 = r71
            r10 = r72
            goto L_0x07ea
        L_0x0745:
            boolean r13 = p000.bmp.m3767b(r7, r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 != 0) goto L_0x07b1
            boolean r13 = p000.bmp.m3767b(r7, r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 == 0) goto L_0x0765
            r13 = r73
            bap r13 = (p000.bap) r13     // Catch:{ XmlPullParserException -> 0x1032 }
            bap r13 = m2616a(r7, r13, r14, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            r96 = r10
            r87 = r13
            r13 = r71
            r10 = r72
            goto L_0x07ea
        L_0x0765:
            java.lang.String r13 = "ContentProtection"
            boolean r13 = p000.bmp.m3767b(r7, r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r13 == 0) goto L_0x078b
            android.util.Pair r13 = m2629c(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            r96 = r10
            java.lang.Object r10 = r13.first     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r10 == 0) goto L_0x077d
            java.lang.Object r10 = r13.first     // Catch:{ XmlPullParserException -> 0x1032 }
            r71 = r10
            java.lang.String r71 = (java.lang.String) r71     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x077d:
            java.lang.Object r10 = r13.second     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r10 == 0) goto L_0x07e3
            java.lang.Object r10 = r13.second     // Catch:{ XmlPullParserException -> 0x1032 }
            anp r10 = (p000.anp) r10     // Catch:{ XmlPullParserException -> 0x1032 }
            r11.add(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x07e4
        L_0x078b:
            r96 = r10
            boolean r10 = p000.bmp.m3767b(r7, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r10 == 0) goto L_0x079c
            baf r10 = m2614a(r7, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            r6.add(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x07e4
        L_0x079c:
            boolean r10 = p000.bmp.m3767b(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r10 == 0) goto L_0x07ac
            baf r10 = m2614a(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            r4.add(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x07e4
        L_0x07ac:
            m2621a(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x07e4
        L_0x07b1:
            r96 = r10
            r10 = r73
            bao r10 = (p000.bao) r10     // Catch:{ XmlPullParserException -> 0x1032 }
            bao r10 = m2615a(r7, r10, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            r87 = r10
            r13 = r71
            r10 = r72
            goto L_0x07ea
        L_0x07c3:
            r96 = r10
            int r10 = m2624b(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            r13 = r71
            r87 = r73
            goto L_0x07ea
        L_0x07cf:
            r96 = r10
            r83 = r13
            if (r70 != 0) goto L_0x07e3
            java.lang.String r3 = m2630c(r7, r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            r13 = r71
            r10 = r72
            r87 = r73
            r70 = 1
            goto L_0x07ea
        L_0x07e3:
        L_0x07e4:
            r13 = r71
            r10 = r72
            r87 = r73
        L_0x07ea:
            r97 = r8
            java.lang.String r8 = "Representation"
            boolean r8 = p000.bmp.m3764a(r7, r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x0b4e
            boolean r8 = p000.bkt.m3515a(r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x0802
            java.lang.String r8 = p000.bkt.m3519e(r79)     // Catch:{ XmlPullParserException -> 0x1032 }
            r9 = r79
            goto L_0x0873
        L_0x0802:
            boolean r8 = p000.bkt.m3516b(r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x0811
            java.lang.String r8 = p000.bkt.m3518d(r79)     // Catch:{ XmlPullParserException -> 0x1032 }
            r9 = r79
            goto L_0x0873
        L_0x0811:
            boolean r8 = m2622a(r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0870
            java.lang.String r8 = "application/mp4"
            boolean r8 = r8.equals(r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0851
            java.lang.String r8 = "application/x-rawcc"
            boolean r8 = r8.equals(r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x084e
            if (r79 == 0) goto L_0x084b
            java.lang.String r8 = "cea708"
            r9 = r79
            boolean r8 = r9.contains(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0846
            java.lang.String r8 = "eia608"
            boolean r8 = r9.contains(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0843
            java.lang.String r8 = "cea608"
            boolean r8 = r9.contains(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x086e
        L_0x0843:
            java.lang.String r8 = "application/cea-608"
            goto L_0x0849
        L_0x0846:
            java.lang.String r8 = "application/cea-708"
        L_0x0849:
            goto L_0x0873
        L_0x084b:
            r9 = r79
            goto L_0x086e
        L_0x084e:
            r9 = r79
            goto L_0x086e
        L_0x0851:
            r9 = r79
            if (r9 == 0) goto L_0x086d
            java.lang.String r8 = "stpp"
            boolean r8 = r9.startsWith(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0868
            java.lang.String r8 = "wvtt"
            boolean r8 = r9.startsWith(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x086d
            java.lang.String r8 = "application/x-mp4-vtt"
            goto L_0x086b
        L_0x0868:
            java.lang.String r8 = "application/ttml+xml"
        L_0x086b:
            goto L_0x0873
        L_0x086d:
        L_0x086e:
            r8 = 0
            goto L_0x0873
        L_0x0870:
            r9 = r79
            r8 = r5
        L_0x0873:
            r98 = r12
            r12 = 0
        L_0x0876:
            r99 = r15
            int r15 = r95.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            r100 = r1
            java.lang.String r1 = "urn:mpeg:dash:role:2011"
            if (r12 >= r15) goto L_0x08ad
            r2 = r95
            java.lang.Object r15 = r2.get(r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            baf r15 = (p000.baf) r15     // Catch:{ XmlPullParserException -> 0x1032 }
            r95 = r14
            java.lang.String r14 = r15.f2990a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r14 = r1.equalsIgnoreCase(r14)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r14 == 0) goto L_0x08a2
            java.lang.String r14 = "main"
            java.lang.String r15 = r15.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r14 = r14.equals(r15)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r14 != 0) goto L_0x089f
            goto L_0x08a2
        L_0x089f:
            r79 = 1
            goto L_0x08b3
        L_0x08a2:
            int r12 = r12 + 1
            r14 = r95
            r15 = r99
            r95 = r2
            r1 = r100
            goto L_0x0876
        L_0x08ad:
            r2 = r95
            r95 = r14
            r79 = 0
        L_0x08b3:
            r12 = 0
            r14 = 0
        L_0x08b5:
            int r15 = r2.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r12 >= r15) goto L_0x08d9
            java.lang.Object r15 = r2.get(r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            baf r15 = (p000.baf) r15     // Catch:{ XmlPullParserException -> 0x1032 }
            r102 = r2
            java.lang.String r2 = r15.f2990a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r2 = r1.equalsIgnoreCase(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r2 != 0) goto L_0x08cc
            goto L_0x08d4
        L_0x08cc:
            java.lang.String r2 = r15.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            int r2 = m2623b(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            r2 = r2 | r14
            r14 = r2
        L_0x08d4:
            int r12 = r12 + 1
            r2 = r102
            goto L_0x08b5
        L_0x08d9:
            r102 = r2
            r2 = 0
            r12 = 0
        L_0x08dd:
            int r15 = r94.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            r103 = r7
            if (r2 >= r15) goto L_0x097f
            r15 = r94
            java.lang.Object r70 = r15.get(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            r7 = r70
            baf r7 = (p000.baf) r7     // Catch:{ XmlPullParserException -> 0x1032 }
            r93 = r6
            java.lang.String r6 = r7.f2990a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r6 = r1.equalsIgnoreCase(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r6 != 0) goto L_0x0968
            java.lang.String r6 = "urn:tva:metadata:cs:AudioPurposeCS:2007"
            r70 = r1
            java.lang.String r1 = r7.f2990a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r1 = r6.equalsIgnoreCase(r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r1 != 0) goto L_0x0908
            r1 = 2
            goto L_0x0973
        L_0x0908:
            java.lang.String r1 = r7.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            r6 = 4
            if (r1 == 0) goto L_0x0963
            int r7 = r1.hashCode()
            switch(r7) {
                case 49: goto L_0x093d;
                case 50: goto L_0x0933;
                case 51: goto L_0x0929;
                case 52: goto L_0x091f;
                case 53: goto L_0x0914;
                case 54: goto L_0x0915;
                default: goto L_0x0914;
            }
        L_0x0914:
            goto L_0x0947
        L_0x0915:
            java.lang.String r7 = "6"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0914
            r1 = 4
            goto L_0x0948
        L_0x091f:
            java.lang.String r7 = "4"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0914
            r1 = 3
            goto L_0x0948
        L_0x0929:
            java.lang.String r7 = "3"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0914
            r1 = 2
            goto L_0x0948
        L_0x0933:
            java.lang.String r7 = "2"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0914
            r1 = 1
            goto L_0x0948
        L_0x093d:
            java.lang.String r7 = "1"
            boolean r1 = r1.equals(r7)
            if (r1 == 0) goto L_0x0914
            r1 = 0
            goto L_0x0948
        L_0x0947:
            r1 = -1
        L_0x0948:
            if (r1 == 0) goto L_0x0960
            r7 = 1
            if (r1 == r7) goto L_0x095d
            r7 = 2
            if (r1 == r7) goto L_0x095b
            r7 = 3
            if (r1 == r7) goto L_0x0958
            if (r1 == r6) goto L_0x0956
            goto L_0x0963
        L_0x0956:
            r1 = 1
            goto L_0x0964
        L_0x0958:
            r1 = 8
            goto L_0x0964
        L_0x095b:
            r1 = 4
            goto L_0x0964
        L_0x095d:
            r1 = 2048(0x800, float:2.87E-42)
            goto L_0x0964
        L_0x0960:
            r1 = 512(0x200, float:7.175E-43)
            goto L_0x0964
        L_0x0963:
            r1 = 0
        L_0x0964:
            r1 = r1 | r12
            r12 = r1
            r1 = 2
            goto L_0x0973
        L_0x0968:
            r70 = r1
            r1 = 2
            java.lang.String r6 = r7.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            int r6 = m2623b(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            r6 = r6 | r12
            r12 = r6
        L_0x0973:
            int r2 = r2 + 1
            r94 = r15
            r1 = r70
            r6 = r93
            r7 = r103
            goto L_0x08dd
        L_0x097f:
            r93 = r6
            r15 = r94
            r1 = 2
            r7 = 3
            r80 = r14 | r12
            if (r8 == 0) goto L_0x0ae7
            java.lang.String r2 = "audio/eac3"
            boolean r2 = r2.equals(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r2 != 0) goto L_0x0993
            r2 = r8
            goto L_0x09c0
        L_0x0993:
            r2 = 0
        L_0x0994:
            int r6 = r4.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r2 >= r6) goto L_0x09bc
            java.lang.Object r6 = r4.get(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            baf r6 = (p000.baf) r6     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r8 = "tag:dolby.com,2014:dash:DolbyDigitalPlusExtensionType:2014"
            java.lang.String r12 = r6.f2990a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r8 = r8.equals(r12)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x09b8
            java.lang.String r8 = "ec+3"
            java.lang.String r6 = r6.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r6 = r8.equals(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r6 != 0) goto L_0x09b5
            goto L_0x09b8
        L_0x09b5:
            java.lang.String r2 = "audio/eac3-joc"
            goto L_0x09be
        L_0x09b8:
            int r2 = r2 + 1
            goto L_0x0994
        L_0x09bc:
            java.lang.String r2 = "audio/eac3"
        L_0x09be:
        L_0x09c0:
            boolean r4 = p000.bkt.m3516b(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 != 0) goto L_0x0ad4
            boolean r4 = p000.bkt.m3515a(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 == 0) goto L_0x09e9
            r70 = 0
            r77 = 0
            r71 = r5
            r72 = r2
            r73 = r9
            r75 = r10
            r76 = r78
            r78 = r79
            r79 = r80
            r80 = r65
            akh r2 = p000.akh.m742a(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)     // Catch:{ XmlPullParserException -> 0x1032 }
            r88 = r2
            r6 = 1
            goto L_0x0afd
        L_0x09e9:
            boolean r4 = m2622a(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 == 0) goto L_0x0ad0
            java.lang.String r4 = "application/cea-608"
            boolean r4 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 != 0) goto L_0x0a5b
            java.lang.String r4 = "application/cea-708"
            boolean r4 = r4.equals(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 == 0) goto L_0x0a59
            r4 = 0
        L_0x0a00:
            int r6 = r15.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 >= r6) goto L_0x0a58
            java.lang.Object r6 = r15.get(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            baf r6 = (p000.baf) r6     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r8 = "urn:scte:dash:cc:cea-708:2015"
            java.lang.String r10 = r6.f2990a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r8 = r8.equals(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0a17
        L_0x0a16:
            goto L_0x0a55
        L_0x0a17:
            java.lang.String r8 = r6.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x0a16
            java.util.regex.Pattern r8 = p000.bae.f2988c     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r10 = r6.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.regex.Matcher r8 = r8.matcher(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r10 = r8.matches()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r10 != 0) goto L_0x0a47
            java.lang.String r8 = "MpdParser"
            java.lang.String r10 = "Unable to parse CEA-708 service block number from: "
            java.lang.String r6 = r6.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r12 = r6.length()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r12 != 0) goto L_0x0a3f
            java.lang.String r6 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x1032 }
            r6.<init>(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x0a43
        L_0x0a3f:
            java.lang.String r6 = r10.concat(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x0a43:
            android.util.Log.w(r8, r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x0a55
        L_0x0a47:
            r4 = 1
            java.lang.String r6 = r8.group(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r4 = java.lang.Integer.parseInt(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            r78 = r4
            r6 = 1
            goto L_0x0abb
        L_0x0a55:
            int r4 = r4 + 1
            goto L_0x0a00
        L_0x0a58:
        L_0x0a59:
            r6 = 1
            goto L_0x0ab9
        L_0x0a5b:
            r4 = 0
        L_0x0a5d:
            int r6 = r15.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 >= r6) goto L_0x0ab7
            java.lang.Object r6 = r15.get(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            baf r6 = (p000.baf) r6     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r8 = "urn:scte:dash:cc:cea-608:2015"
            java.lang.String r10 = r6.f2990a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r8 = r8.equals(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 != 0) goto L_0x0a75
            r6 = 1
            goto L_0x0ab4
        L_0x0a75:
            java.lang.String r8 = r6.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x0ab3
            java.util.regex.Pattern r8 = p000.bae.f2987b     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r10 = r6.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.regex.Matcher r8 = r8.matcher(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r10 = r8.matches()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r10 != 0) goto L_0x0aa6
            java.lang.String r8 = "MpdParser"
            java.lang.String r10 = "Unable to parse CEA-608 channel number from: "
            java.lang.String r6 = r6.f2991b     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r12 = r6.length()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r12 != 0) goto L_0x0a9d
            java.lang.String r6 = new java.lang.String     // Catch:{ XmlPullParserException -> 0x1032 }
            r6.<init>(r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x0aa1
        L_0x0a9d:
            java.lang.String r6 = r10.concat(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x0aa1:
            android.util.Log.w(r8, r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            r6 = 1
            goto L_0x0ab4
        L_0x0aa6:
            r6 = 1
            java.lang.String r4 = r8.group(r6)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r4 = java.lang.Integer.parseInt(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r78 = r4
            goto L_0x0abb
        L_0x0ab3:
            r6 = 1
        L_0x0ab4:
            int r4 = r4 + 1
            goto L_0x0a5d
        L_0x0ab7:
            r6 = 1
        L_0x0ab9:
            r78 = -1
        L_0x0abb:
            r70 = 0
            r71 = r5
            r72 = r2
            r73 = r9
            r75 = r79
            r76 = r80
            r77 = r65
            akh r2 = p000.akh.m741a(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78)     // Catch:{ XmlPullParserException -> 0x1032 }
            r88 = r2
            goto L_0x0afd
        L_0x0ad0:
            r6 = 1
            r72 = r2
            goto L_0x0aea
        L_0x0ad4:
            r6 = 1
            r70 = 0
            r78 = 0
            r71 = r5
            r72 = r2
            r73 = r9
            akh r2 = p000.akh.m739a(r69, r70, r71, r72, r73, r74, r75, r76, r77, r78, r79, r80)     // Catch:{ XmlPullParserException -> 0x1032 }
            r88 = r2
            goto L_0x0afd
        L_0x0ae7:
            r6 = 1
            r72 = r8
        L_0x0aea:
            r70 = 0
            r71 = r5
            r73 = r9
            r75 = r79
            r76 = r80
            r77 = r65
            akh r2 = p000.akh.m740a(r69, r70, r71, r72, r73, r74, r75, r76, r77)     // Catch:{ XmlPullParserException -> 0x1032 }
            r88 = r2
        L_0x0afd:
            if (r87 != 0) goto L_0x0b08
            bar r2 = new bar     // Catch:{ XmlPullParserException -> 0x1032 }
            r2.<init>()     // Catch:{ XmlPullParserException -> 0x1032 }
            r90 = r2
            goto L_0x0b0a
        L_0x0b08:
            r90 = r87
        L_0x0b0a:
            bad r2 = new bad     // Catch:{ XmlPullParserException -> 0x1032 }
            r87 = r2
            r89 = r3
            r91 = r13
            r92 = r11
            r87.<init>(r88, r89, r90, r91, r92, r93)     // Catch:{ XmlPullParserException -> 0x1032 }
            akh r3 = r2.f2980a     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r3 = r3.f556i     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 != 0) goto L_0x0b3a
            boolean r4 = p000.bkt.m3516b(r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 != 0) goto L_0x0b38
            boolean r4 = p000.bkt.m3515a(r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 != 0) goto L_0x0b36
            boolean r3 = m2622a(r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r3 != 0) goto L_0x0b34
            goto L_0x0b3a
        L_0x0b34:
            goto L_0x0b3b
        L_0x0b36:
            r7 = 1
            goto L_0x0b3b
        L_0x0b38:
            r7 = 2
            goto L_0x0b3b
        L_0x0b3a:
            r7 = -1
        L_0x0b3b:
            r8 = r82
            int r3 = m2610a(r8, r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            r7 = r64
            r7.add(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            r13 = r3
            r3 = r62
            r2 = r103
            goto L_0x0c2c
        L_0x0b4e:
            r100 = r1
            r93 = r6
            r103 = r7
            r98 = r12
            r99 = r15
            r7 = r64
            r2 = r79
            r8 = r82
            r15 = r94
            r102 = r95
            r1 = 2
            r6 = 1
            r95 = r14
            r72 = r10
            r71 = r13
            r73 = r87
            r6 = r93
            r10 = r96
            r8 = r97
            r15 = r99
            r95 = r102
            r7 = r103
            r13 = r2
            r1 = r100
            goto L_0x0716
        L_0x0b7d:
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r103 = r7
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r7 = r64
            r97 = r68
            r8 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            r68 = r9
            int r2 = m2624b(r103)     // Catch:{ XmlPullParserException -> 0x1032 }
            r66 = r2
            r13 = r8
            r3 = r62
            r2 = r103
            goto L_0x0c2c
        L_0x0baa:
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r103 = r7
            r96 = r10
            r85 = r11
            r98 = r12
            r95 = r14
            r99 = r15
            r7 = r64
            r97 = r68
            r8 = r82
            r1 = 2
            r6 = 1
            r15 = r4
            r68 = r9
            r3 = r62
            r2 = r103
            r4 = 0
            java.lang.String r5 = r2.getAttributeValue(r4, r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            r9 = r65
            if (r9 != 0) goto L_0x0bd7
            goto L_0x0be4
        L_0x0bd7:
            if (r5 == 0) goto L_0x0be2
            boolean r5 = r9.equals(r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            p000.bks.m3512b(r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x0be3
        L_0x0be2:
        L_0x0be3:
            r5 = r9
        L_0x0be4:
            int r9 = m2631d(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r8 = m2610a(r8, r9)     // Catch:{ XmlPullParserException -> 0x1032 }
            r65 = r5
            r13 = r8
            goto L_0x0c2c
        L_0x0bf1:
            r100 = r1
            r102 = r3
            r84 = r5
            r86 = r6
            r2 = r7
            r83 = r8
            r96 = r10
            r85 = r11
            r98 = r12
            r8 = r13
            r95 = r14
            r99 = r15
            r3 = r62
            r7 = r64
            r97 = r68
            r1 = 2
            r6 = 1
            r15 = r4
            r68 = r9
            r9 = r65
            if (r32 != 0) goto L_0x0c25
            r5 = r81
            java.lang.String r5 = m2630c(r2, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            r81 = r5
            r13 = r8
            r65 = r9
            r32 = 1
            goto L_0x0c2c
        L_0x0c25:
            r5 = r81
        L_0x0c27:
            r81 = r5
            r13 = r8
            r65 = r9
        L_0x0c2c:
            java.lang.String r5 = "AdaptationSet"
            boolean r5 = p000.bmp.m3764a(r2, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r5 == 0) goto L_0x0ddb
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ XmlPullParserException -> 0x1032 }
            int r8 = r7.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5.<init>(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            r8 = 0
        L_0x0c3e:
            int r9 = r7.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 >= r9) goto L_0x0db9
            java.lang.Object r9 = r7.get(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            bad r9 = (p000.bad) r9     // Catch:{ XmlPullParserException -> 0x1032 }
            akh r10 = r9.f2980a     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r54 == 0) goto L_0x0cf5
            akh r11 = new akh     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r12 = r10.f548a     // Catch:{ XmlPullParserException -> 0x1032 }
            int r14 = r10.f550c     // Catch:{ XmlPullParserException -> 0x1032 }
            int r1 = r10.f551d     // Catch:{ XmlPullParserException -> 0x1032 }
            int r4 = r10.f552e     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r6 = r10.f553f     // Catch:{ XmlPullParserException -> 0x1032 }
            r64 = r7
            atw r7 = r10.f554g     // Catch:{ XmlPullParserException -> 0x1032 }
            r69 = r3
            java.lang.String r3 = r10.f555h     // Catch:{ XmlPullParserException -> 0x1032 }
            r70 = r2
            java.lang.String r2 = r10.f556i     // Catch:{ XmlPullParserException -> 0x1032 }
            r94 = r15
            int r15 = r10.f557j     // Catch:{ XmlPullParserException -> 0x1032 }
            r53 = r13
            java.util.List r13 = r10.f558k     // Catch:{ XmlPullParserException -> 0x1032 }
            r32 = r8
            anq r8 = r10.f559l     // Catch:{ XmlPullParserException -> 0x1032 }
            r51 = r8
            r135 = r9
            long r8 = r10.f560m     // Catch:{ XmlPullParserException -> 0x1032 }
            r55 = r5
            int r5 = r10.f561n     // Catch:{ XmlPullParserException -> 0x1032 }
            r56 = r5
            int r5 = r10.f562o     // Catch:{ XmlPullParserException -> 0x1032 }
            r58 = r5
            float r5 = r10.f563p     // Catch:{ XmlPullParserException -> 0x1032 }
            r63 = r5
            int r5 = r10.f564q     // Catch:{ XmlPullParserException -> 0x1032 }
            r65 = r5
            float r5 = r10.f565r     // Catch:{ XmlPullParserException -> 0x1032 }
            r66 = r5
            byte[] r5 = r10.f567t     // Catch:{ XmlPullParserException -> 0x1032 }
            r71 = r5
            int r5 = r10.f566s     // Catch:{ XmlPullParserException -> 0x1032 }
            r72 = r5
            blp r5 = r10.f568u     // Catch:{ XmlPullParserException -> 0x1032 }
            r73 = r5
            int r5 = r10.f569v     // Catch:{ XmlPullParserException -> 0x1032 }
            r74 = r5
            int r5 = r10.f570w     // Catch:{ XmlPullParserException -> 0x1032 }
            r75 = r5
            int r5 = r10.f571x     // Catch:{ XmlPullParserException -> 0x1032 }
            r76 = r5
            int r5 = r10.f572y     // Catch:{ XmlPullParserException -> 0x1032 }
            r77 = r5
            int r5 = r10.f573z     // Catch:{ XmlPullParserException -> 0x1032 }
            r78 = r5
            java.lang.String r5 = r10.f544A     // Catch:{ XmlPullParserException -> 0x1032 }
            r79 = r5
            int r5 = r10.f545B     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.Class r10 = r10.f546C     // Catch:{ XmlPullParserException -> 0x1032 }
            r103 = r11
            r104 = r12
            r105 = r54
            r106 = r14
            r107 = r1
            r108 = r4
            r109 = r6
            r110 = r7
            r111 = r3
            r112 = r2
            r113 = r15
            r114 = r13
            r115 = r51
            r116 = r8
            r118 = r56
            r119 = r58
            r120 = r63
            r121 = r65
            r122 = r66
            r123 = r71
            r124 = r72
            r125 = r73
            r126 = r74
            r127 = r75
            r128 = r76
            r129 = r77
            r130 = r78
            r131 = r79
            r132 = r5
            r103.<init>(r104, r105, r106, r107, r108, r109, r110, r111, r112, r113, r114, r115, r116, r118, r119, r120, r121, r122, r123, r124, r125, r126, r127, r128, r129, r130, r131, r132)     // Catch:{ XmlPullParserException -> 0x1032 }
            r10 = r11
            goto L_0x0d05
        L_0x0cf5:
            r70 = r2
            r69 = r3
            r55 = r5
            r64 = r7
            r32 = r8
            r135 = r9
            r53 = r13
            r94 = r15
        L_0x0d05:
            r9 = r135
            java.lang.String r1 = r9.f2983d     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r1 == 0) goto L_0x0d0c
            goto L_0x0d0e
        L_0x0d0c:
            r1 = r67
        L_0x0d0e:
            java.util.ArrayList r2 = r9.f2984e     // Catch:{ XmlPullParserException -> 0x1032 }
            r3 = r68
            r2.addAll(r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r4 = r2.isEmpty()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r4 == 0) goto L_0x0d1d
            r5 = -1
            goto L_0x0d73
        L_0x0d1d:
            int r4 = r2.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            r5 = -1
            int r4 = r4 + r5
        L_0x0d23:
            if (r4 < 0) goto L_0x0d6a
            java.lang.Object r6 = r2.get(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            anp r6 = (p000.anp) r6     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r7 = r6.mo1163a()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r7 == 0) goto L_0x0d32
            goto L_0x0d67
        L_0x0d32:
            r7 = 0
        L_0x0d33:
            int r8 = r2.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r7 >= r8) goto L_0x0d67
            java.lang.Object r8 = r2.get(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            anp r8 = (p000.anp) r8     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r11 = r8.mo1163a()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r11 != 0) goto L_0x0d46
        L_0x0d45:
            goto L_0x0d64
        L_0x0d46:
            boolean r11 = r6.mo1163a()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r11 != 0) goto L_0x0d45
            java.util.UUID r11 = r6.f1445a     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.UUID r12 = p000.aja.f429a     // Catch:{ XmlPullParserException -> 0x1032 }
            java.util.UUID r13 = r8.f1445a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r12 = r12.equals(r13)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r12 != 0) goto L_0x0d60
            java.util.UUID r8 = r8.f1445a     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r8 = r11.equals(r8)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r8 == 0) goto L_0x0d64
        L_0x0d60:
            r2.remove(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x0d67
        L_0x0d64:
            int r7 = r7 + 1
            goto L_0x0d33
        L_0x0d67:
            int r4 = r4 + -1
            goto L_0x0d23
        L_0x0d6a:
            anq r4 = new anq     // Catch:{ XmlPullParserException -> 0x1032 }
            r4.<init>(r1, r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            akh r10 = r10.mo423a(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x0d73:
            java.util.ArrayList r1 = r9.f2985f     // Catch:{ XmlPullParserException -> 0x1032 }
            r2 = r86
            r1.addAll(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r4 = r9.f2981b     // Catch:{ XmlPullParserException -> 0x1032 }
            bas r6 = r9.f2982c     // Catch:{ XmlPullParserException -> 0x1032 }
            boolean r7 = r6 instanceof p000.bar     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r7 == 0) goto L_0x0d8a
            bal r7 = new bal     // Catch:{ XmlPullParserException -> 0x1032 }
            bar r6 = (p000.bar) r6     // Catch:{ XmlPullParserException -> 0x1032 }
            r7.<init>(r10, r4, r6, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x0d97
        L_0x0d8a:
            boolean r7 = r6 instanceof p000.ban     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r7 == 0) goto L_0x0db1
            bak r7 = new bak     // Catch:{ XmlPullParserException -> 0x1032 }
            ban r6 = (p000.ban) r6     // Catch:{ XmlPullParserException -> 0x1032 }
            r7.<init>(r10, r4, r6, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x0d97:
            r1 = r55
            r1.add(r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            int r8 = r32 + 1
            r5 = r1
            r86 = r2
            r68 = r3
            r13 = r53
            r7 = r64
            r3 = r69
            r2 = r70
            r15 = r94
            r1 = 2
            r6 = 1
            goto L_0x0c3e
        L_0x0db1:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r2 = "segmentBase must be of type SingleSegmentBase or MultiSegmentBase"
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            throw r1     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x0db9:
            r70 = r2
            r69 = r3
            r1 = r5
            r53 = r13
            r94 = r15
            bab r2 = new bab     // Catch:{ XmlPullParserException -> 0x1032 }
            r51 = r2
            r54 = r1
            r55 = r94
            r56 = r95
            r51.<init>(r52, r53, r54, r55, r56)     // Catch:{ XmlPullParserException -> 0x1032 }
            r1 = r61
            r1.add(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            r10 = r42
            r2 = r70
            goto L_0x0e38
        L_0x0ddb:
            r70 = r2
            r69 = r3
            r64 = r7
            r53 = r13
            r94 = r15
            r1 = r61
            r3 = r68
            r2 = r86
            r5 = -1
            r6 = r2
            r9 = r3
            r62 = r69
            r7 = r70
            r8 = r83
            r5 = r84
            r11 = r85
            r4 = r94
            r14 = r95
            r10 = r96
            r68 = r97
            r12 = r98
            r15 = r99
            r1 = r100
            r3 = r102
            goto L_0x044c
        L_0x0e0a:
            r100 = r1
            r97 = r3
            r84 = r4
            r83 = r5
            r69 = r6
            r70 = r7
            r1 = r8
            r57 = r9
            r42 = r10
            r49 = r11
            r50 = r12
            r59 = r13
            r60 = r14
            r43 = r15
            if (r43 != 0) goto L_0x0e33
            r10 = r42
            r2 = r70
            java.lang.String r3 = m2630c(r2, r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            r10 = r3
            r15 = 1
            goto L_0x0e3a
        L_0x0e33:
            r10 = r42
            r2 = r70
        L_0x0e38:
            r15 = r43
        L_0x0e3a:
            java.lang.String r3 = "Period"
            boolean r3 = p000.bmp.m3764a(r2, r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r3 == 0) goto L_0x0eb9
            bah r3 = new bah     // Catch:{ XmlPullParserException -> 0x1032 }
            r38 = r3
            r42 = r1
            r43 = r57
            r38.<init>(r39, r40, r42, r43)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.Long r1 = java.lang.Long.valueOf(r100)     // Catch:{ XmlPullParserException -> 0x1032 }
            android.util.Pair r1 = android.util.Pair.create(r3, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.Object r3 = r1.first     // Catch:{ XmlPullParserException -> 0x1032 }
            bah r3 = (p000.bah) r3     // Catch:{ XmlPullParserException -> 0x1032 }
            long r4 = r3.f2998b     // Catch:{ XmlPullParserException -> 0x1032 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0e8a
            java.lang.Object r1 = r1.second     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ XmlPullParserException -> 0x1032 }
            long r4 = r1.longValue()     // Catch:{ XmlPullParserException -> 0x1032 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0e7a
            long r6 = r3.f2998b     // Catch:{ XmlPullParserException -> 0x1032 }
            long r8 = r6 + r4
            goto L_0x0e80
        L_0x0e7a:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x0e80:
            r4 = r50
            r4.add(r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            r46 = r8
            r62 = r33
            goto L_0x0e90
        L_0x0e8a:
            r4 = r50
            if (r49 == 0) goto L_0x0e9c
            r62 = 1
        L_0x0e90:
            r11 = r16
            r8 = r46
            r10 = r48
            r33 = r62
            r3 = 0
            goto L_0x0fcd
        L_0x0e9c:
            ako r1 = new ako     // Catch:{ XmlPullParserException -> 0x1032 }
            int r2 = r4.size()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x1032 }
            r4 = 47
            r3.<init>(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r4 = "Unable to determine start of period "
            r3.append(r4)     // Catch:{ XmlPullParserException -> 0x1032 }
            r3.append(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r2 = r3.toString()     // Catch:{ XmlPullParserException -> 0x1032 }
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            throw r1     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x0eb9:
            r4 = r50
            r8 = r1
            r7 = r2
            r12 = r4
            r11 = r49
            r9 = r57
            r13 = r59
            r14 = r60
            r6 = r69
            r5 = r83
            r4 = r84
            r3 = r97
            r1 = r100
            goto L_0x0130
        L_0x0ed2:
            r97 = r3
            r84 = r4
            r83 = r5
            r46 = r8
            r48 = r10
            r49 = r11
            r44 = r15
            r4 = r35
            r16 = r1
            r35 = r2
            r2 = r7
        L_0x0ee7:
            m2621a(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            r11 = r16
            r3 = 0
            goto L_0x0fbc
        L_0x0ef0:
            r97 = r3
            r84 = r4
            r83 = r5
            r46 = r8
            r48 = r10
            r49 = r11
            r59 = r13
            r60 = r14
            r44 = r15
            r4 = r35
            r16 = r1
            r35 = r2
            r2 = r7
            r1 = r60
            r3 = 0
            java.lang.String r1 = r2.getAttributeValue(r3, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            r5 = r59
            java.lang.String r5 = r2.getAttributeValue(r3, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            bav r6 = new bav     // Catch:{ XmlPullParserException -> 0x1032 }
            r6.<init>(r1, r5)     // Catch:{ XmlPullParserException -> 0x1032 }
            r29 = r6
            r11 = r16
            r8 = r46
            r10 = r48
            r3 = 0
            goto L_0x0fcd
        L_0x0f28:
            r35 = r2
            r97 = r3
            r84 = r4
            r83 = r5
            r69 = r6
            r2 = r7
            r46 = r8
            r48 = r10
            r49 = r11
            r4 = r12
            r36 = r13
            r44 = r15
            r16 = r1
            java.lang.String r1 = "moreInformationURL"
            r3 = 0
            java.lang.String r9 = m2619a(r2, r1, r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            r1 = r69
            java.lang.String r10 = m2619a(r2, r1, r3)     // Catch:{ XmlPullParserException -> 0x1032 }
            r1 = r3
            r5 = r1
            r6 = r5
        L_0x0f50:
            r2.next()     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r7 = "Title"
            boolean r7 = p000.bmp.m3767b(r2, r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r7 != 0) goto L_0x0f84
            java.lang.String r7 = "Source"
            boolean r7 = p000.bmp.m3767b(r2, r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r7 != 0) goto L_0x0f7b
            java.lang.String r7 = "Copyright"
            boolean r7 = p000.bmp.m3767b(r2, r7)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r7 == 0) goto L_0x0f73
            java.lang.String r6 = r2.nextText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r7 = r1
            r1 = r5
            r8 = r6
            goto L_0x0f8c
        L_0x0f73:
            m2621a(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            r7 = r1
            r1 = r5
            r8 = r6
            goto L_0x0f8c
        L_0x0f7b:
            java.lang.String r1 = r2.nextText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r7 = r1
            r1 = r5
            r8 = r6
            goto L_0x0f8c
        L_0x0f84:
            java.lang.String r5 = r2.nextText()     // Catch:{ XmlPullParserException -> 0x1032 }
            r7 = r1
            r1 = r5
            r8 = r6
        L_0x0f8c:
            r11 = r16
            boolean r5 = p000.bmp.m3764a(r2, r11)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r5 == 0) goto L_0x0f9d
            bai r5 = new bai     // Catch:{ XmlPullParserException -> 0x1032 }
            r6 = r1
            r5.<init>(r6, r7, r8, r9, r10)     // Catch:{ XmlPullParserException -> 0x1032 }
            goto L_0x0fbc
        L_0x0f9d:
            r5 = r1
            r1 = r7
            r6 = r8
            r16 = r11
            goto L_0x0f50
        L_0x0fa3:
            r35 = r2
            r97 = r3
            r84 = r4
            r83 = r5
            r2 = r7
            r46 = r8
            r48 = r10
            r49 = r11
            r4 = r12
            r36 = r13
            r44 = r15
            r3 = 0
            r11 = r1
            if (r28 == 0) goto L_0x0fc1
        L_0x0fbc:
            r8 = r46
            r10 = r48
            goto L_0x0fcd
        L_0x0fc1:
            r1 = r48
            java.lang.String r1 = m2630c(r2, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            r10 = r1
            r8 = r46
            r28 = 1
        L_0x0fcd:
            r1 = r35
            boolean r5 = p000.bmp.m3764a(r2, r1)     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r5 == 0) goto L_0x1011
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r44 > r5 ? 1 : (r44 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x0ff0
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x0fe5
            r15 = r8
            goto L_0x0ff2
        L_0x0fe5:
            if (r49 == 0) goto L_0x0fe8
            goto L_0x0ff0
        L_0x0fe8:
            ako r1 = new ako     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r2 = "Unable to determine duration of static manifest."
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            throw r1     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x0ff0:
            r15 = r44
        L_0x0ff2:
            boolean r1 = r4.isEmpty()     // Catch:{ XmlPullParserException -> 0x1032 }
            if (r1 != 0) goto L_0x1009
            bac r1 = new bac     // Catch:{ XmlPullParserException -> 0x1032 }
            r12 = r1
            r13 = r36
            r17 = r49
            r26 = r29
            r27 = r34
            r28 = r4
            r12.<init>(r13, r15, r17, r18, r20, r22, r24, r26, r27, r28)     // Catch:{ XmlPullParserException -> 0x1032 }
            return r1
        L_0x1009:
            ako r1 = new ako     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r2 = "No periods found."
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            throw r1     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x1011:
            r5 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = r133
            r7 = r2
            r12 = r4
            r13 = r36
            r15 = r44
            r5 = r83
            r4 = r84
            r3 = r97
            r2 = r1
            r1 = r11
            r11 = r49
            goto L_0x009a
        L_0x102a:
            ako r1 = new ako     // Catch:{ XmlPullParserException -> 0x1032 }
            java.lang.String r2 = "inputStream does not contain a valid media presentation description"
            r1.<init>(r2)     // Catch:{ XmlPullParserException -> 0x1032 }
            throw r1     // Catch:{ XmlPullParserException -> 0x1032 }
        L_0x1032:
            r0 = move-exception
            r1 = r0
            ako r2 = new ako
            r2.<init>(r1)
            goto L_0x103b
        L_0x103a:
            throw r2
        L_0x103b:
            goto L_0x103a
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bae.mo1648a(android.net.Uri, java.io.InputStream):bac");
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: b */
    private static final int m2624b(XmlPullParser xmlPullParser) {
        String d;
        char c;
        String a = m2619a(xmlPullParser, "schemeIdUri", (String) null);
        int i = 2;
        if ("urn:mpeg:dash:23003:3:audio_channel_configuration:2011".equals(a)) {
            i = m2611a(xmlPullParser, "value", -1);
        } else {
            if (("tag:dolby.com,2014:dash:audio_channel_configuration:2011".equals(a) || "urn:dolby:dash:audio_channel_configuration:2011".equals(a)) && (d = blm.m3675d(xmlPullParser.getAttributeValue(null, "value"))) != null) {
                switch (d.hashCode()) {
                    case 1596796:
                        if (d.equals("4000")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case 2937391:
                        if (d.equals("a000")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3094035:
                        if (d.equals("f801")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3133436:
                        if (d.equals("fa01")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                if (c == 0) {
                    i = 1;
                } else if (c != 1) {
                    if (c == 2) {
                        i = 6;
                    } else if (c == 3) {
                        i = 8;
                    }
                }
            }
            i = -1;
        }
        do {
            xmlPullParser.next();
        } while (!bmp.m3764a(xmlPullParser, "AudioChannelConfiguration"));
        return i;
    }

    /* renamed from: c */
    private static final String m2630c(XmlPullParser xmlPullParser, String str) {
        return blk.m3620b(str, m2628b(xmlPullParser, "BaseURL"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00c7  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x0144  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final android.util.Pair m2629c(org.xmlpull.v1.XmlPullParser r10) {
        /*
            r0 = 0
            java.lang.String r1 = "schemeIdUri"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            r2 = 0
            if (r1 != 0) goto L_0x0010
        L_0x000a:
            r1 = r0
            r3 = r1
            r4 = r3
            r5 = r4
            goto L_0x00bc
        L_0x0010:
            java.lang.String r1 = p000.blm.m3675d(r1)
            int r3 = r1.hashCode()
            r4 = 489446379(0x1d2c5beb, float:2.281153E-21)
            r5 = 2
            r6 = 1
            if (r3 == r4) goto L_0x003f
            r4 = 755418770(0x2d06c692, float:7.66111E-12)
            if (r3 == r4) goto L_0x0035
            r4 = 1812765994(0x6c0c9d2a, float:6.799672E26)
            if (r3 == r4) goto L_0x002a
        L_0x0029:
            goto L_0x0049
        L_0x002a:
            java.lang.String r3 = "urn:mpeg:dash:mp4protection:2011"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0029
            r1 = 0
            goto L_0x004a
        L_0x0035:
            java.lang.String r3 = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0029
            r1 = 2
            goto L_0x004a
        L_0x003f:
            java.lang.String r3 = "urn:uuid:9a04f079-9840-4286-ab92-e65be0885f95"
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0029
            r1 = 1
            goto L_0x004a
        L_0x0049:
            r1 = -1
        L_0x004a:
            if (r1 == 0) goto L_0x005c
            if (r1 == r6) goto L_0x0054
            if (r1 == r5) goto L_0x0051
            goto L_0x000a
        L_0x0051:
            java.util.UUID r1 = p000.aja.f431c
            goto L_0x0056
        L_0x0054:
            java.util.UUID r1 = p000.aja.f432d
        L_0x0056:
            r3 = r0
            r4 = r3
            r5 = r4
            goto L_0x00bc
        L_0x005c:
            java.lang.String r1 = "value"
            java.lang.String r1 = r10.getAttributeValue(r0, r1)
            int r3 = r10.getAttributeCount()
            r4 = 0
        L_0x0068:
            if (r4 >= r3) goto L_0x0082
            java.lang.String r5 = r10.getAttributeName(r4)
            java.lang.String r5 = p000.bmp.m3765b(r5)
            java.lang.String r6 = "default_KID"
            boolean r5 = r5.equals(r6)
            if (r5 != 0) goto L_0x007d
            int r4 = r4 + 1
            goto L_0x0068
        L_0x007d:
            java.lang.String r3 = r10.getAttributeValue(r4)
            goto L_0x0084
        L_0x0082:
            r3 = r0
        L_0x0084:
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = "00000000-0000-0000-0000-000000000000"
            boolean r4 = r4.equals(r3)
            if (r4 != 0) goto L_0x00b8
            java.lang.String r4 = "\\s+"
            java.lang.String[] r3 = r3.split(r4)
            int r4 = r3.length
            java.util.UUID[] r4 = new java.util.UUID[r4]
            r5 = 0
        L_0x009c:
            int r6 = r3.length
            if (r5 < r6) goto L_0x00ad
            java.util.UUID r3 = p000.aja.f430b
            byte[] r3 = p000.bty.m4186a(r3, r4, r0)
            java.util.UUID r4 = p000.aja.f430b
            r5 = r0
            r9 = r4
            r4 = r1
            r1 = r9
            goto L_0x00bc
        L_0x00ad:
            r6 = r3[r5]
            java.util.UUID r6 = java.util.UUID.fromString(r6)
            r4[r5] = r6
            int r5 = r5 + 1
            goto L_0x009c
        L_0x00b8:
            r3 = r0
            r5 = r3
            r4 = r1
            r1 = r5
        L_0x00bc:
            r10.next()
            java.lang.String r6 = "ms:laurl"
            boolean r6 = p000.bmp.m3767b(r10, r6)
            if (r6 == 0) goto L_0x00cf
            java.lang.String r5 = "licenseUrl"
            java.lang.String r5 = r10.getAttributeValue(r0, r5)
            goto L_0x0139
        L_0x00cf:
            r6 = 4
            if (r3 != 0) goto L_0x010b
            boolean r7 = p000.bmp.m3766b(r10)
            if (r7 == 0) goto L_0x010b
            java.lang.String r7 = r10.getName()
            java.lang.String r7 = p000.bmp.m3765b(r7)
            java.lang.String r8 = "pssh"
            boolean r7 = r7.equals(r8)
            if (r7 == 0) goto L_0x010b
            int r7 = r10.next()
            if (r7 != r6) goto L_0x010b
            java.lang.String r1 = r10.getText()
            byte[] r1 = android.util.Base64.decode(r1, r2)
            java.util.UUID r3 = p000.bty.m4183a(r1)
            if (r3 != 0) goto L_0x0107
            java.lang.String r1 = "MpdParser"
            java.lang.String r6 = "Skipping malformed cenc:pssh data"
            android.util.Log.w(r1, r6)
            r1 = r3
            r3 = r0
            goto L_0x0139
        L_0x0107:
            r9 = r3
            r3 = r1
            r1 = r9
            goto L_0x0139
        L_0x010b:
            if (r3 == 0) goto L_0x010e
            goto L_0x0134
        L_0x010e:
            java.util.UUID r7 = p000.aja.f432d
            boolean r7 = r7.equals(r1)
            if (r7 == 0) goto L_0x0134
            java.lang.String r7 = "mspr:pro"
            boolean r7 = p000.bmp.m3767b(r10, r7)
            if (r7 == 0) goto L_0x0134
            int r7 = r10.next()
            if (r7 != r6) goto L_0x0134
            java.util.UUID r3 = p000.aja.f432d
            java.lang.String r6 = r10.getText()
            byte[] r6 = android.util.Base64.decode(r6, r2)
            byte[] r3 = p000.bty.m4185a(r3, r6)
            goto L_0x0139
        L_0x0134:
            m2621a(r10)
        L_0x0139:
            java.lang.String r6 = "ContentProtection"
            boolean r6 = p000.bmp.m3764a(r10, r6)
            if (r6 == 0) goto L_0x0153
            if (r1 == 0) goto L_0x014c
            anp r0 = new anp
            java.lang.String r10 = "video/mp4"
            r0.<init>(r1, r5, r10, r3)
            goto L_0x014e
        L_0x014c:
        L_0x014e:
            android.util.Pair r10 = android.util.Pair.create(r4, r0)
            return r10
        L_0x0153:
            goto L_0x00bc
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bae.m2629c(org.xmlpull.v1.XmlPullParser):android.util.Pair");
    }

    /* renamed from: d */
    private static final int m2631d(XmlPullParser xmlPullParser) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "contentType");
        if (TextUtils.isEmpty(attributeValue)) {
            return -1;
        }
        if ("audio".equals(attributeValue)) {
            return 1;
        }
        if ("video".equals(attributeValue)) {
            return 2;
        }
        if (!"text".equals(attributeValue)) {
            return -1;
        }
        return 3;
    }

    /* renamed from: d */
    private static long m2632d(XmlPullParser xmlPullParser, String str) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return -9223372036854775807L;
        }
        return blm.m3679f(attributeValue);
    }

    /* renamed from: a */
    private static baf m2614a(XmlPullParser xmlPullParser, String str) {
        String a = m2619a(xmlPullParser, "schemeIdUri", "");
        String a2 = m2619a(xmlPullParser, "value", (String) null);
        String a3 = m2619a(xmlPullParser, "id", (String) null);
        do {
            xmlPullParser.next();
        } while (!bmp.m3764a(xmlPullParser, str));
        return new baf(a, a2, a3);
    }

    /* renamed from: a */
    private static long m2613a(XmlPullParser xmlPullParser, String str, long j) {
        double d;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return j;
        }
        Matcher matcher = blm.f4299g.matcher(attributeValue);
        if (!matcher.matches()) {
            return (long) (Double.parseDouble(attributeValue) * 3600.0d * 1000.0d);
        }
        boolean isEmpty = true ^ TextUtils.isEmpty(matcher.group(1));
        String group = matcher.group(3);
        double d2 = 0.0d;
        double parseDouble = group != null ? Double.parseDouble(group) * 3.1556908E7d : 0.0d;
        String group2 = matcher.group(5);
        double parseDouble2 = parseDouble + (group2 != null ? Double.parseDouble(group2) * 2629739.0d : 0.0d);
        String group3 = matcher.group(7);
        double parseDouble3 = parseDouble2 + (group3 != null ? Double.parseDouble(group3) * 86400.0d : 0.0d);
        String group4 = matcher.group(10);
        double parseDouble4 = parseDouble3 + (group4 != null ? 3600.0d * Double.parseDouble(group4) : 0.0d);
        String group5 = matcher.group(12);
        if (group5 != null) {
            d = Double.parseDouble(group5) * 60.0d;
        } else {
            d = 0.0d;
        }
        double d3 = parseDouble4 + d;
        String group6 = matcher.group(14);
        if (group6 != null) {
            d2 = Double.parseDouble(group6);
        }
        long j2 = (long) ((d3 + d2) * 1000.0d);
        if (!isEmpty) {
            return j2;
        }
        return -j2;
    }

    /* renamed from: a */
    private static float m2609a(XmlPullParser xmlPullParser, float f) {
        String attributeValue = xmlPullParser.getAttributeValue(null, "frameRate");
        if (attributeValue == null) {
            return f;
        }
        Matcher matcher = f2986a.matcher(attributeValue);
        if (!matcher.matches()) {
            return f;
        }
        int parseInt = Integer.parseInt(matcher.group(1));
        String group = matcher.group(2);
        return !TextUtils.isEmpty(group) ? ((float) parseInt) / ((float) Integer.parseInt(group)) : (float) parseInt;
    }

    /* renamed from: e */
    private static final baj m2633e(XmlPullParser xmlPullParser) {
        return m2627b(xmlPullParser, "sourceURL", "range");
    }

    /* renamed from: a */
    private static int m2611a(XmlPullParser xmlPullParser, String str, int i) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? Integer.parseInt(attributeValue) : i;
    }

    /* renamed from: b */
    private static long m2625b(XmlPullParser xmlPullParser, String str, long j) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? Long.parseLong(attributeValue) : j;
    }

    /* renamed from: b */
    private static final baj m2627b(XmlPullParser xmlPullParser, String str, String str2) {
        long j;
        long j2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        String attributeValue2 = xmlPullParser.getAttributeValue(null, str2);
        if (attributeValue2 != null) {
            String[] split = attributeValue2.split("-");
            j2 = Long.parseLong(split[0]);
            if (split.length == 2) {
                j = (Long.parseLong(split[1]) - j2) + 1;
                return new baj(attributeValue, j2, j);
            }
        } else {
            j2 = 0;
        }
        j = -1;
        return new baj(attributeValue, j2, j);
    }

    /* renamed from: a */
    private static final bar m2617a(XmlPullParser xmlPullParser, bar bar) {
        long j;
        long j2;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        bar bar2 = bar;
        long b = m2625b(xmlPullParser2, "timescale", bar2 != null ? bar2.f3030g : 1);
        long j3 = 0;
        long b2 = m2625b(xmlPullParser2, "presentationTimeOffset", bar2 != null ? bar2.f3031h : 0);
        long j4 = bar2 != null ? bar2.f3027a : 0;
        if (bar2 != null) {
            j3 = bar2.f3028b;
        }
        baj baj = null;
        String attributeValue = xmlPullParser2.getAttributeValue(null, "indexRange");
        if (attributeValue != null) {
            String[] split = attributeValue.split("-");
            long parseLong = Long.parseLong(split[0]);
            j = (Long.parseLong(split[1]) - parseLong) + 1;
            j2 = parseLong;
        } else {
            j = j3;
            j2 = j4;
        }
        if (bar2 != null) {
            baj = bar2.f3029f;
        }
        do {
            xmlPullParser.next();
            if (bmp.m3767b(xmlPullParser2, "Initialization")) {
                baj = m2633e(xmlPullParser);
            } else {
                m2621a(xmlPullParser);
            }
        } while (!bmp.m3764a(xmlPullParser2, "SegmentBase"));
        return new bar(baj, b, b2, j2, j);
    }

    /* renamed from: a */
    private static final bao m2615a(XmlPullParser xmlPullParser, bao bao, long j) {
        long j2;
        long j3;
        List list;
        List list2;
        baj baj;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        bao bao2 = bao;
        long j4 = 1;
        long b = m2625b(xmlPullParser2, "timescale", bao2 != null ? bao2.f3030g : 1);
        if (bao2 != null) {
            j2 = bao2.f3031h;
        } else {
            j2 = 0;
        }
        long b2 = m2625b(xmlPullParser2, "presentationTimeOffset", j2);
        if (bao2 != null) {
            j3 = bao2.f3019b;
        } else {
            j3 = -9223372036854775807L;
        }
        long b3 = m2625b(xmlPullParser2, "duration", j3);
        if (bao2 != null) {
            j4 = bao2.f3018a;
        }
        long b4 = m2625b(xmlPullParser2, "startNumber", j4);
        List list3 = null;
        List list4 = null;
        baj baj2 = null;
        do {
            xmlPullParser.next();
            if (bmp.m3767b(xmlPullParser2, "Initialization")) {
                baj2 = m2633e(xmlPullParser);
            } else if (bmp.m3767b(xmlPullParser2, "SegmentTimeline")) {
                list3 = m2620a(xmlPullParser2, b, j);
            } else if (!bmp.m3767b(xmlPullParser2, "SegmentURL")) {
                m2621a(xmlPullParser);
            } else {
                if (list4 == null) {
                    list4 = new ArrayList();
                }
                list4.add(m2627b(xmlPullParser2, "media", "mediaRange"));
            }
        } while (!bmp.m3764a(xmlPullParser2, "SegmentList"));
        if (bao2 != null) {
            if (baj2 == null) {
                baj2 = bao2.f3029f;
            }
            if (list3 == null) {
                list3 = bao2.f3020c;
            }
            if (list4 == null) {
                list = bao2.f3021d;
                list2 = list3;
                baj = baj2;
                return new bao(baj, b, b2, b4, b3, list2, list);
            }
        }
        list2 = list3;
        list = list4;
        baj = baj2;
        return new bao(baj, b, b2, b4, b3, list2, list);
    }

    /* renamed from: a */
    private static final bap m2616a(XmlPullParser xmlPullParser, bap bap, List list, long j) {
        long j2;
        long j3;
        long j4;
        bau bau;
        List list2;
        baj baj;
        XmlPullParser xmlPullParser2 = xmlPullParser;
        bap bap2 = bap;
        long j5 = 1;
        long b = m2625b(xmlPullParser2, "timescale", bap2 != null ? bap2.f3030g : 1);
        if (bap2 != null) {
            j2 = bap2.f3031h;
        } else {
            j2 = 0;
        }
        long b2 = m2625b(xmlPullParser2, "presentationTimeOffset", j2);
        if (bap2 != null) {
            j3 = bap2.f3019b;
        } else {
            j3 = -9223372036854775807L;
        }
        long b3 = m2625b(xmlPullParser2, "duration", j3);
        if (bap2 != null) {
            j5 = bap2.f3018a;
        }
        long b4 = m2625b(xmlPullParser2, "startNumber", j5);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                j4 = -1;
                break;
            }
            baf baf = (baf) list.get(i);
            if ("http://dashif.org/guidelines/last-segment-number".equalsIgnoreCase(baf.f2990a)) {
                j4 = Long.parseLong(baf.f2991b);
                break;
            }
            i++;
        }
        long j6 = j4;
        List list3 = null;
        bau a = m2618a(xmlPullParser2, "media", bap2 != null ? bap2.f3023e : null);
        if (bap2 != null) {
            bau = bap2.f3022d;
        } else {
            bau = null;
        }
        bau a2 = m2618a(xmlPullParser2, "initialization", bau);
        baj baj2 = null;
        do {
            xmlPullParser.next();
            if (bmp.m3767b(xmlPullParser2, "Initialization")) {
                baj2 = m2633e(xmlPullParser);
            } else if (bmp.m3767b(xmlPullParser2, "SegmentTimeline")) {
                list3 = m2620a(xmlPullParser2, b, j);
            } else {
                m2621a(xmlPullParser);
            }
        } while (!bmp.m3764a(xmlPullParser2, "SegmentTemplate"));
        if (bap2 != null) {
            if (baj2 == null) {
                baj2 = bap2.f3029f;
            }
            if (list3 == null) {
                list2 = bap2.f3020c;
                baj = baj2;
                return new bap(baj, b, b2, b4, j6, b3, list2, a2, a);
            }
        }
        list2 = list3;
        baj = baj2;
        return new bap(baj, b, b2, b4, j6, b3, list2, a2, a);
    }

    /* renamed from: a */
    private static final List m2620a(XmlPullParser xmlPullParser, long j, long j2) {
        XmlPullParser xmlPullParser2 = xmlPullParser;
        ArrayList arrayList = new ArrayList();
        long j3 = 0;
        long j4 = -9223372036854775807L;
        boolean z = false;
        int i = 0;
        do {
            xmlPullParser.next();
            if (bmp.m3767b(xmlPullParser2, "S")) {
                long b = m2625b(xmlPullParser2, "t", -9223372036854775807L);
                if (z) {
                    j3 = m2612a(arrayList, j3, j4, i, b);
                }
                if (b == -9223372036854775807L) {
                    b = j3;
                }
                j4 = m2625b(xmlPullParser2, "d", -9223372036854775807L);
                i = m2611a(xmlPullParser2, "r", 0);
                j3 = b;
                z = true;
            } else {
                m2621a(xmlPullParser);
            }
        } while (!bmp.m3764a(xmlPullParser2, "SegmentTimeline"));
        if (z) {
            m2612a(arrayList, j3, j4, i, blm.m3663b(j2, j, 1000));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static String m2619a(XmlPullParser xmlPullParser, String str, String str2) {
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        return attributeValue != null ? attributeValue : str2;
    }

    /* renamed from: b */
    private static String m2628b(XmlPullParser xmlPullParser, String str) {
        String str2 = "";
        do {
            xmlPullParser.next();
            if (xmlPullParser.getEventType() == 4) {
                str2 = xmlPullParser.getText();
            } else {
                m2621a(xmlPullParser);
            }
        } while (!bmp.m3764a(xmlPullParser, str));
        return str2;
    }

    /* renamed from: a */
    private static final bau m2618a(XmlPullParser xmlPullParser, String str, bau bau) {
        String str2;
        String attributeValue = xmlPullParser.getAttributeValue(null, str);
        if (attributeValue == null) {
            return bau;
        }
        String[] strArr = new String[5];
        int[] iArr = new int[4];
        String[] strArr2 = new String[4];
        strArr[0] = "";
        int i = 0;
        int i2 = 0;
        while (i < attributeValue.length()) {
            int indexOf = attributeValue.indexOf("$", i);
            char c = 65535;
            if (indexOf == -1) {
                String valueOf = String.valueOf(strArr[i2]);
                String valueOf2 = String.valueOf(attributeValue.substring(i));
                strArr[i2] = valueOf2.length() == 0 ? new String(valueOf) : valueOf.concat(valueOf2);
                i = attributeValue.length();
            } else if (indexOf != i) {
                String valueOf3 = String.valueOf(strArr[i2]);
                String valueOf4 = String.valueOf(attributeValue.substring(i, indexOf));
                strArr[i2] = valueOf4.length() == 0 ? new String(valueOf3) : valueOf3.concat(valueOf4);
                i = indexOf;
            } else if (!attributeValue.startsWith("$$", i)) {
                int i3 = i + 1;
                int indexOf2 = attributeValue.indexOf("$", i3);
                String substring = attributeValue.substring(i3, indexOf2);
                if (substring.equals("RepresentationID")) {
                    iArr[i2] = 1;
                } else {
                    int indexOf3 = substring.indexOf("%0");
                    if (indexOf3 != -1) {
                        str2 = substring.substring(indexOf3);
                        if (!str2.endsWith("d") && !str2.endsWith("x")) {
                            str2 = String.valueOf(str2).concat("d");
                        }
                        substring = substring.substring(0, indexOf3);
                    } else {
                        str2 = "%01d";
                    }
                    int hashCode = substring.hashCode();
                    if (hashCode != -1950496919) {
                        if (hashCode != 2606829) {
                            if (hashCode == 38199441 && substring.equals("Bandwidth")) {
                                c = 1;
                            }
                        } else if (substring.equals("Time")) {
                            c = 2;
                        }
                    } else if (substring.equals("Number")) {
                        c = 0;
                    }
                    if (c == 0) {
                        iArr[i2] = 2;
                    } else if (c == 1) {
                        iArr[i2] = 3;
                    } else if (c != 2) {
                        throw new IllegalArgumentException(attributeValue.length() == 0 ? new String("Invalid template: ") : "Invalid template: ".concat(attributeValue));
                    } else {
                        iArr[i2] = 4;
                    }
                    strArr2[i2] = str2;
                }
                i2++;
                strArr[i2] = "";
                i = indexOf2 + 1;
            } else {
                strArr[i2] = String.valueOf(strArr[i2]).concat("$");
                i += 2;
            }
        }
        return new bau(strArr, iArr, strArr2, i2);
    }
}
