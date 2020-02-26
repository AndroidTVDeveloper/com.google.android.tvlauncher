package defpackage;

/* renamed from: dkg  reason: default package */
/* compiled from: PG */
final class dkg {
    public static final dke a;
    public static final dke b = new dkf();

    static {
        dke dke;
        try {
            dke = (dke) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            dke = null;
        }
        a = dke;
    }
}
