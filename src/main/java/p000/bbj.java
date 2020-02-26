package p000;

import android.net.Uri;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;

/* renamed from: bbj */
/* compiled from: PG */
public final class bbj implements aws, bbp, bcm {

    /* renamed from: a */
    public final bcq f3100a;

    /* renamed from: b */
    public final axg f3101b;

    /* renamed from: c */
    public awr f3102c;

    /* renamed from: d */
    public bbs[] f3103d = new bbs[0];

    /* renamed from: e */
    private final bbh f3104e;

    /* renamed from: f */
    private final bbf f3105f;

    /* renamed from: g */
    private final bjf f3106g;

    /* renamed from: h */
    private final anu f3107h;

    /* renamed from: i */
    private final bip f3108i;

    /* renamed from: j */
    private final bhk f3109j;

    /* renamed from: k */
    private final IdentityHashMap f3110k = new IdentityHashMap();

    /* renamed from: l */
    private final bby f3111l = new bby();

    /* renamed from: m */
    private final awl f3112m;

    /* renamed from: n */
    private final int f3113n;

    /* renamed from: o */
    private int f3114o;

    /* renamed from: p */
    private aye f3115p;

    /* renamed from: q */
    private bbs[] f3116q = new bbs[0];

    /* renamed from: r */
    private axz f3117r;

    /* renamed from: s */
    private boolean f3118s;

    public bbj(bbh bbh, bcq bcq, bbf bbf, bjf bjf, anu anu, bip bip, axg axg, bhk bhk, awl awl, int i) {
        this.f3104e = bbh;
        this.f3100a = bcq;
        this.f3105f = bbf;
        this.f3106g = bjf;
        this.f3107h = anu;
        this.f3108i = bip;
        this.f3101b = axg;
        this.f3109j = bhk;
        this.f3112m = awl;
        this.f3113n = i;
        this.f3117r = awl.mo1495a(new axz[0]);
        axg.mo1517a();
    }

    /* renamed from: a */
    public final long mo1480a(long j, alb alb) {
        return j;
    }

    /* renamed from: a */
    private final bbs m2707a(int i, Uri[] uriArr, akh[] akhArr, akh akh, List list, Map map, long j) {
        return new bbs(i, this, new bbe(this.f3104e, this.f3100a, uriArr, akhArr, this.f3105f, this.f3106g, this.f3111l, list), map, this.f3109j, j, akh, this.f3107h, this.f3108i, this.f3101b, this.f3113n);
    }

    /* renamed from: c */
    public final boolean mo1487c(long j) {
        if (this.f3115p != null) {
            return this.f3117r.mo1487c(j);
        }
        for (bbs b : this.f3103d) {
            b.mo1727b();
        }
        return false;
    }

    /* renamed from: d */
    public final void mo1489d(long j) {
        for (bbs bbs : this.f3116q) {
            if (bbs.f3173k && !bbs.mo1734m()) {
                int length = bbs.f3171i.length;
                for (int i = 0; i < length; i++) {
                    bbs.f3171i[i].mo1588b(j, bbs.f3183u[i]);
                }
            }
        }
    }

    /* renamed from: d */
    public final long mo1488d() {
        return this.f3117r.mo1488d();
    }

    /* renamed from: e */
    public final long mo1490e() {
        return this.f3117r.mo1490e();
    }

    /* renamed from: b */
    public final aye mo1485b() {
        return (aye) bks.m3507a(this.f3115p);
    }

    /* renamed from: f */
    public final boolean mo1491f() {
        return this.f3117r.mo1491f();
    }

