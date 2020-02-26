package defpackage;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ajy  reason: default package */
/* compiled from: PG */
public final class ajy extends aiy implements akt {
    public final akx[] b;
    public final Handler c;
    public final ake d;
    public final CopyOnWriteArrayList e;
    public final alf f;
    public boolean g;
    public int h;
    public int i;
    public boolean j;
    public int k;
    public boolean l;
    public boolean m;
    public int n;
    public akq o;
    public akp p;
    public int q;
    public int r;
    public long s;
    private final bgr t;
    private final Handler u;
    private final ArrayDeque v;

    public ajy(akx[] akxArr, bgq bgq, akk akk, bhn bhn, bkf bkf, Looper looper) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = blm.e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.10.7] [");
        sb.append(str);
        sb.append("]");
        sb.toString();
        int length = akxArr.length;
        bks.b(length > 0);
        this.b = (akx[]) bks.a(akxArr);
        bgq bgq2 = (bgq) bks.a(bgq);
        this.g = false;
        this.i = 0;
        this.j = false;
        this.e = new CopyOnWriteArrayList();
        this.t = new bgr(new akz[length], new bgl[length]);
        this.f = new alf();
        this.o = akq.a;
        alb alb = alb.a;
        this.h = 0;
        this.c = new ajo(this, looper);
        this.p = akp.a(0, this.t);
        this.v = new ArrayDeque();
        this.d = new ake(akxArr, bgq, this.t, akk, bhn, this.g, this.i, this.j, this.c, bkf);
        this.u = new Handler(this.d.b.getLooper());
    }

    public final void a(aks aks) {
        throw null;
    }

    public final void a(boolean z) {
        throw null;
    }

    public final void b(aks aks) {
        throw null;
    }

    public final Looper e() {
        throw null;
    }

    public final int g() {
        return this.h;
    }

    public final boolean h() {
        return this.g;
    }

    public final int i() {
        return this.i;
    }

    public final boolean j() {
        return this.j;
    }

    public final akw a(akv akv) {
        ake ake = this.d;
        alh alh = this.p.a;
        k();
        return new akw(ake, akv, this.u);
    }

    public final long q() {
        if (!n()) {
            return l();
        }
        akp akp = this.p;
        akp.a.a(akp.b.a, this.f);
        akp akp2 = this.p;
        if (akp2.d != -9223372036854775807L) {
            return this.f.a() + aja.a(this.p.d);
        }
        return akp2.a.a(k(), this.a).a();
    }

    public final int o() {
        if (n()) {
            return this.p.b.b;
        }
        return -1;
    }

    public final int p() {
        if (n()) {
            return this.p.b.c;
        }
        return -1;
    }

    public final long l() {
        if (s()) {
            return this.s;
        }
        if (this.p.b.a()) {
            return aja.a(this.p.m);
        }
        akp akp = this.p;
        return a(akp.b, akp.m);
    }

    public final alh r() {
        return this.p.a;
    }

    public final int k() {
        if (s()) {
            return this.q;
        }
        akp akp = this.p;
        akp.a.a(akp.b.a, this.f);
        return 0;
    }

    public final int f() {
        return this.p.e;
    }

    public final akp a(boolean z, boolean z2, boolean z3, int i2) {
        awt awt;
        long j2;
        alh alh;
        ajh ajh;
        aye aye;
        int i3;
        boolean z4 = true;
        long j3 = 0;
        if (z) {
            this.q = 0;
            this.r = 0;
            this.s = 0;
        } else {
            this.q = k();
            if (!s()) {
                akp akp = this.p;
                i3 = akp.a.a(akp.b.a);
            } else {
                i3 = this.r;
            }
            this.r = i3;
            this.s = l();
            if (!z2) {
                z4 = false;
            }
        }
        if (z4) {
            awt = this.p.a(this.a, this.f);
        } else {
            awt = this.p.b;
        }
        if (!z4) {
            j3 = this.p.m;
        }
        long j4 = j3;
        if (!z4) {
            j2 = this.p.d;
        } else {
            j2 = -9223372036854775807L;
        }
        long j5 = j2;
        if (!z2) {
            alh = this.p.a;
        } else {
            alh = alh.a;
        }
        if (!z3) {
            ajh = this.p.f;
        } else {
            ajh = null;
        }
        ajh ajh2 = ajh;
        if (!z2) {
            aye = this.p.h;
        } else {
            aye = aye.a;
        }
        return new akp(alh, awt, j4, j5, i2, ajh2, false, aye, !z2 ? this.p.i : this.t, awt, j4, 0, j4);
    }

    public final long m() {
        return aja.a(this.p.l);
    }

    public static void a(CopyOnWriteArrayList copyOnWriteArrayList, aix aix) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            aiw aiw = (aiw) it.next();
            if (!aiw.b) {
                aix.a(aiw.a);
            }
        }
    }

    public final boolean n() {
        return !s() && this.p.b.a();
    }

    public final void a(aix aix) {
        a(new ajn(new CopyOnWriteArrayList(this.e), aix));
    }

    private final void a(Runnable runnable) {
        boolean isEmpty = this.v.isEmpty();
        this.v.addLast(runnable);
        if (!(!isEmpty)) {
            while (!this.v.isEmpty()) {
                ((Runnable) this.v.peekFirst()).run();
                this.v.removeFirst();
            }
        }
    }

    public final long a(awt awt, long j2) {
        this.p.a.a(awt.a, this.f);
        return aja.a(j2) + this.f.a();
    }

    public final boolean s() {
        return this.p.a.c() || this.k > 0;
    }

    public final void a(akp akp, boolean z, int i2, int i3, boolean z2) {
        boolean a = a();
        akp akp2 = this.p;
        this.p = akp;
        a(new ajx(akp, akp2, this.e, z, i3, z2, a != a()));
    }
}
