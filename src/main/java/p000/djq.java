package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: djq */
/* compiled from: PG */
final class djq implements Iterator {

    /* renamed from: a */
    private final Iterator f8696a;

    public djq(Iterator it) {
        this.f8696a = it;
    }

    public final boolean hasNext() {
        return this.f8696a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.f8696a.next();
        return entry.getValue() instanceof djr ? new djp(entry) : entry;
    }

    public final void remove() {
        this.f8696a.remove();
    }
}
