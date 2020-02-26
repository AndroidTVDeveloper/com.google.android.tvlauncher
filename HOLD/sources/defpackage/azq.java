package defpackage;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: azq  reason: default package */
/* compiled from: PG */
public final class azq extends awc {
    private final azy A;
    private final biy B;
    private bhv C;
    private bjf D;
    private final Uri E;
    private long F;
    public final bip c;
    public final axg d;
    public final Object e;
    public final Runnable f;
    public bix g;
    public IOException h;
    public Handler i;
    public Uri j;
    public bac k = null;
    public boolean l;
    public long m;
    public long n;
    public int o;
    public long p;
    public int q;
    private final bhu r;
    private final azb s;
    private final awl t;
    private final anu u;
    private final long v;
    private final biz w;
    private final azl x;
    private final SparseArray y;
    private final Runnable z;

    static {
        akf.a("goog.exo.dash");
    }

    @Deprecated
    public azq(Uri uri, bhu bhu, azb azb) {
        bae bae = new bae();
        awm awm = new awm();
        anu anu = anu.a;
        bih bih = new bih(3);
        this.E = uri;
        this.j = uri;
        this.r = bhu;
        this.w = bae;
        this.s = azb;
        this.u = anu;
        this.c = bih;
        this.v = 30000;
        this.t = awm;
        this.d = a((awt) null);
        this.e = new Object();
        this.y = new SparseArray();
        this.A = new azj(this);
        this.p = -9223372036854775807L;
        this.x = new azl(this);
        this.B = new azm(this);
        this.z = new azg(this);
        this.f = new azh(this);
    }

    public final aws a(awt awt, bhk bhk, long j2) {
        awt awt2 = awt;
        int intValue = ((Integer) awt2.a).intValue() - this.q;
        long j3 = this.k.a(intValue).b;
        bks.a(true);
        axg a = this.b.a(awt2, j3);
        azf azf = new azf(this.q + intValue, this.k, intValue, this.s, this.D, this.u, this.c, a, this.F, this.B, bhk, this.t, this.A);
        this.y.put(azf.a, azf);
        return azf;
    }

    public final void d() {
        this.B.a();
    }

    /* access modifiers changed from: package-private */
    public final void a(bja bja, long j2, long j3) {
        this.d.a(bja.b);
    }

    public final void a(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        a(true);
    }

    public final void a(long j2) {
        this.F = j2;
        a(true);
    }

    /* access modifiers changed from: protected */
    public final void a(bjf bjf) {
        this.D = bjf;
        this.C = ((bif) this.r).a();
        this.g = new bix("Loader:DashMediaSource");
        this.i = new Handler();
        e();
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
    public final void a(boolean z2) {
        long j2;
        boolean z3;
        long j3;
        long j4;
        for (int i2 = 0; i2 < this.y.size(); i2++) {
            int keyAt = this.y.keyAt(i2);
            if (keyAt >= this.q) {
                azf azf = (azf) this.y.valueAt(i2);
                bac bac = this.k;
                int i3 = keyAt - this.q;
                azf.g = bac;
                azf.h = i3;
                baa baa = azf.b;
                baa.h = false;
                baa.f = bac;
                Iterator it = baa.e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < baa.f.g) {
                        it.remove();
                    }
                }
                ays[] aysArr = azf.e;
                if (aysArr != null) {
                    for (ays ays : aysArr) {
                        ((azc) ays.e).a(bac, i3);
                    }
                    azf.d.a((axz) azf);
                }
                azf.i = bac.a(i3).d;
                for (azw azw : azf.f) {
                    Iterator it2 = azf.i.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        bag bag = (bag) it2.next();
                        if (bag.a().equals(azw.a.a())) {
                            azw.a(bag, bac.c && i3 == bac.a() + -1);
                        }
                    }
                }
            }
        }
        int a = this.k.a() - 1;
        azn a2 = azn.a(this.k.a(0), this.k.b(0));
        azn a3 = azn.a(this.k.a(a), this.k.b(a));
        long j5 = a2.b;
        long j6 = a3.c;
        if (this.k.c && !a3.a) {
            if (this.F != 0) {
                j4 = aja.b(SystemClock.elapsedRealtime() + this.F);
            } else {
                j4 = aja.b(System.currentTimeMillis());
            }
            j6 = Math.min((j4 - aja.b(this.k.a)) - aja.b(this.k.a(a).b), j6);
            long j7 = this.k.e;
            if (j7 != -9223372036854775807L) {
                long b = j6 - aja.b(j7);
                while (b < 0 && a > 0) {
                    a--;
                    b += this.k.b(a);
                }
                if (a != 0) {
                    j5 = this.k.b(0);
                } else {
                    j5 = Math.max(j5, b);
                }
            }
            j2 = j5;
            z3 = true;
        } else {
            j2 = j5;
            z3 = false;
        }
        long j8 = j6 - j2;
        for (int i4 = 0; i4 < this.k.a() - 1; i4++) {
            j8 += this.k.b(i4);
        }
        bac bac2 = this.k;
        if (bac2.c) {
            long j9 = this.v;
            long j10 = bac2.f;
            if (j10 != -9223372036854775807L) {
                j9 = j10;
            }
            long b2 = j8 - aja.b(j9);
            j3 = b2 < 5000000 ? Math.min(5000000L, j8 / 2) : b2;
        } else {
            j3 = 0;
        }
        bac bac3 = this.k;
        long j11 = bac3.a;
        long j12 = bac3.a(0).b;
        bac bac4 = this.k;
        a(new azi(bac4.a, j11 + j12 + aja.a(j2), this.q, j2, j8, j3, bac4));
        this.i.removeCallbacks(this.f);
        long j13 = 5000;
        if (z3) {
            this.i.postDelayed(this.f, 5000);
        }
        if (this.l) {
            e();
        } else if (z2) {
            bac bac5 = this.k;
            if (bac5.c) {
                long j14 = bac5.d;
                if (j14 != -9223372036854775807L) {
                    if (j14 != 0) {
                        j13 = j14;
                    }
                    b(Math.max(0L, (this.m + j13) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    public final void a(aws aws) {
        azf azf = (azf) aws;
        baa baa = azf.b;
        baa.i = true;
        baa.d.removeCallbacksAndMessages(null);
        for (ays a : azf.e) {
            a.a(azf);
        }
        azf.d = null;
        azf.c.b();
        this.y.remove(azf.a);
    }

    /* access modifiers changed from: protected */
    public final void c() {
        this.l = false;
        this.C = null;
        bix bix = this.g;
        if (bix != null) {
            bix.f();
            this.g = null;
        }
        this.m = 0;
        this.n = 0;
        this.k = null;
        this.j = this.E;
        this.h = null;
        Handler handler = this.i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.i = null;
        }
        this.F = 0;
        this.o = 0;
        this.p = -9223372036854775807L;
        this.q = 0;
        this.y.clear();
    }

    public final void a(bav bav, biz biz) {
        a(new bja(this.C, Uri.parse(bav.b), 5, biz), new azo(this), 1);
    }

    public final void b(long j2) {
        this.i.postDelayed(this.z, j2);
    }

    private final void a(bja bja, biq biq, int i2) {
        this.g.a(bja, biq, i2);
        this.d.c(bja.b);
    }

    public final void e() {
        Uri uri;
        this.i.removeCallbacks(this.z);
        if (this.g.b()) {
            return;
        }
        if (!this.g.d()) {
            synchronized (this.e) {
                uri = this.j;
            }
            this.l = false;
            a(new bja(this.C, uri, 4, this.w), this.x, this.c.a(4));
            return;
        }
        this.l = true;
    }
}
