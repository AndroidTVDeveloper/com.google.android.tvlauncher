package p000;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: ahz */
/* compiled from: PG */
public class ahz {

    /* renamed from: a */
    private final Map f390a = new LinkedHashMap(100, 0.75f, true);

    /* renamed from: b */
    private final long f391b;

    /* renamed from: c */
    private long f392c;

    public ahz(long j) {
        this.f391b = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo292a(Object obj) {
        return 1;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14a(Object obj, Object obj2) {
    }

    /* renamed from: b */
    public final synchronized long mo295b() {
        return this.f391b;
    }

    /* renamed from: a */
    public final void mo293a() {
        mo294a(0);
    }

    /* renamed from: b */
    public final synchronized Object mo296b(Object obj) {
        return this.f390a.get(obj);
    }

    /* renamed from: b */
    public final synchronized Object mo297b(Object obj, Object obj2) {
        long a = (long) mo292a(obj2);
        if (a >= this.f391b) {
            mo14a(obj, obj2);
            return null;
        }
        if (obj2 != null) {
            this.f392c += a;
        }
        Object put = this.f390a.put(obj, obj2);
        if (put != null) {
            this.f392c -= (long) mo292a(put);
            if (!put.equals(obj2)) {
                mo14a(obj, put);
            }
        }
        mo294a(this.f391b);
        return put;
    }

    /* renamed from: c */
    public final synchronized Object mo298c(Object obj) {
        Object remove;
        remove = this.f390a.remove(obj);
        if (remove != null) {
            this.f392c -= (long) mo292a(remove);
        }
        return remove;
    }

    /* renamed from: a */
    public final synchronized void mo294a(long j) {
        while (this.f392c > j) {
            Iterator it = this.f390a.entrySet().iterator();
            Map.Entry entry = (Map.Entry) it.next();
            Object value = entry.getValue();
            this.f392c -= (long) mo292a(value);
            Object key = entry.getKey();
            it.remove();
            mo14a(key, value);
        }
    }
}
