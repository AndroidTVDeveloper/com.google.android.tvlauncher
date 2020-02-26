package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ave  reason: default package */
/* compiled from: PG */
public final class ave extends avc {
    public static final Parcelable.Creator CREATOR = new avd();
    public final String a;
    public final String b;
    public final String d;

    public ave(Parcel parcel) {
        super("----");
        this.a = (String) blm.a((Object) parcel.readString());
        this.b = (String) blm.a((Object) parcel.readString());
        this.d = (String) blm.a((Object) parcel.readString());
    }

    public ave(String str, String str2, String str3) {
        super("----");
        this.a = str;
        this.b = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ave ave = (ave) obj;
        return blm.a(this.b, ave.b) && blm.a(this.a, ave.a) && blm.a(this.d, ave.d);
    }

    public final int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.a;
        String str3 = this.b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 23 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": domain=");
        sb.append(str2);
        sb.append(", description=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        parcel.writeString(this.d);
    }
}
