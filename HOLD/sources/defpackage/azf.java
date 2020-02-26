package defpackage;

import java.util.IdentityHashMap;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: azf  reason: default package */
/* compiled from: PG */
final class azf implements aws, axy, ayr {
    private static final Pattern j = Pattern.compile("CC([1-4])=(.+)");
    public final int a;
    public final baa b;
    public final axg c;
    public awr d;
    public ays[] e;
    public azw[] f;
    public bac g;
    public int h;
    public List i;
    private final azb k;
    private final bjf l;
    private final anu m;
    private final bip n;
    private final long o;
    private final biy p;
    private final bhk q;
    private final aye r;
    private final aze[] s;
    private final awl t;
    private final IdentityHashMap u;
    private axz v;
    private boolean w;

    public final aye b() {
        return this.r;
    }

    /* JADX WARN: Type inference failed for: r4v6, types: [java.lang.Object[]] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public azf(int r26, defpackage.bac r27, int r28, defpackage.azb r29, defpackage.bjf r30, defpackage.anu r31, defpackage.bip r32, defpackage.axg r33, long r34, defpackage.biy r36, defpackage.bhk r37, defpackage.awl r38, defpackage.azy r39) {
        /*
            r25 = this;
            r0 = r25
            r1 = r27
            r2 = r37
            r3 = r38
            r25.<init>()
            r4 = r26
            r0.a = r4
            r0.g = r1
            r4 = r28
            r0.h = r4
            r5 = r29
            r0.k = r5
            r5 = r30
            r0.l = r5
            r5 = r31
            r0.m = r5
            r5 = r32
            r0.n = r5
            r5 = r33
            r0.c = r5
            r6 = r34
            r0.o = r6
            r6 = r36
            r0.p = r6
            r0.q = r2
            r0.t = r3
            baa r6 = new baa
            r7 = r39
            r6.<init>(r1, r7, r2)
            r0.b = r6
            r2 = 0
            ays[] r6 = new defpackage.ays[r2]
            r0.e = r6
            azw[] r6 = new defpackage.azw[r2]
            r0.f = r6
            java.util.IdentityHashMap r6 = new java.util.IdentityHashMap
            r6.<init>()
            r0.u = r6
            ays[] r6 = r0.e
            axz r3 = r3.a(r6)
            r0.v = r3
            bah r1 = r27.a(r28)
            java.util.List r3 = r1.d
            r0.i = r3
            java.util.List r1 = r1.c
            java.util.List r3 = r0.i
            int r4 = r1.size()
            android.util.SparseIntArray r6 = new android.util.SparseIntArray
            r6.<init>(r4)
            r7 = 0
        L_0x006c:
            if (r7 >= r4) goto L_0x007c
            java.lang.Object r8 = r1.get(r7)
            bab r8 = (defpackage.bab) r8
            int r8 = r8.a
            r6.put(r8, r7)
            int r7 = r7 + 1
            goto L_0x006c
        L_0x007c:
            int[][] r7 = new int[r4][]
            boolean[] r8 = new boolean[r4]
            r9 = 0
            r10 = 0
        L_0x0082:
            if (r9 < r4) goto L_0x02d8
            if (r10 >= r4) goto L_0x008e
            java.lang.Object[] r4 = java.util.Arrays.copyOf(r7, r10)
            r7 = r4
            int[][] r7 = (int[][]) r7
            goto L_0x008f
        L_0x008e:
        L_0x008f:
            r13 = r7
            int r14 = r13.length
            boolean[] r15 = new boolean[r14]
            akh[][] r4 = new defpackage.akh[r14][]
            r6 = 0
            r7 = 0
        L_0x0097:
            if (r6 < r14) goto L_0x0204
            int r7 = r7 + r14
            int r6 = r3.size()
            int r7 = r7 + r6
            ayc[] r6 = new defpackage.ayc[r7]
            aze[] r7 = new defpackage.aze[r7]
            r8 = 0
            r9 = 0
        L_0x00a5:
            java.lang.String r10 = "application/x-emsg"
            if (r8 >= r14) goto L_0x01ab
            r12 = r13[r8]
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            int r2 = r12.length
            r5 = 0
        L_0x00b2:
            if (r5 >= r2) goto L_0x00c8
            r16 = r2
            r2 = r12[r5]
            java.lang.Object r2 = r1.get(r2)
            bab r2 = (defpackage.bab) r2
            java.util.List r2 = r2.c
            r11.addAll(r2)
            int r5 = r5 + 1
            r2 = r16
            goto L_0x00b2
        L_0x00c8:
            int r2 = r11.size()
            akh[] r5 = new defpackage.akh[r2]
            r28 = r14
            r14 = 0
        L_0x00d1:
            if (r14 >= r2) goto L_0x00f3
            java.lang.Object r16 = r11.get(r14)
            r30 = r2
            r2 = r16
            bam r2 = (defpackage.bam) r2
            akh r2 = r2.a
            r31 = r11
            anq r11 = r2.l
            if (r11 != 0) goto L_0x00e6
            goto L_0x00ea
        L_0x00e6:
            akh r2 = r2.b()
        L_0x00ea:
            r5[r14] = r2
            int r14 = r14 + 1
            r2 = r30
            r11 = r31
            goto L_0x00d1
        L_0x00f3:
            r2 = 0
            r11 = r12[r2]
            java.lang.Object r2 = r1.get(r11)
            bab r2 = (defpackage.bab) r2
            int r11 = r9 + 1
            boolean r14 = r15[r8]
            if (r14 == 0) goto L_0x010b
            int r14 = r11 + 1
            r24 = r14
            r14 = r11
            r11 = r24
            goto L_0x010c
        L_0x010b:
            r14 = -1
        L_0x010c:
            r30 = r15
            r15 = r4[r8]
            int r15 = r15.length
            if (r15 == 0) goto L_0x0116
            int r15 = r11 + 1
            goto L_0x0118
        L_0x0116:
            r15 = r11
            r11 = -1
        L_0x0118:
            r31 = r15
            ayc r15 = new ayc
            r15.<init>(r5)
            r6[r9] = r15
            int r5 = r2.b
            aze r15 = new aze
            r18 = 0
            r23 = -1
            r16 = r15
            r17 = r5
            r19 = r12
            r20 = r9
            r21 = r14
            r22 = r11
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7[r9] = r15
            r5 = -1
            if (r14 == r5) goto L_0x017a
            int r2 = r2.a
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r15 = 16
            r5.<init>(r15)
            r5.append(r2)
            java.lang.String r2 = ":emsg"
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            akh r2 = defpackage.akh.a(r2, r10)
            ayc r5 = new ayc
            r10 = 1
            akh[] r15 = new defpackage.akh[r10]
            r10 = 0
            r15[r10] = r2
            r5.<init>(r15)
            r6[r14] = r5
            aze r2 = new aze
            r17 = 4
            r18 = 1
            r21 = -1
            r22 = -1
            r23 = -1
            r16 = r2
            r19 = r12
            r20 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7[r14] = r2
        L_0x017a:
            r2 = -1
            if (r11 == r2) goto L_0x019d
            ayc r2 = new ayc
            r5 = r4[r8]
            r2.<init>(r5)
            r6[r11] = r2
            aze r2 = new aze
            r17 = 3
            r18 = 1
            r21 = -1
            r22 = -1
            r23 = -1
            r16 = r2
            r19 = r12
            r20 = r9
            r16.<init>(r17, r18, r19, r20, r21, r22, r23)
            r7[r11] = r2
        L_0x019d:
            int r8 = r8 + 1
            r14 = r28
            r15 = r30
            r9 = r31
            r5 = r33
            r2 = 0
            goto L_0x00a5
        L_0x01ab:
            r1 = 0
        L_0x01ac:
            int r2 = r3.size()
            if (r1 >= r2) goto L_0x01eb
            java.lang.Object r2 = r3.get(r1)
            bag r2 = (defpackage.bag) r2
            java.lang.String r2 = r2.a()
            akh r2 = defpackage.akh.a(r2, r10)
            ayc r4 = new ayc
            r5 = 1
            akh[] r8 = new defpackage.akh[r5]
            r5 = 0
            r8[r5] = r2
            r4.<init>(r8)
            r6[r9] = r4
            int r2 = r9 + 1
            aze r4 = new aze
            r15 = 4
            r16 = 2
            int[] r8 = new int[r5]
            r18 = -1
            r19 = -1
            r20 = -1
            r14 = r4
            r17 = r8
            r21 = r1
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)
            r7[r9] = r4
            int r1 = r1 + 1
            r9 = r2
            goto L_0x01ac
        L_0x01eb:
            aye r1 = new aye
            r1.<init>(r6)
            android.util.Pair r1 = android.util.Pair.create(r1, r7)
            java.lang.Object r2 = r1.first
            aye r2 = (defpackage.aye) r2
            r0.r = r2
            java.lang.Object r1 = r1.second
            aze[] r1 = (defpackage.aze[]) r1
            r0.s = r1
            r33.a()
            return
        L_0x0204:
            r28 = r14
            r30 = r15
            r2 = r13[r6]
            int r5 = r2.length
            r8 = 0
        L_0x020c:
            if (r8 >= r5) goto L_0x023a
            r9 = r2[r8]
            java.lang.Object r9 = r1.get(r9)
            bab r9 = (defpackage.bab) r9
            java.util.List r9 = r9.c
            r10 = 0
        L_0x0219:
            int r11 = r9.size()
            if (r10 >= r11) goto L_0x0237
            java.lang.Object r11 = r9.get(r10)
            bam r11 = (defpackage.bam) r11
            java.util.List r11 = r11.d
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto L_0x0230
            int r10 = r10 + 1
            goto L_0x0219
        L_0x0230:
            r2 = 1
            r30[r6] = r2
            int r7 = r7 + 1
            goto L_0x023a
        L_0x0237:
            int r8 = r8 + 1
            goto L_0x020c
        L_0x023a:
            r2 = r13[r6]
            int r5 = r2.length
            r8 = 0
        L_0x023e:
            if (r8 >= r5) goto L_0x02c2
            r9 = r2[r8]
            java.lang.Object r10 = r1.get(r9)
            bab r10 = (defpackage.bab) r10
            java.lang.Object r9 = r1.get(r9)
            bab r9 = (defpackage.bab) r9
            java.util.List r9 = r9.d
            r11 = 0
        L_0x0251:
            int r12 = r9.size()
            if (r11 >= r12) goto L_0x02be
            java.lang.Object r12 = r9.get(r11)
            baf r12 = (defpackage.baf) r12
            java.lang.String r14 = r12.a
            java.lang.String r15 = "urn:scte:dash:cc:cea-608:2015"
            boolean r14 = r15.equals(r14)
            if (r14 != 0) goto L_0x026a
            int r11 = r11 + 1
            goto L_0x0251
        L_0x026a:
            java.lang.String r2 = r12.b
            if (r2 != 0) goto L_0x027b
            r2 = 1
            akh[] r5 = new defpackage.akh[r2]
            int r2 = r10.a
            akh r2 = a(r2)
            r8 = 0
            r5[r8] = r2
            goto L_0x02c5
        L_0x027b:
            java.lang.String r5 = ";"
            java.lang.String[] r2 = defpackage.blm.a(r2, r5)
            int r5 = r2.length
            akh[] r5 = new defpackage.akh[r5]
            r8 = 0
        L_0x0286:
            int r9 = r2.length
            if (r8 >= r9) goto L_0x02bd
            java.util.regex.Pattern r9 = defpackage.azf.j
            r11 = r2[r8]
            java.util.regex.Matcher r9 = r9.matcher(r11)
            boolean r11 = r9.matches()
            if (r11 != 0) goto L_0x02a4
            r2 = 1
            akh[] r5 = new defpackage.akh[r2]
            int r2 = r10.a
            akh r2 = a(r2)
            r8 = 0
            r5[r8] = r2
            goto L_0x02c5
        L_0x02a4:
            int r11 = r10.a
            r12 = 2
            java.lang.String r12 = r9.group(r12)
            r14 = 1
            java.lang.String r9 = r9.group(r14)
            int r9 = java.lang.Integer.parseInt(r9)
            akh r9 = a(r11, r12, r9)
            r5[r8] = r9
            int r8 = r8 + 1
            goto L_0x0286
        L_0x02bd:
            goto L_0x02c5
        L_0x02be:
            int r8 = r8 + 1
            goto L_0x023e
        L_0x02c2:
            r2 = 0
            akh[] r5 = new defpackage.akh[r2]
        L_0x02c5:
            r4[r6] = r5
            int r2 = r5.length
            if (r2 != 0) goto L_0x02cb
            goto L_0x02cd
        L_0x02cb:
            int r7 = r7 + 1
        L_0x02cd:
            int r6 = r6 + 1
            r14 = r28
            r15 = r30
            r5 = r33
            r2 = 0
            goto L_0x0097
        L_0x02d8:
            boolean r2 = r8[r9]
            if (r2 != 0) goto L_0x0350
            r2 = 1
            r8[r9] = r2
            java.lang.Object r2 = r1.get(r9)
            bab r2 = (defpackage.bab) r2
            java.util.List r2 = r2.e
            r5 = 0
        L_0x02e8:
            int r11 = r2.size()
            if (r5 >= r11) goto L_0x0301
            java.lang.Object r11 = r2.get(r5)
            baf r11 = (defpackage.baf) r11
            java.lang.String r12 = r11.a
            java.lang.String r13 = "urn:mpeg:dash:adaptation-set-switching:2016"
            boolean r12 = r13.equals(r12)
            if (r12 != 0) goto L_0x0303
            int r5 = r5 + 1
            goto L_0x02e8
        L_0x0301:
            r11 = 0
        L_0x0303:
            if (r11 == 0) goto L_0x0342
            java.lang.String r2 = r11.b
            java.lang.String r5 = ","
            java.lang.String[] r2 = defpackage.blm.a(r2, r5)
            int r5 = r2.length
            int r11 = r5 + 1
            int[] r12 = new int[r11]
            r13 = 0
            r12[r13] = r9
            r13 = 0
            r14 = 1
        L_0x0317:
            if (r13 >= r5) goto L_0x0333
            r15 = r2[r13]
            int r15 = java.lang.Integer.parseInt(r15)
            r0 = -1
            int r15 = r6.get(r15, r0)
            if (r15 == r0) goto L_0x032e
            r16 = 1
            r8[r15] = r16
            r12[r14] = r15
            int r14 = r14 + 1
        L_0x032e:
            int r13 = r13 + 1
            r0 = r25
            goto L_0x0317
        L_0x0333:
            if (r14 >= r11) goto L_0x033a
            int[] r12 = java.util.Arrays.copyOf(r12, r14)
            goto L_0x033b
        L_0x033a:
        L_0x033b:
            int r0 = r10 + 1
            r7[r10] = r12
            r10 = r0
            r5 = 0
            goto L_0x0351
        L_0x0342:
            int r0 = r10 + 1
            r2 = 1
            int[] r2 = new int[r2]
            r5 = 0
            r2[r5] = r9
            r7[r10] = r2
            r10 = r0
            goto L_0x0351
        L_0x0350:
            r5 = 0
        L_0x0351:
            int r9 = r9 + 1
            r0 = r25
            r5 = r33
            r2 = 0
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azf.<init>(int, bac, int, azb, bjf, anu, bip, axg, long, biy, bhk, awl, azy):void");
    }

    private static akh a(int i2) {
        return a(i2, null, -1);
    }

    private static akh a(int i2, String str, int i3) {
        String str2;
        if (i3 != -1) {
            StringBuilder sb = new StringBuilder(12);
            sb.append(":");
            sb.append(i3);
            str2 = sb.toString();
        } else {
            str2 = "";
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 18);
        sb2.append(i2);
        sb2.append(":cea608");
        sb2.append(str2);
        return akh.a(sb2.toString(), "application/cea-608", 0, str, i3, (anq) null, Long.MAX_VALUE, (List) null);
    }

    public final boolean c(long j2) {
        return this.v.c(j2);
    }

    public final void d(long j2) {
        for (ays d2 : this.e) {
            d2.d(j2);
        }
    }

    public final long a(long j2, alb alb) {
        for (ays ays : this.e) {
            if (ays.a == 2) {
                return ays.a(j2, alb);
            }
        }
        return j2;
    }

    public final long d() {
        return this.v.d();
    }

    public final long e() {
        return this.v.e();
    }

    private final int a(int i2, int[] iArr) {
        int i3 = iArr[i2];
        if (i3 != -1) {
            int i4 = this.s[i3].e;
            for (int i5 = 0; i5 < iArr.length; i5++) {
                int i6 = iArr[i5];
                if (i6 == i4 && this.s[i6].c == 0) {
                    return i5;
                }
            }
        }
        return -1;
    }

    public final boolean f() {
        return this.v.f();
    }

    public final void a() {
        this.p.a();
    }

    public final /* bridge */ /* synthetic */ void a(axz axz) {
        this.d.a((axz) this);
    }

