package defpackage;

import java.util.NoSuchElementException;

/* renamed from: dfr  reason: default package */
/* compiled from: PG */
final class dfr extends dfv {
    private boolean a;
    private final /* synthetic */ Object b;

    public dfr(Object obj) {
        this.b = obj;
    }

    public final boolean hasNext() {
        return !this.a;
    }

    public final Object next() {
        if (!this.a) {
            this.a = true;
            return this.b;
        }
        throw new NoSuchElementException();
    }
}
