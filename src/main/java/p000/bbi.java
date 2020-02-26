package p000;

import android.net.Uri;
import java.io.EOFException;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: bbi */
/* compiled from: PG */
final class bbi extends ayx {

    /* renamed from: d */
    private static final aop f3074d = new aop();

    /* renamed from: n */
    private static final AtomicInteger f3075n = new AtomicInteger();

    /* renamed from: A */
    private final avb f3076A;

    /* renamed from: B */
    private final bky f3077B;

    /* renamed from: C */
    private final boolean f3078C;

    /* renamed from: D */
    private final boolean f3079D;

    /* renamed from: E */
    private aoi f3080E;

    /* renamed from: F */
    private boolean f3081F;

    /* renamed from: G */
    private int f3082G;

    /* renamed from: H */
    private boolean f3083H;

    /* renamed from: I */
    private volatile boolean f3084I;

    /* renamed from: a */
    public final int f3085a;

    /* renamed from: b */
    public bbs f3086b;

    /* renamed from: c */
    public boolean f3087c;

    /* renamed from: o */
    private final int f3088o;

    /* renamed from: p */
    private final Uri f3089p;

    /* renamed from: q */
    private final bhv f3090q;

    /* renamed from: r */
    private final bhy f3091r;

    /* renamed from: s */
    private final aoi f3092s;

    /* renamed from: t */
    private final boolean f3093t;

    /* renamed from: u */
    private final boolean f3094u;

    /* renamed from: v */
    private final blj f3095v;

    /* renamed from: w */
    private final boolean f3096w;

    /* renamed from: x */
    private final bbh f3097x;

    /* renamed from: y */
    private final List f3098y;

    /* renamed from: z */
    private final anq f3099z;

