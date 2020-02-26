package p000;

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

/* renamed from: bre */
/* compiled from: PG */
public final class bre implements boq, bor, bpu {

    /* renamed from: a */
    public final Queue f4664a = new LinkedList();

    /* renamed from: b */
    public final boj f4665b;

    /* renamed from: c */
    public final bqb f4666c;

    /* renamed from: d */
    public final Map f4667d = new HashMap();

    /* renamed from: e */
    public final int f4668e;

    /* renamed from: f */
    public boolean f4669f;

    /* renamed from: g */
    public final List f4670g = new ArrayList();

    /* renamed from: h */
    public final /* synthetic */ bri f4671h;

    /* renamed from: i */
    private final boi f4672i;

    /* renamed from: j */
    private final bpk f4673j;

    /* renamed from: k */
    private final Set f4674k = new HashSet();

    /* renamed from: l */
    private final brz f4675l;

    /* renamed from: m */
    private bno f4676m = null;

    public bre(bri bri, boo boo) {
        this.f4671h = bri;
        boj a = boo.f4516b.mo2238b().mo2161a(boo.f4515a, bri.f4697l.getLooper(), boo.mo2241a().mo2404a(), null, this, this);
        this.f4665b = a;
        if (a instanceof bue) {
            bue bue = (bue) a;
            this.f4672i = null;
        } else {
            this.f4672i = a;
        }
        this.f4673j = boo.f4517c;
        this.f4666c = new bqb();
        this.f4668e = boo.f4519e;
        if (this.f4665b.mo2231g()) {
            this.f4675l = new brz(bri.f4692g, bri.f4697l, boo.mo2241a().mo2404a());
        } else {
            this.f4675l = null;
        }
    }

    /* renamed from: b */
    private final void m4039b(bno bno) {
        Iterator it = this.f4674k.iterator();
        if (it.hasNext()) {
            cel cel = (cel) it.next();
            if (bty.m4184a(bno, bno.f4481a)) {
                this.f4665b.mo2234j();
            }
            throw null;
        }
        this.f4674k.clear();
    }

