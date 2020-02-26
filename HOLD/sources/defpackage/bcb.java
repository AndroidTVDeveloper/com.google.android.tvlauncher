package defpackage;

import android.net.Uri;
import android.os.SystemClock;
import java.io.IOException;
import java.util.List;

/* renamed from: bcb  reason: default package */
/* compiled from: PG */
public final class bcb implements Runnable, biq {
    public final bix a = new bix("DefaultHlsPlaylistTracker:MediaPlaylist");
    public bch b;
    public long c;
    public IOException d;
    private final Uri e;
    private final bja f;
    private long g;
    private long h;
    private long i;
    private boolean j;
    private final /* synthetic */ bcc k;

    public bcb(bcc bcc, Uri uri) {
        this.k = bcc;
        this.e = uri;
        this.f = new bja(bcc.a.a(), uri, 4, bcc.e);
    }

    private final boolean a(long j2) {
        this.i = SystemClock.elapsedRealtime() + j2;
        if (this.e.equals(this.k.k)) {
            bcc bcc = this.k;
            List list = bcc.j.c;
            int size = list.size();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            int i2 = 0;
            while (i2 < size) {
                bcb bcb = (bcb) bcc.c.get(((bce) list.get(i2)).a);
                if (elapsedRealtime > bcb.i) {
                    bcc.k = bcb.e;
                    bcb.a();
                } else {
                    i2++;
                }
            }
            return true;
        }
        return false;
    }

