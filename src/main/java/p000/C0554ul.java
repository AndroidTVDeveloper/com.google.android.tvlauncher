package p000;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ul */
/* compiled from: PG */
public final class C0554ul {

    /* renamed from: b */
    private static final C0550uh f10540b = new C0552uj();

    /* renamed from: a */
    private final Map f10541a = new HashMap();

    /* renamed from: a */
    public final synchronized C0551ui mo6006a(Object obj) {
        C0550uh uhVar;
        aic.m542a(obj);
        uhVar = (C0550uh) this.f10541a.get(obj.getClass());
        if (uhVar == null) {
            Iterator it = this.f10541a.values().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C0550uh uhVar2 = (C0550uh) it.next();
                if (uhVar2.mo85a().isAssignableFrom(obj.getClass())) {
                    uhVar = uhVar2;
                    break;
                }
            }
        }
        if (uhVar == null) {
            uhVar = f10540b;
        }
        return uhVar.mo86a(obj);
    }

    /* renamed from: a */
    public final synchronized void mo6007a(C0550uh uhVar) {
        this.f10541a.put(uhVar.mo85a(), uhVar);
    }
}
