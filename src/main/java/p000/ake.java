package p000;

import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.util.Pair;
import java.util.ArrayList;

/* renamed from: ake */
/* compiled from: PG */
public final class ake implements Handler.Callback, awr, awu, aje, aku {

    /* renamed from: A */
    private boolean f510A;

    /* renamed from: B */
    private int f511B;

    /* renamed from: C */
    private akd f512C;

    /* renamed from: D */
    private long f513D;

    /* renamed from: E */
    private int f514E;

    /* renamed from: F */
    private boolean f515F;

    /* renamed from: a */
    public final bkp f516a;

    /* renamed from: b */
    public final HandlerThread f517b;

    /* renamed from: c */
    private final akx[] f518c;

    /* renamed from: d */
    private final aky[] f519d;

    /* renamed from: e */
    private final bgq f520e;

    /* renamed from: f */
    private final bgr f521f;

    /* renamed from: g */
    private final akk f522g;

    /* renamed from: h */
    private final bhn f523h;

    /* renamed from: i */
    private final Handler f524i;

    /* renamed from: j */
    private final alg f525j;

    /* renamed from: k */
    private final alf f526k;

    /* renamed from: l */
    private final long f527l;

    /* renamed from: m */
    private final ajf f528m;

    /* renamed from: n */
    private final akc f529n;

    /* renamed from: o */
    private final ArrayList f530o;

    /* renamed from: p */
    private final akn f531p = new akn();

    /* renamed from: q */
    private alb f532q;

    /* renamed from: r */
    private akp f533r;

    /* renamed from: s */
    private awv f534s;

    /* renamed from: t */
    private akx[] f535t;

    /* renamed from: u */
    private boolean f536u;

    /* renamed from: v */
    private boolean f537v;

    /* renamed from: w */
    private boolean f538w;

    /* renamed from: x */
    private boolean f539x;

    /* renamed from: y */
    private int f540y;

    /* renamed from: z */
    private boolean f541z;

    public ake(akx[] akxArr, bgq bgq, bgr bgr, akk akk, bhn bhn, boolean z, int i, boolean z2, Handler handler, bkf bkf) {
        this.f518c = akxArr;
        this.f520e = bgq;
        this.f521f = bgr;
        this.f522g = akk;
        this.f523h = bhn;
        this.f537v = z;
        this.f540y = i;
        this.f541z = z2;
        this.f524i = handler;
        this.f527l = ((ajd) akk).f439g;
        this.f532q = alb.f640b;
        this.f533r = akp.m782a(-9223372036854775807L, bgr);
        this.f529n = new akc((byte) 0);
        this.f519d = new aky[akxArr.length];
        for (int i2 = 0; i2 < akxArr.length; i2++) {
            akxArr[i2].mo373u();
            this.f519d[i2] = akxArr[i2].mo343R();
        }
        this.f528m = new ajf(this);
        this.f530o = new ArrayList();
        this.f535t = new akx[0];
        this.f525j = new alg();
        this.f526k = new alf();
        bgq.f3832d = bhn;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        this.f517b = handlerThread;
        handlerThread.start();
        this.f516a = new blh(new Handler(this.f517b.getLooper(), this));
        this.f515F = true;
    }

    /* renamed from: a */
    private final akp m686a(awt awt, long j, long j2) {
        this.f515F = true;
        return this.f533r.mo459a(awt, j, j2, m719n());
    }

    /* renamed from: b */
    public static final void m704b(akw akw) {
        try {
            akw.f629a.mo347a(akw.f630b, akw.f631c);
        } finally {
            akw.mo482a(true);
        }
    }

