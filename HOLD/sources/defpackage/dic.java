package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dic  reason: default package */
/* compiled from: PG */
final class dic implements Iterator {
    private int a;
    private final int b;
    private final /* synthetic */ dik c;

    public dic(dik dik) {
        this.c = dik;
        this.a = 0;
        this.b = this.c.a();
    }

    public final boolean hasNext() {
        return this.a < this.b;
    }

    dic() {
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.a;
        if (i < this.b) {
            this.a = i + 1;
            return Byte.valueOf(this.c.b(i));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
