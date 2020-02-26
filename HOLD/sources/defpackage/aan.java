package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: aan  reason: default package */
/* compiled from: PG */
public final class aan {
    private final aas a;
    private final aam b = new aam();

    public aan(cz czVar) {
        aas aas = new aas(czVar);
        this.a = aas;
    }

    public final synchronized void a(Class cls, Class cls2, aak aak) {
        this.a.a(cls, cls2, aak);
        this.b.a.clear();
    }

    public final synchronized List a(Class cls) {
        return this.a.b(cls);
    }

    public final synchronized List b(Class cls) {
        List list;
        aal aal = (aal) this.b.a.get(cls);
        if (aal != null) {
            list = aal.a;
        } else {
            list = null;
        }
        if (list == null) {
            list = Collections.unmodifiableList(this.a.a(cls));
            if (((aal) this.b.a.put(cls, new aal(list))) != null) {
                String valueOf = String.valueOf(cls);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 34);
                sb.append("Already cached loaders for model: ");
                sb.append(valueOf);
                throw new IllegalStateException(sb.toString());
            }
        }
        return list;
    }
}
