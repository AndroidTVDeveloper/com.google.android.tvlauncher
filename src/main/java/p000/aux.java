package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aux */
/* compiled from: PG */
public final class aux extends avc {
    public static final Parcelable.Creator CREATOR = new auw();

    /* renamed from: a */
    public final String f2473a;

    /* renamed from: b */
    public final String f2474b;

    /* renamed from: d */
    private final String f2475d;

    public aux(Parcel parcel) {
        super("COMM");
        this.f2475d = (String) blm.m3636a((Object) parcel.readString());
        this.f2473a = (String) blm.m3636a((Object) parcel.readString());
        this.f2474b = (String) blm.m3636a((Object) parcel.readString());
    }

    public aux(String str, String str2, String str3) {
        super("COMM");
        this.f2475d = str;
        this.f2473a = str2;
        this.f2474b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        aux aux = (aux) obj;
        return blm.m3652a(this.f2473a, aux.f2473a) && blm.m3652a(this.f2475d, aux.f2475d) && blm.m3652a(this.f2474b, aux.f2474b);
    }

    public final int hashCode() {
        String str = this.f2475d;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f2473a;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2474b;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f2483c;
        String str2 = this.f2475d;
        String str3 = this.f2473a;
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
        parcel.writeString(this.f2483c);
        parcel.writeString(this.f2475d);
        parcel.writeString(this.f2474b);
    }
}
