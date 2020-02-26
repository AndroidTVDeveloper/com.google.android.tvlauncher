package p000;

import android.view.Surface;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: alk */
/* compiled from: PG */
public final class alk implements aks, aub, amc, bmk, axh, bmb, als {

    /* renamed from: a */
    public final CopyOnWriteArraySet f696a = new CopyOnWriteArraySet();

    /* renamed from: b */
    public final alj f697b = new alj();

    /* renamed from: c */
    public akt f698c;

    /* renamed from: d */
    private final bkf f699d;

    /* renamed from: e */
    private final alg f700e = new alg();

    public alk(bkf bkf) {
        this.f699d = (bkf) bks.m3507a(bkf);
    }

    /* renamed from: b */
    public final void mo468b() {
    }

    /* renamed from: m */
    public final void mo567m() {
    }

    /* renamed from: a */
    private final bsh m945a(alh alh, int i, awt awt) {
        if (alh.mo552c()) {
            awt = null;
        }
        this.f699d.mo2032a();
        boolean z = false;
        if (alh == this.f698c.mo404r() && i == this.f698c.mo397k()) {
            z = true;
        }
        if (awt == null || !awt.mo1504a()) {
            if (z) {
                this.f698c.mo403q();
            } else if (!alh.mo552c()) {
                alh.mo548a(i, this.f700e).mo540a();
            }
        } else if (z && this.f698c.mo401o() == awt.f2567b && this.f698c.mo402p() == awt.f2568c) {
            this.f698c.mo398l();
        }
        this.f698c.mo398l();
        this.f698c.mo399m();
        return new bsh();
    }

    /* renamed from: a */
    public final void mo556a(ali ali) {
        bks.m3507a(this.f698c);
        if (ali == null) {
            int k = this.f698c.mo397k();
            alj alj = this.f697b;
            ali ali2 = null;
            int i = 0;
            while (true) {
                if (i >= alj.f688a.size()) {
                    break;
                }
                ali ali3 = (ali) alj.f688a.get(i);
                int a = alj.f694g.mo525a(ali3.f686a.f2566a);
                if (a != -1) {
                    alj.f694g.mo551a(a, alj.f690c);
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
                alh r = this.f698c.mo404r();
                if (k >= r.mo524a()) {
                    r = alh.f685a;
                }
                m945a(r, k, (awt) null);
                return;
            }
        }
        m945a(ali.f687b, 0, ali.f686a);
    }

    /* renamed from: q */
    private final void m947q() {
        mo556a(this.f697b.f692e);
    }

    /* renamed from: d */
    private final void m946d(awt awt) {
        bks.m3507a(this.f698c);
        if (awt == null) {
            alh r = this.f698c.mo404r();
            if (r.mo524a() <= 0) {
                r = alh.f685a;
            }
            m945a(r, 0, (awt) null);
            return;
        }
        ali ali = (ali) this.f697b.f689b.get(awt);
        if (ali == null) {
            m945a(alh.f685a, 0, awt);
        } else {
            mo556a(ali);
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v2, resolved type: ali} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo568n() {
        /*
            r3 = this;
            alj r0 = r3.f697b
            java.util.ArrayList r1 = r0.f688a
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L_0x0023
            alh r1 = r0.f694g
            boolean r1 = r1.mo552c()
            if (r1 != 0) goto L_0x0023
            boolean r1 = r0.f695h
            if (r1 != 0) goto L_0x0022
            java.util.ArrayList r0 = r0.f688a
            r1 = 0
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            ali r2 = (p000.ali) r2
            goto L_0x0024
        L_0x0022:
        L_0x0023:
        L_0x0024:
            r3.mo556a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p000.alk.mo568n():void");
    }

    /* renamed from: r */
    private final void m948r() {
        mo556a(this.f697b.f693f);
    }

    /* renamed from: b */
    public final void mo506b(String str, long j, long j2) {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo585f();
        }
    }

    /* renamed from: d */
    public final void mo509d(ani ani) {
        m947q();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo583d();
        }
    }

    /* renamed from: c */
    public final void mo508c(ani ani) {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo584e();
        }
    }

