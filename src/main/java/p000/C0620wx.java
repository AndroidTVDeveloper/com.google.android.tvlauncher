package p000;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wx */
/* compiled from: PG */
final class C0620wx implements C0581vl, C0548uf {

    /* renamed from: a */
    private final C0580vk f10736a;

    /* renamed from: b */
    private final C0582vm f10737b;

    /* renamed from: c */
    private int f10738c;

    /* renamed from: d */
    private int f10739d = -1;

    /* renamed from: e */
    private C0534ts f10740e;

    /* renamed from: f */
    private List f10741f;

    /* renamed from: g */
    private int f10742g;

    /* renamed from: h */
    private volatile aai f10743h;

    /* renamed from: i */
    private File f10744i;

    /* renamed from: j */
    private C0621wy f10745j;

    public C0620wx(C0582vm vmVar, C0580vk vkVar) {
        this.f10737b = vmVar;
        this.f10736a = vkVar;
    }

    /* renamed from: b */
    public final void mo6023b() {
        aai aai = this.f10743h;
        if (aai != null) {
            aai.f14c.mo9c();
        }
    }

    /* renamed from: c */
    private final boolean m8585c() {
        return this.f10742g < this.f10741f.size();
    }

    /* renamed from: a */
    public final void mo22a(Object obj) {
        this.f10736a.mo6026a(this.f10740e, obj, this.f10743h.f14c, 4, this.f10745j);
    }

    /* renamed from: a */
    public final void mo21a(Exception exc) {
        this.f10736a.mo6025a(this.f10745j, exc, this.f10743h.f14c, 4);
    }

    /* renamed from: a */
    public final boolean mo6022a() {
        List list;
        List d = this.f10737b.mo6035d();
        boolean z = false;
        if (d.isEmpty()) {
            return false;
        }
        C0582vm vmVar = this.f10737b;
        C0507ss ssVar = vmVar.f10591c.f10384c;
        Class<?> cls = vmVar.f10592d.getClass();
        Class cls2 = vmVar.f10595g;
        Class cls3 = vmVar.f10599k;
        age age = ssVar.f10401g;
        aib aib = (aib) age.f261a.getAndSet(null);
        if (aib == null) {
            aib = new aib(cls, cls2, cls3);
        } else {
            aib.mo306a(cls, cls2, cls3);
        }
        synchronized (age.f262b) {
            list = (List) age.f262b.get(aib);
        }
        age.f261a.set(aib);
        if (list == null) {
            list = new ArrayList();
            for (Class b : ssVar.f10395a.mo18a(cls)) {
                for (Class cls4 : ssVar.f10397c.mo188b(b, cls2)) {
                    if (!ssVar.f10400f.mo126b(cls4, cls3).isEmpty() && !list.contains(cls4)) {
                        list.add(cls4);
                    }
                }
            }
            age age2 = ssVar.f10401g;
            List unmodifiableList = Collections.unmodifiableList(list);
            synchronized (age2.f262b) {
                age2.f262b.put(new aib(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (!list.isEmpty()) {
            while (true) {
                if (this.f10741f != null && m8585c()) {
                    this.f10743h = null;
                    while (!z && m8585c()) {
                        List list2 = this.f10741f;
                        int i = this.f10742g;
                        this.f10742g = i + 1;
                        File file = this.f10744i;
                        C0582vm vmVar2 = this.f10737b;
                        this.f10743h = ((aaj) list2.get(i)).mo11a(file, vmVar2.f10593e, vmVar2.f10594f, vmVar2.f10597i);
                        if (this.f10743h != null && this.f10737b.mo6030a(this.f10743h.f14c.mo6a())) {
                            this.f10743h.f14c.mo7a(this.f10737b.f10603o, this);
                            z = true;
                        }
                    }
                    return z;
                }
                int i2 = this.f10739d + 1;
                this.f10739d = i2;
                if (i2 >= list.size()) {
                    int i3 = this.f10738c + 1;
                    this.f10738c = i3;
                    if (i3 >= d.size()) {
                        return false;
                    }
                    this.f10739d = 0;
                }
                C0534ts tsVar = (C0534ts) d.get(this.f10738c);
                Class cls5 = (Class) list.get(this.f10739d);
                C0544ub c = this.f10737b.mo6034c(cls5);
                C0628xe b2 = this.f10737b.mo6032b();
                C0582vm vmVar3 = this.f10737b;
                this.f10745j = new C0621wy(b2, tsVar, vmVar3.f10602n, vmVar3.f10593e, vmVar3.f10594f, c, cls5, vmVar3.f10597i);
                File a = this.f10737b.mo6029a().mo6128a(this.f10745j);
                this.f10744i = a;
                if (a != null) {
                    this.f10740e = tsVar;
                    this.f10741f = this.f10737b.mo6028a(a);
                    this.f10742g = 0;
                }
            }
        } else if (File.class.equals(this.f10737b.f10599k)) {
            return false;
        } else {
            String valueOf = String.valueOf(this.f10737b.f10592d.getClass());
            String valueOf2 = String.valueOf(this.f10737b.f10599k);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
            sb.append("Failed to find any load path from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
    }
}
