package defpackage;

/* renamed from: baf  reason: default package */
/* compiled from: PG */
public final class baf {
    public final String a;
    public final String b;
    private final String c;

    public baf(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        baf baf = (baf) obj;
        return blm.a(this.a, baf.a) && blm.a(this.b, baf.b) && blm.a(this.c, baf.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }
}
