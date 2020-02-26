package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

/* renamed from: bqx  reason: default package */
/* compiled from: PG */
public final class bqx implements brn, bpu {
    public final Lock a;
    public final Condition b;
    public final Context c;
    public final bnv d;
    public final bqw e;
    public final Map f;
    public final Map g = new HashMap();
    public final bsv h;
    public final Map i;
    public volatile bqu j;
    public int k;
    public final bqt l;
    public final brm m;
    public final cel n;

    public bqx(Context context, bqt bqt, Lock lock, Looper looper, bnv bnv, Map map, bsv bsv, Map map2, cel cel, ArrayList arrayList, brm brm, byte b2, byte b3) {
        this.c = context;
        this.a = lock;
        this.d = bnv;
        this.f = map;
        this.h = bsv;
        this.i = map2;
        this.n = cel;
        this.l = bqt;
        this.m = brm;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((bpt) arrayList.get(i2)).b = this;
        }
        this.e = new bqw(this, looper);
        this.b = lock.newCondition();
        this.j = new bqq(this);
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.a.lock();
        try {
            this.j = new bqq(this);
            this.j.a();
            this.b.signalAll();
        } finally {
            this.a.unlock();
        }
    }

    public final void a() {
        this.j.b();
    }

    public final void b() {
        this.j.c();
        this.g.clear();
    }

    public final void a(String str, PrintWriter printWriter) {
        String concat = String.valueOf(str).concat("  ");
        printWriter.append((CharSequence) str).append((CharSequence) "mState=").println(this.j);
        for (bok bok : this.i.keySet()) {
            printWriter.append((CharSequence) str).append((CharSequence) bok.a).println(":");
            ((boj) this.f.get(bok.a())).a(concat, printWriter);
        }
    }

    public final bpn a(bpn bpn) {
        bpn.c();
        return this.j.a(bpn);
    }

    public final bpn b(bpn bpn) {
        bpn.c();
        return this.j.b(bpn);
    }

    public final boolean c() {
        return this.j instanceof bqe;
    }

    public final void a(Bundle bundle) {
        this.a.lock();
        try {
            this.j.a(bundle);
        } finally {
            this.a.unlock();
        }
    }

    public final void a(int i2) {
        this.a.lock();
        try {
            this.j.a(i2);
        } finally {
            this.a.unlock();
        }
    }

    /* access modifiers changed from: package-private */
    public final void a(bqv bqv) {
        this.e.sendMessage(this.e.obtainMessage(1, bqv));
    }
}
