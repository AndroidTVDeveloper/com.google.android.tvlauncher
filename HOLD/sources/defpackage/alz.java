package defpackage;

/* renamed from: alz  reason: default package */
/* compiled from: PG */
final /* synthetic */ class alz implements Runnable {
    private final amb a;
    private final ani b;

    public alz(amb amb, ani ani) {
        this.a = amb;
        this.b = ani;
    }

    public final void run() {
        amb amb = this.a;
        amb.b.d(this.b);
    }
}
