package defpackage;

import java.util.Map;

/* renamed from: djp  reason: default package */
/* compiled from: PG */
final class djp implements Map.Entry {
    public final Map.Entry a;

    public /* synthetic */ djp(Map.Entry entry) {
        this.a = entry;
    }

    public final Object getKey() {
        return this.a.getKey();
    }

    public final Object getValue() {
        if (((djr) this.a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof dkk) {
            djr djr = (djr) this.a.getValue();
            dkk dkk = djr.a;
            djr.b = null;
            djr.a = (dkk) obj;
            return dkk;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
