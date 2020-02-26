package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: djq  reason: default package */
/* compiled from: PG */
final class djq implements Iterator {
    private final Iterator a;

    public djq(Iterator it) {
        this.a = it;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry entry = (Map.Entry) this.a.next();
        return entry.getValue() instanceof djr ? new djp(entry) : entry;
    }

    public final void remove() {
        this.a.remove();
    }
}
