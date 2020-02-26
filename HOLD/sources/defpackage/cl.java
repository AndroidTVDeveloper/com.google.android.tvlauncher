package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: cl  reason: default package */
/* compiled from: PG */
public class cl extends dd implements Map {
    private cy d;

    public cl() {
    }

    public cl(int i) {
        super(i);
    }

    public final Set entrySet() {
        cy a = a();
        if (a.a == null) {
            a.a = new cu(a);
        }
        return a.a;
    }

    private final cy a() {
        if (this.d == null) {
            this.d = new ck(this);
        }
        return this.d;
    }

    public final Set keySet() {
        return a().d();
    }

    public final void putAll(Map map) {
        a(this.c + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        cy a = a();
        if (a.b == null) {
            a.b = new cx(a);
        }
        return a.b;
    }
}
