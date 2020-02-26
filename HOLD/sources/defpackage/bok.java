package defpackage;

/* renamed from: bok  reason: default package */
/* compiled from: PG */
public final class bok {
    public final String a;
    private final bog b;
    private final cel c;

    public bok(String str, cel cel, bog bog, byte b2, byte b3) {
        buh.a(cel, "Cannot construct an Api with a null ClientBuilder");
        buh.a(bog, "Cannot construct an Api with a null ClientKey");
        this.a = str;
        this.c = cel;
        this.b = bog;
    }

    public final cel b() {
        buh.a(this.c != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.c;
    }

    public final bog a() {
        bog bog = this.b;
        if (bog != null) {
            return bog;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
