package p000;

/* renamed from: cah */
/* compiled from: PG */
public final class cah {

    /* renamed from: a */
    private final String f5123a;

    public cah(String str) {
        this.f5123a = str;
    }

    /* renamed from: a */
    public static String m4439a(cah cah) {
        if (cah != null) {
            return cah.f5123a;
        }
        return null;
    }

    public final String toString() {
        return this.f5123a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cah) {
            return this.f5123a.equals(((cah) obj).f5123a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f5123a.hashCode();
    }
}
