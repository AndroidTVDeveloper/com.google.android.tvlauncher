package p000;

/* renamed from: alw */
/* compiled from: PG */
final /* synthetic */ class alw implements Runnable {

    /* renamed from: a */
    private final amb f727a;

    /* renamed from: b */
    private final String f728b;

    /* renamed from: c */
    private final long f729c;

    /* renamed from: d */
    private final long f730d;

    public alw(amb amb, String str, long j, long j2) {
        this.f727a = amb;
        this.f728b = str;
        this.f729c = j;
        this.f730d = j2;
    }

    public final void run() {
        amb amb = this.f727a;
        amb.f742b.mo506b(this.f728b, this.f729c, this.f730d);
    }
}