    public final synchronized void a(ays ays) {
        azz azz = (azz) this.u.remove(ays);
        if (azz != null) {
            azz.a.a();
        }
    }

    public final void a(awr awr, long j2) {
        this.d = awr;
        awr.a((aws) this);
    }

    public final long c() {
        if (this.w) {
            return -9223372036854775807L;
        }
        this.c.c();
        this.w = true;
        return -9223372036854775807L;
    }

    public final void g(long j2) {
        this.v.g(j2);
    }

    public final long b(long j2) {
        for (ays b2 : this.e) {
            b2.b(j2);
        }
        for (azw b3 : this.f) {
            b3.b(j2);
        }
        return j2;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0183  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c2 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long a(defpackage.bgl[] r34, boolean[] r35, defpackage.axx[] r36, boolean[] r37, long r38) {
        /*
            r33 = this;
            r13 = r33
            r0 = r34
            r14 = r36
            r11 = r38
            int r1 = r0.length
            int[] r15 = new int[r1]
            r10 = 0
            r1 = 0
        L_0x000d:
            int r2 = r0.length
            r8 = -1
            if (r1 >= r2) goto L_0x0028
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0022
            aye r3 = r13.r
            ayc r2 = r2.e()
            int r2 = r3.a(r2)
            r15[r1] = r2
            goto L_0x0025
        L_0x0022:
            r15[r1] = r8
        L_0x0025:
            int r1 = r1 + 1
            goto L_0x000d
        L_0x0028:
            r1 = 0
        L_0x0029:
            int r2 = r0.length
            r16 = 0
            if (r1 >= r2) goto L_0x0051
            r2 = r0[r1]
            if (r2 == 0) goto L_0x0036
            boolean r2 = r35[r1]
            if (r2 != 0) goto L_0x004e
        L_0x0036:
            r2 = r14[r1]
            boolean r3 = r2 instanceof defpackage.ays
            if (r3 == 0) goto L_0x0042
            ays r2 = (defpackage.ays) r2
            r2.a(r13)
            goto L_0x004b
        L_0x0042:
            boolean r3 = r2 instanceof defpackage.ayq
            if (r3 == 0) goto L_0x004b
            ayq r2 = (defpackage.ayq) r2
            r2.c()
        L_0x004b:
            r14[r1] = r16
        L_0x004e:
            int r1 = r1 + 1
            goto L_0x0029
        L_0x0051:
            r1 = 0
        L_0x0052:
            int r2 = r0.length
            if (r1 >= r2) goto L_0x008c
            r2 = r14[r1]
            boolean r3 = r2 instanceof defpackage.awn
            if (r3 != 0) goto L_0x0060
            boolean r2 = r2 instanceof defpackage.ayq
            if (r2 != 0) goto L_0x0060
            goto L_0x0089
        L_0x0060:
            int r2 = r13.a(r1, r15)
            if (r2 != r8) goto L_0x006d
            r2 = r14[r1]
            boolean r2 = r2 instanceof defpackage.awn
            if (r2 != 0) goto L_0x0089
            goto L_0x007b
        L_0x006d:
            r3 = r14[r1]
            boolean r4 = r3 instanceof defpackage.ayq
            if (r4 == 0) goto L_0x007b
            ayq r3 = (defpackage.ayq) r3
            ays r3 = r3.a
            r2 = r14[r2]
            if (r3 == r2) goto L_0x0089
        L_0x007b:
            r2 = r14[r1]
            boolean r3 = r2 instanceof defpackage.ayq
            if (r3 == 0) goto L_0x0086
            ayq r2 = (defpackage.ayq) r2
            r2.c()
        L_0x0086:
            r14[r1] = r16
        L_0x0089:
            int r1 = r1 + 1
            goto L_0x0052
        L_0x008c:
            r9 = 0
        L_0x008d:
            int r1 = r0.length
            r2 = 1
            if (r9 >= r1) goto L_0x01f1
            r1 = r0[r9]
            if (r1 != 0) goto L_0x009e
            r17 = r9
            r0 = r14
            r32 = r15
            r18 = 0
            goto L_0x01e4
        L_0x009e:
            r3 = r14[r9]
            if (r3 != 0) goto L_0x01d0
            r37[r9] = r2
            r3 = r15[r9]
            aze[] r4 = r13.s
            r3 = r4[r3]
            int r4 = r3.c
            if (r4 == 0) goto L_0x00e0
            r2 = 2
            if (r4 != r2) goto L_0x00d7
            java.util.List r2 = r13.i
            int r3 = r3.d
            java.lang.Object r2 = r2.get(r3)
            bag r2 = (defpackage.bag) r2
            ayc r1 = r1.e()
            akh r1 = r1.a(r10)
            azw r3 = new azw
            bac r4 = r13.g
            boolean r4 = r4.c
            r3.<init>(r2, r1, r4)
            r14[r9] = r3
            r17 = r9
            r0 = r14
            r32 = r15
            r18 = 0
            goto L_0x01e4
        L_0x00d7:
            r17 = r9
            r0 = r14
            r32 = r15
            r18 = 0
            goto L_0x01e4
        L_0x00e0:
            int r4 = r3.f
            if (r4 == r8) goto L_0x00e7
            r27 = 1
            goto L_0x00ea
        L_0x00e7:
            r27 = 0
        L_0x00ea:
            if (r27 == 0) goto L_0x00f5
            aye r5 = r13.r
            ayc r4 = r5.a(r4)
            r5 = r4
            r4 = 1
            goto L_0x00f9
        L_0x00f5:
            r5 = r16
            r4 = 0
        L_0x00f9:
            int r6 = r3.g
            if (r6 == r8) goto L_0x0107
            aye r7 = r13.r
            ayc r7 = r7.a(r6)
            int r2 = r7.a
            int r4 = r4 + r2
            goto L_0x010a
        L_0x0107:
            r7 = r16
        L_0x010a:
            akh[] r2 = new defpackage.akh[r4]
            int[] r4 = new int[r4]
            if (r27 == 0) goto L_0x011b
            akh r5 = r5.a(r10)
            r2[r10] = r5
            r5 = 4
            r4[r10] = r5
            r5 = 1
            goto L_0x011d
        L_0x011b:
            r5 = 0
        L_0x011d:
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r6 != r8) goto L_0x0125
            goto L_0x013f
        L_0x0125:
            r6 = r5
            r5 = 0
        L_0x0128:
            int r8 = r7.a
            if (r5 >= r8) goto L_0x013f
            akh r8 = r7.a(r5)
            r2[r6] = r8
            r17 = 3
            r4[r6] = r17
            r10.add(r8)
            r8 = 1
            int r6 = r6 + r8
            int r5 = r5 + 1
            r8 = -1
            goto L_0x0128
        L_0x013f:
            bac r5 = r13.g
            boolean r5 = r5.c
            if (r5 != 0) goto L_0x014a
            r30 = r2
        L_0x0147:
            r8 = r16
            goto L_0x0164
        L_0x014a:
            if (r27 == 0) goto L_0x0161
            baa r5 = r13.b
            azz r6 = new azz
            axw r7 = new axw
            bhk r8 = r5.a
            r30 = r2
            anu r2 = defpackage.anu.a
            r7.<init>(r8, r2)
            r6.<init>(r5, r7)
            r8 = r6
            goto L_0x0164
        L_0x0161:
            r30 = r2
            goto L_0x0147
        L_0x0164:
            azb r2 = r13.k
            biy r5 = r13.p
            bac r6 = r13.g
            int r7 = r13.h
            r31 = r9
            int[] r9 = r3.a
            int r11 = r3.b
            r32 = r15
            long r14 = r13.o
            bjf r12 = r13.l
            azt r2 = (defpackage.azt) r2
            bhu r2 = r2.a
            bhv r2 = r2.a()
            if (r12 != 0) goto L_0x0183
            goto L_0x0186
        L_0x0183:
            r2.a(r12)
        L_0x0186:
            azv r12 = new azv
            r17 = r12
            r18 = r5
            r19 = r6
            r20 = r7
            r21 = r9
            r22 = r1
            r23 = r11
            r24 = r2
            r25 = r14
            r28 = r10
            r29 = r8
            r17.<init>(r18, r19, r20, r21, r22, r23, r24, r25, r27, r28, r29)
            ays r14 = new ays
            int r2 = r3.b
            bhk r7 = r13.q
            anu r10 = r13.m
            bip r11 = r13.n
            axg r15 = r13.c
            r1 = r14
            r5 = r30
            r3 = r4
            r4 = r5
            r5 = r12
            r6 = r33
            r12 = r8
            r17 = r31
            r8 = r38
            r18 = 0
            r0 = r12
            r12 = r15
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r10, r11, r12)
            monitor-enter(r33)
            java.util.IdentityHashMap r1 = r13.u     // Catch:{ all -> 0x01cd }
            r1.put(r14, r0)     // Catch:{ all -> 0x01cd }
            monitor-exit(r33)     // Catch:{ all -> 0x01cd }
            r0 = r36
            r0[r17] = r14
            goto L_0x01e4
        L_0x01cd:
            r0 = move-exception
            monitor-exit(r33)     // Catch:{ all -> 0x01cd }
            throw r0
        L_0x01d0:
            r17 = r9
            r0 = r14
            r32 = r15
            r18 = 0
            boolean r2 = r3 instanceof defpackage.ays
            if (r2 == 0) goto L_0x01e4
            ays r3 = (defpackage.ays) r3
            ayt r2 = r3.e
            azc r2 = (defpackage.azc) r2
            r2.a(r1)
        L_0x01e4:
            int r9 = r17 + 1
            r11 = r38
            r14 = r0
            r15 = r32
            r8 = -1
            r10 = 0
            r0 = r34
            goto L_0x008d
        L_0x01f1:
            r0 = r14
            r32 = r15
            r18 = 0
            r1 = 0
        L_0x01f7:
            r2 = r34
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0285
            r3 = r0[r1]
            if (r3 == 0) goto L_0x0208
            r9 = r38
            r4 = r32
            r6 = -1
            r8 = 1
            goto L_0x027f
        L_0x0208:
            r3 = r2[r1]
            if (r3 == 0) goto L_0x0279
            r3 = r32[r1]
            aze[] r4 = r13.s
            r3 = r4[r3]
            int r4 = r3.c
            r5 = 1
            if (r4 != r5) goto L_0x0272
            r4 = r32
            int r5 = r13.a(r1, r4)
            r6 = -1
            if (r5 != r6) goto L_0x022b
            awn r3 = new awn
            r3.<init>()
            r0[r1] = r3
            r9 = r38
            r8 = 1
            goto L_0x027f
        L_0x022b:
            r5 = r0[r5]
            ays r5 = (defpackage.ays) r5
            int r3 = r3.b
            r7 = 0
        L_0x0232:
            axw[] r8 = r5.g
            int r8 = r8.length
            if (r7 >= r8) goto L_0x026c
            int[] r8 = r5.b
            r8 = r8[r7]
            if (r8 != r3) goto L_0x0266
            boolean[] r3 = r5.d
            boolean r3 = r3[r7]
            r8 = 1
            r3 = r3 ^ r8
            defpackage.bks.b(r3)
            boolean[] r3 = r5.d
            r3[r7] = r8
            axw[] r3 = r5.g
            r3 = r3[r7]
            r3.i()
            axw[] r3 = r5.g
            r3 = r3[r7]
            r9 = r38
            r3.a(r9, r8)
            ayq r3 = new ayq
            axw[] r11 = r5.g
            r11 = r11[r7]
            r3.<init>(r5, r5, r11, r7)
            r0[r1] = r3
            goto L_0x027f
        L_0x0266:
            r9 = r38
            r8 = 1
            int r7 = r7 + 1
            goto L_0x0232
        L_0x026c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0272:
            r9 = r38
            r4 = r32
            r6 = -1
            r8 = 1
            goto L_0x027f
        L_0x0279:
            r9 = r38
            r4 = r32
            r6 = -1
            r8 = 1
        L_0x027f:
            int r1 = r1 + 1
            r32 = r4
            goto L_0x01f7
        L_0x0285:
            r9 = r38
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            int r3 = r0.length
            r4 = 0
        L_0x0293:
            if (r4 >= r3) goto L_0x02ad
            r5 = r0[r4]
            boolean r6 = r5 instanceof defpackage.ays
            if (r6 == 0) goto L_0x02a1
            ays r5 = (defpackage.ays) r5
            r1.add(r5)
            goto L_0x02aa
        L_0x02a1:
            boolean r6 = r5 instanceof defpackage.azw
            if (r6 == 0) goto L_0x02aa
            azw r5 = (defpackage.azw) r5
            r2.add(r5)
        L_0x02aa:
            int r4 = r4 + 1
            goto L_0x0293
        L_0x02ad:
            int r0 = r1.size()
            ays[] r0 = new defpackage.ays[r0]
            r13.e = r0
            r1.toArray(r0)
            int r0 = r2.size()
            azw[] r0 = new defpackage.azw[r0]
            r13.f = r0
            r2.toArray(r0)
            awl r0 = r13.t
            ays[] r1 = r13.e
            axz r0 = r0.a(r1)
            r13.v = r0
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.azf.a(bgl[], boolean[], axx[], boolean[], long):long");
    }
}
