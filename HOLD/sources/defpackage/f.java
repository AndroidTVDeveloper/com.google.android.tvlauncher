package defpackage;

import java.util.Map;

/* renamed from: f  reason: default package */
/* compiled from: PG */
public final class f implements Map.Entry {
    public final Object a;
    public f b;
    public f c;
    private final Object d;

    public f(Object obj, Object obj2) {
        this.d = obj;
        this.a = obj2;
    }

    public final Object getKey() {
        return this.d;
    }

    public final Object getValue() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            return this.d.equals(fVar.d) && this.a.equals(fVar.a);
        }
    }

    public final int hashCode() {
        return this.d.hashCode() ^ this.a.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.d + "=" + this.a;
    }
}
