package defpackage;

/* renamed from: bai  reason: default package */
/* compiled from: PG */
public final class bai {
    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;

    public bai(String str, String str2, String str3, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bai bai = (bai) obj;
        return blm.a(this.a, bai.a) && blm.a(this.b, bai.b) && blm.a(this.c, bai.c) && blm.a(this.d, bai.d) && blm.a(this.e, bai.e);
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
