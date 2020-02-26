package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aux  reason: default package */
/* compiled from: PG */
public final class aux extends avc {
    public static final Parcelable.Creator CREATOR = new auw();
    public final String a;
    public final String b;
    private final String d;

    public aux(Parcel parcel) {
        super("COMM");
        this.d = (String) blm.a((Object) parcel.readString());
        this.a = (String) blm.a((Object) parcel.readString());
        this.b = (String) blm.a((Object) parcel.readString());
    }

    public aux(String str, String str2, String str3) {
        super("COMM");
        this.d = str;
        this.a = str2;
        this.b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aux aux = (aux) obj;
        return blm.a(this.a, aux.a) && blm.a(this.d, aux.d) && blm.a(this.b, aux.b);
    }

    public final int hashCode() {
        String str = this.d;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.a;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.b;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.d;
        String str3 = this.a;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 25 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": language=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.b);
    }
}
