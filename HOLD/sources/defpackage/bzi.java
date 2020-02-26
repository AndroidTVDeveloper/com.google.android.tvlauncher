package defpackage;

/* renamed from: bzi  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bzi implements Runnable {
    private final bzn a;
    private final dok b;

    public bzi(bzn bzn, dok dok) {
        this.a = bzn;
        this.b = dok;
    }

    public final void run() {
        this.a.a(this.b);
    }
}
