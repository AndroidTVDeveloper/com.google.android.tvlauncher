package defpackage;

import android.text.TextUtils;

/* renamed from: bfz  reason: default package */
/* compiled from: PG */
public final class bfz {
    public final int a;
    public final int b;
    public final String c;

    public bfz(int i, int i2, String str) {
        this.a = i;
        this.b = i2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bfz bfz = (bfz) obj;
        return this.a == bfz.a && this.b == bfz.b && TextUtils.equals(this.c, bfz.c);
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        String str = this.c;
        return i + (str != null ? str.hashCode() : 0);
    }
}
