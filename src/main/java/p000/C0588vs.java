package p000;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: vs */
/* compiled from: PG */
public final class C0588vs implements Runnable, Comparable, C0580vk, aik {

    /* renamed from: A */
    private volatile boolean f10615A;

    /* renamed from: B */
    private int f10616B;

    /* renamed from: C */
    private int f10617C;

    /* renamed from: a */
    public final C0582vm f10618a = new C0582vm();

    /* renamed from: b */
    public final C0586vq f10619b;

    /* renamed from: c */
    public final C0587vr f10620c = new C0587vr();

    /* renamed from: d */
    public C0500sl f10621d;

    /* renamed from: e */
    public C0534ts f10622e;

    /* renamed from: f */
    public C0501sm f10623f;

    /* renamed from: g */
    public C0609wm f10624g;

    /* renamed from: h */
    public int f10625h;

    /* renamed from: i */
    public int f10626i;

    /* renamed from: j */
    public C0594vy f10627j;

    /* renamed from: k */
    public C0539tx f10628k;

    /* renamed from: l */
    public C0583vn f10629l;

    /* renamed from: m */
    public int f10630m;

    /* renamed from: n */
    public boolean f10631n;

    /* renamed from: o */
    public volatile C0581vl f10632o;

    /* renamed from: p */
    public volatile boolean f10633p;

    /* renamed from: q */
    public int f10634q;

    /* renamed from: r */
    private final List f10635r = new ArrayList();

    /* renamed from: s */
    private final ain f10636s = ain.m578a();

    /* renamed from: t */
    private final C0082cz f10637t;

    /* renamed from: u */
    private final C0585vp f10638u = new C0585vp();

    /* renamed from: v */
    private Thread f10639v;

    /* renamed from: w */
    private C0534ts f10640w;

    /* renamed from: x */
    private C0534ts f10641x;

    /* renamed from: y */
    private Object f10642y;

    /* renamed from: z */
    private C0549ug f10643z;

    public C0588vs(C0586vq vqVar, C0082cz czVar) {
        this.f10619b = vqVar;
        this.f10637t = czVar;
    }

