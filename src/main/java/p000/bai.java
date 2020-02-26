package p000;

/* renamed from: bai */
/* compiled from: PG */
public final class bai {

    /* renamed from: a */
    private final String f3001a;

    /* renamed from: b */
    private final String f3002b;

    /* renamed from: c */
    private final String f3003c;

    /* renamed from: d */
    private final String f3004d;

    /* renamed from: e */
    private final String f3005e;

    public bai(String str, String str2, String str3, String str4, String str5) {
        this.f3001a = str;
        this.f3002b = str2;
        this.f3003c = str3;
        this.f3004d = str4;
        this.f3005e = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bai bai = (bai) obj;
        return blm.m3652a(this.f3001a, bai.f3001a) && blm.m3652a(this.f3002b, bai.f3002b) && blm.m3652a(this.f3003c, bai.f3003c) && blm.m3652a(this.f3004d, bai.f3004d) && blm.m3652a(this.f3005e, bai.f3005e);
    }

    public final int hashCode() {
        String str = this.f3001a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f3002b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f3003c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f3004d;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.f3005e;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }
}
