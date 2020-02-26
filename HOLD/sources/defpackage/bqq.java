package defpackage;

import android.os.Bundle;
import java.util.Collections;

/* renamed from: bqq  reason: default package */
/* compiled from: PG */
public final class bqq implements bqu {
    private final bqx a;

    public bqq(bqx bqx) {
        this.a = bqx;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
    }

    public final void a(bno bno, bok bok, boolean z) {
    }

    public final void c() {
    }

    public final void a() {
        for (boj d : this.a.f.values()) {
            d.d();
        }
        this.a.l.g = Collections.emptySet();
    }

    public final void b() {
        bqx bqx = this.a;
        bqx.a.lock();
        try {
            bqx.j = new bqp(bqx, bqx.h, bqx.i, bqx.d, bqx.n, bqx.a, bqx.c, (byte) 0, (byte) 0);
            bqx.j.a();
            bqx.b.signalAll();
        } finally {
            bqx.a.unlock();
        }
    }

    public final bpn a(bpn bpn) {
        this.a.l.e.add(bpn);
        return bpn;
    }

    public final bpn b(bpn bpn) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }
}
