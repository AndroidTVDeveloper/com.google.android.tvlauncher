package p000;

import android.net.Uri;
import android.os.Handler;
import android.os.SystemClock;
import android.util.Log;
import android.util.SparseArray;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: azq */
/* compiled from: PG */
public final class azq extends awc {

    /* renamed from: A */
    private final azy f2887A;

    /* renamed from: B */
    private final biy f2888B;

    /* renamed from: C */
    private bhv f2889C;

    /* renamed from: D */
    private bjf f2890D;

    /* renamed from: E */
    private final Uri f2891E;

    /* renamed from: F */
    private long f2892F;

    /* renamed from: c */
    public final bip f2893c;

    /* renamed from: d */
    public final axg f2894d;

    /* renamed from: e */
    public final Object f2895e;

    /* renamed from: f */
    public final Runnable f2896f;

    /* renamed from: g */
    public bix f2897g;

    /* renamed from: h */
    public IOException f2898h;

    /* renamed from: i */
    public Handler f2899i;

    /* renamed from: j */
    public Uri f2900j;

    /* renamed from: k */
    public bac f2901k = null;

    /* renamed from: l */
    public boolean f2902l;

    /* renamed from: m */
    public long f2903m;

    /* renamed from: n */
    public long f2904n;

    /* renamed from: o */
    public int f2905o;

    /* renamed from: p */
    public long f2906p;

    /* renamed from: q */
    public int f2907q;

    /* renamed from: r */
    private final bhu f2908r;

    /* renamed from: s */
    private final azb f2909s;

    /* renamed from: t */
    private final awl f2910t;

    /* renamed from: u */
    private final anu f2911u;

    /* renamed from: v */
    private final long f2912v;

    /* renamed from: w */
    private final biz f2913w;

    /* renamed from: x */
    private final azl f2914x;

    /* renamed from: y */
    private final SparseArray f2915y;

    /* renamed from: z */
    private final Runnable f2916z;

    static {
        akf.m726a("goog.exo.dash");
    }

    @Deprecated
    public azq(Uri uri, bhu bhu, azb azb) {
        bae bae = new bae();
        awm awm = new awm();
        anu anu = anu.f1453a;
        bih bih = new bih(3);
        this.f2891E = uri;
        this.f2900j = uri;
        this.f2908r = bhu;
        this.f2913w = bae;
        this.f2909s = azb;
        this.f2911u = anu;
        this.f2893c = bih;
        this.f2912v = 30000;
        this.f2910t = awm;
        this.f2894d = mo1464a((awt) null);
        this.f2895e = new Object();
        this.f2915y = new SparseArray();
        this.f2887A = new azj(this);
        this.f2906p = -9223372036854775807L;
        this.f2914x = new azl(this);
        this.f2888B = new azm(this);
        this.f2916z = new azg(this);
        this.f2896f = new azh(this);
    }

    /* renamed from: a */
    public final aws mo1496a(awt awt, bhk bhk, long j) {
        awt awt2 = awt;
        int intValue = ((Integer) awt2.f2566a).intValue() - this.f2907q;
        long j2 = this.f2901k.mo1679a(intValue).f2998b;
        bks.m3510a(true);
        axg a = this.f2538b.mo1516a(awt2, j2);
        azf azf = new azf(this.f2907q + intValue, this.f2901k, intValue, this.f2909s, this.f2890D, this.f2911u, this.f2893c, a, this.f2892F, this.f2888B, bhk, this.f2910t, this.f2887A);
        this.f2915y.put(azf.f2848a, azf);
        return azf;
    }

