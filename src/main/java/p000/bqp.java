package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: bqp */
/* compiled from: PG */
public final class bqp implements bqu {

    /* renamed from: a */
    public final bqx f4593a;

    /* renamed from: b */
    public final Lock f4594b;

    /* renamed from: c */
    public final Context f4595c;

    /* renamed from: d */
    public final bnv f4596d;

    /* renamed from: e */
    public bwi f4597e;

    /* renamed from: f */
    public boolean f4598f;

    /* renamed from: g */
    public boolean f4599g;

    /* renamed from: h */
    public btp f4600h;

    /* renamed from: i */
    public boolean f4601i;

    /* renamed from: j */
    public boolean f4602j;

    /* renamed from: k */
    public final bsv f4603k;

    /* renamed from: l */
    private bno f4604l;

    /* renamed from: m */
    private int f4605m;

    /* renamed from: n */
    private int f4606n = 0;

    /* renamed from: o */
    private int f4607o;

    /* renamed from: p */
    private final Bundle f4608p = new Bundle();

    /* renamed from: q */
    private final Set f4609q = new HashSet();

    /* renamed from: r */
    private boolean f4610r;

    /* renamed from: s */
    private final Map f4611s;

    /* renamed from: t */
    private final ArrayList f4612t = new ArrayList();

    /* renamed from: u */
    private final cel f4613u;

    public bqp(bqx bqx, bsv bsv, Map map, bnv bnv, cel cel, Lock lock, Context context, byte b, byte b2) {
        this.f4593a = bqx;
        this.f4603k = bsv;
        this.f4611s = map;
        this.f4596d = bnv;
        this.f4613u = cel;
        this.f4594b = lock;
        this.f4595c = context;
    }

    /* renamed from: c */
    private static final String m3977c(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    /* renamed from: b */
    public final void mo2311b() {
    }

    /* renamed from: a */
    public final void mo2306a() {
        this.f4593a.f4650g.clear();
        this.f4598f = false;
        this.f4604l = null;
        this.f4606n = 0;
        this.f4610r = true;
        this.f4599g = false;
        this.f4601i = false;
        HashMap hashMap = new HashMap();
        for (bok bok : this.f4611s.keySet()) {
            boj boj = (boj) this.f4593a.f4649f.get(bok.mo2237a());
            boolean booleanValue = ((Boolean) this.f4611s.get(bok)).booleanValue();
            if (boj.mo2231g()) {
                this.f4598f = true;
                if (booleanValue) {
                    this.f4609q.add(bok.mo2237a());
                } else {
                    this.f4610r = false;
                }
            }
            hashMap.put(boj, new bqg(this, bok, booleanValue));
        }
        if (this.f4598f) {
            this.f4603k.f4775g = Integer.valueOf(System.identityHashCode(this.f4593a.f4655l));
            bqn bqn = new bqn(this);
            cel cel = this.f4613u;
            Context context = this.f4595c;
            Looper looper = this.f4593a.f4655l.f4620d;
            bsv bsv = this.f4603k;
            this.f4597e = (bwi) cel.mo2161a(context, looper, bsv, bsv.f4774f, bqn, bqn);
        }
        this.f4607o = ((C0087dd) this.f4593a.f4649f).f8324c;
        this.f4612t.add(bqy.f4658a.submit(new bqj(this, hashMap)));
    }

    /* renamed from: h */
    private final void m3979h() {
        ArrayList arrayList = this.f4612t;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((Future) arrayList.get(i)).cancel(true);
        }
        this.f4612t.clear();
    }

    /* renamed from: f */
    public final void mo2324f() {
        this.f4598f = false;
        this.f4593a.f4655l.f4623g = Collections.emptySet();
        for (bog bog : this.f4609q) {
            if (!this.f4593a.f4650g.containsKey(bog)) {
                this.f4593a.f4650g.put(bog, new bno(17, null));
            }
        }
    }

