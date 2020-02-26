package defpackage;

/* renamed from: abo  reason: default package */
/* compiled from: PG */
public final class abo implements aaj {
    private static final tw a = tw.a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);
    private final aah b;

    public abo() {
        this(null);
    }

    public abo(aah aah) {
        this.b = aah;
    }

    public final /* bridge */ /* synthetic */ aai a(Object obj, int i, int i2, tx txVar) {
        zv zvVar = (zv) obj;
        aah aah = this.b;
        if (aah != null) {
            aag a2 = aag.a(zvVar);
            Object b2 = aah.a.b(a2);
            a2.a();
            zv zvVar2 = (zv) b2;
            if (zvVar2 == null) {
                aah aah2 = this.b;
                aah2.a.b(aag.a(zvVar), zvVar);
            } else {
                zvVar = zvVar2;
            }
        }
        return new aai(zvVar, new up(zvVar, ((Integer) txVar.a(a)).intValue()));
    }

    public final /* bridge */ /* synthetic */ boolean a(Object obj) {
        zv zvVar = (zv) obj;
        return true;
    }
}
