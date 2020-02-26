package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vs  reason: default package */
/* compiled from: PG */
public final class vs implements Runnable, Comparable, vk, aik {
    private volatile boolean A;
    private int B;
    private int C;
    public final vm a = new vm();
    public final vq b;
    public final vr c = new vr();
    public sl d;
    public ts e;
    public sm f;
    public wm g;
    public int h;
    public int i;
    public vy j;
    public tx k;
    public vn l;
    public int m;
    public boolean n;
    public volatile vl o;
    public volatile boolean p;
    public int q;
    private final List r = new ArrayList();
    private final ain s = ain.a();
    private final cz t;
    private final vp u = new vp();
    private Thread v;
    private ts w;
    private ts x;
    private Object y;
    private ug z;

    public vs(vq vqVar, cz czVar) {
        this.b = vqVar;
        this.t = czVar;
    }

    public final ain P() {
        return this.s;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        vs vsVar = (vs) obj;
        int d2 = d() - vsVar.d();
        return d2 == 0 ? this.m - vsVar.m : d2;
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:53:0x011d */
    /* JADX WARN: Failed to insert an additional move for type inference into block B:36:0x00c5 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r0v78, types: [ww] */
    /* JADX WARN: Type inference failed for: r1v18, types: [ts] */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type inference failed for: r17v10 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x0203 A[LOOP:0: B:24:0x007a->B:104:0x0203, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:107:0x0216 A[SYNTHETIC, Splitter:B:107:0x0216] */
    /* JADX WARNING: Removed duplicated region for block: B:113:0x0222 A[SYNTHETIC, Splitter:B:113:0x0222] */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x0212 A[EDGE_INSN: B:200:0x0212->B:105:0x0212 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x007c A[Catch:{ all -> 0x022f, all -> 0x0236 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void i() {
        /*
            r32 = this;
            r1 = r32
            ug r4 = r1.z     // Catch:{ wq -> 0x0248 }
            java.lang.Object r0 = r1.y     // Catch:{ wq -> 0x0248 }
            int r5 = r1.C     // Catch:{ wq -> 0x0248 }
            if (r0 == 0) goto L_0x0240
            defpackage.ahy.a()     // Catch:{ all -> 0x023b }
            vm r6 = r1.a     // Catch:{ all -> 0x023b }
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x023b }
            wt r6 = r6.b(r7)     // Catch:{ all -> 0x023b }
            tx r7 = r1.k     // Catch:{ all -> 0x023b }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x023b }
            r8 = 4
            if (r5 == r8) goto L_0x0027
            vm r10 = r1.a     // Catch:{ all -> 0x023b }
            boolean r10 = r10.r     // Catch:{ all -> 0x023b }
            if (r10 != 0) goto L_0x0026
            r10 = 0
            goto L_0x0028
        L_0x0026:
        L_0x0027:
            r10 = 1
        L_0x0028:
            tw r11 = defpackage.acx.a     // Catch:{ all -> 0x023b }
            java.lang.Object r11 = r7.a(r11)     // Catch:{ all -> 0x023b }
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch:{ all -> 0x023b }
            if (r11 != 0) goto L_0x0033
            goto L_0x003c
        L_0x0033:
            boolean r11 = r11.booleanValue()     // Catch:{ all -> 0x023b }
            if (r11 == 0) goto L_0x004f
            if (r10 == 0) goto L_0x003c
            goto L_0x004f
        L_0x003c:
            tx r7 = new tx     // Catch:{ all -> 0x023b }
            r7.<init>()     // Catch:{ all -> 0x023b }
            tx r11 = r1.k     // Catch:{ all -> 0x023b }
            r7.a(r11)     // Catch:{ all -> 0x023b }
            tw r11 = defpackage.acx.a     // Catch:{ all -> 0x023b }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x023b }
            r7.a(r11, r10)     // Catch:{ all -> 0x023b }
        L_0x004f:
            sl r10 = r1.d     // Catch:{ all -> 0x023b }
            ss r10 = r10.c     // Catch:{ all -> 0x023b }
            ul r10 = r10.e     // Catch:{ all -> 0x023b }
            ui r10 = r10.a(r0)     // Catch:{ all -> 0x023b }
            int r11 = r1.h     // Catch:{ all -> 0x0236 }
            int r15 = r1.i     // Catch:{ all -> 0x0236 }
            vo r14 = new vo     // Catch:{ all -> 0x0236 }
            r14.<init>(r1, r5)     // Catch:{ all -> 0x0236 }
            cz r0 = r6.a     // Catch:{ all -> 0x0236 }
            java.lang.Object r0 = r0.a()     // Catch:{ all -> 0x0236 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0236 }
            java.lang.Object r0 = defpackage.aic.a(r0)     // Catch:{ all -> 0x0236 }
            r5 = r0
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0236 }
            java.util.List r0 = r6.b     // Catch:{ all -> 0x022f }
            int r13 = r0.size()     // Catch:{ all -> 0x022f }
            r12 = 0
            r18 = 0
        L_0x007a:
            if (r12 >= r13) goto L_0x0212
            java.util.List r0 = r6.b     // Catch:{ all -> 0x022f }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x022f }
            r9 = r0
            vt r9 = (defpackage.vt) r9     // Catch:{ all -> 0x022f }
            cz r0 = r9.b     // Catch:{ wq -> 0x01f2 }
            java.lang.Object r0 = r0.a()     // Catch:{ wq -> 0x01f2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ wq -> 0x01f2 }
            java.lang.Object r0 = defpackage.aic.a(r0)     // Catch:{ wq -> 0x01f2 }
            r2 = r0
            java.util.List r2 = (java.util.List) r2     // Catch:{ wq -> 0x01f2 }
            r19 = r12
            r12 = r9
            r20 = r13
            r13 = r10
            r3 = r14
            r14 = r11
            r21 = r15
            r16 = r7
            r17 = r2
            ww r0 = r12.a(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01e4 }
            cz r12 = r9.b     // Catch:{ wq -> 0x01de }
            r12.a(r2)     // Catch:{ wq -> 0x01de }
            vs r2 = r3.a     // Catch:{ wq -> 0x01de }
            int r12 = r3.b     // Catch:{ wq -> 0x01de }
            java.lang.Object r13 = r0.b()     // Catch:{ wq -> 0x01de }
            java.lang.Class r13 = r13.getClass()     // Catch:{ wq -> 0x01de }
            if (r12 == r8) goto L_0x00ce
            vm r14 = r2.a     // Catch:{ wq -> 0x01de }
            ub r14 = r14.c(r13)     // Catch:{ wq -> 0x01de }
            sl r15 = r2.d     // Catch:{ wq -> 0x01de }
            int r8 = r2.h     // Catch:{ wq -> 0x01de }
            r17 = r3
            int r3 = r2.i     // Catch:{ wq -> 0x01dc }
            ww r3 = r14.a(r15, r0, r8, r3)     // Catch:{ wq -> 0x01dc }
            r28 = r14
            goto L_0x00d3
        L_0x00ce:
            r17 = r3
            r3 = r0
            r28 = 0
        L_0x00d3:
            boolean r8 = r0.equals(r3)     // Catch:{ wq -> 0x01dc }
            if (r8 == 0) goto L_0x00da
            goto L_0x00dd
        L_0x00da:
            r0.d()     // Catch:{ wq -> 0x01dc }
        L_0x00dd:
            vm r0 = r2.a     // Catch:{ wq -> 0x01dc }
            sl r0 = r0.c     // Catch:{ wq -> 0x01dc }
            ss r0 = r0.c     // Catch:{ wq -> 0x01dc }
            agi r0 = r0.d     // Catch:{ wq -> 0x01dc }
            java.lang.Class r8 = r3.a()     // Catch:{ wq -> 0x01dc }
            ua r0 = r0.a(r8)     // Catch:{ wq -> 0x01dc }
            if (r0 == 0) goto L_0x0110
            vm r0 = r2.a     // Catch:{ wq -> 0x01dc }
            sl r0 = r0.c     // Catch:{ wq -> 0x01dc }
            ss r0 = r0.c     // Catch:{ wq -> 0x01dc }
            agi r0 = r0.d     // Catch:{ wq -> 0x01dc }
            java.lang.Class r14 = r3.a()     // Catch:{ wq -> 0x01dc }
            ua r0 = r0.a(r14)     // Catch:{ wq -> 0x01dc }
            if (r0 == 0) goto L_0x0106
            int r14 = r0.a()     // Catch:{ wq -> 0x01dc }
            goto L_0x0113
        L_0x0106:
            sq r0 = new sq     // Catch:{ wq -> 0x01dc }
            java.lang.Class r2 = r3.a()     // Catch:{ wq -> 0x01dc }
            r0.<init>(r2)     // Catch:{ wq -> 0x01dc }
            throw r0     // Catch:{ wq -> 0x01dc }
        L_0x0110:
            r0 = 0
            r14 = 3
        L_0x0113:
            vm r15 = r2.a     // Catch:{ wq -> 0x01dc }
            ts r8 = r2.w     // Catch:{ wq -> 0x01dc }
            java.util.List r15 = r15.c()     // Catch:{ wq -> 0x01dc }
            r31 = r11
            int r11 = r15.size()     // Catch:{ wq -> 0x01f0 }
            r1 = 0
        L_0x0122:
            if (r1 >= r11) goto L_0x013d
            java.lang.Object r23 = r15.get(r1)     // Catch:{ wq -> 0x01f0 }
            r24 = r11
            r11 = r23
            aai r11 = (defpackage.aai) r11     // Catch:{ wq -> 0x01f0 }
            ts r11 = r11.a     // Catch:{ wq -> 0x01f0 }
            boolean r11 = r11.equals(r8)     // Catch:{ wq -> 0x01f0 }
            if (r11 != 0) goto L_0x013b
            int r1 = r1 + 1
            r11 = r24
            goto L_0x0122
        L_0x013b:
            r1 = 1
            goto L_0x013f
        L_0x013d:
            r1 = 0
        L_0x013f:
            r8 = 1
            r1 = r1 ^ r8
            vy r8 = r2.j     // Catch:{ wq -> 0x01f0 }
            boolean r1 = r8.a(r1, r12, r14)     // Catch:{ wq -> 0x01f0 }
            if (r1 != 0) goto L_0x014b
            goto L_0x01c2
        L_0x014b:
            if (r0 == 0) goto L_0x01ce
            int r1 = r14 + -1
            if (r14 == 0) goto L_0x01cb
            if (r1 == 0) goto L_0x01aa
            r8 = 1
            if (r1 == r8) goto L_0x0186
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ wq -> 0x01f0 }
            if (r14 == r8) goto L_0x0169
            r1 = 2
            if (r14 == r1) goto L_0x0166
            r1 = 3
            if (r14 == r1) goto L_0x0163
            java.lang.String r1 = "null"
            goto L_0x016b
        L_0x0163:
            java.lang.String r1 = "NONE"
            goto L_0x016b
        L_0x0166:
            java.lang.String r1 = "TRANSFORMED"
            goto L_0x016b
        L_0x0169:
            java.lang.String r1 = "SOURCE"
        L_0x016b:
            int r2 = r1.length()     // Catch:{ wq -> 0x01f0 }
            int r2 = r2 + 18
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ wq -> 0x01f0 }
            r3.<init>(r2)     // Catch:{ wq -> 0x01f0 }
            java.lang.String r2 = "Unknown strategy: "
            r3.append(r2)     // Catch:{ wq -> 0x01f0 }
            r3.append(r1)     // Catch:{ wq -> 0x01f0 }
            java.lang.String r1 = r3.toString()     // Catch:{ wq -> 0x01f0 }
            r0.<init>(r1)     // Catch:{ wq -> 0x01f0 }
            throw r0     // Catch:{ wq -> 0x01f0 }
        L_0x0186:
            wy r1 = new wy     // Catch:{ wq -> 0x01f0 }
            vm r8 = r2.a     // Catch:{ wq -> 0x01f0 }
            xe r23 = r8.b()     // Catch:{ wq -> 0x01f0 }
            ts r8 = r2.w     // Catch:{ wq -> 0x01f0 }
            ts r11 = r2.e     // Catch:{ wq -> 0x01f0 }
            int r12 = r2.h     // Catch:{ wq -> 0x01f0 }
            int r14 = r2.i     // Catch:{ wq -> 0x01f0 }
            tx r15 = r2.k     // Catch:{ wq -> 0x01f0 }
            r22 = r1
            r24 = r8
            r25 = r11
            r26 = r12
            r27 = r14
            r29 = r13
            r30 = r15
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30)     // Catch:{ wq -> 0x01f0 }
            goto L_0x01b3
        L_0x01aa:
            vi r1 = new vi     // Catch:{ wq -> 0x01f0 }
            ts r8 = r2.w     // Catch:{ wq -> 0x01f0 }
            ts r11 = r2.e     // Catch:{ wq -> 0x01f0 }
            r1.<init>(r8, r11)     // Catch:{ wq -> 0x01f0 }
        L_0x01b3:
            wv r3 = defpackage.wv.a(r3)     // Catch:{ wq -> 0x01f0 }
            vp r2 = r2.u     // Catch:{ wq -> 0x01f0 }
            r2.a = r1     // Catch:{ wq -> 0x01f0 }
            r2.b = r0     // Catch:{ wq -> 0x01f0 }
            r2.c = r3     // Catch:{ wq -> 0x01f0 }
        L_0x01c2:
            aew r0 = r9.a     // Catch:{ wq -> 0x01f0 }
            ww r0 = r0.a(r3, r7)     // Catch:{ wq -> 0x01f0 }
            r18 = r0
            goto L_0x0201
        L_0x01cb:
            r1 = 0
            throw r1     // Catch:{ wq -> 0x01f0 }
        L_0x01ce:
            sq r0 = new sq     // Catch:{ wq -> 0x01f0 }
            java.lang.Object r1 = r3.b()     // Catch:{ wq -> 0x01f0 }
            java.lang.Class r1 = r1.getClass()     // Catch:{ wq -> 0x01f0 }
            r0.<init>(r1)     // Catch:{ wq -> 0x01f0 }
            throw r0     // Catch:{ wq -> 0x01f0 }
        L_0x01dc:
            r0 = move-exception
            goto L_0x01e1
        L_0x01de:
            r0 = move-exception
            r17 = r3
        L_0x01e1:
            r31 = r11
            goto L_0x01fd
        L_0x01e4:
            r0 = move-exception
            r17 = r3
            r31 = r11
            r1 = r0
            cz r0 = r9.b     // Catch:{ wq -> 0x01f0 }
            r0.a(r2)     // Catch:{ wq -> 0x01f0 }
            throw r1     // Catch:{ wq -> 0x01f0 }
        L_0x01f0:
            r0 = move-exception
            goto L_0x01fd
        L_0x01f2:
            r0 = move-exception
            r31 = r11
            r19 = r12
            r20 = r13
            r17 = r14
            r21 = r15
        L_0x01fd:
            r5.add(r0)     // Catch:{ all -> 0x022f }
        L_0x0201:
            if (r18 != 0) goto L_0x0212
            int r12 = r19 + 1
            r8 = 4
            r1 = r32
            r14 = r17
            r13 = r20
            r15 = r21
            r11 = r31
            goto L_0x007a
        L_0x0212:
            r2 = r18
            if (r2 == 0) goto L_0x0222
            cz r0 = r6.a     // Catch:{ all -> 0x0236 }
            r0.a(r5)     // Catch:{ all -> 0x0236 }
            r10.b()     // Catch:{ all -> 0x023b }
            r4.b()     // Catch:{ wq -> 0x0248 }
            goto L_0x0244
        L_0x0222:
            wq r0 = new wq     // Catch:{ all -> 0x022f }
            java.lang.String r1 = r6.c     // Catch:{ all -> 0x022f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x022f }
            r2.<init>(r5)     // Catch:{ all -> 0x022f }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x022f }
            throw r0     // Catch:{ all -> 0x022f }
        L_0x022f:
            r0 = move-exception
            cz r1 = r6.a     // Catch:{ all -> 0x0236 }
            r1.a(r5)     // Catch:{ all -> 0x0236 }
            throw r0     // Catch:{ all -> 0x0236 }
        L_0x0236:
            r0 = move-exception
            r10.b()     // Catch:{ all -> 0x023b }
            throw r0     // Catch:{ all -> 0x023b }
        L_0x023b:
            r0 = move-exception
            r4.b()     // Catch:{ wq -> 0x0248 }
            throw r0     // Catch:{ wq -> 0x0248 }
        L_0x0240:
            r4.b()     // Catch:{ wq -> 0x0248 }
            r2 = 0
        L_0x0244:
            r4 = 0
            r1 = r32
            goto L_0x025a
        L_0x0248:
            r0 = move-exception
            r1 = r32
            ts r2 = r1.x
            int r3 = r1.C
            r4 = 0
            r0.a(r2, r3, r4)
            java.util.List r2 = r1.r
            r2.add(r0)
            r2 = r4
        L_0x025a:
            if (r2 == 0) goto L_0x038a
            int r0 = r1.C
            boolean r3 = r2 instanceof defpackage.wr
            if (r3 != 0) goto L_0x0263
            goto L_0x0269
        L_0x0263:
            r3 = r2
            wr r3 = (defpackage.wr) r3
            r3.e()
        L_0x0269:
            vp r3 = r1.u
            boolean r3 = r3.a()
            if (r3 == 0) goto L_0x0277
            wv r2 = defpackage.wv.a(r2)
            r4 = r2
            goto L_0x0279
        L_0x0277:
        L_0x0279:
            r32.h()
            vn r3 = r1.l
            monitor-enter(r3)
            r5 = r3
            wk r5 = (defpackage.wk) r5     // Catch:{ all -> 0x0387 }
            r5.h = r2     // Catch:{ all -> 0x0387 }
            r2 = r3
            wk r2 = (defpackage.wk) r2     // Catch:{ all -> 0x0387 }
            r2.n = r0     // Catch:{ all -> 0x0387 }
            monitor-exit(r3)     // Catch:{ all -> 0x0387 }
            monitor-enter(r3)
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            ain r0 = r0.b     // Catch:{ all -> 0x0384 }
            r0.b()     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            boolean r0 = r0.m     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x032b
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            wj r0 = r0.a     // Catch:{ all -> 0x0384 }
            boolean r0 = r0.a()     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x0323
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            boolean r0 = r0.i     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x031b
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            ww r0 = r0.h     // Catch:{ all -> 0x0384 }
            r2 = r3
            wk r2 = (defpackage.wk) r2     // Catch:{ all -> 0x0384 }
            boolean r2 = r2.f     // Catch:{ all -> 0x0384 }
            r5 = r3
            wk r5 = (defpackage.wk) r5     // Catch:{ all -> 0x0384 }
            ts r5 = r5.e     // Catch:{ all -> 0x0384 }
            r6 = r3
            wk r6 = (defpackage.wk) r6     // Catch:{ all -> 0x0384 }
            wn r6 = r6.c     // Catch:{ all -> 0x0384 }
            wo r7 = new wo     // Catch:{ all -> 0x0384 }
            r7.<init>(r0, r2, r5, r6)     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            r0.l = r7     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            r2 = 1
            r0.i = r2     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            wj r0 = r0.a     // Catch:{ all -> 0x0384 }
            wj r0 = r0.c()     // Catch:{ all -> 0x0384 }
            int r2 = r0.b()     // Catch:{ all -> 0x0384 }
            r5 = 1
            int r2 = r2 + r5
            r5 = r3
            wk r5 = (defpackage.wk) r5     // Catch:{ all -> 0x0384 }
            r5.a(r2)     // Catch:{ all -> 0x0384 }
            r2 = r3
            wk r2 = (defpackage.wk) r2     // Catch:{ all -> 0x0384 }
            ts r2 = r2.e     // Catch:{ all -> 0x0384 }
            r5 = r3
            wk r5 = (defpackage.wk) r5     // Catch:{ all -> 0x0384 }
            wo r5 = r5.l     // Catch:{ all -> 0x0384 }
            monitor-exit(r3)     // Catch:{ all -> 0x0384 }
            wk r3 = (defpackage.wk) r3
            wl r6 = r3.d
            r6.a(r3, r2, r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x02fc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0316
            java.lang.Object r2 = r0.next()
            wi r2 = (defpackage.wi) r2
            java.util.concurrent.Executor r5 = r2.b
            wh r6 = new wh
            agr r2 = r2.a
            r6.<init>(r3, r2)
            r5.execute(r6)
            goto L_0x02fc
        L_0x0316:
            r3.a()
            goto L_0x033a
        L_0x031b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = "Already have resource"
            r0.<init>(r2)     // Catch:{ all -> 0x0384 }
            throw r0     // Catch:{ all -> 0x0384 }
        L_0x0323:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0384 }
            java.lang.String r2 = "Received a resource without any callbacks to notify"
            r0.<init>(r2)     // Catch:{ all -> 0x0384 }
            throw r0     // Catch:{ all -> 0x0384 }
        L_0x032b:
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            ww r0 = r0.h     // Catch:{ all -> 0x0384 }
            r0.d()     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (defpackage.wk) r0     // Catch:{ all -> 0x0384 }
            r0.c()     // Catch:{ all -> 0x0384 }
            monitor-exit(r3)     // Catch:{ all -> 0x0384 }
        L_0x033a:
            r0 = 5
            r1.B = r0
            vp r0 = r1.u     // Catch:{ all -> 0x037c }
            boolean r0 = r0.a()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x036a
            vp r2 = r1.u     // Catch:{ all -> 0x037c }
            vq r0 = r1.b     // Catch:{ all -> 0x037c }
            tx r3 = r1.k     // Catch:{ all -> 0x037c }
            xy r0 = r0.a()     // Catch:{ all -> 0x0363 }
            ts r5 = r2.a     // Catch:{ all -> 0x0363 }
            vj r6 = new vj     // Catch:{ all -> 0x0363 }
            ua r7 = r2.b     // Catch:{ all -> 0x0363 }
            wv r8 = r2.c     // Catch:{ all -> 0x0363 }
            r6.<init>(r7, r8, r3)     // Catch:{ all -> 0x0363 }
            r0.a(r5, r6)     // Catch:{ all -> 0x0363 }
            wv r0 = r2.c     // Catch:{ all -> 0x037c }
            r0.e()     // Catch:{ all -> 0x037c }
            goto L_0x036a
        L_0x0363:
            r0 = move-exception
            wv r2 = r2.c     // Catch:{ all -> 0x037c }
            r2.e()     // Catch:{ all -> 0x037c }
            throw r0     // Catch:{ all -> 0x037c }
        L_0x036a:
            if (r4 != 0) goto L_0x036d
            goto L_0x0370
        L_0x036d:
            r4.e()
        L_0x0370:
            vr r0 = r1.c
            boolean r0 = r0.a()
            if (r0 == 0) goto L_0x037b
            r32.a()
        L_0x037b:
            return
        L_0x037c:
            r0 = move-exception
            if (r4 != 0) goto L_0x0380
            goto L_0x0383
        L_0x0380:
            r4.e()
        L_0x0383:
            throw r0
        L_0x0384:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0384 }
            throw r0
        L_0x0387:
            r0 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x0387 }
            throw r0
        L_0x038a:
            r32.f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vs.i():void");
    }

    private final vl e() {
        int i2 = this.B;
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 == 1) {
            return new wx(this.a, this);
        } else {
            if (i3 == 2) {
                return new vh(this.a, this);
            }
            if (i3 == 3) {
                return new xc(this.a, this);
            }
            if (i3 == 5) {
                return null;
            }
            String c2 = aic.c(i2);
            StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 20);
            sb.append("Unrecognized stage: ");
            sb.append(c2);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final int a(int i2) {
        int i3 = i2 - 1;
        if (i2 == 0) {
            throw null;
        } else if (i3 != 0) {
            if (i3 != 1) {
                if (i3 == 2) {
                    return 4;
                }
                if (i3 == 3 || i3 == 5) {
                    return 6;
                }
                String c2 = aic.c(i2);
                StringBuilder sb = new StringBuilder(String.valueOf(c2).length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(c2);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.j.b()) {
                return a(3);
            } else {
                return 3;
            }
        } else if (!this.j.a()) {
            return a(2);
        } else {
            return 2;
        }
    }

    private final int d() {
        return this.f.ordinal();
    }

    private final void g() {
        h();
        wq wqVar = new wq("Failed to load resource", new ArrayList(this.r));
        vn vnVar = this.l;
        synchronized (vnVar) {
            ((wk) vnVar).j = wqVar;
        }
        synchronized (vnVar) {
            ((wk) vnVar).b.b();
            if (((wk) vnVar).m) {
                ((wk) vnVar).c();
            } else if (((wk) vnVar).a.a()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!((wk) vnVar).k) {
                ((wk) vnVar).k = true;
                ts tsVar = ((wk) vnVar).e;
                wj c2 = ((wk) vnVar).a.c();
                ((wk) vnVar).a(c2.b() + 1);
                wk wkVar = (wk) vnVar;
                wkVar.d.a(wkVar, tsVar, null);
                Iterator it = c2.iterator();
                while (it.hasNext()) {
                    wi wiVar = (wi) it.next();
                    wiVar.b.execute(new wg(wkVar, wiVar.a));
                }
                wkVar.a();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        if (this.c.b()) {
            a();
        }
    }

    public final void a(ts tsVar, Exception exc, ug ugVar, int i2) {
        ugVar.b();
        wq wqVar = new wq("Fetching data failed", exc);
        wqVar.a(tsVar, i2, ugVar.a());
        this.r.add(wqVar);
        if (Thread.currentThread() != this.v) {
            this.q = 2;
            this.l.a(this);
            return;
        }
        f();
    }

    public final void a(ts tsVar, Object obj, ug ugVar, int i2, ts tsVar2) {
        this.w = tsVar;
        this.y = obj;
        this.z = ugVar;
        this.C = i2;
        this.x = tsVar2;
        if (Thread.currentThread() != this.v) {
            this.q = 3;
            this.l.a(this);
            return;
        }
        i();
    }

    public final void a() {
        this.c.c();
        vp vpVar = this.u;
        vpVar.a = null;
        vpVar.b = null;
        vpVar.c = null;
        vm vmVar = this.a;
        vmVar.c = null;
        vmVar.d = null;
        vmVar.n = null;
        vmVar.g = null;
        vmVar.k = null;
        vmVar.i = null;
        vmVar.o = null;
        vmVar.j = null;
        vmVar.p = null;
        vmVar.a.clear();
        vmVar.l = false;
        vmVar.b.clear();
        vmVar.m = false;
        this.A = false;
        this.d = null;
        this.e = null;
        this.k = null;
        this.f = null;
        this.g = null;
        this.l = null;
        this.B = 0;
        this.o = null;
        this.v = null;
        this.w = null;
        this.y = null;
        this.C = 0;
        this.z = null;
        this.p = false;
        this.r.clear();
        this.t.a(this);
    }

    public final void c() {
        this.q = 2;
        this.l.a(this);
    }

    public final void run() {
        ug ugVar = this.z;
        try {
            if (!this.p) {
                int i2 = this.q;
                int i3 = i2 - 1;
                if (i2 != 0) {
                    if (i3 == 0) {
                        this.B = a(1);
                        this.o = e();
                        f();
                    } else if (i3 == 1) {
                        f();
                    } else if (i3 != 2) {
                        String str = i2 != 1 ? i2 != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
                        StringBuilder sb = new StringBuilder(str.length() + 25);
                        sb.append("Unrecognized run reason: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    } else {
                        i();
                    }
                    if (ugVar == null) {
                        return;
                    }
                } else {
                    throw null;
                }
            } else {
                g();
                if (ugVar == null) {
                    return;
                }
            }
            ugVar.b();
        } catch (vg e2) {
            throw e2;
        } catch (Throwable th) {
            if (ugVar != null) {
                ugVar.b();
            }
            throw th;
        }
    }

    private final void f() {
        this.v = Thread.currentThread();
        ahy.a();
        boolean z2 = false;
        while (!this.p && this.o != null && !(z2 = this.o.a())) {
            this.B = a(this.B);
            this.o = e();
            if (this.B == 4) {
                c();
                return;
            }
        }
        if ((this.B == 6 || this.p) && !z2) {
            g();
        }
    }

    private final void h() {
        Throwable th;
        this.s.b();
        if (this.A) {
            if (!this.r.isEmpty()) {
                List list = this.r;
                th = (Throwable) list.get(list.size() - 1);
            } else {
                th = null;
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.A = true;
    }
}
