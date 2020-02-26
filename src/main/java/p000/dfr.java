package p000;

import java.util.NoSuchElementException;

/* renamed from: dfr */
/* compiled from: PG */
final class dfr extends dfv {

    /* renamed from: a */
    private boolean f8461a;

    /* renamed from: b */
    private final /* synthetic */ Object f8462b;

    public dfr(Object obj) {
        this.f8462b = obj;
    }

    public final boolean hasNext() {
        return !this.f8461a;
    }

    public final Object next() {
        if (!this.f8461a) {
            this.f8461a = true;
            return this.f8462b;
        }
        throw new NoSuchElementException();
    }
}
