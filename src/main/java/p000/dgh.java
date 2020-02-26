package p000;

/* renamed from: dgh */
/* compiled from: PG */
final class dgh extends dga {
    private dgh() {
    }

    public /* synthetic */ dgh(byte b) {
    }

    /* renamed from: a */
    public final boolean mo4295a(dgn dgn, dge dge, dge dge2) {
        synchronized (dgn) {
            if (dgn.listeners != dge) {
                return false;
            }
            dgn.listeners = dge2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo4297a(dgn dgn, Object obj, Object obj2) {
        synchronized (dgn) {
            boolean z = dgn.f8507a;
            if (dgn.value != obj) {
                return false;
            }
            dgn.value = obj2;
            return true;
        }
    }

    /* renamed from: a */
    public final boolean mo4296a(dgn dgn, dgm dgm, dgm dgm2) {
        synchronized (dgn) {
            if (dgn.waiters != dgm) {
                return false;
            }
            dgn.waiters = dgm2;
            return true;
        }
    }

    /* renamed from: a */
    public final void mo4293a(dgm dgm, dgm dgm2) {
        dgm.next = dgm2;
    }

    /* renamed from: a */
    public final void mo4294a(dgm dgm, Thread thread) {
        dgm.thread = thread;
    }
}
