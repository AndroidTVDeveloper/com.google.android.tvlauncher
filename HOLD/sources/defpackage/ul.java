package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ul  reason: default package */
/* compiled from: PG */
public final class ul {
    private static final uh b = new uj();
    private final Map a = new HashMap();

    public final synchronized ui a(Object obj) {
        uh uhVar;
        aic.a(obj);
        uhVar = (uh) this.a.get(obj.getClass());
        if (uhVar == null) {
            Iterator it = this.a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                uh uhVar2 = (uh) it.next();
                if (uhVar2.a().isAssignableFrom(obj.getClass())) {
                    uhVar = uhVar2;
                    break;
                }
            }
        }
        if (uhVar == null) {
            uhVar = b;
        }
        return uhVar.a(obj);
    }

    public final synchronized void a(uh uhVar) {
        this.a.put(uhVar.a(), uhVar);
    }
}
