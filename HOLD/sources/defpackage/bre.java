package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

/* renamed from: bre  reason: default package */
/* compiled from: PG */
public final class bre implements boq, bor, bpu {
    public final Queue a = new LinkedList();
    public final boj b;
    public final bqb c;
    public final Map d = new HashMap();
    public final int e;
    public boolean f;
    public final List g = new ArrayList();
    public final /* synthetic */ bri h;
    private final boi i;
    private final bpk j;
    private final Set k = new HashSet();
    private final brz l;
    private bno m = null;

    public bre(bri bri, boo boo) {
        this.h = bri;
        boj a2 = boo.b.b().a(boo.a, bri.l.getLooper(), boo.a().a(), null, this, this);
        this.b = a2;
        if (a2 instanceof bue) {
            bue bue = (bue) a2;
            this.i = null;
        } else {
            this.i = a2;
        }
        this.j = boo.c;
        this.c = new bqb();
        this.e = boo.e;
        if (this.b.g()) {
            this.l = new brz(bri.g, bri.l, boo.a().a());
        } else {
            this.l = null;
        }
    }

    private final void b(bno bno) {
        Iterator it = this.k.iterator();
        if (it.hasNext()) {
            cel cel = (cel) it.next();
            if (bty.a(bno, bno.a)) {
                this.b.j();
            }
            throw null;
        }
        this.k.clear();
    }

