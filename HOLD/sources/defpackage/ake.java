package defpackage;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: ake  reason: default package */
/* compiled from: PG */
public final class ake implements Handler.Callback, awr, awu, aje, aku {
    private boolean A;
    private int B;
    private akd C;
    private long D;
    private int E;
    private boolean F;
    public final bkp a;
    public final HandlerThread b;
    private final akx[] c;
    private final aky[] d;
    private final bgq e;
    private final bgr f;
    private final akk g;
    private final bhn h;
    private final Handler i;
    private final alg j;
    private final alf k;
    private final long l;
    private final ajf m;
    private final akc n;
    private final ArrayList o;
    private final akn p = new akn();
    private alb q;
    private akp r;
    private awv s;
    private akx[] t;
    private boolean u;
    private boolean v;
    private boolean w;
    private boolean x;
    private int y;
    private boolean z;

    public ake(akx[] akxArr, bgq bgq, bgr bgr, akk akk, bhn bhn, boolean z2, int i2, boolean z3, Handler handler, bkf bkf) {
        this.c = akxArr;
        this.e = bgq;
        this.f = bgr;
        this.g = akk;
        this.h = bhn;
        this.v = z2;
        this.y = i2;
        this.z = z3;
        this.i = handler;
        this.l = ((ajd) akk).g;
        this.q = alb.b;
        this.r = akp.a(-9223372036854775807L, bgr);
        this.n = new akc((byte) 0);
        this.d = new aky[akxArr.length];
        for (int i3 = 0; i3 < akxArr.length; i3++) {
            akxArr[i3].u();
            this.d[i3] = akxArr[i3].R();
        }
        this.m = new ajf(this);
        this.o = new ArrayList();
        this.t = new akx[0];
        this.j = new alg();
        this.k = new alf();
        bgq.d = bhn;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.b = handlerThread;
        handlerThread.start();
        this.a = new blh(new Handler(this.b.getLooper(), this));
        this.F = true;
    }

    private final akp a(awt awt, long j2, long j3) {
        this.F = true;
        return this.r.a(awt, j2, j3, n());
    }

    public static final void b(akw akw) {
        try {
            akw.a.a(akw.b, akw.c);
        } finally {
            akw.a(true);
        }
    }

