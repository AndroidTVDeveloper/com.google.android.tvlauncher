package p000;

import android.net.Uri;
import android.os.Handler;
import android.util.Log;
import android.util.SparseIntArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: bbs */
/* compiled from: PG */
final class bbs implements biq, biu, axz, aok, axv {

    /* renamed from: z */
    private static final Set f3141z = Collections.unmodifiableSet(new HashSet(Arrays.asList(1, 2, 4)));

    /* renamed from: A */
    private final bhk f3142A;

    /* renamed from: B */
    private final akh f3143B;

    /* renamed from: C */
    private final anu f3144C;

    /* renamed from: D */
    private final bip f3145D;

    /* renamed from: E */
    private final int f3146E;

    /* renamed from: F */
    private final bbc f3147F = new bbc();

    /* renamed from: G */
    private final List f3148G;

    /* renamed from: H */
    private final Runnable f3149H;

    /* renamed from: I */
    private final Runnable f3150I;

    /* renamed from: J */
    private final Map f3151J;

    /* renamed from: K */
    private int[] f3152K = new int[0];

    /* renamed from: L */
    private final Set f3153L = new HashSet(f3141z.size());

    /* renamed from: M */
    private final SparseIntArray f3154M = new SparseIntArray(f3141z.size());

    /* renamed from: N */
    private aov f3155N;

    /* renamed from: O */
    private int f3156O;

    /* renamed from: P */
    private boolean f3157P;

    /* renamed from: Q */
    private boolean[] f3158Q = new boolean[0];

    /* renamed from: R */
    private long f3159R;

    /* renamed from: S */
    private boolean f3160S;

    /* renamed from: T */
    private long f3161T;

    /* renamed from: U */
    private int f3162U;

    /* renamed from: a */
    public final int f3163a;

    /* renamed from: b */
    public final bbp f3164b;

    /* renamed from: c */
    public final bbe f3165c;

    /* renamed from: d */
    public final bix f3166d = new bix("Loader:HlsSampleStreamWrapper");

    /* renamed from: e */
    public final axg f3167e;

    /* renamed from: f */
    public final ArrayList f3168f;

    /* renamed from: g */
    public final Handler f3169g;

    /* renamed from: h */
    public final ArrayList f3170h;

    /* renamed from: i */
    public axw[] f3171i = new axw[0];

    /* renamed from: j */
    public int f3172j;

    /* renamed from: k */
    public boolean f3173k;

    /* renamed from: l */
    public boolean f3174l;

    /* renamed from: m */
    public int f3175m;

    /* renamed from: n */
    public akh f3176n;

    /* renamed from: o */
    public akh f3177o;

    /* renamed from: p */
    public boolean f3178p;

    /* renamed from: q */
    public aye f3179q;

    /* renamed from: r */
    public Set f3180r;

    /* renamed from: s */
    public int[] f3181s;

    /* renamed from: t */
    public int f3182t;

    /* renamed from: u */
    public boolean[] f3183u = new boolean[0];

    /* renamed from: v */
    public long f3184v;

    /* renamed from: w */
    public boolean f3185w;

    /* renamed from: x */
    public boolean f3186x;

    /* renamed from: y */
    public boolean f3187y;

    /* renamed from: a */
    private static int m2743a(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 3;
    }

    /* renamed from: a */
    public final void mo1212a(aos aos) {
    }

    /* renamed from: g */
    public final void mo1492g(long j) {
    }

    /* renamed from: m */
    public final boolean mo1734m() {
        return this.f3159R != -9223372036854775807L;
    }