    /* renamed from: a */
    private final void m695a(akx akx) {
        ajf ajf = this.f528m;
        if (akx == ajf.f445c) {
            ajf.f446d = null;
            ajf.f445c = null;
            ajf.f447e = true;
        }
        m705b(akx);
        akx.mo365m();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:173:0x02f9, code lost:
        if (m712g() != false) goto L_0x033f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x033c, code lost:
        if (r2 < r11) goto L_0x034c;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x01e1  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x01ed  */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x0212  */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x0214  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m711f() {
        /*
            r25 = this;
            r6 = r25
            long r7 = android.os.SystemClock.uptimeMillis()
            awv r0 = r6.f534s
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r14 = 1
            r15 = 0
            if (r0 != 0) goto L_0x0013
            goto L_0x0224
        L_0x0013:
            int r1 = r6.f511B
            if (r1 > 0) goto L_0x0221
            akn r0 = r6.f531p
            long r1 = r6.f513D
            r0.mo453a(r1)
            akn r0 = r6.f531p
            akl r1 = r0.f603f
            if (r1 != 0) goto L_0x0025
            goto L_0x0041
        L_0x0025:
            akm r2 = r1.f582f
            boolean r2 = r2.f597g
            if (r2 != 0) goto L_0x00e4
            boolean r1 = r1.mo441b()
            if (r1 == 0) goto L_0x00e4
            akl r1 = r0.f603f
            akm r1 = r1.f582f
            long r1 = r1.f595e
            int r3 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r3 == 0) goto L_0x00e4
            int r0 = r0.f604g
            r1 = 100
            if (r0 >= r1) goto L_0x00e4
        L_0x0041:
            akn r0 = r6.f531p
            long r1 = r6.f513D
            akp r3 = r6.f533r
            akl r4 = r0.f603f
            if (r4 == 0) goto L_0x0050
            akm r0 = r0.mo449a(r4, r1)
            goto L_0x005a
        L_0x0050:
            awt r1 = r3.f612b
            long r4 = r3.f614d
            long r2 = r3.f613c
            akm r0 = r0.mo451a(r1, r2)
        L_0x005a:
            if (r0 == 0) goto L_0x00c8
            akn r1 = r6.f531p
            aky[] r2 = r6.f519d
            bgq r3 = r6.f520e
            akk r4 = r6.f522g
            ajd r4 = (p000.ajd) r4
            bhz r4 = r4.f433a
            awv r5 = r6.f534s
            bgr r13 = r6.f521f
            akl r9 = r1.f603f
            if (r9 == 0) goto L_0x007e
            long r11 = r9.f586j
            akm r9 = r9.f582f
            long r9 = r9.f595e
            long r11 = r11 + r9
            long r9 = r0.f592b
            long r9 = r11 - r9
            r18 = r9
            goto L_0x0086
        L_0x007e:
            awt r9 = r0.f591a
            boolean r9 = r9.mo1504a()
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
            akl r2 = r1.f603f
            if (r2 == 0) goto L_0x00a1
            r2.mo439a(r9)
            goto L_0x00a5
        L_0x00a1:
            r1.f601d = r9
            r1.f602e = r9
        L_0x00a5:
            r2 = 0
            r1.f605h = r2
            r1.f603f = r9
            int r2 = r1.f604g
            int r2 = r2 + r14
            r1.f604g = r2
            aws r1 = r9.f577a
            long r2 = r0.f592b
            r1.mo1483a(r6, r2)
            akn r0 = r6.f531p
            akl r0 = r0.f601d
            if (r0 != r9) goto L_0x00c3
            long r0 = r9.mo434a()
            r6.m691a(r0)
        L_0x00c3:
            r6.m706b(r15)
            goto L_0x00e4
        L_0x00c8:
            akn r0 = r6.f531p
            akl r0 = r0.f603f
            if (r0 == 0) goto L_0x00df
            akx[] r0 = r6.f535t
            int r1 = r0.length
            r2 = 0
        L_0x00d2:
            if (r2 >= r1) goto L_0x00df
            r3 = r0[r2]
            boolean r3 = r3.mo359g()
            if (r3 == 0) goto L_0x00e4
            int r2 = r2 + 1
            goto L_0x00d2
        L_0x00df:
            awv r0 = r6.f534s
            r0.mo1494d()
        L_0x00e4:
            boolean r0 = r6.f539x
            if (r0 == 0) goto L_0x00f2
            boolean r0 = r25.m717l()
            r6.f539x = r0
            r25.m718m()
            goto L_0x00f5
        L_0x00f2:
            r25.m716k()
        L_0x00f5:
            akn r0 = r6.f531p
            akl r0 = r0.f602e
            if (r0 == 0) goto L_0x01ba
            akl r1 = r0.f583g
            if (r1 != 0) goto L_0x012b
            akm r1 = r0.f582f
            boolean r1 = r1.f597g
            if (r1 != 0) goto L_0x0107
            goto L_0x01ba
        L_0x0107:
            r1 = 0
        L_0x0109:
            akx[] r2 = r6.f518c
            int r3 = r2.length
            if (r1 >= r3) goto L_0x0129
            r2 = r2[r1]
            axx[] r3 = r0.f579c
            r3 = r3[r1]
            if (r3 != 0) goto L_0x0117
            goto L_0x0126
        L_0x0117:
            axx r4 = r2.mo358f()
            if (r4 != r3) goto L_0x0126
            boolean r3 = r2.mo359g()
            if (r3 == 0) goto L_0x0126
            r2.mo361i()
        L_0x0126:
            int r1 = r1 + 1
            goto L_0x0109
        L_0x0129:
            goto L_0x01ba
        L_0x012b:
            boolean r1 = r25.m714i()
            if (r1 == 0) goto L_0x01ba
            akl r1 = r0.f583g
            boolean r1 = r1.f580d
            if (r1 == 0) goto L_0x01ba
            bgr r0 = r0.f585i
            akn r1 = r6.f531p
            akl r2 = r1.f602e
            if (r2 == 0) goto L_0x0147
            akl r2 = r2.f583g
            if (r2 == 0) goto L_0x0145
            r2 = 1
            goto L_0x0148
        L_0x0145:
        L_0x0147:
            r2 = 0
        L_0x0148:
            p000.bks.m3512b(r2)
            akl r2 = r1.f602e
            akl r2 = r2.f583g
            r1.f602e = r2
            akl r1 = r1.f602e
            bgr r2 = r1.f585i
            aws r3 = r1.f577a
            long r3 = r3.mo1486c()
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r3 > r9 ? 1 : (r3 == r9 ? 0 : -1))
            if (r5 == 0) goto L_0x016a
            r25.m715j()
            r0 = 0
            goto L_0x01bb
        L_0x016a:
            r3 = 0
        L_0x016b:
            akx[] r4 = r6.f518c
            int r5 = r4.length
            if (r3 >= r5) goto L_0x01b9
            r4 = r4[r3]
            boolean r5 = r0.mo1867a(r3)
            if (r5 != 0) goto L_0x0179
            goto L_0x01b6
        L_0x0179:
            boolean r5 = r4.mo362j()
            if (r5 != 0) goto L_0x01b6
            bgm r5 = r2.f3835c
            bgl r5 = r5.mo1861a(r3)
            boolean r9 = r2.mo1867a(r3)
            aky[] r10 = r6.f519d
            r10 = r10[r3]
            int r10 = r10.mo344a()
            akz[] r11 = r0.f3834b
            r11 = r11[r3]
            akz[] r12 = r2.f3834b
            r12 = r12[r3]
            if (r9 == 0) goto L_0x01b3
            boolean r9 = r12.equals(r11)
            if (r9 == 0) goto L_0x01b3
            r9 = 6
            if (r10 != r9) goto L_0x01a5
            goto L_0x01b3
        L_0x01a5:
            akh[] r5 = m701a(r5)
            axx[] r9 = r1.f579c
            r9 = r9[r3]
            long r10 = r1.f586j
            r4.mo353a(r5, r9, r10)
            goto L_0x01b6
        L_0x01b3:
            r4.mo361i()
        L_0x01b6:
            int r3 = r3 + 1
            goto L_0x016b
        L_0x01b9:
        L_0x01ba:
            r0 = 0
        L_0x01bb:
            boolean r1 = r6.f537v
            if (r1 == 0) goto L_0x0224
            akn r1 = r6.f531p
            akl r2 = r1.f601d
            if (r2 == 0) goto L_0x0224
            akl r3 = r2.f583g
            if (r3 == 0) goto L_0x0224
            akl r1 = r1.f602e
            if (r2 == r1) goto L_0x01ce
            goto L_0x01d4
        L_0x01ce:
            boolean r1 = r25.m714i()
            if (r1 == 0) goto L_0x0224
        L_0x01d4:
            long r1 = r6.f513D
            long r3 = r3.mo434a()
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 < 0) goto L_0x0224
            if (r0 != 0) goto L_0x01e1
            goto L_0x01e4
        L_0x01e1:
            r25.m703b()
        L_0x01e4:
            akn r0 = r6.f531p
            akl r9 = r0.f601d
            akl r0 = r0.f602e
            if (r9 == r0) goto L_0x01ed
            goto L_0x01f0
        L_0x01ed:
            r25.m715j()
        L_0x01f0:
            akn r0 = r6.f531p
            akl r0 = r0.mo448a()
            r6.m693a(r9)
            akm r0 = r0.f582f
            awt r1 = r0.f591a
            long r2 = r0.f592b
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0 = r25
            akp r0 = r0.m686a(r1, r2, r4)
            r6.f533r = r0
            akm r0 = r9.f582f
            boolean r0 = r0.f596f
            if (r0 != 0) goto L_0x0214
            r0 = 3
            goto L_0x0216
        L_0x0214:
            r0 = 0
        L_0x0216:
            akc r1 = r6.f529n
            r1.mo409b(r0)
            r25.m710e()
            r0 = 1
            goto L_0x01bb
        L_0x0221:
            r0.mo1494d()
        L_0x0224:
            akp r0 = r6.f533r
            int r0 = r0.f615e
            if (r0 != r14) goto L_0x022c
            goto L_0x03b3
        L_0x022c:
            r1 = 4
            if (r0 == r1) goto L_0x03b3
            akn r0 = r6.f531p
            akl r0 = r0.f601d
            if (r0 == 0) goto L_0x03ad
            java.lang.String r4 = "doSomeWork"
            p000.blk.m3619a(r4)
            r25.m710e()
            boolean r4 = r0.f580d
            r9 = 1000(0x3e8, double:4.94E-321)
            if (r4 == 0) goto L_0x02b5
            long r4 = android.os.SystemClock.elapsedRealtime()
            long r4 = r4 * r9
            aws r11 = r0.f577a
            akp r12 = r6.f533r
            long r12 = r12.f623m
            long r14 = r6.f527l
            long r12 = r12 - r14
            r11.mo1489d(r12)
            r11 = 0
            r12 = 1
            r14 = 1
        L_0x0258:
            akx[] r13 = r6.f518c
            int r15 = r13.length
            if (r11 >= r15) goto L_0x02b2
            r13 = r13[r11]
            int r15 = r13.mo356d()
            if (r15 == 0) goto L_0x02ad
            long r2 = r6.f513D
            r13.mo484a(r2, r4)
            if (r12 == 0) goto L_0x0275
            boolean r2 = r13.mo486w()
            if (r2 == 0) goto L_0x0274
            r12 = 1
            goto L_0x0276
        L_0x0274:
        L_0x0275:
            r12 = 0
        L_0x0276:
            axx[] r2 = r0.f579c
            r2 = r2[r11]
            axx r3 = r13.mo358f()
            if (r2 != r3) goto L_0x028c
            akl r15 = r0.f583g
            if (r15 == 0) goto L_0x028c
            boolean r15 = r13.mo359g()
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
            boolean r2 = r13.mo485v()
            if (r2 != 0) goto L_0x028f
            boolean r2 = r13.mo486w()
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
            r13.mo363k()
            goto L_0x02ae
        L_0x02ad:
        L_0x02ae:
            int r11 = r11 + 1
            goto L_0x0258
        L_0x02b2:
            r16 = r12
            goto L_0x02be
        L_0x02b5:
            aws r2 = r0.f577a
            r2.mo1482a()
            r14 = 1
            r16 = 1
        L_0x02be:
            akm r2 = r0.f582f
            long r2 = r2.f595e
            r4 = 2
            if (r16 != 0) goto L_0x02c6
            goto L_0x02e9
        L_0x02c6:
            boolean r5 = r0.f580d
            if (r5 == 0) goto L_0x02e9
            r11 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x02db
            akp r5 = r6.f533r
            long r11 = r5.f623m
            int r5 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r5 > 0) goto L_0x02e9
        L_0x02db:
            akm r0 = r0.f582f
            boolean r0 = r0.f597g
            if (r0 == 0) goto L_0x02e9
            r6.m690a(r1)
            r25.m709d()
            goto L_0x036b
        L_0x02e9:
            akp r0 = r6.f533r
            int r2 = r0.f615e
            if (r2 == r4) goto L_0x02f0
            goto L_0x034c
        L_0x02f0:
            akx[] r2 = r6.f535t
            int r2 = r2.length
            if (r2 != 0) goto L_0x02fc
            boolean r0 = r25.m712g()
            if (r0 == 0) goto L_0x034c
            goto L_0x033f
        L_0x02fc:
            if (r14 == 0) goto L_0x034c
            boolean r0 = r0.f617g
            if (r0 == 0) goto L_0x033f
            akn r0 = r6.f531p
            akl r0 = r0.f603f
            boolean r2 = r0.mo441b()
            if (r2 != 0) goto L_0x030d
        L_0x030c:
            goto L_0x0314
        L_0x030d:
            akm r0 = r0.f582f
            boolean r0 = r0.f597g
            if (r0 != 0) goto L_0x033f
            goto L_0x030c
        L_0x0314:
            akk r0 = r6.f522g
            long r2 = r25.m719n()
            ajf r5 = r6.f528m
            akq r5 = r5.mo376Q()
            float r5 = r5.f625b
            boolean r11 = r6.f538w
            long r2 = p000.blm.m3661b(r2, r5)
            if (r11 == 0) goto L_0x032f
            ajd r0 = (p000.ajd) r0
            long r11 = r0.f438f
            goto L_0x0333
        L_0x032f:
            ajd r0 = (p000.ajd) r0
            long r11 = r0.f437e
        L_0x0333:
            r15 = 0
            int r0 = (r11 > r15 ? 1 : (r11 == r15 ? 0 : -1))
            if (r0 <= 0) goto L_0x033f
            int r0 = (r2 > r11 ? 1 : (r2 == r11 ? 0 : -1))
            if (r0 >= 0) goto L_0x033f
            goto L_0x034c
        L_0x033f:
            r0 = 3
            r6.m690a(r0)
            boolean r0 = r6.f537v
            if (r0 == 0) goto L_0x036b
            r25.m707c()
            goto L_0x036b
        L_0x034c:
            akp r0 = r6.f533r
            int r0 = r0.f615e
            r2 = 3
            if (r0 != r2) goto L_0x036b
            akx[] r0 = r6.f535t
            int r0 = r0.length
            if (r0 != 0) goto L_0x035f
            boolean r0 = r25.m712g()
            if (r0 != 0) goto L_0x036b
            goto L_0x0361
        L_0x035f:
            if (r14 != 0) goto L_0x036b
        L_0x0361:
            boolean r0 = r6.f537v
            r6.f538w = r0
            r6.m690a(r4)
            r25.m709d()
        L_0x036b:
            akp r0 = r6.f533r
            int r0 = r0.f615e
            if (r0 != r4) goto L_0x037f
            akx[] r0 = r6.f535t
            int r2 = r0.length
            r3 = 0
        L_0x0375:
            if (r3 >= r2) goto L_0x037f
            r5 = r0[r3]
            r5.mo363k()
            int r3 = r3 + 1
            goto L_0x0375
        L_0x037f:
            boolean r0 = r6.f537v
            if (r0 != 0) goto L_0x0384
            goto L_0x038b
        L_0x0384:
            akp r0 = r6.f533r
            int r0 = r0.f615e
            r2 = 3
            if (r0 == r2) goto L_0x0391
        L_0x038b:
            akp r0 = r6.f533r
            int r0 = r0.f615e
            if (r0 != r4) goto L_0x0392
        L_0x0391:
            goto L_0x03a4
        L_0x0392:
            akx[] r2 = r6.f535t
            int r2 = r2.length
            if (r2 != 0) goto L_0x0398
            goto L_0x039e
        L_0x0398:
            if (r0 == r1) goto L_0x039e
            r6.m692a(r7, r9)
            goto L_0x03a9
        L_0x039e:
            bkp r0 = r6.f516a
            r0.mo2044a()
            goto L_0x03a9
        L_0x03a4:
            r0 = 10
            r6.m692a(r7, r0)
        L_0x03a9:
            p000.blk.m3618a()
            return
        L_0x03ad:
            r0 = 10
            r6.m692a(r7, r0)
            return
        L_0x03b3:
            bkp r0 = r6.f516a
            r0.mo2044a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ake.m711f():void");
    }

    /* renamed from: a */
    private final void m700a(boolean[] zArr, int i) {
        int i2;
        boolean z;
        bkr bkr;
        this.f535t = new akx[i];
        bgr bgr = this.f531p.f601d.f585i;
        for (int i3 = 0; i3 < this.f518c.length; i3++) {
            if (!bgr.mo1867a(i3)) {
                this.f518c[i3].mo366n();
            }
        }
        int i4 = 0;
        int i5 = 0;
        while (i4 < this.f518c.length) {
            if (bgr.mo1867a(i4)) {
                boolean z2 = zArr[i4];
                int i6 = i5 + 1;
                akl akl = this.f531p.f601d;
                akx akx = this.f518c[i4];
                this.f535t[i5] = akx;
                if (akx.mo356d() == 0) {
                    bgr bgr2 = akl.f585i;
                    akz akz = bgr2.f3834b[i4];
                    akh[] a = m701a(bgr2.f3835c.mo1861a(i4));
                    boolean z3 = this.f537v && this.f533r.f615e == 3;
                    if (!z2 && z3) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i2 = i4;
                    akx.mo350a(akz, a, akl.f579c[i4], this.f513D, z, akl.f586j);
                    ajf ajf = this.f528m;
                    bkr c = akx.mo355c();
                    if (!(c == null || c == (bkr = ajf.f446d))) {
                        if (bkr == null) {
                            ajf.f446d = c;
                            ajf.f445c = akx;
                            ajf.f446d.mo378a(ajf.f443a.f4280a);
                        } else {
                            throw ajh.m643a((RuntimeException) new IllegalStateException("Multiple renderer media clocks enabled."));
                        }
                    }
                    if (z3) {
                        akx.mo357e();
                    }
                } else {
                    i2 = i4;
                }
                i5 = i6;
            } else {
                i2 = i4;
            }
            i4 = i2 + 1;
        }
    }

    /* renamed from: b */
    private static final void m705b(akx akx) {
        if (akx.mo356d() == 2) {
            akx.mo364l();
        }
    }

    /* renamed from: a */
    private static akh[] m701a(bgl bgl) {
        int f = bgl != null ? bgl.mo1835f() : 0;
        akh[] akhArr = new akh[f];
        for (int i = 0; i < f; i++) {
            akhArr[i] = bgl.mo1828a(i);
        }
        return akhArr;
    }

    /* renamed from: a */
    private final Pair m688a(alh alh, int i) {
        return alh.mo549a(this.f525j, this.f526k, i, -9223372036854775807L);
    }

    /* renamed from: n */
    private final long m719n() {
        return m702b(this.f533r.f621k);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: b */
    private final long m702b(long j) {
        akl akl = this.f531p.f603f;
        if (akl != null) {
            return Math.max(0L, j - akl.mo440b(this.f513D));
        }
        return 0;
    }

    /* renamed from: b */
    private final void m706b(boolean z) {
        akl akl;
        boolean z2;
        long j;
        ake ake = this;
        akl akl2 = ake.f531p.f603f;
        awt awt = akl2 == null ? ake.f533r.f612b : akl2.f582f.f591a;
        boolean z3 = !ake.f533r.f620j.equals(awt);
        if (z3) {
            akp akp = ake.f533r;
            z2 = z3;
            akl = akl2;
            akp akp2 = akp;
            akp akp3 = new akp(akp.f611a, akp.f612b, akp.f613c, akp.f614d, akp.f615e, akp.f616f, akp.f617g, akp.f618h, akp.f619i, awt, akp2.f621k, akp2.f622l, akp2.f623m);
            ake = this;
            ake.f533r = akp3;
        } else {
            akl = akl2;
            z2 = z3;
        }
        akp akp4 = ake.f533r;
        if (akl != null) {
            j = akl.mo442c();
        } else {
            j = akp4.f623m;
        }
        akp4.f621k = j;
        ake.f533r.f622l = m719n();
        if ((z2 || z) && akl != null) {
            akl akl3 = akl;
            if (akl3.f580d) {
                ake.m696a(akl3.f585i);
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
        r7.m697a(false);
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
            akq r2 = (p000.akq) r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x001b
            r1 = 1
            goto L_0x001d
        L_0x001b:
            r1 = 0
        L_0x001d:
            android.os.Handler r3 = r7.f524i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.os.Message r1 = r3.obtainMessage(r9, r1, r8, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.sendToTarget()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            float r1 = r2.f625b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r3 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r3 = r3.f601d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x002c:
            if (r3 != 0) goto L_0x0041
            akx[] r1 = r7.f518c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r3 = r1.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r4 = 0
        L_0x0032:
            if (r4 >= r3) goto L_0x06b7
            r5 = r1[r4]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 != 0) goto L_0x0039
            goto L_0x003e
        L_0x0039:
            float r6 = r2.f625b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r5.mo346a(r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x003e:
            int r4 = r4 + 1
            goto L_0x0032
        L_0x0041:
            bgr r4 = r3.f585i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgm r4 = r4.f3835c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgl[] r4 = r4.mo1862a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r5 = r4.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r6 = 0
        L_0x004b:
            if (r6 >= r5) goto L_0x0058
            r10 = r4[r6]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r10 != 0) goto L_0x0052
            goto L_0x0055
        L_0x0052:
            r10.mo1824a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0055:
            int r6 = r6 + 1
            goto L_0x004b
        L_0x0058:
            akl r3 = r3.f583g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x002c
        L_0x005b:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akw r1 = (p000.akw) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.os.Handler r2 = r1.f632d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            r1.mo482a(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0085:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akw r1 = (p000.akw) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.m708c(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            boolean r3 = r7.f510A     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r3 == r2) goto L_0x00b7
            r7.f510A = r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != 0) goto L_0x00b7
            akx[] r2 = r7.f518c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r3 = r2.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r4 = 0
        L_0x00a6:
            if (r4 >= r3) goto L_0x00b7
            r5 = r2[r4]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r6 = r5.mo356d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == 0) goto L_0x00b1
            goto L_0x00b4
        L_0x00b1:
            r5.mo366n()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            r7.f541z = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.f600c = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r2.mo457b()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != 0) goto L_0x00de
            r7.m697a(r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x00de:
            r7.m706b(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x00e4:
            int r1 = r1.arg1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f540y = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.f599b = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r2.mo457b()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != 0) goto L_0x00f5
            r7.m697a(r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x00f5:
            r7.m706b(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x00fb:
            ajf r1 = r7.f528m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r1 = r1.mo376Q()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            float r1 = r1.f625b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r3 = r2.f601d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r2 = r2.f602e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r4 = 1
        L_0x010a:
            if (r3 == 0) goto L_0x06b7
            boolean r5 = r3.f580d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 == 0) goto L_0x06b7
            akp r5 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alh r5 = r5.f611a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r15 = r3.mo438a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r5 = r3.f585i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 == 0) goto L_0x013d
            bgm r6 = r5.f3835c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r6 = r6.f3809a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgm r11 = r15.f3835c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r11 = r11.f3809a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 != r11) goto L_0x013d
            r6 = 0
        L_0x0127:
            bgm r11 = r15.f3835c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r11 = r11.f3809a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 >= r11) goto L_0x0136
            boolean r11 = r15.mo1868a(r5, r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r11 == 0) goto L_0x013d
            int r6 = r6 + 1
            goto L_0x0127
        L_0x0136:
            if (r3 == r2) goto L_0x0139
            goto L_0x013a
        L_0x0139:
            r4 = 0
        L_0x013a:
            akl r3 = r3.f583g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x010a
        L_0x013d:
            if (r4 != 0) goto L_0x015a
            akn r1 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo455a(r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r3.f580d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x01b3
            akm r1 = r3.f582f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r1 = r1.f592b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r7.f513D     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r3.mo440b(r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r1 = java.lang.Math.max(r1, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3.mo436a(r15, r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x01b3
        L_0x015a:
            akn r1 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r11 = r1.f601d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r18 = r1.mo455a(r11)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akx[] r1 = r7.f518c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean[] r12 = new boolean[r1]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r1 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r1 = r1.f623m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r14 = r11
            r16 = r1
            r19 = r12
            long r14 = r14.mo437a(r15, r16, r18, r19)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r1 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r2 = r1.f615e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != r10) goto L_0x017b
        L_0x017a:
            goto L_0x0198
        L_0x017b:
            long r1 = r1.f623m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r3 = (r14 > r1 ? 1 : (r14 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x017a
            akp r1 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r1.f612b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r5 = r1.f614d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = r35
            r3 = r14
            akp r1 = r1.m686a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f533r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akc r1 = r7.f529n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo409b(r10)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.m691a(r14)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0198:
            akx[] r1 = r7.f518c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean[] r1 = new boolean[r1]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 0
            r3 = 0
        L_0x019f:
            akx[] r4 = r7.f518c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r5 = r4.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 < r5) goto L_0x01ca
            akp r2 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aye r4 = r11.f584h     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r5 = r11.f585i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r2.mo460a(r4, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f533r = r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.m700a(r1, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x01b3:
            r7.m706b(r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r1 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.f615e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == r10) goto L_0x06b7
            r35.m716k()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r35.m710e()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bkp r1 = r7.f516a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo2045a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x01ca:
            r4 = r4[r2]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r5 = r4.mo356d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 == 0) goto L_0x01d4
            r5 = 1
            goto L_0x01d6
        L_0x01d4:
            r5 = 0
        L_0x01d6:
            r1[r2] = r5     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            axx[] r6 = r11.f579c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r6 = r6[r2]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == 0) goto L_0x01e0
            int r3 = r3 + 1
        L_0x01e0:
            if (r5 != 0) goto L_0x01e3
            goto L_0x01f6
        L_0x01e3:
            axx r5 = r4.mo358f()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 != r5) goto L_0x01f3
            boolean r5 = r12[r2]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r5 == 0) goto L_0x01f6
            long r5 = r7.f513D     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r4.mo348a(r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x01f6
        L_0x01f3:
            r7.m695a(r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x01f6:
            int r2 = r2 + 1
            goto L_0x019f
        L_0x01f9:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aws r1 = (p000.aws) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r2.mo456a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x06b7
            akn r1 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r2 = r7.f513D     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo453a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r35.m716k()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0211:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aws r1 = (p000.aws) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r2.mo456a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x06b7
            akn r1 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r1 = r1.f603f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajf r2 = r7.f528m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r2 = r2.mo376Q()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            float r2 = r2.f625b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r4 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alh r4 = r4.f611a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.f580d = r9     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aws r4 = r1.f577a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aye r4 = r4.mo1485b()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.f584h = r4     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r2 = r1.mo438a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akm r4 = r1.f582f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r4.f592b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r12 = r1.mo436a(r2, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r1.f586j     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akm r2 = r1.f582f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r10 = r2.f592b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r14 = r10 - r12
            long r4 = r4 + r14
            r1.f586j = r4     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r4 = (r12 > r10 ? 1 : (r12 == r10 ? 0 : -1))
            if (r4 == 0) goto L_0x0269
            akm r4 = new akm     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r11 = r2.f591a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r14 = r2.f594d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r5 = r2.f595e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r10 = r2.f596f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r2 = r2.f597g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r18 = r10
            r10 = r4
            r16 = r5
            r19 = r2
            r10.<init>(r11, r12, r14, r16, r18, r19)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = r4
        L_0x0269:
            r1.f582f = r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r2 = r1.f585i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.m696a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r2 = r2.f601d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != r2) goto L_0x0280
            akm r1 = r1.f582f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r1 = r1.f592b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.m691a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.m693a(r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0280:
            r35.m716k()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0285:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aka r1 = (p000.aka) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awv r2 = r1.f500a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awv r6 = r7.f534s     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != r6) goto L_0x06b7
            akc r2 = r7.f529n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r6 = r7.f511B     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.mo408a(r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f511B = r8     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alh r6 = r2.f611a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alh r1 = r1.f501b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r10 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r10.f598a = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r10 = new akp     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r15 = r2.f612b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r13 = r2.f613c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r2.f614d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r8 = r2.f615e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajh r11 = r2.f616f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r12 = r2.f617g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            aye r3 = r2.f618h     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bgr r9 = r2.f619i     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r36 = r6
            awt r6 = r2.f620j     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r25 = r6
            long r6 = r2.f621k     // Catch:{ ajh -> 0x04f0, IOException -> 0x04eb, RuntimeException -> 0x04e6, OutOfMemoryError -> 0x04e4 }
            r26 = r6
            long r6 = r2.f622l     // Catch:{ ajh -> 0x04f0, IOException -> 0x04eb, RuntimeException -> 0x04e6, OutOfMemoryError -> 0x04e4 }
            r28 = r6
            long r6 = r2.f623m     // Catch:{ ajh -> 0x04f0, IOException -> 0x04eb, RuntimeException -> 0x04e6, OutOfMemoryError -> 0x04e4 }
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
            r7.f533r = r10     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.util.ArrayList r2 = r7.f530o     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r2 = r2.size()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3 = -1
            int r2 = r2 + r3
            if (r2 >= 0) goto L_0x04d9
            java.util.ArrayList r2 = r7.f530o     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.util.Collections.sort(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.f612b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r4 = r2.mo1504a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r4 != 0) goto L_0x02fb
            akp r4 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r4.f623m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x02ff
        L_0x02fb:
            akp r4 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r4.f614d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x02ff:
            akd r6 = r7.f512C     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == 0) goto L_0x0325
            r1 = 1
            android.util.Pair r2 = r7.m687a(r6, r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = 0
            r7.f512C = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 == 0) goto L_0x0320
            java.lang.Object r1 = r2.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r8 = r1.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r1 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r2 = r2.first     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r1.mo452a(r2, r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = r1
            goto L_0x03b5
        L_0x0320:
            r35.m713h()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0325:
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r6 != 0) goto L_0x035f
            boolean r6 = r1.mo552c()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == 0) goto L_0x0335
            goto L_0x035f
        L_0x0335:
            int r2 = r1.mo553d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.util.Pair r1 = r7.m688a(r1, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r2 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r3 = r1.first     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r6 = r1.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r8 = r6.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.mo452a(r3, r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r3 = r2.mo1504a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            java.lang.Object r6 = r2.f2566a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r6 = r1.mo525a(r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 == r3) goto L_0x038e
            akn r1 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.f612b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r2 = r2.f2566a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r1.mo452a(r2, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akp r2 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.f612b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r2 = r2.mo1504a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != 0) goto L_0x038b
            boolean r2 = r1.mo1504a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 != 0) goto L_0x038b
            akp r1 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r1.f612b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = r1
            r8 = r4
            goto L_0x03b5
        L_0x038b:
            r2 = r1
            r8 = r4
            goto L_0x03b5
        L_0x038e:
            java.lang.Object r2 = r2.f2566a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3 = r36
            java.lang.Object r2 = r7.m689a(r2, r3, r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 == 0) goto L_0x04d4
            alf r3 = r7.f526k     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo547a(r2, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 0
            android.util.Pair r1 = r7.m688a(r1, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r2 = r1.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r2 = r2.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r6 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r1 = r1.first     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r6.mo452a(r1, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r8 = r2
            r2 = r1
        L_0x03b5:
            akp r1 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r1 = r1.f612b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r1 = r1.equals(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != 0) goto L_0x03c1
            goto L_0x0495
        L_0x03c1:
            int r1 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r1 != 0) goto L_0x0495
            akn r1 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r2 = r7.f513D     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r4 = r1.f602e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r5 = -9223372036854775808
            if (r4 != 0) goto L_0x03d2
            r32 = 0
            goto L_0x0412
        L_0x03d2:
            long r8 = r4.f586j     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r10 = r4.f580d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r10 == 0) goto L_0x0410
            r9 = r8
            r8 = 0
        L_0x03da:
            akx[] r11 = r7.f518c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r12 = r11.length     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r8 >= r12) goto L_0x040d
            r11 = r11[r8]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r11 = r11.mo356d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r11 == 0) goto L_0x0405
            akx[] r11 = r7.f518c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r11 = r11[r8]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            axx r11 = r11.mo358f()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            axx[] r12 = r4.f579c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r12 = r12[r8]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r11 != r12) goto L_0x0405
            akx[] r11 = r7.f518c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r11 = r11[r8]     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r11 = r11.mo360h()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            akl r4 = r1.f601d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r8 = 0
        L_0x0415:
            if (r4 == 0) goto L_0x04cd
            akm r9 = r4.f582f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r8 != 0) goto L_0x0420
            akm r8 = r1.mo450a(r9)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x0439
        L_0x0420:
            akm r10 = r1.mo449a(r8, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r10 == 0) goto L_0x0487
            long r11 = r9.f592b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r13 = r10.f592b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r15 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r15 != 0) goto L_0x0480
            awt r11 = r9.f591a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r12 = r10.f591a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r11 = r11.equals(r12)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r11 == 0) goto L_0x0480
            r8 = r10
        L_0x0439:
            r4.f582f = r8     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r9 = r9.f595e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r11 = r8.f595e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            long r2 = r4.mo435a(r11)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x045b
        L_0x0456:
            r2 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
        L_0x045b:
            akl r8 = r1.f602e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            boolean r1 = r1.mo455a(r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x0474
            goto L_0x048f
        L_0x0474:
            if (r2 != 0) goto L_0x048f
            goto L_0x04cd
        L_0x0477:
            akl r8 = r4.f583g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r34 = r8
            r8 = r4
            r4 = r34
            goto L_0x0415
        L_0x0480:
            boolean r1 = r1.mo455a(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            r1 = r1 ^ r2
            goto L_0x048d
        L_0x0487:
            boolean r1 = r1.mo455a(r8)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            r1 = r1 ^ r2
        L_0x048d:
            if (r1 != 0) goto L_0x04cd
        L_0x048f:
            r1 = 0
            r7.m697a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x04cd
        L_0x0495:
            akn r1 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akl r1 = r1.f601d     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x04b5
        L_0x049b:
        L_0x049c:
            akl r1 = r1.f583g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x04b5
            akm r3 = r1.f582f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r3 = r3.f591a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r3 = r3.equals(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r3 == 0) goto L_0x049c
            akn r3 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akm r4 = r1.f582f     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akm r3 = r3.mo450a(r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.f582f = r3     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x049b
        L_0x04b5:
            boolean r1 = r2.mo1504a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 != 0) goto L_0x04bd
            r3 = r8
            goto L_0x04c0
        L_0x04bd:
            r3 = 0
        L_0x04c0:
            long r3 = r7.m684a(r2, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = r35
            r5 = r8
            akp r1 = r1.m686a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f533r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x04cd:
            r1 = 0
            r7.m706b(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x04d4:
            r35.m713h()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x04d9:
            java.util.ArrayList r1 = r7.f530o     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r1 = r1.get(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akb r1 = (p000.akb) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            r1.m699a(r2, r3, r4, r5, r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akk r1 = r7.f522g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajd r1 = (p000.ajd) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            r1.mo375a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.m690a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.os.HandlerThread r1 = r7.f517b     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.quit()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            monitor-enter(r35)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1 = 1
            r7.f536u = r1     // Catch:{ all -> 0x0518 }
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
            r7.m698a(r2, r1, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x052a:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alb r1 = (p000.alb) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f532q = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0532:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r1 = (p000.akq) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajf r2 = r7.f528m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2.mo378a(r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajf r1 = r7.f528m     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akq r1 = r1.mo376Q()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            r7.m694a(r1, r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0547:
            java.lang.Object r1 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akd r1 = (p000.akd) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akc r2 = r7.f529n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r3 = 1
            r2.mo408a(r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            android.util.Pair r2 = r7.m687a(r1, r3)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r2 == 0) goto L_0x058e
            java.lang.Object r3 = r2.first     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Object r4 = r2.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r4 = r4.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akn r6 = r7.f531p     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r3 = r6.mo452a(r3, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            boolean r6 = r3.mo1504a()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r6 != 0) goto L_0x0588
            java.lang.Object r2 = r2.second     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            java.lang.Long r2 = (java.lang.Long) r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r8 = r2.longValue()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            long r11 = r1.f509c     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            akp r2 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alg r3 = r7.f525j     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            alf r4 = r7.f526k     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            awt r2 = r2.mo461a(r3, r4)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r11 = r2
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r12 = 1
            r14 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
        L_0x05a5:
            awv r2 = r7.f534s     // Catch:{ all -> 0x0637 }
            if (r2 == 0) goto L_0x061f
            int r2 = r7.f511B     // Catch:{ all -> 0x0637 }
            if (r2 > 0) goto L_0x061f
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r3 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x060f
            akp r1 = r7.f533r     // Catch:{ all -> 0x0637 }
            awt r1 = r1.f612b     // Catch:{ all -> 0x0637 }
            boolean r1 = r11.equals(r1)     // Catch:{ all -> 0x0637 }
            if (r1 == 0) goto L_0x05ff
            akn r1 = r7.f531p     // Catch:{ all -> 0x0637 }
            akl r1 = r1.f601d     // Catch:{ all -> 0x0637 }
            if (r1 == 0) goto L_0x05d9
            boolean r2 = r1.f580d     // Catch:{ all -> 0x0637 }
            if (r2 == 0) goto L_0x05d9
            r2 = 0
            int r4 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x05d9
            aws r1 = r1.f577a     // Catch:{ all -> 0x0637 }
            alb r2 = r7.f532q     // Catch:{ all -> 0x0637 }
            long r1 = r1.mo1480a(r8, r2)     // Catch:{ all -> 0x0637 }
            goto L_0x05db
        L_0x05d9:
            r1 = r8
        L_0x05db:
            long r3 = p000.aja.m632a(r1)     // Catch:{ all -> 0x0637 }
            akp r5 = r7.f533r     // Catch:{ all -> 0x0637 }
            long r5 = r5.f623m     // Catch:{ all -> 0x0637 }
            long r5 = p000.aja.m632a(r5)     // Catch:{ all -> 0x0637 }
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 != 0) goto L_0x05fe
            akp r1 = r7.f533r     // Catch:{ all -> 0x0637 }
            long r3 = r1.f623m     // Catch:{ all -> 0x0637 }
            r1 = r35
            r2 = r11
            r5 = r14
            akp r1 = r1.m686a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f533r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r12 == 0) goto L_0x06b7
            akc r1 = r7.f529n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x0632
        L_0x05fe:
            goto L_0x0600
        L_0x05ff:
            r1 = r8
        L_0x0600:
            long r1 = r7.m684a(r11, r1)     // Catch:{ all -> 0x0637 }
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
            r7.m690a(r10)     // Catch:{ all -> 0x0637 }
            r2 = 0
            r3 = 0
            r4 = 1
            r5 = 0
            r6 = 1
            r1 = r35
            r1.m699a(r2, r3, r4, r5, r6)     // Catch:{ all -> 0x0637 }
            goto L_0x0623
        L_0x061f:
            r7.f512C = r1     // Catch:{ all -> 0x0637 }
        L_0x0623:
            r3 = r8
        L_0x0624:
            r1 = r35
            r2 = r11
            r5 = r14
            akp r1 = r1.m686a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f533r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r12 == 0) goto L_0x06b7
            akc r1 = r7.f529n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x0632:
            r1.mo409b(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0637:
            r0 = move-exception
            r10 = r0
            r1 = r35
            r2 = r11
            r3 = r8
            r5 = r14
            akp r1 = r1.m686a(r2, r3, r5)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f533r = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r12 == 0) goto L_0x064b
            akc r1 = r7.f529n     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo409b(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x064b:
            throw r10     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x064c:
            r35.m711f()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            r7.f538w = r2     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f537v = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            if (r1 == 0) goto L_0x0677
            akp r1 = r7.f533r     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            int r1 = r1.f615e     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 3
            if (r1 != r2) goto L_0x066f
            r35.m707c()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bkp r1 = r7.f516a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo2045a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x066f:
            if (r1 != r13) goto L_0x06b7
            bkp r1 = r7.f516a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo2045a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x0677:
            r35.m709d()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r35.m710e()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            goto L_0x06b7
        L_0x067e:
            java.lang.Object r2 = r1.obj     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r8 = r2
            awv r8 = (p000.awv) r8     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            int r1 = r7.f511B     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 1
            int r1 = r1 + r2
            r7.f511B = r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 0
            r3 = 1
            r6 = 1
            r1 = r35
            r1.m699a(r2, r3, r4, r5, r6)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            akk r1 = r7.f522g     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            ajd r1 = (p000.ajd) r1     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r2 = 0
            r1.mo375a(r2)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.f534s = r8     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r7.m690a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bhn r1 = r7.f523h     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r8.mo1469a(r7, r1)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            bkp r1 = r7.f516a     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
            r1.mo2045a(r13)     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
        L_0x06b7:
            r35.m703b()     // Catch:{ ajh -> 0x070b, IOException -> 0x06ec, RuntimeException -> 0x06be, OutOfMemoryError -> 0x06bc }
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
            ajh r2 = p000.ajh.m643a(r1)
        L_0x06d9:
            r1 = 0
            r3 = 1
            r7.m698a(r3, r1, r1)
            akp r1 = r7.f533r
            akp r1 = r1.mo458a(r2)
            r7.f533r = r1
            r35.m703b()
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
            r7.m698a(r2, r2, r2)
            akp r2 = r7.f533r
            ajh r3 = new ajh
            r3.<init>(r1)
            akp r1 = r2.mo458a(r3)
            r7.f533r = r1
            r35.m703b()
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
            r7.m698a(r3, r2, r2)
            akp r2 = r7.f533r
            akp r1 = r2.mo458a(r1)
            r7.f533r = r1
            r35.m703b()
        L_0x0724:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ake.handleMessage(android.os.Message):boolean");
    }

    /* renamed from: h */
    private final void m713h() {
        if (this.f533r.f615e != 1) {
            m690a(4);
        }
        m699a(false, false, true, false, true);
    }

    /* renamed from: i */
    private final boolean m714i() {
        akl akl = this.f531p.f602e;
        if (!akl.f580d) {
            return false;
        }
        int i = 0;
        while (true) {
            akx[] akxArr = this.f518c;
            if (i >= akxArr.length) {
                return true;
            }
            akx akx = akxArr[i];
            axx axx = akl.f579c[i];
            if (akx.mo358f() != axx || (axx != null && !akx.mo359g())) {
                return false;
            }
            i++;
        }
        return false;
    }

    /* renamed from: l */
    private final boolean m717l() {
        akl akl = this.f531p.f603f;
        return (akl == null || akl.mo443d() == Long.MIN_VALUE) ? false : true;
    }

    /* renamed from: g */
    private final boolean m712g() {
        akl akl = this.f531p.f601d;
        long j = akl.f582f.f595e;
        if (akl.f580d) {
            return j == -9223372036854775807L || this.f533r.f623m < j;
        }
        return false;
    }

    /* renamed from: k */
    private final void m716k() {
        long j;
        boolean z = false;
        if (m717l()) {
            long b = m702b(this.f531p.f603f.mo443d());
            float f = this.f528m.mo376Q().f625b;
            ajd ajd = (ajd) this.f522g;
            int d = ajd.f433a.mo1961d();
            int i = ajd.f440h;
            if (ajd.f442j) {
                j = ajd.f435c;
            } else {
                j = ajd.f434b;
            }
            if (f > 1.0f) {
                j = Math.min(blm.m3630a(j, f), ajd.f436d);
            }
            if (b < j) {
                ajd.f441i = true;
            } else if (b >= ajd.f436d || d >= i) {
                ajd.f441i = false;
            }
            z = ajd.f441i;
        }
        this.f539x = z;
        if (z) {
            akl akl = this.f531p.f603f;
            long j2 = this.f513D;
            bks.m3512b(akl.mo445f());
            akl.f577a.mo1487c(akl.mo440b(j2));
        }
        m718m();
    }

    /* renamed from: b */
    private final void m703b() {
        int i;
        akc akc = this.f529n;
        akp akp = this.f533r;
        if (akp != akc.f503a || akc.f504b > 0 || akc.f505c) {
            Handler handler = this.f524i;
            int i2 = akc.f504b;
            if (akc.f505c) {
                i = akc.f506d;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, akp).sendToTarget();
            akc akc2 = this.f529n;
            akc2.f503a = this.f533r;
            akc2.f504b = 0;
            akc2.f505c = false;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo414a(axz axz) {
        this.f516a.mo2043a(10, (aws) axz).sendToTarget();
    }

    /* renamed from: a */
    public final void mo412a(aws aws) {
        this.f516a.mo2043a(9, aws).sendToTarget();
    }

    /* renamed from: a */
    public final void mo413a(awv awv, alh alh) {
        this.f516a.mo2043a(8, new aka(awv, alh)).sendToTarget();
    }

    /* renamed from: a */
    public final synchronized void mo410a() {
        if (!this.f536u && this.f517b.isAlive()) {
            this.f516a.mo2045a(7);
            boolean z = false;
            while (!this.f536u) {
                try {
                    wait();
                } catch (InterruptedException e) {
                    z = true;
                }
            }
            if (z) {
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m699a(boolean r24, boolean r25, boolean r26, boolean r27, boolean r28) {
        /*
            r23 = this;
            r1 = r23
            bkp r0 = r1.f516a
            r0.mo2044a()
            r2 = 0
            r1.f538w = r2
            ajf r0 = r1.f528m
            r0.mo377a()
            r3 = 0
            r1.f513D = r3
            akx[] r3 = r1.f535t
            int r4 = r3.length
            r5 = 0
        L_0x0017:
            java.lang.String r6 = "ExoPlayerImplInternal"
            if (r5 >= r4) goto L_0x002c
            r0 = r3[r5]
            r1.m695a(r0)     // Catch:{ ajh -> 0x0023, RuntimeException -> 0x0021 }
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
            akx[] r3 = r1.f518c
            int r4 = r3.length
            r5 = 0
        L_0x0032:
            if (r5 < r4) goto L_0x0035
            goto L_0x0045
        L_0x0035:
            r0 = r3[r5]
            r0.mo366n()     // Catch:{ RuntimeException -> 0x003b }
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
            akx[] r0 = new p000.akx[r2]
            r1.f535t = r0
            r0 = 0
            r3 = 1
            if (r26 == 0) goto L_0x0050
            r1.f512C = r0
            goto L_0x0084
        L_0x0050:
            if (r27 == 0) goto L_0x0083
            akd r4 = r1.f512C
            if (r4 != 0) goto L_0x0082
            akp r4 = r1.f533r
            alh r4 = r4.f611a
            boolean r4 = r4.mo552c()
            if (r4 != 0) goto L_0x0081
            akp r4 = r1.f533r
            alh r5 = r4.f611a
            awt r4 = r4.f612b
            java.lang.Object r4 = r4.f2566a
            alf r6 = r1.f526k
            r5.mo547a(r4, r6)
            akp r4 = r1.f533r
            long r4 = r4.f623m
            alf r6 = r1.f526k
            long r6 = r6.f669c
            akd r8 = new akd
            alh r9 = p000.alh.f685a
            long r4 = r4 + r6
            r8.<init>(r9, r2, r4)
            r1.f512C = r8
            goto L_0x0086
        L_0x0081:
        L_0x0082:
            goto L_0x0086
        L_0x0083:
        L_0x0084:
            r3 = r26
        L_0x0086:
            akn r4 = r1.f531p
            r5 = r27 ^ 1
            r4.mo454a(r5)
            r1.f539x = r2
            if (r27 == 0) goto L_0x00ae
            akn r4 = r1.f531p
            alh r5 = p000.alh.f685a
            r4.f598a = r5
            java.util.ArrayList r4 = r1.f530o
            int r5 = r4.size()
            if (r5 > 0) goto L_0x00a7
            java.util.ArrayList r4 = r1.f530o
            r4.clear()
            r1.f514E = r2
            goto L_0x00ae
        L_0x00a7:
            java.lang.Object r2 = r4.get(r2)
            akb r2 = (p000.akb) r2
            throw r0
        L_0x00ae:
            if (r3 == 0) goto L_0x00bd
            akp r2 = r1.f533r
            alg r4 = r1.f525j
            alf r5 = r1.f526k
            awt r2 = r2.mo461a(r4, r5)
            r16 = r2
            goto L_0x00c3
        L_0x00bd:
            akp r2 = r1.f533r
            awt r2 = r2.f612b
            r16 = r2
        L_0x00c3:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r3 != 0) goto L_0x00d1
            akp r2 = r1.f533r
            long r6 = r2.f623m
            r21 = r6
            goto L_0x00d4
        L_0x00d1:
            r21 = r4
        L_0x00d4:
            if (r3 != 0) goto L_0x00dc
            akp r2 = r1.f533r
            long r2 = r2.f614d
            r9 = r2
            goto L_0x00de
        L_0x00dc:
            r9 = r4
        L_0x00de:
            akp r2 = new akp
            if (r27 != 0) goto L_0x00e8
            akp r3 = r1.f533r
            alh r3 = r3.f611a
            r5 = r3
            goto L_0x00eb
        L_0x00e8:
            alh r3 = p000.alh.f685a
            r5 = r3
        L_0x00eb:
            akp r3 = r1.f533r
            int r11 = r3.f615e
            if (r28 != 0) goto L_0x00f5
            ajh r4 = r3.f616f
            r12 = r4
            goto L_0x00f7
        L_0x00f5:
            r12 = r0
        L_0x00f7:
            if (r27 != 0) goto L_0x00fd
            aye r3 = r3.f618h
            r14 = r3
            goto L_0x0100
        L_0x00fd:
            aye r3 = p000.aye.f2750a
            r14 = r3
        L_0x0100:
            if (r27 != 0) goto L_0x0108
            akp r3 = r1.f533r
            bgr r3 = r3.f619i
            r15 = r3
            goto L_0x010b
        L_0x0108:
            bgr r3 = r1.f521f
            r15 = r3
        L_0x010b:
            r13 = 0
            r19 = 0
            r4 = r2
            r6 = r16
            r7 = r21
            r17 = r21
            r4.<init>(r5, r6, r7, r9, r11, r12, r13, r14, r15, r16, r17, r19, r21)
            r1.f533r = r2
            if (r25 == 0) goto L_0x0125
            awv r2 = r1.f534s
            if (r2 == 0) goto L_0x0125
            r2.mo1475c(r1)
            r1.f534s = r0
        L_0x0125:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ake.m699a(boolean, boolean, boolean, boolean, boolean):void");
    }

    /* renamed from: a */
    private final void m691a(long j) {
        akl akl = this.f531p.f601d;
        if (akl != null) {
            j = akl.mo435a(j);
        }
        this.f513D = j;
        this.f528m.f443a.mo2108a(j);
        for (akx a : this.f535t) {
            a.mo348a(this.f513D);
        }
        for (akl akl2 = this.f531p.f601d; akl2 != null; akl2 = akl2.f583g) {
            for (bgl bgl : akl2.f585i.f3835c.mo1862a()) {
                if (bgl != null) {
                    bgl.mo1839i();
                }
            }
        }
    }

    /* renamed from: a */
    private final Pair m687a(akd akd, boolean z) {
        alh alh = this.f533r.f611a;
        alh alh2 = akd.f507a;
        if (alh.mo552c()) {
            return null;
        }
        if (alh2.mo552c()) {
            alh2 = alh;
        }
        try {
            Pair a = alh2.mo549a(this.f525j, this.f526k, akd.f508b, akd.f509c);
            if (alh == alh2 || alh.mo525a(a.first) != -1) {
                return a;
            }
            if (m689a(a.first, alh2, alh) == null) {
                return null;
            }
            alh.mo551a(-1, this.f526k);
            return m688a(alh, 0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    /* renamed from: a */
    private final Object m689a(Object obj, alh alh, alh alh2) {
        int a = alh.mo525a(obj);
        int b = alh.mo529b();
        int i = a;
        int i2 = -1;
        for (int i3 = 0; i3 < b && i2 == -1; i3++) {
            i = alh.mo546a(i, this.f526k, this.f525j, this.f540y);
            if (i == -1) {
                break;
            }
            i2 = alh2.mo525a(alh.mo528a(i));
        }
        if (i2 == -1) {
            return null;
        }
        return alh2.mo528a(i2);
    }

    /* renamed from: a */
    private final void m692a(long j, long j2) {
        this.f516a.mo2044a();
        ((blh) this.f516a).f4284a.sendEmptyMessageAtTime(2, j + j2);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ake.a(awt, long, boolean):long
     arg types: [awt, long, int]
     candidates:
      ake.a(awt, long, long):akp
      ake.a(java.lang.Object, alh, alh):java.lang.Object
      ake.a(boolean, boolean, boolean):void
      ake.a(awt, long, boolean):long */
    /* renamed from: a */
    private final void m697a(boolean z) {
        awt awt = this.f531p.f601d.f582f.f591a;
        long a = m685a(awt, this.f533r.f623m, true);
        if (a != this.f533r.f623m) {
            this.f533r = m686a(awt, a, this.f533r.f614d);
            if (z) {
                this.f529n.mo409b(4);
            }
        }
    }

    /* renamed from: a */
    private final long m684a(awt awt, long j) {
        akn akn = this.f531p;
        return m685a(awt, j, akn.f601d != akn.f602e);
    }

    /* renamed from: a */
    private final long m685a(awt awt, long j, boolean z) {
        m709d();
        this.f538w = false;
        akp akp = this.f533r;
        if (akp.f615e != 1 && !akp.f611a.mo552c()) {
            m690a(2);
        }
        akl akl = this.f531p.f601d;
        akl akl2 = akl;
        while (true) {
            if (akl2 != null) {
                if (awt.equals(akl2.f582f.f591a) && akl2.f580d) {
                    this.f531p.mo455a(akl2);
                    break;
                }
                akl2 = this.f531p.mo448a();
            } else {
                break;
            }
        }
        akl akl3 = null;
        if (!z && akl == akl2 && (akl2 == null || akl2.mo435a(j) >= 0)) {
            akl3 = akl;
        } else {
            for (akx a : this.f535t) {
                m695a(a);
            }
            this.f535t = new akx[0];
            if (akl2 != null) {
                akl2.f586j = 0;
            }
        }
        if (akl2 == null) {
            this.f531p.mo454a(true);
            this.f533r = this.f533r.mo460a(aye.f2750a, this.f521f);
            m691a(j);
        } else {
            m693a(akl3);
            if (akl2.f581e) {
                j = akl2.f577a.mo1484b(j);
                akl2.f577a.mo1489d(j - this.f527l);
            }
            m691a(j);
            m716k();
        }
        m706b(false);
        this.f516a.mo2045a(2);
        return j;
    }

    /* renamed from: a */
    public final synchronized void mo411a(akw akw) {
        if (!this.f536u) {
            if (this.f517b.isAlive()) {
                this.f516a.mo2043a(15, akw).sendToTarget();
                return;
            }
        }
        Log.w("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        akw.mo482a(false);
    }

    /* renamed from: c */
    private final void m708c(akw akw) {
        if (akw.f632d.getLooper() == ((blh) this.f516a).f4284a.getLooper()) {
            m704b(akw);
            int i = this.f533r.f615e;
            if (i == 3 || i == 2) {
                this.f516a.mo2045a(2);
                return;
            }
            return;
        }
        this.f516a.mo2043a(16, akw).sendToTarget();
    }

    /* renamed from: a */
    private final void m694a(akq akq, boolean z) {
        this.f516a.mo2042a(17, z ? 1 : 0, 0, akq).sendToTarget();
    }

    /* renamed from: j */
    private final void m715j() {
        for (akx akx : this.f518c) {
            if (akx.mo358f() != null) {
                akx.mo361i();
            }
        }
    }

    /* renamed from: a */
    private final void m690a(int i) {
        akp akp = this.f533r;
        if (akp.f615e != i) {
            akp akp2 = r3;
            akp akp3 = new akp(akp.f611a, akp.f612b, akp.f613c, akp.f614d, i, akp.f616f, akp.f617g, akp.f618h, akp.f619i, akp.f620j, akp.f621k, akp.f622l, akp.f623m);
            this.f533r = akp2;
        }
    }

    /* renamed from: c */
    private final void m707c() {
        this.f538w = false;
        ajf ajf = this.f528m;
        ajf.f448f = true;
        ajf.f443a.mo2107a();
        for (akx e : this.f535t) {
            e.mo357e();
        }
    }

    /* renamed from: a */
    private final void m698a(boolean z, boolean z2, boolean z3) {
        m699a(z || !this.f510A, true, z2, z2, z2);
        this.f529n.mo408a(this.f511B + (z3 ? 1 : 0));
        this.f511B = 0;
        ((ajd) this.f522g).mo375a(true);
        m690a(1);
    }

    /* renamed from: d */
    private final void m709d() {
        this.f528m.mo377a();
        for (akx b : this.f535t) {
            m705b(b);
        }
    }

    /* renamed from: m */
    private final void m718m() {
        boolean z;
        akl akl = this.f531p.f603f;
        if (this.f539x) {
            z = true;
        } else {
            z = akl != null && akl.f577a.mo1491f();
        }
        akp akp = this.f533r;
        if (z != akp.f617g) {
            this.f533r = new akp(akp.f611a, akp.f612b, akp.f613c, akp.f614d, akp.f615e, akp.f616f, z, akp.f618h, akp.f619i, akp.f620j, akp.f621k, akp.f622l, akp.f623m);
        }
    }

    /* renamed from: a */
    private final void m696a(bgr bgr) {
        boolean z;
        int i;
        akk akk = this.f522g;
        akx[] akxArr = this.f518c;
        bgm bgm = bgr.f3835c;
        int i2 = 0;
        while (true) {
            if (i2 >= akxArr.length) {
                z = false;
                break;
            } else if (akxArr[i2].mo344a() == 2 && bgm.mo1861a(i2) != null) {
                z = true;
                break;
            } else {
                i2++;
            }
        }
        ajd ajd = (ajd) akk;
        ajd.f442j = z;
        int i3 = 0;
        for (int i4 = 0; i4 < akxArr.length; i4++) {
            if (bgm.mo1861a(i4) != null) {
                switch (akxArr[i4].mo344a()) {
                    case 0:
                        i = 36438016;
                        break;
                    case 1:
                        i = 3538944;
                        break;
                    case 2:
                        i = 32768000;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        i = 131072;
                        break;
                    case 6:
                        i = 0;
                        break;
                    default:
                        throw new IllegalArgumentException();
                }
                i3 += i;
            }
        }
        ajd.f440h = i3;
        ajd.f433a.mo1959a(i3);
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
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m710e() {
        /*
            r12 = this;
            akn r0 = r12.f531p
            akl r0 = r0.f601d
            if (r0 == 0) goto L_0x0155
            boolean r1 = r0.f580d
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 == 0) goto L_0x0017
            aws r1 = r0.f577a
            long r4 = r1.mo1486c()
            r8 = r4
            goto L_0x0019
        L_0x0017:
            r8 = r2
        L_0x0019:
            int r1 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r1 != 0) goto L_0x0122
            ajf r1 = r12.f528m
            akn r2 = r12.f531p
            akl r2 = r2.f602e
            akx r3 = r1.f445c
            r4 = 0
            if (r3 == 0) goto L_0x008a
            boolean r3 = r3.mo486w()
            if (r3 != 0) goto L_0x008a
            akx r3 = r1.f445c
            boolean r3 = r3.mo485v()
            if (r3 == 0) goto L_0x0037
            goto L_0x0042
        L_0x0037:
            if (r0 != r2) goto L_0x008a
            akx r2 = r1.f445c
            boolean r2 = r2.mo359g()
            if (r2 == 0) goto L_0x0042
            goto L_0x008a
        L_0x0042:
            bkr r2 = r1.f446d
            long r2 = r2.mo379b()
            boolean r5 = r1.f447e
            if (r5 == 0) goto L_0x0068
            blf r5 = r1.f443a
            long r5 = r5.mo379b()
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x005c
            blf r2 = r1.f443a
            r2.mo2109d()
            goto L_0x0096
        L_0x005c:
            r1.f447e = r4
            boolean r5 = r1.f448f
            if (r5 == 0) goto L_0x0068
            blf r5 = r1.f443a
            r5.mo2107a()
        L_0x0068:
            blf r5 = r1.f443a
            r5.mo2108a(r2)
            bkr r2 = r1.f446d
            akq r2 = r2.mo376Q()
            blf r3 = r1.f443a
            akq r3 = r3.f4280a
            boolean r3 = r2.equals(r3)
            if (r3 != 0) goto L_0x0096
            blf r3 = r1.f443a
            r3.mo378a(r2)
            aje r3 = r1.f444b
            ake r3 = (p000.ake) r3
            r3.m694a(r2, r4)
            goto L_0x0096
        L_0x008a:
            r2 = 1
            r1.f447e = r2
            boolean r2 = r1.f448f
            if (r2 == 0) goto L_0x0096
            blf r2 = r1.f443a
            r2.mo2107a()
        L_0x0096:
            long r1 = r1.mo379b()
            r12.f513D = r1
            long r0 = r0.mo440b(r1)
            akp r2 = r12.f533r
            long r2 = r2.f623m
            java.util.ArrayList r5 = r12.f530o
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x011d
            akp r5 = r12.f533r
            awt r5 = r5.f612b
            boolean r5 = r5.mo1504a()
            if (r5 != 0) goto L_0x011d
            akp r5 = r12.f533r
            long r6 = r5.f613c
            int r8 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x00c5
            boolean r6 = r12.f515F
            if (r6 == 0) goto L_0x00c5
            r6 = -1
            long r2 = r2 + r6
        L_0x00c5:
            r12.f515F = r4
            alh r4 = r5.f611a
            awt r5 = r5.f612b
            java.lang.Object r5 = r5.f2566a
            int r4 = r4.mo525a(r5)
            int r5 = r12.f514E
            r6 = 0
            if (r5 <= 0) goto L_0x00e1
            java.util.ArrayList r7 = r12.f530o
            int r5 = r5 + -1
            java.lang.Object r5 = r7.get(r5)
            akb r5 = (p000.akb) r5
            goto L_0x00e3
        L_0x00e1:
        L_0x00e2:
            r5 = r6
        L_0x00e3:
            if (r5 != 0) goto L_0x00e6
            goto L_0x0109
        L_0x00e6:
            int r5 = r5.f502a
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
            int r5 = r12.f514E
            int r5 = r5 + -1
            r12.f514E = r5
            if (r5 <= 0) goto L_0x0108
            java.util.ArrayList r7 = r12.f530o
            int r5 = r5 + -1
            java.lang.Object r5 = r7.get(r5)
            akb r5 = (p000.akb) r5
            goto L_0x00e3
        L_0x0108:
            goto L_0x00e2
        L_0x0109:
            int r2 = r12.f514E
            java.util.ArrayList r3 = r12.f530o
            int r3 = r3.size()
            if (r2 >= r3) goto L_0x011d
            java.util.ArrayList r2 = r12.f530o
            int r3 = r12.f514E
            java.lang.Object r2 = r2.get(r3)
            akb r2 = (p000.akb) r2
        L_0x011d:
            akp r2 = r12.f533r
            r2.f623m = r0
            goto L_0x0140
        L_0x0122:
            r12.m691a(r8)
            akp r0 = r12.f533r
            long r0 = r0.f623m
            int r2 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r2 == 0) goto L_0x0140
            akp r0 = r12.f533r
            awt r7 = r0.f612b
            long r10 = r0.f614d
            r6 = r12
            akp r0 = r6.m686a(r7, r8, r10)
            r12.f533r = r0
            akc r0 = r12.f529n
            r1 = 4
            r0.mo409b(r1)
        L_0x0140:
            akn r0 = r12.f531p
            akl r0 = r0.f603f
            akp r1 = r12.f533r
            long r2 = r0.mo442c()
            r1.f621k = r2
            akp r0 = r12.f533r
            long r1 = r12.m719n()
            r0.f622l = r1
            return
        L_0x0155:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.ake.m710e():void");
    }

    /* renamed from: a */
    private final void m693a(akl akl) {
        akl akl2 = this.f531p.f601d;
        if (akl2 != null && akl != akl2) {
            boolean[] zArr = new boolean[this.f518c.length];
            int i = 0;
            int i2 = 0;
            while (true) {
                akx[] akxArr = this.f518c;
                if (i < akxArr.length) {
                    akx akx = akxArr[i];
                    zArr[i] = akx.mo356d() != 0;
                    if (akl2.f585i.mo1867a(i)) {
                        i2++;
                    }
                    if (zArr[i] && (!akl2.f585i.mo1867a(i) || (akx.mo362j() && akx.mo358f() == akl.f579c[i]))) {
                        m695a(akx);
                    }
                    i++;
                } else {
                    this.f533r = this.f533r.mo460a(akl2.f584h, akl2.f585i);
                    m700a(zArr, i2);
                    return;
                }
            }
        }
    }
}
