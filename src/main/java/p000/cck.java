package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cck */
/* compiled from: PG */
public final class cck {

    /* renamed from: a */
    public volatile boolean f5274a;

    /* renamed from: b */
    private final List f5275b = new ArrayList();

    public cck() {
    }

    /* renamed from: a */
    public final boolean mo2669a(ccl ccl) {
        synchronized (this.f5275b) {
            if (this.f5274a) {
                return false;
            }
            this.f5275b.add((ccl) cev.m4629a(ccl));
            return true;
        }
    }

    /* renamed from: a */
    public final synchronized void mo2667a() {
        if (!this.f5274a) {
            this.f5274a = true;
            bog.m3832a("PrimesShutdown", "Shutdown ...", new Object[0]);
            synchronized (this.f5275b) {
                for (ccl a : this.f5275b) {
                    try {
                        a.mo2543a();
                    } catch (RuntimeException e) {
                        bog.m3831a("PrimesShutdown", "ShutdownListener crashed", e, new Object[0]);
                    }
                }
                this.f5275b.clear();
                bog.m3832a("PrimesShutdown", "All ShutdownListeners notified.", new Object[0]);
            }
        }
    }

    /* renamed from: a */
    public final void mo2668a(dff dff) {
        if (!this.f5274a && ((cct) dff).mo2551a().booleanValue()) {
            mo2667a();
        }
    }

    public /* synthetic */ cck(byte b) {
    }
}
