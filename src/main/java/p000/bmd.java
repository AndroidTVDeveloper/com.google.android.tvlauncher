package p000;

/* renamed from: bmd */
/* compiled from: PG */
final /* synthetic */ class bmd implements Runnable {

    /* renamed from: a */
    private final bmj f4392a;

    /* renamed from: b */
    private final String f4393b;

    /* renamed from: c */
    private final long f4394c;

    /* renamed from: d */
    private final long f4395d;

    public bmd(bmj bmj, String str, long j, long j2) {
        this.f4392a = bmj;
        this.f4393b = str;
        this.f4394c = j;
        this.f4395d = j2;
    }

    public final void run() {
        bmj bmj = this.f4392a;
        bmj.f4411b.mo502a(this.f4393b, this.f4394c, this.f4395d);
    }
}
