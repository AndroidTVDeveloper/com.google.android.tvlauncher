package defpackage;

import android.os.Bundle;

/* renamed from: bqn  reason: default package */
/* compiled from: PG */
final class bqn implements boq, bor {
    private final /* synthetic */ bqp a;

    public /* synthetic */ bqn(bqp bqp) {
        this.a = bqp;
    }

    public final void a(int i) {
    }

    public final void a(Bundle bundle) {
        bqp bqp = this.a;
        bqp.e.a(new bqm(bqp));
    }

    public final void a(bno bno) {
        this.a.b.lock();
        try {
            if (!this.a.a(bno)) {
                this.a.b(bno);
            } else {
                this.a.f();
                this.a.e();
            }
        } finally {
            this.a.b.unlock();
        }
    }
}
