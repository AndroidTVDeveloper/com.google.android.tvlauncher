package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: bcx  reason: default package */
/* compiled from: PG */
public final class bcx extends awc implements biq {
    private final Uri c;
    private final bhu d;
    private final bct e;
    private final awl f;
    private final anu g;
    private final bip h;
    private final axg i;
    private final biz j;
    private final ArrayList k;
    private bhv l;
    private bix m;
    private biy n;
    private bjf o;
    private long p;
    private bda q = null;
    private Handler r;

    static {
        akf.a("goog.exo.smoothstreaming");
    }

    @Deprecated
    public bcx(Uri uri, bhu bhu, bct bct) {
        bdh bdh = new bdh();
        awm awm = new awm();
        anu anu = anu.a;
        bih bih = new bih(3);
        bks.b(true);
        if (uri != null) {
            String lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment == null || !blm.d(lastPathSegment).matches("manifest(\\(.+\\))?")) {
                uri = Uri.withAppendedPath(uri, "Manifest");
            }
        } else {
            uri = null;
        }
        this.c = uri;
        this.d = bhu;
        this.j = bdh;
        this.e = bct;
        this.f = awm;
        this.g = anu;
        this.h = bih;
        this.i = a((awt) null);
        this.k = new ArrayList();
    }

    public final aws a(awt awt, bhk bhk, long j2) {
        bcv bcv = new bcv(this.q, this.e, this.o, this.f, this.g, this.h, a(awt), this.n, bhk);
        this.k.add(bcv);
        return bcv;
    }

    public final void d() {
        this.n.a();
    }

    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3, boolean z) {
        this.i.a(((bja) bit).b);
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
    public final /* bridge */ /* synthetic */ void a(bit bit, long j2, long j3) {
        aya aya;
        long j4;
        long j5;
        bja bja = (bja) bit;
        this.i.b(bja.b);
        this.q = (bda) bja.c;
        this.p = j2 - j3;
        for (int i2 = 0; i2 < this.k.size(); i2++) {
            bcv bcv = (bcv) this.k.get(i2);
            bda bda = this.q;
            bcv.c = bda;
            for (ays ays : bcv.d) {
                ((bcu) ays.e).a(bda);
            }
            bcv.b.a((axz) bcv);
        }
        long j6 = Long.MIN_VALUE;
        long j7 = Long.MAX_VALUE;
        for (bcz bcz : this.q.c) {
            if (bcz.d > 0) {
                long min = Math.min(j7, bcz.a(0));
                j6 = Math.max(j6, bcz.a(bcz.d - 1) + bcz.b(bcz.d - 1));
                j7 = min;
            }
        }
        if (j7 == Long.MAX_VALUE) {
            bda bda2 = this.q;
            boolean z = bda2.a;
            aya = new aya(!z ? 0 : -9223372036854775807L, 0, 0, 0, true, z, z, bda2);
        } else {
            bda bda3 = this.q;
            if (bda3.a) {
                long j8 = bda3.e;
                if (j8 != -9223372036854775807L && j8 > 0) {
                    j7 = Math.max(j7, j6 - j8);
                }
                long j9 = j7;
                long j10 = j6 - j9;
                long b = j10 - aja.b(30000);
                if (b < 5000000) {
                    j5 = Math.min(5000000L, j10 / 2);
                } else {
                    j5 = b;
                }
                aya = new aya(-9223372036854775807L, j10, j9, j5, true, true, true, this.q);
            } else {
                long j11 = bda3.d;
                if (j11 != -9223372036854775807L) {
                    j4 = j11;
                } else {
                    j4 = j6 - j7;
                }
                aya = new aya(j7 + j4, j4, j7, 0, true, false, false, bda3);
            }
        }
        a(aya);
        if (this.q.a) {
            this.r.postDelayed(new bcw(this), Math.max(0L, (this.p + 5000) - SystemClock.elapsedRealtime()));
        }
    }

    public final /* bridge */ /* synthetic */ bir a(bit bit, long j2, long j3, IOException iOException, int i2) {
        bir bir;
        bja bja = (bja) bit;
        long a = this.h.a(iOException, i2);
        if (a != -9223372036854775807L) {
            bir = bix.a(false, a);
        } else {
            bir = bix.b;
        }
        this.i.a(bja.b, iOException, !bir.a());
        return bir;
    }

    /* access modifiers changed from: protected */
    public final void a(bjf bjf) {
        this.o = bjf;
        this.l = ((bif) this.d).a();
        bix bix = new bix("Loader:Manifest");
        this.m = bix;
        this.n = bix;
        this.r = new Handler();
        e();
    }

    public final void a(aws aws) {
        bcv bcv = (bcv) aws;
        for (ays c2 : bcv.d) {
            c2.c();
        }
        bcv.b = null;
        bcv.a.b();
        this.k.remove(aws);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.q = null;
        this.l = null;
        this.p = 0;
        bix bix = this.m;
        if (bix != null) {
            bix.f();
            this.m = null;
        }
        Handler handler = this.r;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.r = null;
        }
    }

    public final void e() {
        if (!this.m.b()) {
            bja bja = new bja(this.l, this.c, 4, this.j);
            this.m.a(bja, this, this.h.a(bja.b));
            this.i.c(bja.b);
        }
    }
}
