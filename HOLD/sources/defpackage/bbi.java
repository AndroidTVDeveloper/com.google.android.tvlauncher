package defpackage;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbi  reason: default package */
/* compiled from: PG */
final class bbi extends ayx {
    private static final aop d = new aop();
    private static final AtomicInteger n = new AtomicInteger();
    private final avb A;
    private final bky B;
    private final boolean C;
    private final boolean D;
    private aoi E;
    private boolean F;
    private int G;
    private boolean H;
    private volatile boolean I;
    public final int a;
    public bbs b;
    public boolean c;
    private final int o;
    private final Uri p;
    private final bhv q;
    private final bhy r;
    private final aoi s;
    private final boolean t;
    private final boolean u;
    private final blj v;
    private final boolean w;
    private final bbh x;
    private final List y;
    private final anq z;

    public final boolean e() {
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private bbi(bbh bbh, bhv bhv, bhy bhy, akh akh, boolean z2, bhv bhv2, bhy bhy2, boolean z3, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z4, boolean z5, blj blj, anq anq, aoi aoi, avb avb, bky bky, boolean z6) {
        super(bhv, bhy, akh, i, obj, j, j2, j3);
        boolean z7;
        bhy bhy3 = bhy2;
        this.C = z2;
        this.o = i2;
        this.r = bhy3;
        this.q = bhv2;
        if (bhy3 != null) {
            z7 = true;
        } else {
            z7 = false;
        }
        this.H = z7;
        this.D = z3;
        this.p = uri;
        this.t = z5;
        this.v = blj;
        this.u = z4;
        this.x = bbh;
        this.y = list;
        this.z = anq;
        this.s = aoi;
        this.A = avb;
        this.B = bky;
        this.w = z6;
        this.a = n.getAndIncrement();
    }

    private static bhv a(bhv bhv, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bhv;
        }
        bks.a(bArr2);
        return new baw(bhv, bArr, bArr2);
    }

    public final void a() {
        this.I = true;
    }

