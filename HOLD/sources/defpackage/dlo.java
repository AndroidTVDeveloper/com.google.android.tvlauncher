package defpackage;

import java.util.Iterator;

/* renamed from: dlo  reason: default package */
/* compiled from: PG */
final class dlo implements Iterator {
    private final Iterator a = this.b.a.iterator();
    private final /* synthetic */ dlp b;

    public dlo(dlp dlp) {
        this.b = dlp;
    }

    public final boolean hasNext() {
        return this.a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
