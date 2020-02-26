package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: djv  reason: default package */
/* compiled from: PG */
final class djv extends djx {
    private static final Class c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private djv() {
    }

    public /* synthetic */ djv(byte b) {
    }

    private static List b(Object obj, long j) {
        return (List) dlv.f(obj, j);
    }

    public final void a(Object obj, long j) {
        Object obj2;
        List list = (List) dlv.f(obj, j);
        if (list instanceof dju) {
            obj2 = ((dju) list).e();
        } else if (c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof dks) || !(list instanceof djk)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                djk djk = (djk) list;
                if (djk.a()) {
                    djk.b();
                    return;
                }
                return;
            }
        }
        dlv.a(obj, j, obj2);
    }

    public final void a(Object obj, Object obj2, long j) {
        List b = b(obj2, j);
        int size = b.size();
        List b2 = b(obj, j);
        if (b2.isEmpty()) {
            if (b2 instanceof dju) {
                b2 = new djt(size);
            } else if (!(b2 instanceof dks) || !(b2 instanceof djk)) {
                b2 = new ArrayList(size);
            } else {
                b2 = ((djk) b2).a(size);
            }
            dlv.a(obj, j, b2);
        } else if (c.isAssignableFrom(b2.getClass())) {
            ArrayList arrayList = new ArrayList(b2.size() + size);
            arrayList.addAll(b2);
            dlv.a(obj, j, arrayList);
            b2 = arrayList;
        } else if (b2 instanceof dlp) {
            djt djt = new djt(b2.size() + size);
            djt.addAll((dlp) b2);
            dlv.a(obj, j, djt);
            b2 = djt;
        } else if ((b2 instanceof dks) && (b2 instanceof djk)) {
            djk djk = (djk) b2;
            if (!djk.a()) {
                djk a = djk.a(b2.size() + size);
                dlv.a(obj, j, a);
                b2 = a;
            }
        }
        int size2 = b2.size();
        int size3 = b.size();
        if (size2 > 0 && size3 > 0) {
            b2.addAll(b);
        }
        if (size2 > 0) {
            b = b2;
        }
        dlv.a(obj, j, b);
    }
}
