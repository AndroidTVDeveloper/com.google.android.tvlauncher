package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* renamed from: cw */
/* compiled from: PG */
final class C0079cw implements Iterator, Map.Entry {

    /* renamed from: a */
    private int f7719a;

    /* renamed from: b */
    private int f7720b;

    /* renamed from: c */
    private boolean f7721c = false;

    /* renamed from: d */
    private final /* synthetic */ C0081cy f7722d;

    public C0079cw(C0081cy cyVar) {
        this.f7722d = cyVar;
        this.f7719a = cyVar.mo2954a() - 1;
        this.f7720b = -1;
    }

    public final boolean hasNext() {
        return this.f7720b < this.f7719a;
    }

    public final boolean equals(Object obj) {
        if (this.f7721c) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                return C0073cq.m5507a(entry.getKey(), this.f7722d.mo2956a(this.f7720b, 0)) && C0073cq.m5507a(entry.getValue(), this.f7722d.mo2956a(this.f7720b, 1));
            }
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getKey() {
        if (this.f7721c) {
            return this.f7722d.mo2956a(this.f7720b, 0);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final Object getValue() {
        if (this.f7721c) {
            return this.f7722d.mo2956a(this.f7720b, 1);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final int hashCode() {
        if (this.f7721c) {
            int i = 0;
            Object a = this.f7722d.mo2956a(this.f7720b, 0);
            Object a2 = this.f7722d.mo2956a(this.f7720b, 1);
            int hashCode = a != null ? a.hashCode() : 0;
            if (a2 != null) {
                i = a2.hashCode();
            }
            return hashCode ^ i;
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (hasNext()) {
            this.f7720b++;
            this.f7721c = true;
            return this;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        if (this.f7721c) {
            this.f7722d.mo2958a(this.f7720b);
            this.f7720b--;
            this.f7719a--;
            this.f7721c = false;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object setValue(Object obj) {
        if (this.f7721c) {
            return this.f7722d.mo2957a(this.f7720b, obj);
        }
        throw new IllegalStateException("This container does not support retaining Map.Entry objects");
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
