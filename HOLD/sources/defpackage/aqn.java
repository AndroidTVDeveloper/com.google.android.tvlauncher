package defpackage;

/* renamed from: aqn  reason: default package */
/* compiled from: PG */
final class aqn {
    private static final int[] a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1635148593, 1752589105, 1751479857, 1635135537, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, 1903435808, 1297305174, 1684175153};

    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00f8, code lost:
        r18 = true;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean a(defpackage.aoj r21, boolean r22) {
        /*
            r0 = r21
            r1 = r0
            aof r1 = (defpackage.aof) r1
            long r2 = r1.b
            r4 = 4096(0x1000, double:2.0237E-320)
            r6 = -1
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0015
            int r8 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r8 > 0) goto L_0x0015
            r4 = r2
            goto L_0x0016
        L_0x0015:
        L_0x0016:
            int r5 = (int) r4
            bky r4 = new bky
            r8 = 64
            r4.<init>(r8)
            r8 = 0
            r9 = r5
            r5 = 0
            r10 = 0
        L_0x0022:
            if (r5 >= r9) goto L_0x0117
            r12 = 8
            r4.a(r12)
            byte[] r13 = r4.a
            r0.c(r13, r8, r12)
            long r13 = r4.h()
            int r15 = r4.j()
            r16 = 1
            r11 = 16
            int r19 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r19 != 0) goto L_0x004e
            byte[] r13 = r4.a
            r0.c(r13, r12, r12)
            r4.b(r11)
            long r13 = r4.l()
            r12 = r13
            r14 = 16
            goto L_0x0071
        L_0x004e:
            r16 = 0
            int r11 = (r13 > r16 ? 1 : (r13 == r16 ? 0 : -1))
            if (r11 != 0) goto L_0x006b
            r16 = r13
            long r12 = r1.b
            int r14 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r14 == 0) goto L_0x006a
            long r16 = r21.b()
            long r12 = r12 - r16
            r16 = 8
            long r12 = r12 + r16
            r14 = 8
            goto L_0x0071
        L_0x006a:
            goto L_0x006d
        L_0x006b:
            r16 = r13
        L_0x006d:
            r12 = r16
            r14 = 8
        L_0x0071:
            int r16 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r16 == 0) goto L_0x007d
            long r6 = (long) r5
            long r6 = r6 + r12
            int r19 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r19 > 0) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            return r8
        L_0x007d:
            long r6 = (long) r14
            int r19 = (r12 > r6 ? 1 : (r12 == r6 ? 0 : -1))
            if (r19 < 0) goto L_0x0115
            int r5 = r5 + r14
            r14 = 1836019574(0x6d6f6f76, float:4.631354E27)
            if (r15 != r14) goto L_0x009c
            int r6 = (int) r12
            int r9 = r9 + r6
            r16 = -1
            int r6 = (r2 > r16 ? 1 : (r2 == r16 ? 0 : -1))
            if (r6 == 0) goto L_0x0099
            long r6 = (long) r9
            int r11 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r11 <= 0) goto L_0x0099
            int r9 = (int) r2
            r6 = r16
            goto L_0x0022
        L_0x0099:
            r6 = r16
            goto L_0x0022
        L_0x009c:
            r16 = -1
            r14 = 1836019558(0x6d6f6f66, float:4.6313494E27)
            if (r15 == r14) goto L_0x0112
            r14 = 1836475768(0x6d766578, float:4.7659988E27)
            if (r15 == r14) goto L_0x0112
            r19 = r9
            long r8 = (long) r5
            long r8 = r8 + r12
            long r8 = r8 - r6
            r11 = r19
            r19 = r15
            long r14 = (long) r11
            int r20 = (r8 > r14 ? 1 : (r8 == r14 ? 0 : -1))
            if (r20 >= 0) goto L_0x0110
            long r12 = r12 - r6
            int r6 = (int) r12
            int r5 = r5 + r6
            r7 = 1718909296(0x66747970, float:2.8862439E23)
            r8 = r19
            if (r8 == r7) goto L_0x00c7
            if (r6 != 0) goto L_0x00c3
            goto L_0x0100
        L_0x00c3:
            r0.b(r6)
            goto L_0x0100
        L_0x00c7:
            r7 = 8
            if (r6 < r7) goto L_0x010e
            r4.a(r6)
            byte[] r7 = r4.a
            r8 = 0
            r0.c(r7, r8, r6)
            int r6 = r6 >> 2
            r7 = 0
        L_0x00d7:
            if (r7 < r6) goto L_0x00dc
            r18 = r10
            goto L_0x00fa
        L_0x00dc:
            r8 = 1
            if (r7 == r8) goto L_0x0107
            int r8 = r4.j()
            int r9 = r8 >>> 8
            r12 = 3368816(0x336770, float:4.720717E-39)
            if (r9 == r12) goto L_0x00f8
            int[] r9 = defpackage.aqn.a
            int r12 = r9.length
            r13 = 0
        L_0x00ee:
            if (r13 < r12) goto L_0x00f1
            goto L_0x010b
        L_0x00f1:
            r15 = r9[r13]
            if (r15 == r8) goto L_0x00f8
            int r13 = r13 + 1
            goto L_0x00ee
        L_0x00f8:
            r18 = 1
        L_0x00fa:
            if (r18 != 0) goto L_0x00fe
            r0 = 0
            return r0
        L_0x00fe:
            r10 = r18
        L_0x0100:
            r9 = r11
            r6 = r16
            r8 = 0
            goto L_0x0022
        L_0x0107:
            r8 = 4
            r4.d(r8)
        L_0x010b:
            int r7 = r7 + 1
            goto L_0x00d7
        L_0x010e:
            r14 = 0
            return r14
        L_0x0110:
            r14 = 0
            goto L_0x0118
        L_0x0112:
            r14 = 0
            r0 = 1
            goto L_0x0119
        L_0x0115:
            r14 = 0
            return r14
        L_0x0117:
        L_0x0118:
            r0 = 0
        L_0x0119:
            if (r10 == 0) goto L_0x0121
            r1 = r22
            if (r1 != r0) goto L_0x0121
            r0 = 1
            return r0
        L_0x0121:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aqn.a(aoj, boolean):boolean");
    }
}
