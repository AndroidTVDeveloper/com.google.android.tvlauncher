package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: dic */
/* compiled from: PG */
final class dic implements Iterator {

    /* renamed from: a */
    private int f8574a;

    /* renamed from: b */
    private final int f8575b;

    /* renamed from: c */
    private final /* synthetic */ dik f8576c;

    public dic(dik dik) {
        this.f8576c = dik;
        this.f8574a = 0;
        this.f8575b = this.f8576c.mo4408a();
    }

    public final boolean hasNext() {
        return this.f8574a < this.f8575b;
    }

    dic() {
    }

    public final /* bridge */ /* synthetic */ Object next() {
        int i = this.f8574a;
        if (i < this.f8575b) {
            this.f8574a = i + 1;
            return Byte.valueOf(this.f8576c.mo4409b(i));
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
