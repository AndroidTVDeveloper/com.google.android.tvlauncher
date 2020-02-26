package p000;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dhn */
/* compiled from: PG */
final class dhn {

    /* renamed from: a */
    private final ConcurrentHashMap f8533a = new ConcurrentHashMap(16, 0.75f, 10);

    /* renamed from: b */
    private final ReferenceQueue f8534b = new ReferenceQueue();

    /* renamed from: a */
    public final List mo4364a(Throwable th, boolean z) {
        ReferenceQueue referenceQueue = this.f8534b;
        while (true) {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.f8533a.remove(poll);
            referenceQueue = this.f8534b;
        }
        List list = (List) this.f8533a.get(new dhm(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.f8533a.putIfAbsent(new dhm(th, this.f8534b), vector);
        return list2 != null ? list2 : vector;
    }
}
