package defpackage;

/* renamed from: cas  reason: default package */
/* compiled from: PG */
public final class cas {
    private static final cas b = new cas(new caj());
    private static volatile boolean c = true;
    private static volatile cas d = b;
    public final cat a;

    private cas(cat cat) {
        this.a = (cat) cev.a(cat);
    }

    public static synchronized cas a(dnj dnj) {
        cas cas;
        synchronized (cas.class) {
            if (d == b) {
                d = new cas((cat) dnj.a());
            } else {
                bog.a("Primes", "Primes.initialize() is called more than once. This call will be ignored.", new Object[0]);
            }
            cas = d;
        }
        return cas;
    }
}
