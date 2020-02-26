package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aey  reason: default package */
/* compiled from: PG */
public final class aey {
    private final List a = new ArrayList();

    public final synchronized aew a(Class cls, Class cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            List list = this.a;
            int size = list.size();
            int i = 0;
            while (i < size) {
                aex aex = (aex) list.get(i);
                i++;
                if (aex.a(cls, cls2)) {
                    return aex.a;
                }
            }
            String valueOf = String.valueOf(cls);
            String valueOf2 = String.valueOf(cls2);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 47 + String.valueOf(valueOf2).length());
            sb.append("No transcoder registered to transcode from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IllegalArgumentException(sb.toString());
        }
        return aez.a;
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (!cls2.isAssignableFrom(cls)) {
            List list = this.a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((aex) list.get(i)).a(cls, cls2)) {
                    arrayList.add(cls2);
                }
            }
            return arrayList;
        }
        arrayList.add(cls2);
        return arrayList;
    }

    public final synchronized void a(Class cls, Class cls2, aew aew) {
        this.a.add(new aex(cls, cls2, aew));
    }
}
