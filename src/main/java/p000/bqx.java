package p000;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: bqx */
/* compiled from: PG */
public final class bqx implements brn, bpu {

    /* renamed from: a */
    public final Lock f4644a;

    /* renamed from: b */
    public final Condition f4645b;

    /* renamed from: c */
    public final Context f4646c;

    /* renamed from: d */
    public final bnv f4647d;

    /* renamed from: e */
    public final bqw f4648e;

    /* renamed from: f */
    public final Map f4649f;

    /* renamed from: g */
    public final Map f4650g = new HashMap();

    /* renamed from: h */
    public final bsv f4651h;

    /* renamed from: i */
    public final Map f4652i;

    /* renamed from: j */
    public volatile bqu f4653j;

    /* renamed from: k */
    public int f4654k;

    /* renamed from: l */
    public final bqt f4655l;

    /* renamed from: m */
    public final brm f4656m;

    /* renamed from: n */
    public final cel f4657n;

    public bqx(Context context, bqt bqt, Lock lock, Looper looper, bnv bnv, Map map, bsv bsv, Map map2, cel cel, ArrayList arrayList, brm brm, byte b, byte b2) {
        this.f4646c = context;
        this.f4644a = lock;
        this.f4647d = bnv;
        this.f4649f = map;
        this.f4651h = bsv;
        this.f4652i = map2;
        this.f4657n = cel;
        this.f4655l = bqt;
        this.f4656m = brm;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((bpt) arrayList.get(i)).f4553b = this;
        }
        this.f4648e = new bqw(this, looper);
        this.f4645b = lock.newCondition();
        this.f4653j = new bqq(this);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo2333d() {
        this.f4644a.lock();
        try {
            this.f4653j = new bqq(this);
            this.f4653j.mo2306a();
            this.f4645b.signalAll();
        } finally {
            this.f4644a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2295a() {
        this.f4653j.mo2311b();
    }

    /* renamed from: b */
    public final void mo2299b() {
        this.f4653j.mo2312c();
        this.f4650g.clear();
    }

    /* renamed from: a */
    public final void mo2297a(String str, PrintWriter printWriter) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append((CharSequence) "mState=").println(this.f4653j);
        for (bok bok : this.f4652i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) bok.f4507a).println(":");
            ((boj) this.f4649f.get(bok.mo2237a())).mo2227a(concat, printWriter);
        }
    }

    /* renamed from: a */
    public final bpn mo2294a(bpn bpn) {
        bpn.mo3198c();
        return this.f4653j.mo2305a(bpn);
    }

    /* renamed from: b */
    public final bpn mo2298b(bpn bpn) {
        bpn.mo3198c();
        return this.f4653j.mo2310b(bpn);
    }

    /* renamed from: c */
    public final boolean mo2300c() {
        return this.f4653j instanceof bqe;
    }

    /* renamed from: a */
    public final void mo2289a(Bundle bundle) {
        this.f4644a.lock();
        try {
            this.f4653j.mo2308a(bundle);
        } finally {
            this.f4644a.unlock();
        }
    }

    /* renamed from: a */
    public final void mo2288a(int i) {
        this.f4644a.lock();
        try {
            this.f4653j.mo2307a(i);
        } finally {
            this.f4644a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo2332a(bqv bqv) {
        this.f4648e.sendMessage(this.f4648e.obtainMessage(1, bqv));
    }
}
