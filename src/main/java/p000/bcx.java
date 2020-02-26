package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: bcx */
/* compiled from: PG */
public final class bcx extends awc implements biq {

    /* renamed from: c */
    private final Uri f3341c;

    /* renamed from: d */
    private final bhu f3342d;

    /* renamed from: e */
    private final bct f3343e;

    /* renamed from: f */
    private final awl f3344f;

    /* renamed from: g */
    private final anu f3345g;

    /* renamed from: h */
    private final bip f3346h;

    /* renamed from: i */
    private final axg f3347i;

    /* renamed from: j */
    private final biz f3348j;

    /* renamed from: k */
    private final ArrayList f3349k;

    /* renamed from: l */
    private bhv f3350l;

    /* renamed from: m */
    private bix f3351m;

    /* renamed from: n */
    private biy f3352n;

    /* renamed from: o */
    private bjf f3353o;

    /* renamed from: p */
    private long f3354p;

    /* renamed from: q */
    private bda f3355q = null;

    /* renamed from: r */
    private Handler f3356r;

    static {
        akf.m726a("goog.exo.smoothstreaming");
    }

    @Deprecated
    public bcx(Uri uri, bhu bhu, bct bct) {
        bdh bdh = new bdh();
        awm awm = new awm();
        anu anu = anu.f1453a;
        bih bih = new bih(3);
        bks.m3512b(true);
        if (uri != null) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null || !blm.m3675d(lastPathSegment).matches("manifest(\\(.+\\))?")) {
                uri = Uri.withAppendedPath(uri, "Manifest");
            }
        } else {
            uri = null;
        }
        this.f3341c = uri;
        this.f3342d = bhu;
        this.f3348j = bdh;
        this.f3343e = bct;
        this.f3344f = awm;
        this.f3345g = anu;
        this.f3346h = bih;
        this.f3347i = mo1464a((awt) null);
        this.f3349k = new ArrayList();
    }

    /* renamed from: a */
    public final aws mo1496a(awt awt, bhk bhk, long j) {
        bcv bcv = new bcv(this.f3355q, this.f3343e, this.f3353o, this.f3344f, this.f3345g, this.f3346h, mo1464a(awt), this.f3352n, bhk);
        this.f3349k.add(bcv);
        return bcv;
    }

    /* renamed from: d */
    public final void mo1494d() {
        this.f3352n.mo1649a();
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1549a(bit bit, long j, long j2, boolean z) {
        this.f3347i.mo1518a(((bja) bit).f4105b);
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.min(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.min(double, double):double}
      ClspMth{java.lang.Math.min(float, float):float}
      ClspMth{java.lang.Math.min(int, int):int}
      ClspMth{java.lang.Math.min(long, long):long} */
    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: ClspMth{java.lang.Math.max(long, long):long}
     arg types: [int, long]
     candidates:
      ClspMth{java.lang.Math.max(double, double):double}
      ClspMth{java.lang.Math.max(int, int):int}
      ClspMth{java.lang.Math.max(float, float):float}
      ClspMth{java.lang.Math.max(long, long):long} */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1548a(bit bit, long j, long j2) {
        aya aya;
        long j3;
        long j4;
        bja bja = (bja) bit;
        this.f3347i.mo1527b(bja.f4105b);
        this.f3355q = (bda) bja.f4106c;
        this.f3354p = j - j2;
        for (int i = 0; i < this.f3349k.size(); i++) {
            bcv bcv = (bcv) this.f3349k.get(i);
            bda bda = this.f3355q;
            bcv.f3328c = bda;
            for (ays ays : bcv.f3329d) {
                ((bcu) ays.f2801e).mo1764a(bda);
            }
            bcv.f3327b.mo414a((axz) bcv);
        }
        long j5 = Long.MIN_VALUE;
        long j6 = Long.MAX_VALUE;
        for (bcz bcz : this.f3355q.f3372c) {
            if (bcz.f3363d > 0) {
                long min = Math.min(j6, bcz.mo1769a(0));
                j5 = Math.max(j5, bcz.mo1769a(bcz.f3363d - 1) + bcz.mo1770b(bcz.f3363d - 1));
                j6 = min;
            }
        }
        if (j6 == Long.MAX_VALUE) {
            bda bda2 = this.f3355q;
            boolean z = bda2.f3370a;
            aya = new aya(!z ? 0 : -9223372036854775807L, 0, 0, 0, true, z, z, bda2);
        } else {
            bda bda3 = this.f3355q;
            if (bda3.f3370a) {
                long j7 = bda3.f3374e;
                if (j7 != -9223372036854775807L && j7 > 0) {
                    j6 = Math.max(j6, j5 - j7);
                }
                long j8 = j6;
                long j9 = j5 - j8;
                long b = j9 - aja.m633b(30000);
                if (b < 5000000) {
                    j4 = Math.min(5000000L, j9 / 2);
                } else {
                    j4 = b;
                }
                aya = new aya(-9223372036854775807L, j9, j8, j4, true, true, true, this.f3355q);
            } else {
                long j10 = bda3.f3373d;
                if (j10 != -9223372036854775807L) {
                    j3 = j10;
                } else {
                    j3 = j5 - j6;
                }
                aya = new aya(j6 + j3, j3, j6, 0, true, false, false, bda3);
            }
        }
        mo1466a(aya);
        if (this.f3355q.f3370a) {
            this.f3356r.postDelayed(new bcw(this), Math.max(0L, (this.f3354p + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ bir mo1546a(bit bit, long j, long j2, IOException iOException, int i) {
        bir bir;
        bja bja = (bja) bit;
        long a = this.f3346h.mo1975a(iOException, i);
        if (a != -9223372036854775807L) {
            bir = bix.m3360a(false, a);
        } else {
            bir = bix.f4093b;
        }
        this.f3347i.mo1519a(bja.f4105b, iOException, !bir.mo1978a());
        return bir;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1471a(bjf bjf) {
        this.f3353o = bjf;
        this.f3350l = ((bif) this.f3342d).mo1949a();
        bix bix = new bix("Loader:Manifest");
        this.f3351m = bix;
        this.f3352n = bix;
        this.f3356r = new Handler();
        mo1767e();
    }

    /* renamed from: a */
    public final void mo1497a(aws aws) {
        bcv bcv = (bcv) aws;
        for (ays c : bcv.f3329d) {
            c.mo1632c();
        }
        bcv.f3327b = null;
        bcv.f3326a.mo1526b();
        this.f3349k.remove(aws);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo1474c() {
        this.f3355q = null;
        this.f3350l = null;
        this.f3354p = 0;
        bix bix = this.f3351m;
        if (bix != null) {
            bix.mo1991f();
            this.f3351m = null;
        }
        Handler handler = this.f3356r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f3356r = null;
        }
    }

    /* renamed from: e */
    public final void mo1767e() {
        if (!this.f3351m.mo1987b()) {
            bja bja = new bja(this.f3350l, this.f3341c, 4, this.f3348j);
            this.f3351m.mo1984a(bja, this, this.f3346h.mo1973a(bja.f4105b));
            this.f3347i.mo1533c(bja.f4105b);
        }
    }
}
