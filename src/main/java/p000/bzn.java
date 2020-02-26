package p000;

import android.app.Application;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: bzn */
/* compiled from: PG */
final class bzn extends byo implements cbx {

    /* renamed from: d */
    public final AtomicBoolean f5054d = new AtomicBoolean();

    /* renamed from: e */
    public volatile cah f5055e;

    /* renamed from: f */
    public final AtomicBoolean f5056f;

    /* renamed from: g */
    private final boolean f5057g;

    /* renamed from: h */
    private final bze f5058h;

    /* renamed from: i */
    private volatile bzl f5059i;

    /* renamed from: j */
    private volatile dof f5060j;

    public bzn(dnj dnj, cdj cdj, dff dff, dff dff2, Application application) {
        super(dnj, application, dff, dff2, 1);
        cev.m4629a(cdj);
        cev.m4633a(true, "StartupSamplePercentage should be a floating number > 0 and <= 100.");
        this.f5058h = bze.m4405a(application);
        this.f5057g = cda.m4558a(1.0f).mo2673a();
        this.f5056f = new AtomicBoolean(false);
    }

    /* renamed from: e */
    public final void mo2585e() {
        if (this.f5056f.getAndSet(false)) {
            mo2584a(dok.PRIMES_CRASH_MONITORING_INITIALIZED);
            mo2584a(dok.PRIMES_FIRST_ACTIVITY_LAUNCHED);
        }
    }

    /* renamed from: g */
    public final void mo2587g() {
        bog.m3832a("CrashMetricService", "onFirstActivityCreated", new Object[0]);
        if (!this.f5056f.get()) {
            dok dok = dok.PRIMES_FIRST_ACTIVITY_LAUNCHED;
            if (!mo2547b() || !this.f5057g) {
                bog.m3835b("CrashMetricService", "Startup metric for '%s' dropped.", dok);
            } else if (cev.m4634a()) {
                mo2548c().mo2629a(new bzi(this, dok));
            } else {
                mo2584a(dok);
            }
        }
        this.f5059i = new bzk(this);
        this.f5058h.mo2564a(this.f5059i);
    }

    /* renamed from: f */
    public final void mo2586f() {
        bog.m3832a("CrashMetricService", "onPrimesInitialize", new Object[0]);
        if (this.f5056f.get()) {
            this.f5060j = null;
        } else if (mo2547b() && this.f5057g) {
            mo2584a(dok.PRIMES_CRASH_MONITORING_INITIALIZED);
        } else {
            bog.m3835b("CrashMetricService", "Startup metric for 'PRIMES_CRASH_MONITORING_INITIALIZED' dropped.", new Object[0]);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2584a(dok dok) {
        dja l = dom.f9077q.mo4516l();
        dja l2 = dol.f9073d.mo4516l();
        if (l2.f8673b) {
            l2.mo4505b();
            l2.f8673b = false;
        }
        dol dol = (dol) l2.f8672a;
        int i = dol.f9074a | 2;
        dol.f9074a = i;
        dol.f9076c = 1;
        dol.f9075b = dok.f9072c;
        dol.f9074a = i | 1;
        if (l.f8673b) {
            l.mo4505b();
            l.f8673b = false;
        }
        dom dom = (dom) l.f8672a;
        dol dol2 = (dol) l2.mo4509g();
        dol2.getClass();
        dom.f9086i = dol2;
        dom.f9078a |= 128;
        mo2544a((dom) l.mo4509g());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2583a(cah cah) {
        String valueOf = String.valueOf(cah.m4439a(cah));
        bog.m3832a("CrashMetricService", valueOf.length() == 0 ? new String("activeComponentName: ") : "activeComponentName: ".concat(valueOf), new Object[0]);
        this.f5055e = cah;
    }

    /* renamed from: d */
    public final void mo2549d() {
        if (this.f5059i != null) {
            this.f5058h.mo2565b(this.f5059i);
            this.f5059i = null;
        }
        if (this.f5054d.get() && (Thread.getDefaultUncaughtExceptionHandler() instanceof bzm)) {
            Thread.setDefaultUncaughtExceptionHandler(((bzm) Thread.getDefaultUncaughtExceptionHandler()).f5052a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Thread.UncaughtExceptionHandler mo2582a(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return new bzm(this, uncaughtExceptionHandler);
    }
}
