package defpackage;

/* renamed from: dgb  reason: default package */
/* compiled from: PG */
final class dgb {
    public static final dgb a;
    public static final dgb b;
    public final boolean c;
    public final Throwable d;

    static {
        if (!dgn.a) {
            b = new dgb(false, null);
            a = new dgb(true, null);
            return;
        }
        b = null;
        a = null;
    }

    public dgb(boolean z, Throwable th) {
        this.c = z;
        this.d = th;
    }
}
