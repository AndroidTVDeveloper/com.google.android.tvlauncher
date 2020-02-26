package defpackage;

/* renamed from: dok  reason: default package */
/* compiled from: PG */
public enum dok implements djg {
    UNKNOWN(0),
    PRIMES_INITIALIZED(1),
    PRIMES_CRASH_MONITORING_INITIALIZED(2),
    PRIMES_FIRST_ACTIVITY_LAUNCHED(3),
    PRIMES_CUSTOM_LAUNCHED(4);
    
    public final int c;

    public static dok a(int i) {
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

    public static djh b() {
        return doj.a;
    }

    public final int a() {
        return this.c;
    }

    public final String toString() {
        return Integer.toString(this.c);
    }

    private dok(int i) {
        this.c = i;
    }
}
