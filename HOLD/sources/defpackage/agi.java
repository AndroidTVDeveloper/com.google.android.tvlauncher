package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: agi  reason: default package */
/* compiled from: PG */
public final class agi {
    private final List a = new ArrayList();

    public final synchronized void a(Class cls, ua uaVar) {
        this.a.add(new agh(cls, uaVar));
    }

    public final synchronized ua a(Class cls) {
        ua uaVar;
        int size = this.a.size();
        int i = 0;
        while (true) {
            if (i >= size) {
                uaVar = null;
                break;
            }
            agh agh = (agh) this.a.get(i);
            if (agh.a.isAssignableFrom(cls)) {
                uaVar = agh.b;
                break;
            }
            i++;
        }
        return uaVar;
    }
}
