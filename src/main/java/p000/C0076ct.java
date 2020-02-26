package p000;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: ct */
/* compiled from: PG */
final class C0076ct implements Iterator {

    /* renamed from: a */
    private final int f7324a;

    /* renamed from: b */
    private int f7325b;

    /* renamed from: c */
    private int f7326c;

    /* renamed from: d */
    private boolean f7327d = false;

    /* renamed from: e */
    private final /* synthetic */ C0081cy f7328e;

    public C0076ct(C0081cy cyVar, int i) {
        this.f7328e = cyVar;
        this.f7324a = i;
        this.f7325b = cyVar.mo2954a();
    }

    public final boolean hasNext() {
        return this.f7326c < this.f7325b;
    }

    public final Object next() {
        if (hasNext()) {
            Object a = this.f7328e.mo2956a(this.f7326c, this.f7324a);
            this.f7326c++;
            this.f7327d = true;
            return a;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f7327d) {
            int i = this.f7326c - 1;
            this.f7326c = i;
            this.f7325b--;
            this.f7327d = false;
            this.f7328e.mo2958a(i);
            return;
        }
        throw new IllegalStateException();
    }
}
