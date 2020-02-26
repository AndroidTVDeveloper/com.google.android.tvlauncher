package p000;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: dht */
/* compiled from: PG */
public abstract class dht implements dkj {
    /* renamed from: a */
    public abstract dht clone();

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract dht mo4366a(dhu dhu);

    /* renamed from: a */
    public static void m6456a(Iterable iterable, List list) {
        djl.m6727a(iterable);
        if (iterable instanceof dju) {
            List d = ((dju) iterable).mo4543d();
            dju dju = (dju) list;
            int size = list.size();
            for (Object next : d) {
                if (next == null) {
                    int size2 = dju.size();
                    StringBuilder sb = new StringBuilder(37);
                    sb.append("Element at index ");
                    sb.append(size2 - size);
                    sb.append(" is null.");
                    String sb2 = sb.toString();
                    for (int size3 = dju.size() - 1; size3 >= size; size3--) {
                        dju.remove(size3);
                    }
                    throw new NullPointerException(sb2);
                } else if (next instanceof dik) {
                    dju.mo4540a((dik) next);
                } else {
                    dju.add((String) next);
                }
            }
        } else if (!(iterable instanceof dks)) {
            if ((list instanceof ArrayList) && (iterable instanceof Collection)) {
                ((ArrayList) list).ensureCapacity(list.size() + ((Collection) iterable).size());
            }
            int size4 = list.size();
            for (Object next2 : iterable) {
                if (next2 != null) {
                    list.add(next2);
                } else {
                    int size5 = list.size();
                    StringBuilder sb3 = new StringBuilder(37);
                    sb3.append("Element at index ");
                    sb3.append(size5 - size4);
                    sb3.append(" is null.");
                    String sb4 = sb3.toString();
                    for (int size6 = list.size() - 1; size6 >= size4; size6--) {
                        list.remove(size6);
                    }
                    throw new NullPointerException(sb4);
                }
            }
        } else {
            list.addAll((Collection) iterable);
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ dkj mo4367a(dkk dkk) {
        if (mo4503W().getClass().isInstance(dkk)) {
            return mo4366a((dhu) dkk);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
