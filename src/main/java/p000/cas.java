package p000;

/* renamed from: cas */
/* compiled from: PG */
public final class cas {

    /* renamed from: b */
    private static final cas f5140b = new cas(new caj());

    /* renamed from: c */
    private static volatile boolean f5141c = true;

    /* renamed from: d */
    private static volatile cas f5142d = f5140b;

    /* renamed from: a */
    public final cat f5143a;

    private cas(cat cat) {
        this.f5143a = (cat) cev.m4629a(cat);
    }

    /* renamed from: a */
    public static synchronized cas m4457a(dnj dnj) {
        cas cas;
        synchronized (cas.class) {
            if (f5142d == f5140b) {
                f5142d = new cas((cat) dnj.mo2550a());
            } else {
                bog.m3832a("Primes", "Primes.initialize() is called more than once. This call will be ignored.", new Object[0]);
            }
            cas = f5142d;
        }
        return cas;
    }
}
