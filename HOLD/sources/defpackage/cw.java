package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: cw  reason: default package */
/* compiled from: PG */
final class cw implements Iterator, Map.Entry {
    private int a;
    private int b;
    private boolean c = false;
    private final /* synthetic */ cy d;

    public cw(cy cyVar) {
        this.d = cyVar;
        this.a = cyVar.a() - 1;
        this.b = -1;
    }

    public final boolean hasNext() {
        return this.b < this.a;
    }

    public final boolean equals(Object obj) {
        if (this.c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return cq.a(entry.getKey(), this.d.a(this.b, 0)) && cq.a(entry.getValue(), this.d.a(this.b, 1));
            }
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getKey() {
        if (this.c) {
            return this.d.a(this.b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.c) {
            return this.d.a(this.b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final int hashCode() {
        if (this.c) {
            int i = 0;
            Object a2 = this.d.a(this.b, 0);
            Object a3 = this.d.a(this.b, 1);
            int hashCode = a2 != null ? a2.hashCode() : 0;
            if (a3 != null) {
                i = a3.hashCode();
            }
            return hashCode ^ i;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.b++;
            this.c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.c) {
            this.d.a(this.b);
            this.b--;
            this.a--;
            this.c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.c) {
            return this.d.a(this.b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
