package defpackage;

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

/* renamed from: bqp  reason: default package */
/* compiled from: PG */
public final class bqp implements bqu {
    public final bqx a;
    public final Lock b;
    public final Context c;
    public final bnv d;
    public bwi e;
    public boolean f;
    public boolean g;
    public btp h;
    public boolean i;
    public boolean j;
    public final bsv k;
    private bno l;
    private int m;
    private int n = 0;
    private int o;
    private final Bundle p = new Bundle();
    private final Set q = new HashSet();
    private boolean r;
    private final Map s;
    private final ArrayList t = new ArrayList();
    private final cel u;

    public bqp(bqx bqx, bsv bsv, Map map, bnv bnv, cel cel, Lock lock, Context context, byte b2, byte b3) {
        this.a = bqx;
        this.k = bsv;
        this.s = map;
        this.d = bnv;
        this.u = cel;
        this.b = lock;
        this.c = context;
    }

    private static final String c(int i2) {
        return i2 != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    public final void b() {
    }

    public final void a() {
        this.a.g.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.g = false;
        this.i = false;
        HashMap hashMap = new HashMap();
        for (bok bok : this.s.keySet()) {
            boj boj = (boj) this.a.f.get(bok.a());
            boolean booleanValue = ((Boolean) this.s.get(bok)).booleanValue();
            if (boj.g()) {
                this.f = true;
                if (booleanValue) {
                    this.q.add(bok.a());
                } else {
                    this.r = false;
                }
            }
            hashMap.put(boj, new bqg(this, bok, booleanValue));
        }
        if (this.f) {
            this.k.g = Integer.valueOf(System.identityHashCode(this.a.l));
            bqn bqn = new bqn(this);
            cel cel = this.u;
            Context context = this.c;
            Looper looper = this.a.l.d;
            bsv bsv = this.k;
            this.e = (bwi) cel.a(context, looper, bsv, bsv.f, bqn, bqn);
        }
        this.o = ((dd) this.a.f).c;
        this.t.add(bqy.a.submit(new bqj(this, hashMap)));
    }

    private final void h() {
        ArrayList arrayList = this.t;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((Future) arrayList.get(i2)).cancel(true);
        }
        this.t.clear();
    }

    public final void f() {
        this.f = false;
        this.a.l.g = Collections.emptySet();
        for (bog bog : this.q) {
            if (!this.a.g.containsKey(bog)) {
                this.a.g.put(bog, new bno(17, null));
            }
        }
    }

    public final boolean b(int i2) {
        if (this.n == i2) {
            return true;
        }
        Log.w("GACConnecting", this.a.l.g());
        String valueOf = String.valueOf(this);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
        sb.append("Unexpected callback in ");
        sb.append(valueOf);
        Log.w("GACConnecting", sb.toString());
        int i3 = this.o;
        StringBuilder sb2 = new StringBuilder(33);
        sb2.append("mRemainingConnections=");
        sb2.append(i3);
        Log.w("GACConnecting", sb2.toString());
        String c2 = c(this.n);
        String c3 = c(i2);
        StringBuilder sb3 = new StringBuilder(String.valueOf(c2).length() + 70 + String.valueOf(c3).length());
        sb3.append("GoogleApiClient connecting is in step ");
        sb3.append(c2);
        sb3.append(" but received callback for step ");
        sb3.append(c3);
        Log.e("GACConnecting", sb3.toString(), new Exception());
        b(new bno(8, null));
        return false;
    }

    public final void c() {
        h();
        a(true);
        this.a.d();
    }

    private final void a(boolean z) {
        bwi bwi = this.e;
        if (bwi != null) {
            if (bwi.e() && z) {
                this.e.m();
            }
            this.e.d();
            this.h = null;
        }
    }

    /* JADX INFO: finally extract failed */
    private final void g() {
        bqx bqx = this.a;
        bqx.a.lock();
        try {
            bqx.l.f();
            bqx.j = new bqe(bqx);
            bqx.j.a();
            bqx.b.signalAll();
            bqx.a.unlock();
            bqy.a.execute(new bqf(this));
            bwi bwi = this.e;
            if (bwi != null) {
                if (this.i) {
                    bwi.a(this.h, this.j);
                }
                a(false);
            }
            for (bog bog : this.a.g.keySet()) {
                ((boj) this.a.f.get(bog)).d();
            }
            this.a.m.a(!this.p.isEmpty() ? this.p : null);
        } catch (Throwable th) {
            bqx.a.unlock();
            throw th;
        }
    }

    public final bpn a(bpn bpn) {
        this.a.l.e.add(bpn);
        return bpn;
    }

    public final bpn b(bpn bpn) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    public final void b(bno bno) {
        h();
        a(!bno.a());
        this.a.d();
        this.a.m.a(bno);
    }

    public final boolean d() {
        int i2 = this.o - 1;
        this.o = i2;
        if (i2 > 0) {
            return false;
        }
        if (i2 < 0) {
            Log.w("GACConnecting", this.a.l.g());
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            b(new bno(8, null));
            return false;
        }
        bno bno = this.l;
        if (bno == null) {
            return true;
        }
        this.a.k = this.m;
        b(bno);
        return false;
    }

    public final void a(Bundle bundle) {
        if (b(1)) {
            if (bundle != null) {
                this.p.putAll(bundle);
            }
            if (d()) {
                g();
            }
        }
    }

    public final void a(bno bno, bok bok, boolean z) {
        if (b(1)) {
            b(bno, bok, z);
            if (d()) {
                g();
            }
        }
    }

    public final void a(int i2) {
        b(new bno(8, null));
    }

    public final void b(bno bno, bok bok, boolean z) {
        if ((!z || bno.a() || this.d.a(null, bno.b, null) != null) && this.l == null) {
            this.l = bno;
            this.m = Integer.MAX_VALUE;
        }
        this.a.g.put(bok.a(), bno);
    }

    public final boolean a(bno bno) {
        return this.r && !bno.a();
    }

    public final void e() {
        if (this.o != 0) {
            return;
        }
        if (!this.f || this.g) {
            ArrayList arrayList = new ArrayList();
            this.n = 1;
            Map map = this.a.f;
            this.o = ((dd) map).c;
            for (bog bog : map.keySet()) {
                if (!this.a.g.containsKey(bog)) {
                    arrayList.add((boj) this.a.f.get(bog));
                } else if (d()) {
                    g();
                }
            }
            if (!arrayList.isEmpty()) {
                this.t.add(bqy.a.submit(new bqk(this, arrayList)));
            }
        }
    }
}
