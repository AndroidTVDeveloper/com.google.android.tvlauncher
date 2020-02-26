package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: agg  reason: default package */
/* compiled from: PG */
public final class agg {
    private final List a = new ArrayList();
    private final Map b = new HashMap();

    public final synchronized void a(String str, tz tzVar, Class cls, Class cls2) {
        a(str).add(new agf(cls, cls2, tzVar));
    }

    public final synchronized List a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List<agf> list2 = (List) this.b.get((String) list.get(i));
            if (list2 != null) {
                for (agf agf : list2) {
                    if (agf.a(cls, cls2)) {
                        arrayList.add(agf.b);
                    }
                }
            }
        }
        return arrayList;
    }

    private final synchronized List a(String str) {
        List list;
        if (!this.a.contains(str)) {
            this.a.add(str);
        }
        list = (List) this.b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.b.put(str, list);
        }
        return list;
    }

    public final synchronized List b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List<agf> list2 = (List) this.b.get((String) list.get(i));
            if (list2 != null) {
                for (agf agf : list2) {
                    if (agf.a(cls, cls2) && !arrayList.contains(agf.a)) {
                        arrayList.add(agf.a);
                    }
                }
            }
        }
        return arrayList;
    }

    public final synchronized void a(List list) {
        ArrayList arrayList = new ArrayList(this.a);
        this.a.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.a.add((String) list.get(i));
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) arrayList.get(i2);
            if (!list.contains(str)) {
                this.a.add(str);
            }
        }
    }
}
