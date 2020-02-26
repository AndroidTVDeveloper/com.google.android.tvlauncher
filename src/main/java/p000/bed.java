package p000;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

/* renamed from: bed */
/* compiled from: PG */
abstract class bed implements bdm {

    /* renamed from: a */
    private final ArrayDeque f3519a = new ArrayDeque();

    /* renamed from: b */
    public final ArrayDeque f3520b;

    /* renamed from: c */
    private final PriorityQueue f3521c;

    /* renamed from: d */
    private beb f3522d;

    /* renamed from: e */
    private long f3523e;

    /* renamed from: f */
    private long f3524f;

    public bed() {
        for (int i = 0; i < 10; i++) {
            this.f3519a.add(new beb((byte) 0));
        }
        this.f3520b = new ArrayDeque();
        for (int i2 = 0; i2 < 2; i2++) {
            this.f3520b.add(new bec(this));
        }
        this.f3521c = new PriorityQueue();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo1794a(bdq bdq);

    /* renamed from: d */
    public void mo1148d() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public abstract boolean mo1795e();

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract bdl mo1796f();

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo1144a() {
        bks.m3512b(this.f3522d == null);
        if (this.f3519a.isEmpty()) {
            return null;
        }
        beb beb = (beb) this.f3519a.pollFirst();
        this.f3522d = beb;
        return beb;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo1146b() {
        if (this.f3520b.isEmpty()) {
            return null;
        }
        while (!this.f3521c.isEmpty() && ((beb) this.f3521c.peek()).f1426d <= this.f3523e) {
            beb beb = (beb) this.f3521c.poll();
            if (beb.mo1141c()) {
                bdr bdr = (bdr) this.f3520b.pollFirst();
                bdr.mo1143n(4);
                m2968a(beb);
                return bdr;
            }
            mo1794a((bdq) beb);
            if (mo1795e()) {
                bdl f = mo1796f();
                if (!beb.mo1138T()) {
                    bdr bdr2 = (bdr) this.f3520b.pollFirst();
                    bdr2.mo1785a(beb.f1426d, f, Long.MAX_VALUE);
                    m2968a(beb);
                    return bdr2;
                }
            }
            m2968a(beb);
        }
        return null;
    }

    /* renamed from: c */
    public void mo1147c() {
        this.f3524f = 0;
        this.f3523e = 0;
        while (!this.f3521c.isEmpty()) {
            m2968a((beb) this.f3521c.poll());
        }
        beb beb = this.f3522d;
        if (beb != null) {
            m2968a(beb);
            this.f3522d = null;
        }
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo1145a(Object obj) {
        bks.m3510a(obj == this.f3522d);
        if (((ane) obj).mo1138T()) {
            m2968a(this.f3522d);
        } else {
            beb beb = this.f3522d;
            long j = this.f3524f;
            this.f3524f = 1 + j;
            beb.f3517g = j;
            this.f3521c.add(beb);
        }
        this.f3522d = null;
    }

    /* renamed from: a */
    private final void m2968a(beb beb) {
        beb.mo1139a();
        this.f3519a.add(beb);
    }

    /* renamed from: a */
    public final void mo1156a(long j) {
        this.f3523e = j;
    }
}
