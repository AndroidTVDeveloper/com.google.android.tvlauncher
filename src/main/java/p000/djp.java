package p000;

import java.util.Map;

/* renamed from: djp */
/* compiled from: PG */
final class djp implements Map.Entry {

    /* renamed from: a */
    public final Map.Entry f8695a;

    public /* synthetic */ djp(Map.Entry entry) {
        this.f8695a = entry;
    }

    public final Object getKey() {
        return this.f8695a.getKey();
    }

    public final Object getValue() {
        if (((djr) this.f8695a.getValue()) == null) {
            return null;
        }
        throw null;
    }

    public final Object setValue(Object obj) {
        if (obj instanceof dkk) {
            djr djr = (djr) this.f8695a.getValue();
            dkk dkk = djr.f8697a;
            djr.f8698b = null;
            djr.f8697a = (dkk) obj;
            return dkk;
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}
