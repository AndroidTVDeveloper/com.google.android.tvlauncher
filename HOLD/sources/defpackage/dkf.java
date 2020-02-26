package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: dkf  reason: default package */
/* compiled from: PG */
final class dkf implements dke {
    public final Map b(Object obj) {
        return (dkd) obj;
    }

    public final void e(Object obj) {
        dkc dkc = (dkc) obj;
        throw null;
    }

    public final Map a(Object obj) {
        return (dkd) obj;
    }

    public final int b(Object obj, Object obj2) {
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

    public final boolean c(Object obj) {
        return !((dkd) obj).a;
    }

    public final Object a(Object obj, Object obj2) {
        dkd dkd = (dkd) obj;
        dkd dkd2 = (dkd) obj2;
        if (!dkd2.isEmpty()) {
            if (!dkd.a) {
                dkd = dkd.a();
            }
            dkd.c();
            if (!dkd2.isEmpty()) {
                dkd.putAll(dkd2);
            }
        }
        return dkd;
    }

    public final Object a() {
        return dkd.b.a();
    }

    public final Object d(Object obj) {
        ((dkd) obj).b();
        return obj;
    }
}
