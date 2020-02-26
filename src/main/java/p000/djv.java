package p000;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: djv */
/* compiled from: PG */
final class djv extends djx {

    /* renamed from: c */
    private static final Class f8700c = Collections.unmodifiableList(Collections.emptyList()).getClass();

    private djv() {
    }

    public /* synthetic */ djv(byte b) {
    }

    /* renamed from: b */
    private static List m6750b(Object obj, long j) {
        return (List) dlv.m7045f(obj, j);
    }

    /* renamed from: a */
    public final void mo4547a(Object obj, long j) {
        Object obj2;
        List list = (List) dlv.m7045f(obj, j);
        if (list instanceof dju) {
            obj2 = ((dju) list).mo4544e();
        } else if (f8700c.isAssignableFrom(list.getClass())) {
            return;
        } else {
            if (!(list instanceof dks) || !(list instanceof djk)) {
                obj2 = Collections.unmodifiableList(list);
            } else {
                djk djk = (djk) list;
                if (djk.mo4374a()) {
                    djk.mo4379b();
                    return;
                }
                return;
            }
        }
        dlv.m7033a(obj, j, obj2);
    }

    /* renamed from: a */
    public final void mo4548a(Object obj, Object obj2, long j) {
        List b = m6750b(obj2, j);
        int size = b.size();
        List b2 = m6750b(obj, j);
        if (b2.isEmpty()) {
            if (b2 instanceof dju) {
                b2 = new djt(size);
            } else if (!(b2 instanceof dks) || !(b2 instanceof djk)) {
                b2 = new ArrayList(size);
            } else {
                b2 = ((djk) b2).mo4398a(size);
            }
            dlv.m7033a(obj, j, b2);
        } else if (f8700c.isAssignableFrom(b2.getClass())) {
            ArrayList arrayList = new ArrayList(b2.size() + size);
            arrayList.addAll(b2);
            dlv.m7033a(obj, j, arrayList);
            b2 = arrayList;
        } else if (b2 instanceof dlp) {
            djt djt = new djt(b2.size() + size);
            djt.addAll((dlp) b2);
            dlv.m7033a(obj, j, djt);
            b2 = djt;
        } else if ((b2 instanceof dks) && (b2 instanceof djk)) {
            djk djk = (djk) b2;
            if (!djk.mo4374a()) {
                djk a = djk.mo4398a(b2.size() + size);
                dlv.m7033a(obj, j, a);
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
        dlv.m7033a(obj, j, b);
    }
}
