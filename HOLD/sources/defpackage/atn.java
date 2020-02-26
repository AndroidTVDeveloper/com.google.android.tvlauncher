package defpackage;

import android.text.TextUtils;

/* renamed from: atn  reason: default package */
/* compiled from: PG */
final class atn {
    public final String a;
    public final boolean b;
    public final boolean c;

    public atn(String str, boolean z, boolean z2) {
        this.a = str;
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != atn.class) {
            return false;
        }
        atn atn = (atn) obj;
        return TextUtils.equals(this.a, atn.a) && this.b == atn.b && this.c == atn.c;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.a.hashCode() + 31) * 31) + (!this.b ? 1237 : 1231)) * 31;
        if (this.c) {
            i = 1231;
        }
        return hashCode + i;
    }
}
