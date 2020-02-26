package defpackage;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ju  reason: default package */
/* compiled from: PG */
public abstract class ju {
    public js h = null;
    public long i = 250;
    private final ArrayList q = new ArrayList();

    public abstract void a();

    public boolean a(km kmVar, List list) {
        throw null;
    }

    public abstract boolean a(km kmVar, jt jtVar, jt jtVar2);

    public abstract boolean a(km kmVar, km kmVar2, jt jtVar, jt jtVar2);

    public abstract boolean b();

    public abstract boolean b(km kmVar, jt jtVar, jt jtVar2);

    public abstract void c(km kmVar);

    public abstract boolean c(km kmVar, jt jtVar, jt jtVar2);

    public abstract void d();

    public boolean f(km kmVar) {
        throw null;
    }

    public static int d(km kmVar) {
        int i2 = kmVar.j & 14;
        if (kmVar.j()) {
            return 4;
        }
        if ((i2 & 4) == 0) {
            int i3 = kmVar.d;
            int d = kmVar.d();
            if (!(i3 == -1 || d == -1 || i3 == d)) {
                return i2 | 2048;
            }
        }
        return i2;
    }

    public final void e(km kmVar) {
        js jsVar = this.h;
        if (jsVar != null) {
            boolean z = true;
            kmVar.a(true);
            if (kmVar.h != null && kmVar.i == null) {
                kmVar.h = null;
            }
            kmVar.i = null;
            if ((kmVar.j & 16) == 0) {
                jv jvVar = (jv) jsVar;
                RecyclerView recyclerView = jvVar.a;
                View view = kmVar.a;
                recyclerView.d();
                ho hoVar = recyclerView.c;
                int a = hoVar.a.a(view);
                if (a == -1) {
                    hoVar.d(view);
                } else if (hoVar.b.c(a)) {
                    hoVar.b.d(a);
                    hoVar.d(view);
                    hoVar.a.a(a);
                } else {
                    z = false;
                }
                if (z) {
                    km c = RecyclerView.c(view);
                    recyclerView.a.b(c);
                    recyclerView.a.a(c);
                }
                recyclerView.a(!z);
                if (!z && kmVar.n()) {
                    jvVar.a.removeDetachedView(kmVar.a, false);
                }
            }
        }
    }

    public final void e() {
        int size = this.q.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((jr) this.q.get(i2)).a();
        }
        this.q.clear();
    }

    public final void a(jr jrVar) {
        boolean b = b();
        if (jrVar == null) {
            return;
        }
        if (b) {
            this.q.add(jrVar);
        } else {
            jrVar.a();
        }
    }

    public jt f() {
        return new jt();
    }

    public jt a(kk kkVar, km kmVar) {
        return f().a(kmVar);
    }

    public jt a(kk kkVar, km kmVar, int i2, List list) {
        return f().a(kmVar);
    }

    public final void g() {
        this.i = 175;
    }
}
