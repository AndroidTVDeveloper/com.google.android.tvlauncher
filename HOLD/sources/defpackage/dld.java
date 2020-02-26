package defpackage;

import java.util.Map;

/* renamed from: dld  reason: default package */
/* compiled from: PG */
final class dld implements Map.Entry, Comparable {
    public final Comparable a;
    public Object b;
    private final /* synthetic */ dlg c;

    public dld(dlg dlg, Comparable comparable, Object obj) {
        this.c = dlg;
        this.a = comparable;
        this.b = obj;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.a;
    }

    public final Object getValue() {
        return this.b;
    }

    public dld(dlg dlg, Map.Entry entry) {
        this(dlg, (Comparable) entry.getKey(), entry.getValue());
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((dld) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            return a(this.a, entry.getKey()) && a(this.b, entry.getValue());
        }
    }

    private static final boolean a(Object obj, Object obj2) {
        if (obj != null) {
            return obj.equals(obj2);
        }
        return obj2 == null;
    }

    public final int hashCode() {
        Comparable comparable = this.a;
        int i = 0;
        int hashCode = comparable != null ? comparable.hashCode() : 0;
        Object obj = this.b;
        if (obj != null) {
            i = obj.hashCode();
        }
        return hashCode ^ i;
    }

    public final Object setValue(Object obj) {
        this.c.d();
        Object obj2 = this.b;
        this.b = obj;
        return obj2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(valueOf2).length());
        sb.append(valueOf);
        sb.append("=");
        sb.append(valueOf2);
        return sb.toString();
    }
}
