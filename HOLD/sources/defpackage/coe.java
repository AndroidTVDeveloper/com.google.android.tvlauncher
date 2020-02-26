package defpackage;

/* renamed from: coe  reason: default package */
/* compiled from: PG */
public final class coe {
    private static final cod a = new cod((byte) 0);

    private static boolean a(cmy cmy) {
        return cmy.c == 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v20, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r19v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v28, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v20, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v32, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v28, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r18v0, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: cmv} */
    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x02d7  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x02f5  */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x031e  */
    /* JADX WARNING: Removed duplicated region for block: B:139:0x0347  */
    /* JADX WARNING: Removed duplicated region for block: B:148:0x0376  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03af  */
    /* JADX WARNING: Removed duplicated region for block: B:160:0x03ec  */
    /* JADX WARNING: Removed duplicated region for block: B:165:0x0408 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:172:0x0426  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0156  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x017b  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0185  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x01ae  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x023b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.coc a(defpackage.cmc r24) {
        /*
            r0 = r24
            int r1 = r0.b
            r3 = 2
            r4 = 1
            java.lang.String r5 = "VastVideoAdFactory"
            r6 = 0
            if (r1 != r3) goto L_0x044a
            java.lang.Object r1 = r0.c
            cmj r1 = (defpackage.cmj) r1
            int r7 = r1.b
            r8 = 3
            if (r7 != r8) goto L_0x0448
            java.lang.Object r1 = r1.c
            cmy r1 = (defpackage.cmy) r1
            java.lang.String r7 = r1.g
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 == 0) goto L_0x0033
            djk r9 = r1.k
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x0029
            goto L_0x0033
        L_0x0029:
            djk r7 = r1.k
            java.lang.Object r7 = r7.get(r6)
            cmw r7 = (defpackage.cmw) r7
            java.lang.String r7 = r7.o
        L_0x0033:
            boolean r9 = android.text.TextUtils.isEmpty(r7)
            if (r9 != 0) goto L_0x0079
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            java.lang.String r10 = ","
            java.lang.String[] r10 = r7.split(r10)
            int r11 = r10.length
            r12 = 0
        L_0x0046:
            if (r12 >= r11) goto L_0x0078
            r13 = r10[r12]
            java.lang.String r14 = "="
            java.lang.String[] r13 = r13.split(r14)
            int r14 = r13.length
            if (r14 == r3) goto L_0x006d
            java.lang.String r7 = java.lang.String.valueOf(r7)
            java.lang.String r9 = "Syntax error in ad parameters, must be comma-separated pairs key=value: "
            int r10 = r7.length()
            if (r10 != 0) goto L_0x0065
            java.lang.String r7 = new java.lang.String
            r7.<init>(r9)
            goto L_0x0069
        L_0x0065:
            java.lang.String r7 = r9.concat(r7)
        L_0x0069:
            android.util.Log.e(r5, r7)
            goto L_0x007a
        L_0x006d:
            r14 = r13[r6]
            r13 = r13[r4]
            r9.put(r14, r13)
            int r12 = r12 + 1
            goto L_0x0046
        L_0x0078:
            goto L_0x007b
        L_0x0079:
        L_0x007a:
            r9 = 0
        L_0x007b:
            java.lang.String r7 = r1.b
            boolean r10 = android.text.TextUtils.isEmpty(r7)
            if (r10 == 0) goto L_0x0095
            djk r10 = r1.k
            boolean r10 = r10.isEmpty()
            if (r10 != 0) goto L_0x0095
            djk r7 = r1.k
            java.lang.Object r7 = r7.get(r6)
            cmw r7 = (defpackage.cmw) r7
            java.lang.String r7 = r7.f
        L_0x0095:
            clu r10 = new clu
            r10.<init>(r6)
            r10.l = r0
            djk r0 = r1.f
            boolean r11 = r0.isEmpty()
            r12 = 4
            java.lang.String r13 = ""
            if (r11 == 0) goto L_0x00ae
            java.lang.String r0 = "No Image URL could be extracted: Empty vast companion list."
            android.util.Log.e(r5, r0)
            r0 = r13
            goto L_0x00c8
        L_0x00ae:
            java.lang.Object r11 = r0.get(r6)
            cmt r11 = (defpackage.cmt) r11
            int r11 = r11.a
            r11 = r11 & r12
            if (r11 != 0) goto L_0x00bf
            java.lang.String r11 = "Empty Image URL found in the vast companion."
            android.util.Log.e(r5, r11)
        L_0x00bf:
            java.lang.Object r0 = r0.get(r6)
            cmt r0 = (defpackage.cmt) r0
            java.lang.String r0 = r0.d
        L_0x00c8:
            r10.a = r0
            djk r0 = r1.e
            int r11 = r0.size()
            r14 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            r16 = r14
            r14 = 0
            r15 = 0
        L_0x00d6:
            if (r14 >= r11) goto L_0x0152
            java.lang.Object r18 = r0.get(r14)
            r2 = r18
            cmv r2 = (defpackage.cmv) r2
            java.lang.String r12 = r2.c
            java.lang.String r8 = "video/mp4"
            boolean r8 = r8.equals(r12)
            if (r8 != 0) goto L_0x00ed
            r19 = r13
            goto L_0x0148
        L_0x00ed:
            if (r15 != 0) goto L_0x010c
            java.lang.Object r8 = r0.get(r6)
            cmv r8 = (defpackage.cmv) r8
            int r8 = r8.f
            double r3 = (double) r8
            java.lang.Object r8 = r0.get(r6)
            cmv r8 = (defpackage.cmv) r8
            int r8 = r8.g
            r19 = r13
            double r12 = (double) r8
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r12)
            double r16 = r3 / r12
            goto L_0x0146
        L_0x010c:
            r19 = r13
            int r3 = r2.f
            double r3 = (double) r3
            int r8 = r2.g
            double r12 = (double) r8
            java.lang.Double.isNaN(r3)
            java.lang.Double.isNaN(r12)
            double r3 = r3 / r12
            r12 = -4612686818344581348(0xbffc71c71c71c71c, double:-1.7777777777777777)
            double r3 = r3 + r12
            double r20 = java.lang.Math.abs(r3)
            r22 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r8 = (r20 > r22 ? 1 : (r20 == r22 ? 0 : -1))
            if (r8 <= 0) goto L_0x013d
            double r3 = java.lang.Math.abs(r3)
            double r12 = r16 + r12
            double r12 = java.lang.Math.abs(r12)
            int r8 = (r3 > r12 ? 1 : (r3 == r12 ? 0 : -1))
            if (r8 >= 0) goto L_0x0144
            goto L_0x0143
        L_0x013d:
            int r3 = r2.e
            int r4 = r15.e
            if (r3 <= r4) goto L_0x0144
        L_0x0143:
            goto L_0x0146
        L_0x0144:
            r2 = r15
        L_0x0146:
            r15 = r2
        L_0x0148:
            int r14 = r14 + 1
            r13 = r19
            r3 = 2
            r4 = 1
            r8 = 3
            r12 = 4
            goto L_0x00d6
        L_0x0152:
            r19 = r13
            if (r15 != 0) goto L_0x017b
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            int r2 = r2 + 44
            r3.<init>(r2)
            java.lang.String r2 = "No MP4 video found in VAST response medias: "
            r3.append(r2)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            android.util.Log.e(r5, r0)
            r13 = r19
            goto L_0x017d
        L_0x017b:
            java.lang.String r13 = r15.d
        L_0x017d:
            r10.b = r13
            boolean r0 = a(r1)
            if (r0 == 0) goto L_0x01ae
            djk r0 = r1.r
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x018e
            goto L_0x01a7
        L_0x018e:
            djk r0 = r1.r
            java.lang.Object r0 = r0.get(r6)
            cmu r0 = (defpackage.cmu) r0
            int r0 = r0.a
            r2 = 2
            r0 = r0 & r2
            if (r0 == 0) goto L_0x01a7
            djk r0 = r1.r
            java.lang.Object r0 = r0.get(r6)
            cmu r0 = (defpackage.cmu) r0
            java.lang.String r13 = r0.c
            goto L_0x01f7
        L_0x01a7:
            java.lang.String r0 = "No banner impression tracking URL could be extracted from impression tag"
            android.util.Log.e(r5, r0)
            goto L_0x01f5
        L_0x01ae:
            djk r0 = r1.f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01ef
            djk r0 = r1.f
            java.lang.Object r0 = r0.get(r6)
            cmt r0 = (defpackage.cmt) r0
            djk r0 = r0.l
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x01ef
            djk r0 = r1.f
            java.lang.Object r0 = r0.get(r6)
            cmt r0 = (defpackage.cmt) r0
            djk r0 = r0.l
            java.lang.Object r0 = r0.get(r6)
            cmx r0 = (defpackage.cmx) r0
            int r0 = r0.a
            r2 = 2
            r0 = r0 & r2
            if (r0 == 0) goto L_0x01ef
            djk r0 = r1.f
            java.lang.Object r0 = r0.get(r6)
            cmt r0 = (defpackage.cmt) r0
            djk r0 = r0.l
            java.lang.Object r0 = r0.get(r6)
            cmx r0 = (defpackage.cmx) r0
            java.lang.String r13 = r0.c
            goto L_0x01f7
        L_0x01ef:
            java.lang.String r0 = "No banner impression tracking URL could be extracted from companion"
            android.util.Log.e(r5, r0)
        L_0x01f5:
            r13 = r19
        L_0x01f7:
            r10.c = r13
            java.util.ArrayList r0 = new java.util.ArrayList
            djk r2 = r1.h
            int r2 = r2.size()
            r0.<init>(r2)
            djk r2 = r1.r
            boolean r2 = r2.isEmpty()
            r3 = 0
            if (r2 == 0) goto L_0x020f
            goto L_0x022f
        L_0x020f:
            djk r2 = r1.r
            java.lang.Object r2 = r2.get(r6)
            cmu r2 = (defpackage.cmu) r2
            int r2 = r2.a
            r8 = 2
            r2 = r2 & r8
            if (r2 == 0) goto L_0x022f
            clw r2 = new clw
            djk r8 = r1.r
            java.lang.Object r8 = r8.get(r6)
            cmu r8 = (defpackage.cmu) r8
            java.lang.String r8 = r8.c
            r2.<init>(r8, r3)
            r0.add(r2)
        L_0x022f:
            int r2 = r1.c
            long r13 = (long) r2
            djk r2 = r1.h
            int r8 = r2.size()
            r11 = 0
        L_0x0239:
            if (r11 >= r8) goto L_0x02c9
            java.lang.Object r15 = r2.get(r11)
            cmx r15 = (defpackage.cmx) r15
            java.lang.String r3 = r15.b
            int r4 = r3.hashCode()
            r12 = 5
            switch(r4) {
                case -1638835128: goto L_0x027f;
                case -1337830390: goto L_0x0275;
                case -599445191: goto L_0x026b;
                case 109757538: goto L_0x0261;
                case 560220243: goto L_0x0257;
                case 1778167540: goto L_0x024c;
                default: goto L_0x024b;
            }
        L_0x024b:
            goto L_0x0289
        L_0x024c:
            java.lang.String r4 = "creativeView"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x024b
            r3 = 1
            goto L_0x028a
        L_0x0257:
            java.lang.String r4 = "firstQuartile"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x024b
            r3 = 2
            goto L_0x028a
        L_0x0261:
            java.lang.String r4 = "start"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x024b
            r3 = 0
            goto L_0x028a
        L_0x026b:
            java.lang.String r4 = "complete"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x024b
            r3 = 5
            goto L_0x028a
        L_0x0275:
            java.lang.String r4 = "thirdQuartile"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x024b
            r3 = 4
            goto L_0x028a
        L_0x027f:
            java.lang.String r4 = "midpoint"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x024b
            r3 = 3
            goto L_0x028a
        L_0x0289:
            r3 = -1
        L_0x028a:
            if (r3 == 0) goto L_0x02b5
            r4 = 1
            if (r3 == r4) goto L_0x02b5
            r4 = 2
            if (r3 == r4) goto L_0x02a9
            r4 = 3
            if (r3 == r4) goto L_0x02a4
            r4 = 4
            if (r3 == r4) goto L_0x029f
            if (r3 == r12) goto L_0x029c
            r3 = r5
            goto L_0x02c2
        L_0x029c:
            r3 = r5
            r4 = r13
            goto L_0x02b8
        L_0x029f:
            r3 = r5
            double r4 = (double) r13
            r20 = 4604930618986332160(0x3fe8000000000000, double:0.75)
            goto L_0x02ad
        L_0x02a4:
            r3 = r5
            double r4 = (double) r13
            r20 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            goto L_0x02ad
        L_0x02a9:
            r3 = r5
            double r4 = (double) r13
            r20 = 4598175219545276416(0x3fd0000000000000, double:0.25)
        L_0x02ad:
            java.lang.Double.isNaN(r4)
            double r4 = r4 * r20
            long r4 = (long) r4
            goto L_0x02b8
        L_0x02b5:
            r3 = r5
            r4 = 0
        L_0x02b8:
            clw r12 = new clw
            java.lang.String r15 = r15.c
            r12.<init>(r15, r4)
            r0.add(r12)
        L_0x02c2:
            int r11 = r11 + 1
            r5 = r3
            r3 = 0
            goto L_0x0239
        L_0x02c9:
            r3 = r5
            cod r2 = defpackage.coe.a
            r0.sort(r2)
            r10.d = r0
            boolean r0 = a(r1)
            if (r0 != 0) goto L_0x02f5
            djk r0 = r1.h
            int r2 = r0.size()
            r4 = 0
        L_0x02de:
            if (r4 >= r2) goto L_0x0313
            java.lang.Object r5 = r0.get(r4)
            cmx r5 = (defpackage.cmx) r5
            int r4 = r4 + 1
            java.lang.String r8 = r5.b
            java.lang.String r11 = "fullscreen"
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x02de
            java.lang.String r13 = r5.c
            goto L_0x0316
        L_0x02f5:
            djk r0 = r1.l
            int r2 = r0.size()
            r4 = 0
        L_0x02fc:
            if (r4 >= r2) goto L_0x0313
            java.lang.Object r5 = r0.get(r4)
            cmx r5 = (defpackage.cmx) r5
            int r4 = r4 + 1
            java.lang.String r8 = r5.b
            java.lang.String r11 = "expand"
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x02fc
            java.lang.String r13 = r5.c
            goto L_0x0316
        L_0x0313:
            r13 = r19
        L_0x0316:
            r10.e = r13
            boolean r0 = a(r1)
            if (r0 == 0) goto L_0x0347
            djk r0 = r1.k
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0327
            goto L_0x0340
        L_0x0327:
            djk r0 = r1.k
            java.lang.Object r0 = r0.get(r6)
            cmw r0 = (defpackage.cmw) r0
            int r0 = r0.a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0340
            djk r0 = r1.k
            java.lang.Object r0 = r0.get(r6)
            cmw r0 = (defpackage.cmw) r0
            java.lang.String r13 = r0.f
            goto L_0x0370
        L_0x0340:
            java.lang.String r0 = "No non-linear destination URL found"
            android.util.Log.e(r3, r0)
            goto L_0x036e
        L_0x0347:
            djk r0 = r1.f
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0368
            djk r0 = r1.f
            java.lang.Object r0 = r0.get(r6)
            cmt r0 = (defpackage.cmt) r0
            int r0 = r0.a
            r0 = r0 & 16
            if (r0 == 0) goto L_0x0368
            djk r0 = r1.f
            java.lang.Object r0 = r0.get(r6)
            cmt r0 = (defpackage.cmt) r0
            java.lang.String r13 = r0.f
            goto L_0x0370
        L_0x0368:
            java.lang.String r0 = "No companion destination URL found"
            android.util.Log.e(r3, r0)
        L_0x036e:
            r13 = r19
        L_0x0370:
            r10.f = r13
            r10.g = r7
            if (r9 == 0) goto L_0x0388
            java.lang.String r0 = "packageName"
            boolean r2 = r9.containsKey(r0)
            if (r2 != 0) goto L_0x037f
            goto L_0x0388
        L_0x037f:
            java.lang.Object r0 = r9.get(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x03ab
        L_0x0388:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 40
            r4.<init>(r2)
            java.lang.String r2 = "no package name found in ad parameters: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r3, r0)
            r2 = 0
        L_0x03ab:
            r10.h = r2
            if (r9 == 0) goto L_0x03c1
            java.lang.String r0 = "marketURL"
            boolean r2 = r9.containsKey(r0)
            if (r2 != 0) goto L_0x03b8
            goto L_0x03c1
        L_0x03b8:
            java.lang.Object r0 = r9.get(r0)
            r2 = r0
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x03e4
        L_0x03c1:
            java.lang.String r0 = java.lang.String.valueOf(r9)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 38
            r4.<init>(r2)
            java.lang.String r2 = "no market URL found in ad parameters: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            android.util.Log.e(r3, r0)
            r2 = 0
        L_0x03e4:
            r10.i = r2
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L_0x0401
            android.net.Uri r0 = android.net.Uri.parse(r7)
            java.lang.String r2 = "adurl"
            java.lang.String r13 = r0.getQueryParameter(r2)
            java.lang.String r0 = "http://www.google.com/placeholder"
            boolean r0 = android.text.TextUtils.equals(r13, r0)
            if (r0 == 0) goto L_0x03ff
            goto L_0x0401
        L_0x03ff:
            r19 = r13
        L_0x0401:
            boolean r0 = android.text.TextUtils.isEmpty(r19)
            if (r0 != 0) goto L_0x0408
            goto L_0x041d
        L_0x0408:
            if (r9 == 0) goto L_0x041d
            java.lang.String r0 = "deeplinkURL"
            boolean r2 = r9.containsKey(r0)
            if (r2 == 0) goto L_0x041d
            java.lang.Object r0 = r9.get(r0)
            r19 = r0
            java.lang.String r19 = (java.lang.String) r19
            r0 = r19
            goto L_0x041f
        L_0x041d:
            r0 = r19
        L_0x041f:
            boolean r2 = android.text.TextUtils.isEmpty(r0)
            if (r2 != 0) goto L_0x0426
            goto L_0x043b
        L_0x0426:
            java.lang.String r2 = java.lang.String.valueOf(r7)
            java.lang.String r3 = "No deeplinkUrl found in destinationUrl: "
            int r4 = r2.length()
            if (r4 == 0) goto L_0x0436
            r3.concat(r2)
            goto L_0x043b
        L_0x0436:
            java.lang.String r2 = new java.lang.String
            r2.<init>(r3)
        L_0x043b:
            r10.j = r0
            int r0 = r1.c
            long r0 = (long) r0
            r10.k = r0
            coc r0 = new coc
            r0.<init>(r10)
            return r0
        L_0x0448:
            r3 = r5
            goto L_0x044b
        L_0x044a:
            r3 = r5
        L_0x044b:
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.lang.String r0 = defpackage.dcr.a(r24)
            r1[r6] = r0
            java.lang.String r0 = "createVastVideoAd: a non-vast ad passed: %s"
            java.lang.String r0 = java.lang.String.format(r0, r1)
            android.util.Log.e(r3, r0)
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.coe.a(cmc):coc");
    }
}
