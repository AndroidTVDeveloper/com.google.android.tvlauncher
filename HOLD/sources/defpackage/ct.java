package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ct  reason: default package */
/* compiled from: PG */
final class ct implements Iterator {
    private final int a;
    private int b;
    private int c;
    private boolean d = false;
    private final /* synthetic */ cy e;

    public ct(cy cyVar, int i) {
        this.e = cyVar;
        this.a = i;
        this.b = cyVar.a();
    }

    public final boolean hasNext() {
        return this.c < this.b;
    }

    public final Object next() {
        if (hasNext()) {
            Object a2 = this.e.a(this.c, this.a);
            this.c++;
            this.d = true;
            return a2;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.d) {
            int i = this.c - 1;
            this.c = i;
            this.b--;
            this.d = false;
            this.e.a(i);
            return;
        }
        throw new IllegalStateException();
    }
}
