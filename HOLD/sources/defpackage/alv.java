package defpackage;

/* renamed from: alv  reason: default package */
/* compiled from: PG */
final /* synthetic */ class alv implements Runnable {
    private final amb a;
    private final ani b;

    public alv(amb amb, ani ani) {
        this.a = amb;
        this.b = ani;
    }

    public final void run() {
        amb amb = this.a;
        amb.b.c(this.b);
    }
}
