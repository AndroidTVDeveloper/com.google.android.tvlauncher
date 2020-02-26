package p000;

import java.lang.ref.ReferenceQueue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* renamed from: vf */
/* compiled from: PG */
public final class C0575vf {

    /* renamed from: a */
    public final ReferenceQueue f10571a = new ReferenceQueue();

    /* renamed from: b */
    public volatile boolean f10572b;

    /* renamed from: c */
    public volatile C0573vd f10573c;

    /* renamed from: d */
    private final Map f10574d = new HashMap();

    public C0575vf() {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor(new C0571vb());
        newSingleThreadExecutor.execute(new C0572vc(this));
    }

    /* renamed from: a */
    public final synchronized void mo6019a(C0534ts tsVar, C0611wo woVar) {
        C0574ve veVar = (C0574ve) this.f10574d.put(tsVar, new C0574ve(tsVar, woVar, this.f10571a));
        if (veVar != null) {
            veVar.clear();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo6020a(C0574ve veVar) {
        synchronized (this) {
            this.f10574d.remove(veVar.f10570a);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo6018a(C0534ts tsVar) {
        C0574ve veVar = (C0574ve) this.f10574d.remove(tsVar);
        if (veVar != null) {
            veVar.clear();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0017, code lost:
        return r0;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized p000.C0611wo mo6021b(p000.C0534ts r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            java.util.Map r0 = r1.f10574d     // Catch:{ all -> 0x001b }
            java.lang.Object r2 = r0.get(r2)     // Catch:{ all -> 0x001b }
            ve r2 = (p000.C0574ve) r2     // Catch:{ all -> 0x001b }
            if (r2 == 0) goto L_0x0018
            java.lang.Object r0 = r2.get()     // Catch:{ all -> 0x001b }
            wo r0 = (p000.C0611wo) r0     // Catch:{ all -> 0x001b }
            if (r0 != 0) goto L_0x0016
            r1.mo6020a(r2)     // Catch:{ all -> 0x001b }
        L_0x0016:
            monitor-exit(r1)
            return r0
        L_0x0018:
            r2 = 0
            monitor-exit(r1)
            return r2
        L_0x001b:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.C0575vf.mo6021b(ts):wo");
    }
}
