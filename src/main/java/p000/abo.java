package p000;

/* renamed from: abo */
/* compiled from: PG */
public final class abo implements aaj {

    /* renamed from: a */
    private static final C0538tw f54a = C0538tw.m8390a("com.bumptech.glide.load.model.stream.HttpGlideUrlLoader.Timeout", 2500);

    /* renamed from: b */
    private final aah f55b;

    public abo() {
        this(null);
    }

    public abo(aah aah) {
        this.f55b = aah;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ aai mo11a(Object obj, int i, int i2, C0539tx txVar) {
        C0699zv zvVar = (C0699zv) obj;
        aah aah = this.f55b;
        if (aah != null) {
            aag a = aag.m11a(zvVar);
            Object b = aah.f11a.mo296b(a);
            a.mo15a();
            C0699zv zvVar2 = (C0699zv) b;
            if (zvVar2 == null) {
                aah aah2 = this.f55b;
                aah2.f11a.mo297b(aag.m11a(zvVar), zvVar);
            } else {
                zvVar = zvVar2;
            }
        }
        return new aai(zvVar, new C0558up(zvVar, ((Integer) txVar.mo5987a(f54a)).intValue()));
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo12a(Object obj) {
        C0699zv zvVar = (C0699zv) obj;
        return true;
    }
}
