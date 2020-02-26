package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aas  reason: default package */
/* compiled from: PG */
public final class aas {
    private static final aaj a = new aaq();
    private final List b = new ArrayList();
    private final Set c = new HashSet();
    private final cz d;

    public aas(cz czVar) {
        this.d = czVar;
    }

    /* access modifiers changed from: package-private */
    public final synchronized void a(Class cls, Class cls2, aak aak) {
        aar aar = new aar(cls, cls2, aak);
        List list = this.b;
        list.add(list.size(), aar);
    }

    private final aaj a(aar aar) {
        return (aaj) aic.a(aar.b.a(this));
    }

    /* access modifiers changed from: package-private */
    public final synchronized List a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (aar aar : this.b) {
                if (!this.c.contains(aar) && aar.a(cls)) {
                    this.c.add(aar);
                    arrayList.add(a(aar));
                    this.c.remove(aar);
                }
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
        return arrayList;
    }

    public final synchronized aaj a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (aar aar : this.b) {
                if (this.c.contains(aar)) {
                    z = true;
                } else if (aar.a(cls) && aar.a.isAssignableFrom(cls2)) {
                    this.c.add(aar);
                    arrayList.add(a(aar));
                    this.c.remove(aar);
                }
            }
            if (arrayList.size() > 1) {
                return new aap(arrayList, this.d);
            } else if (arrayList.size() == 1) {
                return (aaj) arrayList.get(0);
            } else if (z) {
                return a;
            } else {
                throw new sp(cls, cls2);
            }
        } catch (Throwable th) {
            this.c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public final synchronized List b(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aar aar = (aar) list.get(i);
            if (!arrayList.contains(aar.a) && aar.a(cls)) {
                arrayList.add(aar.a);
            }
        }
        return arrayList;
    }
}
