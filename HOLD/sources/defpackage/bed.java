package defpackage;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: bed  reason: default package */
/* compiled from: PG */
abstract class bed implements bdm {
    private final ArrayDeque a = new ArrayDeque();
    public final ArrayDeque b;
    private final PriorityQueue c;
    private beb d;
    private long e;
    private long f;

    public bed() {
        for (int i = 0; i < 10; i++) {
            this.a.add(new beb((byte) 0));
        }
        this.b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.b.add(new bec(this));
        }
        this.c = new PriorityQueue();
    }

    /* access modifiers changed from: protected */
    public abstract void a(bdq bdq);

    public void d() {
    }

    /* access modifiers changed from: protected */
    public abstract boolean e();

    /* access modifiers changed from: protected */
    public abstract bdl f();

    public final /* bridge */ /* synthetic */ Object a() {
        bks.b(this.d == null);
        if (this.a.isEmpty()) {
            return null;
        }
        beb beb = (beb) this.a.pollFirst();
        this.d = beb;
        return beb;
    }

    public final /* bridge */ /* synthetic */ Object b() {
        if (this.b.isEmpty()) {
            return null;
        }
        while (!this.c.isEmpty() && ((beb) this.c.peek()).d <= this.e) {
            beb beb = (beb) this.c.poll();
            if (beb.c()) {
                bdr bdr = (bdr) this.b.pollFirst();
                bdr.n(4);
                a(beb);
                return bdr;
            }
            a((bdq) beb);
            if (e()) {
                bdl f2 = f();
                if (!beb.T()) {
                    bdr bdr2 = (bdr) this.b.pollFirst();
                    bdr2.a(beb.d, f2, Long.MAX_VALUE);
                    a(beb);
                    return bdr2;
                }
            }
            a(beb);
        }
        return null;
    }

    public void c() {
        this.f = 0;
        this.e = 0;
        while (!this.c.isEmpty()) {
            a((beb) this.c.poll());
        }
        beb beb = this.d;
        if (beb != null) {
            a(beb);
            this.d = null;
        }
    }

    public final /* bridge */ /* synthetic */ void a(Object obj) {
        bks.a(obj == this.d);
        if (((ane) obj).T()) {
            a(this.d);
        } else {
            beb beb = this.d;
            long j = this.f;
            this.f = 1 + j;
            beb.g = j;
            this.c.add(beb);
        }
        this.d = null;
    }

    private final void a(beb beb) {
        beb.a();
        this.a.add(beb);
    }

    public final void a(long j) {
        this.e = j;
    }
}
