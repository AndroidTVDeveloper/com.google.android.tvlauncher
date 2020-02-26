package defpackage;

import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: alk  reason: default package */
/* compiled from: PG */
public final class alk implements aks, aub, amc, bmk, axh, bmb, als {
    public final CopyOnWriteArraySet a = new CopyOnWriteArraySet();
    public final alj b = new alj();
    public akt c;
    private final bkf d;
    private final alg e = new alg();

    public alk(bkf bkf) {
        this.d = (bkf) bks.a(bkf);
    }

    public final void b() {
    }

    public final void m() {
    }

    private final bsh a(alh alh, int i, awt awt) {
        if (alh.c()) {
            awt = null;
        }
        this.d.a();
        boolean z = false;
        if (alh == this.c.r() && i == this.c.k()) {
            z = true;
        }
        if (awt == null || !awt.a()) {
            if (z) {
                this.c.q();
            } else if (!alh.c()) {
                alh.a(i, this.e).a();
            }
        } else if (z && this.c.o() == awt.b && this.c.p() == awt.c) {
            this.c.l();
        }
        this.c.l();
        this.c.m();
        return new bsh();
    }

    public final void a(ali ali) {
        bks.a(this.c);
        if (ali == null) {
            int k = this.c.k();
            alj alj = this.b;
            ali ali2 = null;
            int i = 0;
            while (true) {
                if (i >= alj.a.size()) {
                    break;
                }
                ali ali3 = (ali) alj.a.get(i);
                int a2 = alj.g.a(ali3.a.a);
                if (a2 != -1) {
                    alj.g.a(a2, alj.c);
                    if (k != 0) {
                        continue;
                    } else if (ali2 != null) {
                        ali2 = null;
                        break;
                    } else {
                        ali2 = ali3;
                    }
                }
                i++;
            }
            if (ali2 != null) {
                ali = ali2;
            } else {
                alh r = this.c.r();
                if (k >= r.a()) {
                    r = alh.a;
                }
                a(r, k, (awt) null);
                return;
            }
        }
        a(ali.b, 0, ali.a);
    }

    private final void q() {
        a(this.b.e);
    }

    private final void d(awt awt) {
        bks.a(this.c);
        if (awt == null) {
            alh r = this.c.r();
            if (r.a() <= 0) {
                r = alh.a;
            }
            a(r, 0, (awt) null);
            return;
        }
        ali ali = (ali) this.b.b.get(awt);
        if (ali == null) {
            a(alh.a, 0, awt);
        } else {
            a(ali);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ali} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void n() {
        /*
            r3 = this;
            alj r0 = r3.b
            java.util.ArrayList r1 = r0.a
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0023
            alh r1 = r0.g
            boolean r1 = r1.c()
            if (r1 != 0) goto L_0x0023
            boolean r1 = r0.h
            if (r1 != 0) goto L_0x0022
            java.util.ArrayList r0 = r0.a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            ali r2 = (defpackage.ali) r2
            goto L_0x0024
        L_0x0022:
        L_0x0023:
        L_0x0024:
            r3.a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.alk.n():void");
    }

    private final void r() {
        a(this.b.f);
    }

    public final void b(String str, long j, long j2) {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).f();
        }
    }

    public final void d(ani ani) {
        q();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).d();
        }
    }

    public final void c(ani ani) {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).e();
        }
    }

    public final void b(akh akh) {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).g();
        }
    }

    public final void c(int i) {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).a();
        }
    }

    public final void a(int i, long j, long j2) {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).b();
        }
    }

    public final void a(awt awt, buk buk) {
        d(awt);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).h();
        }
    }

    public final void a(int i, long j) {
        q();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).i();
        }
    }

    public final void c() {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).j();
        }
    }

    public final void a(awt awt, buj buj, buk buk) {
        d(awt);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).k();
        }
    }

    public final void b(awt awt, buj buj, buk buk) {
        d(awt);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).l();
        }
    }

    public final void a(awt awt, buj buj, buk buk, IOException iOException, boolean z) {
        d(awt);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).m();
        }
    }

    public final void c(awt awt, buj buj, buk buk) {
        d(awt);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).n();
        }
    }

    public final void d() {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).o();
        }
    }

    public final void a(awt awt) {
        alh alh;
        alj alj = this.b;
        if (alj.g.a(awt.a) == -1) {
            alh = alh.a;
        } else {
            alh = alj.g;
        }
        ali ali = new ali(awt, alh);
        alj.a.add(ali);
        alj.b.put(awt, ali);
        alj.d = (ali) alj.a.get(0);
        if (alj.a.size() == 1 && !alj.g.c()) {
            alj.e = alj.d;
        }
        d(awt);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).p();
        }
    }

    public final void b(awt awt) {
        ali ali;
        d(awt);
        alj alj = this.b;
        ali ali2 = (ali) alj.b.remove(awt);
        if (ali2 != null) {
            alj.a.remove(ali2);
            ali ali3 = alj.f;
            if (ali3 != null && awt.equals(ali3.a)) {
                if (!alj.a.isEmpty()) {
                    ali = (ali) alj.a.get(0);
                } else {
                    ali = null;
                }
                alj.f = ali;
            }
            if (!alj.a.isEmpty()) {
                alj.d = (ali) alj.a.get(0);
            }
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((all) it.next()).q();
            }
        }
    }

    public final void a(atw atw) {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).r();
        }
    }

    public final void e() {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).s();
        }
    }

    public final void f() {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).t();
        }
    }

    public final void g() {
        q();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).u();
        }
    }

    public final void b(int i) {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).v();
        }
    }

    public final void h() {
        alj alj = this.b;
        alj.e = alj.d;
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).w();
        }
    }

    public final void c(awt awt) {
        alj alj = this.b;
        alj.f = (ali) alj.b.get(awt);
        d(awt);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).x();
        }
    }

    public final void a(Surface surface) {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).y();
        }
    }

    public final void i() {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).z();
        }
    }

    public final void a() {
        alj alj = this.b;
        if (alj.h) {
            alj.h = false;
            alj.e = alj.d;
            n();
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                ((all) it.next()).A();
            }
        }
    }

    public final void j() {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).C();
        }
    }

    public final void o() {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).D();
        }
    }

    public final void a(alh alh) {
        alj alj = this.b;
        for (int i = 0; i < alj.a.size(); i++) {
            ali a2 = alj.a((ali) alj.a.get(i), alh);
            alj.a.set(i, a2);
            alj.b.put(a2.a, a2);
        }
        ali ali = alj.f;
        if (ali != null) {
            alj.f = alj.a(ali, alh);
        }
        alj.g = alh;
        alj.e = alj.d;
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).E();
        }
    }

    public final void k() {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).F();
        }
    }

    public final void b(awt awt, buk buk) {
        d(awt);
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).G();
        }
    }

    public final void a(String str, long j, long j2) {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).f();
        }
    }

    public final void b(ani ani) {
        q();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).d();
        }
    }

    public final void a(ani ani) {
        n();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).e();
        }
    }

    public final void a(akh akh) {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).g();
        }
    }

    public final void a(int i, int i2, int i3, float f) {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).H();
        }
    }

    public final void p() {
        r();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).I();
        }
    }

    public final void l() {
        ArrayList arrayList = new ArrayList(this.b.a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            b(((ali) arrayList.get(i)).a);
        }
    }
}