    public bbs(int i, bbp bbp, bbe bbe, Map map, bhk bhk, long j, akh akh, anu anu, bip bip, axg axg, int i2) {
        this.f3163a = i;
        this.f3164b = bbp;
        this.f3165c = bbe;
        this.f3151J = map;
        this.f3142A = bhk;
        this.f3143B = akh;
        this.f3144C = anu;
        this.f3145D = bip;
        this.f3167e = axg;
        this.f3146E = i2;
        ArrayList arrayList = new ArrayList();
        this.f3168f = arrayList;
        this.f3148G = Collections.unmodifiableList(arrayList);
        this.f3170h = new ArrayList();
        this.f3149H = new bbm(this);
        this.f3150I = new bbn(this);
        this.f3169g = new Handler();
        this.f3184v = j;
        this.f3159R = j;
    }

    /* renamed from: o */
    public final void mo1736o() {
        bks.m3512b(this.f3174l);
        bks.m3507a(this.f3179q);
        bks.m3507a(this.f3180r);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: c */
    public final boolean mo1487c(long j) {
        long j2;
        List list;
        bbc bbc;
        boolean z;
        long j3;
        int i;
        if (this.f3187y || this.f3166d.mo1989d() || this.f3166d.mo1987b()) {
            return false;
        }
        if (mo1734m()) {
            list = Collections.emptyList();
            j2 = this.f3159R;
        } else {
            list = this.f3148G;
            bbi l = mo1733l();
            if (!l.f3087c) {
                j2 = Math.max(this.f3184v, l.f2772j);
            } else {
                j2 = l.f2773k;
            }
        }
        bbe bbe = this.f3165c;
        boolean z2 = this.f3174l || !list.isEmpty();
        bbc bbc2 = this.f3147F;
        bbi bbi = !list.isEmpty() ? (bbi) list.get(list.size() - 1) : null;
        int a = bbi != null ? bbe.f3058g.mo1603a(bbi.f2769g) : -1;
        long j4 = j2 - j;
        long j5 = bbe.f3067p;
        boolean z3 = z2;
        long j6 = j5 != -9223372036854775807L ? j5 - j : -9223372036854775807L;
        if (bbi == null) {
            bbc = bbc2;
        } else if (!bbe.f3065n) {
            bbc = bbc2;
            long j7 = bbi.f2773k - bbi.f2772j;
            j4 = Math.max(0L, j4 - j7);
            if (j6 != -9223372036854775807L) {
                j6 = Math.max(0L, j6 - j7);
            }
        } else {
            bbc = bbc2;
        }
        bbe.mo1715a(bbi, j2);
        bbe.f3066o.mo1710a(j4, j6);
        int h = bbe.f3066o.mo1837h();
        if (a != h) {
            z = true;
        } else {
            z = false;
        }
        Uri uri = bbe.f3055d[h];
        if (!bbe.f3057f.mo1757a(uri)) {
            bbc.f3050c = uri;
            bbe.f3068q &= uri.equals(bbe.f3064m);
            bbe.f3064m = uri;
        } else {
            bbc bbc3 = bbc;
            bch a2 = bbe.f3057f.mo1756a(uri, true);
            bks.m3507a(a2);
            bbe.f3065n = a2.f3276p;
            bbe.f3067p = !a2.f3269i ? a2.mo1761a() - ((bcc) bbe.f3057f).f3232n : -9223372036854775807L;
            long j8 = a2.f3263c - ((bcc) bbe.f3057f).f3232n;
            int i2 = a;
            bch bch = a2;
            long a3 = bbe.mo1713a(bbi, z, a2, j8, j2);
            if (a3 < bch.f3266f && bbi != null && z) {
                Uri uri2 = bbe.f3055d[i2];
                bch a4 = bbe.f3057f.mo1756a(uri2, true);
                bks.m3507a(a4);
                uri = uri2;
                bch = a4;
                h = i2;
                j3 = a4.f3263c - ((bcc) bbe.f3057f).f3232n;
                a3 = bbi.mo1641d();
            } else {
                j3 = j8;
            }
            long j9 = bch.f3266f;
            if (a3 < j9) {
                bbe.f3063l = new awd();
            } else {
                int i3 = (int) (a3 - j9);
                int size = bch.f3272l.size();
                if (i3 < size) {
                    i = i3;
                } else if (!bch.f3269i) {
                    bbc3.f3050c = uri;
                    bbe.f3068q &= uri.equals(bbe.f3064m);
                    bbe.f3064m = uri;
                } else if (!z3 && size != 0) {
                    i = size - 1;
                } else {
                    bbc3.f3049b = true;
                }
                bbe.f3068q = false;
                bbe.f3064m = null;
                bcg bcg = (bcg) bch.f3272l.get(i);
                Uri a5 = bbe.m2694a(bch, bcg.f3251b);
                bbc3.f3048a = bbe.mo1714a(a5, h);
                if (bbc3.f3048a == null) {
                    Uri a6 = bbe.m2694a(bch, bcg);
                    bbc3.f3048a = bbe.mo1714a(a6, h);
                    if (bbc3.f3048a == null) {
                        bbc3.f3048a = bbi.m2700a(bbe.f3052a, bbe.f3053b, bbe.f3056e[h], j3, bch, i, uri, bbe.f3059h, bbe.f3066o.mo1711b(), bbe.f3066o.mo1712c(), bbe.f3061j, bbe.f3054c, bbi, bbe.f3060i.mo1707a(a6), bbe.f3060i.mo1707a(a5));
                    }
                }
            }
        }
        bbc bbc4 = this.f3147F;
        boolean z4 = bbc4.f3049b;
        ayl ayl = bbc4.f3048a;
        Uri uri3 = bbc4.f3050c;
        bbc4.mo1708a();
        if (z4) {
            this.f3159R = -9223372036854775807L;
            this.f3187y = true;
            return true;
        } else if (ayl != null) {
            if (ayl instanceof bbi) {
                this.f3159R = -9223372036854775807L;
                bbi bbi2 = (bbi) ayl;
                bbi2.f3086b = this;
                this.f3168f.add(bbi2);
                this.f3176n = bbi2.f2769g;
            }
            this.f3166d.mo1984a(ayl, this, this.f3145D.mo1973a(ayl.f2768f));
            this.f3167e.mo1534c(ayl.f2772j, ayl.f2773k);
            return true;
        } else if (uri3 == null) {
            return false;
        } else {
            ((bcb) ((bcc) ((bbj) this.f3164b).f3100a).f3221c.get(uri3)).mo1753a();
            return false;
        }
    }

    /* renamed from: b */
    public final void mo1727b() {
        if (!this.f3174l) {
            mo1487c(this.f3184v);
        }
    }

    /* renamed from: b */
    private static aoh m2745b(int i, int i2) {
        StringBuilder sb = new StringBuilder(54);
        sb.append("Unmapped track with id ");
        sb.append(i);
        sb.append(" of type ");
        sb.append(i2);
        Log.w("HlsSampleStreamWrapper", sb.toString());
        return new aoh();
    }

    /* renamed from: a */
    public final aye mo1723a(ayc[] aycArr) {
        for (int i = 0; i < aycArr.length; i++) {
            ayc ayc = aycArr[i];
            akh[] akhArr = new akh[ayc.f2747a];
            for (int i2 = 0; i2 < ayc.f2747a; i2++) {
                akh a = ayc.mo1604a(i2);
                if (a.f559l != null) {
                    a = a.mo426b();
                }
                akhArr[i2] = a;
            }
            aycArr[i] = new ayc(akhArr);
        }
        return new aye(aycArr);
    }

    /* renamed from: a */
    private static akh m2744a(akh akh, akh akh2, boolean z) {
        String str;
        akh akh3 = akh;
        akh akh4 = akh2;
        if (akh3 == null) {
            return akh4;
        }
        int i = z ? akh3.f552e : -1;
        int i2 = akh3.f569v;
        int i3 = i2 != -1 ? i2 : akh4.f569v;
        String a = blm.m3637a(akh3.f553f, bkt.m3521g(akh4.f556i));
        String f = bkt.m3520f(a);
        if (f != null) {
            str = f;
        } else {
            str = akh4.f556i;
        }
        String str2 = akh3.f548a;
        String str3 = akh3.f549b;
        atw atw = akh3.f554g;
        int i4 = akh3.f561n;
        int i5 = akh3.f562o;
        int i6 = akh3.f550c;
        String str4 = akh3.f544A;
        atw atw2 = akh4.f554g;
        if (atw2 != null) {
            atw = atw2.mo1346a(atw);
        }
        int i7 = akh4.f551d;
        String str5 = akh4.f555h;
        int i8 = akh4.f557j;
        List list = akh4.f558k;
        anq anq = akh4.f559l;
        long j = akh4.f560m;
        float f2 = akh4.f563p;
        int i9 = akh4.f564q;
        float f3 = akh4.f565r;
        byte[] bArr = akh4.f567t;
        int i10 = akh4.f566s;
        blp blp = akh4.f568u;
        int i11 = akh4.f570w;
        int i12 = akh4.f571x;
        int i13 = akh4.f572y;
        int i14 = akh4.f573z;
        int i15 = akh4.f545B;
        Class cls = akh4.f546C;
        return new akh(str2, str3, i6, i7, i, a, atw, str5, str, i8, list, anq, j, i4, i5, f2, i9, f3, bArr, i10, blp, i3, i11, i12, i13, i14, str4, i15);
    }

    /* renamed from: S */
    public final void mo1210S() {
        this.f3160S = true;
        this.f3169g.post(this.f3150I);
    }

    /* renamed from: d */
    public final long mo1488d() {
        if (this.f3187y) {
            return Long.MIN_VALUE;
        }
        if (mo1734m()) {
            return this.f3159R;
        }
        long j = this.f3184v;
        bbi l = mo1733l();
        if (!l.f3087c) {
            if (this.f3168f.size() > 1) {
                ArrayList arrayList = this.f3168f;
                l = (bbi) arrayList.get(arrayList.size() - 2);
            } else {
                l = null;
            }
        }
        if (l != null) {
            j = Math.max(j, l.f2773k);
        }
        if (this.f3173k) {
            for (axw h : this.f3171i) {
                j = Math.max(j, h.mo1595h());
            }
        }
        return j;
    }

    /* renamed from: l */
    public final bbi mo1733l() {
        ArrayList arrayList = this.f3168f;
        return (bbi) arrayList.get(arrayList.size() - 1);
    }

    /* renamed from: e */
    public final long mo1490e() {
        if (mo1734m()) {
            return this.f3159R;
        }
        if (!this.f3187y) {
            return mo1733l().f2773k;
        }
        return Long.MIN_VALUE;
    }

    /* renamed from: c */
    public final aye mo1729c() {
        mo1736o();
        return this.f3179q;
    }

    /* renamed from: a */
    public final void mo1724a(int i, boolean z, boolean z2) {
        if (!z2) {
            this.f3153L.clear();
        }
        this.f3162U = i;
        for (axw a : this.f3171i) {
            a.mo1582a(i);
        }
        if (z) {
            for (axw axw : this.f3171i) {
                axw.f2720b = true;
            }
        }
    }

    /* renamed from: f */
    public final boolean mo1491f() {
        return this.f3166d.mo1989d();
    }

    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3, types: [boolean] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: bbs.a(akh, akh, boolean):akh
     arg types: [akh, akh, int]
     candidates:
      bbs.a(int, boolean, boolean):void
      bbs.a(bit, long, long):void
      biq.a(bit, long, long):void
      bbs.a(akh, akh, boolean):akh */
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
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1732j() {
        /*
            r14 = this;
            boolean r0 = r14.f3178p
            if (r0 != 0) goto L_0x016d
            int[] r0 = r14.f3181s
            if (r0 != 0) goto L_0x016d
            boolean r0 = r14.f3173k
            if (r0 == 0) goto L_0x016d
            axw[] r0 = r14.f3171i
            int r1 = r0.length
            r2 = 0
            r3 = 0
        L_0x0011:
            if (r3 < r1) goto L_0x0161
            aye r0 = r14.f3179q
            r4 = 3
            r1 = -1
            if (r0 != 0) goto L_0x00f2
            axw[] r0 = r14.f3171i
            int r3 = r0.length
            r5 = 6
            r0 = 0
            r6 = 6
            r7 = -1
        L_0x0020:
            r8 = 2
            r9 = 1
            if (r0 < r3) goto L_0x00b5
            bbe r0 = r14.f3165c
            ayc r0 = r0.f3058g
            int r4 = r0.f2747a
            r14.f3182t = r1
            int[] r1 = new int[r3]
            r14.f3181s = r1
            r1 = 0
        L_0x0031:
            if (r1 >= r3) goto L_0x003a
            int[] r5 = r14.f3181s
            r5[r1] = r1
            int r1 = r1 + 1
            goto L_0x0031
        L_0x003a:
            ayc[] r1 = new p000.ayc[r3]
            r5 = 0
        L_0x003d:
            if (r5 >= r3) goto L_0x0095
            axw[] r10 = r14.f3171i
            r10 = r10[r5]
            akh r10 = r10.mo1594g()
            if (r5 != r7) goto L_0x0072
            akh[] r11 = new p000.akh[r4]
            if (r4 == r9) goto L_0x005d
            r12 = 0
        L_0x004e:
            if (r12 >= r4) goto L_0x0068
            akh r13 = r0.mo1604a(r12)
            akh r13 = m2744a(r13, r10, r9)
            r11[r12] = r13
            int r12 = r12 + 1
            goto L_0x004e
        L_0x005d:
            akh r12 = r0.mo1604a(r2)
            akh r10 = r10.mo422a(r12)
            r11[r2] = r10
        L_0x0068:
            ayc r10 = new ayc
            r10.<init>(r11)
            r1[r5] = r10
            r14.f3182t = r5
            goto L_0x0092
        L_0x0072:
            r11 = 0
            if (r6 != r8) goto L_0x0082
            java.lang.String r12 = r10.f556i
            boolean r12 = p000.bkt.m3515a(r12)
            if (r12 == 0) goto L_0x0081
            akh r11 = r14.f3143B
            goto L_0x0083
        L_0x0081:
        L_0x0082:
        L_0x0083:
            ayc r12 = new ayc
            akh[] r13 = new p000.akh[r9]
            akh r10 = m2744a(r11, r10, r2)
            r13[r2] = r10
            r12.<init>(r13)
            r1[r5] = r12
        L_0x0092:
            int r5 = r5 + 1
            goto L_0x003d
        L_0x0095:
            aye r0 = r14.mo1723a(r1)
            r14.f3179q = r0
            java.util.Set r0 = r14.f3180r
            if (r0 != 0) goto L_0x00a1
            r2 = 1
            goto L_0x00a3
        L_0x00a1:
        L_0x00a3:
            p000.bks.m3512b(r2)
            java.util.Set r0 = java.util.Collections.emptySet()
            r14.f3180r = r0
            r14.mo1735n()
            bbp r0 = r14.f3164b
            r0.mo1717g()
            return
        L_0x00b5:
            axw[] r10 = r14.f3171i
            r10 = r10[r0]
            akh r10 = r10.mo1594g()
            java.lang.String r10 = r10.f556i
            boolean r11 = p000.bkt.m3516b(r10)
            if (r11 != 0) goto L_0x00d8
            boolean r8 = p000.bkt.m3515a(r10)
            if (r8 != 0) goto L_0x00d6
            boolean r8 = p000.bkt.m3517c(r10)
            if (r8 == 0) goto L_0x00d3
            r8 = 3
            goto L_0x00d9
        L_0x00d3:
            r8 = 6
            goto L_0x00d9
        L_0x00d6:
            r8 = 1
            goto L_0x00d9
        L_0x00d8:
        L_0x00d9:
            int r9 = m2743a(r8)
            int r10 = m2743a(r6)
            if (r9 <= r10) goto L_0x00e6
            r7 = r0
            r6 = r8
            goto L_0x00ed
        L_0x00e6:
            if (r8 == r6) goto L_0x00e9
        L_0x00e8:
            goto L_0x00ed
        L_0x00e9:
            if (r7 != r1) goto L_0x00ec
            goto L_0x00e8
        L_0x00ec:
            r7 = -1
        L_0x00ed:
            int r0 = r0 + 1
            goto L_0x0020
        L_0x00f2:
            int r5 = r0.f2751b
            int[] r0 = new int[r5]
            r14.f3181s = r0
            java.util.Arrays.fill(r0, r1)
            r0 = 0
        L_0x00fc:
            if (r0 < r5) goto L_0x0113
            java.util.ArrayList r0 = r14.f3170h
            int r1 = r0.size()
        L_0x0104:
            if (r2 >= r1) goto L_0x0112
            java.lang.Object r3 = r0.get(r2)
            bbl r3 = (p000.bbl) r3
            r3.mo1719c()
            int r2 = r2 + 1
            goto L_0x0104
        L_0x0112:
            return
        L_0x0113:
            r1 = 0
        L_0x0114:
            axw[] r3 = r14.f3171i
            int r6 = r3.length
            if (r1 >= r6) goto L_0x015e
            r3 = r3[r1]
            akh r3 = r3.mo1594g()
            aye r6 = r14.f3179q
            ayc r6 = r6.mo1612a(r0)
            akh r6 = r6.mo1604a(r2)
            java.lang.String r7 = r3.f556i
            java.lang.String r8 = r6.f556i
            int r9 = p000.bkt.m3521g(r7)
            if (r9 == r4) goto L_0x013a
            int r3 = p000.bkt.m3521g(r8)
            if (r9 == r3) goto L_0x0156
            goto L_0x015b
        L_0x013a:
            boolean r8 = p000.blm.m3652a(r7, r8)
            if (r8 == 0) goto L_0x015b
            java.lang.String r8 = "application/cea-608"
            boolean r8 = r8.equals(r7)
            if (r8 != 0) goto L_0x0150
            java.lang.String r8 = "application/cea-708"
            boolean r7 = r8.equals(r7)
            if (r7 == 0) goto L_0x0156
        L_0x0150:
            int r3 = r3.f545B
            int r6 = r6.f545B
            if (r3 != r6) goto L_0x015b
        L_0x0156:
            int[] r3 = r14.f3181s
            r3[r0] = r1
            goto L_0x015e
        L_0x015b:
            int r1 = r1 + 1
            goto L_0x0114
        L_0x015e:
            int r0 = r0 + 1
            goto L_0x00fc
        L_0x0161:
            r4 = r0[r3]
            akh r4 = r4.mo1594g()
            if (r4 == 0) goto L_0x016d
            int r3 = r3 + 1
            goto L_0x0011
        L_0x016d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bbs.mo1732j():void");
    }

    /* renamed from: h */
    public final void mo1730h() {
        this.f3166d.mo1649a();
        bbe bbe = this.f3165c;
        IOException iOException = bbe.f3063l;
        if (iOException == null) {
            Uri uri = bbe.f3064m;
            if (uri != null && bbe.f3068q) {
                bbe.f3057f.mo1759b(uri);
                return;
            }
            return;
        }
        throw iOException;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1549a(bit bit, long j, long j2, boolean z) {
        ayl ayl = (ayl) bit;
        this.f3167e.mo1521a(ayl.f2772j, ayl.f2773k);
        if (!z) {
            mo1731i();
            if (this.f3175m > 0) {
                this.f3164b.mo414a(this);
            }
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1548a(bit bit, long j, long j2) {
        ayl ayl = (ayl) bit;
        bbe bbe = this.f3165c;
        if (ayl instanceof bbb) {
            bbb bbb = (bbb) ayl;
            bbe.f3062k = bbb.f2826a;
            bbe.f3060i.mo1706a(bbb.f2767e.f3998a, (byte[]) bks.m3507a(bbb.f3047b));
        }
        this.f3167e.mo1529b(ayl.f2772j, ayl.f2773k);
        if (!this.f3174l) {
            mo1487c(this.f3184v);
        } else {
            this.f3164b.mo414a(this);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ p000.bir mo1546a(p000.bit r15, long r16, long r18, java.io.IOException r20, int r21) {
        /*
            r14 = this;
            r0 = r14
            r6 = r20
            r1 = r15
            ayl r1 = (p000.ayl) r1
            long r2 = r1.mo1624c()
            boolean r4 = r1 instanceof p000.bbi
            bip r5 = r0.f3145D
            long r7 = r5.mo1974a(r6)
            r9 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r5 = 0
            int r11 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r11 == 0) goto L_0x0032
            bbe r11 = r0.f3165c
            bgl r12 = r11.f3066o
            ayc r11 = r11.f3058g
            akh r13 = r1.f2769g
            int r11 = r11.mo1603a(r13)
            int r11 = r12.mo1832c(r11)
            boolean r7 = r12.mo1829a(r11, r7)
            r8 = r7
            goto L_0x0034
        L_0x0032:
            r8 = 0
        L_0x0034:
            r7 = 1
            if (r8 != 0) goto L_0x004d
            bip r2 = r0.f3145D
            r3 = r21
            long r2 = r2.mo1975a(r6, r3)
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x0047
            bir r2 = p000.bix.f4093b
            r9 = r2
            goto L_0x007c
        L_0x0047:
            bir r2 = p000.bix.m3360a(r5, r2)
            goto L_0x007b
        L_0x004d:
            if (r4 != 0) goto L_0x0050
        L_0x004f:
            goto L_0x0079
        L_0x0050:
            r9 = 0
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 != 0) goto L_0x004f
            java.util.ArrayList r2 = r0.f3168f
            int r3 = r2.size()
            int r3 = r3 + -1
            java.lang.Object r2 = r2.remove(r3)
            bbi r2 = (p000.bbi) r2
            if (r2 != r1) goto L_0x0068
            r5 = 1
            goto L_0x006a
        L_0x0068:
        L_0x006a:
            p000.bks.m3512b(r5)
            java.util.ArrayList r2 = r0.f3168f
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0079
            long r2 = r0.f3184v
            r0.f3159R = r2
        L_0x0079:
            bir r2 = p000.bix.f4092a
        L_0x007b:
            r9 = r2
        L_0x007c:
            axg r2 = r0.f3167e
            long r3 = r1.f2772j
            long r10 = r1.f2773k
            boolean r1 = r9.mo1978a()
            r7 = r7 ^ r1
            r1 = r2
            r2 = r3
            r4 = r10
            r6 = r20
            r1.mo1522a(r2, r4, r6, r7)
            if (r8 == 0) goto L_0x00a0
            boolean r1 = r0.f3174l
            if (r1 != 0) goto L_0x009b
            long r1 = r0.f3184v
            r14.mo1487c(r1)
            goto L_0x00a0
        L_0x009b:
            bbp r1 = r0.f3164b
            r1.mo414a(r14)
        L_0x00a0:
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bbs.mo1546a(bit, long, long, java.io.IOException, int):bir");
    }

    /* renamed from: g */
    public final void mo1551g() {
        for (axw k : this.f3171i) {
            k.mo1598k();
        }
    }

    /* renamed from: k */
    public final void mo1555k() {
        this.f3169g.post(this.f3149H);
    }

    /* renamed from: i */
    public final void mo1731i() {
        for (axw a : this.f3171i) {
            a.mo1584a(this.f3185w);
        }
        this.f3185w = false;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: axw.a(long, boolean):int
     arg types: [long, int]
     candidates:
      axw.a(bky, int):void
      aov.a(bky, int):void
      axw.a(long, boolean):int */
    /* renamed from: a */
    public final boolean mo1726a(long j, boolean z) {
        this.f3184v = j;
        if (!mo1734m()) {
            if (this.f3173k && !z) {
                int length = this.f3171i.length;
                int i = 0;
                while (i < length) {
                    axw axw = this.f3171i[i];
                    axw.mo1596i();
                    if (axw.mo1579a(j, false) != -1 || (!this.f3158Q[i] && this.f3157P)) {
                        i++;
                    }
                }
                return false;
            }
            this.f3159R = j;
            this.f3187y = false;
            this.f3168f.clear();
            if (this.f3166d.mo1989d()) {
                this.f3166d.mo1990e();
            } else {
                this.f3166d.mo1988c();
                mo1731i();
            }
            return true;
        }
        this.f3159R = j;
        return true;
    }

    /* renamed from: n */
    public final void mo1735n() {
        this.f3174l = true;
    }

    /* renamed from: a */
    public final void mo1725a(boolean z) {
        this.f3165c.f3061j = z;
    }

    /* renamed from: b */
    public final void mo1728b(long j) {
        this.f3161T = j;
        for (axw b : this.f3171i) {
            b.mo1587b(j);
        }
    }

    /* JADX WARN: Failed to insert an additional move for type inference into block B:18:0x0052 */
    /* JADX INFO: additional move instructions added (1) to help type inference */
    /* renamed from: a */
    public final aov mo1211a(int i, int i2) {
        Set set = f3141z;
        Integer valueOf = Integer.valueOf(i2);
        axw axw = null;
        if (!set.contains(valueOf)) {
            int i3 = 0;
            while (true) {
                axw[] axwArr = this.f3171i;
                if (i3 < axwArr.length) {
                    if (this.f3152K[i3] == i) {
                        axw = axwArr[i3];
                        break;
                    }
                    i3++;
                } else {
                    break;
                }
            }
        } else {
            bks.m3510a(f3141z.contains(valueOf));
            int i4 = this.f3154M.get(i2, -1);
            if (i4 != -1) {
                if (this.f3153L.add(valueOf)) {
                    this.f3152K[i4] = i;
                }
                axw = this.f3152K[i4] == i ? this.f3171i[i4] : m2745b(i, i2);
            }
        }
        if (axw == null) {
            if (this.f3160S) {
                return m2745b(i, i2);
            }
            int length = this.f3171i.length;
            bbr bbr = new bbr(this.f3142A, this.f3144C, this.f3151J);
            bbr.mo1587b(this.f3161T);
            bbr.mo1582a(this.f3162U);
            bbr.f2721c = this;
            int i5 = length + 1;
            int[] copyOf = Arrays.copyOf(this.f3152K, i5);
            this.f3152K = copyOf;
            copyOf[length] = i;
            this.f3171i = (axw[]) blm.m3668b(this.f3171i, bbr);
            boolean[] copyOf2 = Arrays.copyOf(this.f3158Q, i5);
            this.f3158Q = copyOf2;
            boolean z = true;
            if (!(i2 == 1 || i2 == 2)) {
                z = false;
            }
            copyOf2[length] = z;
            this.f3157P |= z;
            this.f3153L.add(Integer.valueOf(i2));
            this.f3154M.append(i2, length);
            if (m2743a(i2) > m2743a(this.f3156O)) {
                this.f3172j = length;
                this.f3156O = i2;
            }
            this.f3183u = Arrays.copyOf(this.f3183u, i5);
            axw = bbr;
        }
        if (i2 != 4) {
            return axw;
        }
        if (this.f3155N == null) {
            this.f3155N = new bbq(axw, this.f3146E);
        }
        return this.f3155N;
    }
}
