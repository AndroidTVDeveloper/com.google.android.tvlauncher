package p000;

import android.net.Uri;

/* renamed from: baj */
/* compiled from: PG */
public final class baj {

    /* renamed from: a */
    public final long f3006a;

    /* renamed from: b */
    public final long f3007b;

    /* renamed from: c */
    private final String f3008c;

    /* renamed from: d */
    private int f3009d;

    public baj(String str, long j, long j2) {
        this.f3008c = str == null ? "" : str;
        this.f3006a = j;
        this.f3007b = j2;
    }

    /* renamed from: a */
    public final baj mo1687a(baj baj, String str) {
        String b = m2636b(str);
        if (baj != null && b.equals(baj.m2636b(str))) {
            long j = this.f3007b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.f3006a;
                if (j3 + j == baj.f3006a) {
                    long j4 = baj.f3007b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new baj(b, j3, j2);
                }
            }
            long j5 = baj.f3007b;
            if (j5 != -1) {
                long j6 = baj.f3006a;
                if (j6 + j5 == this.f3006a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new baj(b, j6, j2);
                }
            }
        }
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        baj baj = (baj) obj;
        return this.f3006a == baj.f3006a && this.f3007b == baj.f3007b && this.f3008c.equals(baj.f3008c);
    }

    public final int hashCode() {
        int i = this.f3009d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((int) this.f3006a) + 527) * 31) + ((int) this.f3007b)) * 31) + this.f3008c.hashCode();
        this.f3009d = hashCode;
        return hashCode;
    }

    /* renamed from: a */
    public final Uri mo1686a(String str) {
        return blk.m3616a(str, this.f3008c);
    }

    /* renamed from: b */
    private final String m2636b(String str) {
        return blk.m3620b(str, this.f3008c);
    }

    public final String toString() {
        String str = this.f3008c;
        long j = this.f3006a;
        long j2 = this.f3007b;
        StringBuilder sb = new StringBuilder(str.length() + 81);
        sb.append("RangedUri(referenceUri=");
        sb.append(str);
        sb.append(", start=");
        sb.append(j);
        sb.append(", length=");
        sb.append(j2);
        sb.append(")");
        return sb.toString();
    }
}
