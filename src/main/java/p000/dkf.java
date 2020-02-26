package p000;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dkf */
/* compiled from: PG */
final class dkf implements dke {
    /* renamed from: b */
    public final Map mo4567b(Object obj) {
        return (dkd) obj;
    }

    /* renamed from: e */
    public final void mo4570e(Object obj) {
        dkc dkc = (dkc) obj;
        throw null;
    }

    /* renamed from: a */
    public final Map mo4565a(Object obj) {
        return (dkd) obj;
    }

    /* renamed from: b */
    public final int mo4566b(Object obj, Object obj2) {
        dkd dkd = (dkd) obj;
        dkc dkc = (dkc) obj2;
        if (dkd.isEmpty()) {
            return 0;
        }
        Iterator it = dkd.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    /* renamed from: c */
    public final boolean mo4568c(Object obj) {
        return !((dkd) obj).f8710a;
    }

    /* renamed from: a */
    public final Object mo4564a(Object obj, Object obj2) {
        dkd dkd = (dkd) obj;
        dkd dkd2 = (dkd) obj2;
        if (!dkd2.isEmpty()) {
            if (!dkd.f8710a) {
                dkd = dkd.mo4553a();
            }
            dkd.mo4555c();
            if (!dkd2.isEmpty()) {
                dkd.putAll(dkd2);
            }
        }
        return dkd;
    }

    /* renamed from: a */
    public final Object mo4563a() {
        return dkd.f8709b.mo4553a();
    }

    /* renamed from: d */
    public final Object mo4569d(Object obj) {
        ((dkd) obj).mo4554b();
        return obj;
    }
}