    /* renamed from: d */
    public final void mo1494d() {
        this.f2888B.mo1649a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo1652a(bja bja, long j, long j2) {
        this.f2894d.mo1518a(bja.f4105b);
    }

    /* renamed from: a */
    public final void mo1653a(IOException iOException) {
        Log.e("DashMediaSource", "Failed to resolve UtcTiming element.", iOException);
        mo1654a(true);
    }

    /* renamed from: a */
    public final void mo1650a(long j) {
        this.f2892F = j;
        mo1654a(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo1471a(bjf bjf) {
        this.f2890D = bjf;
        this.f2889C = ((bif) this.f2908r).mo1949a();
        this.f2897g = new bix("Loader:DashMediaSource");
        this.f2899i = new Handler();
        mo1656e();
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
    public final void mo1654a(boolean z) {
        long j;
        boolean z2;
        long j2;
        long j3;
        for (int i = 0; i < this.f2915y.size(); i++) {
            int keyAt = this.f2915y.keyAt(i);
            if (keyAt >= this.f2907q) {
                azf azf = (azf) this.f2915y.valueAt(i);
                bac bac = this.f2901k;
                int i2 = keyAt - this.f2907q;
                azf.f2854g = bac;
                azf.f2855h = i2;
                baa baa = azf.f2849b;
                baa.f2962h = false;
                baa.f2960f = bac;
                Iterator it = baa.f2959e.entrySet().iterator();
                while (it.hasNext()) {
                    if (((Long) ((Map.Entry) it.next()).getKey()).longValue() < baa.f2960f.f2976g) {
                        it.remove();
                    }
                }
                ays[] aysArr = azf.f2852e;
                if (aysArr != null) {
                    for (ays ays : aysArr) {
                        ((azc) ays.f2801e).mo1644a(bac, i2);
                    }
                    azf.f2851d.mo414a((axz) azf);
                }
                azf.f2856i = bac.mo1679a(i2).f3000d;
                for (azw azw : azf.f2853f) {
                    Iterator it2 = azf.f2856i.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        bag bag = (bag) it2.next();
                        if (bag.mo1683a().equals(azw.f2938a.mo1683a())) {
                            azw.mo1672a(bag, bac.f2972c && i2 == bac.mo1678a() + -1);
                        }
                    }
                }
            }
        }
        int a = this.f2901k.mo1678a() - 1;
        azn a2 = azn.m2545a(this.f2901k.mo1679a(0), this.f2901k.mo1680b(0));
        azn a3 = azn.m2545a(this.f2901k.mo1679a(a), this.f2901k.mo1680b(a));
        long j4 = a2.f2884b;
        long j5 = a3.f2885c;
        if (this.f2901k.f2972c && !a3.f2883a) {
            if (this.f2892F != 0) {
                j3 = aja.m633b(SystemClock.elapsedRealtime() + this.f2892F);
            } else {
                j3 = aja.m633b(System.currentTimeMillis());
            }
            j5 = Math.min((j3 - aja.m633b(this.f2901k.f2970a)) - aja.m633b(this.f2901k.mo1679a(a).f2998b), j5);
            long j6 = this.f2901k.f2974e;
            if (j6 != -9223372036854775807L) {
                long b = j5 - aja.m633b(j6);
                while (b < 0 && a > 0) {
                    a--;
                    b += this.f2901k.mo1680b(a);
                }
                if (a != 0) {
                    j4 = this.f2901k.mo1680b(0);
                } else {
                    j4 = Math.max(j4, b);
                }
            }
            j = j4;
            z2 = true;
        } else {
            j = j4;
            z2 = false;
        }
        long j7 = j5 - j;
        for (int i3 = 0; i3 < this.f2901k.mo1678a() - 1; i3++) {
            j7 += this.f2901k.mo1680b(i3);
        }
        bac bac2 = this.f2901k;
        if (bac2.f2972c) {
            long j8 = this.f2912v;
            long j9 = bac2.f2975f;
            if (j9 != -9223372036854775807L) {
                j8 = j9;
            }
            long b2 = j7 - aja.m633b(j8);
            j2 = b2 < 5000000 ? Math.min(5000000L, j7 / 2) : b2;
        } else {
            j2 = 0;
        }
        bac bac3 = this.f2901k;
        long j10 = bac3.f2970a;
        long j11 = bac3.mo1679a(0).f2998b;
        bac bac4 = this.f2901k;
        mo1466a(new azi(bac4.f2970a, j10 + j11 + aja.m632a(j), this.f2907q, j, j7, j2, bac4));
        this.f2899i.removeCallbacks(this.f2896f);
        long j12 = 5000;
        if (z2) {
            this.f2899i.postDelayed(this.f2896f, 5000);
        }
        if (this.f2902l) {
            mo1656e();
        } else if (z) {
            bac bac5 = this.f2901k;
            if (bac5.f2972c) {
                long j13 = bac5.f2973d;
                if (j13 != -9223372036854775807L) {
                    if (j13 != 0) {
                        j12 = j13;
                    }
                    mo1655b(Math.max(0L, (this.f2903m + j12) - SystemClock.elapsedRealtime()));
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo1497a(aws aws) {
        azf azf = (azf) aws;
        baa baa = azf.f2849b;
        baa.f2963i = true;
        baa.f2958d.removeCallbacksAndMessages(null);
        for (ays a : azf.f2852e) {
            a.mo1630a(azf);
        }
        azf.f2851d = null;
        azf.f2850c.mo1526b();
        this.f2915y.remove(azf.f2848a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo1474c() {
        this.f2902l = false;
        this.f2889C = null;
        bix bix = this.f2897g;
        if (bix != null) {
            bix.mo1991f();
            this.f2897g = null;
        }
        this.f2903m = 0;
        this.f2904n = 0;
        this.f2901k = null;
        this.f2900j = this.f2891E;
        this.f2898h = null;
        Handler handler = this.f2899i;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.f2899i = null;
        }
        this.f2892F = 0;
        this.f2905o = 0;
        this.f2906p = -9223372036854775807L;
        this.f2907q = 0;
        this.f2915y.clear();
    }

    /* renamed from: a */
    public final void mo1651a(bav bav, biz biz) {
        m2550a(new bja(this.f2889C, Uri.parse(bav.f3038b), 5, biz), new azo(this), 1);
    }

    /* renamed from: b */
    public final void mo1655b(long j) {
        this.f2899i.postDelayed(this.f2916z, j);
    }

    /* renamed from: a */
    private final void m2550a(bja bja, biq biq, int i) {
        this.f2897g.mo1984a(bja, biq, i);
        this.f2894d.mo1533c(bja.f4105b);
    }

    /* renamed from: e */
    public final void mo1656e() {
        Uri uri;
        this.f2899i.removeCallbacks(this.f2916z);
        if (this.f2897g.mo1987b()) {
            return;
        }
        if (!this.f2897g.mo1989d()) {
            synchronized (this.f2895e) {
                uri = this.f2900j;
            }
            this.f2902l = false;
            m2550a(new bja(this.f2889C, uri, 4, this.f2913w), this.f2914x, this.f2893c.mo1973a(4));
            return;
        }
        this.f2902l = true;
    }
}
