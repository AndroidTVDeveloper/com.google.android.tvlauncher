package p000;

/* renamed from: dhx */
/* compiled from: PG */
final class dhx {

    /* renamed from: a */
    public static final Class f8565a = m6467a("libcore.io.Memory");

    /* renamed from: b */
    private static final boolean f8566b = (m6467a("org.robolectric.Robolectric") != null);

    /* renamed from: a */
    static boolean m6468a() {
        return f8565a != null && !f8566b;
    }

    /* renamed from: a */
    private static Class m6467a(String str) {
        try {
            return Class.forName(str);
        } catch (Throwable th) {
            return null;
        }
    }
}
