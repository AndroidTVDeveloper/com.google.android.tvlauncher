package p000;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: dfw */
/* compiled from: PG */
public final class dfw extends dfv implements ListIterator {

    /* renamed from: a */
    private final int f8474a;

    /* renamed from: b */
    private int f8475b;

    /* renamed from: c */
    private final dfo f8476c;

    public final boolean hasNext() {
        return this.f8475b < this.f8474a;
    }

    public final boolean hasPrevious() {
        return this.f8475b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.f8475b;
            this.f8475b = i + 1;
            return m6342a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f8475b;
    }

    public final int previousIndex() {
        return this.f8475b - 1;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.f8475b - 1;
            this.f8475b = i;
            return m6342a(i);
        }
        throw new NoSuchElementException();
    }

    public dfw(dfo dfo, int i) {
        int size = dfo.size();
        dgx.m6409b(i, size);
        this.f8474a = size;
        this.f8475b = i;
        this.f8476c = dfo;
    }

    /* renamed from: a */
    private final Object m6342a(int i) {
        return this.f8476c.get(i);
    }

    protected dfw() {
    }

    @Deprecated
    public final void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
