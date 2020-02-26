package p000;

/* renamed from: dka */
/* compiled from: PG */
final class dka implements dki {

    /* renamed from: a */
    private final dki[] f8706a;

    public dka(dki... dkiArr) {
        this.f8706a = dkiArr;
    }

    /* renamed from: a */
    public final boolean mo4491a(Class cls) {
        dki[] dkiArr = this.f8706a;
        for (int i = 0; i < 2; i++) {
            if (dkiArr[i].mo4491a(cls)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public final dkh mo4492b(Class cls) {
        dki[] dkiArr = this.f8706a;
        for (int i = 0; i < 2; i++) {
            dki dki = dkiArr[i];
            if (dki.mo4491a(cls)) {
                return dki.mo4492b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() == 0 ? new String("No factory is available for message type: ") : "No factory is available for message type: ".concat(valueOf));
    }
}
