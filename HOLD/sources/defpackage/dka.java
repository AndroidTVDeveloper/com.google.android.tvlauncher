package defpackage;

/* renamed from: dka  reason: default package */
/* compiled from: PG */
final class dka implements dki {
    private final dki[] a;

    public dka(dki... dkiArr) {
        this.a = dkiArr;
    }

    public final boolean a(Class cls) {
        dki[] dkiArr = this.a;
        for (int i = 0; i < 2; i++) {
            if (dkiArr[i].a(cls)) {
                return true;
            }
        }
        return false;
    }

    public final dkh b(Class cls) {
        dki[] dkiArr = this.a;
        for (int i = 0; i < 2; i++) {
            dki dki = dkiArr[i];
            if (dki.a(cls)) {
                return dki.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() == 0 ? new String("No factory is available for message type: ") : "No factory is available for message type: ".concat(valueOf));
    }
}
