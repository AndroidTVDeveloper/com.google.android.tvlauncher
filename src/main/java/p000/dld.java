package p000;

import java.util.Map;

/* renamed from: dld */
/* compiled from: PG */
final class dld implements Map.Entry, Comparable {

    /* renamed from: a */
    public final Comparable f8751a;

    /* renamed from: b */
    public Object f8752b;

    /* renamed from: c */
    private final /* synthetic */ dlg f8753c;

    public dld(dlg dlg, Comparable comparable, Object obj) {
        this.f8753c = dlg;
        this.f8751a = comparable;
        this.f8752b = obj;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.f8751a;
    }

    public final Object getValue() {
        return this.f8752b;
    }

    public dld(dlg dlg, Map.Entry entry) {
        this(dlg, (Comparable) entry.getKey(), entry.getValue());
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.f8751a.compareTo(((dld) obj).f8751a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return m6946a(this.f8751a, entry.getKey()) && m6946a(this.f8752b, entry.getValue());
        }
    }

    /* renamed from: a */
    private static final boolean m6946a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        Comparable comparable = this.f8751a;
        int i = 0;
        int hashCode = comparable != null ? comparable.hashCode() : 0;
        Object obj = this.f8752b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.f8753c.mo4618d();
        Object obj2 = this.f8752b;
        this.f8752b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f8751a);
        String valueOf2 = String.valueOf(this.f8752b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
