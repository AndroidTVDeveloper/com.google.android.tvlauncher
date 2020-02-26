package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: bgp  reason: default package */
/* compiled from: PG */
public class bgp implements Parcelable {
    public static final Parcelable.Creator CREATOR = new bgn();
    public final int A;
    public final String w;
    public final String x;
    public final int y;
    public final boolean z;

    static {
        new bgp();
    }

    public int describeContents() {
        return 0;
    }

    public bgp(Parcel parcel) {
        this.w = parcel.readString();
        this.x = parcel.readString();
        this.y = parcel.readInt();
        this.z = blm.a(parcel);
        this.A = parcel.readInt();
    }

    public bgp() {
        this.w = blm.b((String) null);
        this.x = blm.b((String) null);
        this.y = 0;
        this.z = false;
        this.A = 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bgp bgp = (bgp) obj;
        return TextUtils.equals(this.w, bgp.w) && TextUtils.equals(this.x, bgp.x) && this.y == bgp.y && this.z == bgp.z && this.A == bgp.A;
    }

    public int hashCode() {
        String str = this.w;
        int i = 0;
        int hashCode = ((str != null ? str.hashCode() : 0) + 31) * 31;
        String str2 = this.x;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((((((hashCode + i) * 31) + this.y) * 31) + (this.z ? 1 : 0)) * 31) + this.A;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.w);
        parcel.writeString(this.x);
        parcel.writeInt(this.y);
        blm.a(parcel, this.z);
        parcel.writeInt(this.A);
    }
}
