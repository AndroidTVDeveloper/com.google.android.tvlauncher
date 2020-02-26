package defpackage;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: dlf  reason: default package */
/* compiled from: PG */
final class dlf extends AbstractSet {
    private final /* synthetic */ dlg a;

    public /* synthetic */ dlf(dlg dlg) {
        this.a = dlg;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (contains(entry)) {
            return false;
        }
        this.a.put((Comparable) entry.getKey(), entry.getValue());
        return true;
    }

    public final void clear() {
        this.a.clear();
    }

    public final boolean contains(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        Object obj2 = this.a.get(entry.getKey());
        Object value = entry.getValue();
        if (obj2 != value) {
            return obj2 != null && obj2.equals(value);
        }
        return true;
    }

    public final Iterator iterator() {
        return new dle(this.a);
    }

    public final boolean remove(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        if (!contains(entry)) {
            return false;
        }
        this.a.remove(entry.getKey());
        return true;
    }

    public final int size() {
        return this.a.size();
    }
}
