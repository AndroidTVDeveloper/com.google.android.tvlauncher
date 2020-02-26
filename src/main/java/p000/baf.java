package p000;

/* renamed from: baf */
/* compiled from: PG */
public final class baf {

    /* renamed from: a */
    public final String f2990a;

    /* renamed from: b */
    public final String f2991b;

    /* renamed from: c */
    private final String f2992c;

    public baf(String str, String str2, String str3) {
        this.f2990a = str;
        this.f2991b = str2;
        this.f2992c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        baf baf = (baf) obj;
        return blm.m3652a(this.f2990a, baf.f2990a) && blm.m3652a(this.f2991b, baf.f2991b) && blm.m3652a(this.f2992c, baf.f2992c);
    }

    public final int hashCode() {
        int hashCode = this.f2990a.hashCode() * 31;
        String str = this.f2991b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2992c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
