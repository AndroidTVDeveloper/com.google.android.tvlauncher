package defpackage;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: dbf  reason: default package */
/* compiled from: PG */
public final class dbf {
    public final Set a;
    public Map b = new HashMap();
    private final List c;

    public dbf(List list, Set set) {
        this.c = list;
        this.a = set;
        List list2 = this.c;
        int size = list2.size();
        for (int i = 0; i < size; i++) {
            dai dai = (dai) list2.get(i);
            this.b.put(dai.a(dai.a, dai.b), dai);
        }
    }
}
