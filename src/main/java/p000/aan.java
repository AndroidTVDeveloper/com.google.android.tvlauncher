package p000;

import java.util.Collections;
import java.util.List;

/* renamed from: aan */
/* compiled from: PG */
public final class aan {

    /* renamed from: a */
    private final aas f17a;

    /* renamed from: b */
    private final aam f18b = new aam();

    public aan(C0082cz czVar) {
        aas aas = new aas(czVar);
        this.f17a = aas;
    }

    /* renamed from: a */
    public final synchronized void mo19a(Class cls, Class cls2, aak aak) {
        this.f17a.mo27a(cls, cls2, aak);
        this.f18b.f16a.clear();
    }

    /* renamed from: a */
    public final synchronized List mo18a(Class cls) {
        return this.f17a.mo28b(cls);
    }

    /* renamed from: b */
    public final synchronized List mo20b(Class cls) {
        List list;
        aal aal = (aal) this.f18b.f16a.get(cls);
        if (aal != null) {
            list = aal.f15a;
        } else {
            list = null;
        }
        if (list == null) {
            list = Collections.unmodifiableList(this.f17a.mo26a(cls));
            if (((aal) this.f18b.f16a.put(cls, new aal(list))) != null) {
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
