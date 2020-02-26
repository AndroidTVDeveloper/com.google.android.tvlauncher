package p000;

import android.text.TextUtils;

/* renamed from: bfz */
/* compiled from: PG */
public final class bfz {

    /* renamed from: a */
    public final int f3748a;

    /* renamed from: b */
    public final int f3749b;

    /* renamed from: c */
    public final String f3750c;

    public bfz(int i, int i2, String str) {
        this.f3748a = i;
        this.f3749b = i2;
        this.f3750c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bfz bfz = (bfz) obj;
        return this.f3748a == bfz.f3748a && this.f3749b == bfz.f3749b && TextUtils.equals(this.f3750c, bfz.f3750c);
    }

    public final int hashCode() {
        int i = ((this.f3748a * 31) + this.f3749b) * 31;
        String str = this.f3750c;
        return i + (str != null ? str.hashCode() : 0);
    }
}
