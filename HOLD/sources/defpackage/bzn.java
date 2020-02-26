package defpackage;

import android.app.Application;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bzn  reason: default package */
/* compiled from: PG */
final class bzn extends byo implements cbx {
    public final AtomicBoolean d = new AtomicBoolean();
    public volatile cah e;
    public final AtomicBoolean f;
    private final boolean g;
    private final bze h;
    private volatile bzl i;
    private volatile dof j;

    public bzn(dnj dnj, cdj cdj, dff dff, dff dff2, Application application) {
        super(dnj, application, dff, dff2, 1);
        cev.a(cdj);
        cev.a(true, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.h = bze.a(application);
        this.g = cda.a(1.0f).a();
        this.f = new AtomicBoolean(false);
    }

    public final void e() {
        if (this.f.getAndSet(false)) {
            a(dok.PRIMES_CRASH_MONITORING_INITIALIZED);
            a(dok.PRIMES_FIRST_ACTIVITY_LAUNCHED);
        }
    }

    public final void g() {
        bog.a("CrashMetricService", "onFirstActivityCreated", new Object[0]);
        if (!this.f.get()) {
            dok dok = dok.PRIMES_FIRST_ACTIVITY_LAUNCHED;
            if (!b() || !this.g) {
                bog.b("CrashMetricService", "Startup metric for '%s' dropped.", dok);
            } else if (cev.a()) {
                c().a(new bzi(this, dok));
            } else {
                a(dok);
            }
        }
        this.i = new bzk(this);
        this.h.a(this.i);
    }

    public final void f() {
        bog.a("CrashMetricService", "onPrimesInitialize", new Object[0]);
        if (this.f.get()) {
            this.j = null;
        } else if (b() && this.g) {
            a(dok.PRIMES_CRASH_MONITORING_INITIALIZED);
        } else {
            bog.b("CrashMetricService", "Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(dok dok) {
        dja l = dom.q.l();
        dja l2 = dol.d.l();
        if (l2.b) {
            l2.b();
            l2.b = false;
        }
        dol dol = (dol) l2.a;
        int i2 = dol.a | 2;
        dol.a = i2;
        dol.c = 1;
        dol.b = dok.c;
        dol.a = i2 | 1;
        if (l.b) {
            l.b();
            l.b = false;
        }
        dom dom = (dom) l.a;
        dol dol2 = (dol) l2.g();
        dol2.getClass();
        dom.i = dol2;
        dom.a |= 128;
        a((dom) l.g());
    }

    /* access modifiers changed from: package-private */
    public final void a(cah cah) {
        String valueOf = String.valueOf(cah.a(cah));
        bog.a("CrashMetricService", valueOf.length() == 0 ? new String("activeComponentName: ") : "activeComponentName: ".concat(valueOf), new Object[0]);
        this.e = cah;
    }

    public final void d() {
        if (this.i != null) {
            this.h.b(this.i);
            this.i = null;
        }
        if (this.d.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof bzm)) {
            Thread.setDefaultUncaughtExceptionHandler(((bzm) Thread.getDefaultUncaughtExceptionHandler()).a);
        }
    }

    /* access modifiers changed from: package-private */
    public final Thread.UncaughtExceptionHandler a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new bzm(this, uncaughtExceptionHandler);
    }
}
