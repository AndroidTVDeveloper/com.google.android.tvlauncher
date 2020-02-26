package p000;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: aas */
/* compiled from: PG */
public final class aas {

    /* renamed from: a */
    private static final aaj f31a = new aaq();

    /* renamed from: b */
    private final List f32b = new ArrayList();

    /* renamed from: c */
    private final Set f33c = new HashSet();

    /* renamed from: d */
    private final C0082cz f34d;

    public aas(C0082cz czVar) {
        this.f34d = czVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized void mo27a(Class cls, Class cls2, aak aak) {
        aar aar = new aar(cls, cls2, aak);
        List list = this.f32b;
        list.add(list.size(), aar);
    }

    /* renamed from: a */
    private final aaj m32a(aar aar) {
        return (aaj) aic.m542a(aar.f29b.mo5a(this));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final synchronized List mo26a(Class cls) {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            for (aar aar : this.f32b) {
                if (!this.f33c.contains(aar) && aar.mo24a(cls)) {
                    this.f33c.add(aar);
                    arrayList.add(m32a(aar));
                    this.f33c.remove(aar);
                }
            }
        } catch (Throwable th) {
            this.f33c.clear();
            throw th;
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized aaj mo25a(Class cls, Class cls2) {
        try {
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            for (aar aar : this.f32b) {
                if (this.f33c.contains(aar)) {
                    z = true;
                } else if (aar.mo24a(cls) && aar.f28a.isAssignableFrom(cls2)) {
                    this.f33c.add(aar);
                    arrayList.add(m32a(aar));
                    this.f33c.remove(aar);
                }
            }
            if (arrayList.size() > 1) {
                return new aap(arrayList, this.f34d);
            } else if (arrayList.size() == 1) {
                return (aaj) arrayList.get(0);
            } else if (z) {
                return f31a;
            } else {
                throw new C0504sp(cls, cls2);
            }
        } catch (Throwable th) {
            this.f33c.clear();
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized List mo28b(Class cls) {
        ArrayList arrayList;
        arrayList = new ArrayList();
        List list = this.f32b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            aar aar = (aar) list.get(i);
            if (!arrayList.contains(aar.f28a) && aar.mo24a(cls)) {
                arrayList.add(aar.f28a);
            }
        }
        return arrayList;
    }
}
