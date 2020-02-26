package p000;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bin */
/* compiled from: PG */
public final class bin {

    /* renamed from: a */
    private final Map f4077a = new HashMap();

    /* renamed from: b */
    private Map f4078b;

    /* renamed from: a */
    public final synchronized Map mo1977a() {
        if (this.f4078b == null) {
            this.f4078b = Collections.unmodifiableMap(new HashMap(this.f4077a));
        }
        return this.f4078b;
    }
}
