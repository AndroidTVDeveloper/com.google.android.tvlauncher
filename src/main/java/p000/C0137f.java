package p000;

import java.util.Map;

/* renamed from: f */
/* compiled from: PG */
public final class C0137f implements Map.Entry {

    /* renamed from: a */
    public final Object f9195a;

    /* renamed from: b */
    public C0137f f9196b;

    /* renamed from: c */
    public C0137f f9197c;

    /* renamed from: d */
    private final Object f9198d;

    public C0137f(Object obj, Object obj2) {
        this.f9198d = obj;
        this.f9195a = obj2;
    }

    public final Object getKey() {
        return this.f9198d;
    }

    public final Object getValue() {
        return this.f9195a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0137f) {
            C0137f fVar = (C0137f) obj;
            return this.f9198d.equals(fVar.f9198d) && this.f9195a.equals(fVar.f9195a);
        }
    }

    public final int hashCode() {
        return this.f9198d.hashCode() ^ this.f9195a.hashCode();
    }

    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.f9198d + "=" + this.f9195a;
    }
}
