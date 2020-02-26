package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: cck  reason: default package */
/* compiled from: PG */
public final class cck {
    public volatile boolean a;
    private final List b = new ArrayList();

    public cck() {
    }

    public final boolean a(ccl ccl) {
        synchronized (this.b) {
            if (this.a) {
                return false;
            }
            this.b.add((ccl) cev.a(ccl));
            return true;
        }
    }

    public final synchronized void a() {
        if (!this.a) {
            this.a = true;
            bog.a("PrimesShutdown", "Shutdown ...", new Object[0]);
            synchronized (this.b) {
                for (ccl a2 : this.b) {
                    try {
                        a2.a();
                    } catch (RuntimeException e) {
                        bog.a("PrimesShutdown", "ShutdownListener crashed", e, new Object[0]);
                    }
                }
                this.b.clear();
                bog.a("PrimesShutdown", "All ShutdownListeners notified.", new Object[0]);
            }
        }
    }

    public final void a(dff dff) {
        if (!this.a && ((cct) dff).a().booleanValue()) {
            a();
        }
    }

    public /* synthetic */ cck(byte b2) {
    }
}
