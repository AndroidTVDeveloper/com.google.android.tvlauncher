package defpackage;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: dlg  reason: default package */
/* compiled from: PG */
class dlg extends AbstractMap {
    public List a = Collections.emptyList();
    public Map b = Collections.emptyMap();
    public boolean c;
    private final int d;
    private volatile dlf e;
    private Map f = Collections.emptyMap();

    public /* synthetic */ dlg(int i) {
        this.d = i;
    }

    private final int a(Comparable comparable) {
        int size = this.a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((dld) this.a.get(size)).a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((dld) this.a.get(i2)).a);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public final void d() {
        if (this.c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        d();
        if (!this.a.isEmpty()) {
            this.a.clear();
        }
        if (!this.b.isEmpty()) {
            this.b.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.b.containsKey(comparable);
    }

    public final Set entrySet() {
        if (this.e == null) {
            this.e = new dlf(this);
        }
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dlg)) {
            return super.equals(obj);
        }
        dlg dlg = (dlg) obj;
        int size = size();
        if (size != dlg.size()) {
            return false;
        }
        int b2 = b();
        if (b2 != dlg.b()) {
            return entrySet().equals(dlg.entrySet());
        }
        for (int i = 0; i < b2; i++) {
            if (!b(i).equals(dlg.b(i))) {
                return false;
            }
        }
        if (b2 != size) {
            return this.b.equals(dlg.b);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((dld) this.a.get(a2)).b;
        }
        return this.b.get(comparable);
    }

    public final Map.Entry b(int i) {
        return (Map.Entry) this.a.get(i);
    }

    public final int b() {
        return this.a.size();
    }

    public final Iterable c() {
        return !this.b.isEmpty() ? this.b.entrySet() : dlc.b;
    }

    private final SortedMap e() {
        d();
        if (this.b.isEmpty() && !(this.b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.b = treeMap;
            this.f = treeMap.descendingMap();
        }
        return (SortedMap) this.b;
    }

    public final int hashCode() {
        int b2 = b();
        int i = 0;
        for (int i2 = 0; i2 < b2; i2++) {
            i += ((dld) this.a.get(i2)).hashCode();
        }
        return this.b.size() > 0 ? i + this.b.hashCode() : i;
    }

    public void a() {
        Map map;
        Map map2;
        if (!this.c) {
            if (this.b.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.b);
            }
            this.b = map;
            if (this.f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f);
            }
            this.f = map2;
            this.c = true;
        }
    }

    static dlg a(int i) {
        return new dkz(i);
    }

    /* renamed from: a */
    public final Object put(Comparable comparable, Object obj) {
        d();
        int a2 = a(comparable);
        if (a2 >= 0) {
            return ((dld) this.a.get(a2)).setValue(obj);
        }
        d();
        if (this.a.isEmpty() && !(this.a instanceof ArrayList)) {
            this.a = new ArrayList(this.d);
        }
        int i = -(a2 + 1);
        if (i >= this.d) {
            return e().put(comparable, obj);
        }
        int size = this.a.size();
        int i2 = this.d;
        if (size == i2) {
            dld dld = (dld) this.a.remove(i2 - 1);
            e().put(dld.a, dld.b);
        }
        this.a.add(i, new dld(this, comparable, obj));
        return null;
    }

    public final Object remove(Object obj) {
        d();
        Comparable comparable = (Comparable) obj;
        int a2 = a(comparable);
        if (a2 >= 0) {
            return c(a2);
        }
        if (!this.b.isEmpty()) {
            return this.b.remove(comparable);
        }
        return null;
    }

    public final Object c(int i) {
        d();
        Object obj = ((dld) this.a.remove(i)).b;
        if (!this.b.isEmpty()) {
            Iterator it = e().entrySet().iterator();
            this.a.add(new dld(this, (Map.Entry) it.next()));
            it.remove();
        }
        return obj;
    }

    public final int size() {
        return this.a.size() + this.b.size();
    }
}
