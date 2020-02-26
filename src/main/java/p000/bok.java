package p000;

/* renamed from: bok */
/* compiled from: PG */
public final class bok {

    /* renamed from: a */
    public final String f4507a;

    /* renamed from: b */
    private final bog f4508b;

    /* renamed from: c */
    private final cel f4509c;

    public bok(String str, cel cel, bog bog, byte b, byte b2) {
        buh.m4200a(cel, "Cannot construct an Api with a null ClientBuilder");
        buh.m4200a(bog, "Cannot construct an Api with a null ClientKey");
        this.f4507a = str;
        this.f4509c = cel;
        this.f4508b = bog;
    }

    /* renamed from: b */
    public final cel mo2238b() {
        buh.m4206a(this.f4509c != null, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder");
        return this.f4509c;
    }

    /* renamed from: a */
    public final bog mo2237a() {
        bog bog = this.f4508b;
        if (bog != null) {
            return bog;
        }
        throw new IllegalStateException("This API was constructed with null client keys. This should not be possible.");
    }
}
