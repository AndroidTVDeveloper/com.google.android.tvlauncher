package defpackage;

/* renamed from: dgh  reason: default package */
/* compiled from: PG */
final class dgh extends dga {
    private dgh() {
    }

    public /* synthetic */ dgh(byte b) {
    }

    public final boolean a(dgn dgn, dge dge, dge dge2) {
        synchronized (dgn) {
            if (dgn.listeners != dge) {
                return false;
            }
            dgn.listeners = dge2;
            return true;
        }
    }

    public final boolean a(dgn dgn, Object obj, Object obj2) {
        synchronized (dgn) {
            boolean z = dgn.a;
            if (dgn.value != obj) {
                return false;
            }
            dgn.value = obj2;
            return true;
        }
    }

    public final boolean a(dgn dgn, dgm dgm, dgm dgm2) {
        synchronized (dgn) {
            if (dgn.waiters != dgm) {
                return false;
            }
            dgn.waiters = dgm2;
            return true;
        }
    }

    public final void a(dgm dgm, dgm dgm2) {
        dgm.next = dgm2;
    }

    public final void a(dgm dgm, Thread thread) {
        dgm.thread = thread;
    }
}
