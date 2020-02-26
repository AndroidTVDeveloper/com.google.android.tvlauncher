package defpackage;

/* renamed from: aly  reason: default package */
/* compiled from: PG */
final /* synthetic */ class aly implements Runnable {
    private final amb a;
    private final int b;
    private final long c;
    private final long d;

    public aly(amb amb, int i, long j, long j2) {
        this.a = amb;
        this.b = i;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        amb amb = this.a;
        amb.b.a(this.b, this.c, this.d);
    }
}
