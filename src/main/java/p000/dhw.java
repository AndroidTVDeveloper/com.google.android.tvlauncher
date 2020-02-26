package p000;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: dhw */
/* compiled from: PG */
abstract class dhw extends AbstractList implements djk {

    /* renamed from: a */
    public boolean f8564a = true;

    /* renamed from: a */
    public final boolean mo4374a() {
        return this.f8564a;
    }

    public void add(int i, Object obj) {
        mo4380c();
        super.add(i, obj);
    }

    public boolean add(Object obj) {
        mo4380c();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        mo4380c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        mo4380c();
        return super.addAll(collection);
    }

    public void clear() {
        mo4380c();
        super.clear();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo4380c() {
        if (!this.f8564a) {
            throw new UnsupportedOperationException();
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            if (!(obj instanceof RandomAccess)) {
                return super.equals(obj);
            }
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                for (int i = 0; i < size; i++) {
                    if (!get(i).equals(list.get(i))) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    /* renamed from: b */
    public final void mo4379b() {
        this.f8564a = false;
    }

    public Object remove(int i) {
        mo4380c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        mo4380c();
        return super.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        mo4380c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        mo4380c();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        mo4380c();
        return super.set(i, obj);
    }
}