    private final boolean b(bpi bpi) {
        bnr bnr;
        if (!(bpi instanceof bpd)) {
            c(bpi);
            return true;
        }
        bpd bpd = (bpd) bpi;
        bnr[] a2 = bpd.a(this);
        bnr bnr2 = null;
        if (a2 != null && a2.length != 0) {
            bnr[] h2 = this.b.h();
            if (h2 == null) {
                h2 = new bnr[0];
            }
            cl clVar = new cl(r6);
            for (bnr bnr3 : h2) {
                clVar.put(bnr3.a, Long.valueOf(bnr3.a()));
            }
            int length = a2.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                bnr = a2[i2];
                if (!clVar.containsKey(bnr.a) || ((Long) clVar.get(bnr.a)).longValue() < bnr.a()) {
                    bnr2 = bnr;
                } else {
                    i2++;
                }
            }
            bnr2 = bnr;
        }
        if (bnr2 != null) {
            bpd.b(this);
            bpd.a(new bpc(bnr2));
            return false;
        }
        c(bpi);
        return true;
    }

    public final void e() {
        bri bri = this.h;
        Status status = bri.a;
        buh.a(bri.l);
        this.m = null;
    }

    public final void h() {
        bri bri = this.h;
        Status status = bri.a;
        buh.a(bri.l);
        if (!this.b.e() && !this.b.f()) {
            try {
                bri bri2 = this.h;
                int a2 = bri2.h.a(bri2.g, this.b);
                if (a2 == 0) {
                    brh brh = new brh(this.h, this.b, this.j);
                    if (this.b.g()) {
                        brz brz = this.l;
                        bwi bwi = brz.e;
                        if (bwi != null) {
                            bwi.d();
                        }
                        brz.d.g = Integer.valueOf(System.identityHashCode(brz));
                        cel cel = brz.g;
                        Context context = brz.a;
                        Looper looper = brz.b.getLooper();
                        bsv bsv = brz.d;
                        brz.e = (bwi) cel.a(context, looper, bsv, bsv.f, brz, brz);
                        brz.f = brh;
                        Set set = brz.c;
                        if (set != null && !set.isEmpty()) {
                            brz.e.n();
                        } else {
                            brz.b.post(new brw(brz));
                        }
                    }
                    try {
                        this.b.a(brh);
                    } catch (SecurityException e2) {
                        a(new bno(10), e2);
                    }
                } else {
                    a(new bno(a2, null));
                }
            } catch (IllegalStateException e3) {
                a(new bno(10), e3);
            }
        }
    }

    public final void a(bpi bpi) {
        bri bri = this.h;
        Status status = bri.a;
        buh.a(bri.l);
        if (!this.b.e()) {
            this.a.add(bpi);
            bno bno = this.m;
            if (bno == null || !bno.a()) {
                h();
            } else {
                a(this.m);
            }
        } else if (!b(bpi)) {
            this.a.add(bpi);
        } else {
            g();
        }
    }

    public final void a(Status status) {
        bri bri = this.h;
        Status status2 = bri.a;
        buh.a(bri.l);
        for (bpi a2 : this.a) {
            a2.a(status);
        }
        this.a.clear();
    }

    public final void c() {
        ArrayList arrayList = new ArrayList(this.a);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            bpi bpi = (bpi) arrayList.get(i2);
            if (this.b.e()) {
                if (b(bpi)) {
                    this.a.remove(bpi);
                }
                i2++;
            } else {
                return;
            }
        }
    }

    public final void a(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        bri bri = this.h;
        Status status = bri.a;
        if (myLooper != bri.l.getLooper()) {
            this.h.l.post(new bra(this));
        } else {
            a();
        }
    }

    public final void a() {
        e();
        b(bno.a);
        f();
        Iterator it = this.d.values().iterator();
        if (!it.hasNext()) {
            c();
            g();
            return;
        }
        bru bru = (bru) it.next();
        throw null;
    }

    public final void a(bno bno) {
        a(bno, null);
    }

    private final void a(bno bno, Exception exc) {
        bwi bwi;
        bri bri = this.h;
        Status status = bri.a;
        buh.a(bri.l);
        brz brz = this.l;
        if (!(brz == null || (bwi = brz.e) == null)) {
            bwi.d();
        }
        e();
        this.h.h.a();
        b(bno);
        if (bno.b == 4) {
            a(bri.b);
        } else if (this.a.isEmpty()) {
            this.m = bno;
        } else if (exc != null) {
            buh.a(this.h.l);
            for (bpi a2 : this.a) {
                a2.a(exc);
            }
            this.a.clear();
        } else {
            synchronized (bri.f) {
                bpp bpp = this.h.m;
            }
            if (!this.h.a(bno, this.e)) {
                if (bno.b == 18) {
                    this.f = true;
                }
                if (!this.f) {
                    String str = this.j.a.a;
                    String valueOf = String.valueOf(bno);
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(valueOf).length());
                    sb.append("API: ");
                    sb.append(str);
                    sb.append(" is not available on this device. Connection failed with: ");
                    sb.append(valueOf);
                    a(new Status(17, sb.toString()));
                    return;
                }
                Handler handler = this.h.l;
                handler.sendMessageDelayed(Message.obtain(handler, 9, this.j), this.h.c);
            }
        }
    }

    public final void a(int i2) {
        Looper myLooper = Looper.myLooper();
        bri bri = this.h;
        Status status = bri.a;
        if (myLooper != bri.l.getLooper()) {
            this.h.l.post(new brb(this));
        } else {
            b();
        }
    }

    public final void b() {
        e();
        this.f = true;
        this.c.a(true, bse.a);
        bri bri = this.h;
        Status status = bri.a;
        Handler handler = bri.l;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.j), this.h.c);
        Handler handler2 = this.h.l;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.j), this.h.d);
        this.h.h.a();
        Iterator it = this.d.values().iterator();
        if (it.hasNext()) {
            bru bru = (bru) it.next();
            throw null;
        }
    }

    public final boolean i() {
        return this.b.g();
    }

    public final void g() {
        bri bri = this.h;
        Status status = bri.a;
        bri.l.removeMessages(12, this.j);
        Handler handler = this.h.l;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.j), this.h.e);
    }

    private final void c(bpi bpi) {
        bpi.a(this.c, i());
        try {
            bpi.c(this);
        } catch (DeadObjectException e2) {
            a(1);
            this.b.d();
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.i.getClass().getName()), th);
        }
    }

    public final void d() {
        bri bri = this.h;
        Status status = bri.a;
        buh.a(bri.l);
        a(bri.a);
        this.c.a(false, bri.a);
        for (brq bph : (brq[]) this.d.keySet().toArray(new brq[this.d.size()])) {
            a(new bph(bph, new bxe()));
        }
        b(new bno(4));
        if (this.b.e()) {
            this.b.a(new brd(this));
        }
    }

    public final void f() {
        if (this.f) {
            bri bri = this.h;
            Status status = bri.a;
            bri.l.removeMessages(11, this.j);
            this.h.l.removeMessages(9, this.j);
            this.f = false;
        }
    }
}
