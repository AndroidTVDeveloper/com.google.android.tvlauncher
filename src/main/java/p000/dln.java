package p000;

import java.util.ListIterator;

/* renamed from: dln */
/* compiled from: PG */
final class dln implements ListIterator {

    /* renamed from: a */
    private final ListIterator f8772a = this.f8774c.f8777a.listIterator(this.f8773b);

    /* renamed from: b */
    private final /* synthetic */ int f8773b;

    /* renamed from: c */
    private final /* synthetic */ dlp f8774c;

    public dln(dlp dlp, int i) {
        this.f8774c = dlp;
        this.f8773b = i;
    }

    public final /* bridge */ /* synthetic */ void add(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }

    public final boolean hasNext() {
        return this.f8772a.hasNext();
    }

    public final boolean hasPrevious() {
        return this.f8772a.hasPrevious();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return (String) this.f8772a.next();
    }

    public final int nextIndex() {
        return this.f8772a.nextIndex();
    }

    public final /* bridge */ /* synthetic */ Object previous() {
        return (String) this.f8772a.previous();
    }

    public final int previousIndex() {
        return this.f8772a.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* bridge */ /* synthetic */ void set(Object obj) {
        String str = (String) obj;
        throw new UnsupportedOperationException();
    }
}
