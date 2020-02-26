package defpackage;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: wx  reason: default package */
/* compiled from: PG */
final class wx implements vl, uf {
    private final vk a;
    private final vm b;
    private int c;
    private int d = -1;
    private ts e;
    private List f;
    private int g;
    private volatile aai h;
    private File i;
    private wy j;

    public wx(vm vmVar, vk vkVar) {
        this.b = vmVar;
        this.a = vkVar;
    }

    public final void b() {
        aai aai = this.h;
        if (aai != null) {
            aai.c.c();
        }
    }

    private final boolean c() {
        return this.g < this.f.size();
    }

    public final void a(Object obj) {
        this.a.a(this.e, obj, this.h.c, 4, this.j);
    }

    public final void a(Exception exc) {
        this.a.a(this.j, exc, this.h.c, 4);
    }

    public final boolean a() {
        List list;
        List d2 = this.b.d();
        boolean z = false;
        if (d2.isEmpty()) {
            return false;
        }
        vm vmVar = this.b;
        ss ssVar = vmVar.c.c;
        Class<?> cls = vmVar.d.getClass();
        Class cls2 = vmVar.g;
        Class cls3 = vmVar.k;
        age age = ssVar.g;
        aib aib = (aib) age.a.getAndSet(null);
        if (aib == null) {
            aib = new aib(cls, cls2, cls3);
        } else {
            aib.a(cls, cls2, cls3);
        }
        synchronized (age.b) {
            list = (List) age.b.get(aib);
        }
        age.a.set(aib);
        if (list == null) {
            list = new ArrayList();
            for (Class b2 : ssVar.a.a(cls)) {
                for (Class cls4 : ssVar.c.b(b2, cls2)) {
                    if (!ssVar.f.b(cls4, cls3).isEmpty() && !list.contains(cls4)) {
                        list.add(cls4);
                    }
                }
            }
            age age2 = ssVar.g;
            List unmodifiableList = Collections.unmodifiableList(list);
            synchronized (age2.b) {
                age2.b.put(new aib(cls, cls2, cls3), unmodifiableList);
            }
        }
        if (!list.isEmpty()) {
            while (true) {
                if (this.f != null && c()) {
                    this.h = null;
                    while (!z && c()) {
                        List list2 = this.f;
                        int i2 = this.g;
                        this.g = i2 + 1;
                        File file = this.i;
                        vm vmVar2 = this.b;
                        this.h = ((aaj) list2.get(i2)).a(file, vmVar2.e, vmVar2.f, vmVar2.i);
                        if (this.h != null && this.b.a(this.h.c.a())) {
                            this.h.c.a(this.b.o, this);
                            z = true;
                        }
                    }
                    return z;
                }
                int i3 = this.d + 1;
                this.d = i3;
                if (i3 >= list.size()) {
                    int i4 = this.c + 1;
                    this.c = i4;
                    if (i4 >= d2.size()) {
                        return false;
                    }
                    this.d = 0;
                }
                ts tsVar = (ts) d2.get(this.c);
                Class cls5 = (Class) list.get(this.d);
                ub c2 = this.b.c(cls5);
                xe b3 = this.b.b();
                vm vmVar3 = this.b;
                this.j = new wy(b3, tsVar, vmVar3.n, vmVar3.e, vmVar3.f, c2, cls5, vmVar3.i);
                File a2 = this.b.a().a(this.j);
                this.i = a2;
                if (a2 != null) {
                    this.e = tsVar;
                    this.f = this.b.a(a2);
                    this.g = 0;
                }
            }
        } else if (File.class.equals(this.b.k)) {
            return false;
        } else {
            String valueOf = String.valueOf(this.b.d.getClass());
            String valueOf2 = String.valueOf(this.b.k);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
            sb.append("Failed to find any load path from ");
            sb.append(valueOf);
            sb.append(" to ");
            sb.append(valueOf2);
            throw new IllegalStateException(sb.toString());
        }
    }
}
