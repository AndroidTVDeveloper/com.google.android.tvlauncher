package defpackage;

/* renamed from: cah  reason: default package */
/* compiled from: PG */
public final class cah {
    private final String a;

    public cah(String str) {
        this.a = str;
    }

    public static String a(cah cah) {
        if (cah != null) {
            return cah.a;
        }
        return null;
    }

    public final String toString() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof cah) {
            return this.a.equals(((cah) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
