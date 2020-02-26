package com.google.android.tvlauncher.application;

import android.app.ActivityManager;
import android.app.Application;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;

/* compiled from: PG */
public class TvLauncherApplication extends cgg {

    /* renamed from: a */
    public final Object f6366a = new Object();

    /* renamed from: b */
    public volatile clr f6367b;

    /* renamed from: c */
    public final Object f6368c = new Object();

    /* renamed from: d */
    public final Object f6369d = new Object();

    /* renamed from: e */
    public volatile dbq f6370e;

    /* renamed from: f */
    public volatile dcr f6371f;

    /* renamed from: i */
    private final Object f6372i = new Object();

    /* renamed from: j */
    private volatile cll f6373j;

    /* renamed from: k */
    private final Object f6374k = new Object();

    /* renamed from: l */
    private final Object f6375l = new Object();

    /* renamed from: m */
    private volatile dcx f6376m;

    /* renamed from: n */
    private volatile dcy f6377n;

    static {
        cce cce = cce.f5247a;
        if (cce.f5251c == 0) {
            cce.f5251c = SystemClock.elapsedRealtime();
            cce.f5257i.f5241a = true;
        }
    }

    /* renamed from: a */
    public final cll mo3214a() {
        cll cll;
        cll cll2 = this.f6373j;
        if (cll2 != null) {
            return cll2;
        }
        synchronized (this.f6372i) {
            cll = this.f6373j;
            if (cll == null) {
                cll = new cll(this);
                this.f6373j = cll;
            }
        }
        return cll;
    }

    /* renamed from: b */
    public final void mo3215b() {
        if (this.f6376m == null) {
            synchronized (this.f6374k) {
                if (this.f6376m == null) {
                    this.f6376m = new dcx();
                }
            }
        }
    }

    /* renamed from: c */
    public final dcy mo3216c() {
        dcy dcy;
        dcy dcy2 = this.f6377n;
        if (dcy2 != null) {
            return dcy2;
        }
        synchronized (this.f6375l) {
            dcy = this.f6377n;
            if (dcy == null) {
                dcy = new dcy();
                this.f6377n = dcy;
            }
        }
        return dcy;
    }

    /* renamed from: f */
    private final void m5246f() {
        dbk dbk;
        cge cge = new cge(this);
        cgb.m4699a();
        if (cge.m4702a(cge.f5457a, "tvlauncher:primes_enabled")) {
            cgd cgd = new cgd(this, cge);
            dbk a = bog.m3827a();
            cbc cbc = new cbc((Application) dgx.m6401a(this));
            cbc.f5176b = new byr();
            cbc.f5177c = new ccu();
            cbc.f5180f = (dnj) dgx.m6401a(cgd);
            cbc.f5181g = (dbk) dgx.m6401a(a);
            bys bys = (bys) cev.m4629a(cbc.f5176b);
            Application application = (Application) cev.m4629a(cbc.f5175a);
            dnj dnj = (dnj) cev.m4629a(cbc.f5180f);
            dff dff = (dff) cev.m4629a(cbc.f5177c);
            dff dff2 = cbc.f5178d;
            cba cba = new cba(cbc);
            if (cbc.f5181g != null) {
                dbk = cbc.f5181g;
            } else {
                dbk = bog.m3827a();
            }
            dff dff3 = cbc.f5179e;
            cas a2 = cas.m4457a(bys.mo2552a(application, dnj, dff, cba, dbk, cbb.f5174a));
            a2.f5143a.mo2577b();
            a2.f5143a.mo2578c();
            return;
        }
        Log.e("PrimesConfiguration", "PRIMES not enabled");
    }

    public final void onCreate() {
        super.onCreate();
        cce cce = cce.f5247a;
        if (cev.m4634a() && cce.f5251c > 0 && cce.f5252d == 0) {
            cce.f5252d = SystemClock.elapsedRealtime();
            cce.f5257i.f5242b = true;
            cev.m4631a((Runnable) new cby(cce));
            registerActivityLifecycleCallbacks(new ccc(cce, this));
        }
        bwa.m4292a(this);
        if (!dcx.m6183a()) {
            if (!mo2749d()) {
                cfm.f5405a = new cfm(new cfn(this), new cfo(this));
                if (!dcx.m6183a()) {
                    bop bop = new bop(this);
                    bop.mo2243a(bxq.f4989a);
                    bos a = bop.mo2242a();
                    bxq.f4990b.mo2531a(a).mo2250a(new cfj(a));
                    a.mo2246b();
                }
            }
            cgb.m4699a();
            cgf cgf = new cgf(this);
            cep cep = new cep();
            ces ces = new ces(this);
            if (!Build.TYPE.equals("unknown")) {
                bop bop2 = new bop(this);
                bop2.mo2243a(bxq.f4989a);
                bos a2 = bop2.mo2242a();
                bxq.f4990b.mo2531a(a2).mo2250a(new cer(ces, this, a2));
                a2.mo2246b();
            }
            cgf cgf2 = cgf;
            ces ces2 = ces;
            Thread.setDefaultUncaughtExceptionHandler(new cem(this, Thread.getDefaultUncaughtExceptionHandler(), cep.f5382a, cgf2, ces2));
            Thread.currentThread().setUncaughtExceptionHandler(new ceo(this, Thread.currentThread().getUncaughtExceptionHandler(), cep.f5382a, cgf2, ces2));
            m5246f();
        } else if (ActivityManager.isRunningInTestHarness()) {
            cfv.m4687b();
            m5246f();
        } else {
            cfv.m4687b();
        }
    }
}
