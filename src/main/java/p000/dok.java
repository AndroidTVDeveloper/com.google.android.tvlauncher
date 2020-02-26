package p000;

/* renamed from: dok */
/* compiled from: PG */
public enum dok implements djg {
    UNKNOWN(0),
    PRIMES_INITIALIZED(1),
    PRIMES_CRASH_MONITORING_INITIALIZED(2),
    PRIMES_FIRST_ACTIVITY_LAUNCHED(3),
    PRIMES_CUSTOM_LAUNCHED(4);
    

    /* renamed from: c */
    public final int f9072c;

    /* renamed from: a */
    public static dok m7176a(int i) {
        if (i == 0) {
            return UNKNOWN;
        }
        if (i == 1) {
            return PRIMES_INITIALIZED;
        }
        if (i == 2) {
            return PRIMES_CRASH_MONITORING_INITIALIZED;
        }
        if (i == 3) {
            return PRIMES_FIRST_ACTIVITY_LAUNCHED;
        }
        if (i != 4) {
            return null;
        }
        return PRIMES_CUSTOM_LAUNCHED;
    }

    /* renamed from: b */
    public static djh m7177b() {
        return doj.f9065a;
    }

    /* renamed from: a */
    public final int mo4527a() {
        return this.f9072c;
    }

    public final String toString() {
        return Integer.toString(this.f9072c);
    }

    private dok(int i) {
        this.f9072c = i;
    }
}
