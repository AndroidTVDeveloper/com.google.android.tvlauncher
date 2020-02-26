package defpackage;

/* renamed from: cad  reason: default package */
/* compiled from: PG */
final /* synthetic */ class cad implements Runnable {
    private final cae a;
    private final String b;
    private final boolean c;
    private final dom d;
    private final dnm e = null;
    private final String f;

    public cad(cae cae, String str, boolean z, dom dom, dnm dnm, String str2) {
        this.a = cae;
        this.b = str;
        this.c = z;
        this.d = dom;
        this.f = str2;
    }

    public final void run() {
        this.a.a(this.b, this.c, this.d, null, this.f);
    }
}
