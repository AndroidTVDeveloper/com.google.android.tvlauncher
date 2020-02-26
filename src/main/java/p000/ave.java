package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ave */
/* compiled from: PG */
public final class ave extends avc {
    public static final Parcelable.Creator CREATOR = new avd();

    /* renamed from: a */
    public final String f2484a;

    /* renamed from: b */
    public final String f2485b;

    /* renamed from: d */
    public final String f2486d;

    public ave(Parcel parcel) {
        super("----");
        this.f2484a = (String) blm.m3636a((Object) parcel.readString());
        this.f2485b = (String) blm.m3636a((Object) parcel.readString());
        this.f2486d = (String) blm.m3636a((Object) parcel.readString());
    }

    public ave(String str, String str2, String str3) {
        super("----");
        this.f2484a = str;
        this.f2485b = str2;
        this.f2486d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ave ave = (ave) obj;
        return blm.m3652a(this.f2485b, ave.f2485b) && blm.m3652a(this.f2484a, ave.f2484a) && blm.m3652a(this.f2486d, ave.f2486d);
    }

    public final int hashCode() {
        String str = this.f2484a;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 527) * 31;
        String str2 = this.f2485b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f2486d;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f2483c;
        String str2 = this.f2484a;
        String str3 = this.f2485b;
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
        parcel.writeString(this.f2483c);
        parcel.writeString(this.f2484a);
        parcel.writeString(this.f2486d);
    }
}
