package p000;

import android.util.SparseArray;
import android.util.SparseIntArray;

/* renamed from: asr */
/* compiled from: PG */
final class asr implements ask {

    /* renamed from: a */
    private final bkx f2277a = new bkx(new byte[5]);

    /* renamed from: b */
    private final SparseArray f2278b = new SparseArray();

    /* renamed from: c */
    private final SparseIntArray f2279c = new SparseIntArray();

    /* renamed from: d */
    private final int f2280d;

    /* renamed from: e */
    private final /* synthetic */ ass f2281e;

    public asr(ass ass, int i) {
        this.f2281e = ass;
        this.f2280d = i;
    }

    /* renamed from: a */
    public final void mo1304a(blj blj, aok aok, asw asw) {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: blj} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1303a(p000.bky r26) {
        /*
            r25 = this;
            r0 = r25
            r1 = r26
            int r2 = r26.mo2074d()
            r3 = 2
            if (r2 != r3) goto L_0x02a6
            ass r2 = r0.f2281e
            int r4 = r2.f2282a
            r5 = 0
            r6 = 1
            if (r4 != r6) goto L_0x0014
            goto L_0x0032
        L_0x0014:
            if (r4 == r3) goto L_0x0032
            int r4 = r2.f2289h
            if (r4 == r6) goto L_0x0032
            blj r4 = new blj
            java.util.List r2 = r2.f2283b
            java.lang.Object r2 = r2.get(r5)
            blj r2 = (p000.blj) r2
            long r7 = r2.f4289a
            r4.<init>(r7)
            ass r2 = r0.f2281e
            java.util.List r2 = r2.f2283b
            r2.add(r4)
            goto L_0x003b
        L_0x0032:
            java.util.List r2 = r2.f2283b
            java.lang.Object r2 = r2.get(r5)
            r4 = r2
            blj r4 = (p000.blj) r4
        L_0x003b:
            r1.mo2075d(r3)
            int r2 = r26.mo2076e()
            r7 = 3
            r1.mo2075d(r7)
            bkx r8 = r0.f2277a
            r1.mo2066a(r8, r3)
            bkx r8 = r0.f2277a
            r8.mo2054b(r7)
            ass r8 = r0.f2281e
            bkx r9 = r0.f2277a
            r10 = 13
            int r9 = r9.mo2057c(r10)
            r8.f2292k = r9
            bkx r8 = r0.f2277a
            r1.mo2066a(r8, r3)
            bkx r8 = r0.f2277a
            r9 = 4
            r8.mo2054b(r9)
            bkx r8 = r0.f2277a
            r11 = 12
            int r8 = r8.mo2057c(r11)
            r1.mo2075d(r8)
            ass r8 = r0.f2281e
            int r12 = r8.f2282a
            r13 = 8192(0x2000, float:1.14794E-41)
            r14 = 0
            r15 = 21
            if (r12 == r3) goto L_0x007f
            goto L_0x00a2
        L_0x007f:
            asx r8 = r8.f2291j
            if (r8 != 0) goto L_0x00a2
            asu r8 = new asu
            byte[] r12 = p000.blm.f4298f
            r8.<init>(r15, r14, r14, r12)
            ass r12 = r0.f2281e
            asv r14 = r12.f2284c
            asx r8 = r14.mo1288a(r15, r8)
            r12.f2291j = r8
            ass r8 = r0.f2281e
            asx r12 = r8.f2291j
            aok r8 = r8.f2288g
            asw r14 = new asw
            r14.<init>(r2, r15, r13)
            r12.mo1301a(r4, r8, r14)
        L_0x00a2:
            android.util.SparseArray r8 = r0.f2278b
            r8.clear()
            android.util.SparseIntArray r8 = r0.f2279c
            r8.clear()
            int r8 = r26.mo2070b()
        L_0x00b0:
            if (r8 <= 0) goto L_0x0217
            bkx r14 = r0.f2277a
            r12 = 5
            r1.mo2066a(r14, r12)
            bkx r14 = r0.f2277a
            r6 = 8
            int r6 = r14.mo2057c(r6)
            bkx r14 = r0.f2277a
            r14.mo2054b(r7)
            bkx r14 = r0.f2277a
            int r14 = r14.mo2057c(r10)
            bkx r10 = r0.f2277a
            r10.mo2054b(r9)
            bkx r10 = r0.f2277a
            int r10 = r10.mo2057c(r11)
            int r11 = r1.f4259b
            int r13 = r11 + r10
            r3 = -1
            r17 = 0
            r18 = 0
        L_0x00df:
            int r15 = r1.f4259b
            if (r15 >= r13) goto L_0x01a2
            int r15 = r26.mo2074d()
            int r16 = r26.mo2074d()
            int r5 = r1.f4259b
            int r5 = r5 + r16
            r9 = 89
            r16 = 172(0xac, float:2.41E-43)
            r19 = 135(0x87, float:1.89E-43)
            r20 = 129(0x81, float:1.81E-43)
            if (r15 == r12) goto L_0x0166
            r12 = 106(0x6a, float:1.49E-43)
            if (r15 == r12) goto L_0x0162
            r12 = 122(0x7a, float:1.71E-43)
            if (r15 == r12) goto L_0x015e
            r12 = 127(0x7f, float:1.78E-43)
            if (r15 == r12) goto L_0x014f
            r12 = 123(0x7b, float:1.72E-43)
            if (r15 == r12) goto L_0x014b
            r12 = 10
            if (r15 != r12) goto L_0x011a
            java.lang.String r9 = r1.mo2077e(r7)
            java.lang.String r9 = r9.trim()
            r17 = r9
            r15 = 4
            goto L_0x0192
        L_0x011a:
            if (r15 != r9) goto L_0x0149
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
        L_0x0121:
            int r12 = r1.f4259b
            if (r12 >= r5) goto L_0x0143
            java.lang.String r12 = r1.mo2077e(r7)
            java.lang.String r12 = r12.trim()
            r26.mo2074d()
            r15 = 4
            byte[] r7 = new byte[r15]
            r9 = 0
            r1.mo2069a(r7, r9, r15)
            ast r9 = new ast
            r9.<init>(r12, r7)
            r3.add(r9)
            r7 = 3
            r9 = 89
            goto L_0x0121
        L_0x0143:
            r15 = 4
            r18 = r3
            r3 = 89
            goto L_0x0192
        L_0x0149:
            r15 = 4
            goto L_0x0192
        L_0x014b:
            r15 = 4
            r3 = 138(0x8a, float:1.93E-43)
            goto L_0x0192
        L_0x014f:
            r15 = 4
            int r7 = r26.mo2074d()
            r9 = 21
            if (r7 == r9) goto L_0x015a
            r16 = r3
        L_0x015a:
            r3 = r16
            goto L_0x0192
        L_0x015e:
            r15 = 4
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x0192
        L_0x0162:
            r15 = 4
            r3 = 129(0x81, float:1.81E-43)
            goto L_0x0192
        L_0x0166:
            r15 = 4
            long r21 = r26.mo2081h()
            r23 = 1094921523(0x41432d33, double:5.409631094E-315)
            int r7 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r7 == 0) goto L_0x0190
            r23 = 1161904947(0x45414333, double:5.74057318E-315)
            int r7 = (r21 > r23 ? 1 : (r21 == r23 ? 0 : -1))
            if (r7 == 0) goto L_0x018d
            r19 = 1094921524(0x41432d34, double:5.4096311E-315)
            int r7 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r7 != 0) goto L_0x0183
            r3 = 172(0xac, float:2.41E-43)
            goto L_0x0192
        L_0x0183:
            r19 = 1212503619(0x48455643, double:5.990563836E-315)
            int r7 = (r21 > r19 ? 1 : (r21 == r19 ? 0 : -1))
            if (r7 != 0) goto L_0x0192
            r3 = 36
            goto L_0x0192
        L_0x018d:
            r3 = 135(0x87, float:1.89E-43)
            goto L_0x0192
        L_0x0190:
            r3 = 129(0x81, float:1.81E-43)
        L_0x0192:
            int r7 = r1.f4259b
            int r5 = r5 - r7
            r1.mo2075d(r5)
            r5 = 0
            r7 = 3
            r9 = 4
            r12 = 5
            r15 = 21
            goto L_0x00df
        L_0x01a2:
            r15 = 4
            r1.mo2073c(r13)
            asu r5 = new asu
            byte[] r7 = r1.f4258a
            byte[] r7 = java.util.Arrays.copyOfRange(r7, r11, r13)
            r9 = r17
            r11 = r18
            r5.<init>(r3, r9, r11, r7)
            r3 = 6
            if (r6 != r3) goto L_0x01ba
            int r6 = r5.f2302a
        L_0x01ba:
            int r10 = r10 + 5
            int r8 = r8 - r10
            ass r3 = r0.f2281e
            int r7 = r3.f2282a
            r9 = 2
            if (r7 != r9) goto L_0x01c6
            r7 = r6
            goto L_0x01c7
        L_0x01c6:
            r7 = r14
        L_0x01c7:
            android.util.SparseBooleanArray r3 = r3.f2286e
            boolean r3 = r3.get(r7)
            if (r3 != 0) goto L_0x0206
            ass r3 = r0.f2281e
            int r9 = r3.f2282a
            r10 = 2
            if (r9 == r10) goto L_0x01d9
            r9 = 21
            goto L_0x01e1
        L_0x01d9:
            r9 = 21
            if (r6 != r9) goto L_0x01e1
            asx r3 = r3.f2291j
            goto L_0x01e7
        L_0x01e1:
            asv r3 = r3.f2284c
            asx r3 = r3.mo1288a(r6, r5)
        L_0x01e7:
            ass r5 = r0.f2281e
            int r5 = r5.f2282a
            r6 = 2
            if (r5 == r6) goto L_0x01ef
            goto L_0x01fa
        L_0x01ef:
            android.util.SparseIntArray r5 = r0.f2279c
            r6 = 8192(0x2000, float:1.14794E-41)
            int r5 = r5.get(r7, r6)
            if (r14 < r5) goto L_0x01fa
            goto L_0x0208
        L_0x01fa:
            android.util.SparseIntArray r5 = r0.f2279c
            r5.put(r7, r14)
            android.util.SparseArray r5 = r0.f2278b
            r5.put(r7, r3)
            goto L_0x0208
        L_0x0206:
            r9 = 21
        L_0x0208:
            r3 = 2
            r5 = 0
            r6 = 1
            r7 = 3
            r9 = 4
            r10 = 13
            r11 = 12
            r13 = 8192(0x2000, float:1.14794E-41)
            r15 = 21
            goto L_0x00b0
        L_0x0217:
            android.util.SparseIntArray r1 = r0.f2279c
            int r1 = r1.size()
            r3 = 0
        L_0x021e:
            if (r3 >= r1) goto L_0x0267
            android.util.SparseIntArray r5 = r0.f2279c
            int r5 = r5.keyAt(r3)
            android.util.SparseIntArray r6 = r0.f2279c
            int r6 = r6.valueAt(r3)
            ass r7 = r0.f2281e
            android.util.SparseBooleanArray r7 = r7.f2286e
            r8 = 1
            r7.put(r5, r8)
            ass r7 = r0.f2281e
            android.util.SparseBooleanArray r7 = r7.f2287f
            r7.put(r6, r8)
            android.util.SparseArray r7 = r0.f2278b
            java.lang.Object r7 = r7.valueAt(r3)
            asx r7 = (p000.asx) r7
            if (r7 == 0) goto L_0x0262
            ass r8 = r0.f2281e
            asx r9 = r8.f2291j
            if (r7 == r9) goto L_0x0258
            aok r8 = r8.f2288g
            asw r9 = new asw
            r10 = 8192(0x2000, float:1.14794E-41)
            r9.<init>(r2, r5, r10)
            r7.mo1301a(r4, r8, r9)
            goto L_0x025a
        L_0x0258:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x025a:
            ass r5 = r0.f2281e
            android.util.SparseArray r5 = r5.f2285d
            r5.put(r6, r7)
            goto L_0x0264
        L_0x0262:
            r10 = 8192(0x2000, float:1.14794E-41)
        L_0x0264:
            int r3 = r3 + 1
            goto L_0x021e
        L_0x0267:
            ass r1 = r0.f2281e
            int r2 = r1.f2282a
            r3 = 2
            if (r2 == r3) goto L_0x0293
            android.util.SparseArray r1 = r1.f2285d
            int r2 = r0.f2280d
            r1.remove(r2)
            ass r1 = r0.f2281e
            int r2 = r1.f2282a
            r3 = 1
            if (r2 == r3) goto L_0x0282
            int r2 = r1.f2289h
            r3 = -1
            int r5 = r2 + -1
            goto L_0x0284
        L_0x0282:
            r5 = 0
        L_0x0284:
            r1.f2289h = r5
            if (r5 != 0) goto L_0x02a5
            aok r1 = r1.f2288g
            r1.mo1210S()
            ass r1 = r0.f2281e
            r1.f2290i = true
            return
        L_0x0293:
            boolean r2 = r1.f2290i
            if (r2 != 0) goto L_0x02a5
            aok r1 = r1.f2288g
            r1.mo1210S()
            ass r1 = r0.f2281e
            r2 = 0
            r1.f2289h = r2
            r1.f2290i = true
            return
        L_0x02a5:
            return
        L_0x02a6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.asr.mo1303a(bky):void");
    }
}
