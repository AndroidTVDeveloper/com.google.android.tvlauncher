package defpackage;

import android.app.Application;
import android.os.SystemClock;

/* renamed from: byo  reason: default package */
/* compiled from: PG */
abstract class byo implements ccl {
    public final Application a;
    public final dff b;
    public volatile boolean c;
    private final cae d;

    protected byo(dnj dnj, Application application, dff dff, dff dff2, int i) {
        this(dnj, application, dff, dff2, i, Integer.MAX_VALUE);
    }

    public abstract void d();

    protected byo(dnj dnj, Application application, dff dff, dff dff2, int i, int i2) {
        cev.a(dnj);
        cev.a(application);
        this.a = application;
        this.b = dff2;
        this.d = new cae(dnj, dff, dff2, i, i2);
    }

    /* access modifiers changed from: package-private */
    public final dhe c() {
        return (dhe) this.b.a();
    }

    public final void a() {
        this.c = true;
        d();
    }

    /* access modifiers changed from: protected */
    public final void a(String str, boolean z, dom dom, dnm dnm) {
        a(str, z, dom, null, null);
    }

    public final void a(String str, boolean z, dom dom, dnm dnm, String str2) {
        if (!this.c) {
            cae cae = this.d;
            if (cae.c != 1) {
                ((dhe) cae.b.a()).a(new cad(cae, str, z, dom, null, str2));
            } else {
                cae.a(str, z, dom, null, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void a(dom dom) {
        a(null, true, dom, null, null);
    }

    /* access modifiers changed from: protected */
    public final boolean b() {
        boolean z;
        ccz ccz = this.d.a;
        synchronized (ccz.a) {
            z = false;
            if (SystemClock.elapsedRealtime() - ccz.d <= 1000) {
                if (ccz.c >= ccz.b) {
                    z = true;
                }
            }
        }
        return !z;
    }
}
