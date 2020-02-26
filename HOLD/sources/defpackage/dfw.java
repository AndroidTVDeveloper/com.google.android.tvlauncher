package defpackage;

import java.util.ListIterator;
import java.util.NoSuchElementException;

/* renamed from: dfw  reason: default package */
/* compiled from: PG */
public final class dfw extends dfv implements ListIterator {
    private final int a;
    private int b;
    private final dfo c;

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final boolean hasPrevious() {
        return this.b > 0;
    }

    public final Object next() {
        if (hasNext()) {
            int i = this.b;
            this.b = i + 1;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.b;
    }

    public final int previousIndex() {
        return this.b - 1;
    }

    public final Object previous() {
        if (hasPrevious()) {
            int i = this.b - 1;
            this.b = i;
            return a(i);
        }
        throw new NoSuchElementException();
    }

    public dfw(dfo dfo, int i) {
        int size = dfo.size();
        dgx.b(i, size);
        this.a = size;
        this.b = i;
        this.c = dfo;
    }

    private final Object a(int i) {
        return this.c.get(i);
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
