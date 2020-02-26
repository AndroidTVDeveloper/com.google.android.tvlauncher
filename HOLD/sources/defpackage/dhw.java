package defpackage;

import java.util.AbstractList;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: dhw  reason: default package */
/* compiled from: PG */
abstract class dhw extends AbstractList implements djk {
    public boolean a = true;

    public final boolean a() {
        return this.a;
    }

    public void add(int i, Object obj) {
        c();
        super.add(i, obj);
    }

    public boolean add(Object obj) {
        c();
        return super.add(obj);
    }

    public boolean addAll(int i, Collection collection) {
        c();
        return super.addAll(i, collection);
    }

    public boolean addAll(Collection collection) {
        c();
        return super.addAll(collection);
    }

    public void clear() {
        c();
        super.clear();
    }

    /* access modifiers changed from: protected */
    public final void c() {
        if (!this.a) {
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

    public final void b() {
        this.a = false;
    }

    public Object remove(int i) {
        c();
        return super.remove(i);
    }

    public boolean remove(Object obj) {
        c();
        return super.remove(obj);
    }

    public final boolean removeAll(Collection collection) {
        c();
        return super.removeAll(collection);
    }

    public final boolean retainAll(Collection collection) {
        c();
        return super.retainAll(collection);
    }

    public Object set(int i, Object obj) {
        c();
        return super.set(i, obj);
    }
}
