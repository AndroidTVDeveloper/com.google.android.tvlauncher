package defpackage;

/* renamed from: dkb  reason: default package */
/* compiled from: PG */
final class dkb implements dkx {
    private static final dki b = new djz();
    public final dki a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djl.a(java.lang.Object, java.lang.String):java.lang.Object
     arg types: [dka, java.lang.String]
     candidates:
      djl.a(java.lang.Object, java.lang.Object):java.lang.Object
      djl.a(java.lang.Object, java.lang.String):java.lang.Object */
    public dkb() {
        dki dki;
        dki[] dkiArr = new dki[2];
        dkiArr[0] = diz.a;
        try {
            dki = (dki) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            dki = b;
        }
        dkiArr[1] = dki;
        this.a = (dki) djl.a((Object) new dka(dkiArr), "messageInfoFactory");
    }

    public static boolean a(dkh dkh) {
        return dkh.c() == 1;
    }
}