    private final void a(akx akx) {
        ajf ajf = this.m;
        if (akx == ajf.c) {
            ajf.d = null;
            ajf.c = null;
            ajf.e = true;
        }
        b(akx);
        akx.m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02f9, code lost:
        if (g() != false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x033c, code lost:
        if (r2 < r11) goto L_0x034c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0214  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void f() {
        /*
            r25 = this;
            r6 = r25
            long r7 = android.os.SystemClock.uptimeMillis()
            awv r0 = r6.s
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 1
            r15 = 0
            if (r0 != 0) goto L_0x0013
            goto L_0x0224
        L_0x0013:
            int r1 = r6.B
            if (r1 > 0) goto L_0x0221
            akn r0 = r6.p
            long r1 = r6.D
            r0.a(r1)
            akn r0 = r6.p
            akl r1 = r0.f
            if (r1 != 0) goto L_0x0025
            goto L_0x0041
        L_0x0025:
            akm r2 = r1.f
            boolean r2 = r2.g
            if (r2 != 0) goto L_0x00e4
            boolean r1 = r1.b()
            if (r1 == 0) goto L_0x00e4
            akl r1 = r0.f
            akm r1 = r1.f
            long r1 = r1.e
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x00e4
            int r0 = r0.g
            r1 = 100
            if (r0 >= r1) goto L_0x00e4
        L_0x0041:
            akn r0 = r6.p
            long r1 = r6.D
            akp r3 = r6.r
            akl r4 = r0.f
            if (r4 == 0) goto L_0x0050
            akm r0 = r0.a(r4, r1)
            goto L_0x005a
        L_0x0050:
            awt r1 = r3.b
            long r4 = r3.d
            long r2 = r3.c
            akm r0 = r0.a(r1, r2)
        L_0x005a:
            if (r0 == 0) goto L_0x00c8
            akn r1 = r6.p
            aky[] r2 = r6.d
            bgq r3 = r6.e
            akk r4 = r6.g
            ajd r4 = (defpackage.ajd) r4
            bhz r4 = r4.a
            awv r5 = r6.s
            bgr r13 = r6.f
            akl r9 = r1.f
            if (r9 == 0) goto L_0x007e
            long r11 = r9.j
            akm r9 = r9.f
            long r9 = r9.e
            long r11 = r11 + r9
            long r9 = r0.b
            long r9 = r11 - r9
            r18 = r9
            goto L_0x0086
        L_0x007e:
            awt r9 = r0.a
            boolean r9 = r9.a()
            r18 = 0
        L_0x0086:
            akl r9 = new akl
            r16 = r9
            r17 = r2
            r20 = r3
            r21 = r4
            r22 = r5
            r23 = r0
            r24 = r13
            r16.<init>(r17, r18, r20, r21, r22, r23, r24)
            akl r2 = r1.f
            if (r2 == 0) goto L_0x00a1
            r2.a(r9)
            goto L_0x00a5
        L_0x00a1:
            r1.d = r9
            r1.e = r9
        L_0x00a5:
            r2 = 0
            r1.h = r2
            r1.f = r9
            int r2 = r1.g
            int r2 = r2 + r14
            r1.g = r2
            aws r1 = r9.a
            long r2 = r0.b
            r1.a(r6, r2)
            akn r0 = r6.p
            akl r0 = r0.d
            if (r0 != r9) goto L_0x00c3
            long r0 = r9.a()
            r6.a(r0)
        L_0x00c3:
            r6.b(r15)
            goto L_0x00e4
        L_0x00c8:
            akn r0 = r6.p
            akl r0 = r0.f
            if (r0 == 0) goto L_0x00df
            akx[] r0 = r6.t
            int r1 = r0.length
            r2 = 0
        L_0x00d2:
            if (r2 >= r1) goto L_0x00df
            r3 = r0[r2]
            boolean r3 = r3.g()
            if (r3 == 0) goto L_0x00e4
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x00df:
            awv r0 = r6.s
            r0.d()
        L_0x00e4:
            boolean r0 = r6.x
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r25.l()
            r6.x = r0
            r25.m()
            goto L_0x00f5
        L_0x00f2:
            r25.k()
        L_0x00f5:
            akn r0 = r6.p
            akl r0 = r0.e
            if (r0 == 0) goto L_0x01ba
            akl r1 = r0.g
            if (r1 != 0) goto L_0x012b
            akm r1 = r0.f
            boolean r1 = r1.g
            if (r1 != 0) goto L_0x0107
            goto L_0x01ba
        L_0x0107:
            r1 = 0
        L_0x0109:
            akx[] r2 = r6.c
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0129
            r2 = r2[r1]
            axx[] r3 = r0.c
            r3 = r3[r1]
            if (r3 != 0) goto L_0x0117
            goto L_0x0126
        L_0x0117:
            axx r4 = r2.f()
            if (r4 != r3) goto L_0x0126
            boolean r3 = r2.g()
            if (r3 == 0) goto L_0x0126
            r2.i()
        L_0x0126:
            int r1 = r1 + 1
            goto L_0x0109
        L_0x0129:
            goto L_0x01ba
        L_0x012b:
            boolean r1 = r25.i()
            if (r1 == 0) goto L_0x01ba
            akl r1 = r0.g
            boolean r1 = r1.d
            if (r1 == 0) goto L_0x01ba
            bgr r0 = r0.i
            akn r1 = r6.p
            akl r2 = r1.e
            if (r2 == 0) goto L_0x0147
            akl r2 = r2.g
            if (r2 == 0) goto L_0x0145
            r2 = 1
            goto L_0x0148
        L_0x0145:
        L_0x0147:
            r2 = 0
        L_0x0148:
            defpackage.bks.b(r2)
            akl r2 = r1.e
            akl r2 = r2.g
            r1.e = r2
            akl r1 = r1.e
            bgr r2 = r1.i
            aws r3 = r1.a
            long r3 = r3.c()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x016a
            r25.j()
            r0 = 0
            goto L_0x01bb
        L_0x016a:
            r3 = 0
        L_0x016b:
            akx[] r4 = r6.c
            int r5 = r4.length
            if (r3 >= r5) goto L_0x01b9
            r4 = r4[r3]
            boolean r5 = r0.a(r3)
            if (r5 != 0) goto L_0x0179
            goto L_0x01b6
        L_0x0179:
            boolean r5 = r4.j()
            if (r5 != 0) goto L_0x01b6
            bgm r5 = r2.c
            bgl r5 = r5.a(r3)
            boolean r9 = r2.a(r3)
            aky[] r10 = r6.d
            r10 = r10[r3]
            int r10 = r10.a()
            akz[] r11 = r0.b
            r11 = r11[r3]
            akz[] r12 = r2.b
            r12 = r12[r3]
            if (r9 == 0) goto L_0x01b3
            boolean r9 = r12.equals(r11)
            if (r9 == 0) goto L_0x01b3
            r9 = 6
            if (r10 != r9) goto L_0x01a5
            goto L_0x01b3
        L_0x01a5:
            akh[] r5 = a(r5)
            axx[] r9 = r1.c
            r9 = r9[r3]
            long r10 = r1.j
            r4.a(r5, r9, r10)
            goto L_0x01b6
        L_0x01b3:
            r4.i()
        L_0x01b6:
            int r3 = r3 + 1
            goto L_0x016b
        L_0x01b9:
        L_0x01ba:
            r0 = 0
        L_0x01bb:
            boolean r1 = r6.v
            if (r1 == 0) goto L_0x0224
            akn r1 = r6.p
            akl r2 = r1.d
            if (r2 == 0) goto L_0x0224
            akl r3 = r2.g
            if (r3 == 0) goto L_0x0224
            akl r1 = r1.e
            if (r2 == r1) goto L_0x01ce
            goto L_0x01d4
        L_0x01ce:
            boolean r1 = r25.i()
            if (r1 == 0) goto L_0x0224
        L_0x01d4:
            long r1 = r6.D
            long r3 = r3.a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0224
            if (r0 != 0) goto L_0x01e1
            goto L_0x01e4
        L_0x01e1:
            r25.b()
        L_0x01e4:
            akn r0 = r6.p
            akl r9 = r0.d
            akl r0 = r0.e
            if (r9 == r0) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            r25.j()
        L_0x01f0:
            akn r0 = r6.p
            akl r0 = r0.a()
            r6.a(r9)
            akm r0 = r0.f
            awt r1 = r0.a
            long r2 = r0.b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r25
            akp r0 = r0.a(r1, r2, r4)
            r6.r = r0
            akm r0 = r9.f
            boolean r0 = r0.f
            if (r0 != 0) goto L_0x0214
            r0 = 3
            goto L_0x0216
        L_0x0214:
            r0 = 0
        L_0x0216:
            akc r1 = r6.n
            r1.b(r0)
            r25.e()
            r0 = 1
            goto L_0x01bb
        L_0x0221:
            r0.d()
        L_0x0224:
            akp r0 = r6.r
            int r0 = r0.e
            if (r0 != r14) goto L_0x022c
            goto L_0x03b3
        L_0x022c:
            r1 = 4
            if (r0 == r1) goto L_0x03b3
            akn r0 = r6.p
            akl r0 = r0.d
            if (r0 == 0) goto L_0x03ad
            java.lang.String r4 = "doSomeWork"
            defpackage.blk.a(r4)
            r25.e()
            boolean r4 = r0.d
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x02b5
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 * r9
            aws r11 = r0.a
            akp r12 = r6.r
            long r12 = r12.m
            long r14 = r6.l
            long r12 = r12 - r14
            r11.d(r12)
            r11 = 0
            r12 = 1
            r14 = 1
        L_0x0258:
            akx[] r13 = r6.c
            int r15 = r13.length
            if (r11 >= r15) goto L_0x02b2
            r13 = r13[r11]
            int r15 = r13.d()
            if (r15 == 0) goto L_0x02ad
            long r2 = r6.D
            r13.a(r2, r4)
            if (r12 == 0) goto L_0x0275
            boolean r2 = r13.w()
            if (r2 == 0) goto L_0x0274
            r12 = 1
            goto L_0x0276
        L_0x0274:
        L_0x0275:
            r12 = 0
        L_0x0276:
            axx[] r2 = r0.c
            r2 = r2[r11]
            axx r3 = r13.f()
            if (r2 != r3) goto L_0x028c
            akl r15 = r0.g
            if (r15 == 0) goto L_0x028c
            boolean r15 = r13.g()
            if (r15 == 0) goto L_0x028c
            r15 = 1
            goto L_0x028d
        L_0x028c:
            r15 = 0
        L_0x028d:
            if (r2 == r3) goto L_0x0291
        L_0x028f:
            r2 = 1
            goto L_0x02a0
        L_0x0291:
            if (r15 != 0) goto L_0x028f
            boolean r2 = r13.v()
            if (r2 != 0) goto L_0x028f
            boolean r2 = r13.w()
            if (r2 != 0) goto L_0x028f
            r2 = 0
        L_0x02a0:
            if (r14 != 0) goto L_0x02a4
        L_0x02a2:
            r14 = 0
            goto L_0x02a7
        L_0x02a4:
            if (r2 == 0) goto L_0x02a2
            r14 = 1
        L_0x02a7:
            if (r2 != 0) goto L_0x02ad
            r13.k()
            goto L_0x02ae
        L_0x02ad:
        L_0x02ae:
            int r11 = r11 + 1
            goto L_0x0258
        L_0x02b2:
            r16 = r12
            goto L_0x02be
        L_0x02b5:
            aws r2 = r0.a
            r2.a()
            r14 = 1
            r16 = 1
        L_0x02be:
            akm r2 = r0.f
            long r2 = r2.e
            r4 = 2
            if (r16 != 0) goto L_0x02c6
            goto L_0x02e9
        L_0x02c6:
            boolean r5 = r0.d
            if (r5 == 0) goto L_0x02e9
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x02db
            akp r5 = r6.r
            long r11 = r5.m
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x02e9
        L_0x02db:
            akm r0 = r0.f
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x02e9
            r6.a(r1)
            r25.d()
            goto L_0x036b
        L_0x02e9:
            akp r0 = r6.r
            int r2 = r0.e
            if (r2 == r4) goto L_0x02f0
            goto L_0x034c
        L_0x02f0:
            akx[] r2 = r6.t
            int r2 = r2.length
            if (r2 != 0) goto L_0x02fc
            boolean r0 = r25.g()
            if (r0 == 0) goto L_0x034c
            goto L_0x033f
        L_0x02fc:
            if (r14 == 0) goto L_0x034c
            boolean r0 = r0.g
            if (r0 == 0) goto L_0x033f
            akn r0 = r6.p
            akl r0 = r0.f
            boolean r2 = r0.b()
            if (r2 != 0) goto L_0x030d
        L_0x030c:
            goto L_0x0314
        L_0x030d:
            akm r0 = r0.f
            boolean r0 = r0.g
            if (r0 != 0) goto L_0x033f
            goto L_0x030c
        L_0x0314:
            akk r0 = r6.g
            long r2 = r25.n()
            ajf r5 = r6.m
            akq r5 = r5.Q()
            float r5 = r5.b
            boolean r11 = r6.w
            long r2 = defpackage.blm.b(r2, r5)
            if (r11 == 0) goto L_0x032f
            ajd r0 = (defpackage.ajd) r0
            long r11 = r0.f
            goto L_0x0333
        L_0x032f:
            ajd r0 = (defpackage.ajd) r0
            long r11 = r0.e
        L_0x0333:
            r15 = 0
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x033f
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x033f
            goto L_0x034c
        L_0x033f:
            r0 = 3
            r6.a(r0)
            boolean r0 = r6.v
            if (r0 == 0) goto L_0x036b
            r25.c()
            goto L_0x036b
        L_0x034c:
            akp r0 = r6.r
            int r0 = r0.e
            r2 = 3
            if (r0 != r2) goto L_0x036b
            akx[] r0 = r6.t
            int r0 = r0.length
            if (r0 != 0) goto L_0x035f
            boolean r0 = r25.g()
            if (r0 != 0) goto L_0x036b
            goto L_0x0361
        L_0x035f:
            if (r14 != 0) goto L_0x036b
        L_0x0361:
            boolean r0 = r6.v
            r6.w = r0
            r6.a(r4)
            r25.d()
        L_0x036b:
            akp r0 = r6.r
            int r0 = r0.e
            if (r0 != r4) goto L_0x037f
            akx[] r0 = r6.t
            int r2 = r0.length
            r3 = 0
        L_0x0375:
            if (r3 >= r2) goto L_0x037f
            r5 = r0[r3]
            r5.k()
            int r3 = r3 + 1
            goto L_0x0375
        L_0x037f:
            boolean r0 = r6.v
            if (r0 != 0) goto L_0x0384
            goto L_0x038b
        L_0x0384:
            akp r0 = r6.r
            int r0 = r0.e
            r2 = 3
            if (r0 == r2) goto L_0x0391
        L_0x038b:
            akp r0 = r6.r
            int r0 = r0.e
            if (r0 != r4) goto L_0x0392
        L_0x0391:
            goto L_0x03a4
        L_0x0392:
            akx[] r2 = r6.t
            int r2 = r2.length
            if (r2 != 0) goto L_0x0398
            goto L_0x039e
        L_0x0398:
            if (r0 == r1) goto L_0x039e
            r6.a(r7, r9)
            goto L_0x03a9
        L_0x039e:
            bkp r0 = r6.a
            r0.a()
            goto L_0x03a9
        L_0x03a4:
            r0 = 10
            r6.a(r7, r0)
        L_0x03a9:
            defpackage.blk.a()
            return
        L_0x03ad:
            r0 = 10
            r6.a(r7, r0)
            return
        L_0x03b3:
            bkp r0 = r6.a
            r0.a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake.f():void");
    }

    private final void a(boolean[] zArr, int i2) {
        int i3;
        boolean z2;
        bkr bkr;
        this.t = new akx[i2];
        bgr bgr = this.p.d.i;
        for (int i4 = 0; i4 < this.c.length; i4++) {
            if (!bgr.a(i4)) {
                this.c[i4].n();
            }
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < this.c.length) {
            if (bgr.a(i5)) {
                boolean z3 = zArr[i5];
                int i7 = i6 + 1;
                akl akl = this.p.d;
                akx akx = this.c[i5];
                this.t[i6] = akx;
                if (akx.d() == 0) {
                    bgr bgr2 = akl.i;
                    akz akz = bgr2.b[i5];
                    akh[] a2 = a(bgr2.c.a(i5));
                    boolean z4 = this.v && this.r.e == 3;
                    if (!z3 && z4) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    i3 = i5;
                    akx.a(akz, a2, akl.c[i5], this.D, z2, akl.j);
                    ajf ajf = this.m;
                    bkr c2 = akx.c();
                    if (!(c2 == null || c2 == (bkr = ajf.d))) {
                        if (bkr == null) {
                            ajf.d = c2;
                            ajf.c = akx;
                            ajf.d.a(ajf.a.a);
                        } else {
                            throw ajh.a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z4) {
                        akx.e();
                    }
                } else {
                    i3 = i5;
                }
                i6 = i7;
            } else {
                i3 = i5;
            }
            i5 = i3 + 1;
        }
    }

    private static final void b(akx akx) {
        if (akx.d() == 2) {
            akx.l();
        }
    }

    private static akh[] a(bgl bgl) {
        int f2 = bgl != null ? bgl.f() : 0;
        akh[] akhArr = new akh[f2];
        for (int i2 = 0; i2 < f2; i2++) {
            akhArr[i2] = bgl.a(i2);
        }
        return akhArr;
    }

    private final Pair a(alh alh, int i2) {
        return alh.a(this.j, this.k, i2, -9223372036854775807L);
    }

    private final long n() {
        return b(this.r.k);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    private final long b(long j2) {
        akl akl = this.p.f;
        if (akl != null) {
            return Math.max(0L, j2 - akl.b(this.D));
        }
        return 0;
    }

    private final void b(boolean z2) {
        akl akl;
        boolean z3;
        long j2;
        ake ake = this;
        akl akl2 = ake.p.f;
        awt awt = akl2 == null ? ake.r.b : akl2.f.a;
        boolean z4 = !ake.r.j.equals(awt);
        if (z4) {
            akp akp = ake.r;
            z3 = z4;
            akl = akl2;
            akp akp2 = akp;
            akp akp3 = new akp(akp.a, akp.b, akp.c, akp.d, akp.e, akp.f, akp.g, akp.h, akp.i, awt, akp2.k, akp2.l, akp2.m);
            ake = this;
            ake.r = akp3;
        } else {
            akl = akl2;
            z3 = z4;
        }
        akp akp4 = ake.r;
        if (akl != null) {
            j2 = akl.c();
        } else {
            j2 = akp4.m;
        }
        akp4.k = j2;
        ake.r.l = n();
        if ((z3 || z2) && akl != null) {
            akl akl3 = akl;
            if (akl3.d) {
                ake.a(akl3.i);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v17, types: [bhn, bjf] */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ake.a(akd, boolean):android.util.Pair
     arg types: [akd, int]
     candidates:
      ake.a(awt, long):long
      ake.a(alh, int):android.util.Pair
      ake.a(long, long):void
      ake.a(akq, boolean):void
      ake.a(boolean[], int):void
      ake.a(awv, alh):void
      awu.a(awv, alh):void
      ake.a(akd, boolean):android.util.Pair */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ake.a(boolean, boolean, boolean):void
     arg types: [int, boolean, int]
     candidates:
      ake.a(awt, long, boolean):long
      ake.a(awt, long, long):akp
      ake.a(java.lang.Object, alh, alh):java.lang.Object
      ake.a(boolean, boolean, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ake.a(akq, boolean):void
     arg types: [akq, int]
     candidates:
      ake.a(awt, long):long
      ake.a(akd, boolean):android.util.Pair
      ake.a(alh, int):android.util.Pair
      ake.a(long, long):void
      ake.a(boolean[], int):void
      ake.a(awv, alh):void
      awu.a(awv, alh):void
      ake.a(akq, boolean):void */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ake.a(boolean, boolean, boolean):void
     arg types: [int, int, int]
     candidates:
      ake.a(awt, long, boolean):long
      ake.a(awt, long, long):akp
      ake.a(java.lang.Object, alh, alh):java.lang.Object
      ake.a(boolean, boolean, boolean):void */
    /* JADX WARNING: Code restructure failed: missing block: B:237:0x048d, code lost:
        if (r1 == false) goto L_0x048f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x048f, code lost:
        r7.a(false);
     */
    /* JADX WARNING: Removed duplicated region for block: B:231:0x0473 A[Catch:{ all -> 0x0637, all -> 0x0518, all -> 0x00c3, ajh -> 0x070b, IOException -> 0x06ec, OutOfMemoryError | RuntimeException -> 0x06bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x0474 A[Catch:{ all -> 0x0637, all -> 0x0518, all -> 0x00c3, ajh -> 0x070b, IOException -> 0x06ec, OutOfMemoryError | RuntimeException -> 0x06bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:333:0x0630 A[Catch:{ all -> 0x0637, all -> 0x0518, all -> 0x00c3, ajh -> 0x070b, IOException -> 0x06ec, OutOfMemoryError | RuntimeException -> 0x06bc }] */
    /* JADX WARNING: Removed duplicated region for block: B:367:0x06cb  */
    /* JADX WARNING: Removed duplicated region for block: B:368:0x06d3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r36) {
        /*
            r35 = this;
            r7 = r35
            r1 = r36
            r8 = 0
            r9 = 1
            int r2 = r1.what     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3 = 0
            r10 = 4
            r13 = 2
            switch(r2) {
                case 0: goto L_0x067e;
                case 1: goto L_0x0650;
                case 2: goto L_0x064c;
                case 3: goto L_0x0547;
                case 4: goto L_0x0532;
                case 5: goto L_0x052a;
                case 6: goto L_0x051c;
                case 7: goto L_0x04f5;
                case 8: goto L_0x0285;
                case 9: goto L_0x0211;
                case 10: goto L_0x01f9;
                case 11: goto L_0x00fb;
                case 12: goto L_0x00e4;
                case 13: goto L_0x00c7;
                case 14: goto L_0x008e;
                case 15: goto L_0x0085;
                case 16: goto L_0x005b;
                case 17: goto L_0x0011;
                default: goto L_0x000e;
            }     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x000e:
            r1 = 0
            return r1
        L_0x0011:
            java.lang.Object r2 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r2 = (defpackage.akq) r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x001d
        L_0x001b:
            r1 = 0
        L_0x001d:
            android.os.Handler r3 = r7.i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.os.Message r1 = r3.obtainMessage(r9, r1, r8, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.sendToTarget()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            float r1 = r2.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r3 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r3 = r3.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x002c:
            if (r3 != 0) goto L_0x0041
            akx[] r1 = r7.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r3 = r1.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r4 = 0
        L_0x0032:
            if (r4 >= r3) goto L_0x06b7
            r5 = r1[r4]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            float r6 = r2.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r5.a(r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x003e:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0041:
            bgr r4 = r3.i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgm r4 = r4.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgl[] r4 = r4.a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r5 = r4.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r6 = 0
        L_0x004b:
            if (r6 >= r5) goto L_0x0058
            r10 = r4[r6]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r10 != 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            r10.a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0055:
            int r6 = r6 + 1
            goto L_0x004b
        L_0x0058:
            akl r3 = r3.g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x002c
        L_0x005b:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akw r1 = (defpackage.akw) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.os.Handler r2 = r1.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.os.Looper r3 = r2.getLooper()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Thread r3 = r3.getThread()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r3 = r3.isAlive()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r3 == 0) goto L_0x0079
            ajz r3 = new ajz     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3.<init>(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.post(r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0079:
            java.lang.String r2 = "TAG"
            java.lang.String r3 = "Trying to send message on a dead thread."
            android.util.Log.w(r2, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.a(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0085:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akw r1 = (defpackage.akw) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.c(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x008e:
            int r2 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 == 0) goto L_0x0094
            r2 = 1
            goto L_0x0096
        L_0x0094:
            r2 = 0
        L_0x0096:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.util.concurrent.atomic.AtomicBoolean r1 = (java.util.concurrent.atomic.AtomicBoolean) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r3 = r7.A     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r3 == r2) goto L_0x00b7
            r7.A = r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != 0) goto L_0x00b7
            akx[] r2 = r7.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r3 = r2.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r4 = 0
        L_0x00a6:
            if (r4 >= r3) goto L_0x00b7
            r5 = r2[r4]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r6 = r5.d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r5.n()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x00b4:
            int r4 = r4 + 1
            goto L_0x00a6
        L_0x00b7:
            if (r1 == 0) goto L_0x06b7
            monitor-enter(r35)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.set(r9)     // Catch:{ all -> 0x00c3 }
            r35.notifyAll()     // Catch:{ all -> 0x00c3 }
            monitor-exit(r35)     // Catch:{ all -> 0x00c3 }
            goto L_0x06b7
        L_0x00c3:
            r0 = move-exception
            r1 = r0
            monitor-exit(r35)     // Catch:{ all -> 0x00c3 }
            throw r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x00c7:
            int r1 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x00cd
            r1 = 1
            goto L_0x00cf
        L_0x00cd:
            r1 = 0
        L_0x00cf:
            r7.z = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.c = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r2.b()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != 0) goto L_0x00de
            r7.a(r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x00de:
            r7.b(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x00e4:
            int r1 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.y = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.b = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r2.b()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != 0) goto L_0x00f5
            r7.a(r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x00f5:
            r7.b(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x00fb:
            ajf r1 = r7.m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r1 = r1.Q()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            float r1 = r1.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r3 = r2.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r2 = r2.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r4 = 1
        L_0x010a:
            if (r3 == 0) goto L_0x06b7
            boolean r5 = r3.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 == 0) goto L_0x06b7
            akp r5 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alh r5 = r5.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r15 = r3.a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r5 = r3.i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 == 0) goto L_0x013d
            bgm r6 = r5.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r6 = r6.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgm r11 = r15.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r11 = r11.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 != r11) goto L_0x013d
            r6 = 0
        L_0x0127:
            bgm r11 = r15.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r11 = r11.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 >= r11) goto L_0x0136
            boolean r11 = r15.a(r5, r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r11 == 0) goto L_0x013d
            int r6 = r6 + 1
            goto L_0x0127
        L_0x0136:
            if (r3 == r2) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r4 = 0
        L_0x013a:
            akl r3 = r3.g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x010a
        L_0x013d:
            if (r4 != 0) goto L_0x015a
            akn r1 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.a(r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r3.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x01b3
            akm r1 = r3.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r1 = r1.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r7.D     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r3.b(r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3.a(r15, r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x01b3
        L_0x015a:
            akn r1 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r11 = r1.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r18 = r1.a(r11)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akx[] r1 = r7.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean[] r12 = new boolean[r1]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r1 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r1 = r1.m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r14 = r11
            r16 = r1
            r19 = r12
            long r14 = r14.a(r15, r16, r18, r19)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r1 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r2 = r1.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != r10) goto L_0x017b
        L_0x017a:
            goto L_0x0198
        L_0x017b:
            long r1 = r1.m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x017a
            akp r1 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r1.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r5 = r1.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = r35
            r3 = r14
            akp r1 = r1.a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akc r1 = r7.n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.b(r10)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.a(r14)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0198:
            akx[] r1 = r7.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean[] r1 = new boolean[r1]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 0
            r3 = 0
        L_0x019f:
            akx[] r4 = r7.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r5 = r4.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 < r5) goto L_0x01ca
            akp r2 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aye r4 = r11.h     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r5 = r11.i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r2.a(r4, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.r = r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.a(r1, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x01b3:
            r7.b(r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r1 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == r10) goto L_0x06b7
            r35.k()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r35.e()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bkp r1 = r7.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x01ca:
            r4 = r4[r2]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r5 = r4.d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 == 0) goto L_0x01d4
            r5 = 1
            goto L_0x01d6
        L_0x01d4:
            r5 = 0
        L_0x01d6:
            r1[r2] = r5     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            axx[] r6 = r11.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r6 = r6[r2]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == 0) goto L_0x01e0
            int r3 = r3 + 1
        L_0x01e0:
            if (r5 != 0) goto L_0x01e3
            goto L_0x01f6
        L_0x01e3:
            axx r5 = r4.f()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 != r5) goto L_0x01f3
            boolean r5 = r12[r2]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 == 0) goto L_0x01f6
            long r5 = r7.D     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r4.a(r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x01f6
        L_0x01f3:
            r7.a(r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x01f6:
            int r2 = r2 + 1
            goto L_0x019f
        L_0x01f9:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aws r1 = (defpackage.aws) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r2.a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x06b7
            akn r1 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r2 = r7.D     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r35.k()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0211:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aws r1 = (defpackage.aws) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r2.a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x06b7
            akn r1 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r1 = r1.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajf r2 = r7.m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r2 = r2.Q()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            float r2 = r2.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r4 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alh r4 = r4.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.d = r9     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aws r4 = r1.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aye r4 = r4.b()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.h = r4     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r2 = r1.a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akm r4 = r1.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r4.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r12 = r1.a(r2, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r1.j     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akm r2 = r1.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r10 = r2.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r14 = r10 - r12
            long r4 = r4 + r14
            r1.j = r4     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0269
            akm r4 = new akm     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r11 = r2.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r14 = r2.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r5 = r2.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r10 = r2.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r2 = r2.g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r18 = r10
            r10 = r4
            r16 = r5
            r19 = r2
            r10.<init>(r11, r12, r14, r16, r18, r19)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = r4
        L_0x0269:
            r1.f = r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r2 = r1.i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r2 = r2.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != r2) goto L_0x0280
            akm r1 = r1.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r1 = r1.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.a(r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0280:
            r35.k()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0285:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aka r1 = (defpackage.aka) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awv r2 = r1.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awv r6 = r7.s     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != r6) goto L_0x06b7
            akc r2 = r7.n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r6 = r7.B     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.a(r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.B = r8     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alh r6 = r2.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alh r1 = r1.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r10 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r10.a = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r10 = new akp     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r15 = r2.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r13 = r2.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r2.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r8 = r2.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajh r11 = r2.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r12 = r2.g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aye r3 = r2.h     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r9 = r2.i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r36 = r6
            awt r6 = r2.j     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r25 = r6
            long r6 = r2.k     // Catch:{ ajh -> 0x04f0, IOException -> 0x04eb, RuntimeException -> 0x04e6, OutOfMemoryError -> 0x04e4 }
            r26 = r6
            long r6 = r2.l     // Catch:{ ajh -> 0x04f0, IOException -> 0x04eb, RuntimeException -> 0x04e6, OutOfMemoryError -> 0x04e4 }
            r28 = r6
            long r6 = r2.m     // Catch:{ ajh -> 0x04f0, IOException -> 0x04eb, RuntimeException -> 0x04e6, OutOfMemoryError -> 0x04e4 }
            r16 = r13
            r13 = r10
            r14 = r1
            r18 = r4
            r20 = r8
            r21 = r11
            r22 = r12
            r23 = r3
            r24 = r9
            r30 = r6
            r13.<init>(r14, r15, r16, r18, r20, r21, r22, r23, r24, r25, r26, r28, r30)     // Catch:{ ajh -> 0x04f0, IOException -> 0x04eb, RuntimeException -> 0x04e6, OutOfMemoryError -> 0x04e4 }
            r7 = r35
            r7.r = r10     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.util.ArrayList r2 = r7.o     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r2 = r2.size()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3 = -1
            int r2 = r2 + r3
            if (r2 >= 0) goto L_0x04d9
            java.util.ArrayList r2 = r7.o     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.util.Collections.sort(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r4 = r2.a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r4 != 0) goto L_0x02fb
            akp r4 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r4.m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x02ff
        L_0x02fb:
            akp r4 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r4.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x02ff:
            akd r6 = r7.C     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == 0) goto L_0x0325
            r1 = 1
            android.util.Pair r2 = r7.a(r6, r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = 0
            r7.C = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 == 0) goto L_0x0320
            java.lang.Object r1 = r2.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r8 = r1.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r1 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r2 = r2.first     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r1.a(r2, r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = r1
            goto L_0x03b5
        L_0x0320:
            r35.h()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0325:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x035f
            boolean r6 = r1.c()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == 0) goto L_0x0335
            goto L_0x035f
        L_0x0335:
            int r2 = r1.d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.util.Pair r1 = r7.a(r1, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r3 = r1.first     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r6 = r1.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r8 = r6.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.a(r3, r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r3 = r2.a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r3 != 0) goto L_0x035c
            java.lang.Object r1 = r1.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r8 = r1.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x035d
        L_0x035c:
            r8 = r4
        L_0x035d:
            goto L_0x03b5
        L_0x035f:
            java.lang.Object r6 = r2.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r6 = r1.a(r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == r3) goto L_0x038e
            akn r1 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r2 = r2.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r1.a(r2, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r2 = r2.a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != 0) goto L_0x038b
            boolean r2 = r1.a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != 0) goto L_0x038b
            akp r1 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r1.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = r1
            r8 = r4
            goto L_0x03b5
        L_0x038b:
            r2 = r1
            r8 = r4
            goto L_0x03b5
        L_0x038e:
            java.lang.Object r2 = r2.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3 = r36
            java.lang.Object r2 = r7.a(r2, r3, r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 == 0) goto L_0x04d4
            alf r3 = r7.k     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.a(r2, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 0
            android.util.Pair r1 = r7.a(r1, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r2 = r1.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r2 = r2.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r6 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r1 = r1.first     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r6.a(r1, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r8 = r2
            r2 = r1
        L_0x03b5:
            akp r1 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r1.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r1.equals(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != 0) goto L_0x03c1
            goto L_0x0495
        L_0x03c1:
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0495
            akn r1 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r2 = r7.D     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r4 = r1.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r5 = -9223372036854775808
            if (r4 != 0) goto L_0x03d2
            r32 = 0
            goto L_0x0412
        L_0x03d2:
            long r8 = r4.j     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r10 = r4.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r10 == 0) goto L_0x0410
            r9 = r8
            r8 = 0
        L_0x03da:
            akx[] r11 = r7.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r12 = r11.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r8 >= r12) goto L_0x040d
            r11 = r11[r8]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r11 = r11.d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r11 == 0) goto L_0x0405
            akx[] r11 = r7.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r11 = r11[r8]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            axx r11 = r11.f()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            axx[] r12 = r4.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r12 = r12[r8]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r11 != r12) goto L_0x0405
            akx[] r11 = r7.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r11 = r11[r8]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r11 = r11.h()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r13 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r13 == 0) goto L_0x0406
            long r9 = java.lang.Math.max(r11, r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0405:
            goto L_0x0409
        L_0x0406:
            r32 = r5
            goto L_0x0412
        L_0x0409:
            int r8 = r8 + 1
            goto L_0x03da
        L_0x040d:
            r32 = r9
            goto L_0x0412
        L_0x0410:
            r32 = r8
        L_0x0412:
            akl r4 = r1.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r8 = 0
        L_0x0415:
            if (r4 == 0) goto L_0x04cd
            akm r9 = r4.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r8 != 0) goto L_0x0420
            akm r8 = r1.a(r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x0439
        L_0x0420:
            akm r10 = r1.a(r8, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r10 == 0) goto L_0x0487
            long r11 = r9.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r13 = r10.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0480
            awt r11 = r9.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r12 = r10.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r11 = r11.equals(r12)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r11 == 0) goto L_0x0480
            r8 = r10
        L_0x0439:
            r4.f = r8     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r9 = r9.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r11 = r8.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r13 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r8 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r8 != 0) goto L_0x0449
        L_0x0448:
            goto L_0x0477
        L_0x0449:
            int r8 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r8 == 0) goto L_0x0448
            int r2 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x0456
            long r2 = r4.a(r11)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x045b
        L_0x0456:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x045b:
            akl r8 = r1.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r4 != r8) goto L_0x046c
            int r8 = (r32 > r5 ? 1 : (r32 == r5 ? 0 : -1))
            if (r8 == 0) goto L_0x046a
            int r5 = (r32 > r2 ? 1 : (r32 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x0468
            goto L_0x046a
        L_0x0468:
            goto L_0x046c
        L_0x046a:
            r2 = 1
            goto L_0x046d
        L_0x046c:
            r2 = 0
        L_0x046d:
            boolean r1 = r1.a(r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x0474
            goto L_0x048f
        L_0x0474:
            if (r2 != 0) goto L_0x048f
            goto L_0x04cd
        L_0x0477:
            akl r8 = r4.g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r34 = r8
            r8 = r4
            r4 = r34
            goto L_0x0415
        L_0x0480:
            boolean r1 = r1.a(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            r1 = r1 ^ r2
            goto L_0x048d
        L_0x0487:
            boolean r1 = r1.a(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            r1 = r1 ^ r2
        L_0x048d:
            if (r1 != 0) goto L_0x04cd
        L_0x048f:
            r1 = 0
            r7.a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x04cd
        L_0x0495:
            akn r1 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r1 = r1.d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x04b5
        L_0x049b:
        L_0x049c:
            akl r1 = r1.g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x04b5
            akm r3 = r1.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r3 = r3.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r3 = r3.equals(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r3 == 0) goto L_0x049c
            akn r3 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akm r4 = r1.f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akm r3 = r3.a(r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.f = r3     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x049b
        L_0x04b5:
            boolean r1 = r2.a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != 0) goto L_0x04bd
            r3 = r8
            goto L_0x04c0
        L_0x04bd:
            r3 = 0
        L_0x04c0:
            long r3 = r7.a(r2, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = r35
            r5 = r8
            akp r1 = r1.a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x04cd:
            r1 = 0
            r7.b(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x04d4:
            r35.h()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x04d9:
            java.util.ArrayList r1 = r7.o     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akb r1 = (defpackage.akb) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = 0
            throw r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x04e4:
            r0 = move-exception
            goto L_0x04e7
        L_0x04e6:
            r0 = move-exception
        L_0x04e7:
            r7 = r35
            goto L_0x06bf
        L_0x04eb:
            r0 = move-exception
            r7 = r35
            goto L_0x06ed
        L_0x04f0:
            r0 = move-exception
            r7 = r35
            goto L_0x070c
        L_0x04f5:
            r2 = 1
            r3 = 1
            r4 = 1
            r5 = 1
            r6 = 0
            r1 = r35
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akk r1 = r7.g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajd r1 = (defpackage.ajd) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            r1.a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.os.HandlerThread r1 = r7.b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.quit()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            monitor-enter(r35)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = 1
            r7.u = r1     // Catch:{ all -> 0x0518 }
            r35.notifyAll()     // Catch:{ all -> 0x0518 }
            monitor-exit(r35)     // Catch:{ all -> 0x0518 }
            return r1
        L_0x0518:
            r0 = move-exception
            r1 = r0
            monitor-exit(r35)     // Catch:{ all -> 0x0518 }
            throw r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x051c:
            int r1 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x0522
            r1 = 1
            goto L_0x0523
        L_0x0522:
            r1 = 0
        L_0x0523:
            r2 = 0
            r3 = 1
            r7.a(r2, r1, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x052a:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alb r1 = (defpackage.alb) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.q = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0532:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r1 = (defpackage.akq) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajf r2 = r7.m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajf r1 = r7.m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r1 = r1.Q()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            r7.a(r1, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0547:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akd r1 = (defpackage.akd) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akc r2 = r7.n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3 = 1
            r2.a(r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.util.Pair r2 = r7.a(r1, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 == 0) goto L_0x058e
            java.lang.Object r3 = r2.first     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r4 = r2.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r4.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r6 = r7.p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r3 = r6.a(r3, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r6 = r3.a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 != 0) goto L_0x0588
            java.lang.Object r2 = r2.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r8 = r2.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r11 = r1.c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r11 > r14 ? 1 : (r11 == r14 ? 0 : -1))
            if (r2 != 0) goto L_0x0582
            r2 = 1
            goto L_0x0584
        L_0x0582:
            r2 = 0
        L_0x0584:
            r12 = r2
            r11 = r3
            r14 = r4
            goto L_0x05a5
        L_0x0588:
            r11 = r3
            r14 = r4
            r8 = 0
            r12 = 1
            goto L_0x05a5
        L_0x058e:
            akp r2 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alg r3 = r7.j     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alf r4 = r7.k     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.a(r3, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r11 = r2
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 1
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x05a5:
            awv r2 = r7.s     // Catch:{ all -> 0x0637 }
            if (r2 == 0) goto L_0x061f
            int r2 = r7.B     // Catch:{ all -> 0x0637 }
            if (r2 > 0) goto L_0x061f
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x060f
            akp r1 = r7.r     // Catch:{ all -> 0x0637 }
            awt r1 = r1.b     // Catch:{ all -> 0x0637 }
            boolean r1 = r11.equals(r1)     // Catch:{ all -> 0x0637 }
            if (r1 == 0) goto L_0x05ff
            akn r1 = r7.p     // Catch:{ all -> 0x0637 }
            akl r1 = r1.d     // Catch:{ all -> 0x0637 }
            if (r1 == 0) goto L_0x05d9
            boolean r2 = r1.d     // Catch:{ all -> 0x0637 }
            if (r2 == 0) goto L_0x05d9
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x05d9
            aws r1 = r1.a     // Catch:{ all -> 0x0637 }
            alb r2 = r7.q     // Catch:{ all -> 0x0637 }
            long r1 = r1.a(r8, r2)     // Catch:{ all -> 0x0637 }
            goto L_0x05db
        L_0x05d9:
            r1 = r8
        L_0x05db:
            long r3 = defpackage.aja.a(r1)     // Catch:{ all -> 0x0637 }
            akp r5 = r7.r     // Catch:{ all -> 0x0637 }
            long r5 = r5.m     // Catch:{ all -> 0x0637 }
            long r5 = defpackage.aja.a(r5)     // Catch:{ all -> 0x0637 }
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x05fe
            akp r1 = r7.r     // Catch:{ all -> 0x0637 }
            long r3 = r1.m     // Catch:{ all -> 0x0637 }
            r1 = r35
            r2 = r11
            r5 = r14
            akp r1 = r1.a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r12 == 0) goto L_0x06b7
            akc r1 = r7.n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x0632
        L_0x05fe:
            goto L_0x0600
        L_0x05ff:
            r1 = r8
        L_0x0600:
            long r1 = r7.a(r11, r1)     // Catch:{ all -> 0x0637 }
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x060a
            r3 = 1
            goto L_0x060c
        L_0x060a:
            r3 = 0
        L_0x060c:
            r12 = r12 | r3
            r3 = r1
            goto L_0x0624
        L_0x060f:
            r7.a(r10)     // Catch:{ all -> 0x0637 }
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1
            r1 = r35
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0637 }
            goto L_0x0623
        L_0x061f:
            r7.C = r1     // Catch:{ all -> 0x0637 }
        L_0x0623:
            r3 = r8
        L_0x0624:
            r1 = r35
            r2 = r11
            r5 = r14
            akp r1 = r1.a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r12 == 0) goto L_0x06b7
            akc r1 = r7.n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0632:
            r1.b(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0637:
            r0 = move-exception
            r10 = r0
            r1 = r35
            r2 = r11
            r3 = r8
            r5 = r14
            akp r1 = r1.a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r12 == 0) goto L_0x064b
            akc r1 = r7.n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.b(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x064b:
            throw r10     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x064c:
            r35.f()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0650:
            int r1 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x0656
            r1 = 1
            goto L_0x0658
        L_0x0656:
            r1 = 0
        L_0x0658:
            r2 = 0
            r7.w = r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.v = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x0677
            akp r1 = r7.r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 3
            if (r1 != r2) goto L_0x066f
            r35.c()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bkp r1 = r7.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x066f:
            if (r1 != r13) goto L_0x06b7
            bkp r1 = r7.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0677:
            r35.d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r35.e()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x067e:
            java.lang.Object r2 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r8 = r2
            awv r8 = (defpackage.awv) r8     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r2 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 == 0) goto L_0x0689
            r4 = 1
            goto L_0x068a
        L_0x0689:
            r4 = 0
        L_0x068a:
            int r1 = r1.arg2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x0690
            r5 = 1
            goto L_0x0692
        L_0x0690:
            r5 = 0
        L_0x0692:
            int r1 = r7.B     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            int r1 = r1 + r2
            r7.B = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 0
            r3 = 1
            r6 = 1
            r1 = r35
            r1.a(r2, r3, r4, r5, r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akk r1 = r7.g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajd r1 = (defpackage.ajd) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 0
            r1.a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.s = r8     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bhn r1 = r7.h     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r8.a(r7, r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bkp r1 = r7.a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x06b7:
            r35.b()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3 = 1
            goto L_0x0724
        L_0x06bc:
            r0 = move-exception
            goto L_0x06bf
        L_0x06be:
            r0 = move-exception
        L_0x06bf:
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Internal runtime error."
            android.util.Log.e(r2, r3, r1)
            boolean r2 = r1 instanceof java.lang.OutOfMemoryError
            if (r2 == 0) goto L_0x06d3
            java.lang.OutOfMemoryError r1 = (java.lang.OutOfMemoryError) r1
            ajh r2 = new ajh
            r2.<init>(r1)
            goto L_0x06d9
        L_0x06d3:
            java.lang.RuntimeException r1 = (java.lang.RuntimeException) r1
            ajh r2 = defpackage.ajh.a(r1)
        L_0x06d9:
            r1 = 0
            r3 = 1
            r7.a(r3, r1, r1)
            akp r1 = r7.r
            akp r1 = r1.a(r2)
            r7.r = r1
            r35.b()
            r3 = 1
            goto L_0x0724
        L_0x06ec:
            r0 = move-exception
        L_0x06ed:
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Source error."
            android.util.Log.e(r2, r3, r1)
            r2 = 0
            r7.a(r2, r2, r2)
            akp r2 = r7.r
            ajh r3 = new ajh
            r3.<init>(r1)
            akp r1 = r2.a(r3)
            r7.r = r1
            r35.b()
            r3 = 1
            goto L_0x0724
        L_0x070b:
            r0 = move-exception
        L_0x070c:
            r1 = r0
            java.lang.String r2 = "ExoPlayerImplInternal"
            java.lang.String r3 = "Playback error."
            android.util.Log.e(r2, r3, r1)
            r2 = 0
            r3 = 1
            r7.a(r3, r2, r2)
            akp r2 = r7.r
            akp r1 = r2.a(r1)
            r7.r = r1
            r35.b()
        L_0x0724:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake.handleMessage(android.os.Message):boolean");
    }

    private final void h() {
        if (this.r.e != 1) {
            a(4);
        }
        a(false, false, true, false, true);
    }

    private final boolean i() {
        akl akl = this.p.e;
        if (!akl.d) {
            return false;
        }
        int i2 = 0;
        while (true) {
            akx[] akxArr = this.c;
            if (i2 >= akxArr.length) {
                return true;
            }
            akx akx = akxArr[i2];
            axx axx = akl.c[i2];
            if (akx.f() != axx || (axx != null && !akx.g())) {
                return false;
            }
            i2++;
        }
        return false;
    }

    private final boolean l() {
        akl akl = this.p.f;
        return (akl == null || akl.d() == Long.MIN_VALUE) ? false : true;
    }

    private final boolean g() {
        akl akl = this.p.d;
        long j2 = akl.f.e;
        if (akl.d) {
            return j2 == -9223372036854775807L || this.r.m < j2;
        }
        return false;
    }

    private final void k() {
        long j2;
        boolean z2 = false;
        if (l()) {
            long b2 = b(this.p.f.d());
            float f2 = this.m.Q().b;
            ajd ajd = (ajd) this.g;
            int d2 = ajd.a.d();
            int i2 = ajd.h;
            if (ajd.j) {
                j2 = ajd.c;
            } else {
                j2 = ajd.b;
            }
            if (f2 > 1.0f) {
                j2 = Math.min(blm.a(j2, f2), ajd.d);
            }
            if (b2 < j2) {
                ajd.i = true;
            } else if (b2 >= ajd.d || d2 >= i2) {
                ajd.i = false;
            }
            z2 = ajd.i;
        }
        this.x = z2;
        if (z2) {
            akl akl = this.p.f;
            long j3 = this.D;
            bks.b(akl.f());
            akl.a.c(akl.b(j3));
        }
        m();
    }

    private final void b() {
        int i2;
        akc akc = this.n;
        akp akp = this.r;
        if (akp != akc.a || akc.b > 0 || akc.c) {
            Handler handler = this.i;
            int i3 = akc.b;
            if (akc.c) {
                i2 = akc.d;
            } else {
                i2 = -1;
            }
            handler.obtainMessage(0, i3, i2, akp).sendToTarget();
            akc akc2 = this.n;
            akc2.a = this.r;
            akc2.b = 0;
            akc2.c = false;
        }
    }

    public final /* bridge */ /* synthetic */ void a(axz axz) {
        this.a.a(10, (aws) axz).sendToTarget();
    }

    public final void a(aws aws) {
        this.a.a(9, aws).sendToTarget();
    }

    public final void a(awv awv, alh alh) {
        this.a.a(8, new aka(awv, alh)).sendToTarget();
    }

    public final synchronized void a() {
        if (!this.u && this.b.isAlive()) {
            this.a.a(7);
            boolean z2 = false;
            while (!this.u) {
                try {
                    wait();
                } catch (InterruptedException e2) {
                    z2 = true;
                }
            }
            if (z2) {
                Thread.currentThread().interrupt();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:30:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00ca  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00dc  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f1  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f5  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00fd  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x0108  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(boolean r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            r23 = this;
            r1 = r23
            bkp r0 = r1.a
            r0.a()
            r2 = 0
            r1.w = r2
            ajf r0 = r1.m
            r0.a()
            r3 = 0
            r1.D = r3
            akx[] r3 = r1.t
            int r4 = r3.length
            r5 = 0
        L_0x0017:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x002c
            r0 = r3[r5]
            r1.a(r0)     // Catch:{ ajh -> 0x0023, RuntimeException -> 0x0021 }
            goto L_0x0029
        L_0x0021:
            r0 = move-exception
            goto L_0x0024
        L_0x0023:
            r0 = move-exception
        L_0x0024:
            java.lang.String r7 = "Disable failed."
            android.util.Log.e(r6, r7, r0)
        L_0x0029:
            int r5 = r5 + 1
            goto L_0x0017
        L_0x002c:
            if (r24 == 0) goto L_0x0045
            akx[] r3 = r1.c
            int r4 = r3.length
            r5 = 0
        L_0x0032:
            if (r5 < r4) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            r0 = r3[r5]
            r0.n()     // Catch:{ RuntimeException -> 0x003b }
            goto L_0x0042
        L_0x003b:
            r0 = move-exception
            r7 = r0
            java.lang.String r0 = "Reset failed."
            android.util.Log.e(r6, r0, r7)
        L_0x0042:
            int r5 = r5 + 1
            goto L_0x0032
        L_0x0045:
            akx[] r0 = new defpackage.akx[r2]
            r1.t = r0
            r0 = 0
            r3 = 1
            if (r26 == 0) goto L_0x0050
            r1.C = r0
            goto L_0x0084
        L_0x0050:
            if (r27 == 0) goto L_0x0083
            akd r4 = r1.C
            if (r4 != 0) goto L_0x0082
            akp r4 = r1.r
            alh r4 = r4.a
            boolean r4 = r4.c()
            if (r4 != 0) goto L_0x0081
            akp r4 = r1.r
            alh r5 = r4.a
            awt r4 = r4.b
            java.lang.Object r4 = r4.a
            alf r6 = r1.k
            r5.a(r4, r6)
            akp r4 = r1.r
            long r4 = r4.m
            alf r6 = r1.k
            long r6 = r6.c
            akd r8 = new akd
            alh r9 = defpackage.alh.a
            long r4 = r4 + r6
            r8.<init>(r9, r2, r4)
            r1.C = r8
            goto L_0x0086
        L_0x0081:
        L_0x0082:
            goto L_0x0086
        L_0x0083:
        L_0x0084:
            r3 = r26
        L_0x0086:
            akn r4 = r1.p
            r5 = r27 ^ 1
            r4.a(r5)
            r1.x = r2
            if (r27 == 0) goto L_0x00ae
            akn r4 = r1.p
            alh r5 = defpackage.alh.a
            r4.a = r5
            java.util.ArrayList r4 = r1.o
            int r5 = r4.size()
            if (r5 > 0) goto L_0x00a7
            java.util.ArrayList r4 = r1.o
            r4.clear()
            r1.E = r2
            goto L_0x00ae
        L_0x00a7:
            java.lang.Object r2 = r4.get(r2)
            akb r2 = (defpackage.akb) r2
            throw r0
        L_0x00ae:
            if (r3 == 0) goto L_0x00bd
            akp r2 = r1.r
            alg r4 = r1.j
            alf r5 = r1.k
            awt r2 = r2.a(r4, r5)
            r16 = r2
            goto L_0x00c3
        L_0x00bd:
            akp r2 = r1.r
            awt r2 = r2.b
            r16 = r2
        L_0x00c3:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x00d1
            akp r2 = r1.r
            long r6 = r2.m
            r21 = r6
            goto L_0x00d4
        L_0x00d1:
            r21 = r4
        L_0x00d4:
            if (r3 != 0) goto L_0x00dc
            akp r2 = r1.r
            long r2 = r2.d
            r9 = r2
            goto L_0x00de
        L_0x00dc:
            r9 = r4
        L_0x00de:
            akp r2 = new akp
            if (r27 != 0) goto L_0x00e8
            akp r3 = r1.r
            alh r3 = r3.a
            r5 = r3
            goto L_0x00eb
        L_0x00e8:
            alh r3 = defpackage.alh.a
            r5 = r3
        L_0x00eb:
            akp r3 = r1.r
            int r11 = r3.e
            if (r28 != 0) goto L_0x00f5
            ajh r4 = r3.f
            r12 = r4
            goto L_0x00f7
        L_0x00f5:
            r12 = r0
        L_0x00f7:
            if (r27 != 0) goto L_0x00fd
            aye r3 = r3.h
            r14 = r3
            goto L_0x0100
        L_0x00fd:
            aye r3 = defpackage.aye.a
            r14 = r3
        L_0x0100:
            if (r27 != 0) goto L_0x0108
            akp r3 = r1.r
            bgr r3 = r3.i
            r15 = r3
            goto L_0x010b
        L_0x0108:
            bgr r3 = r1.f
            r15 = r3
        L_0x010b:
            r13 = 0
            r19 = 0
            r4 = r2
            r6 = r16
            r7 = r21
            r17 = r21
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r19, r21)
            r1.r = r2
            if (r25 == 0) goto L_0x0125
            awv r2 = r1.s
            if (r2 == 0) goto L_0x0125
            r2.c(r1)
            r1.s = r0
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake.a(boolean, boolean, boolean, boolean, boolean):void");
    }

    private final void a(long j2) {
        akl akl = this.p.d;
        if (akl != null) {
            j2 = akl.a(j2);
        }
        this.D = j2;
        this.m.a.a(j2);
        for (akx a2 : this.t) {
            a2.a(this.D);
        }
        for (akl akl2 = this.p.d; akl2 != null; akl2 = akl2.g) {
            for (bgl bgl : akl2.i.c.a()) {
                if (bgl != null) {
                    bgl.i();
                }
            }
        }
    }

    private final Pair a(akd akd, boolean z2) {
        alh alh = this.r.a;
        alh alh2 = akd.a;
        if (alh.c()) {
            return null;
        }
        if (alh2.c()) {
            alh2 = alh;
        }
        try {
            Pair a2 = alh2.a(this.j, this.k, akd.b, akd.c);
            if (alh == alh2 || alh.a(a2.first) != -1) {
                return a2;
            }
            if (a(a2.first, alh2, alh) == null) {
                return null;
            }
            alh.a(-1, this.k);
            return a(alh, 0);
        } catch (IndexOutOfBoundsException e2) {
            return null;
        }
    }

    private final Object a(Object obj, alh alh, alh alh2) {
        int a2 = alh.a(obj);
        int b2 = alh.b();
        int i2 = a2;
        int i3 = -1;
        for (int i4 = 0; i4 < b2 && i3 == -1; i4++) {
            i2 = alh.a(i2, this.k, this.j, this.y);
            if (i2 == -1) {
                break;
            }
            i3 = alh2.a(alh.a(i2));
        }
        if (i3 == -1) {
            return null;
        }
        return alh2.a(i3);
    }

    private final void a(long j2, long j3) {
        this.a.a();
        ((blh) this.a).a.sendEmptyMessageAtTime(2, j2 + j3);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ake.a(awt, long, boolean):long
     arg types: [awt, long, int]
     candidates:
      ake.a(awt, long, long):akp
      ake.a(java.lang.Object, alh, alh):java.lang.Object
      ake.a(boolean, boolean, boolean):void
      ake.a(awt, long, boolean):long */
    private final void a(boolean z2) {
        awt awt = this.p.d.f.a;
        long a2 = a(awt, this.r.m, true);
        if (a2 != this.r.m) {
            this.r = a(awt, a2, this.r.d);
            if (z2) {
                this.n.b(4);
            }
        }
    }

    private final long a(awt awt, long j2) {
        akn akn = this.p;
        return a(awt, j2, akn.d != akn.e);
    }

    private final long a(awt awt, long j2, boolean z2) {
        d();
        this.w = false;
        akp akp = this.r;
        if (akp.e != 1 && !akp.a.c()) {
            a(2);
        }
        akl akl = this.p.d;
        akl akl2 = akl;
        while (true) {
            if (akl2 != null) {
                if (awt.equals(akl2.f.a) && akl2.d) {
                    this.p.a(akl2);
                    break;
                }
                akl2 = this.p.a();
            } else {
                break;
            }
        }
        akl akl3 = null;
        if (!z2 && akl == akl2 && (akl2 == null || akl2.a(j2) >= 0)) {
            akl3 = akl;
        } else {
            for (akx a2 : this.t) {
                a(a2);
            }
            this.t = new akx[0];
            if (akl2 != null) {
                akl2.j = 0;
            }
        }
        if (akl2 == null) {
            this.p.a(true);
            this.r = this.r.a(aye.a, this.f);
            a(j2);
        } else {
            a(akl3);
            if (akl2.e) {
                j2 = akl2.a.b(j2);
                akl2.a.d(j2 - this.l);
            }
            a(j2);
            k();
        }
        b(false);
        this.a.a(2);
        return j2;
    }

    public final synchronized void a(akw akw) {
        if (!this.u) {
            if (this.b.isAlive()) {
                this.a.a(15, akw).sendToTarget();
                return;
            }
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        akw.a(false);
    }

    private final void c(akw akw) {
        if (akw.d.getLooper() == ((blh) this.a).a.getLooper()) {
            b(akw);
            int i2 = this.r.e;
            if (i2 == 3 || i2 == 2) {
                this.a.a(2);
                return;
            }
            return;
        }
        this.a.a(16, akw).sendToTarget();
    }

    private final void a(akq akq, boolean z2) {
        this.a.a(17, z2 ? 1 : 0, 0, akq).sendToTarget();
    }

    private final void j() {
        for (akx akx : this.c) {
            if (akx.f() != null) {
                akx.i();
            }
        }
    }

    private final void a(int i2) {
        akp akp = this.r;
        if (akp.e != i2) {
            akp akp2 = r3;
            akp akp3 = new akp(akp.a, akp.b, akp.c, akp.d, i2, akp.f, akp.g, akp.h, akp.i, akp.j, akp.k, akp.l, akp.m);
            this.r = akp2;
        }
    }

    private final void c() {
        this.w = false;
        ajf ajf = this.m;
        ajf.f = true;
        ajf.a.a();
        for (akx e2 : this.t) {
            e2.e();
        }
    }

    private final void a(boolean z2, boolean z3, boolean z4) {
        a(z2 || !this.A, true, z3, z3, z3);
        this.n.a(this.B + (z4 ? 1 : 0));
        this.B = 0;
        ((ajd) this.g).a(true);
        a(1);
    }

    private final void d() {
        this.m.a();
        for (akx b2 : this.t) {
            b(b2);
        }
    }

    private final void m() {
        boolean z2;
        akl akl = this.p.f;
        if (this.x) {
            z2 = true;
        } else {
            z2 = akl != null && akl.a.f();
        }
        akp akp = this.r;
        if (z2 != akp.g) {
            this.r = new akp(akp.a, akp.b, akp.c, akp.d, akp.e, akp.f, z2, akp.h, akp.i, akp.j, akp.k, akp.l, akp.m);
        }
    }

    private final void a(bgr bgr) {
        boolean z2;
        int i2;
        akk akk = this.g;
        akx[] akxArr = this.c;
        bgm bgm = bgr.c;
        int i3 = 0;
        while (true) {
            if (i3 >= akxArr.length) {
                z2 = false;
                break;
            } else if (akxArr[i3].a() == 2 && bgm.a(i3) != null) {
                z2 = true;
                break;
            } else {
                i3++;
            }
        }
        ajd ajd = (ajd) akk;
        ajd.j = z2;
        int i4 = 0;
        for (int i5 = 0; i5 < akxArr.length; i5++) {
            if (bgm.a(i5) != null) {
                switch (akxArr[i5].a()) {
                    case 0:
                        i2 = 36438016;
                        break;
                    case 1:
                        i2 = 3538944;
                        break;
                    case 2:
                        i2 = 32768000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i2 = 131072;
                        break;
                    case 6:
                        i2 = 0;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                i4 += i2;
            }
        }
        ajd.h = i4;
        ajd.a.a(i4);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ake.a(akq, boolean):void
     arg types: [akq, int]
     candidates:
      ake.a(awt, long):long
      ake.a(akd, boolean):android.util.Pair
      ake.a(alh, int):android.util.Pair
      ake.a(long, long):void
      ake.a(boolean[], int):void
      ake.a(awv, alh):void
      awu.a(awv, alh):void
      ake.a(akq, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00e6  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0113  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0109 A[EDGE_INSN: B:64:0x0109->B:53:0x0109 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void e() {
        /*
            r12 = this;
            akn r0 = r12.p
            akl r0 = r0.d
            if (r0 == 0) goto L_0x0155
            boolean r1 = r0.d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x0017
            aws r1 = r0.a
            long r4 = r1.c()
            r8 = r4
            goto L_0x0019
        L_0x0017:
            r8 = r2
        L_0x0019:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0122
            ajf r1 = r12.m
            akn r2 = r12.p
            akl r2 = r2.e
            akx r3 = r1.c
            r4 = 0
            if (r3 == 0) goto L_0x008a
            boolean r3 = r3.w()
            if (r3 != 0) goto L_0x008a
            akx r3 = r1.c
            boolean r3 = r3.v()
            if (r3 == 0) goto L_0x0037
            goto L_0x0042
        L_0x0037:
            if (r0 != r2) goto L_0x008a
            akx r2 = r1.c
            boolean r2 = r2.g()
            if (r2 == 0) goto L_0x0042
            goto L_0x008a
        L_0x0042:
            bkr r2 = r1.d
            long r2 = r2.b()
            boolean r5 = r1.e
            if (r5 == 0) goto L_0x0068
            blf r5 = r1.a
            long r5 = r5.b()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x005c
            blf r2 = r1.a
            r2.d()
            goto L_0x0096
        L_0x005c:
            r1.e = r4
            boolean r5 = r1.f
            if (r5 == 0) goto L_0x0068
            blf r5 = r1.a
            r5.a()
        L_0x0068:
            blf r5 = r1.a
            r5.a(r2)
            bkr r2 = r1.d
            akq r2 = r2.Q()
            blf r3 = r1.a
            akq r3 = r3.a
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0096
            blf r3 = r1.a
            r3.a(r2)
            aje r3 = r1.b
            ake r3 = (defpackage.ake) r3
            r3.a(r2, r4)
            goto L_0x0096
        L_0x008a:
            r2 = 1
            r1.e = r2
            boolean r2 = r1.f
            if (r2 == 0) goto L_0x0096
            blf r2 = r1.a
            r2.a()
        L_0x0096:
            long r1 = r1.b()
            r12.D = r1
            long r0 = r0.b(r1)
            akp r2 = r12.r
            long r2 = r2.m
            java.util.ArrayList r5 = r12.o
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x011d
            akp r5 = r12.r
            awt r5 = r5.b
            boolean r5 = r5.a()
            if (r5 != 0) goto L_0x011d
            akp r5 = r12.r
            long r6 = r5.c
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x00c5
            boolean r6 = r12.F
            if (r6 == 0) goto L_0x00c5
            r6 = -1
            long r2 = r2 + r6
        L_0x00c5:
            r12.F = r4
            alh r4 = r5.a
            awt r5 = r5.b
            java.lang.Object r5 = r5.a
            int r4 = r4.a(r5)
            int r5 = r12.E
            r6 = 0
            if (r5 <= 0) goto L_0x00e1
            java.util.ArrayList r7 = r12.o
            int r5 = r5 + -1
            java.lang.Object r5 = r7.get(r5)
            akb r5 = (defpackage.akb) r5
            goto L_0x00e3
        L_0x00e1:
        L_0x00e2:
            r5 = r6
        L_0x00e3:
            if (r5 != 0) goto L_0x00e6
            goto L_0x0109
        L_0x00e6:
            int r5 = r5.a
            if (r4 >= 0) goto L_0x00eb
        L_0x00ea:
            goto L_0x00f4
        L_0x00eb:
            if (r4 != 0) goto L_0x0109
            r7 = 0
            int r5 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r5 >= 0) goto L_0x0109
            goto L_0x00ea
        L_0x00f4:
            int r5 = r12.E
            int r5 = r5 + -1
            r12.E = r5
            if (r5 <= 0) goto L_0x0108
            java.util.ArrayList r7 = r12.o
            int r5 = r5 + -1
            java.lang.Object r5 = r7.get(r5)
            akb r5 = (defpackage.akb) r5
            goto L_0x00e3
        L_0x0108:
            goto L_0x00e2
        L_0x0109:
            int r2 = r12.E
            java.util.ArrayList r3 = r12.o
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x011d
            java.util.ArrayList r2 = r12.o
            int r3 = r12.E
            java.lang.Object r2 = r2.get(r3)
            akb r2 = (defpackage.akb) r2
        L_0x011d:
            akp r2 = r12.r
            r2.m = r0
            goto L_0x0140
        L_0x0122:
            r12.a(r8)
            akp r0 = r12.r
            long r0 = r0.m
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0140
            akp r0 = r12.r
            awt r7 = r0.b
            long r10 = r0.d
            r6 = r12
            akp r0 = r6.a(r7, r8, r10)
            r12.r = r0
            akc r0 = r12.n
            r1 = 4
            r0.b(r1)
        L_0x0140:
            akn r0 = r12.p
            akl r0 = r0.f
            akp r1 = r12.r
            long r2 = r0.c()
            r1.k = r2
            akp r0 = r12.r
            long r1 = r12.n()
            r0.l = r1
            return
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ake.e():void");
    }

    private final void a(akl akl) {
        akl akl2 = this.p.d;
        if (akl2 != null && akl != akl2) {
            boolean[] zArr = new boolean[this.c.length];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                akx[] akxArr = this.c;
                if (i2 < akxArr.length) {
                    akx akx = akxArr[i2];
                    zArr[i2] = akx.d() != 0;
                    if (akl2.i.a(i2)) {
                        i3++;
                    }
                    if (zArr[i2] && (!akl2.i.a(i2) || (akx.j() && akx.f() == akl.c[i2]))) {
                        a(akx);
                    }
                    i2++;
                } else {
                    this.r = this.r.a(akl2.h, akl2.i);
                    a(zArr, i3);
                    return;
                }
            }
        }
    }
}
