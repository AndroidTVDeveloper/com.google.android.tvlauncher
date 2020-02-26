package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: avk */
/* compiled from: PG */
public final class avk extends avc {
    public static final Parcelable.Creator CREATOR = new avj();

    /* renamed from: a */
    private final String f2494a;

    /* renamed from: b */
    private final String f2495b;

    public avk(Parcel parcel) {
        super((String) blm.m3636a((Object) parcel.readString()));
        this.f2494a = parcel.readString();
        this.f2495b = (String) blm.m3636a((Object) parcel.readString());
    }

    public avk(String str, String str2, String str3) {
        super(str);
        this.f2494a = str2;
        this.f2495b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        avk avk = (avk) obj;
        return this.f2483c.equals(avk.f2483c) && blm.m3652a(this.f2494a, avk.f2494a) && blm.m3652a(this.f2495b, avk.f2495b);
    }

    public final int hashCode() {
        int hashCode = (this.f2483c.hashCode() + 527) * 31;
        String str = this.f2494a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2495b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f2483c;
        String str2 = this.f2494a;
        String str3 = this.f2495b;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 22 + String.valueOf(str2).length() + String.valueOf(str3).length());
        sb.append(str);
        sb.append(": description=");
        sb.append(str2);
        sb.append(": value=");
        sb.append(str3);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2483c);
        parcel.writeString(this.f2494a);
        parcel.writeString(this.f2495b);
    }
}
