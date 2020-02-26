package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: cv  reason: default package */
/* compiled from: PG */
final class cv implements Set {
    private final /* synthetic */ cy a;

    public cv(cy cyVar) {
        this.a = cyVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(Object obj) {
        return this.a.a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.a.b();
        for (Object containsKey : collection) {
            if (!b.containsKey(containsKey)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cy.a(java.util.Set, java.lang.Object):boolean
     arg types: [cv, java.lang.Object]
     candidates:
      cy.a(int, int):java.lang.Object
      cy.a(int, java.lang.Object):java.lang.Object
      cy.a(java.lang.Object, java.lang.Object):void
      cy.a(java.lang.Object[], int):java.lang.Object[]
      cy.a(java.util.Set, java.lang.Object):boolean */
    public final boolean equals(Object obj) {
        return cy.a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a2 = this.a.a() - 1; a2 >= 0; a2--) {
            Object a3 = this.a.a(a2, 0);
            i += a3 != null ? a3.hashCode() : 0;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    public final Iterator iterator() {
        return new ct(this.a, 0);
    }

    public final boolean remove(Object obj) {
        int a2 = this.a.a(obj);
        if (a2 < 0) {
            return false;
        }
        this.a.a(a2);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        Map b = this.a.b();
        int size = b.size();
        for (Object remove : collection) {
            b.remove(remove);
        }
        return size != b.size();
    }

    public final boolean retainAll(Collection collection) {
        Map b = this.a.b();
        int size = b.size();
        Iterator it = b.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != b.size();
    }

    public final int size() {
        return this.a.a();
    }

    public final Object[] toArray() {
        return this.a.b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.a.a(objArr, 0);
    }
}