    /* renamed from: b */
    private final boolean m4040b(bpi bpi) {
        bnr bnr;
        if (!(bpi instanceof bpd)) {
            m4041c(bpi);
            return true;
        }
        bpd bpd = (bpd) bpi;
        bnr[] a = bpd.mo2260a(this);
        bnr bnr2 = null;
        if (a != null && a.length != 0) {
            bnr[] h = this.f4665b.mo2232h();
            if (h == null) {
                h = new bnr[0];
            }
            C0067cl clVar = new C0067cl(r6);
            for (bnr bnr3 : h) {
                clVar.put(bnr3.f4488a, Long.valueOf(bnr3.mo2204a()));
            }
            int length = a.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                bnr = a[i];
                if (!clVar.containsKey(bnr.f4488a) || ((Long) clVar.get(bnr.f4488a)).longValue() < bnr.mo2204a()) {
                    bnr2 = bnr;
                } else {
                    i++;
                }
            }
            bnr2 = bnr;
        }
        if (bnr2 != null) {
            bpd.mo2261b(this);
            bpd.mo2264a(new bpc(bnr2));
            return false;
        }
        m4041c(bpi);
        return true;
    }

    /* renamed from: e */
    public final void mo2344e() {
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        buh.m4202a(bri.f4697l);
        this.f4676m = null;
    }

    /* renamed from: h */
    public final void mo2347h() {
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        buh.m4202a(bri.f4697l);
        if (!this.f4665b.mo2229e() && !this.f4665b.mo2230f()) {
            try {
                bri bri2 = this.f4671h;
                int a = bri2.f4693h.mo2435a(bri2.f4692g, this.f4665b);
                if (a == 0) {
                    brh brh = new brh(this.f4671h, this.f4665b, this.f4673j);
                    if (this.f4665b.mo2231g()) {
                        brz brz = this.f4675l;
                        bwi bwi = brz.f4717e;
                        if (bwi != null) {
                            bwi.mo2228d();
                        }
                        brz.f4716d.f4775g = Integer.valueOf(System.identityHashCode(brz));
                        cel cel = brz.f4719g;
                        Context context = brz.f4713a;
                        Looper looper = brz.f4714b.getLooper();
                        bsv bsv = brz.f4716d;
                        brz.f4717e = (bwi) cel.mo2161a(context, looper, bsv, bsv.f4774f, brz, brz);
                        brz.f4718f = brh;
                        Set set = brz.f4715c;
                        if (set != null && !set.isEmpty()) {
                            brz.f4717e.mo2492n();
                        } else {
                            brz.f4714b.post(new brw(brz));
                        }
                    }
                    try {
                        this.f4665b.mo2224a(brh);
                    } catch (SecurityException e) {
                        m4038a(new bno(10), e);
                    }
                } else {
                    mo2290a(new bno(a, null));
                }
            } catch (IllegalStateException e2) {
                m4038a(new bno(10), e2);
            }
        }
    }

    /* renamed from: a */
    public final void mo2339a(bpi bpi) {
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        buh.m4202a(bri.f4697l);
        if (!this.f4665b.mo2229e()) {
            this.f4664a.add(bpi);
            bno bno = this.f4676m;
            if (bno == null || !bno.mo2194a()) {
                mo2347h();
            } else {
                mo2290a(this.f4676m);
            }
        } else if (!m4040b(bpi)) {
            this.f4664a.add(bpi);
        } else {
            mo2346g();
        }
    }

    /* renamed from: a */
    public final void mo2340a(Status status) {
        bri bri = this.f4671h;
        Status status2 = bri.f4685a;
        buh.m4202a(bri.f4697l);
        for (bpi a : this.f4664a) {
            a.mo2263a(status);
        }
        this.f4664a.clear();
    }

    /* renamed from: c */
    public final void mo2342c() {
        ArrayList arrayList = new ArrayList(this.f4664a);
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            bpi bpi = (bpi) arrayList.get(i);
            if (this.f4665b.mo2229e()) {
                if (m4040b(bpi)) {
                    this.f4664a.remove(bpi);
                }
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public final void mo2289a(Bundle bundle) {
        Looper myLooper = Looper.myLooper();
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        if (myLooper != bri.f4697l.getLooper()) {
            this.f4671h.f4697l.post(new bra(this));
        } else {
            mo2338a();
        }
    }

    /* renamed from: a */
    public final void mo2338a() {
        mo2344e();
        m4039b(bno.f4481a);
        mo2345f();
        Iterator it = this.f4667d.values().iterator();
        if (!it.hasNext()) {
            mo2342c();
            mo2346g();
            return;
        }
        bru bru = (bru) it.next();
        throw null;
    }

    /* renamed from: a */
    public final void mo2290a(bno bno) {
        m4038a(bno, null);
    }

    /* renamed from: a */
    private final void m4038a(bno bno, Exception exc) {
        bwi bwi;
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        buh.m4202a(bri.f4697l);
        brz brz = this.f4675l;
        if (!(brz == null || (bwi = brz.f4717e) == null)) {
            bwi.mo2228d();
        }
        mo2344e();
        this.f4671h.f4693h.mo2436a();
        m4039b(bno);
        if (bno.f4482b == 4) {
            mo2340a(bri.f4686b);
        } else if (this.f4664a.isEmpty()) {
            this.f4676m = bno;
        } else if (exc != null) {
            buh.m4202a(this.f4671h.f4697l);
            for (bpi a : this.f4664a) {
                a.mo2264a(exc);
            }
            this.f4664a.clear();
        } else {
            synchronized (bri.f4687f) {
                bpp bpp = this.f4671h.f4698m;
            }
            if (!this.f4671h.mo2355a(bno, this.f4668e)) {
                if (bno.f4482b == 18) {
                    this.f4669f = true;
                }
                if (!this.f4669f) {
                    String str = this.f4673j.f4542a.f4507a;
                    String valueOf = String.valueOf(bno);
                    StringBuilder sb = new StringBuilder(str.length() + 63 + String.valueOf(valueOf).length());
                    sb.append("API: ");
                    sb.append(str);
                    sb.append(" is not available on this device. Connection failed with: ");
                    sb.append(valueOf);
                    mo2340a(new Status(17, sb.toString()));
                    return;
                }
                Handler handler = this.f4671h.f4697l;
                handler.sendMessageDelayed(Message.obtain(handler, 9, this.f4673j), this.f4671h.f4689c);
            }
        }
    }

    /* renamed from: a */
    public final void mo2288a(int i) {
        Looper myLooper = Looper.myLooper();
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        if (myLooper != bri.f4697l.getLooper()) {
            this.f4671h.f4697l.post(new brb(this));
        } else {
            mo2341b();
        }
    }

    /* renamed from: b */
    public final void mo2341b() {
        mo2344e();
        this.f4669f = true;
        this.f4666c.mo2303a(true, bse.f4722a);
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        Handler handler = bri.f4697l;
        handler.sendMessageDelayed(Message.obtain(handler, 9, this.f4673j), this.f4671h.f4689c);
        Handler handler2 = this.f4671h.f4697l;
        handler2.sendMessageDelayed(Message.obtain(handler2, 11, this.f4673j), this.f4671h.f4690d);
        this.f4671h.f4693h.mo2436a();
        Iterator it = this.f4667d.values().iterator();
        if (it.hasNext()) {
            bru bru = (bru) it.next();
            throw null;
        }
    }

    /* renamed from: i */
    public final boolean mo2348i() {
        return this.f4665b.mo2231g();
    }

    /* renamed from: g */
    public final void mo2346g() {
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        bri.f4697l.removeMessages(12, this.f4673j);
        Handler handler = this.f4671h.f4697l;
        handler.sendMessageDelayed(handler.obtainMessage(12, this.f4673j), this.f4671h.f4691e);
    }

    /* renamed from: c */
    private final void m4041c(bpi bpi) {
        bpi.mo2262a(this.f4666c, mo2348i());
        try {
            bpi.mo2265c(this);
        } catch (DeadObjectException e) {
            mo2288a(1);
            this.f4665b.mo2228d();
        } catch (Throwable th) {
            throw new IllegalStateException(String.format("Error in GoogleApi implementation for client %s.", this.f4672i.getClass().getName()), th);
        }
    }

    /* renamed from: d */
    public final void mo2343d() {
        bri bri = this.f4671h;
        Status status = bri.f4685a;
        buh.m4202a(bri.f4697l);
        mo2340a(bri.f4685a);
        this.f4666c.mo2303a(false, bri.f4685a);
        for (brq bph : (brq[]) this.f4667d.keySet().toArray(new brq[this.f4667d.size()])) {
            mo2339a(new bph(bph, new bxe()));
        }
        m4039b(new bno(4));
        if (this.f4665b.mo2229e()) {
            this.f4665b.mo2225a(new brd(this));
        }
    }

    /* renamed from: f */
    public final void mo2345f() {
        if (this.f4669f) {
            bri bri = this.f4671h;
            Status status = bri.f4685a;
            bri.f4697l.removeMessages(11, this.f4673j);
            this.f4671h.f4697l.removeMessages(9, this.f4673j);
            this.f4669f = false;
        }
    }
}
