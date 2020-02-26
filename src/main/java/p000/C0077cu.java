package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: cu */
/* compiled from: PG */
final class C0077cu implements Set {

    /* renamed from: a */
    private final /* synthetic */ C0081cy f7507a;

    public C0077cu(C0081cy cyVar) {
        this.f7507a = cyVar;
    }

    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        int a = this.f7507a.mo2954a();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            this.f7507a.mo2959a(entry.getKey(), entry.getValue());
        }
        return a != this.f7507a.mo2954a();
    }

    public final void clear() {
        this.f7507a.mo2962c();
    }

    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int a = this.f7507a.mo2955a(entry.getKey());
            if (a >= 0) {
                return C0073cq.m5507a(this.f7507a.mo2956a(a, 1), entry.getValue());
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
        return C0081cy.m5956a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a = this.f7507a.mo2954a() - 1; a >= 0; a--) {
            Object a2 = this.f7507a.mo2956a(a, 0);
            Object a3 = this.f7507a.mo2956a(a, 1);
            i += (a2 != null ? a2.hashCode() : 0) ^ (a3 != null ? a3.hashCode() : 0);
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f7507a.mo2954a() == 0;
    }

    public final Iterator iterator() {
        return new C0079cw(this.f7507a);
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
        return this.f7507a.mo2954a();
    }

    public final Object[] toArray() {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray(Object[] objArr) {
        throw new UnsupportedOperationException();
    }
}
