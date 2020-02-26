package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ahz  reason: default package */
/* compiled from: PG */
public class ahz {
    private final Map a = new LinkedHashMap(100, 0.75f, true);
    private final long b;
    private long c;

    public ahz(long j) {
        this.b = j;
    }

    /* access modifiers changed from: protected */
    public int a(Object obj) {
        return 1;
    }

    /* access modifiers changed from: protected */
    public void a(Object obj, Object obj2) {
    }

    public final synchronized long b() {
        return this.b;
    }

    public final void a() {
        a(0);
    }

    public final synchronized Object b(Object obj) {
        return this.a.get(obj);
    }

    public final synchronized Object b(Object obj, Object obj2) {
        long a2 = (long) a(obj2);
        if (a2 >= this.b) {
            a(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.c += a2;
        }
        Object put = this.a.put(obj, obj2);
        if (put != null) {
            this.c -= (long) a(put);
            if (!put.equals(obj2)) {
                a(obj, put);
            }
        }
        a(this.b);
        return put;
    }

    public final synchronized Object c(Object obj) {
        Object remove;
        remove = this.a.remove(obj);
        if (remove != null) {
            this.c -= (long) a(remove);
        }
        return remove;
    }

    public final synchronized void a(long j) {
        while (this.c > j) {
            Iterator it = this.a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.c -= (long) a(value);
            Object key = entry.getKey();
            it.remove();
            a(key, value);
        }
    }
}
