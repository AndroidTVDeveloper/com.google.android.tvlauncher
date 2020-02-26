package defpackage;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i  reason: default package */
/* compiled from: PG */
public class i implements Iterable {
    public f b;
    public f c;
    public final WeakHashMap d = new WeakHashMap();
    public int e = 0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof i) {
            i iVar = (i) obj;
            if (this.e == iVar.e) {
                Iterator it = iterator();
                Iterator it2 = iVar.iterator();
                while (it.hasNext() && it2.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    Object next = it2.next();
                    if ((entry == null && next != null) || (entry != null && !entry.equals(next))) {
                        return false;
                    }
                }
                return !it.hasNext() && !it2.hasNext();
            }
        }
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((Map.Entry) it.next()).hashCode();
        }
        return i;
    }

    public final Iterator iterator() {
        d dVar = new d(this.b, this.c);
        this.d.put(dVar, false);
        return dVar;
    }

    public final g a() {
        g gVar = new g(this);
        this.d.put(gVar, false);
        return gVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        Iterator it = iterator();
        while (it.hasNext()) {
            sb.append(((Map.Entry) it.next()).toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
