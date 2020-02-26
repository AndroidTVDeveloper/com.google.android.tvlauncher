package defpackage;

import java.util.Collections;
import java.util.List;

/* renamed from: xc  reason: default package */
/* compiled from: PG */
final class xc implements vl, vk {
    public final vm a;
    public final vk b;
    public Object c;
    public vi d;
    private int e;
    private vh f;
    private volatile aai g;

    public xc(vm vmVar, vk vkVar) {
        this.a = vmVar;
        this.b = vkVar;
    }

    /* access modifiers changed from: package-private */
    public final boolean a(aai aai) {
        aai aai2 = this.g;
        return aai2 != null && aai2 == aai;
    }

    public final void c() {
        throw null;
    }

    public final void b() {
        aai aai = this.g;
        if (aai != null) {
            aai.c.c();
        }
    }

    public final void a(ts tsVar, Exception exc, ug ugVar, int i) {
        this.b.a(tsVar, exc, ugVar, this.g.c.d());
    }

    public final void a(ts tsVar, Object obj, ug ugVar, int i, ts tsVar2) {
        this.b.a(tsVar, obj, ugVar, this.g.c.d(), tsVar);
    }

    /* JADX INFO: finally extract failed */
    public final boolean a() {
        Object obj = this.c;
        if (obj != null) {
            this.c = null;
            ahy.a();
            try {
                tp a2 = this.a.c.c.b.a(obj.getClass());
                if (a2 != null) {
                    vj vjVar = new vj(a2, obj, this.a.i);
                    this.d = new vi(this.g.a, this.a.n);
                    this.a.a().a(this.d, vjVar);
                    this.g.c.b();
                    this.f = new vh(Collections.singletonList(this.g.a), this.a, this);
                } else {
                    throw new sr(obj.getClass());
                }
            } catch (Throwable th) {
                this.g.c.b();
                throw th;
            }
        }
        vh vhVar = this.f;
        if (vhVar != null && vhVar.a()) {
            return true;
        }
        this.f = null;
        this.g = null;
        boolean z = false;
        while (!z && this.e < this.a.c().size()) {
            List c2 = this.a.c();
            int i = this.e;
            this.e = i + 1;
            this.g = (aai) c2.get(i);
            if (this.g != null && (this.a.p.a(this.g.c.d()) || this.a.a(this.g.c.a()))) {
                this.g.c.a(this.a.o, new xb(this, this.g));
                z = true;
            }
        }
        return z;
    }
}
