package p000;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* renamed from: cl */
/* compiled from: PG */
public class C0067cl extends C0087dd implements Map {

    /* renamed from: d */
    private C0081cy f5853d;

    public C0067cl() {
    }

    public C0067cl(int i) {
        super(i);
    }

    public final Set entrySet() {
        C0081cy a = m5024a();
        if (a.f7899a == null) {
            a.f7899a = new C0077cu(a);
        }
        return a.f7899a;
    }

    /* renamed from: a */
    private final C0081cy m5024a() {
        if (this.f5853d == null) {
            this.f5853d = new C0066ck(this);
        }
        return this.f5853d;
    }

    public final Set keySet() {
        return m5024a().mo3954d();
    }

    public final void putAll(Map map) {
        mo4136a(this.f8324c + map.size());
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    public final Collection values() {
        C0081cy a = m5024a();
        if (a.f7900b == null) {
            a.f7900b = new C0080cx(a);
        }
        return a.f7900b;
    }
}
