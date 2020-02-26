package defpackage;

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

/* renamed from: bpx  reason: default package */
/* compiled from: PG */
final class bpx implements brn {
    public final bqx a;
    public final bqx b;
    public Bundle c;
    public bno d = null;
    public bno e = null;
    public boolean f = false;
    public final Lock g;
    private final bqt h;
    private final Map i;
    private final Set j = Collections.newSetFromMap(new WeakHashMap());
    private int k = 0;

    private final boolean f() {
        bno bno = this.e;
        return bno != null && bno.b == 4;
    }

    public bpx(Context context, bqt bqt, Lock lock, Looper looper, bnv bnv, Map map, Map map2, bsv bsv, cel cel, ArrayList arrayList, ArrayList arrayList2, Map map3, Map map4, byte b2, byte b3) {
        this.h = bqt;
        this.g = lock;
        Context context2 = context;
        Lock lock2 = lock;
        Looper looper2 = looper;
        bnv bnv2 = bnv;
        bqx bqx = r1;
        bqx bqx2 = new bqx(context2, this.h, lock2, looper2, bnv2, map2, null, map4, null, arrayList2, new bpv(this), (byte) 0, (byte) 0);
        this.a = bqx;
        this.b = new bqx(context2, this.h, lock2, looper2, bnv2, map, bsv, map3, cel, arrayList, new bpw(this), (byte) 0, (byte) 0);
        cl clVar = new cl();
        for (bog put : map2.keySet()) {
            clVar.put(put, this.a);
        }
        for (bog put2 : map.keySet()) {
            clVar.put(put2, this.b);
        }
        this.i = Collections.unmodifiableMap(clVar);
    }

    private final void a(bno bno) {
        int i2 = this.k;
        if (i2 != 1) {
            if (i2 != 2) {
                Log.wtf("CompositeGAC", "Attempted to call failure callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new Exception());
                this.k = 0;
            }
            this.h.a(bno);
        }
        e();
        this.k = 0;
    }

    private final void e() {
        for (brv a2 : this.j) {
            a2.a();
        }
        this.j.clear();
    }

    public final void a() {
        this.k = 2;
        this.f = false;
        this.e = null;
        this.d = null;
        this.a.a();
        this.b.a();
    }

    public final void b() {
        this.e = null;
        this.d = null;
        this.k = 0;
        this.a.b();
        this.b.b();
        e();
    }

    public final void a(String str, PrintWriter printWriter) {
        printWriter.append((CharSequence) str).append((CharSequence) "authClient").println(":");
        this.b.a(str.concat("  "), printWriter);
        printWriter.append((CharSequence) str).append((CharSequence) "anonClient").println(":");
        this.a.a(str.concat("  "), printWriter);
    }

    public final bpn a(bpn bpn) {
        if (!c(bpn)) {
            return this.a.a(bpn);
        }
        if (!f()) {
            return this.b.a(bpn);
        }
        bpn.b(new Status(4, null, (byte) 0));
        return bpn;
    }

    public final bpn b(bpn bpn) {
        if (!c(bpn)) {
            return this.a.b(bpn);
        }
        if (!f()) {
            return this.b.b(bpn);
        }
        bpn.b(new Status(4, null, (byte) 0));
        return bpn;
    }

    public final void a(int i2) {
        this.h.a(i2);
        this.e = null;
        this.d = null;
    }

    private final boolean c(bpn bpn) {
        bog bog = bpn.b;
        buh.b(this.i.containsKey(bog), "GoogleApiClient is not configured to use the API required for this call.");
        return ((bqx) this.i.get(bog)).equals(this.b);
    }

    public final boolean c() {
        this.g.lock();
        try {
            boolean z = true;
            if (!this.a.c() || (!this.b.c() && !f() && this.k != 1)) {
                z = false;
            }
            return z;
        } finally {
            this.g.unlock();
        }
    }

    private static boolean b(bno bno) {
        return bno != null && bno.b();
    }

    public final void d() {
        bno bno;
        if (b(this.d)) {
            if (!b(this.e) && !f()) {
                bno bno2 = this.e;
                if (bno2 == null) {
                    return;
                }
                if (this.k != 1) {
                    a(bno2);
                    this.a.b();
                    return;
                }
                e();
                return;
            }
            int i2 = this.k;
            if (i2 != 1) {
                if (i2 != 2) {
                    Log.wtf("CompositeGAC", "Attempted to call success callbacks in CONNECTION_MODE_NONE. Callbacks should be disabled via GmsClientSupervisor", new AssertionError());
                    this.k = 0;
                }
                this.h.a(this.c);
            }
            e();
            this.k = 0;
        } else if (this.d == null || !b(this.e)) {
            bno bno3 = this.d;
            if (bno3 != null && (bno = this.e) != null) {
                if (this.b.k < this.a.k) {
                    bno3 = bno;
                }
                a(bno3);
            }
        } else {
            this.b.b();
            a(this.d);
        }
    }
}
