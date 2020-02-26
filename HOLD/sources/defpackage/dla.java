package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dla  reason: default package */
/* compiled from: PG */
final class dla implements Iterator {
    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