    public static bbi a(bbh bbh, bhv bhv, akh akh, long j, bch bch, int i, Uri uri, List list, int i2, Object obj, boolean z2, bby bby, bbi bbi, byte[] bArr, byte[] bArr2) {
        bhv bhv2;
        boolean z3;
        bhy bhy;
        boolean z4;
        bky bky;
        avb avb;
        aoi aoi;
        blj blj;
        aoi aoi2;
        bhv bhv3 = bhv;
        bch bch2 = bch;
        int i3 = i;
        bby bby2 = bby;
        bbi bbi2 = bbi;
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        bcg bcg = (bcg) bch2.l.get(i3);
        bhy bhy2 = new bhy(blk.a(bch2.n, bcg.a), bcg.i, bcg.j, null);
        boolean z5 = bArr3 != null;
        bhv a2 = a(bhv3, bArr3, z5 ? a((String) bks.a((Object) bcg.h)) : null);
        bcg bcg2 = bcg.b;
        if (bcg2 == null) {
            bhy = null;
            z3 = false;
            bhv2 = null;
        } else {
            boolean z6 = bArr4 != null;
            byte[] a3 = z6 ? a((String) bks.a((Object) bcg2.h)) : null;
            bhy bhy3 = new bhy(blk.a(bch2.n, bcg2.a), bcg2.i, bcg2.j, null);
            bhv a4 = a(bhv3, bArr4, a3);
            z3 = z6;
            bhv2 = a4;
            bhy = bhy3;
        }
        long j2 = j + bcg.e;
        long j3 = j2 + bcg.c;
        int i4 = bch2.e + bcg.d;
        if (bbi2 != null) {
            avb avb2 = bbi2.A;
            bky bky2 = bbi2.B;
            boolean z7 = !uri.equals(bbi2.p) || !bbi2.c;
            if (!bbi2.F || bbi2.o != i4 || z7) {
                aoi2 = null;
            } else {
                aoi2 = bbi2.E;
            }
            avb = avb2;
            bky = bky2;
            z4 = z7;
            aoi = aoi2;
        } else {
            avb = new avb();
            bky = new bky(10);
            aoi = null;
            z4 = false;
        }
        long j4 = bch2.f + ((long) i3);
        boolean z8 = bcg.k;
        blj blj2 = (blj) bby2.a.get(i4);
        if (blj2 == null) {
            blj blj3 = new blj(Long.MAX_VALUE);
            bby2.a.put(i4, blj3);
            blj = blj3;
        } else {
            blj = blj2;
        }
        return new bbi(bbh, a2, bhy2, akh, z5, bhv2, bhy, z3, uri, list, i2, obj, j2, j3, j4, i4, z8, z2, blj, bcg.f, aoi, avb, bky, z4);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbs.a(int, boolean, boolean):void
     arg types: [int, boolean, int]
     candidates:
      bbs.a(akh, akh, boolean):akh
      bbs.a(bit, long, long):void
      biq.a(bit, long, long):void
      bbs.a(int, boolean, boolean):void */
    /* JADX WARNING: Removed duplicated region for block: B:127:0x0243 A[Catch:{ all -> 0x029a, all -> 0x02a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:128:0x024b A[Catch:{ all -> 0x029a, all -> 0x02a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a6 A[Catch:{ all -> 0x029a, all -> 0x02a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0184 A[Catch:{ all -> 0x029a, all -> 0x02a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x018c A[Catch:{ all -> 0x029a, all -> 0x02a4 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void a(defpackage.bhv r18, defpackage.bhy r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            java.lang.String r0 = ".mp4"
            if (r20 == 0) goto L_0x0013
            int r4 = r1.G
            if (r4 == 0) goto L_0x000e
            r4 = 1
            goto L_0x0010
        L_0x000e:
            r4 = 0
        L_0x0010:
            r5 = r4
            r4 = r2
            goto L_0x001b
        L_0x0013:
            int r4 = r1.G
            long r4 = (long) r4
            bhy r4 = r2.a(r4)
            r5 = 0
        L_0x001b:
            r12 = r18
            long r10 = r12.a(r4)     // Catch:{ all -> 0x02a4 }
            aof r13 = new aof     // Catch:{ all -> 0x02a4 }
            long r8 = r4.d     // Catch:{ all -> 0x02a4 }
            r6 = r13
            r7 = r18
            r6.<init>(r7, r8, r10)     // Catch:{ all -> 0x02a4 }
            aoi r6 = r1.E     // Catch:{ all -> 0x02a4 }
            if (r6 != 0) goto L_0x0276
            long r6 = r1.a(r13)     // Catch:{ all -> 0x02a4 }
            r13.a()     // Catch:{ all -> 0x02a4 }
            bbh r8 = r1.x     // Catch:{ all -> 0x02a4 }
            aoi r9 = r1.s     // Catch:{ all -> 0x02a4 }
            android.net.Uri r4 = r4.a     // Catch:{ all -> 0x02a4 }
            akh r10 = r1.g     // Catch:{ all -> 0x02a4 }
            java.util.List r11 = r1.y     // Catch:{ all -> 0x02a4 }
            anq r14 = r1.z     // Catch:{ all -> 0x02a4 }
            blj r15 = r1.v     // Catch:{ all -> 0x02a4 }
            r18.b()     // Catch:{ all -> 0x02a4 }
            r20 = r4
            if (r9 == 0) goto L_0x00ca
            boolean r16 = defpackage.bay.b(r9)     // Catch:{ all -> 0x02a4 }
            if (r16 == 0) goto L_0x005a
            bbg r0 = defpackage.bay.a(r9)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x005a:
            boolean r3 = r9 instanceof defpackage.bbz     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x006a
            bbz r3 = new bbz     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = r10.A     // Catch:{ all -> 0x02a4 }
            r3.<init>(r4, r15)     // Catch:{ all -> 0x02a4 }
            bbg r3 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
        L_0x0069:
            goto L_0x00a4
        L_0x006a:
            boolean r3 = r9 instanceof defpackage.aro     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0078
            aro r3 = new aro     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            bbg r3 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x00a4
        L_0x0078:
            boolean r3 = r9 instanceof defpackage.ark     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0086
            ark r3 = new ark     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            bbg r3 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x00a4
        L_0x0086:
            boolean r3 = r9 instanceof defpackage.arm     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0094
            arm r3 = new arm     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            bbg r3 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x00a4
        L_0x0094:
            boolean r3 = r9 instanceof defpackage.apo     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x00a2
            apo r3 = new apo     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            bbg r3 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x00a4
        L_0x00a2:
            r3 = 0
            goto L_0x0069
        L_0x00a4:
            if (r3 != 0) goto L_0x00ca
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException     // Catch:{ all -> 0x02a4 }
            java.lang.String r2 = "Unexpected previousExtractor type: "
            java.lang.Class r3 = r9.getClass()     // Catch:{ all -> 0x02a4 }
            java.lang.String r3 = r3.getSimpleName()     // Catch:{ all -> 0x02a4 }
            java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ all -> 0x02a4 }
            int r4 = r3.length()     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x00c2
            java.lang.String r3 = new java.lang.String     // Catch:{ all -> 0x02a4 }
            r3.<init>(r2)     // Catch:{ all -> 0x02a4 }
            goto L_0x00c6
        L_0x00c2:
            java.lang.String r3 = r2.concat(r3)     // Catch:{ all -> 0x02a4 }
        L_0x00c6:
            r0.<init>(r3)     // Catch:{ all -> 0x02a4 }
            throw r0     // Catch:{ all -> 0x02a4 }
        L_0x00ca:
            java.lang.String r3 = r20.getLastPathSegment()     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x00d1
            goto L_0x00d4
        L_0x00d1:
            java.lang.String r3 = ""
        L_0x00d4:
            java.lang.String r4 = "text/vtt"
            java.lang.String r9 = r10.i     // Catch:{ all -> 0x02a4 }
            boolean r4 = r4.equals(r9)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x00e0
            goto L_0x0173
        L_0x00e0:
            java.lang.String r4 = ".webvtt"
            boolean r4 = r3.endsWith(r4)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x0173
            java.lang.String r4 = ".vtt"
            boolean r4 = r3.endsWith(r4)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x0173
            java.lang.String r4 = ".aac"
            boolean r4 = r3.endsWith(r4)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x00ff
            aro r0 = new aro     // Catch:{ all -> 0x02a4 }
            r0.<init>()     // Catch:{ all -> 0x02a4 }
            goto L_0x017a
        L_0x00ff:
            java.lang.String r4 = ".ac3"
            boolean r4 = r3.endsWith(r4)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x0108
            goto L_0x016d
        L_0x0108:
            java.lang.String r4 = ".ec3"
            boolean r4 = r3.endsWith(r4)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x016d
            java.lang.String r4 = ".ac4"
            boolean r4 = r3.endsWith(r4)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x011e
            arm r0 = new arm     // Catch:{ all -> 0x02a4 }
            r0.<init>()     // Catch:{ all -> 0x02a4 }
            goto L_0x017a
        L_0x011e:
            java.lang.String r4 = ".mp3"
            boolean r4 = r3.endsWith(r4)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x012e
            apo r0 = new apo     // Catch:{ all -> 0x02a4 }
            r3 = 0
            r0.<init>(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x017a
        L_0x012e:
            boolean r4 = r3.endsWith(r0)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x0168
            java.lang.String r4 = ".m4"
            int r9 = r3.length()     // Catch:{ all -> 0x02a4 }
            int r9 = r9 + -4
            boolean r4 = r3.startsWith(r4, r9)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x0168
            int r4 = r3.length()     // Catch:{ all -> 0x02a4 }
            int r4 = r4 + -5
            boolean r0 = r3.startsWith(r0, r4)     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x0168
            java.lang.String r0 = ".cmf"
            int r4 = r3.length()     // Catch:{ all -> 0x02a4 }
            int r4 = r4 + -5
            boolean r0 = r3.startsWith(r0, r4)     // Catch:{ all -> 0x02a4 }
            if (r0 == 0) goto L_0x015e
            goto L_0x0168
        L_0x015e:
            r0 = r8
            bay r0 = (defpackage.bay) r0     // Catch:{ all -> 0x02a4 }
            boolean r0 = r0.a     // Catch:{ all -> 0x02a4 }
            ass r0 = defpackage.bay.a(r10, r11, r15)     // Catch:{ all -> 0x02a4 }
            goto L_0x017b
        L_0x0168:
            aqg r0 = defpackage.bay.a(r15, r10, r14, r11)     // Catch:{ all -> 0x02a4 }
            goto L_0x017b
        L_0x016d:
            ark r0 = new ark     // Catch:{ all -> 0x02a4 }
            r0.<init>()     // Catch:{ all -> 0x02a4 }
            goto L_0x017a
        L_0x0173:
            bbz r0 = new bbz     // Catch:{ all -> 0x02a4 }
            java.lang.String r3 = r10.A     // Catch:{ all -> 0x02a4 }
            r0.<init>(r3, r15)     // Catch:{ all -> 0x02a4 }
        L_0x017a:
        L_0x017b:
            r13.a()     // Catch:{ all -> 0x02a4 }
            boolean r3 = defpackage.bay.a(r0, r13)     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x018c
            bbg r0 = defpackage.bay.a(r0)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x018c:
            boolean r3 = r0 instanceof defpackage.bbz     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01a5
            bbz r3 = new bbz     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = r10.A     // Catch:{ all -> 0x02a4 }
            r3.<init>(r4, r15)     // Catch:{ all -> 0x02a4 }
            boolean r4 = defpackage.bay.a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x01a5
            bbg r0 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x01a5:
            boolean r3 = r0 instanceof defpackage.aro     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01bd
            aro r3 = new aro     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            boolean r4 = defpackage.bay.a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x01b5
            goto L_0x01bd
        L_0x01b5:
            bbg r0 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x01bd:
            boolean r3 = r0 instanceof defpackage.ark     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01d5
            ark r3 = new ark     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            boolean r4 = defpackage.bay.a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x01cd
            goto L_0x01d5
        L_0x01cd:
            bbg r0 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x01d5:
            boolean r3 = r0 instanceof defpackage.arm     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01ec
            arm r3 = new arm     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            boolean r4 = defpackage.bay.a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x01e5
            goto L_0x01ec
        L_0x01e5:
            bbg r0 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x01ec:
            boolean r3 = r0 instanceof defpackage.apo     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x0205
            apo r3 = new apo     // Catch:{ all -> 0x02a4 }
            r20 = r5
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x02a4 }
            boolean r4 = defpackage.bay.a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x0200
            goto L_0x0207
        L_0x0200:
            bbg r0 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0237
        L_0x0205:
            r20 = r5
        L_0x0207:
            boolean r3 = r0 instanceof defpackage.aqg     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x021b
            aqg r3 = defpackage.bay.a(r15, r10, r14, r11)     // Catch:{ all -> 0x02a4 }
            boolean r4 = defpackage.bay.a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x0216
            goto L_0x021b
        L_0x0216:
            bbg r0 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0237
        L_0x021b:
            boolean r3 = r0 instanceof defpackage.ass     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0220
            goto L_0x0233
        L_0x0220:
            bay r8 = (defpackage.bay) r8     // Catch:{ all -> 0x02a4 }
            boolean r3 = r8.a     // Catch:{ all -> 0x02a4 }
            ass r3 = defpackage.bay.a(r10, r11, r15)     // Catch:{ all -> 0x02a4 }
            boolean r4 = defpackage.bay.a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x0233
            bbg r0 = defpackage.bay.a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0237
        L_0x0233:
            bbg r0 = defpackage.bay.a(r0)     // Catch:{ all -> 0x02a4 }
        L_0x0237:
            aoi r3 = r0.a     // Catch:{ all -> 0x02a4 }
            r1.E = r3     // Catch:{ all -> 0x02a4 }
            boolean r3 = r0.c     // Catch:{ all -> 0x02a4 }
            r1.F = r3     // Catch:{ all -> 0x02a4 }
            boolean r0 = r0.b     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x024b
            bbs r0 = r1.b     // Catch:{ all -> 0x02a4 }
            r3 = 0
            r0.b(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0264
        L_0x024b:
            bbs r0 = r1.b     // Catch:{ all -> 0x02a4 }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x025d
            blj r3 = r1.v     // Catch:{ all -> 0x02a4 }
            long r3 = r3.b(r6)     // Catch:{ all -> 0x02a4 }
            goto L_0x0261
        L_0x025d:
            long r3 = r1.j     // Catch:{ all -> 0x02a4 }
        L_0x0261:
            r0.b(r3)     // Catch:{ all -> 0x02a4 }
        L_0x0264:
            bbs r0 = r1.b     // Catch:{ all -> 0x02a4 }
            int r3 = r1.a     // Catch:{ all -> 0x02a4 }
            boolean r4 = r1.w     // Catch:{ all -> 0x02a4 }
            r5 = 0
            r0.a(r3, r4, r5)     // Catch:{ all -> 0x02a4 }
            aoi r0 = r1.E     // Catch:{ all -> 0x02a4 }
            bbs r3 = r1.b     // Catch:{ all -> 0x02a4 }
            r0.a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0278
        L_0x0276:
            r20 = r5
        L_0x0278:
            if (r20 != 0) goto L_0x027b
            goto L_0x0280
        L_0x027b:
            int r0 = r1.G     // Catch:{ all -> 0x02a4 }
            r13.a(r0)     // Catch:{ all -> 0x02a4 }
        L_0x0280:
            boolean r0 = r1.I     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x028e
            aoi r0 = r1.E     // Catch:{ all -> 0x029a }
            aop r3 = defpackage.bbi.d     // Catch:{ all -> 0x029a }
            int r0 = r0.a(r13, r3)     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x0280
        L_0x028e:
            long r3 = r13.c     // Catch:{ all -> 0x02a4 }
            long r5 = r2.d     // Catch:{ all -> 0x02a4 }
            long r3 = r3 - r5
            int r0 = (int) r3     // Catch:{ all -> 0x02a4 }
            r1.G = r0     // Catch:{ all -> 0x02a4 }
            defpackage.blm.a(r18)
            return
        L_0x029a:
            r0 = move-exception
            long r3 = r13.c     // Catch:{ all -> 0x02a4 }
            long r5 = r2.d     // Catch:{ all -> 0x02a4 }
            long r3 = r3 - r5
            int r2 = (int) r3     // Catch:{ all -> 0x02a4 }
            r1.G = r2     // Catch:{ all -> 0x02a4 }
            throw r0     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r0 = move-exception
            defpackage.blm.a(r18)
            goto L_0x02aa
        L_0x02a9:
            throw r0
        L_0x02aa:
            goto L_0x02a9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bbi.a(bhv, bhy, boolean):void");
    }

    private static byte[] a(String str) {
        int i;
        if (blm.d(str).startsWith("0x")) {
            str = str.substring(2);
        }
        byte[] byteArray = new BigInteger(str, 16).toByteArray();
        byte[] bArr = new byte[16];
        int length = byteArray.length;
        if (length > 16) {
            i = length - 16;
        } else {
            i = 0;
        }
        System.arraycopy(byteArray, i, bArr, (16 - length) + i, length - i);
        return bArr;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbs.a(int, boolean, boolean):void
     arg types: [int, boolean, int]
     candidates:
      bbs.a(akh, akh, boolean):akh
      bbs.a(bit, long, long):void
      biq.a(bit, long, long):void
      bbs.a(int, boolean, boolean):void */
    public final void b() {
        aoi aoi;
        bks.a(this.b);
        if (this.E == null && (aoi = this.s) != null) {
            this.E = aoi;
            this.F = true;
            this.H = false;
            this.b.a(this.a, this.w, true);
        }
        if (this.H) {
            bks.a(this.q);
            bks.a(this.r);
            a(this.q, this.r, this.D);
            this.G = 0;
            this.H = false;
        }
        if (!this.I) {
            if (!this.u) {
                if (this.t) {
                    blj blj = this.v;
                    if (blj.a == Long.MAX_VALUE) {
                        blj.a(this.j);
                    }
                } else {
                    this.v.c();
                }
                a(this.l, this.e, this.C);
            }
            this.c = true;
        }
    }

    private final long a(aoj aoj) {
        aoj.a();
        try {
            aoj.c(this.B.a, 0, 10);
            this.B.a(10);
            if (this.B.g() == 4801587) {
                this.B.d(3);
                int m = this.B.m();
                int i = m + 10;
                if (i > this.B.c()) {
                    bky bky = this.B;
                    byte[] bArr = bky.a;
                    bky.a(i);
                    System.arraycopy(bArr, 0, this.B.a, 0, 10);
                }
                aoj.c(this.B.a, 10, m);
                atw a2 = avb.a(this.B.a, m);
                if (a2 != null) {
                    int a3 = a2.a();
                    for (int i2 = 0; i2 < a3; i2++) {
                        atv a4 = a2.a(i2);
                        if (a4 instanceof avi) {
                            avi avi = (avi) a4;
                            if ("com.apple.streaming.transportStreamTimestamp".equals(avi.a)) {
                                System.arraycopy(avi.b, 0, this.B.a, 0, 8);
                                this.B.a(8);
                                return this.B.l() & 8589934591L;
                            }
                        }
                    }
                }
            }
            return -9223372036854775807L;
        } catch (EOFException e) {
            return -9223372036854775807L;
        }
    }
}
