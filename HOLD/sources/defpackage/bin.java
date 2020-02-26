package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: bin  reason: default package */
/* compiled from: PG */
public final class bin {
    private final Map a = new HashMap();
    private Map b;

    public final synchronized Map a() {
        if (this.b == null) {
            this.b = Collections.unmodifiableMap(new HashMap(this.a));
        }
        return this.b;
    }
}
