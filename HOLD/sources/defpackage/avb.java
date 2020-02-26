package defpackage;

import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Locale;

/* renamed from: avb  reason: default package */
/* compiled from: PG */
public final class avb implements atx {
    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        return i2 <= i ? blm.f : Arrays.copyOfRange(bArr, i, i2);
    }

    public final atw a(aua aua) {
        ByteBuffer byteBuffer = (ByteBuffer) bks.a(aua.c);
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: avb.a(bky, int, int, boolean):boolean
     arg types: [bky, int, int, int]
     candidates:
      avb.a(int, bky, boolean, int):avc
      avb.a(byte[], int, int, java.lang.String):java.lang.String
      avb.a(bky, int, int, boolean):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0124 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final defpackage.atw a(byte[] r12, int r13) {
        /*
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            bky r1 = new bky
            r1.<init>(r12, r13)
            int r12 = r1.b()
            r13 = 2
            r2 = 10
            r3 = 4
            r4 = 0
            r5 = 1
            java.lang.String r6 = "Id3Decoder"
            r7 = 0
            if (r12 < r2) goto L_0x00b8
            int r12 = r1.g()
            r8 = 4801587(0x494433, float:6.728456E-39)
            if (r12 == r8) goto L_0x004c
            java.lang.Object[] r8 = new java.lang.Object[r5]
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            r8[r4] = r12
            java.lang.String r12 = "%06X"
            java.lang.String r12 = java.lang.String.format(r12, r8)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            java.lang.String r8 = "Unexpected first three bytes of ID3 tag header: 0x"
            int r9 = r12.length()
            if (r9 != 0) goto L_0x0042
            java.lang.String r12 = new java.lang.String
            r12.<init>(r8)
            goto L_0x0046
        L_0x0042:
            java.lang.String r12 = r8.concat(r12)
        L_0x0046:
            android.util.Log.w(r6, r12)
            r10 = r7
            goto L_0x00bf
        L_0x004c:
            int r12 = r1.d()
            r1.d(r5)
            int r8 = r1.d()
            int r9 = r1.m()
            if (r12 == r13) goto L_0x009f
            r10 = 3
            if (r12 != r10) goto L_0x006e
            r10 = r8 & 64
            if (r10 == 0) goto L_0x00a6
            int r10 = r1.j()
            r1.d(r10)
            int r10 = r10 + r3
            int r9 = r9 - r10
            goto L_0x00a6
        L_0x006e:
            if (r12 == r3) goto L_0x008a
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r9 = 57
            r8.<init>(r9)
            java.lang.String r9 = "Skipped ID3 tag with unsupported majorVersion="
            r8.append(r9)
            r8.append(r12)
            java.lang.String r12 = r8.toString()
            android.util.Log.w(r6, r12)
            r10 = r7
            goto L_0x00bf
        L_0x008a:
            r10 = r8 & 64
            if (r10 == 0) goto L_0x0098
            int r10 = r1.m()
            int r11 = r10 + -4
            r1.d(r11)
            int r9 = r9 - r10
        L_0x0098:
            r10 = r8 & 16
            if (r10 == 0) goto L_0x00a6
            int r9 = r9 + -10
            goto L_0x00a6
        L_0x009f:
            r10 = r8 & 64
            if (r10 == 0) goto L_0x00a6
            java.lang.String r12 = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme"
            goto L_0x00ba
        L_0x00a6:
            if (r12 >= r3) goto L_0x00b0
            r8 = r8 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x00ae
            r8 = 1
            goto L_0x00b1
        L_0x00ae:
        L_0x00b0:
            r8 = 0
        L_0x00b1:
            ava r10 = new ava
            r10.<init>(r12, r8, r9)
            goto L_0x00bf
        L_0x00b8:
            java.lang.String r12 = "Data too short to be an ID3 tag"
        L_0x00ba:
            android.util.Log.w(r6, r12)
            r10 = r7
        L_0x00bf:
            if (r10 == 0) goto L_0x0123
            int r12 = r1.b
            int r8 = r10.a
            if (r8 != r13) goto L_0x00c9
            r2 = 6
            goto L_0x00cb
        L_0x00c9:
        L_0x00cb:
            int r13 = r10.c
            boolean r8 = r10.b
            if (r8 != 0) goto L_0x00d2
            goto L_0x00d6
        L_0x00d2:
            int r13 = a(r1, r13)
        L_0x00d6:
            int r12 = r12 + r13
            r1.b(r12)
            int r12 = r10.a
            boolean r12 = a(r1, r12, r2, r4)
            if (r12 != 0) goto L_0x0109
            int r12 = r10.a
            if (r12 == r3) goto L_0x00e7
            goto L_0x00f0
        L_0x00e7:
            boolean r12 = a(r1, r3, r2, r5)
            if (r12 == 0) goto L_0x00f0
            r4 = 1
            goto L_0x010b
        L_0x00f0:
            int r12 = r10.a
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r0 = 56
            r13.<init>(r0)
            java.lang.String r0 = "Failed to validate ID3 tag with majorVersion="
            r13.append(r0)
            r13.append(r12)
            java.lang.String r12 = r13.toString()
            android.util.Log.w(r6, r12)
            return r7
        L_0x0109:
        L_0x010b:
            int r12 = r1.b()
            if (r12 < r2) goto L_0x011d
            int r12 = r10.a
            avc r12 = a(r12, r1, r4, r2)
            if (r12 == 0) goto L_0x010b
            r0.add(r12)
            goto L_0x010b
        L_0x011d:
            atw r12 = new atw
            r12.<init>(r0)
            return r12
        L_0x0123:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avb.a(byte[], int):atw");
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r5v5, types: [avk] */
    /* JADX WARN: Type inference failed for: r5v7, types: [avm] */
    /* JADX WARN: Type inference failed for: r7v6, types: [aur] */
    /* JADX WARN: Type inference failed for: r21v0, types: [avg] */
    /* JADX WARN: Type inference failed for: r21v1, types: [auv] */
    /* JADX WARN: Type inference failed for: r5v29, types: [aux] */
    /* JADX WARN: Type inference failed for: r5v31, types: [aup] */
    /* JADX WARN: Type inference failed for: r11v41, types: [auz] */
    /* JADX WARN: Type inference failed for: r6v24, types: [avi] */
    /* JADX WARN: Type inference failed for: r11v48, types: [avm] */
    /* JADX WARN: Type inference failed for: r11v54, types: [avk] */
    /* JADX WARNING: Code restructure failed: missing block: B:155:0x028c, code lost:
        r11 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x028f, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x0290, code lost:
        r11 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x02ec, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x02ed, code lost:
        r11 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x034a, code lost:
        r11 = r32;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:274:0x0576, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:275:0x0577, code lost:
        r12 = r19;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:277:0x057b, code lost:
        r12 = r19;
        r1 = r20;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:121:0x01f4, B:145:0x0262] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x028f A[ExcHandler: all (th java.lang.Throwable), PHI: r19 
      PHI: (r19v9 int) = (r19v10 int), (r19v10 int), (r19v10 int), (r19v10 int), (r19v12 int), (r19v12 int) binds: [B:166:0x02b1, B:142:0x025c, B:143:?, B:145:0x0262, B:121:0x01f4, B:122:?] A[DONT_GENERATE, DONT_INLINE], Splitter:B:121:0x01f4] */
    /* JADX WARNING: Removed duplicated region for block: B:174:0x02ec A[Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }, ExcHandler: all (th java.lang.Throwable), Splitter:B:138:0x0248] */
    /* JADX WARNING: Removed duplicated region for block: B:243:0x046c A[Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:255:0x04d1 A[Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }] */
    /* JADX WARNING: Removed duplicated region for block: B:263:0x053b A[SYNTHETIC, Splitter:B:263:0x053b] */
    /* JADX WARNING: Removed duplicated region for block: B:274:0x0576 A[ExcHandler: all (th java.lang.Throwable), PHI: r11 r19 
      PHI: (r11v7 bky) = (r11v9 bky), (r11v9 bky), (r11v9 bky), (r11v21 bky), (r11v31 bky) binds: [B:263:0x053b, B:266:0x0564, B:267:?, B:192:0x031b, B:161:0x0299] A[DONT_GENERATE, DONT_INLINE]
      PHI: (r19v1 int) = (r19v3 int), (r19v3 int), (r19v3 int), (r19v10 int), (r19v10 int) binds: [B:263:0x053b, B:266:0x0564, B:267:?, B:192:0x031b, B:161:0x0299] A[DONT_GENERATE, DONT_INLINE], Splitter:B:192:0x031b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x00cf  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x00d3  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static defpackage.avc a(int r31, defpackage.bky r32, boolean r33, int r34) {
        /*
            r0 = r31
            r1 = r32
            int r2 = r32.d()
            int r3 = r32.d()
            int r4 = r32.d()
            r5 = 3
            r6 = 0
            if (r0 < r5) goto L_0x0019
            int r7 = r32.d()
            goto L_0x001b
        L_0x0019:
            r7 = 0
        L_0x001b:
            r8 = 4
            if (r0 != r8) goto L_0x003a
            int r9 = r32.n()
            if (r33 != 0) goto L_0x0046
            r10 = r9 & 255(0xff, float:3.57E-43)
            int r11 = r9 >> 8
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 7
            r10 = r10 | r11
            int r11 = r9 >> 16
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r11 = r11 << 14
            r10 = r10 | r11
            int r9 = r9 >>> 24
            int r9 = r9 << 21
            r9 = r9 | r10
            goto L_0x0046
        L_0x003a:
            if (r0 == r5) goto L_0x0042
            int r9 = r32.g()
            goto L_0x0046
        L_0x0042:
            int r9 = r32.n()
        L_0x0046:
            if (r0 < r5) goto L_0x004d
            int r10 = r32.e()
            goto L_0x004f
        L_0x004d:
            r10 = 0
        L_0x004f:
            r11 = 0
            if (r2 == 0) goto L_0x0053
            goto L_0x0063
        L_0x0053:
            if (r3 != 0) goto L_0x0063
            if (r4 != 0) goto L_0x0063
            if (r7 != 0) goto L_0x0063
            if (r9 != 0) goto L_0x0063
            if (r10 != 0) goto L_0x0063
            int r0 = r1.c
            r1.c(r0)
            return r11
        L_0x0063:
            int r12 = r1.b
            int r12 = r12 + r9
            int r13 = r1.c
            java.lang.String r14 = "Id3Decoder"
            if (r12 <= r13) goto L_0x0077
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            android.util.Log.w(r14, r0)
            int r0 = r1.c
            r1.c(r0)
            return r11
        L_0x0077:
            r13 = 1
            if (r0 != r5) goto L_0x0095
            r15 = r10 & 128(0x80, float:1.794E-43)
            if (r15 == 0) goto L_0x0080
            r15 = 1
            goto L_0x0081
        L_0x0080:
            r15 = 0
        L_0x0081:
            r16 = r10 & 64
            if (r16 == 0) goto L_0x0088
            r16 = 1
            goto L_0x008a
        L_0x0088:
            r16 = 0
        L_0x008a:
            r10 = r10 & 32
            if (r10 == 0) goto L_0x0090
            r10 = 1
            goto L_0x0092
        L_0x0090:
            r10 = 0
        L_0x0092:
            r17 = r15
            goto L_0x00cb
        L_0x0095:
            if (r0 != r8) goto L_0x00c5
            r15 = r10 & 64
            if (r15 == 0) goto L_0x009d
            r15 = 1
            goto L_0x009e
        L_0x009d:
            r15 = 0
        L_0x009e:
            r16 = r10 & 8
            if (r16 == 0) goto L_0x00a5
            r16 = 1
            goto L_0x00a7
        L_0x00a5:
            r16 = 0
        L_0x00a7:
            r17 = r10 & 4
            if (r17 == 0) goto L_0x00ae
            r17 = 1
            goto L_0x00b0
        L_0x00ae:
            r17 = 0
        L_0x00b0:
            r18 = r10 & 2
            if (r18 == 0) goto L_0x00b7
            r18 = 1
            goto L_0x00b9
        L_0x00b7:
            r18 = 0
        L_0x00b9:
            r10 = r10 & r13
            r30 = r17
            r17 = r10
            r10 = r15
            r15 = r16
            r16 = r30
            goto L_0x00cd
        L_0x00c5:
            r10 = 0
            r15 = 0
            r16 = 0
            r17 = 0
        L_0x00cb:
            r18 = 0
        L_0x00cd:
            if (r15 == 0) goto L_0x00d3
            r11 = r1
            r1 = r14
            goto L_0x0590
        L_0x00d3:
            if (r16 != 0) goto L_0x058e
            if (r10 == 0) goto L_0x00dc
            int r9 = r9 + -1
            r1.d(r13)
        L_0x00dc:
            if (r17 == 0) goto L_0x00e3
            int r9 = r9 + -4
            r1.d(r8)
        L_0x00e3:
            if (r18 != 0) goto L_0x00e6
            goto L_0x00ea
        L_0x00e6:
            int r9 = a(r1, r9)
        L_0x00ea:
            r10 = 84
            r15 = 88
            r11 = 2
            if (r2 != r10) goto L_0x0144
            if (r3 != r15) goto L_0x0144
            if (r4 != r15) goto L_0x0144
            if (r0 == r11) goto L_0x00fa
            if (r7 == r15) goto L_0x00fa
            goto L_0x0144
        L_0x00fa:
            if (r9 <= 0) goto L_0x013b
            int r5 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r8 = a(r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r10 = r9 + -1
            byte[] r11 = new byte[r10]     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r1.a(r11, r6, r10)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r10 = a(r11, r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r13.<init>(r11, r6, r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r6 = b(r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r10 = r10 + r6
            int r5 = a(r11, r10, r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r5 = a(r11, r10, r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            avk r11 = new avk     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r6 = "TXXX"
            r11.<init>(r6, r13, r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r6 = r7
            r5 = r11
            r19 = r12
            r20 = r14
            r11 = r1
            goto L_0x0538
        L_0x0132:
            r0 = move-exception
            r11 = r1
            goto L_0x058a
        L_0x0136:
            r0 = move-exception
            r11 = r1
            r1 = r14
            goto L_0x057f
        L_0x013b:
        L_0x013c:
            r11 = r1
            r6 = r7
            r19 = r12
            r20 = r14
            goto L_0x0537
        L_0x0144:
            if (r2 == r10) goto L_0x0508
            r10 = 87
            java.lang.String r8 = "ISO-8859-1"
            if (r2 != r10) goto L_0x018e
            if (r3 != r15) goto L_0x018e
            if (r4 != r15) goto L_0x018e
            if (r0 == r11) goto L_0x0155
            if (r7 == r15) goto L_0x0155
            goto L_0x018e
        L_0x0155:
            if (r9 <= 0) goto L_0x018d
            int r5 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r10 = a(r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r11 = r9 + -1
            byte[] r13 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r1.a(r13, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r11 = a(r13, r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r15.<init>(r13, r6, r11, r10)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r5 = b(r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r11 = r11 + r5
            int r5 = b(r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r5 = a(r13, r11, r5, r8)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            avm r11 = new avm     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r6 = "WXXX"
            r11.<init>(r6, r15, r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r6 = r7
            r5 = r11
            r19 = r12
            r20 = r14
            r11 = r1
            goto L_0x0538
        L_0x018d:
            goto L_0x013c
        L_0x018e:
            if (r2 == r10) goto L_0x04e7
            r10 = 73
            r15 = 80
            if (r2 == r15) goto L_0x0197
            goto L_0x01c3
        L_0x0197:
            r5 = 82
            if (r3 != r5) goto L_0x01c3
            if (r4 != r10) goto L_0x01c3
            r5 = 86
            if (r7 != r5) goto L_0x01c3
            byte[] r5 = new byte[r9]     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r1.a(r5, r6, r9)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r10 = b(r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r11 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r11.<init>(r5, r6, r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r10 = r10 + r13
            byte[] r5 = b(r5, r10, r9)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            avi r6 = new avi     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r6.<init>(r11, r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r11 = r1
            r5 = r6
            r6 = r7
            r19 = r12
            r20 = r14
            goto L_0x0538
        L_0x01c3:
            r5 = 71
            r10 = 79
            if (r2 == r5) goto L_0x01cc
            r19 = r12
            goto L_0x0226
        L_0x01cc:
            r5 = 69
            if (r3 != r5) goto L_0x0224
            if (r4 != r10) goto L_0x0224
            r5 = 66
            if (r7 == r5) goto L_0x01dc
            if (r0 != r11) goto L_0x01d9
            goto L_0x01dc
        L_0x01d9:
            r19 = r12
            goto L_0x0226
        L_0x01dc:
            int r5 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r10 = a(r5)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r11 = r9 + -1
            byte[] r15 = new byte[r11]     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r1.a(r15, r6, r11)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            int r13 = b(r15, r6)     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0136, all -> 0x0132 }
            r19 = r12
            r12 = 0
            r6.<init>(r15, r12, r13, r8)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            r8 = 1
            int r13 = r13 + r8
            int r8 = a(r15, r13, r5)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            java.lang.String r12 = a(r15, r13, r8, r10)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            int r13 = b(r5)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            int r8 = r8 + r13
            int r13 = a(r15, r8, r5)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            java.lang.String r8 = a(r15, r8, r13, r10)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            int r5 = b(r5)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            int r13 = r13 + r5
            byte[] r5 = b(r15, r13, r11)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            auz r11 = new auz     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            r11.<init>(r6, r12, r8, r5)     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            r6 = r7
            r5 = r11
            r20 = r14
            r11 = r1
            goto L_0x0538
        L_0x0224:
            r19 = r12
        L_0x0226:
            r5 = 65
            r6 = 67
            if (r0 == r11) goto L_0x0240
            if (r2 == r5) goto L_0x0232
            r20 = r14
            goto L_0x02f9
        L_0x0232:
            if (r3 != r15) goto L_0x023c
            r12 = 73
            if (r4 != r12) goto L_0x023c
            if (r7 != r6) goto L_0x023c
            goto L_0x0248
        L_0x023c:
            r20 = r14
            goto L_0x02f9
        L_0x0240:
            if (r2 != r15) goto L_0x02f7
            r12 = 73
            if (r3 != r12) goto L_0x02f7
            if (r4 != r6) goto L_0x02f7
        L_0x0248:
            int r5 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x02f1, all -> 0x02ec }
            java.lang.String r6 = a(r5)     // Catch:{ UnsupportedEncodingException -> 0x02f1, all -> 0x02ec }
            int r10 = r9 + -1
            byte[] r12 = new byte[r10]     // Catch:{ UnsupportedEncodingException -> 0x02f1, all -> 0x02ec }
            r13 = 0
            r1.a(r12, r13, r10)     // Catch:{ UnsupportedEncodingException -> 0x02f1, all -> 0x02ec }
            if (r0 != r11) goto L_0x0296
            java.lang.String r13 = "image/"
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0293, all -> 0x028f }
            r20 = r14
            r11 = 3
            r14 = 0
            r15.<init>(r12, r14, r11, r8)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            java.lang.String r8 = defpackage.blm.d(r15)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            int r11 = r8.length()     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            if (r11 != 0) goto L_0x0279
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            r8.<init>(r13)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            goto L_0x027d
        L_0x0279:
            java.lang.String r8 = r13.concat(r8)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
        L_0x027d:
            java.lang.String r11 = "image/jpg"
            boolean r11 = r11.equals(r8)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            if (r11 == 0) goto L_0x0288
            java.lang.String r8 = "image/jpeg"
            goto L_0x0289
        L_0x0288:
        L_0x0289:
            r13 = 2
            goto L_0x02c5
        L_0x028b:
            r0 = move-exception
            r11 = r1
            goto L_0x057b
        L_0x028f:
            r0 = move-exception
            r11 = r1
            goto L_0x0577
        L_0x0293:
            r0 = move-exception
            r11 = r1
            goto L_0x02f4
        L_0x0296:
            r20 = r14
            r11 = 0
            int r13 = b(r12, r11)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            java.lang.String r14 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            r14.<init>(r12, r11, r13, r8)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            java.lang.String r8 = defpackage.blm.d(r14)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            r11 = 47
            int r11 = r8.indexOf(r11)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            r14 = -1
            if (r11 != r14) goto L_0x02c5
            java.lang.String r11 = "image/"
            java.lang.String r8 = java.lang.String.valueOf(r8)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            int r14 = r8.length()     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            if (r14 != 0) goto L_0x02c1
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            r8.<init>(r11)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
            goto L_0x02c5
        L_0x02c1:
            java.lang.String r8 = r11.concat(r8)     // Catch:{ UnsupportedEncodingException -> 0x028b, all -> 0x028f }
        L_0x02c5:
            int r11 = r13 + 1
            byte r11 = r12[r11]     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            r11 = r11 & 255(0xff, float:3.57E-43)
            r14 = 2
            int r13 = r13 + r14
            int r14 = a(r12, r13, r5)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            java.lang.String r15 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            int r1 = r14 - r13
            r15.<init>(r12, r13, r1, r6)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            int r1 = b(r5)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            int r14 = r14 + r1
            byte[] r1 = b(r12, r14, r10)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            aup r5 = new aup     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            r5.<init>(r8, r15, r11, r1)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            r11 = r32
            r6 = r7
            goto L_0x0538
        L_0x02ec:
            r0 = move-exception
            r11 = r32
            goto L_0x0577
        L_0x02f1:
            r0 = move-exception
            r11 = r32
        L_0x02f4:
            r1 = r14
            goto L_0x056d
        L_0x02f7:
            r20 = r14
        L_0x02f9:
            r1 = 77
            if (r2 != r6) goto L_0x0353
            if (r3 != r10) goto L_0x0353
            if (r4 != r1) goto L_0x0353
            if (r7 == r1) goto L_0x0309
            r11 = 2
            if (r0 == r11) goto L_0x0309
            r11 = r32
            goto L_0x0355
        L_0x0309:
            r1 = 4
            if (r9 < r1) goto L_0x034e
            int r1 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            java.lang.String r5 = a(r1)     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            r6 = 3
            byte[] r8 = new byte[r6]     // Catch:{ UnsupportedEncodingException -> 0x0349, all -> 0x02ec }
            r11 = r32
            r10 = 0
            r11.a(r8, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r12.<init>(r8, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r6 = r9 + -4
            byte[] r8 = new byte[r6]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r11.a(r8, r10, r6)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r6 = a(r8, r10, r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String r13 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r13.<init>(r8, r10, r6, r5)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r10 = b(r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r6 = r6 + r10
            int r1 = a(r8, r6, r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String r1 = a(r8, r6, r1, r5)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            aux r5 = new aux     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r5.<init>(r12, r13, r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r6 = r7
            goto L_0x0538
        L_0x0349:
            r0 = move-exception
            r11 = r32
            goto L_0x057b
        L_0x034e:
            r11 = r32
            r6 = r7
            goto L_0x0537
        L_0x0353:
            r11 = r32
        L_0x0355:
            if (r2 != r6) goto L_0x03cc
            r12 = 72
            if (r3 != r12) goto L_0x03cc
            if (r4 != r5) goto L_0x03cc
            if (r7 != r15) goto L_0x03cc
            int r1 = r11.b     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r5 = r11.a     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r5 = b(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r10 = r11.a     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r12 = r5 - r1
            r6.<init>(r10, r1, r12, r8)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r8 = 1
            int r5 = r5 + r8
            r11.c(r5)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r23 = r32.j()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r24 = r32.j()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            long r12 = r32.h()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x038b
            goto L_0x038d
        L_0x038b:
            r12 = -1
        L_0x038d:
            r25 = r12
            long r12 = r32.h()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r14 = 4294967295(0xffffffff, double:2.1219957905E-314)
            int r5 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r5 == 0) goto L_0x039d
            goto L_0x039f
        L_0x039d:
            r12 = -1
        L_0x039f:
            r27 = r12
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r1 = r1 + r9
        L_0x03a7:
            int r8 = r11.b     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            if (r8 >= r1) goto L_0x03b5
            avc r8 = a(r31, r32, r33, r34)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            if (r8 == 0) goto L_0x03a7
            r5.add(r8)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            goto L_0x03a7
        L_0x03b5:
            int r1 = r5.size()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            avc[] r1 = new defpackage.avc[r1]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r5.toArray(r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            aut r5 = new aut     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r21 = r5
            r22 = r6
            r29 = r1
            r21.<init>(r22, r23, r24, r25, r27, r29)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r6 = r7
            goto L_0x0538
        L_0x03cc:
            if (r2 != r6) goto L_0x0467
            r5 = 84
            if (r3 != r5) goto L_0x0467
            if (r4 != r10) goto L_0x0467
            if (r7 != r6) goto L_0x0467
            int r1 = r11.b     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r5 = r11.a     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r5 = b(r5, r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String r6 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r10 = r11.a     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r12 = r5 - r1
            r6.<init>(r10, r1, r12, r8)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r10 = 1
            int r5 = r5 + r10
            r11.c(r5)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r5 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r10 = r5 & 2
            if (r10 == 0) goto L_0x03f8
            r23 = 1
            goto L_0x03fa
        L_0x03f8:
            r23 = 0
        L_0x03fa:
            r10 = 1
            r5 = r5 & r10
            int r12 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String[] r13 = new java.lang.String[r12]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r14 = 0
        L_0x0403:
            if (r14 >= r12) goto L_0x042b
            int r15 = r11.b     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r10 = r11.a     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r10 = b(r10, r15)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r17 = r12
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r0 = r11.a     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r18 = r7
            int r7 = r10 - r15
            r12.<init>(r0, r15, r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r13[r14] = r12     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r10 = r10 + 1
            r11.c(r10)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r14 = r14 + 1
            r10 = 1
            r0 = r31
            r12 = r17
            r7 = r18
            goto L_0x0403
        L_0x042b:
            r18 = r7
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r0.<init>()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r1 = r1 + r9
        L_0x0433:
            int r7 = r11.b     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            if (r7 >= r1) goto L_0x0441
            avc r7 = a(r31, r32, r33, r34)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            if (r7 == 0) goto L_0x0433
            r0.add(r7)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            goto L_0x0433
        L_0x0441:
            int r1 = r0.size()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            avc[] r1 = new defpackage.avc[r1]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r0.toArray(r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            auv r0 = new auv     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            if (r5 != 0) goto L_0x0451
            r24 = 0
            goto L_0x0454
        L_0x0451:
            r24 = 1
        L_0x0454:
            r21 = r0
            r22 = r6
            r25 = r13
            r26 = r1
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r5 = r0
            r6 = r18
            r0 = r31
            goto L_0x0538
        L_0x0467:
            r18 = r7
            if (r2 != r1) goto L_0x04d1
            r0 = 76
            if (r3 != r0) goto L_0x04ce
            r0 = 76
            if (r4 != r0) goto L_0x04ce
            r6 = r18
            r0 = 84
            if (r6 == r0) goto L_0x047b
            goto L_0x04d3
        L_0x047b:
            int r22 = r32.e()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r23 = r32.g()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r24 = r32.g()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r0 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r1 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            bkx r5 = new bkx     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r5.<init>()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r7 = r11.a     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r8 = r11.c     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r5.a(r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r7 = r11.b     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r8 = 3
            int r7 = r7 << r8
            r5.a(r7)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r7 = r9 + -10
            int r7 = r7 << r8
            int r8 = r0 + r1
            int r7 = r7 / r8
            int[] r8 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int[] r10 = new int[r7]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r12 = 0
        L_0x04ad:
            if (r12 >= r7) goto L_0x04be
            int r13 = r5.c(r0)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r14 = r5.c(r1)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r8[r12] = r13     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r10[r12] = r14     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r12 = r12 + 1
            goto L_0x04ad
        L_0x04be:
            avg r0 = new avg     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r21 = r0
            r25 = r8
            r26 = r10
            r21.<init>(r22, r23, r24, r25, r26)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r5 = r0
            r0 = r31
            goto L_0x0538
        L_0x04ce:
            r6 = r18
            goto L_0x04d3
        L_0x04d1:
            r6 = r18
        L_0x04d3:
            r0 = r31
            java.lang.String r1 = a(r0, r2, r3, r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r5 = new byte[r9]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r7 = 0
            r11.a(r5, r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            aur r7 = new aur     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r7.<init>(r1, r5)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r5 = r7
            goto L_0x0538
        L_0x04e7:
            r11 = r1
            r6 = r7
            r19 = r12
            r20 = r14
            java.lang.String r1 = a(r0, r10, r3, r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            byte[] r5 = new byte[r9]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r7 = 0
            r11.a(r5, r7, r9)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r10 = b(r5, r7)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String r12 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r12.<init>(r5, r7, r10, r8)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            avm r5 = new avm     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r7 = 0
            r5.<init>(r1, r7, r12)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            goto L_0x0538
        L_0x0508:
            r11 = r1
            r6 = r7
            r19 = r12
            r20 = r14
            r1 = 84
            java.lang.String r1 = a(r0, r1, r3, r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            if (r9 <= 0) goto L_0x0536
            int r5 = r32.d()     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String r7 = a(r5)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r8 = r9 + -1
            byte[] r10 = new byte[r8]     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r12 = 0
            r11.a(r10, r12, r8)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            int r5 = a(r10, r12, r5)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            java.lang.String r8 = new java.lang.String     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r8.<init>(r10, r12, r5, r7)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            avk r5 = new avk     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            r7 = 0
            r5.<init>(r1, r7, r8)     // Catch:{ UnsupportedEncodingException -> 0x057a, all -> 0x0576 }
            goto L_0x0538
        L_0x0536:
        L_0x0537:
            r5 = 0
        L_0x0538:
            if (r5 != 0) goto L_0x0570
            java.lang.String r0 = a(r0, r2, r3, r4, r6)     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            int r1 = r1.length()     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            int r1 = r1 + 50
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            r2.<init>(r1)     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            java.lang.String r1 = "Failed to decode frame: id="
            r2.append(r1)     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            r2.append(r9)     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x056a, all -> 0x0576 }
            r1 = r20
            android.util.Log.w(r1, r0)     // Catch:{ UnsupportedEncodingException -> 0x0568, all -> 0x0576 }
            goto L_0x0570
        L_0x0568:
            r0 = move-exception
            goto L_0x056d
        L_0x056a:
            r0 = move-exception
            r1 = r20
        L_0x056d:
            r12 = r19
            goto L_0x057f
        L_0x0570:
            r12 = r19
            r11.c(r12)
            return r5
        L_0x0576:
            r0 = move-exception
        L_0x0577:
            r12 = r19
            goto L_0x058a
        L_0x057a:
            r0 = move-exception
        L_0x057b:
            r12 = r19
            r1 = r20
        L_0x057f:
            java.lang.String r0 = "Unsupported character encoding"
            android.util.Log.w(r1, r0)     // Catch:{ all -> 0x0589 }
            r11.c(r12)
            r1 = 0
            return r1
        L_0x0589:
            r0 = move-exception
        L_0x058a:
            r11.c(r12)
            throw r0
        L_0x058e:
            r11 = r1
            r1 = r14
        L_0x0590:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            android.util.Log.w(r1, r0)
            r11.c(r12)
            r1 = 0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.avb.a(int, bky, boolean, int):avc");
    }

    private static String a(byte[] bArr, int i, int i2, String str) {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        if (i != 2) {
            return String.format(Locale.US, "%c%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5));
        }
        return String.format(Locale.US, "%c%c%c", Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
    }

    private static int a(byte[] bArr, int i, int i2) {
        int b = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b;
        }
        while (true) {
            int length = bArr.length;
            if (b >= length - 1) {
                return length;
            }
            if (b % 2 == 0 && bArr[b + 1] == 0) {
                return b;
            }
            b = b(bArr, b + 1);
        }
    }

    private static int b(byte[] bArr, int i) {
        while (true) {
            int length = bArr.length;
            if (i >= length) {
                return length;
            }
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
    }

    private static int a(bky bky, int i) {
        byte[] bArr = bky.a;
        int i2 = bky.b;
        int i3 = i;
        int i4 = i2;
        while (true) {
            int i5 = i4 + 1;
            if (i5 >= i2 + i3) {
                return i3;
            }
            if ((bArr[i4] & 255) == 255 && bArr[i5] == 0) {
                System.arraycopy(bArr, i4 + 2, bArr, i5, (i3 - (i4 - i2)) - 2);
                i3--;
            }
            i4 = i5;
        }
    }

    private static boolean a(bky bky, int i, int i2, boolean z) {
        int i3;
        long j;
        int i4;
        int i5;
        int i6;
        bky bky2 = bky;
        int i7 = i;
        int i8 = bky2.b;
        while (true) {
            try {
                int i9 = 1;
                if (bky.b() >= i2) {
                    if (i7 >= 3) {
                        i4 = bky.j();
                        j = bky.h();
                        i3 = bky.e();
                    } else {
                        i4 = bky.g();
                        j = (long) bky.g();
                        i3 = 0;
                    }
                    if (i4 != 0 || j != 0 || i3 != 0) {
                        if (i7 == 4 && !z) {
                            if ((8421504 & j) == 0) {
                                j = (((j >> 24) & 255) << 21) | (j & 255) | (((j >> 8) & 255) << 7) | (((j >> 16) & 255) << 14);
                            } else {
                                bky2.c(i8);
                                return false;
                            }
                        }
                        if (i7 == 4) {
                            if ((i3 & 64) == 0) {
                                i9 = 0;
                            }
                            i5 = i3 & 1;
                        } else if (i7 == 3) {
                            if ((i3 & 32) != 0) {
                                i6 = 1;
                            } else {
                                i6 = 0;
                            }
                            if ((i3 & 128) == 0) {
                                i9 = i6;
                                i5 = 0;
                            } else {
                                i9 = i6;
                                i5 = 1;
                            }
                        } else {
                            i5 = 0;
                            i9 = 0;
                        }
                        if (i5 != 0) {
                            i9 += 4;
                        }
                        if (j >= ((long) i9)) {
                            if (((long) bky.b()) < j) {
                                break;
                            }
                            bky2.d((int) j);
                        } else {
                            break;
                        }
                    } else {
                        bky2.c(i8);
                        return true;
                    }
                } else {
                    bky2.c(i8);
                    return true;
                }
            } finally {
                bky2.c(i8);
            }
        }
        return false;
    }
}
