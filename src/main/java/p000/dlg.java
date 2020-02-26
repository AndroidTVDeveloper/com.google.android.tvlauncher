package p000;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* renamed from: dlg */
/* compiled from: PG */
class dlg extends AbstractMap {

    /* renamed from: a */
    public List f8759a = Collections.emptyList();

    /* renamed from: b */
    public Map f8760b = Collections.emptyMap();

    /* renamed from: c */
    public boolean f8761c;

    /* renamed from: d */
    private final int f8762d;

    /* renamed from: e */
    private volatile dlf f8763e;

    /* renamed from: f */
    private Map f8764f = Collections.emptyMap();

    public /* synthetic */ dlg(int i) {
        this.f8762d = i;
    }

    /* renamed from: a */
    private final int m6948a(Comparable comparable) {
        int size = this.f8759a.size() - 1;
        int i = 0;
        if (size >= 0) {
            int compareTo = comparable.compareTo(((dld) this.f8759a.get(size)).f8751a);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = comparable.compareTo(((dld) this.f8759a.get(i2)).f8751a);
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

    /* renamed from: d */
    public final void mo4618d() {
        if (this.f8761c) {
            throw new UnsupportedOperationException();
        }
    }

    public final void clear() {
        mo4618d();
        if (!this.f8759a.isEmpty()) {
            this.f8759a.clear();
        }
        if (!this.f8760b.isEmpty()) {
            this.f8760b.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m6948a(comparable) >= 0 || this.f8760b.containsKey(comparable);
    }

    public final Set entrySet() {
        if (this.f8763e == null) {
            this.f8763e = new dlf(this);
        }
        return this.f8763e;
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
        int b = mo4612b();
        if (b != dlg.mo4612b()) {
            return entrySet().equals(dlg.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo4613b(i).equals(dlg.mo4613b(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f8760b.equals(dlg.f8760b);
        }
        return true;
    }

    public final Object get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m6948a(comparable);
        if (a >= 0) {
            return ((dld) this.f8759a.get(a)).f8752b;
        }
        return this.f8760b.get(comparable);
    }

    /* renamed from: b */
    public final Map.Entry mo4613b(int i) {
        return (Map.Entry) this.f8759a.get(i);
    }

    /* renamed from: b */
    public final int mo4612b() {
        return this.f8759a.size();
    }

    /* renamed from: c */
    public final Iterable mo4614c() {
        return !this.f8760b.isEmpty() ? this.f8760b.entrySet() : dlc.f8750b;
    }

    /* renamed from: e */
    private final SortedMap m6950e() {
        mo4618d();
        if (this.f8760b.isEmpty() && !(this.f8760b instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f8760b = treeMap;
            this.f8764f = treeMap.descendingMap();
        }
        return (SortedMap) this.f8760b;
    }

    public final int hashCode() {
        int b = mo4612b();
        int i = 0;
        for (int i2 = 0; i2 < b; i2++) {
            i += ((dld) this.f8759a.get(i2)).hashCode();
        }
        return this.f8760b.size() > 0 ? i + this.f8760b.hashCode() : i;
    }

    /* renamed from: a */
    public void mo4590a() {
        Map map;
        Map map2;
        if (!this.f8761c) {
            if (this.f8760b.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f8760b);
            }
            this.f8760b = map;
            if (this.f8764f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f8764f);
            }
            this.f8764f = map2;
            this.f8761c = true;
        }
    }

    /* renamed from: a */
    static dlg m6949a(int i) {
        return new dkz(i);
    }

    /* renamed from: a */
    public final Object put(Comparable comparable, Object obj) {
        mo4618d();
        int a = m6948a(comparable);
        if (a >= 0) {
            return ((dld) this.f8759a.get(a)).setValue(obj);
        }
        mo4618d();
        if (this.f8759a.isEmpty() && !(this.f8759a instanceof ArrayList)) {
            this.f8759a = new ArrayList(this.f8762d);
        }
        int i = -(a + 1);
        if (i >= this.f8762d) {
            return m6950e().put(comparable, obj);
        }
        int size = this.f8759a.size();
        int i2 = this.f8762d;
        if (size == i2) {
            dld dld = (dld) this.f8759a.remove(i2 - 1);
            m6950e().put(dld.f8751a, dld.f8752b);
        }
        this.f8759a.add(i, new dld(this, comparable, obj));
        return null;
    }

    public final Object remove(Object obj) {
        mo4618d();
        Comparable comparable = (Comparable) obj;
        int a = m6948a(comparable);
        if (a >= 0) {
            return mo4615c(a);
        }
        if (!this.f8760b.isEmpty()) {
            return this.f8760b.remove(comparable);
        }
        return null;
    }

    /* renamed from: c */
    public final Object mo4615c(int i) {
        mo4618d();
        Object obj = ((dld) this.f8759a.remove(i)).f8752b;
        if (!this.f8760b.isEmpty()) {
            Iterator it = m6950e().entrySet().iterator();
            this.f8759a.add(new dld(this, (Map.Entry) it.next()));
            it.remove();
        }
        return obj;
    }

    public final int size() {
        return this.f8759a.size() + this.f8760b.size();
    }
}
