package p000;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: avm */
/* compiled from: PG */
public final class avm extends avc {
    public static final Parcelable.Creator CREATOR = new avl();

    /* renamed from: a */
    private final String f2496a;

    /* renamed from: b */
    private final String f2497b;

    public avm(Parcel parcel) {
        super((String) blm.m3636a((Object) parcel.readString()));
        this.f2496a = parcel.readString();
        this.f2497b = (String) blm.m3636a((Object) parcel.readString());
    }

    public avm(String str, String str2, String str3) {
        super(str);
        this.f2496a = str2;
        this.f2497b = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        avm avm = (avm) obj;
        return this.f2483c.equals(avm.f2483c) && blm.m3652a(this.f2496a, avm.f2496a) && blm.m3652a(this.f2497b, avm.f2497b);
    }

    public final int hashCode() {
        int hashCode = (this.f2483c.hashCode() + 527) * 31;
        String str = this.f2496a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f2497b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.f2483c;
        String str2 = this.f2497b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f2483c);
        parcel.writeString(this.f2496a);
        parcel.writeString(this.f2497b);
    }
}
