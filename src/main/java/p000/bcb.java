package p000;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.List;

/* renamed from: bcb */
/* compiled from: PG */
public final class bcb implements Runnable, biq {

    /* renamed from: a */
    public final bix f3208a = new bix("DefaultHlsPlaylistTracker:MediaPlaylist");

    /* renamed from: b */
    public bch f3209b;

    /* renamed from: c */
    public long f3210c;

    /* renamed from: d */
    public IOException f3211d;

    /* renamed from: e */
    private final Uri f3212e;

    /* renamed from: f */
    private final bja f3213f;

    /* renamed from: g */
    private long f3214g;

    /* renamed from: h */
    private long f3215h;

    /* renamed from: i */
    private long f3216i;

    /* renamed from: j */
    private boolean f3217j;

    /* renamed from: k */
    private final /* synthetic */ bcc f3218k;

    public bcb(bcc bcc, Uri uri) {
        this.f3218k = bcc;
        this.f3212e = uri;
        this.f3213f = new bja(bcc.f3219a.mo1703a(), uri, 4, bcc.f3223e);
    }

    /* renamed from: a */
    private final boolean m2784a(long j) {
        this.f3216i = SystemClock.elapsedRealtime() + j;
        if (this.f3212e.equals(this.f3218k.f3229k)) {
            bcc bcc = this.f3218k;
            List list = bcc.f3228j.f3244c;
            int size = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i = 0;
            while (i < size) {
                bcb bcb = (bcb) bcc.f3221c.get(((bce) list.get(i)).f3236a);
                if (elapsedRealtime > bcb.f3216i) {
                    bcc.f3229k = bcb.f3212e;
                    bcb.mo1753a();
                } else {
                    i++;
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo1753a() {
        this.f3216i = 0;
        if (!this.f3217j && !this.f3208a.mo1989d() && !this.f3208a.mo1987b()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j = this.f3215h;
            if (elapsedRealtime >= j) {
                m2785b();
                return;
            }
            this.f3217j = true;
            this.f3218k.f3226h.postDelayed(this, j - elapsedRealtime);
        }
    }

    /* renamed from: b */
    private final void m2785b() {
        bix bix = this.f3208a;
        bja bja = this.f3213f;
        bix.mo1984a(bja, this, this.f3218k.f3220b.mo1973a(bja.f4105b));
        this.f3218k.f3224f.mo1533c(this.f3213f.f4105b);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1549a(bit bit, long j, long j2, boolean z) {
        bja bja = (bja) bit;
        this.f3218k.f3224f.mo1518a(4);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1548a(bit bit, long j, long j2) {
        bci bci = (bci) ((bja) bit).f4106c;
        if (bci instanceof bch) {
            mo1754a((bch) bci);
            this.f3218k.f3224f.mo1527b(4);
            return;
        }
        this.f3211d = new ako("Loaded playlist has unexpected type.");
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bir mo1546a(bit bit, long j, long j2, IOException iOException, int i) {
        bir bir;
        bja bja = (bja) bit;
        long a = this.f3218k.f3220b.mo1974a(iOException);
        boolean z = this.f3218k.mo1758a(this.f3212e, a) || a == -9223372036854775807L;
        if (a != -9223372036854775807L) {
            z |= m2784a(a);
        }
        if (z) {
            long a2 = this.f3218k.f3220b.mo1975a(iOException, i);
            bir = a2 == -9223372036854775807L ? bix.f4093b : bix.m3360a(false, a2);
        } else {
            bir = bix.f4092a;
        }
        this.f3218k.f3224f.mo1519a(4, iOException, !bir.mo1978a());
        return bir;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x022c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo1754a(p000.bch r47) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            bch r2 = r0.f3209b
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.f3210c = r3
            bcc r5 = r0.f3218k
            r8 = 0
            if (r2 == 0) goto L_0x007c
            long r9 = r1.f3266f
            long r11 = r2.f3266f
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x007c
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0036
            java.util.List r9 = r1.f3272l
            int r9 = r9.size()
            java.util.List r10 = r2.f3272l
            int r10 = r10.size()
            if (r9 > r10) goto L_0x007c
            if (r9 != r10) goto L_0x0036
            boolean r9 = r1.f3269i
            if (r9 == 0) goto L_0x0036
            boolean r9 = r2.f3269i
            if (r9 != 0) goto L_0x0036
            goto L_0x007c
        L_0x0036:
            boolean r5 = r1.f3269i
            if (r5 == 0) goto L_0x0078
            boolean r5 = r2.f3269i
            if (r5 != 0) goto L_0x0078
            bch r5 = new bch
            r9 = r5
            int r10 = r2.f3261a
            java.lang.String r11 = r2.f3274n
            java.util.List r12 = r2.f3275o
            long r13 = r2.f3262b
            long r6 = r2.f3263c
            r15 = r6
            boolean r6 = r2.f3264d
            r17 = r6
            int r6 = r2.f3265e
            r18 = r6
            long r6 = r2.f3266f
            r19 = r6
            int r6 = r2.f3267g
            r21 = r6
            long r6 = r2.f3268h
            r22 = r6
            boolean r6 = r2.f3276p
            r24 = r6
            r25 = 1
            boolean r6 = r2.f3270j
            r26 = r6
            anq r6 = r2.f3271k
            r27 = r6
            java.util.List r6 = r2.f3272l
            r28 = r6
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r21, r22, r24, r25, r26, r27, r28)
            goto L_0x0116
        L_0x0078:
            r5 = r2
            goto L_0x0116
        L_0x007c:
            boolean r6 = r1.f3270j
            if (r6 != 0) goto L_0x00b3
            bch r6 = r5.f3230l
            if (r6 == 0) goto L_0x0087
            long r6 = r6.f3263c
            goto L_0x008a
        L_0x0087:
            r6 = 0
        L_0x008a:
            if (r2 == 0) goto L_0x00b0
            java.util.List r9 = r2.f3272l
            int r9 = r9.size()
            bcg r10 = p000.bcc.m2791a(r2, r1)
            if (r10 != 0) goto L_0x00a8
            long r9 = (long) r9
            long r11 = r1.f3266f
            long r13 = r2.f3266f
            long r11 = r11 - r13
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x00a3
            goto L_0x00b0
        L_0x00a3:
            long r6 = r2.mo1761a()
            goto L_0x00ad
        L_0x00a8:
            long r6 = r2.f3263c
            long r9 = r10.f3254e
            long r6 = r6 + r9
        L_0x00ad:
            r15 = r6
            goto L_0x00b6
        L_0x00b0:
            r15 = r6
            goto L_0x00b6
        L_0x00b3:
            long r6 = r1.f3263c
            r15 = r6
        L_0x00b6:
            boolean r6 = r1.f3264d
            if (r6 == 0) goto L_0x00bf
            int r5 = r1.f3265e
            r18 = r5
            goto L_0x00e6
        L_0x00bf:
            bch r5 = r5.f3230l
            if (r5 == 0) goto L_0x00c6
            int r5 = r5.f3265e
            goto L_0x00c8
        L_0x00c6:
            r5 = 0
        L_0x00c8:
            if (r2 == 0) goto L_0x00e4
            bcg r6 = p000.bcc.m2791a(r2, r1)
            if (r6 == 0) goto L_0x00e4
            int r5 = r2.f3265e
            int r6 = r6.f3253d
            int r5 = r5 + r6
            java.util.List r6 = r1.f3272l
            java.lang.Object r6 = r6.get(r8)
            bcg r6 = (p000.bcg) r6
            int r6 = r6.f3253d
            int r5 = r5 - r6
            r18 = r5
            goto L_0x00e6
        L_0x00e4:
            r18 = r5
        L_0x00e6:
            bch r5 = new bch
            r9 = r5
            int r10 = r1.f3261a
            java.lang.String r11 = r1.f3274n
            java.util.List r12 = r1.f3275o
            long r13 = r1.f3262b
            r17 = 1
            long r6 = r1.f3266f
            r19 = r6
            int r6 = r1.f3267g
            r21 = r6
            long r6 = r1.f3268h
            r22 = r6
            boolean r6 = r1.f3276p
            r24 = r6
            boolean r6 = r1.f3269i
            r25 = r6
            boolean r6 = r1.f3270j
            r26 = r6
            anq r6 = r1.f3271k
            r27 = r6
            java.util.List r6 = r1.f3272l
            r28 = r6
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r21, r22, r24, r25, r26, r27, r28)
        L_0x0116:
            r0.f3209b = r5
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r2) goto L_0x022c
            r1 = 0
            r0.f3211d = r1
            r0.f3214g = r3
            bcc r1 = r0.f3218k
            android.net.Uri r9 = r0.f3212e
            android.net.Uri r10 = r1.f3229k
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0133
            r9 = 0
            goto L_0x0216
        L_0x0133:
            bch r9 = r1.f3230l
            r10 = 1
            if (r9 != 0) goto L_0x0141
            boolean r9 = r5.f3269i
            r9 = r9 ^ r10
            r1.f3231m = r9
            long r11 = r5.f3263c
            r1.f3232n = r11
        L_0x0141:
            r1.f3230l = r5
            bcp r9 = r1.f3227i
            boolean r11 = r5.f3270j
            if (r11 == 0) goto L_0x0152
            long r11 = r5.f3263c
            long r11 = p000.aja.m632a(r11)
            r32 = r11
            goto L_0x0155
        L_0x0152:
            r32 = r6
        L_0x0155:
            int r11 = r5.f3261a
            r12 = 2
            if (r11 != r12) goto L_0x015b
        L_0x015a:
            goto L_0x0161
        L_0x015b:
            if (r11 == r10) goto L_0x015a
            r30 = r6
            goto L_0x0163
        L_0x0161:
            r30 = r32
        L_0x0163:
            long r11 = r5.f3262b
            cbd r45 = new cbd
            r13 = r9
            bbk r13 = (p000.bbk) r13
            bcq r14 = r13.f3119c
            bcc r14 = (p000.bcc) r14
            bcf r14 = r14.f3228j
            java.lang.Object r14 = p000.bks.m3507a(r14)
            bcf r14 = (p000.bcf) r14
            r45.<init>()
            bcq r13 = r13.f3119c
            bcc r13 = (p000.bcc) r13
            boolean r14 = r13.f3231m
            if (r14 == 0) goto L_0x01ed
            long r14 = r5.f3263c
            r17 = r9
            long r8 = r13.f3232n
            long r38 = r14 - r8
            boolean r8 = r5.f3269i
            if (r8 == 0) goto L_0x0195
            long r8 = r5.f3273m
            long r8 = r38 + r8
            r34 = r8
            goto L_0x0198
        L_0x0195:
            r34 = r6
        L_0x0198:
            java.util.List r8 = r5.f3272l
            int r9 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x01d6
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L_0x01d2
            int r6 = r8.size()
            int r6 = r6 + -3
            r9 = 0
            int r6 = java.lang.Math.max(r9, r6)
            long r11 = r5.f3273m
            long r13 = r5.f3268h
            long r13 = r13 + r13
            long r11 = r11 - r13
        L_0x01b5:
            if (r6 > 0) goto L_0x01b8
            goto L_0x01c7
        L_0x01b8:
            java.lang.Object r7 = r8.get(r6)
            bcg r7 = (p000.bcg) r7
            long r13 = r7.f3254e
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x01c7
            int r6 = r6 + -1
            goto L_0x01b5
        L_0x01c7:
            java.lang.Object r6 = r8.get(r6)
            bcg r6 = (p000.bcg) r6
            long r6 = r6.f3254e
            r40 = r6
            goto L_0x01d9
        L_0x01d2:
            r9 = 0
            r40 = 0
            goto L_0x01d9
        L_0x01d6:
            r9 = 0
            r40 = r11
        L_0x01d9:
            aya r6 = new aya
            r29 = r6
            long r7 = r5.f3273m
            r36 = r7
            r42 = 1
            boolean r5 = r5.f3269i
            r43 = r5 ^ 1
            r44 = 1
            r29.<init>(r30, r32, r34, r36, r38, r40, r42, r43, r44, r45)
            goto L_0x020f
        L_0x01ed:
            r17 = r9
            r9 = 0
            int r8 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x01f7
            r40 = r11
            goto L_0x01fa
        L_0x01f7:
            r40 = 0
        L_0x01fa:
            aya r6 = new aya
            r29 = r6
            long r7 = r5.f3273m
            r34 = r7
            r36 = r7
            r38 = 0
            r42 = 1
            r43 = 0
            r44 = 0
            r29.<init>(r30, r32, r34, r36, r38, r40, r42, r43, r44, r45)
        L_0x020f:
            r5 = r17
            awc r5 = (p000.awc) r5
            r5.mo1466a(r6)
        L_0x0216:
            java.util.List r5 = r1.f3222d
            int r5 = r5.size()
        L_0x021c:
            if (r9 >= r5) goto L_0x0287
            java.util.List r6 = r1.f3222d
            java.lang.Object r6 = r6.get(r9)
            bcm r6 = (p000.bcm) r6
            r6.mo1718h()
            int r9 = r9 + 1
            goto L_0x021c
        L_0x022c:
            boolean r5 = r5.f3269i
            if (r5 != 0) goto L_0x0287
            long r8 = r1.f3266f
            java.util.List r1 = r1.f3272l
            int r1 = r1.size()
            bch r5 = r0.f3209b
            long r10 = (long) r1
            long r8 = r8 + r10
            long r10 = r5.f3266f
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x0251
            bcn r1 = new bcn
            r1.<init>()
            r0.f3211d = r1
            bcc r1 = r0.f3218k
            android.net.Uri r5 = r0.f3212e
            r1.mo1758a(r5, r6)
            goto L_0x0287
        L_0x0251:
            long r8 = r0.f3214g
            long r8 = r3 - r8
            double r8 = (double) r8
            long r10 = r5.f3268h
            long r10 = p000.aja.m632a(r10)
            double r10 = (double) r10
            r12 = 4615063718147915776(0x400c000000000000, double:3.5)
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r12
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0287
            bco r1 = new bco
            r1.<init>()
            r0.f3211d = r1
            bcc r1 = r0.f3218k
            bip r1 = r1.f3220b
            java.io.IOException r5 = r0.f3211d
            long r8 = r1.mo1974a(r5)
            bcc r1 = r0.f3218k
            android.net.Uri r5 = r0.f3212e
            r1.mo1758a(r5, r8)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0287
            r0.m2784a(r8)
        L_0x0287:
            bch r1 = r0.f3209b
            if (r1 != r2) goto L_0x0291
            long r1 = r1.f3268h
            r5 = 2
            long r1 = r1 / r5
            goto L_0x0295
        L_0x0291:
            long r1 = r1.f3268h
        L_0x0295:
            long r1 = p000.aja.m632a(r1)
            long r3 = r3 + r1
            r0.f3215h = r3
            android.net.Uri r1 = r0.f3212e
            bcc r2 = r0.f3218k
            android.net.Uri r2 = r2.f3229k
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02b1
            bch r1 = r0.f3209b
            boolean r1 = r1.f3269i
            if (r1 != 0) goto L_0x02b1
            r46.mo1753a()
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.bcb.mo1754a(bch):void");
    }

    public final void run() {
        this.f3217j = false;
        m2785b();
    }
}
