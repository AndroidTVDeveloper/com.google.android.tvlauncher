package defpackage;

/* renamed from: aqp  reason: default package */
/* compiled from: PG */
public final class aqp {
    public final boolean a;
    public final String b;
    public final aou c;
    public final int d;
    public final byte[] e;

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x003b, code lost:
        if (r6.equals("cenc") != false) goto L_0x0053;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aqp(boolean r5, java.lang.String r6, int r7, byte[] r8, int r9, int r10, byte[] r11) {
        /*
            r4 = this;
            r4.<init>()
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L_0x0009
            r2 = 1
            goto L_0x000a
        L_0x0009:
            r2 = 0
        L_0x000a:
            if (r11 != 0) goto L_0x000e
            r3 = 1
            goto L_0x0010
        L_0x000e:
            r3 = 0
        L_0x0010:
            r2 = r2 ^ r3
            defpackage.bks.a(r2)
            r4.a = r5
            r4.b = r6
            r4.d = r7
            r4.e = r11
            aou r5 = new aou
            r7 = 2
            if (r6 == 0) goto L_0x0081
            int r11 = r6.hashCode()
            r2 = 3
            switch(r11) {
                case 3046605: goto L_0x0048;
                case 3046671: goto L_0x003e;
                case 3049879: goto L_0x0035;
                case 3049895: goto L_0x002a;
                default: goto L_0x0029;
            }
        L_0x0029:
            goto L_0x0052
        L_0x002a:
            java.lang.String r11 = "cens"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x0029
            r0 = 1
            goto L_0x0053
        L_0x0035:
            java.lang.String r11 = "cenc"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x0029
            goto L_0x0053
        L_0x003e:
            java.lang.String r11 = "cbcs"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x0029
            r0 = 3
            goto L_0x0053
        L_0x0048:
            java.lang.String r11 = "cbc1"
            boolean r11 = r6.equals(r11)
            if (r11 == 0) goto L_0x0029
            r0 = 2
            goto L_0x0053
        L_0x0052:
            r0 = -1
        L_0x0053:
            if (r0 == 0) goto L_0x0080
            if (r0 == r1) goto L_0x0080
            if (r0 == r7) goto L_0x007d
            if (r0 == r2) goto L_0x007d
            int r7 = r6.length()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            int r7 = r7 + 68
            r11.<init>(r7)
            java.lang.String r7 = "Unsupported protection scheme type '"
            r11.append(r7)
            r11.append(r6)
            java.lang.String r6 = "'. Assuming AES-CTR crypto mode."
            r11.append(r6)
            java.lang.String r6 = r11.toString()
            java.lang.String r7 = "TrackEncryptionBox"
            android.util.Log.w(r7, r6)
            goto L_0x0082
        L_0x007d:
            r1 = 2
            goto L_0x0082
        L_0x0080:
        L_0x0081:
        L_0x0082:
            r5.<init>(r1, r8, r9, r10)
            r4.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqp.<init>(boolean, java.lang.String, int, byte[], int, int, byte[]):void");
    }
}
