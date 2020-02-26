package p000;

import java.util.Iterator;

/* renamed from: dlo */
/* compiled from: PG */
final class dlo implements Iterator {

    /* renamed from: a */
    private final Iterator f8775a = this.f8776b.f8777a.iterator();

    /* renamed from: b */
    private final /* synthetic */ dlp f8776b;

    public dlo(dlp dlp) {
        this.f8776b = dlp;
    }

    public final boolean hasNext() {
        return this.f8775a.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f8775a.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
