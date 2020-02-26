package p000;

import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: i */
/* compiled from: PG */
public class C0218i implements Iterable {

    /* renamed from: b */
    public C0137f f9533b;

    /* renamed from: c */
    public C0137f f9534c;

    /* renamed from: d */
    public final WeakHashMap f9535d = new WeakHashMap();

    /* renamed from: e */
    public int f9536e = 0;

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0218i) {
            C0218i iVar = (C0218i) obj;
            if (this.f9536e == iVar.f9536e) {
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
        C0083d dVar = new C0083d(this.f9533b, this.f9534c);
        this.f9535d.put(dVar, false);
        return dVar;
    }

    /* renamed from: a */
    public final C0164g mo5225a() {
        C0164g gVar = new C0164g(this);
        this.f9535d.put(gVar, false);
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
