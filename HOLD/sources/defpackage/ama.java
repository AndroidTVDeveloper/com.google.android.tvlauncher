package defpackage;

/* renamed from: ama  reason: default package */
/* compiled from: PG */
final /* synthetic */ class ama implements Runnable {
    private final amb a;
    private final int b;

    public ama(amb amb, int i) {
        this.a = amb;
        this.b = i;
    }

    public final void run() {
        amb amb = this.a;
        amb.b.c(this.b);
    }
}
