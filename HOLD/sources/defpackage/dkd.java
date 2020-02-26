package defpackage;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: dkd  reason: default package */
/* compiled from: PG */
public final class dkd extends LinkedHashMap {
    public static final dkd b;
    public boolean a = true;

    static {
        dkd dkd = new dkd();
        b = dkd;
        dkd.b();
    }

    private dkd() {
    }

    private dkd(Map map) {
        super(map);
    }

    private static int a(Object obj) {
        if (obj instanceof byte[]) {
            return djl.c((byte[]) obj);
        }
        if (!(obj instanceof djg)) {
            return obj.hashCode();
        }
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        c();
        super.clear();
    }

    public final void c() {
        if (!this.a) {
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
            i += a(entry.getValue()) ^ a(entry.getKey());
        }
        return i;
    }

    public final void b() {
        this.a = false;
    }

    public final dkd a() {
        return isEmpty() ? new dkd() : new dkd(this);
    }

    public final Object put(Object obj, Object obj2) {
        c();
        djl.a(obj);
        djl.a(obj2);
        return super.put(obj, obj2);
    }

    public final void putAll(Map map) {
        c();
        for (Object next : map.keySet()) {
            djl.a(next);
            djl.a(map.get(next));
        }
        super.putAll(map);
    }

    public final Object remove(Object obj) {
        c();
        return super.remove(obj);
    }
}