    /* renamed from: P */
    public final ain mo319P() {
        return this.f10636s;
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C0588vs vsVar = (C0588vs) obj;
        int d = m8499d() - vsVar.m8499d();
        return d == 0 ? this.f10630m - vsVar.f10630m : d;
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
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m8504i() {
        /*
            r32 = this;
            r1 = r32
            ug r4 = r1.f10643z     // Catch:{ wq -> 0x0248 }
            java.lang.Object r0 = r1.f10642y     // Catch:{ wq -> 0x0248 }
            int r5 = r1.f10617C     // Catch:{ wq -> 0x0248 }
            if (r0 == 0) goto L_0x0240
            p000.ahy.m529a()     // Catch:{ all -> 0x023b }
            vm r6 = r1.f10618a     // Catch:{ all -> 0x023b }
            java.lang.Class r7 = r0.getClass()     // Catch:{ all -> 0x023b }
            wt r6 = r6.mo6031b(r7)     // Catch:{ all -> 0x023b }
            tx r7 = r1.f10628k     // Catch:{ all -> 0x023b }
            int r8 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x023b }
            r8 = 4
            if (r5 == r8) goto L_0x0027
            vm r10 = r1.f10618a     // Catch:{ all -> 0x023b }
            boolean r10 = r10.f10606r     // Catch:{ all -> 0x023b }
            if (r10 != 0) goto L_0x0026
            r10 = 0
            goto L_0x0028
        L_0x0026:
        L_0x0027:
            r10 = 1
        L_0x0028:
            tw r11 = p000.acx.f107a     // Catch:{ all -> 0x023b }
            java.lang.Object r11 = r7.mo5987a(r11)     // Catch:{ all -> 0x023b }
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
            tx r11 = r1.f10628k     // Catch:{ all -> 0x023b }
            r7.mo5989a(r11)     // Catch:{ all -> 0x023b }
            tw r11 = p000.acx.f107a     // Catch:{ all -> 0x023b }
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)     // Catch:{ all -> 0x023b }
            r7.mo5988a(r11, r10)     // Catch:{ all -> 0x023b }
        L_0x004f:
            sl r10 = r1.f10621d     // Catch:{ all -> 0x023b }
            ss r10 = r10.f10384c     // Catch:{ all -> 0x023b }
            ul r10 = r10.f10399e     // Catch:{ all -> 0x023b }
            ui r10 = r10.mo6006a(r0)     // Catch:{ all -> 0x023b }
            int r11 = r1.f10625h     // Catch:{ all -> 0x0236 }
            int r15 = r1.f10626i     // Catch:{ all -> 0x0236 }
            vo r14 = new vo     // Catch:{ all -> 0x0236 }
            r14.<init>(r1, r5)     // Catch:{ all -> 0x0236 }
            cz r0 = r6.f10728a     // Catch:{ all -> 0x0236 }
            java.lang.Object r0 = r0.mo317a()     // Catch:{ all -> 0x0236 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ all -> 0x0236 }
            java.lang.Object r0 = p000.aic.m542a(r0)     // Catch:{ all -> 0x0236 }
            r5 = r0
            java.util.List r5 = (java.util.List) r5     // Catch:{ all -> 0x0236 }
            java.util.List r0 = r6.f10729b     // Catch:{ all -> 0x022f }
            int r13 = r0.size()     // Catch:{ all -> 0x022f }
            r12 = 0
            r18 = 0
        L_0x007a:
            if (r12 >= r13) goto L_0x0212
            java.util.List r0 = r6.f10729b     // Catch:{ all -> 0x022f }
            java.lang.Object r0 = r0.get(r12)     // Catch:{ all -> 0x022f }
            r9 = r0
            vt r9 = (p000.C0589vt) r9     // Catch:{ all -> 0x022f }
            cz r0 = r9.f10645b     // Catch:{ wq -> 0x01f2 }
            java.lang.Object r0 = r0.mo317a()     // Catch:{ wq -> 0x01f2 }
            java.util.List r0 = (java.util.List) r0     // Catch:{ wq -> 0x01f2 }
            java.lang.Object r0 = p000.aic.m542a(r0)     // Catch:{ wq -> 0x01f2 }
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
            ww r0 = r12.mo6047a(r13, r14, r15, r16, r17)     // Catch:{ all -> 0x01e4 }
            cz r12 = r9.f10645b     // Catch:{ wq -> 0x01de }
            r12.mo318a(r2)     // Catch:{ wq -> 0x01de }
            vs r2 = r3.f10607a     // Catch:{ wq -> 0x01de }
            int r12 = r3.f10608b     // Catch:{ wq -> 0x01de }
            java.lang.Object r13 = r0.mo33b()     // Catch:{ wq -> 0x01de }
            java.lang.Class r13 = r13.getClass()     // Catch:{ wq -> 0x01de }
            if (r12 == r8) goto L_0x00ce
            vm r14 = r2.f10618a     // Catch:{ wq -> 0x01de }
            ub r14 = r14.mo6034c(r13)     // Catch:{ wq -> 0x01de }
            sl r15 = r2.f10621d     // Catch:{ wq -> 0x01de }
            int r8 = r2.f10625h     // Catch:{ wq -> 0x01de }
            r17 = r3
            int r3 = r2.f10626i     // Catch:{ wq -> 0x01dc }
            ww r3 = r14.mo36a(r15, r0, r8, r3)     // Catch:{ wq -> 0x01dc }
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
            r0.mo35d()     // Catch:{ wq -> 0x01dc }
        L_0x00dd:
            vm r0 = r2.f10618a     // Catch:{ wq -> 0x01dc }
            sl r0 = r0.f10591c     // Catch:{ wq -> 0x01dc }
            ss r0 = r0.f10384c     // Catch:{ wq -> 0x01dc }
            agi r0 = r0.f10398d     // Catch:{ wq -> 0x01dc }
            java.lang.Class r8 = r3.mo32a()     // Catch:{ wq -> 0x01dc }
            ua r0 = r0.mo189a(r8)     // Catch:{ wq -> 0x01dc }
            if (r0 == 0) goto L_0x0110
            vm r0 = r2.f10618a     // Catch:{ wq -> 0x01dc }
            sl r0 = r0.f10591c     // Catch:{ wq -> 0x01dc }
            ss r0 = r0.f10384c     // Catch:{ wq -> 0x01dc }
            agi r0 = r0.f10398d     // Catch:{ wq -> 0x01dc }
            java.lang.Class r14 = r3.mo32a()     // Catch:{ wq -> 0x01dc }
            ua r0 = r0.mo189a(r14)     // Catch:{ wq -> 0x01dc }
            if (r0 == 0) goto L_0x0106
            int r14 = r0.mo40a()     // Catch:{ wq -> 0x01dc }
            goto L_0x0113
        L_0x0106:
            sq r0 = new sq     // Catch:{ wq -> 0x01dc }
            java.lang.Class r2 = r3.mo32a()     // Catch:{ wq -> 0x01dc }
            r0.<init>(r2)     // Catch:{ wq -> 0x01dc }
            throw r0     // Catch:{ wq -> 0x01dc }
        L_0x0110:
            r0 = 0
            r14 = 3
        L_0x0113:
            vm r15 = r2.f10618a     // Catch:{ wq -> 0x01dc }
            ts r8 = r2.f10640w     // Catch:{ wq -> 0x01dc }
            java.util.List r15 = r15.mo6033c()     // Catch:{ wq -> 0x01dc }
            r31 = r11
            int r11 = r15.size()     // Catch:{ wq -> 0x01f0 }
            r1 = 0
        L_0x0122:
            if (r1 >= r11) goto L_0x013d
            java.lang.Object r23 = r15.get(r1)     // Catch:{ wq -> 0x01f0 }
            r24 = r11
            r11 = r23
            aai r11 = (p000.aai) r11     // Catch:{ wq -> 0x01f0 }
            ts r11 = r11.f12a     // Catch:{ wq -> 0x01f0 }
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
            vy r8 = r2.f10627j     // Catch:{ wq -> 0x01f0 }
            boolean r1 = r8.mo6051a(r1, r12, r14)     // Catch:{ wq -> 0x01f0 }
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
            vm r8 = r2.f10618a     // Catch:{ wq -> 0x01f0 }
            xe r23 = r8.mo6032b()     // Catch:{ wq -> 0x01f0 }
            ts r8 = r2.f10640w     // Catch:{ wq -> 0x01f0 }
            ts r11 = r2.f10622e     // Catch:{ wq -> 0x01f0 }
            int r12 = r2.f10625h     // Catch:{ wq -> 0x01f0 }
            int r14 = r2.f10626i     // Catch:{ wq -> 0x01f0 }
            tx r15 = r2.f10628k     // Catch:{ wq -> 0x01f0 }
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
            ts r8 = r2.f10640w     // Catch:{ wq -> 0x01f0 }
            ts r11 = r2.f10622e     // Catch:{ wq -> 0x01f0 }
            r1.<init>(r8, r11)     // Catch:{ wq -> 0x01f0 }
        L_0x01b3:
            wv r3 = p000.C0618wv.m8574a(r3)     // Catch:{ wq -> 0x01f0 }
            vp r2 = r2.f10638u     // Catch:{ wq -> 0x01f0 }
            r2.f10609a = r1     // Catch:{ wq -> 0x01f0 }
            r2.f10610b = r0     // Catch:{ wq -> 0x01f0 }
            r2.f10611c = r3     // Catch:{ wq -> 0x01f0 }
        L_0x01c2:
            aew r0 = r9.f10644a     // Catch:{ wq -> 0x01f0 }
            ww r0 = r0.mo122a(r3, r7)     // Catch:{ wq -> 0x01f0 }
            r18 = r0
            goto L_0x0201
        L_0x01cb:
            r1 = 0
            throw r1     // Catch:{ wq -> 0x01f0 }
        L_0x01ce:
            sq r0 = new sq     // Catch:{ wq -> 0x01f0 }
            java.lang.Object r1 = r3.mo33b()     // Catch:{ wq -> 0x01f0 }
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
            cz r0 = r9.f10645b     // Catch:{ wq -> 0x01f0 }
            r0.mo318a(r2)     // Catch:{ wq -> 0x01f0 }
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
            cz r0 = r6.f10728a     // Catch:{ all -> 0x0236 }
            r0.mo318a(r5)     // Catch:{ all -> 0x0236 }
            r10.mo88b()     // Catch:{ all -> 0x023b }
            r4.mo8b()     // Catch:{ wq -> 0x0248 }
            goto L_0x0244
        L_0x0222:
            wq r0 = new wq     // Catch:{ all -> 0x022f }
            java.lang.String r1 = r6.f10730c     // Catch:{ all -> 0x022f }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ all -> 0x022f }
            r2.<init>(r5)     // Catch:{ all -> 0x022f }
            r0.<init>(r1, r2)     // Catch:{ all -> 0x022f }
            throw r0     // Catch:{ all -> 0x022f }
        L_0x022f:
            r0 = move-exception
            cz r1 = r6.f10728a     // Catch:{ all -> 0x0236 }
            r1.mo318a(r5)     // Catch:{ all -> 0x0236 }
            throw r0     // Catch:{ all -> 0x0236 }
        L_0x0236:
            r0 = move-exception
            r10.mo88b()     // Catch:{ all -> 0x023b }
            throw r0     // Catch:{ all -> 0x023b }
        L_0x023b:
            r0 = move-exception
            r4.mo8b()     // Catch:{ wq -> 0x0248 }
            throw r0     // Catch:{ wq -> 0x0248 }
        L_0x0240:
            r4.mo8b()     // Catch:{ wq -> 0x0248 }
            r2 = 0
        L_0x0244:
            r4 = 0
            r1 = r32
            goto L_0x025a
        L_0x0248:
            r0 = move-exception
            r1 = r32
            ts r2 = r1.f10641x
            int r3 = r1.f10617C
            r4 = 0
            r0.mo6081a(r2, r3, r4)
            java.util.List r2 = r1.f10635r
            r2.add(r0)
            r2 = r4
        L_0x025a:
            if (r2 == 0) goto L_0x038a
            int r0 = r1.f10617C
            boolean r3 = r2 instanceof p000.C0614wr
            if (r3 != 0) goto L_0x0263
            goto L_0x0269
        L_0x0263:
            r3 = r2
            wr r3 = (p000.C0614wr) r3
            r3.mo41e()
        L_0x0269:
            vp r3 = r1.f10638u
            boolean r3 = r3.mo6037a()
            if (r3 == 0) goto L_0x0277
            wv r2 = p000.C0618wv.m8574a(r2)
            r4 = r2
            goto L_0x0279
        L_0x0277:
        L_0x0279:
            r32.m8503h()
            vn r3 = r1.f10629l
            monitor-enter(r3)
            r5 = r3
            wk r5 = (p000.C0607wk) r5     // Catch:{ all -> 0x0387 }
            r5.f10690h = r2     // Catch:{ all -> 0x0387 }
            r2 = r3
            wk r2 = (p000.C0607wk) r2     // Catch:{ all -> 0x0387 }
            r2.f10696n = r0     // Catch:{ all -> 0x0387 }
            monitor-exit(r3)     // Catch:{ all -> 0x0387 }
            monitor-enter(r3)
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            ain r0 = r0.f10684b     // Catch:{ all -> 0x0384 }
            r0.mo320b()     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            boolean r0 = r0.f10695m     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x032b
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            wj r0 = r0.f10683a     // Catch:{ all -> 0x0384 }
            boolean r0 = r0.mo6060a()     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x0323
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            boolean r0 = r0.f10691i     // Catch:{ all -> 0x0384 }
            if (r0 != 0) goto L_0x031b
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            ww r0 = r0.f10690h     // Catch:{ all -> 0x0384 }
            r2 = r3
            wk r2 = (p000.C0607wk) r2     // Catch:{ all -> 0x0384 }
            boolean r2 = r2.f10688f     // Catch:{ all -> 0x0384 }
            r5 = r3
            wk r5 = (p000.C0607wk) r5     // Catch:{ all -> 0x0384 }
            ts r5 = r5.f10687e     // Catch:{ all -> 0x0384 }
            r6 = r3
            wk r6 = (p000.C0607wk) r6     // Catch:{ all -> 0x0384 }
            wn r6 = r6.f10685c     // Catch:{ all -> 0x0384 }
            wo r7 = new wo     // Catch:{ all -> 0x0384 }
            r7.<init>(r0, r2, r5, r6)     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            r0.f10694l = r7     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            r2 = 1
            r0.f10691i = r2     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            wj r0 = r0.f10683a     // Catch:{ all -> 0x0384 }
            wj r0 = r0.mo6063c()     // Catch:{ all -> 0x0384 }
            int r2 = r0.mo6062b()     // Catch:{ all -> 0x0384 }
            r5 = 1
            int r2 = r2 + r5
            r5 = r3
            wk r5 = (p000.C0607wk) r5     // Catch:{ all -> 0x0384 }
            r5.mo6066a(r2)     // Catch:{ all -> 0x0384 }
            r2 = r3
            wk r2 = (p000.C0607wk) r2     // Catch:{ all -> 0x0384 }
            ts r2 = r2.f10687e     // Catch:{ all -> 0x0384 }
            r5 = r3
            wk r5 = (p000.C0607wk) r5     // Catch:{ all -> 0x0384 }
            wo r5 = r5.f10694l     // Catch:{ all -> 0x0384 }
            monitor-exit(r3)     // Catch:{ all -> 0x0384 }
            wk r3 = (p000.C0607wk) r3
            wl r6 = r3.f10686d
            r6.mo6055a(r3, r2, r5)
            java.util.Iterator r0 = r0.iterator()
        L_0x02fc:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0316
            java.lang.Object r2 = r0.next()
            wi r2 = (p000.C0605wi) r2
            java.util.concurrent.Executor r5 = r2.f10681b
            wh r6 = new wh
            agr r2 = r2.f10680a
            r6.<init>(r3, r2)
            r5.execute(r6)
            goto L_0x02fc
        L_0x0316:
            r3.mo6065a()
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
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            ww r0 = r0.f10690h     // Catch:{ all -> 0x0384 }
            r0.mo35d()     // Catch:{ all -> 0x0384 }
            r0 = r3
            wk r0 = (p000.C0607wk) r0     // Catch:{ all -> 0x0384 }
            r0.mo6071c()     // Catch:{ all -> 0x0384 }
            monitor-exit(r3)     // Catch:{ all -> 0x0384 }
        L_0x033a:
            r0 = 5
            r1.f10616B = r0
            vp r0 = r1.f10638u     // Catch:{ all -> 0x037c }
            boolean r0 = r0.mo6037a()     // Catch:{ all -> 0x037c }
            if (r0 == 0) goto L_0x036a
            vp r2 = r1.f10638u     // Catch:{ all -> 0x037c }
            vq r0 = r1.f10619b     // Catch:{ all -> 0x037c }
            tx r3 = r1.f10628k     // Catch:{ all -> 0x037c }
            xy r0 = r0.mo6038a()     // Catch:{ all -> 0x0363 }
            ts r5 = r2.f10609a     // Catch:{ all -> 0x0363 }
            vj r6 = new vj     // Catch:{ all -> 0x0363 }
            ua r7 = r2.f10610b     // Catch:{ all -> 0x0363 }
            wv r8 = r2.f10611c     // Catch:{ all -> 0x0363 }
            r6.<init>(r7, r8, r3)     // Catch:{ all -> 0x0363 }
            r0.mo6129a(r5, r6)     // Catch:{ all -> 0x0363 }
            wv r0 = r2.f10611c     // Catch:{ all -> 0x037c }
            r0.mo6089e()     // Catch:{ all -> 0x037c }
            goto L_0x036a
        L_0x0363:
            r0 = move-exception
            wv r2 = r2.f10611c     // Catch:{ all -> 0x037c }
            r2.mo6089e()     // Catch:{ all -> 0x037c }
            throw r0     // Catch:{ all -> 0x037c }
        L_0x036a:
            if (r4 != 0) goto L_0x036d
            goto L_0x0370
        L_0x036d:
            r4.mo6089e()
        L_0x0370:
            vr r0 = r1.f10620c
            boolean r0 = r0.mo6039a()
            if (r0 == 0) goto L_0x037b
            r32.mo6044a()
        L_0x037b:
            return
        L_0x037c:
            r0 = move-exception
            if (r4 != 0) goto L_0x0380
            goto L_0x0383
        L_0x0380:
            r4.mo6089e()
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
            r32.m8501f()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0588vs.m8504i():void");
    }

    /* renamed from: e */
    private final C0581vl m8500e() {
        int i = this.f10616B;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 == 1) {
            return new C0620wx(this.f10618a, this);
        } else {
            if (i2 == 2) {
                return new C0577vh(this.f10618a, this);
            }
            if (i2 == 3) {
                return new C0626xc(this.f10618a, this);
            }
            if (i2 == 5) {
                return null;
            }
            String c = aic.m547c(i);
            StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 20);
            sb.append("Unrecognized stage: ");
            sb.append(c);
            throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final int mo6043a(int i) {
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return 4;
                }
                if (i2 == 3 || i2 == 5) {
                    return 6;
                }
                String c = aic.m547c(i);
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 20);
                sb.append("Unrecognized stage: ");
                sb.append(c);
                throw new IllegalArgumentException(sb.toString());
            } else if (!this.f10627j.mo6052b()) {
                return mo6043a(3);
            } else {
                return 3;
            }
        } else if (!this.f10627j.mo6049a()) {
            return mo6043a(2);
        } else {
            return 2;
        }
    }

    /* renamed from: d */
    private final int m8499d() {
        return this.f10623f.ordinal();
    }

    /* renamed from: g */
    private final void m8502g() {
        m8503h();
        C0613wq wqVar = new C0613wq("Failed to load resource", new ArrayList(this.f10635r));
        C0583vn vnVar = this.f10629l;
        synchronized (vnVar) {
            ((C0607wk) vnVar).f10692j = wqVar;
        }
        synchronized (vnVar) {
            ((C0607wk) vnVar).f10684b.mo320b();
            if (((C0607wk) vnVar).f10695m) {
                ((C0607wk) vnVar).mo6071c();
            } else if (((C0607wk) vnVar).f10683a.mo6060a()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else if (!((C0607wk) vnVar).f10693k) {
                ((C0607wk) vnVar).f10693k = true;
                C0534ts tsVar = ((C0607wk) vnVar).f10687e;
                C0606wj c = ((C0607wk) vnVar).f10683a.mo6063c();
                ((C0607wk) vnVar).mo6066a(c.mo6062b() + 1);
                C0607wk wkVar = (C0607wk) vnVar;
                wkVar.f10686d.mo6055a(wkVar, tsVar, null);
                Iterator it = c.iterator();
                while (it.hasNext()) {
                    C0605wi wiVar = (C0605wi) it.next();
                    wiVar.f10681b.execute(new C0603wg(wkVar, wiVar.f10680a));
                }
                wkVar.mo6065a();
            } else {
                throw new IllegalStateException("Already failed once");
            }
        }
        if (this.f10620c.mo6040b()) {
            mo6044a();
        }
    }

    /* renamed from: a */
    public final void mo6025a(C0534ts tsVar, Exception exc, C0549ug ugVar, int i) {
        ugVar.mo8b();
        C0613wq wqVar = new C0613wq("Fetching data failed", exc);
        wqVar.mo6081a(tsVar, i, ugVar.mo6a());
        this.f10635r.add(wqVar);
        if (Thread.currentThread() != this.f10639v) {
            this.f10634q = 2;
            this.f10629l.mo6036a(this);
            return;
        }
        m8501f();
    }

    /* renamed from: a */
    public final void mo6026a(C0534ts tsVar, Object obj, C0549ug ugVar, int i, C0534ts tsVar2) {
        this.f10640w = tsVar;
        this.f10642y = obj;
        this.f10643z = ugVar;
        this.f10617C = i;
        this.f10641x = tsVar2;
        if (Thread.currentThread() != this.f10639v) {
            this.f10634q = 3;
            this.f10629l.mo6036a(this);
            return;
        }
        m8504i();
    }

    /* renamed from: a */
    public final void mo6044a() {
        this.f10620c.mo6041c();
        C0585vp vpVar = this.f10638u;
        vpVar.f10609a = null;
        vpVar.f10610b = null;
        vpVar.f10611c = null;
        C0582vm vmVar = this.f10618a;
        vmVar.f10591c = null;
        vmVar.f10592d = null;
        vmVar.f10602n = null;
        vmVar.f10595g = null;
        vmVar.f10599k = null;
        vmVar.f10597i = null;
        vmVar.f10603o = null;
        vmVar.f10598j = null;
        vmVar.f10604p = null;
        vmVar.f10589a.clear();
        vmVar.f10600l = false;
        vmVar.f10590b.clear();
        vmVar.f10601m = false;
        this.f10615A = false;
        this.f10621d = null;
        this.f10622e = null;
        this.f10628k = null;
        this.f10623f = null;
        this.f10624g = null;
        this.f10629l = null;
        this.f10616B = 0;
        this.f10632o = null;
        this.f10639v = null;
        this.f10640w = null;
        this.f10642y = null;
        this.f10617C = 0;
        this.f10643z = null;
        this.f10633p = false;
        this.f10635r.clear();
        this.f10637t.mo318a(this);
    }

    /* renamed from: c */
    public final void mo6027c() {
        this.f10634q = 2;
        this.f10629l.mo6036a(this);
    }

    public final void run() {
        C0549ug ugVar = this.f10643z;
        try {
            if (!this.f10633p) {
                int i = this.f10634q;
                int i2 = i - 1;
                if (i != 0) {
                    if (i2 == 0) {
                        this.f10616B = mo6043a(1);
                        this.f10632o = m8500e();
                        m8501f();
                    } else if (i2 == 1) {
                        m8501f();
                    } else if (i2 != 2) {
                        String str = i != 1 ? i != 2 ? "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
                        StringBuilder sb = new StringBuilder(str.length() + 25);
                        sb.append("Unrecognized run reason: ");
                        sb.append(str);
                        throw new IllegalStateException(sb.toString());
                    } else {
                        m8504i();
                    }
                    if (ugVar == null) {
                        return;
                    }
                } else {
                    throw null;
                }
            } else {
                m8502g();
                if (ugVar == null) {
                    return;
                }
            }
            ugVar.mo8b();
        } catch (C0576vg e) {
            throw e;
        } catch (Throwable th) {
            if (ugVar != null) {
                ugVar.mo8b();
            }
            throw th;
        }
    }

    /* renamed from: f */
    private final void m8501f() {
        this.f10639v = Thread.currentThread();
        ahy.m529a();
        boolean z = false;
        while (!this.f10633p && this.f10632o != null && !(z = this.f10632o.mo6022a())) {
            this.f10616B = mo6043a(this.f10616B);
            this.f10632o = m8500e();
            if (this.f10616B == 4) {
                mo6027c();
                return;
            }
        }
        if ((this.f10616B == 6 || this.f10633p) && !z) {
            m8502g();
        }
    }

    /* renamed from: h */
    private final void m8503h() {
        Throwable th;
        this.f10636s.mo320b();
        if (this.f10615A) {
            if (!this.f10635r.isEmpty()) {
                List list = this.f10635r;
                th = (Throwable) list.get(list.size() - 1);
            } else {
                th = null;
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.f10615A = true;
    }
}
