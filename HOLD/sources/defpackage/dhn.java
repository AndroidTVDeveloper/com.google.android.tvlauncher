package defpackage;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.List;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: dhn  reason: default package */
/* compiled from: PG */
final class dhn {
    private final ConcurrentHashMap a = new ConcurrentHashMap(16, 0.75f, 10);
    private final ReferenceQueue b = new ReferenceQueue();

    public final List a(Throwable th, boolean z) {
        ReferenceQueue referenceQueue = this.b;
        while (true) {
            Reference poll = referenceQueue.poll();
            if (poll == null) {
                break;
            }
            this.a.remove(poll);
            referenceQueue = this.b;
        }
        List list = (List) this.a.get(new dhm(th, null));
        if (!z || list != null) {
            return list;
        }
        Vector vector = new Vector(2);
        List list2 = (List) this.a.putIfAbsent(new dhm(th, this.b), vector);
        return list2 != null ? list2 : vector;
    }
}
