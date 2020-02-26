package p000;

import java.util.Collection;
import java.util.Iterator;

/* renamed from: cx */
/* compiled from: PG */
final class C0080cx implements Collection {

    /* renamed from: a */
    private final /* synthetic */ C0081cy f7813a;

    public C0080cx(C0081cy cyVar) {
        this.f7813a = cyVar;
    }

    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        this.f7813a.mo2962c();
    }

    public final boolean contains(Object obj) {
        return this.f7813a.mo2960b(obj) >= 0;
    }

    public final boolean containsAll(Collection collection) {
        for (Object contains : collection) {
            if (!contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        return this.f7813a.mo2954a() == 0;
    }

    public final Iterator iterator() {
        return new C0076ct(this.f7813a, 1);
    }

    public final boolean remove(Object obj) {
        int b = this.f7813a.mo2960b(obj);
        if (b < 0) {
            return false;
        }
        this.f7813a.mo2958a(b);
        return true;
    }

    public final boolean removeAll(Collection collection) {
        int a = this.f7813a.mo2954a();
        int i = 0;
        boolean z = false;
        while (i < a) {
            if (collection.contains(this.f7813a.mo2956a(i, 1))) {
                this.f7813a.mo2958a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final boolean retainAll(Collection collection) {
        int a = this.f7813a.mo2954a();
        int i = 0;
        boolean z = false;
        while (i < a) {
            if (!collection.contains(this.f7813a.mo2956a(i, 1))) {
                this.f7813a.mo2958a(i);
                i--;
                a--;
                z = true;
            }
            i++;
        }
        return z;
    }

    public final int size() {
        return this.f7813a.mo2954a();
    }

    public final Object[] toArray() {
        return this.f7813a.mo3953b(1);
    }

    public final Object[] toArray(Object[] objArr) {
        return this.f7813a.mo3952a(objArr, 1);
    }
}
