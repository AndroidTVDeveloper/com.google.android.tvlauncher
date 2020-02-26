package defpackage;

import java.util.HashMap;
import java.util.Map;

/* renamed from: ws  reason: default package */
/* compiled from: PG */
public final class ws {
    public final Map a = new HashMap();

    public ws() {
        new HashMap();
    }

    /* access modifiers changed from: package-private */
    public final void a(ts tsVar, wk wkVar) {
        Map map = this.a;
        if (wkVar.equals(map.get(tsVar))) {
            map.remove(tsVar);
        }
    }
}