    /* renamed from: a */
    public final void mo1482a() {
        for (bbs bbs : this.f3103d) {
            bbs.mo1730h();
            if (bbs.f3187y && !bbs.f3174l) {
                throw new ako("Loading finished before preparation is complete.");
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo414a(axz axz) {
        bbs bbs = (bbs) axz;
        this.f3102c.mo414a((axz) this);
    }

    /* renamed from: h */
    public final void mo1718h() {
        this.f3102c.mo414a((axz) this);
    }

    /* renamed from: a */
    public final boolean mo1716a(Uri uri, long j) {
        boolean z;
        int c;
        boolean z2 = true;
        for (bbs bbs : this.f3103d) {
            bbe bbe = bbs.f3165c;
            int i = 0;
            while (true) {
                Uri[] uriArr = bbe.f3055d;
                if (i < uriArr.length) {
                    if (uriArr[i].equals(uri)) {
                        break;
                    }
                    i++;
                } else {
                    i = -1;
                    break;
                }
            }
            if (!(i == -1 || (c = bbe.f3066o.mo1832c(i)) == -1)) {
                bbe.f3068q |= uri.equals(bbe.f3064m);
                if (j != -9223372036854775807L && !bbe.f3066o.mo1829a(c, j)) {
                    z = false;
                    z2 &= z;
                }
            }
            z = true;
            z2 &= z;
        }
        this.f3102c.mo414a((axz) this);
        return z2;
    }

    /* renamed from: g */
    public final void mo1717g() {
        int i = this.f3114o - 1;
        this.f3114o = i;
        if (i <= 0) {
            int i2 = 0;
            for (bbs c : this.f3103d) {
                i2 += c.mo1729c().f2751b;
            }
            ayc[] aycArr = new ayc[i2];
            bbs[] bbsArr = this.f3103d;
            int length = bbsArr.length;
            int i3 = 0;
            int i4 = 0;
            while (i3 < length) {
                bbs bbs = bbsArr[i3];
                int i5 = bbs.mo1729c().f2751b;
                int i6 = i4;
                int i7 = 0;
                while (i7 < i5) {
                    aycArr[i6] = bbs.mo1729c().mo1612a(i7);
                    i7++;
                    i6++;
                }
                i3++;
                i4 = i6;
            }
            this.f3115p = new aye(aycArr);
            this.f3102c.mo412a((aws) this);
        }
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: blm.a(java.lang.Object, java.lang.Object):boolean
     arg types: [java.lang.String, java.lang.String]
     candidates:
      blm.a(int, int):int
      blm.a(byte[], int):int
      blm.a(long, float):long
      blm.a(long, long):long
      blm.a(android.os.Looper, android.os.Handler$Callback):android.os.Handler
      blm.a(java.lang.String, int):java.lang.String
      blm.a(java.lang.String, java.lang.Object[]):java.lang.String
      blm.a(android.os.Parcel, boolean):void
      blm.a(long[], long):void
      blm.a(java.lang.Object[], java.lang.Object):boolean
      blm.a(java.util.List, long):long[]
      blm.a(java.lang.Object[], int):java.lang.Object[]
      blm.a(java.lang.String, java.lang.String):java.lang.String[]
      blm.a(java.lang.Object, java.lang.Object):boolean */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x00a0  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1483a(p000.awr r21, long r22) {
        /*
            r20 = this;
            r9 = r20
            r0 = r21
            r9.f3102c = r0
            bcq r0 = r9.f3100a
            bcc r0 = (p000.bcc) r0
            java.util.List r0 = r0.f3222d
            r0.add(r9)
            bcq r0 = r9.f3100a
            bcc r0 = (p000.bcc) r0
            bcf r0 = r0.f3228j
            java.lang.Object r0 = p000.bks.m3507a(r0)
            bcf r0 = (p000.bcf) r0
            java.util.Map r10 = java.util.Collections.emptyMap()
            java.util.List r1 = r0.f3244c
            boolean r1 = r1.isEmpty()
            java.util.List r11 = r0.f3245d
            java.util.List r12 = r0.f3246e
            r13 = 0
            r9.f3114o = r13
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.ArrayList r15 = new java.util.ArrayList
            r15.<init>()
            r7 = 1
            r1 = r1 ^ r7
            if (r1 == 0) goto L_0x00ec
            java.util.List r1 = r0.f3244c
            int r1 = r1.size()
            int[] r2 = new int[r1]
            r3 = 0
            r4 = 0
            r5 = 0
        L_0x0045:
            java.util.List r6 = r0.f3244c
            int r6 = r6.size()
            r8 = 2
            if (r3 >= r6) goto L_0x0080
            java.util.List r6 = r0.f3244c
            java.lang.Object r6 = r6.get(r3)
            bce r6 = (p000.bce) r6
            akh r6 = r6.f3237b
            int r13 = r6.f562o
            if (r13 > 0) goto L_0x0077
            java.lang.String r13 = r6.f553f
            java.lang.String r13 = p000.blm.m3637a(r13, r8)
            if (r13 == 0) goto L_0x0065
            goto L_0x0077
        L_0x0065:
            java.lang.String r6 = r6.f553f
            java.lang.String r6 = p000.blm.m3637a(r6, r7)
            if (r6 == 0) goto L_0x0072
            r2[r3] = r7
            int r5 = r5 + 1
            goto L_0x007b
        L_0x0072:
            r6 = -1
            r2[r3] = r6
            goto L_0x007b
        L_0x0077:
            r2[r3] = r8
            int r4 = r4 + 1
        L_0x007b:
            int r3 = r3 + 1
            r13 = 0
            goto L_0x0045
        L_0x0080:
            if (r4 <= 0) goto L_0x0086
            r1 = r4
            r3 = 1
        L_0x0084:
            r4 = 0
            goto L_0x008f
        L_0x0086:
            if (r5 >= r1) goto L_0x008d
            int r1 = r1 - r5
            r3 = 0
            r4 = 1
            goto L_0x008f
        L_0x008d:
            r3 = 0
            goto L_0x0084
        L_0x008f:
            android.net.Uri[] r5 = new android.net.Uri[r1]
            akh[] r6 = new p000.akh[r1]
            int[] r13 = new int[r1]
            r1 = 0
            r16 = 0
        L_0x0098:
            java.util.List r7 = r0.f3244c
            int r7 = r7.size()
            if (r1 >= r7) goto L_0x00cd
            if (r3 == 0) goto L_0x00a8
            r7 = r2[r1]
            if (r7 == r8) goto L_0x00a8
            r8 = 1
            goto L_0x00c8
        L_0x00a8:
            if (r4 == 0) goto L_0x00b0
            r7 = r2[r1]
            r8 = 1
            if (r7 == r8) goto L_0x00c8
            goto L_0x00b1
        L_0x00b0:
            r8 = 1
        L_0x00b1:
            java.util.List r7 = r0.f3244c
            java.lang.Object r7 = r7.get(r1)
            bce r7 = (p000.bce) r7
            android.net.Uri r8 = r7.f3236a
            r5[r16] = r8
            akh r7 = r7.f3237b
            r6[r16] = r7
            int r7 = r16 + 1
            r13[r16] = r1
            r16 = r7
        L_0x00c8:
            int r1 = r1 + 1
            r7 = 1
            r8 = 2
            goto L_0x0098
        L_0x00cd:
            r1 = 0
            r2 = r6[r1]
            java.lang.String r1 = r2.f553f
            r1 = 0
            akh r4 = r0.f3247f
            java.util.List r7 = r0.f3248g
            r0 = r20
            r2 = r5
            r3 = r6
            r5 = r7
            r6 = r10
            r9 = 1
            r7 = r22
            bbs r0 = r0.m2707a(r1, r2, r3, r4, r5, r6, r7)
            r14.add(r0)
            r15.add(r13)
            goto L_0x00ed
        L_0x00ec:
            r9 = 1
        L_0x00ed:
            java.util.ArrayList r13 = new java.util.ArrayList
            int r0 = r11.size()
            r13.<init>(r0)
            java.util.ArrayList r7 = new java.util.ArrayList
            int r0 = r11.size()
            r7.<init>(r0)
            java.util.ArrayList r8 = new java.util.ArrayList
            int r0 = r11.size()
            r8.<init>(r0)
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r5 = 0
        L_0x010e:
            int r0 = r11.size()
            if (r5 >= r0) goto L_0x01ad
            java.lang.Object r0 = r11.get(r5)
            bcd r0 = (p000.bcd) r0
            java.lang.String r0 = r0.f3235c
            boolean r1 = r6.add(r0)
            if (r1 == 0) goto L_0x019b
            r13.clear()
            r7.clear()
            r8.clear()
            r1 = 0
        L_0x012c:
            int r2 = r11.size()
            if (r1 >= r2) goto L_0x015e
            java.lang.Object r2 = r11.get(r1)
            bcd r2 = (p000.bcd) r2
            java.lang.String r2 = r2.f3235c
            boolean r2 = p000.blm.m3652a(r0, r2)
            if (r2 == 0) goto L_0x015b
            java.lang.Object r2 = r11.get(r1)
            bcd r2 = (p000.bcd) r2
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            r8.add(r3)
            android.net.Uri r3 = r2.f3233a
            r13.add(r3)
            akh r3 = r2.f3234b
            r7.add(r3)
            akh r2 = r2.f3234b
            java.lang.String r2 = r2.f553f
        L_0x015b:
            int r1 = r1 + 1
            goto L_0x012c
        L_0x015e:
            r0 = 0
            android.net.Uri[] r1 = new android.net.Uri[r0]
            java.lang.Object[] r1 = p000.blm.m3656a(r1)
            android.net.Uri[] r1 = (android.net.Uri[]) r1
            java.lang.Object[] r1 = r13.toArray(r1)
            r2 = r1
            android.net.Uri[] r2 = (android.net.Uri[]) r2
            akh[] r1 = new p000.akh[r0]
            java.lang.Object[] r0 = r7.toArray(r1)
            r3 = r0
            akh[] r3 = (p000.akh[]) r3
            java.util.List r16 = java.util.Collections.emptyList()
            r1 = 1
            r4 = 0
            r0 = r20
            r17 = r5
            r5 = r16
            r16 = r6
            r6 = r10
            r18 = r7
            r19 = r8
            r7 = r22
            bbs r0 = r0.m2707a(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = p000.blm.m3654a(r19)
            r15.add(r1)
            r14.add(r0)
            goto L_0x01a3
        L_0x019b:
            r17 = r5
            r16 = r6
            r18 = r7
            r19 = r8
        L_0x01a3:
            int r5 = r17 + 1
            r6 = r16
            r7 = r18
            r8 = r19
            goto L_0x010e
        L_0x01ad:
            r11 = 0
        L_0x01ae:
            int r0 = r12.size()
            if (r11 >= r0) goto L_0x0215
            java.lang.Object r0 = r12.get(r11)
            r13 = r0
            bcd r13 = (p000.bcd) r13
            android.net.Uri[] r2 = new android.net.Uri[r9]
            android.net.Uri r0 = r13.f3233a
            r1 = 0
            r2[r1] = r0
            akh[] r3 = new p000.akh[r9]
            akh r0 = r13.f3234b
            r3[r1] = r0
            r1 = 3
            r4 = 0
            java.util.List r5 = java.util.Collections.emptyList()
            r0 = r20
            r6 = r10
            r7 = r22
            bbs r0 = r0.m2707a(r1, r2, r3, r4, r5, r6, r7)
            int[] r1 = new int[r9]
            r2 = 0
            r1[r2] = r11
            r15.add(r1)
            r14.add(r0)
            ayc[] r1 = new p000.ayc[r9]
            ayc r3 = new ayc
            akh[] r4 = new p000.akh[r9]
            akh r5 = r13.f3234b
            r4[r2] = r5
            r3.<init>(r4)
            r1[r2] = r3
            aye r1 = r0.mo1723a(r1)
            r0.f3179q = r1
            java.util.HashSet r1 = new java.util.HashSet
            r1.<init>()
            r0.f3180r = r1
            r0.f3182t = r2
            android.os.Handler r1 = r0.f3169g
            bbp r2 = r0.f3164b
            r2.getClass()
            bbo r3 = new bbo
            r3.<init>(r2)
            r1.post(r3)
            r0.mo1735n()
            int r11 = r11 + 1
            goto L_0x01ae
        L_0x0215:
            r1 = 0
            bbs[] r0 = new p000.bbs[r1]
            java.lang.Object[] r0 = r14.toArray(r0)
            bbs[] r0 = (p000.bbs[]) r0
            r3 = 1
            r2 = r20
            r2.f3103d = r0
            int[][] r0 = new int[r1][]
            java.lang.Object[] r0 = r15.toArray(r0)
            int[][] r0 = (int[][]) r0
            bbs[] r0 = r2.f3103d
            int r4 = r0.length
            r2.f3114o = r4
            r0 = r0[r1]
            r0.mo1725a(r3)
            bbs[] r0 = r2.f3103d
            int r3 = r0.length
        L_0x0238:
            if (r1 >= r3) goto L_0x0242
            r4 = r0[r1]
            r4.mo1727b()
            int r1 = r1 + 1
            goto L_0x0238
        L_0x0242:
            bbs[] r0 = r2.f3103d
            r2.f3116q = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bbj.mo1483a(awr, long):void");
    }

    /* renamed from: c */
    public final long mo1486c() {
        if (this.f3118s) {
            return -9223372036854775807L;
        }
        this.f3101b.mo1532c();
        this.f3118s = true;
        return -9223372036854775807L;
    }

    /* renamed from: g */
    public final void mo1492g(long j) {
        this.f3117r.mo1492g(j);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbs.a(long, boolean):boolean
     arg types: [long, int]
     candidates:
      bbs.a(int, int):aov
      aok.a(int, int):aov
      bbs.a(long, boolean):boolean */
    /* renamed from: b */
    public final long mo1484b(long j) {
        bbs[] bbsArr = this.f3116q;
        if (bbsArr.length > 0) {
            boolean a = bbsArr[0].mo1726a(j, false);
            int i = 1;
            while (true) {
                bbs[] bbsArr2 = this.f3116q;
                if (i >= bbsArr2.length) {
                    break;
                }
                bbsArr2[i].mo1726a(j, a);
                i++;
            }
            if (a) {
                this.f3111l.mo1750a();
            }
        }
        return j;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x01a4, code lost:
        if (r6.mo1837h() == r7.f3165c.f3058g.mo1603a(r13.f2769g)) goto L_0x01af;
     */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x01b3  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01b6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long mo1481a(p000.bgl[] r22, boolean[] r23, p000.axx[] r24, boolean[] r25, long r26) {
        /*
            r21 = this;
            r0 = r21
            r1 = r22
            r2 = r24
            r3 = r26
            int r5 = r1.length
            int[] r6 = new int[r5]
            int[] r5 = new int[r5]
            r8 = 0
        L_0x000e:
            int r9 = r1.length
            if (r8 < r9) goto L_0x0275
            java.util.IdentityHashMap r8 = r0.f3110k
            r8.clear()
            axx[] r8 = new p000.axx[r9]
            axx[] r11 = new p000.axx[r9]
            bgl[] r12 = new p000.bgl[r9]
            bbs[] r13 = r0.f3103d
            int r13 = r13.length
            bbs[] r13 = new p000.bbs[r13]
            r14 = 0
            r15 = 0
            r16 = 0
        L_0x0025:
            bbs[] r7 = r0.f3103d
            int r7 = r7.length
            if (r14 >= r7) goto L_0x0254
            r7 = 0
        L_0x002b:
            int r10 = r1.length
            r17 = r13
            if (r7 >= r10) goto L_0x004a
            r10 = r6[r7]
            if (r10 != r14) goto L_0x0037
            r10 = r2[r7]
            goto L_0x0039
        L_0x0037:
            r10 = 0
        L_0x0039:
            r11[r7] = r10
            r10 = r5[r7]
            if (r10 != r14) goto L_0x0042
            r13 = r1[r7]
            goto L_0x0043
        L_0x0042:
            r13 = 0
        L_0x0043:
            r12[r7] = r13
            int r7 = r7 + 1
            r13 = r17
            goto L_0x002b
        L_0x004a:
            bbs[] r7 = r0.f3103d
            r7 = r7[r14]
            r7.mo1736o()
            int r10 = r7.f3175m
            r13 = 0
        L_0x0054:
            if (r13 >= r9) goto L_0x00ae
            r18 = r11[r13]
            r2 = r18
            bbl r2 = (p000.bbl) r2
            if (r2 != 0) goto L_0x0063
            r19 = r6
            r18 = r15
            goto L_0x00a3
        L_0x0063:
            r18 = r12[r13]
            if (r18 != 0) goto L_0x0068
        L_0x0067:
            goto L_0x006d
        L_0x0068:
            boolean r18 = r23[r13]
            if (r18 != 0) goto L_0x009f
            goto L_0x0067
        L_0x006d:
            r18 = r15
            int r15 = r7.f3175m
            r19 = r6
            r6 = -1
            int r15 = r15 + r6
            r7.f3175m = r15
            int r15 = r2.f3130c
            if (r15 == r6) goto L_0x009a
            bbs r6 = r2.f3129b
            int r15 = r2.f3128a
            r6.mo1736o()
            int[] r0 = r6.f3181s
            p000.bks.m3507a(r0)
            int[] r0 = r6.f3181s
            r0 = r0[r15]
            boolean[] r15 = r6.f3183u
            boolean r15 = r15[r0]
            p000.bks.m3512b(r15)
            boolean[] r6 = r6.f3183u
            r15 = 0
            r6[r0] = r15
            r0 = -1
            r2.f3130c = r0
        L_0x009a:
            r0 = 0
            r11[r13] = r0
            goto L_0x00a3
        L_0x009f:
            r19 = r6
            r18 = r15
        L_0x00a3:
            int r13 = r13 + 1
            r0 = r21
            r2 = r24
            r15 = r18
            r6 = r19
            goto L_0x0054
        L_0x00ae:
            r19 = r6
            r18 = r15
            if (r16 != 0) goto L_0x00c5
            boolean r2 = r7.f3186x
            if (r2 != 0) goto L_0x00c0
            long r0 = r7.f3184v
            int r6 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r6 != 0) goto L_0x00bf
            goto L_0x00c3
        L_0x00bf:
            goto L_0x00c5
        L_0x00c0:
            if (r10 != 0) goto L_0x00c3
            goto L_0x00c5
        L_0x00c3:
            r0 = 0
            goto L_0x00c6
        L_0x00c5:
            r0 = 1
        L_0x00c6:
            bbe r1 = r7.f3165c
            bgl r1 = r1.f3066o
            r10 = r0
            r6 = r1
            r0 = 0
        L_0x00ce:
            if (r0 >= r9) goto L_0x012e
            r13 = r12[r0]
            if (r13 == 0) goto L_0x0129
            aye r15 = r7.f3179q
            ayc r2 = r13.mo1833e()
            int r15 = r15.mo1611a(r2)
            int r2 = r7.f3182t
            if (r15 == r2) goto L_0x00e4
            r13 = r6
            goto L_0x00ea
        L_0x00e4:
            bbe r2 = r7.f3165c
            r2.f3066o = r13
        L_0x00ea:
            r2 = r11[r0]
            if (r2 != 0) goto L_0x0127
            int r2 = r7.f3175m
            r6 = 1
            int r2 = r2 + r6
            r7.f3175m = r2
            bbl r2 = new bbl
            r2.<init>(r7, r15)
            r11[r0] = r2
            r25[r0] = r6
            r6 = r2
            int[] r2 = r7.f3181s
            if (r2 != 0) goto L_0x0103
            goto L_0x0127
        L_0x0103:
            r6.mo1719c()
            if (r10 != 0) goto L_0x0127
            axw[] r2 = r7.f3171i
            int[] r6 = r7.f3181s
            r6 = r6[r15]
            r6 = r2[r6]
            r6.mo1596i()
            r2 = 1
            int r10 = r6.mo1579a(r3, r2)
            r15 = -1
            if (r10 == r15) goto L_0x011e
        L_0x011b:
            r6 = r13
            r10 = 0
            goto L_0x012a
        L_0x011e:
            int r6 = r6.mo1592e()
            if (r6 == 0) goto L_0x011b
            r6 = r13
            r10 = 1
            goto L_0x012a
        L_0x0127:
            r6 = r13
            goto L_0x012a
        L_0x0129:
        L_0x012a:
            int r0 = r0 + 1
            goto L_0x00ce
        L_0x012e:
            int r0 = r7.f3175m
            if (r0 != 0) goto L_0x0167
            bbe r0 = r7.f3165c
            r1 = 0
            r0.f3063l = r1
            r7.f3177o = r1
            r0 = 1
            r7.f3185w = r0
            java.util.ArrayList r0 = r7.f3168f
            r0.clear()
            bix r0 = r7.f3166d
            boolean r0 = r0.mo1989d()
            if (r0 != 0) goto L_0x014e
            r7.mo1731i()
            goto L_0x01ca
        L_0x014e:
            boolean r0 = r7.f3173k
            if (r0 == 0) goto L_0x0160
            axw[] r0 = r7.f3171i
            int r1 = r0.length
            r6 = 0
        L_0x0156:
            if (r6 >= r1) goto L_0x0160
            r13 = r0[r6]
            r13.mo1599l()
            int r6 = r6 + 1
            goto L_0x0156
        L_0x0160:
            bix r0 = r7.f3166d
            r0.mo1990e()
            goto L_0x01ca
        L_0x0167:
            java.util.ArrayList r0 = r7.f3168f
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x0170
        L_0x016f:
            goto L_0x01af
        L_0x0170:
            boolean r0 = p000.blm.m3652a(r6, r1)
            if (r0 != 0) goto L_0x016f
            boolean r0 = r7.f3186x
            if (r0 == 0) goto L_0x017b
            goto L_0x01a7
        L_0x017b:
            r0 = 0
            int r13 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r13 >= 0) goto L_0x0183
            long r0 = -r3
            goto L_0x0185
        L_0x0183:
        L_0x0185:
            bbi r13 = r7.mo1733l()
            bbe r15 = r7.f3165c
            r15.mo1715a(r13, r3)
            r2 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6.mo1710a(r0, r2)
            bbe r0 = r7.f3165c
            ayc r0 = r0.f3058g
            akh r1 = r13.f2769g
            int r0 = r0.mo1603a(r1)
            int r1 = r6.mo1837h()
            if (r1 != r0) goto L_0x01a7
            goto L_0x016f
        L_0x01a7:
            r0 = 1
            r7.f3185w = r0
            r0 = 1
            r10 = 1
            goto L_0x01b1
        L_0x01af:
            r0 = r16
        L_0x01b1:
            if (r10 != 0) goto L_0x01b6
            r3 = r26
            goto L_0x01ca
        L_0x01b6:
            r3 = r26
            r7.mo1726a(r3, r0)
            r0 = 0
        L_0x01bc:
            if (r0 >= r9) goto L_0x01c9
            r1 = r11[r0]
            if (r1 != 0) goto L_0x01c3
            goto L_0x01c6
        L_0x01c3:
            r1 = 1
            r25[r0] = r1
        L_0x01c6:
            int r0 = r0 + 1
            goto L_0x01bc
        L_0x01c9:
        L_0x01ca:
            java.util.ArrayList r0 = r7.f3170h
            r0.clear()
            r0 = 0
        L_0x01d0:
            if (r0 >= r9) goto L_0x01e0
            r1 = r11[r0]
            if (r1 == 0) goto L_0x01dd
            java.util.ArrayList r6 = r7.f3170h
            bbl r1 = (p000.bbl) r1
            r6.add(r1)
        L_0x01dd:
            int r0 = r0 + 1
            goto L_0x01d0
        L_0x01e0:
            r0 = 1
            r7.f3186x = r0
            r0 = 0
            r1 = 0
        L_0x01e6:
            r6 = r22
            int r13 = r6.length
            if (r0 >= r13) goto L_0x0215
            r13 = r11[r0]
            r15 = r5[r0]
            if (r15 != r14) goto L_0x0203
            p000.bks.m3507a(r13)
            r8[r0] = r13
            r15 = r21
            java.util.IdentityHashMap r1 = r15.f3110k
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            r1.put(r13, r2)
            r1 = 1
            goto L_0x0212
        L_0x0203:
            r15 = r21
            r2 = r19[r0]
            if (r2 != r14) goto L_0x0212
            if (r13 != 0) goto L_0x020d
            r2 = 1
            goto L_0x020f
        L_0x020d:
            r2 = 0
        L_0x020f:
            p000.bks.m3512b(r2)
        L_0x0212:
            int r0 = r0 + 1
            goto L_0x01e6
        L_0x0215:
            r15 = r21
            if (r1 == 0) goto L_0x0241
            r17[r18] = r7
            int r0 = r18 + 1
            if (r18 != 0) goto L_0x023a
            r1 = 1
            r7.mo1725a(r1)
            if (r10 != 0) goto L_0x0232
            bbs[] r2 = r15.f3116q
            int r10 = r2.length
            if (r10 != 0) goto L_0x022b
        L_0x022a:
            goto L_0x0232
        L_0x022b:
            r10 = 0
            r2 = r2[r10]
            if (r7 != r2) goto L_0x022a
            goto L_0x0243
        L_0x0232:
            bby r2 = r15.f3111l
            r2.mo1750a()
            r16 = 1
            goto L_0x0243
        L_0x023a:
            r1 = 0
            r7.mo1725a(r1)
            goto L_0x0243
        L_0x0241:
            r0 = r18
        L_0x0243:
            int r14 = r14 + 1
            r2 = r24
            r1 = r6
            r13 = r17
            r6 = r19
            r20 = r15
            r15 = r0
            r0 = r20
            goto L_0x0025
        L_0x0254:
            r17 = r13
            r18 = r15
            r15 = r0
            r0 = r24
            r1 = 0
            java.lang.System.arraycopy(r8, r1, r0, r1, r9)
            r0 = r17
            r7 = r18
            java.lang.Object[] r0 = p000.blm.m3657a(r0, r7)
            bbs[] r0 = (p000.bbs[]) r0
            r15.f3116q = r0
            awl r1 = r15.f3112m
            axz r0 = r1.mo1495a(r0)
            r15.f3117r = r0
            return r3
        L_0x0275:
            r15 = r0
            r0 = r2
            r19 = r6
            r6 = r1
            r1 = 0
            r2 = r0[r8]
            if (r2 == 0) goto L_0x028c
            java.util.IdentityHashMap r7 = r15.f3110k
            java.lang.Object r2 = r7.get(r2)
            java.lang.Integer r2 = (java.lang.Integer) r2
            int r10 = r2.intValue()
            goto L_0x028e
        L_0x028c:
            r10 = -1
        L_0x028e:
            r19[r8] = r10
            r2 = -1
            r5[r8] = r2
            r2 = r6[r8]
            if (r2 == 0) goto L_0x02b3
            ayc r2 = r2.mo1833e()
            r7 = 0
        L_0x029c:
            bbs[] r9 = r15.f3103d
            int r10 = r9.length
            if (r7 >= r10) goto L_0x02b3
            r9 = r9[r7]
            aye r9 = r9.mo1729c()
            int r9 = r9.mo1611a(r2)
            r10 = -1
            if (r9 != r10) goto L_0x02b1
            int r7 = r7 + 1
            goto L_0x029c
        L_0x02b1:
            r5[r8] = r7
        L_0x02b3:
            int r8 = r8 + 1
            r2 = r0
            r1 = r6
            r0 = r15
            r6 = r19
            goto L_0x000e
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bbj.mo1481a(bgl[], boolean[], axx[], boolean[], long):long");
    }
}
