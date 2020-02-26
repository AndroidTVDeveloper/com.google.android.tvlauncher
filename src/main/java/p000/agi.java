package p000;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agi */
/* compiled from: PG */
public final class agi {

    /* renamed from: a */
    private final List f270a = new ArrayList();

    /* renamed from: a */
    public final synchronized void mo190a(Class cls, C0543ua uaVar) {
        this.f270a.add(new agh(cls, uaVar));
    }

    /* renamed from: a */
    public final synchronized C0543ua mo189a(Class cls) {
        C0543ua uaVar;
        int size = this.f270a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                uaVar = null;
                break;
            }
            agh agh = (agh) this.f270a.get(i);
            if (agh.f268a.isAssignableFrom(cls)) {
                uaVar = agh.f269b;
                break;
            }
            i++;
        }
        return uaVar;
    }
}
