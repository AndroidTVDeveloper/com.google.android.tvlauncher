package defpackage;

/* renamed from: bmd  reason: default package */
/* compiled from: PG */
final /* synthetic */ class bmd implements Runnable {
    private final bmj a;
    private final String b;
    private final long c;
    private final long d;

    public bmd(bmj bmj, String str, long j, long j2) {
        this.a = bmj;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        bmj bmj = this.a;
        bmj.b.a(this.b, this.c, this.d);
    }
}