    /* renamed from: b */
    public final boolean mo2321b(int i) {
        if (this.f4606n == i) {
            return true;
        }
        Log.w("GACConnecting", this.f4593a.f4655l.mo2330g());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GACConnecting", sb.toString());
        int i2 = this.f4607o;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i2);
        Log.w("GACConnecting", sb2.toString());
        String c = m3977c(this.f4606n);
        String c2 = m3977c(i);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c).length() + 70 + String.valueOf(c2).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c);
        sb3.append(" but received callback for step ");
        sb3.append(c2);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        mo2319b(new bno(8, null));
        return false;
    }

    /* renamed from: c */
    public final void mo2312c() {
        m3979h();
        m3976a(true);
        this.f4593a.mo2333d();
    }

    /* renamed from: a */
    private final void m3976a(boolean z) {
        bwi bwi = this.f4597e;
        if (bwi != null) {
            if (bwi.mo2229e() && z) {
                this.f4597e.mo2491m();
            }
            this.f4597e.mo2228d();
            this.f4600h = null;
        }
    }

    /* JADX INFO: finally extract failed */
    /* renamed from: g */
    private final void m3978g() {
        bqx bqx = this.f4593a;
        bqx.f4644a.lock();
        try {
            bqx.f4655l.mo2329f();
            bqx.f4653j = new bqe(bqx);
            bqx.f4653j.mo2306a();
            bqx.f4645b.signalAll();
            bqx.f4644a.unlock();
            bqy.f4658a.execute(new bqf(this));
            bwi bwi = this.f4597e;
            if (bwi != null) {
                if (this.f4601i) {
                    bwi.mo2489a(this.f4600h, this.f4602j);
                }
                m3976a(false);
            }
            for (bog bog : this.f4593a.f4650g.keySet()) {
                ((boj) this.f4593a.f4649f.get(bog)).mo2228d();
            }
            this.f4593a.f4656m.mo2292a(!this.f4608p.isEmpty() ? this.f4608p : null);
        } catch (Throwable th) {
            bqx.f4644a.unlock();
            throw th;
        }
    }

    /* renamed from: a */
    public final bpn mo2305a(bpn bpn) {
        this.f4593a.f4655l.f4621e.add(bpn);
        return bpn;
    }

    /* renamed from: b */
    public final bpn mo2310b(bpn bpn) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    /* renamed from: b */
    public final void mo2319b(bno bno) {
        m3979h();
        m3976a(!bno.mo2194a());
        this.f4593a.mo2333d();
        this.f4593a.f4656m.mo2293a(bno);
    }

    /* renamed from: d */
    public final boolean mo2322d() {
        int i = this.f4607o - 1;
        this.f4607o = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            Log.w("GACConnecting", this.f4593a.f4655l.mo2330g());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            mo2319b(new bno(8, null));
            return false;
        }
        bno bno = this.f4604l;
        if (bno == null) {
            return true;
        }
        this.f4593a.f4654k = this.f4605m;
        mo2319b(bno);
        return false;
    }

    /* renamed from: a */
    public final void mo2308a(Bundle bundle) {
        if (mo2321b(1)) {
            if (bundle != null) {
                this.f4608p.putAll(bundle);
            }
            if (mo2322d()) {
                m3978g();
            }
        }
    }

    /* renamed from: a */
    public final void mo2309a(bno bno, bok bok, boolean z) {
        if (mo2321b(1)) {
            mo2320b(bno, bok, z);
            if (mo2322d()) {
                m3978g();
            }
        }
    }

    /* renamed from: a */
    public final void mo2307a(int i) {
        mo2319b(new bno(8, null));
    }

    /* renamed from: b */
    public final void mo2320b(bno bno, bok bok, boolean z) {
        if ((!z || bno.mo2194a() || this.f4596d.mo2215a(null, bno.f4482b, null) != null) && this.f4604l == null) {
            this.f4604l = bno;
            this.f4605m = Integer.MAX_VALUE;
        }
        this.f4593a.f4650g.put(bok.mo2237a(), bno);
    }

    /* renamed from: a */
    public final boolean mo2318a(bno bno) {
        return this.f4610r && !bno.mo2194a();
    }

    /* renamed from: e */
    public final void mo2323e() {
        if (this.f4607o != 0) {
            return;
        }
        if (!this.f4598f || this.f4599g) {
            ArrayList arrayList = new ArrayList();
            this.f4606n = 1;
            Map map = this.f4593a.f4649f;
            this.f4607o = ((C0087dd) map).f8324c;
            for (bog bog : map.keySet()) {
                if (!this.f4593a.f4650g.containsKey(bog)) {
                    arrayList.add((boj) this.f4593a.f4649f.get(bog));
                } else if (mo2322d()) {
                    m3978g();
                }
            }
            if (!arrayList.isEmpty()) {
                this.f4612t.add(bqy.f4658a.submit(new bqk(this, arrayList)));
            }
        }
    }
}
