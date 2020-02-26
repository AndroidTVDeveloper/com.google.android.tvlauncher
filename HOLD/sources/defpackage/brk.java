package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: brk  reason: default package */
/* compiled from: PG */
public final class brk {
    private final WeakReference a;

    public brk(bqt bqt) {
        this.a = new WeakReference(bqt);
    }

    public final void a() {
        bqt bqt = (bqt) this.a.get();
        if (bqt != null) {
            bqt.e();
        }
    }

    public brk() {
    }
}
