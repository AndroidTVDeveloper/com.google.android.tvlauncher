package p000;

/* renamed from: dkb */
/* compiled from: PG */
final class dkb implements dkx {

    /* renamed from: b */
    private static final dki f8707b = new djz();

    /* renamed from: a */
    public final dki f8708a;

    /* JADX DEBUG: Failed to find minimal casts for resolve overloaded methods, cast all args instead
     method: djl.a(java.lang.Object, java.lang.String):java.lang.Object
     arg types: [dka, java.lang.String]
     candidates:
      djl.a(java.lang.Object, java.lang.Object):java.lang.Object
      djl.a(java.lang.Object, java.lang.String):java.lang.Object */
    public dkb() {
        dki dki;
        dki[] dkiArr = new dki[2];
        dkiArr[0] = diz.f8668a;
        try {
            dki = (dki) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception e) {
            dki = f8707b;
        }
        dkiArr[1] = dki;
        this.f8708a = (dki) djl.m6725a((Object) new dka(dkiArr), "messageInfoFactory");
    }

    /* renamed from: a */
    public static boolean m6769a(dkh dkh) {
        return dkh.mo4573c() == 1;
    }
}
