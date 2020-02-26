package p000;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: cv */
/* compiled from: PG */
final class C0078cv implements Set {

    /* renamed from: a */
    private final /* synthetic */ C0081cy f7616a;

    public C0078cv(C0081cy cyVar) {
        this.f7616a = cyVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f7616a.mo2962c();
    }

    public final boolean contains(Object obj) {
        return this.f7616a.mo2955a(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        Map b = this.f7616a.mo2961b();
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
        return C0081cy.m5956a((Set) this, obj);
    }

    public final int hashCode() {
        int i = 0;
        for (int a = this.f7616a.mo2954a() - 1; a >= 0; a--) {
            Object a2 = this.f7616a.mo2956a(a, 0);
            i += a2 != null ? a2.hashCode() : 0;
        }
        return i;
    }

    public final boolean isEmpty() {
        return this.f7616a.mo2954a() == 0;
    }

    public final Iterator iterator() {
        return new C0076ct(this.f7616a, 0);
    }

    public final boolean remove(Object obj) {
        int a = this.f7616a.mo2955a(obj);
        if (a < 0) {
            return false;
        }
        this.f7616a.mo2958a(a);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        Map b = this.f7616a.mo2961b();
        int size = b.size();
        for (Object remove : collection) {
            b.remove(remove);
        }
        return size != b.size();
    }

    public final boolean retainAll(Collection collection) {
        Map b = this.f7616a.mo2961b();
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
        return this.f7616a.mo2954a();
    }

    public final Object[] toArray() {
        return this.f7616a.mo3953b(0);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f7616a.mo3952a(objArr, 0);
    }
}
