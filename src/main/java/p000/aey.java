package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: aey */
/* compiled from: PG */
public final class aey {

    /* renamed from: a */
    private final List f221a = new ArrayList();

    /* renamed from: a */
    public final synchronized aew mo124a(Class cls, Class cls2) {
        if (!cls2.isAssignableFrom(cls)) {
            List list = this.f221a;
            int size = list.size();
            int i = 0;
            while (i < size) {
                aex aex = (aex) list.get(i);
                i++;
                if (aex.mo123a(cls, cls2)) {
                    return aex.f218a;
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
        return aez.f222a;
    }

    /* renamed from: b */
    public final synchronized List mo126b(Class cls, Class cls2) {
        ArrayList arrayList = new ArrayList();
        if (!cls2.isAssignableFrom(cls)) {
            List list = this.f221a;
            int size = list.size();
            for (int i = 0; i < size; i++) {
                if (((aex) list.get(i)).mo123a(cls, cls2)) {
                    arrayList.add(cls2);
                }
            }
            return arrayList;
        }
        arrayList.add(cls2);
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo125a(Class cls, Class cls2, aew aew) {
        this.f221a.add(new aex(cls, cls2, aew));
    }
}
