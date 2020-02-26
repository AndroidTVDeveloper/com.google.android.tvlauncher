package p000;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: dbf */
/* compiled from: PG */
public final class dbf {

    /* renamed from: a */
    public final Set f8139a;

    /* renamed from: b */
    public Map f8140b = new HashMap();

    /* renamed from: c */
    private final List f8141c;

    public dbf(List list, Set set) {
        this.f8141c = list;
        this.f8139a = set;
        List list2 = this.f8141c;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            dai dai = (dai) list2.get(i);
            this.f8140b.put(dai.m6054a(dai.f8050a, dai.f8051b), dai);
        }
    }
}