    public final void a() {
        this.i = 0;
        if (!this.j && !this.a.d() && !this.a.b()) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long j2 = this.h;
            if (elapsedRealtime >= j2) {
                b();
                return;
            }
            this.j = true;
            this.k.h.postDelayed(this, j2 - elapsedRealtime);
        }
    }

    private final void b() {
        bix bix = this.a;
        bja bja = this.f;
        bix.a(bja, this, this.k.b.a(bja.b));
        this.k.f.c(this.f.b);
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3, boolean z) {
        bja bja = (bja) bit;
        this.k.f.a(4);
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3) {
        bci bci = (bci) ((bja) bit).c;
        if (bci instanceof bch) {
            a((bch) bci);
            this.k.f.b(4);
            return;
        }
        this.d = new ako("Loaded playlist has unexpected type.");
    }

    public final /* bridge */ /* synthetic */ bir a(bit bit, long j2, long j3, IOException iOException, int i2) {
        bir bir;
        bja bja = (bja) bit;
        long a2 = this.k.b.a(iOException);
        boolean z = this.k.a(this.e, a2) || a2 == -9223372036854775807L;
        if (a2 != -9223372036854775807L) {
            z |= a(a2);
        }
        if (z) {
            long a3 = this.k.b.a(iOException, i2);
            bir = a3 == -9223372036854775807L ? bix.b : bix.a(false, a3);
        } else {
            bir = bix.a;
        }
        this.k.f.a(4, iOException, !bir.a());
        return bir;
    }

    /* JADX WARNING: Removed duplicated region for block: B:105:0x028b  */
    /* JADX WARNING: Removed duplicated region for block: B:106:0x0291  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011f  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x022c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(defpackage.bch r47) {
        /*
            r46 = this;
            r0 = r46
            r1 = r47
            bch r2 = r0.b
            long r3 = android.os.SystemClock.elapsedRealtime()
            r0.c = r3
            bcc r5 = r0.k
            r8 = 0
            if (r2 == 0) goto L_0x007c
            long r9 = r1.f
            long r11 = r2.f
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 > 0) goto L_0x007c
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 < 0) goto L_0x0036
            java.util.List r9 = r1.l
            int r9 = r9.size()
            java.util.List r10 = r2.l
            int r10 = r10.size()
            if (r9 > r10) goto L_0x007c
            if (r9 != r10) goto L_0x0036
            boolean r9 = r1.i
            if (r9 == 0) goto L_0x0036
            boolean r9 = r2.i
            if (r9 != 0) goto L_0x0036
            goto L_0x007c
        L_0x0036:
            boolean r5 = r1.i
            if (r5 == 0) goto L_0x0078
            boolean r5 = r2.i
            if (r5 != 0) goto L_0x0078
            bch r5 = new bch
            r9 = r5
            int r10 = r2.a
            java.lang.String r11 = r2.n
            java.util.List r12 = r2.o
            long r13 = r2.b
            long r6 = r2.c
            r15 = r6
            boolean r6 = r2.d
            r17 = r6
            int r6 = r2.e
            r18 = r6
            long r6 = r2.f
            r19 = r6
            int r6 = r2.g
            r21 = r6
            long r6 = r2.h
            r22 = r6
            boolean r6 = r2.p
            r24 = r6
            r25 = 1
            boolean r6 = r2.j
            r26 = r6
            anq r6 = r2.k
            r27 = r6
            java.util.List r6 = r2.l
            r28 = r6
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r21, r22, r24, r25, r26, r27, r28)
            goto L_0x0116
        L_0x0078:
            r5 = r2
            goto L_0x0116
        L_0x007c:
            boolean r6 = r1.j
            if (r6 != 0) goto L_0x00b3
            bch r6 = r5.l
            if (r6 == 0) goto L_0x0087
            long r6 = r6.c
            goto L_0x008a
        L_0x0087:
            r6 = 0
        L_0x008a:
            if (r2 == 0) goto L_0x00b0
            java.util.List r9 = r2.l
            int r9 = r9.size()
            bcg r10 = defpackage.bcc.a(r2, r1)
            if (r10 != 0) goto L_0x00a8
            long r9 = (long) r9
            long r11 = r1.f
            long r13 = r2.f
            long r11 = r11 - r13
            int r13 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r13 == 0) goto L_0x00a3
            goto L_0x00b0
        L_0x00a3:
            long r6 = r2.a()
            goto L_0x00ad
        L_0x00a8:
            long r6 = r2.c
            long r9 = r10.e
            long r6 = r6 + r9
        L_0x00ad:
            r15 = r6
            goto L_0x00b6
        L_0x00b0:
            r15 = r6
            goto L_0x00b6
        L_0x00b3:
            long r6 = r1.c
            r15 = r6
        L_0x00b6:
            boolean r6 = r1.d
            if (r6 == 0) goto L_0x00bf
            int r5 = r1.e
            r18 = r5
            goto L_0x00e6
        L_0x00bf:
            bch r5 = r5.l
            if (r5 == 0) goto L_0x00c6
            int r5 = r5.e
            goto L_0x00c8
        L_0x00c6:
            r5 = 0
        L_0x00c8:
            if (r2 == 0) goto L_0x00e4
            bcg r6 = defpackage.bcc.a(r2, r1)
            if (r6 == 0) goto L_0x00e4
            int r5 = r2.e
            int r6 = r6.d
            int r5 = r5 + r6
            java.util.List r6 = r1.l
            java.lang.Object r6 = r6.get(r8)
            bcg r6 = (defpackage.bcg) r6
            int r6 = r6.d
            int r5 = r5 - r6
            r18 = r5
            goto L_0x00e6
        L_0x00e4:
            r18 = r5
        L_0x00e6:
            bch r5 = new bch
            r9 = r5
            int r10 = r1.a
            java.lang.String r11 = r1.n
            java.util.List r12 = r1.o
            long r13 = r1.b
            r17 = 1
            long r6 = r1.f
            r19 = r6
            int r6 = r1.g
            r21 = r6
            long r6 = r1.h
            r22 = r6
            boolean r6 = r1.p
            r24 = r6
            boolean r6 = r1.i
            r25 = r6
            boolean r6 = r1.j
            r26 = r6
            anq r6 = r1.k
            r27 = r6
            java.util.List r6 = r1.l
            r28 = r6
            r9.<init>(r10, r11, r12, r13, r15, r17, r18, r19, r21, r22, r24, r25, r26, r27, r28)
        L_0x0116:
            r0.b = r5
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 == r2) goto L_0x022c
            r1 = 0
            r0.d = r1
            r0.g = r3
            bcc r1 = r0.k
            android.net.Uri r9 = r0.e
            android.net.Uri r10 = r1.k
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x0133
            r9 = 0
            goto L_0x0216
        L_0x0133:
            bch r9 = r1.l
            r10 = 1
            if (r9 != 0) goto L_0x0141
            boolean r9 = r5.i
            r9 = r9 ^ r10
            r1.m = r9
            long r11 = r5.c
            r1.n = r11
        L_0x0141:
            r1.l = r5
            bcp r9 = r1.i
            boolean r11 = r5.j
            if (r11 == 0) goto L_0x0152
            long r11 = r5.c
            long r11 = defpackage.aja.a(r11)
            r32 = r11
            goto L_0x0155
        L_0x0152:
            r32 = r6
        L_0x0155:
            int r11 = r5.a
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
            long r11 = r5.b
            cbd r45 = new cbd
            r13 = r9
            bbk r13 = (defpackage.bbk) r13
            bcq r14 = r13.c
            bcc r14 = (defpackage.bcc) r14
            bcf r14 = r14.j
            java.lang.Object r14 = defpackage.bks.a(r14)
            bcf r14 = (defpackage.bcf) r14
            r45.<init>()
            bcq r13 = r13.c
            bcc r13 = (defpackage.bcc) r13
            boolean r14 = r13.m
            if (r14 == 0) goto L_0x01ed
            long r14 = r5.c
            r17 = r9
            long r8 = r13.n
            long r38 = r14 - r8
            boolean r8 = r5.i
            if (r8 == 0) goto L_0x0195
            long r8 = r5.m
            long r8 = r38 + r8
            r34 = r8
            goto L_0x0198
        L_0x0195:
            r34 = r6
        L_0x0198:
            java.util.List r8 = r5.l
            int r9 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
            if (r9 != 0) goto L_0x01d6
            boolean r6 = r8.isEmpty()
            if (r6 != 0) goto L_0x01d2
            int r6 = r8.size()
            int r6 = r6 + -3
            r9 = 0
            int r6 = java.lang.Math.max(r9, r6)
            long r11 = r5.m
            long r13 = r5.h
            long r13 = r13 + r13
            long r11 = r11 - r13
        L_0x01b5:
            if (r6 > 0) goto L_0x01b8
            goto L_0x01c7
        L_0x01b8:
            java.lang.Object r7 = r8.get(r6)
            bcg r7 = (defpackage.bcg) r7
            long r13 = r7.e
            int r7 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r7 <= 0) goto L_0x01c7
            int r6 = r6 + -1
            goto L_0x01b5
        L_0x01c7:
            java.lang.Object r6 = r8.get(r6)
            bcg r6 = (defpackage.bcg) r6
            long r6 = r6.e
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
            long r7 = r5.m
            r36 = r7
            r42 = 1
            boolean r5 = r5.i
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
            long r7 = r5.m
            r34 = r7
            r36 = r7
            r38 = 0
            r42 = 1
            r43 = 0
            r44 = 0
            r29.<init>(r30, r32, r34, r36, r38, r40, r42, r43, r44, r45)
        L_0x020f:
            r5 = r17
            awc r5 = (defpackage.awc) r5
            r5.a(r6)
        L_0x0216:
            java.util.List r5 = r1.d
            int r5 = r5.size()
        L_0x021c:
            if (r9 >= r5) goto L_0x0287
            java.util.List r6 = r1.d
            java.lang.Object r6 = r6.get(r9)
            bcm r6 = (defpackage.bcm) r6
            r6.h()
            int r9 = r9 + 1
            goto L_0x021c
        L_0x022c:
            boolean r5 = r5.i
            if (r5 != 0) goto L_0x0287
            long r8 = r1.f
            java.util.List r1 = r1.l
            int r1 = r1.size()
            bch r5 = r0.b
            long r10 = (long) r1
            long r8 = r8 + r10
            long r10 = r5.f
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 >= 0) goto L_0x0251
            bcn r1 = new bcn
            r1.<init>()
            r0.d = r1
            bcc r1 = r0.k
            android.net.Uri r5 = r0.e
            r1.a(r5, r6)
            goto L_0x0287
        L_0x0251:
            long r8 = r0.g
            long r8 = r3 - r8
            double r8 = (double) r8
            long r10 = r5.h
            long r10 = defpackage.aja.a(r10)
            double r10 = (double) r10
            r12 = 4615063718147915776(0x400c000000000000, double:3.5)
            java.lang.Double.isNaN(r10)
            double r10 = r10 * r12
            int r1 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r1 <= 0) goto L_0x0287
            bco r1 = new bco
            r1.<init>()
            r0.d = r1
            bcc r1 = r0.k
            bip r1 = r1.b
            java.io.IOException r5 = r0.d
            long r8 = r1.a(r5)
            bcc r1 = r0.k
            android.net.Uri r5 = r0.e
            r1.a(r5, r8)
            int r1 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x0287
            r0.a(r8)
        L_0x0287:
            bch r1 = r0.b
            if (r1 != r2) goto L_0x0291
            long r1 = r1.h
            r5 = 2
            long r1 = r1 / r5
            goto L_0x0295
        L_0x0291:
            long r1 = r1.h
        L_0x0295:
            long r1 = defpackage.aja.a(r1)
            long r3 = r3 + r1
            r0.h = r3
            android.net.Uri r1 = r0.e
            bcc r2 = r0.k
            android.net.Uri r2 = r2.k
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x02b1
            bch r1 = r0.b
            boolean r1 = r1.i
            if (r1 != 0) goto L_0x02b1
            r46.a()
        L_0x02b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bcb.a(bch):void");
    }

    public final void run() {
        this.j = false;
        b();
    }
}
