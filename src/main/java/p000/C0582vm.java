package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: vm */
/* compiled from: PG */
public final class C0582vm {

    /* renamed from: a */
    public final List f10589a = new ArrayList();

    /* renamed from: b */
    public final List f10590b = new ArrayList();

    /* renamed from: c */
    public C0500sl f10591c;

    /* renamed from: d */
    public Object f10592d;

    /* renamed from: e */
    public int f10593e;

    /* renamed from: f */
    public int f10594f;

    /* renamed from: g */
    public Class f10595g;

    /* renamed from: h */
    public C0586vq f10596h;

    /* renamed from: i */
    public C0539tx f10597i;

    /* renamed from: j */
    public Map f10598j;

    /* renamed from: k */
    public Class f10599k;

    /* renamed from: l */
    public boolean f10600l;

    /* renamed from: m */
    public boolean f10601m;

    /* renamed from: n */
    public C0534ts f10602n;

    /* renamed from: o */
    public C0501sm f10603o;

    /* renamed from: p */
    public C0594vy f10604p;

    /* renamed from: q */
    public boolean f10605q;

    /* renamed from: r */
    public boolean f10606r;

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0628xe mo6032b() {
        return this.f10591c.f10383b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final List mo6035d() {
        if (!this.f10601m) {
            this.f10601m = true;
            this.f10590b.clear();
            List c = mo6033c();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                aai aai = (aai) c.get(i);
                if (!this.f10590b.contains(aai.f12a)) {
                    this.f10590b.add(aai.f12a);
                }
                for (int i2 = 0; i2 < aai.f13b.size(); i2++) {
                    if (!this.f10590b.contains(aai.f13b.get(i2))) {
                        this.f10590b.add((C0534ts) aai.f13b.get(i2));
                    }
                }
            }
        }
        return this.f10590b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C0648xy mo6029a() {
        return this.f10596h.mo6038a();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final List mo6033c() {
        if (!this.f10600l) {
            this.f10600l = true;
            this.f10589a.clear();
            List a = this.f10591c.f10384c.mo5926a(this.f10592d);
            int size = a.size();
            for (int i = 0; i < size; i++) {
                aai a2 = ((aaj) a.get(i)).mo11a(this.f10592d, this.f10593e, this.f10594f, this.f10597i);
                if (a2 != null) {
                    this.f10589a.add(a2);
                }
            }
        }
        return this.f10589a;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C0616wt mo6031b(Class cls) {
        C0616wt wtVar;
        Class cls2 = cls;
        C0507ss ssVar = this.f10591c.f10384c;
        Class cls3 = this.f10595g;
        Class cls4 = this.f10599k;
        agd agd = ssVar.f10402h;
        aib aib = (aib) agd.f260c.getAndSet(null);
        if (aib == null) {
            aib = new aib();
        }
        aib.mo306a(cls2, cls3, cls4);
        synchronized (agd.f259b) {
            wtVar = (C0616wt) agd.f259b.get(aib);
        }
        agd.f260c.set(aib);
        if (agd.f258a.equals(wtVar)) {
            return null;
        }
        if (wtVar != null) {
            return wtVar;
        }
        ArrayList arrayList = new ArrayList();
        for (Class cls5 : ssVar.f10397c.mo188b(cls2, cls3)) {
            for (Class cls6 : ssVar.f10400f.mo126b(cls5, cls4)) {
                C0589vt vtVar = r2;
                C0589vt vtVar2 = new C0589vt(cls, cls5, cls6, ssVar.f10397c.mo185a(cls2, cls5), ssVar.f10400f.mo124a(cls5, cls6), ssVar.f10403i);
                arrayList.add(vtVar);
            }
        }
        C0616wt wtVar2 = !arrayList.isEmpty() ? new C0616wt(cls, cls3, cls4, arrayList, ssVar.f10403i) : null;
        agd agd2 = ssVar.f10402h;
        synchronized (agd2.f259b) {
            agd2.f259b.put(new aib(cls2, cls3, cls4), wtVar2 == null ? agd.f258a : wtVar2);
        }
        return wtVar2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final List mo6028a(File file) {
        return this.f10591c.f10384c.mo5926a(file);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C0544ub mo6034c(Class cls) {
        C0544ub ubVar = (C0544ub) this.f10598j.get(cls);
        if (ubVar == null) {
            Iterator it = this.f10598j.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    ubVar = (C0544ub) entry.getValue();
                    break;
                }
            }
        }
        if (ubVar != null) {
            return ubVar;
        }
        if (!this.f10598j.isEmpty() || !this.f10605q) {
            return acb.f81b;
        }
        String valueOf = String.valueOf(cls);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 115);
        sb.append("Missing transformation for ");
        sb.append(valueOf);
        sb.append(". If you wish to ignore unknown resource types, use the optional transformation methods.");
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo6030a(Class cls) {
        return mo6031b(cls) != null;
    }
}
