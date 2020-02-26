package p000;

/* renamed from: ain */
/* compiled from: PG */
public final class ain {

    /* renamed from: a */
    public volatile boolean f404a;

    private ain(byte b) {
    }

    /* renamed from: b */
    public final void mo320b() {
        if (this.f404a) {
            throw new IllegalStateException("Already released");
        }
    }

    private ain() {
    }

    /* renamed from: a */
    public static ain m578a() {
        return new ain((byte) 0);
    }
}
