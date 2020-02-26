package defpackage;

/* renamed from: alw  reason: default package */
/* compiled from: PG */
final /* synthetic */ class alw implements Runnable {
    private final amb a;
    private final String b;
    private final long c;
    private final long d;

    public alw(amb amb, String str, long j, long j2) {
        this.a = amb;
        this.b = str;
        this.c = j;
        this.d = j2;
    }

    public final void run() {
        amb amb = this.a;
        amb.b.b(this.b, this.c, this.d);
    }
}
