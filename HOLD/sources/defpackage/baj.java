package defpackage;

import android.net.Uri;

/* renamed from: baj  reason: default package */
/* compiled from: PG */
public final class baj {
    public final long a;
    public final long b;
    private final String c;
    private int d;

    public baj(String str, long j, long j2) {
        this.c = str == null ? "" : str;
        this.a = j;
        this.b = j2;
    }

    public final baj a(baj baj, String str) {
        String b2 = b(str);
        if (baj != null && b2.equals(baj.b(str))) {
            long j = this.b;
            long j2 = -1;
            if (j != -1) {
                long j3 = this.a;
                if (j3 + j == baj.a) {
                    long j4 = baj.b;
                    if (j4 != -1) {
                        j2 = j + j4;
                    }
                    return new baj(b2, j3, j2);
                }
            }
            long j5 = baj.b;
            if (j5 != -1) {
                long j6 = baj.a;
                if (j6 + j5 == this.a) {
                    if (j != -1) {
                        j2 = j5 + j;
                    }
                    return new baj(b2, j6, j2);
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
        return this.a == baj.a && this.b == baj.b && this.c.equals(baj.c);
    }

    public final int hashCode() {
        int i = this.d;
        if (i != 0) {
            return i;
        }
        int hashCode = ((((((int) this.a) + 527) * 31) + ((int) this.b)) * 31) + this.c.hashCode();
        this.d = hashCode;
        return hashCode;
    }

    public final Uri a(String str) {
        return blk.a(str, this.c);
    }

    private final String b(String str) {
        return blk.b(str, this.c);
    }

    public final String toString() {
        String str = this.c;
        long j = this.a;
        long j2 = this.b;
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