    /* renamed from: e */
    public final boolean mo1642e() {
        throw null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    private bbi(bbh bbh, bhv bhv, bhy bhy, akh akh, boolean z, bhv bhv2, bhy bhy2, boolean z2, Uri uri, List list, int i, Object obj, long j, long j2, long j3, int i2, boolean z3, boolean z4, blj blj, anq anq, aoi aoi, avb avb, bky bky, boolean z5) {
        super(bhv, bhy, akh, i, obj, j, j2, j3);
        boolean z6;
        bhy bhy3 = bhy2;
        this.f3078C = z;
        this.f3088o = i2;
        this.f3091r = bhy3;
        this.f3090q = bhv2;
        if (bhy3 != null) {
            z6 = true;
        } else {
            z6 = false;
        }
        this.f3083H = z6;
        this.f3079D = z2;
        this.f3089p = uri;
        this.f3093t = z4;
        this.f3095v = blj;
        this.f3094u = z3;
        this.f3097x = bbh;
        this.f3098y = list;
        this.f3099z = anq;
        this.f3092s = aoi;
        this.f3076A = avb;
        this.f3077B = bky;
        this.f3096w = z5;
        this.f3085a = f3075n.getAndIncrement();
    }

    /* renamed from: a */
    private static bhv m2701a(bhv bhv, byte[] bArr, byte[] bArr2) {
        if (bArr == null) {
            return bhv;
        }
        bks.m3507a(bArr2);
        return new baw(bhv, bArr, bArr2);
    }

    /* renamed from: a */
    public final void mo1538a() {
        this.f3084I = true;
    }

    /* renamed from: a */
    public static bbi m2700a(bbh bbh, bhv bhv, akh akh, long j, bch bch, int i, Uri uri, List list, int i2, Object obj, boolean z, bby bby, bbi bbi, byte[] bArr, byte[] bArr2) {
        bhv bhv2;
        boolean z2;
        bhy bhy;
        boolean z3;
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
        bcg bcg = (bcg) bch2.f3272l.get(i3);
        bhy bhy2 = new bhy(blk.m3616a(bch2.f3274n, bcg.f3250a), bcg.f3258i, bcg.f3259j, null);
        boolean z4 = bArr3 != null;
        bhv a = m2701a(bhv3, bArr3, z4 ? m2703a((String) bks.m3507a((Object) bcg.f3257h)) : null);
        bcg bcg2 = bcg.f3251b;
        if (bcg2 == null) {
            bhy = null;
            z2 = false;
            bhv2 = null;
        } else {
            boolean z5 = bArr4 != null;
            byte[] a2 = z5 ? m2703a((String) bks.m3507a((Object) bcg2.f3257h)) : null;
            bhy bhy3 = new bhy(blk.m3616a(bch2.f3274n, bcg2.f3250a), bcg2.f3258i, bcg2.f3259j, null);
            bhv a3 = m2701a(bhv3, bArr4, a2);
            z2 = z5;
            bhv2 = a3;
            bhy = bhy3;
        }
        long j2 = j + bcg.f3254e;
        long j3 = j2 + bcg.f3252c;
        int i4 = bch2.f3265e + bcg.f3253d;
        if (bbi2 != null) {
            avb avb2 = bbi2.f3076A;
            bky bky2 = bbi2.f3077B;
            boolean z6 = !uri.equals(bbi2.f3089p) || !bbi2.f3087c;
            if (!bbi2.f3081F || bbi2.f3088o != i4 || z6) {
                aoi2 = null;
            } else {
                aoi2 = bbi2.f3080E;
            }
            avb = avb2;
            bky = bky2;
            z3 = z6;
            aoi = aoi2;
        } else {
            avb = new avb();
            bky = new bky(10);
            aoi = null;
            z3 = false;
        }
        long j4 = bch2.f3266f + ((long) i3);
        boolean z7 = bcg.f3260k;
        blj blj2 = (blj) bby2.f3196a.get(i4);
        if (blj2 == null) {
            blj blj3 = new blj(Long.MAX_VALUE);
            bby2.f3196a.put(i4, blj3);
            blj = blj3;
        } else {
            blj = blj2;
        }
        return new bbi(bbh, a, bhy2, akh, z4, bhv2, bhy, z2, uri, list, i2, obj, j2, j3, j4, i4, z7, z, blj, bcg.f3255f, aoi, avb, bky, z3);
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
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m2702a(p000.bhv r18, p000.bhy r19, boolean r20) {
        /*
            r17 = this;
            r1 = r17
            r2 = r19
            java.lang.String r0 = ".mp4"
            if (r20 == 0) goto L_0x0013
            int r4 = r1.f3082G
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
            int r4 = r1.f3082G
            long r4 = (long) r4
            bhy r4 = r2.mo1955a(r4)
            r5 = 0
        L_0x001b:
            r12 = r18
            long r10 = r12.mo1499a(r4)     // Catch:{ all -> 0x02a4 }
            aof r13 = new aof     // Catch:{ all -> 0x02a4 }
            long r8 = r4.f4001d     // Catch:{ all -> 0x02a4 }
            r6 = r13
            r7 = r18
            r6.<init>(r7, r8, r10)     // Catch:{ all -> 0x02a4 }
            aoi r6 = r1.f3080E     // Catch:{ all -> 0x02a4 }
            if (r6 != 0) goto L_0x0276
            long r6 = r1.m2699a(r13)     // Catch:{ all -> 0x02a4 }
            r13.mo1191a()     // Catch:{ all -> 0x02a4 }
            bbh r8 = r1.f3097x     // Catch:{ all -> 0x02a4 }
            aoi r9 = r1.f3092s     // Catch:{ all -> 0x02a4 }
            android.net.Uri r4 = r4.f3998a     // Catch:{ all -> 0x02a4 }
            akh r10 = r1.f2769g     // Catch:{ all -> 0x02a4 }
            java.util.List r11 = r1.f3098y     // Catch:{ all -> 0x02a4 }
            anq r14 = r1.f3099z     // Catch:{ all -> 0x02a4 }
            blj r15 = r1.f3095v     // Catch:{ all -> 0x02a4 }
            r18.mo1502b()     // Catch:{ all -> 0x02a4 }
            r20 = r4
            if (r9 == 0) goto L_0x00ca
            boolean r16 = p000.bay.m2685b(r9)     // Catch:{ all -> 0x02a4 }
            if (r16 == 0) goto L_0x005a
            bbg r0 = p000.bay.m2683a(r9)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x005a:
            boolean r3 = r9 instanceof p000.bbz     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x006a
            bbz r3 = new bbz     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = r10.f544A     // Catch:{ all -> 0x02a4 }
            r3.<init>(r4, r15)     // Catch:{ all -> 0x02a4 }
            bbg r3 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
        L_0x0069:
            goto L_0x00a4
        L_0x006a:
            boolean r3 = r9 instanceof p000.aro     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0078
            aro r3 = new aro     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            bbg r3 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x00a4
        L_0x0078:
            boolean r3 = r9 instanceof p000.ark     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0086
            ark r3 = new ark     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            bbg r3 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x00a4
        L_0x0086:
            boolean r3 = r9 instanceof p000.arm     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0094
            arm r3 = new arm     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            bbg r3 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x00a4
        L_0x0094:
            boolean r3 = r9 instanceof p000.apo     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x00a2
            apo r3 = new apo     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            bbg r3 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
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
            java.lang.String r9 = r10.f556i     // Catch:{ all -> 0x02a4 }
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
            bay r0 = (p000.bay) r0     // Catch:{ all -> 0x02a4 }
            boolean r0 = r0.f3044a     // Catch:{ all -> 0x02a4 }
            ass r0 = p000.bay.m2682a(r10, r11, r15)     // Catch:{ all -> 0x02a4 }
            goto L_0x017b
        L_0x0168:
            aqg r0 = p000.bay.m2681a(r15, r10, r14, r11)     // Catch:{ all -> 0x02a4 }
            goto L_0x017b
        L_0x016d:
            ark r0 = new ark     // Catch:{ all -> 0x02a4 }
            r0.<init>()     // Catch:{ all -> 0x02a4 }
            goto L_0x017a
        L_0x0173:
            bbz r0 = new bbz     // Catch:{ all -> 0x02a4 }
            java.lang.String r3 = r10.f544A     // Catch:{ all -> 0x02a4 }
            r0.<init>(r3, r15)     // Catch:{ all -> 0x02a4 }
        L_0x017a:
        L_0x017b:
            r13.mo1191a()     // Catch:{ all -> 0x02a4 }
            boolean r3 = p000.bay.m2684a(r0, r13)     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x018c
            bbg r0 = p000.bay.m2683a(r0)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x018c:
            boolean r3 = r0 instanceof p000.bbz     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01a5
            bbz r3 = new bbz     // Catch:{ all -> 0x02a4 }
            java.lang.String r4 = r10.f544A     // Catch:{ all -> 0x02a4 }
            r3.<init>(r4, r15)     // Catch:{ all -> 0x02a4 }
            boolean r4 = p000.bay.m2684a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x01a5
            bbg r0 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x01a5:
            boolean r3 = r0 instanceof p000.aro     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01bd
            aro r3 = new aro     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            boolean r4 = p000.bay.m2684a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x01b5
            goto L_0x01bd
        L_0x01b5:
            bbg r0 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x01bd:
            boolean r3 = r0 instanceof p000.ark     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01d5
            ark r3 = new ark     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            boolean r4 = p000.bay.m2684a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x01cd
            goto L_0x01d5
        L_0x01cd:
            bbg r0 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x01d5:
            boolean r3 = r0 instanceof p000.arm     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x01ec
            arm r3 = new arm     // Catch:{ all -> 0x02a4 }
            r3.<init>()     // Catch:{ all -> 0x02a4 }
            boolean r4 = p000.bay.m2684a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x01e5
            goto L_0x01ec
        L_0x01e5:
            bbg r0 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            r20 = r5
            goto L_0x0237
        L_0x01ec:
            boolean r3 = r0 instanceof p000.apo     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x0205
            apo r3 = new apo     // Catch:{ all -> 0x02a4 }
            r20 = r5
            r4 = 0
            r3.<init>(r4)     // Catch:{ all -> 0x02a4 }
            boolean r4 = p000.bay.m2684a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x0200
            goto L_0x0207
        L_0x0200:
            bbg r0 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0237
        L_0x0205:
            r20 = r5
        L_0x0207:
            boolean r3 = r0 instanceof p000.aqg     // Catch:{ all -> 0x02a4 }
            if (r3 != 0) goto L_0x021b
            aqg r3 = p000.bay.m2681a(r15, r10, r14, r11)     // Catch:{ all -> 0x02a4 }
            boolean r4 = p000.bay.m2684a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 != 0) goto L_0x0216
            goto L_0x021b
        L_0x0216:
            bbg r0 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0237
        L_0x021b:
            boolean r3 = r0 instanceof p000.ass     // Catch:{ all -> 0x02a4 }
            if (r3 == 0) goto L_0x0220
            goto L_0x0233
        L_0x0220:
            bay r8 = (p000.bay) r8     // Catch:{ all -> 0x02a4 }
            boolean r3 = r8.f3044a     // Catch:{ all -> 0x02a4 }
            ass r3 = p000.bay.m2682a(r10, r11, r15)     // Catch:{ all -> 0x02a4 }
            boolean r4 = p000.bay.m2684a(r3, r13)     // Catch:{ all -> 0x02a4 }
            if (r4 == 0) goto L_0x0233
            bbg r0 = p000.bay.m2683a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0237
        L_0x0233:
            bbg r0 = p000.bay.m2683a(r0)     // Catch:{ all -> 0x02a4 }
        L_0x0237:
            aoi r3 = r0.f3070a     // Catch:{ all -> 0x02a4 }
            r1.f3080E = r3     // Catch:{ all -> 0x02a4 }
            boolean r3 = r0.f3072c     // Catch:{ all -> 0x02a4 }
            r1.f3081F = r3     // Catch:{ all -> 0x02a4 }
            boolean r0 = r0.f3071b     // Catch:{ all -> 0x02a4 }
            if (r0 != 0) goto L_0x024b
            bbs r0 = r1.f3086b     // Catch:{ all -> 0x02a4 }
            r3 = 0
            r0.mo1728b(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0264
        L_0x024b:
            bbs r0 = r1.f3086b     // Catch:{ all -> 0x02a4 }
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x025d
            blj r3 = r1.f3095v     // Catch:{ all -> 0x02a4 }
            long r3 = r3.mo2115b(r6)     // Catch:{ all -> 0x02a4 }
            goto L_0x0261
        L_0x025d:
            long r3 = r1.f2772j     // Catch:{ all -> 0x02a4 }
        L_0x0261:
            r0.mo1728b(r3)     // Catch:{ all -> 0x02a4 }
        L_0x0264:
            bbs r0 = r1.f3086b     // Catch:{ all -> 0x02a4 }
            int r3 = r1.f3085a     // Catch:{ all -> 0x02a4 }
            boolean r4 = r1.f3096w     // Catch:{ all -> 0x02a4 }
            r5 = 0
            r0.mo1724a(r3, r4, r5)     // Catch:{ all -> 0x02a4 }
            aoi r0 = r1.f3080E     // Catch:{ all -> 0x02a4 }
            bbs r3 = r1.f3086b     // Catch:{ all -> 0x02a4 }
            r0.mo1208a(r3)     // Catch:{ all -> 0x02a4 }
            goto L_0x0278
        L_0x0276:
            r20 = r5
        L_0x0278:
            if (r20 != 0) goto L_0x027b
            goto L_0x0280
        L_0x027b:
            int r0 = r1.f3082G     // Catch:{ all -> 0x02a4 }
            r13.mo1192a(r0)     // Catch:{ all -> 0x02a4 }
        L_0x0280:
            boolean r0 = r1.f3084I     // Catch:{ all -> 0x029a }
            if (r0 != 0) goto L_0x028e
            aoi r0 = r1.f3080E     // Catch:{ all -> 0x029a }
            aop r3 = p000.bbi.f3074d     // Catch:{ all -> 0x029a }
            int r0 = r0.mo1206a(r13, r3)     // Catch:{ all -> 0x029a }
            if (r0 == 0) goto L_0x0280
        L_0x028e:
            long r3 = r13.f1490c     // Catch:{ all -> 0x02a4 }
            long r5 = r2.f4001d     // Catch:{ all -> 0x02a4 }
            long r3 = r3 - r5
            int r0 = (int) r3     // Catch:{ all -> 0x02a4 }
            r1.f3082G = r0     // Catch:{ all -> 0x02a4 }
            p000.blm.m3644a(r18)
            return
        L_0x029a:
            r0 = move-exception
            long r3 = r13.f1490c     // Catch:{ all -> 0x02a4 }
            long r5 = r2.f4001d     // Catch:{ all -> 0x02a4 }
            long r3 = r3 - r5
            int r2 = (int) r3     // Catch:{ all -> 0x02a4 }
            r1.f3082G = r2     // Catch:{ all -> 0x02a4 }
            throw r0     // Catch:{ all -> 0x02a4 }
        L_0x02a4:
            r0 = move-exception
            p000.blm.m3644a(r18)
            goto L_0x02aa
        L_0x02a9:
            throw r0
        L_0x02aa:
            goto L_0x02a9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bbi.m2702a(bhv, bhy, boolean):void");
    }

    /* renamed from: a */
    private static byte[] m2703a(String str) {
        int i;
        if (blm.m3675d(str).startsWith("0x")) {
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
    /* renamed from: b */
    public final void mo1540b() {
        aoi aoi;
        bks.m3507a(this.f3086b);
        if (this.f3080E == null && (aoi = this.f3092s) != null) {
            this.f3080E = aoi;
            this.f3081F = true;
            this.f3083H = false;
            this.f3086b.mo1724a(this.f3085a, this.f3096w, true);
        }
        if (this.f3083H) {
            bks.m3507a(this.f3090q);
            bks.m3507a(this.f3091r);
            m2702a(this.f3090q, this.f3091r, this.f3079D);
            this.f3082G = 0;
            this.f3083H = false;
        }
        if (!this.f3084I) {
            if (!this.f3094u) {
                if (this.f3093t) {
                    blj blj = this.f3095v;
                    if (blj.f4289a == Long.MAX_VALUE) {
                        blj.mo2114a(this.f2772j);
                    }
                } else {
                    this.f3095v.mo2118c();
                }
                m2702a(this.f2774l, this.f2767e, this.f3078C);
            }
            this.f3087c = true;
        }
    }

    /* renamed from: a */
    private final long m2699a(aoj aoj) {
        aoj.mo1191a();
        try {
            aoj.mo1199c(this.f3077B.f4258a, 0, 10);
            this.f3077B.mo2065a(10);
            if (this.f3077B.mo2080g() == 4801587) {
                this.f3077B.mo2075d(3);
                int m = this.f3077B.mo2086m();
                int i = m + 10;
                if (i > this.f3077B.mo2072c()) {
                    bky bky = this.f3077B;
                    byte[] bArr = bky.f4258a;
                    bky.mo2065a(i);
                    System.arraycopy(bArr, 0, this.f3077B.f4258a, 0, 10);
                }
                aoj.mo1199c(this.f3077B.f4258a, 10, m);
                atw a = avb.m2176a(this.f3077B.f4258a, m);
                if (a != null) {
                    int a2 = a.mo1344a();
                    for (int i2 = 0; i2 < a2; i2++) {
                        atv a3 = a.mo1345a(i2);
                        if (a3 instanceof avi) {
                            avi avi = (avi) a3;
                            if ("com.apple.streaming.transportStreamTimestamp".equals(avi.f2492a)) {
                                System.arraycopy(avi.f2493b, 0, this.f3077B.f4258a, 0, 8);
                                this.f3077B.mo2065a(8);
                                return this.f3077B.mo2085l() & 8589934591L;
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
