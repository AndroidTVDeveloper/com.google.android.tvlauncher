package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: agg */
/* compiled from: PG */
public final class agg {

    /* renamed from: a */
    private final List f266a = new ArrayList();

    /* renamed from: b */
    private final Map f267b = new HashMap();

    /* renamed from: a */
    public final synchronized void mo186a(String str, C0541tz tzVar, Class cls, Class cls2) {
        m330a(str).add(new agf(cls, cls2, tzVar));
    }

    /* renamed from: a */
    public final synchronized List mo185a(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.f266a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List<agf> list2 = (List) this.f267b.get((String) list.get(i));
            if (list2 != null) {
                for (agf agf : list2) {
                    if (agf.mo184a(cls, cls2)) {
                        arrayList.add(agf.f264b);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private final synchronized List m330a(String str) {
        List list;
        if (!this.f266a.contains(str)) {
            this.f266a.add(str);
        }
        list = (List) this.f267b.get(str);
        if (list == null) {
            list = new ArrayList();
            this.f267b.put(str, list);
        }
        return list;
    }

    /* renamed from: b */
    public final synchronized List mo188b(Class cls, Class cls2) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.f266a;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            List<agf> list2 = (List) this.f267b.get((String) list.get(i));
            if (list2 != null) {
                for (agf agf : list2) {
                    if (agf.mo184a(cls, cls2) && !arrayList.contains(agf.f263a)) {
                        arrayList.add(agf.f263a);
                    }
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized void mo187a(List list) {
        ArrayList arrayList = new ArrayList(this.f266a);
        this.f266a.clear();
        int size = list.size();
        for (int i = 0; i < size; i++) {
            this.f266a.add((String) list.get(i));
        }
        int size2 = arrayList.size();
        for (int i2 = 0; i2 < size2; i2++) {
            String str = (String) arrayList.get(i2);
            if (!list.contains(str)) {
                this.f266a.add(str);
            }
        }
    }
}
