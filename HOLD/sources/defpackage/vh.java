package defpackage;

import java.io.File;
import java.util.List;

/* renamed from: vh  reason: default package */
/* compiled from: PG */
final class vh implements vl, uf {
    private final List a;
    private final vm b;
    private final vk c;
    private int d;
    private ts e;
    private List f;
    private int g;
    private volatile aai h;
    private File i;

    public vh(vm vmVar, vk vkVar) {
        this(vmVar.d(), vmVar, vkVar);
    }

    public vh(List list, vm vmVar, vk vkVar) {
        this.d = -1;
        this.a = list;
        this.b = vmVar;
        this.c = vkVar;
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
        this.c.a(this.e, obj, this.h.c, 3, this.e);
    }

    public final void a(Exception exc) {
        this.c.a(this.e, exc, this.h.c, 3);
    }

    public final boolean a() {
        while (true) {
            boolean z = false;
            if (this.f == null || !c()) {
                int i2 = this.d + 1;
                this.d = i2;
                if (i2 >= this.a.size()) {
                    return false;
                }
                ts tsVar = (ts) this.a.get(this.d);
                File a2 = this.b.a().a(new vi(tsVar, this.b.n));
                this.i = a2;
                if (a2 != null) {
                    this.e = tsVar;
                    this.f = this.b.a(a2);
                    this.g = 0;
                }
            } else {
                this.h = null;
                while (!z && c()) {
                    List list = this.f;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    File file = this.i;
                    vm vmVar = this.b;
                    this.h = ((aaj) list.get(i3)).a(file, vmVar.e, vmVar.f, vmVar.i);
                    if (this.h != null && this.b.a(this.h.c.a())) {
                        this.h.c.a(this.b.o, this);
                        z = true;
                    }
                }
                return z;
            }
        }
    }
}
