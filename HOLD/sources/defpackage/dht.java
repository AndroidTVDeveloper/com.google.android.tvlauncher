package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: dht  reason: default package */
/* compiled from: PG */
public abstract class dht implements dkj {
    /* renamed from: a */
    public abstract dht clone();

    /* access modifiers changed from: protected */
    public abstract dht a(dhu dhu);

    public static void a(Iterable iterable, List list) {
        djl.a(iterable);
        if (iterable instanceof dju) {
            List d = ((dju) iterable).d();
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
                    dju.a((dik) next);
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

    public final /* bridge */ /* synthetic */ dkj a(dkk dkk) {
        if (W().getClass().isInstance(dkk)) {
            return a((dhu) dkk);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }
}
