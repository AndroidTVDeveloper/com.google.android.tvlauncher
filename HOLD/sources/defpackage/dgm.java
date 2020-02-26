package defpackage;

/* renamed from: dgm  reason: default package */
/* compiled from: PG */
final class dgm {
    public static final dgm a = new dgm((byte) 0);
    public volatile dgm next;
    public volatile Thread thread;

    public dgm() {
        dgn.c.a(this, Thread.currentThread());
    }

    private dgm(byte b) {
    }

    /* access modifiers changed from: package-private */
    public final void a(dgm dgm) {
        dgn.c.a(this, dgm);
    }
}
