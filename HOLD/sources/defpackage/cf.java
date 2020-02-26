package defpackage;

/* renamed from: cf  reason: default package */
/* compiled from: PG */
final class cf implements Runnable {
    private final /* synthetic */ Object a;
    private final /* synthetic */ cg b;

    public cf(cg cgVar, Object obj) {
        this.b = cgVar;
        this.a = obj;
    }

    public final void run() {
        this.b.a.a(this.a);
    }
}
