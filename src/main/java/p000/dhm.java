package p000;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* renamed from: dhm */
/* compiled from: PG */
final class dhm extends WeakReference {

    /* renamed from: a */
    private final int f8532a;

    public dhm(Throwable th, ReferenceQueue referenceQueue) {
        super(th, referenceQueue);
        if (th != null) {
            this.f8532a = System.identityHashCode(th);
            return;
        }
        throw new NullPointerException("The referent cannot be null");
    }

    public final int hashCode() {
        return this.f8532a;
    }

    public final boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        dhm dhm = (dhm) obj;
        return this.f8532a == dhm.f8532a && get() == dhm.get();
    }
}
