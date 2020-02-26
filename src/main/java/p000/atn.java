package p000;

import android.text.TextUtils;

/* renamed from: atn */
/* compiled from: PG */
final class atn {

    /* renamed from: a */
    public final String f2394a;

    /* renamed from: b */
    public final boolean f2395b;

    /* renamed from: c */
    public final boolean f2396c;

    public atn(String str, boolean z, boolean z2) {
        this.f2394a = str;
        this.f2395b = z;
        this.f2396c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != atn.class) {
            return false;
        }
        atn atn = (atn) obj;
        return TextUtils.equals(this.f2394a, atn.f2394a) && this.f2395b == atn.f2395b && this.f2396c == atn.f2396c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.f2394a.hashCode() + 31) * 31) + (!this.f2395b ? 1237 : 1231)) * 31;
        if (this.f2396c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
