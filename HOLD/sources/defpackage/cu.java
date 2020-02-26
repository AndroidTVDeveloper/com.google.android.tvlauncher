package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: cu  reason: default package */
/* compiled from: PG */
final class cu implements Set {
    private final /* synthetic */ cy a;

    public cu(cy cyVar) {
        this.a = cyVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        int a2 = this.a.a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.a.a(entry.getKey(), entry.getValue());
        }
        return a2 != this.a.a();
    }

    public final void clear() {
        this.a.c();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int a2 = this.a.a(entry.getKey());
            if (a2 >= 0) {
                return cq.a(this.a.a(a2, 1), entry.getValue());
            }
        }
        return false;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: cy.a(java.util.Set, java.lang.Object):boolean
     arg types: [cu, java.lang.Object]
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
            Object a4 = this.a.a(a2, 1);
            i += (a3 != null ? a3.hashCode() : 0) ^ (a4 != null ? a4.hashCode() : 0);
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.a.a() == 0;
    }

    public final Iterator iterator() {
        return new cw(this.a);
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final int size() {
        return this.a.a();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
