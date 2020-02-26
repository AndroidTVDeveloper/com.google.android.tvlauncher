package p000;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: dlf */
/* compiled from: PG */
final class dlf extends AbstractSet {

    /* renamed from: a */
    private final /* synthetic */ dlg f8758a;

    public /* synthetic */ dlf(dlg dlg) {
        this.f8758a = dlg;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.f8758a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.f8758a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.f8758a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public final Iterator iterator() {
        return new dle(this.f8758a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.f8758a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.f8758a.size();
    }
}
