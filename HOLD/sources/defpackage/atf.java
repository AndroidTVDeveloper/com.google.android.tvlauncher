package defpackage;

/* renamed from: atf  reason: default package */
/* compiled from: PG */
public final class atf extends Exception {
    public final String a;
    public final atd b;
    public final String c;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public atf(defpackage.akh r10, java.lang.Throwable r11, int r12) {
        /*
            r9 = this;
            java.lang.String r0 = java.lang.String.valueOf(r10)
            java.lang.String r1 = java.lang.String.valueOf(r0)
            int r1 = r1.length()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            int r1 = r1 + 36
            r2.<init>(r1)
            java.lang.String r1 = "Decoder init failed: ["
            r2.append(r1)
            r2.append(r12)
            java.lang.String r1 = "], "
            r2.append(r1)
            r2.append(r0)
            java.lang.String r4 = r2.toString()
            java.lang.String r6 = r10.i
            int r10 = java.lang.Math.abs(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r0 = 75
            r12.<init>(r0)
            java.lang.String r0 = "com.google.android.exoplayer2.mediacodec.MediaCodecRenderer_neg_"
            r12.append(r0)
            r12.append(r10)
            java.lang.String r8 = r12.toString()
            r7 = 0
            r3 = r9
            r5 = r11
            r3.<init>(r4, r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atf.<init>(akh, java.lang.Throwable, int):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public atf(defpackage.akh r12, java.lang.Throwable r13, defpackage.atd r14) {
        /*
            r11 = this;
            java.lang.String r0 = r14.a
            java.lang.String r1 = java.lang.String.valueOf(r12)
            java.lang.String r2 = java.lang.String.valueOf(r0)
            int r2 = r2.length()
            java.lang.String r3 = java.lang.String.valueOf(r1)
            int r3 = r3.length()
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            int r2 = r2 + 23
            int r2 = r2 + r3
            r4.<init>(r2)
            java.lang.String r2 = "Decoder init failed: "
            r4.append(r2)
            r4.append(r0)
            java.lang.String r0 = ", "
            r4.append(r0)
            r4.append(r1)
            java.lang.String r6 = r4.toString()
            java.lang.String r8 = r12.i
            int r12 = defpackage.blm.a
            r0 = 0
            r1 = 21
            if (r12 < r1) goto L_0x0049
            boolean r12 = r13 instanceof android.media.MediaCodec.CodecException
            if (r12 == 0) goto L_0x0048
            r12 = r13
            android.media.MediaCodec$CodecException r12 = (android.media.MediaCodec.CodecException) r12
            java.lang.String r12 = r12.getDiagnosticInfo()
            r10 = r12
            goto L_0x004a
        L_0x0048:
        L_0x0049:
            r10 = r0
        L_0x004a:
            r5 = r11
            r7 = r13
            r9 = r14
            r5.<init>(r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atf.<init>(akh, java.lang.Throwable, atd):void");
    }

    public atf(String str, Throwable th, String str2, atd atd, String str3) {
        super(str, th);
        this.a = str2;
        this.b = atd;
        this.c = str3;
    }
}
