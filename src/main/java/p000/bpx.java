package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;

/* renamed from: bpx */
/* compiled from: PG */
final class bpx implements brn {

    /* renamed from: a */
    public final bqx f4557a;

    /* renamed from: b */
    public final bqx f4558b;

    /* renamed from: c */
    public Bundle f4559c;

    /* renamed from: d */
    public bno f4560d = null;

    /* renamed from: e */
    public bno f4561e = null;

    /* renamed from: f */
    public boolean f4562f = false;

    /* renamed from: g */
    public final Lock f4563g;

    /* renamed from: h */
    private final bqt f4564h;

    /* renamed from: i */
    private final Map f4565i;

    /* renamed from: j */
    private final Set f4566j = Collections.newSetFromMap(new WeakHashMap());

    /* renamed from: k */
    private int f4567k = 0;

    /* renamed from: f */
    private final boolean m3928f() {
        bno bno = this.f4561e;
        return bno != null && bno.f4482b == 4;
    }

    public bpx(Context context, bqt bqt, Lock lock, Looper looper, bnv bnv, Map map, Map map2, bsv bsv, cel cel, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4, byte b, byte b2) {
        this.f4564h = bqt;
        this.f4563g = lock;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        bnv bnv2 = bnv;
        bqx bqx = r1;
        bqx bqx2 = new bqx(context2, this.f4564h, lock2, looper2, bnv2, map2, null, map4, null, arrayList2, new bpv(this), (byte) 0, (byte) 0);
        this.f4557a = bqx;
        this.f4558b = new bqx(context2, this.f4564h, lock2, looper2, bnv2, map, bsv, map3, cel, arrayList, new bpw(this), (byte) 0, (byte) 0);
        C0067cl clVar = new C0067cl();
        for (bog put : map2.keySet()) {
            clVar.put(put, this.f4557a);
        }
        for (bog put2 : map.keySet()) {
            clVar.put(put2, this.f4558b);
        }
        this.f4565i = Collections.unmodifiableMap(clVar);
    }

    /* renamed from: a */
    private final void m3924a(bno bno) {
        int i = this.f4567k;
        if (i != 1) {
            if (i != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.f4567k = 0;
            }
            this.f4564h.mo2293a(bno);
        }
        m3927e();
        this.f4567k = 0;
    }

    /* renamed from: e */
    private final void m3927e() {
        for (brv a : this.f4566j) {
            a.mo2364a();
        }
        this.f4566j.clear();
    }

    /* renamed from: a */
    public final void mo2295a() {
        this.f4567k = 2;
        this.f4562f = false;
        this.f4561e = null;
        this.f4560d = null;
        this.f4557a.mo2295a();
        this.f4558b.mo2295a();
    }

    /* renamed from: b */
    public final void mo2299b() {
        this.f4561e = null;
        this.f4560d = null;
        this.f4567k = 0;
        this.f4557a.mo2299b();
        this.f4558b.mo2299b();
        m3927e();
    }

    /* renamed from: a */
    public final void mo2297a(String str, PrintWriter printWriter) {
        printWriter.append((CharSequence) str).append((CharSequence) "authClient").println(":");
        this.f4558b.mo2297a(str.concat("  "), printWriter);
        printWriter.append((CharSequence) str).append((CharSequence) "anonClient").println(":");
        this.f4557a.mo2297a(str.concat("  "), printWriter);
    }

    /* renamed from: a */
    public final bpn mo2294a(bpn bpn) {
        if (!m3926c(bpn)) {
            return this.f4557a.mo2294a(bpn);
        }
        if (!m3928f()) {
            return this.f4558b.mo2294a(bpn);
        }
        bpn.mo2282b(new Status(4, null, (byte) 0));
        return bpn;
    }

    /* renamed from: b */
    public final bpn mo2298b(bpn bpn) {
        if (!m3926c(bpn)) {
            return this.f4557a.mo2298b(bpn);
        }
        if (!m3928f()) {
            return this.f4558b.mo2298b(bpn);
        }
        bpn.mo2282b(new Status(4, null, (byte) 0));
        return bpn;
    }

    /* renamed from: a */
    public final void mo2296a(int i) {
        this.f4564h.mo2291a(i);
        this.f4561e = null;
        this.f4560d = null;
    }

    /* renamed from: c */
    private final boolean m3926c(bpn bpn) {
        bog bog = bpn.f4550b;
        buh.m4213b(this.f4565i.containsKey(bog), "GoogleApiClient is not configured to use the API required for this call.");
        return ((bqx) this.f4565i.get(bog)).equals(this.f4558b);
    }

    /* renamed from: c */
    public final boolean mo2300c() {
        this.f4563g.lock();
        try {
            boolean z = true;
            if (!this.f4557a.mo2300c() || (!this.f4558b.mo2300c() && !m3928f() && this.f4567k != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.f4563g.unlock();
        }
    }

    /* renamed from: b */
    private static boolean m3925b(bno bno) {
        return bno != null && bno.mo2195b();
    }

    /* renamed from: d */
    public final void mo2301d() {
        bno bno;
        if (m3925b(this.f4560d)) {
            if (!m3925b(this.f4561e) && !m3928f()) {
                bno bno2 = this.f4561e;
                if (bno2 == null) {
                    return;
                }
                if (this.f4567k != 1) {
                    m3924a(bno2);
                    this.f4557a.mo2299b();
                    return;
                }
                m3927e();
                return;
            }
            int i = this.f4567k;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    this.f4567k = 0;
                }
                this.f4564h.mo2292a(this.f4559c);
            }
            m3927e();
            this.f4567k = 0;
        } else if (this.f4560d == null || !m3925b(this.f4561e)) {
            bno bno3 = this.f4560d;
            if (bno3 != null && (bno = this.f4561e) != null) {
                if (this.f4558b.f4654k < this.f4557a.f4654k) {
                    bno3 = bno;
                }
                m3924a(bno3);
            }
        } else {
            this.f4558b.mo2299b();
            m3924a(this.f4560d);
        }
    }
}
