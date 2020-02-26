package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: avm  reason: default package */
/* compiled from: PG */
public final class avm extends avc {
    public static final Parcelable.Creator CREATOR = new avl();
    private final String a;
    private final String b;

    public avm(Parcel parcel) {
        super((String) blm.a((Object) parcel.readString()));
        this.a = parcel.readString();
        this.b = (String) blm.a((Object) parcel.readString());
    }

    public avm(String str, String str2, String str3) {
        super(str);
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
        avm avm = (avm) obj;
        return this.c.equals(avm.c) && blm.a(this.a, avm.a) && blm.a(this.b, avm.b);
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + 527) * 31;
        String str = this.a;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        String str = this.c;
        String str2 = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 6 + String.valueOf(str2).length());
        sb.append(str);
        sb.append(": url=");
        sb.append(str2);
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.c);
        parcel.writeString(this.a);
        parcel.writeString(this.b);
    }
}