    /* renamed from: b */
    public final void mo504b(akh akh) {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo586g();
        }
    }

    /* renamed from: c */
    public final void mo507c(int i) {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo580a();
        }
    }

    /* renamed from: a */
    public final void mo497a(int i, long j, long j2) {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo581b();
        }
    }

    /* renamed from: a */
    public final void mo560a(awt awt, buk buk) {
        m946d(awt);
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo587h();
        }
    }

    /* renamed from: a */
    public final void mo496a(int i, long j) {
        m947q();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo588i();
        }
    }

    /* renamed from: c */
    public final void mo470c() {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo589j();
        }
    }

    /* renamed from: a */
    public final void mo558a(awt awt, buj buj, buk buk) {
        m946d(awt);
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo590k();
        }
    }

    /* renamed from: b */
    public final void mo562b(awt awt, buj buj, buk buk) {
        m946d(awt);
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo591l();
        }
    }

    /* renamed from: a */
    public final void mo559a(awt awt, buj buj, buk buk, IOException iOException, boolean z) {
        m946d(awt);
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo592m();
        }
    }

    /* renamed from: c */
    public final void mo565c(awt awt, buj buj, buk buk) {
        m946d(awt);
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo593n();
        }
    }

    /* renamed from: d */
    public final void mo471d() {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo594o();
        }
    }

    /* renamed from: a */
    public final void mo557a(awt awt) {
        alh alh;
        alj alj = this.f697b;
        if (alj.f694g.mo525a(awt.f2566a) == -1) {
            alh = alh.f685a;
        } else {
            alh = alj.f694g;
        }
        ali ali = new ali(awt, alh);
        alj.f688a.add(ali);
        alj.f689b.put(awt, ali);
        alj.f691d = (ali) alj.f688a.get(0);
        if (alj.f688a.size() == 1 && !alj.f694g.mo552c()) {
            alj.f692e = alj.f691d;
        }
        m946d(awt);
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo595p();
        }
    }

    /* renamed from: b */
    public final void mo561b(awt awt) {
        ali ali;
        m946d(awt);
        alj alj = this.f697b;
        ali ali2 = (ali) alj.f689b.remove(awt);
        if (ali2 != null) {
            alj.f688a.remove(ali2);
            ali ali3 = alj.f693f;
            if (ali3 != null && awt.equals(ali3.f686a)) {
                if (!alj.f688a.isEmpty()) {
                    ali = (ali) alj.f688a.get(0);
                } else {
                    ali = null;
                }
                alj.f693f = ali;
            }
            if (!alj.f688a.isEmpty()) {
                alj.f691d = (ali) alj.f688a.get(0);
            }
            Iterator it = this.f696a.iterator();
            while (it.hasNext()) {
                ((all) it.next()).mo596q();
            }
        }
    }

    /* renamed from: a */
    public final void mo501a(atw atw) {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo597r();
        }
    }

    /* renamed from: e */
    public final void mo472e() {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo598s();
        }
    }

    /* renamed from: f */
    public final void mo473f() {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo599t();
        }
    }

    /* renamed from: g */
    public final void mo474g() {
        m947q();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo600u();
        }
    }

    /* renamed from: b */
    public final void mo469b(int i) {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo601v();
        }
    }

    /* renamed from: h */
    public final void mo475h() {
        alj alj = this.f697b;
        alj.f692e = alj.f691d;
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo602w();
        }
    }

    /* renamed from: c */
    public final void mo564c(awt awt) {
        alj alj = this.f697b;
        alj.f693f = (ali) alj.f689b.get(awt);
        m946d(awt);
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo603x();
        }
    }

    /* renamed from: a */
    public final void mo499a(Surface surface) {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo604y();
        }
    }

    /* renamed from: i */
    public final void mo476i() {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo605z();
        }
    }

    /* renamed from: a */
    public final void mo466a() {
        alj alj = this.f697b;
        if (alj.f695h) {
            alj.f695h = false;
            alj.f692e = alj.f691d;
            mo568n();
            Iterator it = this.f696a.iterator();
            while (it.hasNext()) {
                ((all) it.next()).mo571A();
            }
        }
    }

    /* renamed from: j */
    public final void mo477j() {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo573C();
        }
    }

    /* renamed from: o */
    public final void mo569o() {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo574D();
        }
    }

    /* renamed from: a */
    public final void mo467a(alh alh) {
        alj alj = this.f697b;
        for (int i = 0; i < alj.f688a.size(); i++) {
            ali a = alj.mo555a((ali) alj.f688a.get(i), alh);
            alj.f688a.set(i, a);
            alj.f689b.put(a.f686a, a);
        }
        ali ali = alj.f693f;
        if (ali != null) {
            alj.f693f = alj.mo555a(ali, alh);
        }
        alj.f694g = alh;
        alj.f692e = alj.f691d;
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo575E();
        }
    }

    /* renamed from: k */
    public final void mo478k() {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo576F();
        }
    }

    /* renamed from: b */
    public final void mo563b(awt awt, buk buk) {
        m946d(awt);
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo577G();
        }
    }

    /* renamed from: a */
    public final void mo502a(String str, long j, long j2) {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo585f();
        }
    }

    /* renamed from: b */
    public final void mo505b(ani ani) {
        m947q();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo583d();
        }
    }

    /* renamed from: a */
    public final void mo500a(ani ani) {
        mo568n();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo584e();
        }
    }

    /* renamed from: a */
    public final void mo498a(akh akh) {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo586g();
        }
    }

    /* renamed from: a */
    public final void mo495a(int i, int i2, int i3, float f) {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo578H();
        }
    }

    /* renamed from: p */
    public final void mo570p() {
        m948r();
        Iterator it = this.f696a.iterator();
        while (it.hasNext()) {
            ((all) it.next()).mo579I();
        }
    }

    /* renamed from: l */
    public final void mo566l() {
        ArrayList arrayList = new ArrayList(this.f697b.f688a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mo561b(((ali) arrayList.get(i)).f686a);
        }
    }
}
