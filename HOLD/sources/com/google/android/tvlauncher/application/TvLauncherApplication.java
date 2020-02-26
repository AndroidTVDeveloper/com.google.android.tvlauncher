package com.google.android.tvlauncher.application;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: PG */
public class TvLauncherApplication extends cgg {
    public final Object a = new Object();
    public volatile clr b;
    public final Object c = new Object();
    public final Object d = new Object();
    public volatile dbq e;
    public volatile dcr f;
    private final Object i = new Object();
    private volatile cll j;
    private final Object k = new Object();
    private final Object l = new Object();
    private volatile dcx m;
    private volatile dcy n;

    static {
        cce cce = cce.a;
        if (cce.c == 0) {
            cce.c = SystemClock.elapsedRealtime();
            cce.i.a = true;
        }
    }

    public final cll a() {
        cll cll;
        cll cll2 = this.j;
        if (cll2 != null) {
            return cll2;
        }
        synchronized (this.i) {
            cll = this.j;
            if (cll == null) {
                cll = new cll(this);
                this.j = cll;
            }
        }
        return cll;
    }

    public final void b() {
        if (this.m == null) {
            synchronized (this.k) {
                if (this.m == null) {
                    this.m = new dcx();
                }
            }
        }
    }

    public final dcy c() {
        dcy dcy;
        dcy dcy2 = this.n;
        if (dcy2 != null) {
            return dcy2;
        }
        synchronized (this.l) {
            dcy = this.n;
            if (dcy == null) {
                dcy = new dcy();
                this.n = dcy;
            }
        }
        return dcy;
    }

    private final void f() {
        dbk dbk;
        cge cge = new cge(this);
        cgb.a();
        if (cge.a(cge.a, "tvlauncher:primes_enabled")) {
            cgd cgd = new cgd(this, cge);
            dbk a2 = bog.a();
            cbc cbc = new cbc((Application) dgx.a(this));
            cbc.b = new byr();
            cbc.c = new ccu();
            cbc.f = (dnj) dgx.a(cgd);
            cbc.g = (dbk) dgx.a(a2);
            bys bys = (bys) cev.a(cbc.b);
            Application application = (Application) cev.a(cbc.a);
            dnj dnj = (dnj) cev.a(cbc.f);
            dff dff = (dff) cev.a(cbc.c);
            dff dff2 = cbc.d;
            cba cba = new cba(cbc);
            if (cbc.g != null) {
                dbk = cbc.g;
            } else {
                dbk = bog.a();
            }
            dff dff3 = cbc.e;
            cas a3 = cas.a(bys.a(application, dnj, dff, cba, dbk, cbb.a));
            a3.a.b();
            a3.a.c();
            return;
        }
        Log.e("PrimesConfiguration", "PRIMES not enabled");
    }

    public final void onCreate() {
        super.onCreate();
        cce cce = cce.a;
        if (cev.a() && cce.c > 0 && cce.d == 0) {
            cce.d = SystemClock.elapsedRealtime();
            cce.i.b = true;
            cev.a((Runnable) new cby(cce));
            registerActivityLifecycleCallbacks(new ccc(cce, this));
        }
        bwa.a(this);
        if (!dcx.a()) {
            if (!d()) {
                cfm.a = new cfm(new cfn(this), new cfo(this));
                if (!dcx.a()) {
                    bop bop = new bop(this);
                    bop.a(bxq.a);
                    bos a2 = bop.a();
                    bxq.b.a(a2).a(new cfj(a2));
                    a2.b();
                }
            }
            cgb.a();
            cgf cgf = new cgf(this);
            cep cep = new cep();
            ces ces = new ces(this);
            if (!Build.TYPE.equals("unknown")) {
                bop bop2 = new bop(this);
                bop2.a(bxq.a);
                bos a3 = bop2.a();
                bxq.b.a(a3).a(new cer(ces, this, a3));
                a3.b();
            }
            cgf cgf2 = cgf;
            ces ces2 = ces;
            Thread.setDefaultUncaughtExceptionHandler(new cem(this, Thread.getDefaultUncaughtExceptionHandler(), cep.a, cgf2, ces2));
            Thread.currentThread().setUncaughtExceptionHandler(new ceo(this, Thread.currentThread().getUncaughtExceptionHandler(), cep.a, cgf2, ces2));
            f();
        } else if (ActivityManager.isRunningInTestHarness()) {
            cfv.b();
            f();
        } else {
            cfv.b();
        }
    }
}
