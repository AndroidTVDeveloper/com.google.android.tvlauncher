package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: vm  reason: default package */
/* compiled from: PG */
public final class vm {
    public final List a = new ArrayList();
    public final List b = new ArrayList();
    public sl c;
    public Object d;
    public int e;
    public int f;
    public Class g;
    public vq h;
    public tx i;
    public Map j;
    public Class k;
    public boolean l;
    public boolean m;
    public ts n;
    public sm o;
    public vy p;
    public boolean q;
    public boolean r;

    /* access modifiers changed from: package-private */
    public final xe b() {
        return this.c.b;
    }

    /* access modifiers changed from: package-private */
    public final List d() {
        if (!this.m) {
            this.m = true;
            this.b.clear();
            List c2 = c();
            int size = c2.size();
            for (int i2 = 0; i2 < size; i2++) {
                aai aai = (aai) c2.get(i2);
                if (!this.b.contains(aai.a)) {
                    this.b.add(aai.a);
                }
                for (int i3 = 0; i3 < aai.b.size(); i3++) {
                    if (!this.b.contains(aai.b.get(i3))) {
                        this.b.add((ts) aai.b.get(i3));
                    }
                }
            }
        }
        return this.b;
    }

    /* access modifiers changed from: package-private */
    public final xy a() {
        return this.h.a();
    }

    /* access modifiers changed from: package-private */
    public final List c() {
        if (!this.l) {
            this.l = true;
            this.a.clear();
            List a2 = this.c.c.a(this.d);
            int size = a2.size();
            for (int i2 = 0; i2 < size; i2++) {
                aai a3 = ((aaj) a2.get(i2)).a(this.d, this.e, this.f, this.i);
                if (a3 != null) {
                    this.a.add(a3);
                }
            }
        }
        return this.a;
    }

    /* access modifiers changed from: package-private */
    public final wt b(Class cls) {
        wt wtVar;
        Class cls2 = cls;
        ss ssVar = this.c.c;
        Class cls3 = this.g;
        Class cls4 = this.k;
        agd agd = ssVar.h;
        aib aib = (aib) agd.c.getAndSet(null);
        if (aib == null) {
            aib = new aib();
        }
        aib.a(cls2, cls3, cls4);
        synchronized (agd.b) {
            wtVar = (wt) agd.b.get(aib);
        }
        agd.c.set(aib);
        if (agd.a.equals(wtVar)) {
            return null;
        }
        if (wtVar != null) {
            return wtVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls5 : ssVar.c.b(cls2, cls3)) {
            for (Class cls6 : ssVar.f.b(cls5, cls4)) {
                vt vtVar = r2;
                vt vtVar2 = new vt(cls, cls5, cls6, ssVar.c.a(cls2, cls5), ssVar.f.a(cls5, cls6), ssVar.i);
                arrayList.add(vtVar);
            }
        }
        wt wtVar2 = !arrayList.isEmpty() ? new wt(cls, cls3, cls4, arrayList, ssVar.i) : null;
        agd agd2 = ssVar.h;
        synchronized (agd2.b) {
            agd2.b.put(new aib(cls2, cls3, cls4), wtVar2 == null ? agd.a : wtVar2);
        }
        return wtVar2;
    }

    /* access modifiers changed from: package-private */
    public final List a(File file) {
        return this.c.c.a(file);
    }

    /* access modifiers changed from: package-private */
    public final ub c(Class cls) {
        ub ubVar = (ub) this.j.get(cls);
        if (ubVar == null) {
            Iterator it = this.j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ubVar = (ub) entry.getValue();
                    break;
                }
            }
        }
        if (ubVar != null) {
            return ubVar;
        }
        if (!this.j.isEmpty() || !this.q) {
            return acb.b;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 115);
        sb.append("Missing transformation for ");
        sb.append(valueOf);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    public final boolean a(Class cls) {
        return b(cls) != null;
    }
}
