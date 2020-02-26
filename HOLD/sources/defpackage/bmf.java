package defpackage;

/* renamed from: bmf  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bmf implements Runnable {
    private final bmj a;
    private final int b;
    private final long c;

    public bmf(bmj bmj, int i, long j) {
        this.a = bmj;
        this.b = i;
        this.c = j;
    }

    public final void run() {
        bmj bmj = this.a;
        bmj.b.a(this.b, this.c);
    }
}
