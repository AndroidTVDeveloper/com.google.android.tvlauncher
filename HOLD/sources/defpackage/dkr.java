package defpackage;

/* renamed from: dkr  reason: default package */
/* compiled from: PG */
final class dkr {
    public static final dkp a;
    public static final dkp b = new dkq();

    static {
        dkp dkp;
        try {
            dkp = (dkp) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            dkp = null;
        }
        a = dkp;
    }
}
