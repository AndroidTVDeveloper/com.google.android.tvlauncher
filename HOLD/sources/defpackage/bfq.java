package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bfq  reason: default package */
/* compiled from: PG */
public final class bfq extends anm {
    private final bfp d = new bfp();
    private final bky e = new bky();
    private final bfl f = new bfl();
    private final bfh g = new bfh();
    private final List h = new ArrayList();

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0163, code lost:
        if (")".equals(defpackage.bfh.a(r8, r9)) == false) goto L_0x0167;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final defpackage.bdl a(byte[] r21, int r22, boolean r23) {
        /*
            r20 = this;
            r1 = r20
            bky r0 = r1.e
            r2 = r21
            r3 = r22
            r0.a(r2, r3)
            bfl r0 = r1.f
            r0.a()
            java.util.List r0 = r1.h
            r0.clear()
            bky r0 = r1.e     // Catch:{ ako -> 0x034d }
            defpackage.bfr.a(r0)     // Catch:{ ako -> 0x034d }
        L_0x001a:
            bky r0 = r1.e
            java.lang.String r0 = r0.r()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0349
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x002b:
            bky r2 = r1.e
            r3 = 2
            r4 = -1
            r5 = 0
            r6 = 1
            r7 = -1
            r8 = 0
        L_0x0033:
            if (r7 != r4) goto L_0x0055
            int r8 = r2.b
            java.lang.String r7 = r2.r()
            if (r7 == 0) goto L_0x0053
            java.lang.String r9 = "STYLE"
            boolean r9 = r9.equals(r7)
            if (r9 != 0) goto L_0x0051
            java.lang.String r9 = "NOTE"
            boolean r7 = r7.startsWith(r9)
            if (r7 == 0) goto L_0x004f
            r7 = 1
            goto L_0x0033
        L_0x004f:
            r7 = 3
            goto L_0x0033
        L_0x0051:
            r7 = 2
            goto L_0x0033
        L_0x0053:
            r7 = 0
            goto L_0x0033
        L_0x0055:
            r2.c(r8)
            if (r7 == 0) goto L_0x0343
            if (r7 != r6) goto L_0x0069
            bky r2 = r1.e
        L_0x005e:
            java.lang.String r3 = r2.r()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x002b
            goto L_0x005e
        L_0x0069:
            if (r7 == r3) goto L_0x00bb
            bfp r2 = r1.d
            bky r5 = r1.e
            bfl r6 = r1.f
            java.util.List r8 = r1.h
            java.lang.String r3 = r5.r()
            if (r3 == 0) goto L_0x002b
            java.util.regex.Pattern r4 = defpackage.bfp.a
            java.util.regex.Matcher r4 = r4.matcher(r3)
            boolean r7 = r4.matches()
            if (r7 == 0) goto L_0x008d
            r3 = 0
            java.lang.StringBuilder r7 = r2.b
            boolean r2 = defpackage.bfp.a(r3, r4, r5, r6, r7, r8)
            goto L_0x00a9
        L_0x008d:
            java.lang.String r4 = r5.r()
            if (r4 == 0) goto L_0x002b
            java.util.regex.Pattern r7 = defpackage.bfp.a
            java.util.regex.Matcher r4 = r7.matcher(r4)
            boolean r7 = r4.matches()
            if (r7 == 0) goto L_0x002b
            java.lang.String r3 = r3.trim()
            java.lang.StringBuilder r7 = r2.b
            boolean r2 = defpackage.bfp.a(r3, r4, r5, r6, r7, r8)
        L_0x00a9:
            if (r2 == 0) goto L_0x002b
            bfl r2 = r1.f
            bfm r2 = r2.b()
            r0.add(r2)
            bfl r2 = r1.f
            r2.a()
            goto L_0x002b
        L_0x00bb:
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x033b
            bky r2 = r1.e
            r2.r()
            java.util.List r2 = r1.h
            bfh r3 = r1.g
            bky r7 = r1.e
            java.lang.StringBuilder r8 = r3.c
            r8.setLength(r5)
            int r8 = r7.b
        L_0x00d3:
            java.lang.String r9 = r7.r()
            boolean r9 = android.text.TextUtils.isEmpty(r9)
            if (r9 == 0) goto L_0x032f
            bky r9 = r3.b
            byte[] r10 = r7.a
            int r7 = r7.b
            r9.a(r10, r7)
            bky r7 = r3.b
            r7.c(r8)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
        L_0x00f0:
            bky r8 = r3.b
            java.lang.StringBuilder r9 = r3.c
            defpackage.bfh.a(r8)
            int r10 = r8.b()
            java.lang.String r11 = "{"
            r12 = 5
            java.lang.String r13 = ""
            if (r10 < r12) goto L_0x0167
            java.lang.String r10 = r8.e(r12)
            java.lang.String r12 = "::cue"
            boolean r10 = r12.equals(r10)
            if (r10 == 0) goto L_0x0167
            int r10 = r8.b
            java.lang.String r12 = defpackage.bfh.a(r8, r9)
            if (r12 == 0) goto L_0x0166
            boolean r15 = r11.equals(r12)
            if (r15 == 0) goto L_0x0121
            r8.c(r10)
            r10 = r13
            goto L_0x0168
        L_0x0121:
            java.lang.String r10 = "("
            boolean r10 = r10.equals(r12)
            if (r10 == 0) goto L_0x0157
            int r10 = r8.b
            int r12 = r8.c
            r15 = 0
        L_0x012f:
            if (r10 < r12) goto L_0x0132
            goto L_0x0149
        L_0x0132:
            if (r15 != 0) goto L_0x0149
            int r15 = r10 + 1
            byte[] r14 = r8.a
            byte r10 = r14[r10]
            char r10 = (char) r10
            r14 = 41
            if (r10 != r14) goto L_0x0141
            r10 = 1
            goto L_0x0142
        L_0x0141:
            r10 = 0
        L_0x0142:
            r19 = r15
            r15 = r10
            r10 = r19
            goto L_0x012f
        L_0x0149:
            int r10 = r10 + -1
            int r12 = r8.b
            int r10 = r10 - r12
            java.lang.String r10 = r8.e(r10)
            java.lang.String r10 = r10.trim()
            goto L_0x0159
        L_0x0157:
            r10 = 0
        L_0x0159:
            java.lang.String r8 = defpackage.bfh.a(r8, r9)
            java.lang.String r9 = ")"
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x0168
            goto L_0x0167
        L_0x0166:
        L_0x0167:
            r10 = 0
        L_0x0168:
            if (r10 == 0) goto L_0x0328
            bky r8 = r3.b
            java.lang.StringBuilder r9 = r3.c
            java.lang.String r8 = defpackage.bfh.a(r8, r9)
            boolean r8 = r11.equals(r8)
            if (r8 == 0) goto L_0x0328
            bfk r8 = new bfk
            r8.<init>()
            boolean r9 = r13.equals(r10)
            if (r9 != 0) goto L_0x01d9
            r9 = 91
            int r9 = r10.indexOf(r9)
            if (r9 == r4) goto L_0x01a6
            java.util.regex.Pattern r11 = defpackage.bfh.a
            java.lang.String r12 = r10.substring(r9)
            java.util.regex.Matcher r11 = r11.matcher(r12)
            boolean r12 = r11.matches()
            if (r12 == 0) goto L_0x01a1
            java.lang.String r11 = r11.group(r6)
            r8.d = r11
        L_0x01a1:
            java.lang.String r10 = r10.substring(r5, r9)
        L_0x01a6:
            java.lang.String r9 = "\\."
            java.lang.String[] r9 = defpackage.blm.a(r10, r9)
            r10 = r9[r5]
            r11 = 35
            int r11 = r10.indexOf(r11)
            if (r11 == r4) goto L_0x01c6
            java.lang.String r12 = r10.substring(r5, r11)
            r8.b = r12
            int r11 = r11 + 1
            java.lang.String r10 = r10.substring(r11)
            r8.a = r10
            goto L_0x01c8
        L_0x01c6:
            r8.b = r10
        L_0x01c8:
            int r10 = r9.length
            if (r10 <= r6) goto L_0x01d8
            java.lang.Object[] r9 = defpackage.blm.b(r9, r10)
            java.lang.String[] r9 = (java.lang.String[]) r9
            java.util.List r9 = java.util.Arrays.asList(r9)
            r8.c = r9
            goto L_0x01db
        L_0x01d8:
            goto L_0x01da
        L_0x01d9:
        L_0x01da:
        L_0x01db:
            r9 = 0
            r10 = 0
        L_0x01dd:
            java.lang.String r11 = "}"
            if (r9 != 0) goto L_0x030a
            bky r9 = r3.b
            int r10 = r9.b
            java.lang.StringBuilder r12 = r3.c
            java.lang.String r9 = defpackage.bfh.a(r9, r12)
            if (r9 == 0) goto L_0x01f6
            boolean r12 = r11.equals(r9)
            if (r12 != 0) goto L_0x01f5
            r12 = 0
            goto L_0x01f7
        L_0x01f5:
        L_0x01f6:
            r12 = 1
        L_0x01f7:
            if (r12 != 0) goto L_0x02fc
            bky r14 = r3.b
            r14.c(r10)
            bky r10 = r3.b
            java.lang.StringBuilder r14 = r3.c
            defpackage.bfh.a(r10)
            java.lang.String r15 = defpackage.bfh.b(r10, r14)
            boolean r16 = r13.equals(r15)
            if (r16 != 0) goto L_0x02fc
            java.lang.String r4 = defpackage.bfh.a(r10, r14)
            java.lang.String r5 = ":"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L_0x02fc
            defpackage.bfh.a(r10)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            r5 = 0
        L_0x0224:
            java.lang.String r6 = ";"
            if (r5 != 0) goto L_0x0255
            int r1 = r10.b
            r17 = r3
            java.lang.String r3 = defpackage.bfh.a(r10, r14)
            if (r3 == 0) goto L_0x0253
            boolean r18 = r11.equals(r3)
            if (r18 != 0) goto L_0x0248
            boolean r6 = r6.equals(r3)
            if (r6 == 0) goto L_0x023f
            goto L_0x0248
        L_0x023f:
            r4.append(r3)
            r6 = 1
            r1 = r20
            r3 = r17
            goto L_0x0224
        L_0x0248:
            r10.c(r1)
            r5 = 1
            r6 = 1
            r1 = r20
            r3 = r17
            goto L_0x0224
        L_0x0253:
            r1 = 0
            goto L_0x025b
        L_0x0255:
            r17 = r3
            java.lang.String r1 = r4.toString()
        L_0x025b:
            if (r1 == 0) goto L_0x02fe
            boolean r3 = r13.equals(r1)
            if (r3 != 0) goto L_0x02fe
            int r3 = r10.b
            java.lang.String r4 = defpackage.bfh.a(r10, r14)
            boolean r5 = r6.equals(r4)
            if (r5 != 0) goto L_0x027c
            boolean r4 = r11.equals(r4)
            if (r4 == 0) goto L_0x0279
            r10.c(r3)
            goto L_0x027c
        L_0x0279:
            r3 = 1
            goto L_0x02ff
        L_0x027c:
            java.lang.String r3 = "color"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x0292
            int r1 = defpackage.bkh.b(r1)
            r8.f = r1
            r1 = 1
            r8.g = r1
            r3 = 1
            goto L_0x02ff
        L_0x0292:
            java.lang.String r3 = "background-color"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x02a7
            int r1 = defpackage.bkh.b(r1)
            r8.h = r1
            r1 = 1
            r8.i = r1
            r3 = 1
            goto L_0x02ff
        L_0x02a7:
            java.lang.String r3 = "text-decoration"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x02be
            java.lang.String r3 = "underline"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0279
            r1 = 1
            r8.j = r1
            r3 = 1
            goto L_0x02ff
        L_0x02be:
            java.lang.String r3 = "font-family"
            boolean r3 = r3.equals(r15)
            if (r3 != 0) goto L_0x02f3
            java.lang.String r3 = "font-weight"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x02dd
            java.lang.String r3 = "bold"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0279
            r1 = 1
            r8.k = r1
            r3 = 1
            goto L_0x02ff
        L_0x02dd:
            java.lang.String r3 = "font-style"
            boolean r3 = r3.equals(r15)
            if (r3 == 0) goto L_0x02fe
            java.lang.String r3 = "italic"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x02fe
            r3 = 1
            r8.l = r3
            goto L_0x02ff
        L_0x02f3:
            r3 = 1
            java.lang.String r1 = defpackage.blm.d(r1)
            r8.e = r1
            goto L_0x02ff
        L_0x02fc:
            r17 = r3
        L_0x02fe:
            r3 = 1
        L_0x02ff:
            r10 = r9
            r9 = r12
            r3 = r17
            r4 = -1
            r5 = 0
            r6 = 1
            r1 = r20
            goto L_0x01dd
        L_0x030a:
            r17 = r3
            r3 = 1
            boolean r1 = r11.equals(r10)
            if (r1 == 0) goto L_0x031f
            r7.add(r8)
            r3 = r17
            r4 = -1
            r5 = 0
            r6 = 1
            r1 = r20
            goto L_0x00f0
        L_0x031f:
            r3 = r17
            r4 = -1
            r5 = 0
            r6 = 1
            r1 = r20
            goto L_0x00f0
        L_0x0328:
            r2.addAll(r7)
            r1 = r20
            goto L_0x002b
        L_0x032f:
            r17 = r3
            r3 = 1
            r1 = r20
            r3 = r17
            r4 = -1
            r5 = 0
            r6 = 1
            goto L_0x00d3
        L_0x033b:
            bdn r0 = new bdn
            java.lang.String r1 = "A style block was found after the first cue."
            r0.<init>(r1)
            throw r0
        L_0x0343:
            bfs r1 = new bfs
            r1.<init>(r0)
            return r1
        L_0x0349:
            r1 = r20
            goto L_0x001a
        L_0x034d:
            r0 = move-exception
            bdn r1 = new bdn
            r1.<init>(r0)
            goto L_0x0355
        L_0x0354:
            throw r1
        L_0x0355:
            goto L_0x0354
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bfq.a(byte[], int, boolean):bdl");
    }
}
