package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: dkd */
/* compiled from: PG */
public final class dkd extends LinkedHashMap {

    /* renamed from: b */
    public static final dkd f8709b;

    /* renamed from: a */
    public boolean f8710a = true;

    static {
        dkd dkd = new dkd();
        f8709b = dkd;
        dkd.mo4554b();
    }

    private dkd() {
    }

    private dkd(Map map) {
        super(map);
    }

    /* renamed from: a */
    private static int m6776a(Object obj) {
        if (obj instanceof byte[]) {
            return djl.m6730c((byte[]) obj);
        }
        if (!(obj instanceof djg)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        mo4555c();
        super.clear();
    }

    /* renamed from: c */
    public final void mo4555c() {
        if (!this.f8710a) {
            throw new UnsupportedOperationException();
        }
    }

    public final Set entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    public final boolean equals(Object obj) {
        boolean z;
        if (!(obj instanceof Map)) {
            return false;
        }
        Map map = (Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(value instanceof byte[]) || !(obj2 instanceof byte[])) {
                z = value.equals(obj2);
                continue;
            } else {
                z = Arrays.equals((byte[]) value, (byte[]) obj2);
                continue;
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i = 0;
        for (Map.Entry entry : entrySet()) {
            i += m6776a(entry.getValue()) ^ m6776a(entry.getKey());
        }
        return i;
    }

    /* renamed from: b */
    public final void mo4554b() {
        this.f8710a = false;
    }

    /* renamed from: a */
    public final dkd mo4553a() {
        return isEmpty() ? new dkd() : new dkd(this);
    }

    public final Object put(Object obj, Object obj2) {
        mo4555c();
        djl.m6727a(obj);
        djl.m6727a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        mo4555c();
        for (Object next : map.keySet()) {
            djl.m6727a(next);
            djl.m6727a(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        mo4555c();
        return super.remove(obj);
    }
}
