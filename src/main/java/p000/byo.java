package p000;

import android.app.Application;
import android.os.SystemClock;

/* renamed from: byo */
/* compiled from: PG */
abstract class byo implements ccl {

    /* renamed from: a */
    public final Application f5025a;

    /* renamed from: b */
    public final dff f5026b;

    /* renamed from: c */
    public volatile boolean f5027c;

    /* renamed from: d */
    private final cae f5028d;

    protected byo(dnj dnj, Application application, dff dff, dff dff2, int i) {
        this(dnj, application, dff, dff2, i, Integer.MAX_VALUE);
    }

    /* renamed from: d */
    public abstract void mo2549d();

    protected byo(dnj dnj, Application application, dff dff, dff dff2, int i, int i2) {
        cev.m4629a(dnj);
        cev.m4629a(application);
        this.f5025a = application;
        this.f5026b = dff2;
        this.f5028d = new cae(dnj, dff, dff2, i, i2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final dhe mo2548c() {
        return (dhe) this.f5026b.mo2551a();
    }

    /* renamed from: a */
    public final void mo2543a() {
        this.f5027c = true;
        mo2549d();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2545a(String str, boolean z, dom dom, dnm dnm) {
        mo2546a(str, z, dom, null, null);
    }

    /* renamed from: a */
    public final void mo2546a(String str, boolean z, dom dom, dnm dnm, String str2) {
        if (!this.f5027c) {
            cae cae = this.f5028d;
            if (cae.f5111c != 1) {
                ((dhe) cae.f5110b.mo2551a()).mo2629a(new cad(cae, str, z, dom, null, str2));
            } else {
                cae.mo2599a(str, z, dom, null, str2);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo2544a(dom dom) {
        mo2546a(null, true, dom, null, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final boolean mo2547b() {
        boolean z;
        ccz ccz = this.f5028d.f5109a;
        synchronized (ccz.f5293a) {
            z = false;
            if (SystemClock.elapsedRealtime() - ccz.f5296d <= 1000) {
                if (ccz.f5295c >= ccz.f5294b) {
                    z = true;
                }
            }
        }
        return !z;
    }
}
