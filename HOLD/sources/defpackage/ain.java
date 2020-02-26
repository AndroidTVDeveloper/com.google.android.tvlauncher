package defpackage;

/* renamed from: ain  reason: default package */
/* compiled from: PG */
public final class ain {
    public volatile boolean a;

    private ain(byte b) {
    }

    public final void b() {
        if (this.a) {
            throw new IllegalStateException("Already released");
        }
    }

    private ain() {
    }

    public static ain a() {
        return new ain((byte) 0);
    }
}
