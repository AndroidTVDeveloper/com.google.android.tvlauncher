package defpackage;

/* renamed from: dit  reason: default package */
/* compiled from: PG */
final class dit {
    public static final dkc a = new dkc((byte) 0);
    private static final dkc b;

    static {
        dkc dkc;
        try {
            dkc = (dkc) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            dkc = null;
        }
        b = dkc;
    }

    static dkc a() {
        dkc dkc = b;
        if (dkc != null) {
            return dkc;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
