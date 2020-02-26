package defpackage;

/* renamed from: bbn  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bbn implements Runnable {
    private final bbs a;

    public bbn(bbs bbs) {
        this.a = bbs;
    }

    public final void run() {
        bbs bbs = this.a;
        bbs.k = true;
        bbs.j();
    }
}
