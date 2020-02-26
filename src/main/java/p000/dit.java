package p000;

/* renamed from: dit */
/* compiled from: PG */
final class dit {

    /* renamed from: a */
    public static final dkc f8604a = new dkc((byte) 0);

    /* renamed from: b */
    private static final dkc f8605b;

    static {
        dkc dkc;
        try {
            dkc = (dkc) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            dkc = null;
        }
        f8605b = dkc;
    }

    /* renamed from: a */
    static dkc m6619a() {
        dkc dkc = f8605b;
        if (dkc != null) {
            return dkc;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
