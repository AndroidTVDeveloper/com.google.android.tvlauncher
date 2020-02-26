package p000;

import android.os.Handler;
import android.os.Looper;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: ajy */
/* compiled from: PG */
public final class ajy extends aiy implements akt {

    /* renamed from: b */
    public final akx[] f477b;

    /* renamed from: c */
    public final Handler f478c;

    /* renamed from: d */
    public final ake f479d;

    /* renamed from: e */
    public final CopyOnWriteArrayList f480e;

    /* renamed from: f */
    public final alf f481f;

    /* renamed from: g */
    public boolean f482g;

    /* renamed from: h */
    public int f483h;

    /* renamed from: i */
    public int f484i;

    /* renamed from: j */
    public boolean f485j;

    /* renamed from: k */
    public int f486k;

    /* renamed from: l */
    public boolean f487l;

    /* renamed from: m */
    public boolean f488m;

    /* renamed from: n */
    public int f489n;

    /* renamed from: o */
    public akq f490o;

    /* renamed from: p */
    public akp f491p;

    /* renamed from: q */
    public int f492q;

    /* renamed from: r */
    public int f493r;

    /* renamed from: s */
    public long f494s;

    /* renamed from: t */
    private final bgr f495t;

    /* renamed from: u */
    private final Handler f496u;

    /* renamed from: v */
    private final ArrayDeque f497v;

    public ajy(akx[] akxArr, bgq bgq, akk akk, bhn bhn, bkf bkf, Looper looper) {
        String hexString = Integer.toHexString(System.identityHashCode(this));
        String str = blm.f4297e;
        StringBuilder sb = new StringBuilder(String.valueOf(hexString).length() + 30 + String.valueOf(str).length());
        sb.append("Init ");
        sb.append(hexString);
        sb.append(" [ExoPlayerLib/2.10.7] [");
        sb.append(str);
        sb.append("]");
        sb.toString();
        int length = akxArr.length;
        bks.m3512b(length > 0);
        this.f477b = (akx[]) bks.m3507a(akxArr);
        bgq bgq2 = (bgq) bks.m3507a(bgq);
        this.f482g = false;
        this.f484i = 0;
        this.f485j = false;
        this.f480e = new CopyOnWriteArrayList();
        this.f495t = new bgr(new akz[length], new bgl[length]);
        this.f481f = new alf();
        this.f490o = akq.f624a;
        alb alb = alb.f639a;
        this.f483h = 0;
        this.f478c = new ajo(this, looper);
        this.f491p = akp.m782a(0, this.f495t);
        this.f497v = new ArrayDeque();
        this.f479d = new ake(akxArr, bgq, this.f495t, akk, bhn, this.f482g, this.f484i, this.f485j, this.f478c, bkf);
        this.f496u = new Handler(this.f479d.f517b.getLooper());
    }

    /* renamed from: a */
    public final void mo388a(aks aks) {
        throw null;
    }

    /* renamed from: a */
    public final void mo389a(boolean z) {
        throw null;
    }

    /* renamed from: b */
    public final void mo390b(aks aks) {
        throw null;
    }

    /* renamed from: e */
    public final Looper mo391e() {
        throw null;
    }

    /* renamed from: g */
    public final int mo393g() {
        return this.f483h;
    }

    /* renamed from: h */
    public final boolean mo394h() {
        return this.f482g;
    }

    /* renamed from: i */
    public final int mo395i() {
        return this.f484i;
    }

    /* renamed from: j */
    public final boolean mo396j() {
        return this.f485j;
    }

    /* renamed from: a */
    public final akw mo385a(akv akv) {
        ake ake = this.f479d;
        alh alh = this.f491p.f611a;
        mo397k();
        return new akw(ake, akv, this.f496u);
    }

    /* renamed from: q */
    public final long mo403q() {
        if (!mo400n()) {
            return mo398l();
        }
        akp akp = this.f491p;
        akp.f611a.mo547a(akp.f612b.f2566a, this.f481f);
        akp akp2 = this.f491p;
        if (akp2.f614d != -9223372036854775807L) {
            return this.f481f.mo531a() + aja.m632a(this.f491p.f614d);
        }
        return akp2.f611a.mo548a(mo397k(), this.f419a).mo540a();
    }

    /* renamed from: o */
    public final int mo401o() {
        if (mo400n()) {
            return this.f491p.f612b.f2567b;
        }
        return -1;
    }

    /* renamed from: p */
    public final int mo402p() {
        if (mo400n()) {
            return this.f491p.f612b.f2568c;
        }
        return -1;
    }

    /* renamed from: l */
    public final long mo398l() {
        if (mo405s()) {
            return this.f494s;
        }
        if (this.f491p.f612b.mo1504a()) {
            return aja.m632a(this.f491p.f623m);
        }
        akp akp = this.f491p;
        return mo383a(akp.f612b, akp.f623m);
    }

    /* renamed from: r */
    public final alh mo404r() {
        return this.f491p.f611a;
    }

    /* renamed from: k */
    public final int mo397k() {
        if (mo405s()) {
            return this.f492q;
        }
        akp akp = this.f491p;
        akp.f611a.mo547a(akp.f612b.f2566a, this.f481f);
        return 0;
    }

    /* renamed from: f */
    public final int mo392f() {
        return this.f491p.f615e;
    }

    /* renamed from: a */
    public final akp mo384a(boolean z, boolean z2, boolean z3, int i) {
        awt awt;
        long j;
        alh alh;
        ajh ajh;
        aye aye;
        int i2;
        boolean z4 = true;
        long j2 = 0;
        if (z) {
            this.f492q = 0;
            this.f493r = 0;
            this.f494s = 0;
        } else {
            this.f492q = mo397k();
            if (!mo405s()) {
                akp akp = this.f491p;
                i2 = akp.f611a.mo525a(akp.f612b.f2566a);
            } else {
                i2 = this.f493r;
            }
            this.f493r = i2;
            this.f494s = mo398l();
            if (!z2) {
                z4 = false;
            }
        }
        if (z4) {
            awt = this.f491p.mo461a(this.f419a, this.f481f);
        } else {
            awt = this.f491p.f612b;
        }
        if (!z4) {
            j2 = this.f491p.f623m;
        }
        long j3 = j2;
        if (!z4) {
            j = this.f491p.f614d;
        } else {
            j = -9223372036854775807L;
        }
        long j4 = j;
        if (!z2) {
            alh = this.f491p.f611a;
        } else {
            alh = alh.f685a;
        }
        if (!z3) {
            ajh = this.f491p.f616f;
        } else {
            ajh = null;
        }
        ajh ajh2 = ajh;
        if (!z2) {
            aye = this.f491p.f618h;
        } else {
            aye = aye.f2750a;
        }
        return new akp(alh, awt, j3, j4, i, ajh2, false, aye, !z2 ? this.f491p.f619i : this.f495t, awt, j3, 0, j3);
    }

    /* renamed from: m */
    public final long mo399m() {
        return aja.m632a(this.f491p.f622l);
    }

    /* renamed from: a */
    public static void m658a(CopyOnWriteArrayList copyOnWriteArrayList, aix aix) {
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            aiw aiw = (aiw) it.next();
            if (!aiw.f418b) {
                aix.mo338a(aiw.f417a);
            }
        }
    }

    /* renamed from: n */
    public final boolean mo400n() {
        return !mo405s() && this.f491p.f612b.mo1504a();
    }

    /* renamed from: a */
    public final void mo386a(aix aix) {
        m657a(new ajn(new CopyOnWriteArrayList(this.f480e), aix));
    }

    /* renamed from: a */
    private final void m657a(Runnable runnable) {
        boolean isEmpty = this.f497v.isEmpty();
        this.f497v.addLast(runnable);
        if (!(!isEmpty)) {
            while (!this.f497v.isEmpty()) {
                ((Runnable) this.f497v.peekFirst()).run();
                this.f497v.removeFirst();
            }
        }
    }

    /* renamed from: a */
    public final long mo383a(awt awt, long j) {
        this.f491p.f611a.mo547a(awt.f2566a, this.f481f);
        return aja.m632a(j) + this.f481f.mo531a();
    }

    /* renamed from: s */
    public final boolean mo405s() {
        return this.f491p.f611a.mo552c() || this.f486k > 0;
    }

    /* renamed from: a */
    public final void mo387a(akp akp, boolean z, int i, int i2, boolean z2) {
        boolean a = mo339a();
        akp akp2 = this.f491p;
        this.f491p = akp;
        m657a(new ajx(akp, akp2, this.f480e, z, i2, z2, a != mo339a()));
    }
}
